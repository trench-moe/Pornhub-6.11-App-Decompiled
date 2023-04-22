package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogfragmentAdBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4501a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f4502b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4503c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f4504e;

    public DialogfragmentAdBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, WebView webView, TextView textView, TextView textView2, TextView textView3) {
        this.f4501a = constraintLayout;
        this.f4502b = webView;
        this.f4503c = textView;
        this.d = textView2;
        this.f4504e = textView3;
    }

    public static DialogfragmentAdBinding bind(View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.adsContentWebView;
        WebView webView = (WebView) b.t(view, R.id.adsContentWebView);
        if (webView != null) {
            i10 = R.id.closeAdsButton;
            TextView textView = (TextView) b.t(view, R.id.closeAdsButton);
            if (textView != null) {
                i10 = R.id.continueToVideoButton;
                TextView textView2 = (TextView) b.t(view, R.id.continueToVideoButton);
                if (textView2 != null) {
                    i10 = R.id.removeAdsButton;
                    TextView textView3 = (TextView) b.t(view, R.id.removeAdsButton);
                    if (textView3 != null) {
                        return new DialogfragmentAdBinding(constraintLayout, constraintLayout, webView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogfragmentAdBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialogfragment_ad, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4501a;
    }
}
