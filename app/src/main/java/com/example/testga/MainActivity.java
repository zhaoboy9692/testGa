package com.example.testga;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    public String ssssss = "testfrida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.sssss);
        System.loadLibrary("frida-gadget");
    }

    public void sss(View view) {
        textView.setText(this.ssssss);

    }
}