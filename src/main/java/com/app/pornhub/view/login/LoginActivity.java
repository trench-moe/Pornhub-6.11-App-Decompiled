package com.app.pornhub.view.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import com.app.pornhub.R;
import v3.b;

/* loaded from: classes.dex */
public class LoginActivity extends b {
    public Toolbar K;

    public static Intent C(Context context) {
        return new Intent(context, LoginActivity.class);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_userprofile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.K = toolbar;
        if (toolbar != null) {
            A(toolbar);
            y().m(true);
            y().n(false);
        }
        this.K.setTitle(getString(R.string.login));
        LoginFragment loginFragment = new LoginFragment();
        a aVar = new a(u());
        aVar.i(R.id.activity_userprofile_fragmentContainer, loginFragment, null);
        aVar.d();
        t3.a.x(this, "Home", "Login");
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
