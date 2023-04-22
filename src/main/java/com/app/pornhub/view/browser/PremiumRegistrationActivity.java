package com.app.pornhub.view.browser;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import com.app.pornhub.R;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import f3.p;
import io.reactivex.disposables.CompositeDisposable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import w3.c;
import w3.d;
import x2.g;

/* loaded from: classes.dex */
public class PremiumRegistrationActivity extends BrowserActivity {
    public static final /* synthetic */ int P = 0;
    public p K;
    public CompositeDisposable L;
    public String M;
    public String N;
    public boolean O;

    /* loaded from: classes.dex */
    public class a extends BrowserActivity.b {
        public a() {
        }

        @Override // com.app.pornhub.view.browser.BrowserActivity.b, android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!TextUtils.isEmpty(PremiumRegistrationActivity.this.N) && !TextUtils.isEmpty(PremiumRegistrationActivity.this.M)) {
                Snackbar.k(PremiumRegistrationActivity.this.I, R.string.hint_press_back_for_premium_experience, -2).n();
            }
        }

        @Override // com.app.pornhub.view.browser.BrowserActivity.b, android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            if (!str.contains("purchase_success") && !str.contains("reactivate_success")) {
                return;
            }
            PremiumRegistrationActivity premiumRegistrationActivity = PremiumRegistrationActivity.this;
            int i10 = PremiumRegistrationActivity.P;
            premiumRegistrationActivity.M = premiumRegistrationActivity.D(str, "rtoken");
            premiumRegistrationActivity.N = premiumRegistrationActivity.D(str, "&uid");
            if (premiumRegistrationActivity.O || TextUtils.isEmpty(premiumRegistrationActivity.M) || TextUtils.isEmpty(premiumRegistrationActivity.N)) {
                return;
            }
            String refreshToken = premiumRegistrationActivity.M;
            p pVar = premiumRegistrationActivity.K;
            Objects.requireNonNull(pVar);
            Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
            premiumRegistrationActivity.L.add(pVar.a(pVar.f9385a.h(refreshToken)).subscribe(new g(premiumRegistrationActivity, 6)));
        }
    }

    public static Intent B(Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("url", str2);
        intent.putExtra("title", str);
        intent.setClass(context, PremiumRegistrationActivity.class);
        return intent;
    }

    @Override // com.app.pornhub.view.browser.BrowserActivity
    public void C(String str) {
    }

    public final String D(String str, String str2) {
        if (str.contains(str2)) {
            String substring = str.substring(str.indexOf(str2));
            int indexOf = substring.indexOf(38);
            String substring2 = indexOf != -1 ? substring.substring(substring.indexOf("=") + 1, indexOf) : substring.substring(substring.indexOf("=") + 1);
            kf.a.f12078a.a("Extracted param: %s", substring2);
            return substring2;
        }
        return BuildConfig.FLAVOR;
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        String url = this.I.getUrl();
        kf.a.f12078a.a("Leaving the premium join activity with the URL: %s", url);
        if (this.O) {
            finish();
        } else if (TextUtils.isEmpty(url)) {
            this.f1829t.b();
        } else {
            if (!url.contains("PurchaseConfirmation") && !url.contains("RedirectSuccess")) {
                if (!url.contains("premium_signup")) {
                    if (this.I.canGoBack()) {
                        this.I.goBack();
                        return;
                    } else {
                        this.f1829t.b();
                        return;
                    }
                }
                b.a aVar = new b.a(this);
                AlertController.b bVar = aVar.f496a;
                bVar.f480f = bVar.f476a.getText(R.string.premium_signup_cancel_confirmation);
                aVar.setPositiveButton(R.string.premium_dialog_continue, d.f16380f);
                aVar.setNegativeButton(R.string.premium_dialog_leave, new c(this, 0));
                aVar.create().show();
                return;
            }
            Snackbar.l(this.I, "Transaction in progress, please hold on", 0).n();
        }
    }

    @Override // com.app.pornhub.view.browser.BrowserActivity, y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I.setWebViewClient(new a());
        this.L = new CompositeDisposable();
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        this.I.clearCache(true);
        CookieManager.getInstance().removeAllCookies(new ValueCallback() { // from class: w3.e
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                Boolean bool = (Boolean) obj;
                int i10 = PremiumRegistrationActivity.P;
            }
        });
        this.L.dispose();
        super.onDestroy();
    }
}
