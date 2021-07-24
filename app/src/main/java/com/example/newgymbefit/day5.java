package com.example.newgymbefit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class day5 extends AppCompatActivity {

    private static View.OnClickListener onClickListener;

    public static void setOnClickListener(View.OnClickListener onClickListener) {
        day5.onClickListener = onClickListener;
    }

    public static View.OnClickListener getOnClickListener() {
        return onClickListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day5);
    }
}