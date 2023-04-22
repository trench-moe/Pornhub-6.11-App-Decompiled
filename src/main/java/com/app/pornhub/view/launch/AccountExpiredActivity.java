package com.app.pornhub.view.launch;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import f3.g;
import h4.e;
import q3.d;
import y4.b;

/* loaded from: classes.dex */
public class AccountExpiredActivity extends b {
    public static final /* synthetic */ int K = 0;
    public g H;
    public d I;
    public SharedPreferences J;

    @Override // y4.a
    public void i() {
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_account_expired);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(R.string.premium);
            x().x(toolbar);
            y().m(true);
            y().n(false);
        }
        ((CheckBox) findViewById(R.id.checkbox)).setOnCheckedChangeListener(new e(this, 1));
        findViewById(R.id.button_browse_free).setOnClickListener(new u3.a(this, 12));
        findViewById(R.id.button_renew).setOnClickListener(new b4.b(this, 8));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
