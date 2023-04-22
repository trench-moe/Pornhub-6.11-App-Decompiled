package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.WebViewCustom;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentBrowserBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4559a;

    public FragmentBrowserBinding(LinearLayout linearLayout, IncludeErrorBinding includeErrorBinding, WebViewCustom webViewCustom) {
        this.f4559a = linearLayout;
    }

    public static FragmentBrowserBinding bind(View view) {
        int i10 = R.id.fragment_browser_includeStatusError;
        View t2 = b.t(view, R.id.fragment_browser_includeStatusError);
        if (t2 != null) {
            IncludeErrorBinding bind = IncludeErrorBinding.bind(t2);
            WebViewCustom webViewCustom = (WebViewCustom) b.t(view, R.id.fragment_browser_webview);
            if (webViewCustom != null) {
                return new FragmentBrowserBinding((LinearLayout) view, bind, webViewCustom);
            }
            i10 = R.id.fragment_browser_webview;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentBrowserBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_browser, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4559a;
    }
}
