package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityBrowserBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4359a;

    public ActivityBrowserBinding(RelativeLayout relativeLayout, ProgressBar progressBar, Toolbar toolbar, RelativeLayout relativeLayout2, TextView textView, WebView webView) {
        this.f4359a = relativeLayout;
    }

    public static ActivityBrowserBinding bind(View view) {
        int i10 = R.id.progress;
        ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progress);
        if (progressBar != null) {
            i10 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
            if (toolbar != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.toolbar_title;
                TextView textView = (TextView) b.t(view, R.id.toolbar_title);
                if (textView != null) {
                    i10 = R.id.webview;
                    WebView webView = (WebView) b.t(view, R.id.webview);
                    if (webView != null) {
                        return new ActivityBrowserBinding(relativeLayout, progressBar, toolbar, relativeLayout, textView, webView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityBrowserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_browser, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4359a;
    }
}
