package com.example.javaaa.interactor;

import com.example.javaaa.entity.model.CovidData;
import java.util.List;

public interface MainInteractor {
    void initLoading();
    void stopLoading();
    void updateList(List<CovidData> list);
    void throwError(String message);
}
