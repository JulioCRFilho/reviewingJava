package com.example.javaaa.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.javaaa.R;
import com.example.javaaa.entity.model.CovidData;
import com.example.javaaa.entity.model.CovidResponse;
import com.example.javaaa.interactor.MainInteractor;
import com.example.javaaa.utils.CustomDialog;
import com.example.javaaa.viewModel.MainViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainInteractor {
    MainViewModel viewModel;
    RecyclerView recyclerView;
    CustomDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        viewModel.interactor = this;

        initRecyclerView();
        viewModel.getData();
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MainAdapter());
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void initLoading() {
        dialog = new CustomDialog(this);
        dialog.show();
    }

    @Override
    public void stopLoading() {
        dialog.cancel();
    }

    @Override
    public void updateList(List<CovidData> list) {
        MainAdapter adapter = (MainAdapter) recyclerView.getAdapter();
        assert adapter != null;

        runOnUiThread(() -> {
            adapter.list.addAll(list);
            adapter.notifyDataSetChanged();
        });
    }

    @Override
    public void throwError(String message) {
        dialog.setMsg(this, message);
    }
}
