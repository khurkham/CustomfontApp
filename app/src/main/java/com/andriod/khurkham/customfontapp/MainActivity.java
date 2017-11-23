package com.andriod.khurkham.customfontapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.anwarshahriar.calligrapher.Calligrapher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calligrapher calligrapher = new Calligrapher(this);
        calligrapher.setFont(this, "namteng.ttf", true);
    }
}
