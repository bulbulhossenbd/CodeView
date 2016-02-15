package com.example.appsd.codeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.setHorizontalScrollbarOverlay(false);
        webView.setHorizontalFadingEdgeEnabled(false);
        webView.setHorizontalScrollBarEnabled(true);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/bulbul");

    }

    final class InJavaScriptLocalObj {
        public void showSource(String html) {
            System.out.println(html);
        }
    }
}
