package com.example.javaaa.ui;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.javaaa.R;
import com.example.javaaa.entity.model.CovidData;
import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    final ArrayList<CovidData> list = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflater.inflate(R.layout.adapter_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.Bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView uid, uf, state, cases, deaths, suspects, refuses, datetime;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            uid = itemView.findViewById(R.id.uid);
            uf = itemView.findViewById(R.id.uf);
            state = itemView.findViewById(R.id.state);
            cases = itemView.findViewById(R.id.cases);
            deaths = itemView.findViewById(R.id.deaths);
            suspects = itemView.findViewById(R.id.suspects);
            refuses = itemView.findViewById(R.id.refuses);
            datetime = itemView.findViewById(R.id.datetime);
        }

        void Bind(CovidData covidData) {
            uid.setText(Html.fromHtml("<b>Uid:</b> " + covidData.getUid()));
            uf.setText(Html.fromHtml("<b>Uf:</b> " + covidData.getUf()));
            state.setText(Html.fromHtml("<b>State:</b> " + covidData.getState()));
            cases.setText(Html.fromHtml("<b>Cases:</b> " + covidData.getCases()));
            deaths.setText(Html.fromHtml("<b>Deaths:</b> " + covidData.getDeaths()));
            suspects.setText(Html.fromHtml("<b>Suspects:</b> " + covidData.getSuspects()));
            refuses.setText(Html.fromHtml("<b>Refuses:</b> " + covidData.getRefuses()));
            datetime.setText(Html.fromHtml("<b>Datetime:</b> " + covidData.getDatetime()));
        }
    }
}
