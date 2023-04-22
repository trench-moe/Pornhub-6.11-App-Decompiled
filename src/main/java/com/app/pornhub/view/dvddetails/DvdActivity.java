package com.app.pornhub.view.dvddetails;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.y;
import com.app.pornhub.R;
import m4.a;
import v3.b;

/* loaded from: classes.dex */
public class DvdActivity extends b {
    public static final /* synthetic */ int K = 0;

    @Override // v3.b, y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_container);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(R.string.dvds);
            x().x(toolbar);
            y().m(true);
            y().n(false);
        }
        y u2 = u();
        String str = a.f12883x0;
        if (((a) u2.I(str)) == null) {
            Bundle b10 = android.support.v4.media.b.b("id", getIntent().getStringExtra("id"));
            a aVar = new a();
            aVar.A0(b10);
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(u());
            aVar2.i(R.id.container_main, aVar, str);
            aVar2.d();
        }
        t3.a.u("DVD");
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
