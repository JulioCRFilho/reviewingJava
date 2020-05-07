package com.example.javaaa.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.javaaa.R;

import java.util.Objects;

public class CustomDialog extends Dialog {
    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dialog);
        Objects.requireNonNull(getWindow()).setBackgroundDrawableResource(android.R.color.transparent);
        setCancelable(false);
    }

    public void setMsg(Activity activity, String msg) {
        TextView status = findViewById(R.id.currentStatus);
        ProgressBar progress = findViewById(R.id.progress);

        activity.runOnUiThread(() -> {
            status.setText(msg);
            progress.setVisibility(View.GONE);
            setCancelable(true);
        });
    }
}
