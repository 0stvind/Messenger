package com.example.messenger;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Authorization extends ActionBarActivity {
    private WebView webView1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webView1 = (WebView) findViewById(R.id.webView1);
        webView1.loadUrl("https://vk.com");
        setContentView(webView1);
    }
}

