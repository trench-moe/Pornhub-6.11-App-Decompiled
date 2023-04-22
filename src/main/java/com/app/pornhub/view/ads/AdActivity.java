package com.app.pornhub.view.ads;

import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.q0;
import com.app.pornhub.R;
import u3.e;
import v3.b;
import w3.a;

/* loaded from: classes.dex */
public class AdActivity extends b implements a.c {
    public e K;
    public Toolbar L;
    public ProgressBar M;

    @Override // w3.a.c
    public void o(int i10) {
        if (i10 > 0) {
            this.M.setVisibility(0);
            this.M.setProgress(i10);
            if (i10 == 100) {
                new Handler().postDelayed(new q0(this, 2), 250L);
            }
        } else {
            this.M.setVisibility(4);
        }
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        boolean z10;
        e eVar = this.K;
        if (eVar.f16372o0.canGoBack()) {
            eVar.f16372o0.goBack();
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f1829t.b();
        }
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ad);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.L = toolbar;
        if (toolbar != null) {
            ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(R.string.ads);
            A(this.L);
            y().m(true);
            y().n(false);
        }
        this.M = (ProgressBar) findViewById(R.id.progress);
        String stringExtra = getIntent().getStringExtra("ad_url");
        int i10 = e.f15524t0;
        Bundle bundle2 = new Bundle();
        bundle2.putString("url", stringExtra);
        bundle2.putString("activity_title", "Ad");
        e eVar = new e();
        this.K = eVar;
        eVar.A0(bundle2);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(u());
        e eVar2 = this.K;
        aVar.i(R.id.activity_ad_fragmentContainer, eVar2, eVar2.getClass().getSimpleName());
        aVar.d();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
