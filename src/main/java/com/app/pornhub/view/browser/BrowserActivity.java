package com.app.pornhub.view.browser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q0;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class BrowserActivity extends y4.b {
    public String H;
    public WebView I;
    public ProgressBar J;

    /* loaded from: classes.dex */
    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            BrowserActivity browserActivity = BrowserActivity.this;
            if (i10 <= 0) {
                browserActivity.J.setVisibility(4);
                return;
            }
            browserActivity.J.setVisibility(0);
            browserActivity.J.setProgress(i10);
            if (i10 == 100) {
                new Handler().postDelayed(new q0(browserActivity, 3), 250L);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            kf.a.f12078a.a("Webview finished loading the Url %s", str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            kf.a.f12078a.a("Webview started loading the Url %s", str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    public static Intent B(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("url", str);
        intent.putExtra("title", str2);
        intent.setClass(context, BrowserActivity.class);
        return intent;
    }

    public void C(String str) {
    }

    @Override // y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_browser);
        WebView webView = (WebView) findViewById(R.id.webview);
        this.I = webView;
        webView.setWebViewClient(new b());
        this.J = (ProgressBar) findViewById(R.id.progress);
        this.I.getSettings().setJavaScriptEnabled(true);
        this.I.setWebChromeClient(new a());
        this.I.getSettings().setUseWideViewPort(true);
        this.I.getSettings().setLoadWithOverviewMode(true);
        this.I.getSettings().setBuiltInZoomControls(true);
        Bundle extras = getIntent().getExtras();
        this.H = extras.getString("title");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(this.H);
            x().x(toolbar);
            y().m(true);
            y().n(false);
        }
        String string = extras.getString("url");
        C(string);
        this.I.loadUrl(string);
        kf.a.f12078a.e("Requested URL to load ::: %s", extras.getString("url"));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
