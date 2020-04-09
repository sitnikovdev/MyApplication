package com.zovjoin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.zovjoin.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView mywebview = findViewById(R.id.mywebview);
        mywebview.getSettings().setJavaScriptEnabled(true);
        mywebview.loadUrl("https://t.zovjoin.com/");
        mywebview.setWebViewClient(new WebViewClient());
    }
}
