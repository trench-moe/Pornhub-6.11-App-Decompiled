package com.app.pornhub.view.photos;

import a5.c;
import android.os.Bundle;
import androidx.fragment.app.a;
import com.app.pornhub.R;
import v3.b;

/* loaded from: classes.dex */
public class PhotoDisplayActivity extends b {
    public static final /* synthetic */ int K = 0;

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_photodetails);
        Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        c cVar = new c();
        cVar.A0(bundleExtra);
        a aVar = new a(u());
        aVar.i(R.id.fragment_container, cVar, c.f177v0);
        aVar.d();
        t3.a.x(this, "PhotoDisplayActivity", "PhotoDetails");
    }
}
