package co.edureka.edurekasession1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyWebViewActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_web_view);

        webView = findViewById(R.id.webView);

        // Enable Java Script
        webView.getSettings().setJavaScriptEnabled(true);

        // To Create WebView as a Client
        webView.setWebViewClient(new WebViewClient());

        // to load the web page
        webView.loadUrl("https://www.amazon.in/");
    }
}
