package w3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import b4.g;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.WebViewCustom;

@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements w3.b {

    /* renamed from: n0  reason: collision with root package name */
    public g f16371n0;

    /* renamed from: o0  reason: collision with root package name */
    public WebViewCustom f16372o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f16373p0;

    /* renamed from: q0  reason: collision with root package name */
    public c f16374q0;

    /* renamed from: r0  reason: collision with root package name */
    public View.OnClickListener f16375r0 = new b();

    /* renamed from: w3.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0282a extends WebChromeClient {
        public C0282a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            a.this.f16374q0.o(i10);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f16373p0.setVisibility(8);
            a.this.f16372o0.setVisibility(0);
            a aVar = a.this;
            aVar.f16372o0.loadUrl(aVar.K0());
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void o(int i10);
    }

    public abstract String K0();

    @Override // androidx.fragment.app.Fragment
    public void R(Activity activity) {
        this.U = true;
        this.f16374q0 = (c) activity;
        this.f16371n0 = new g(activity, this);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_browser, viewGroup, false);
        this.f16372o0 = (WebViewCustom) inflate.findViewById(R.id.fragment_browser_webview);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.fragment_browser_includeStatusError);
        this.f16373p0 = linearLayout;
        linearLayout.setOnClickListener(this.f16375r0);
        this.f16372o0.setBackgroundColor(Color.argb(1, 0, 0, 0));
        this.f16372o0.setWebViewClient(this.f16371n0);
        this.f16372o0.setWebChromeClient(new C0282a());
        WebSettings settings = this.f16372o0.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(settings.getUserAgentString() + "/android_porn_app");
        this.f16372o0.loadUrl(K0());
        return inflate;
    }
}
