package com.example.javaaa.viewModel;

import androidx.lifecycle.ViewModel;

import com.example.javaaa.entity.api.CovidApi;
import com.example.javaaa.entity.api.CovidService;
import com.example.javaaa.entity.model.CovidData;
import com.example.javaaa.entity.model.CovidResponse;
import com.example.javaaa.interactor.MainInteractor;

import java.util.Arrays;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainViewModel extends ViewModel {
    public MainInteractor interactor;

    public void getData() {
        CovidService service = new CovidApi().getRetrofit().create(CovidService.class);

        service.covidList().subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Observer<CovidResponse>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        interactor.initLoading();
                    }

                    @Override
                    public void onNext(CovidResponse covidResponses) {
                        CovidData[] list = covidResponses.getData();
                        interactor.updateList(Arrays.asList(list));
                    }

                    @Override
                    public void onError(Throwable e) {
                        interactor.throwError(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        interactor.stopLoading();
                    }
                });
    }
}
