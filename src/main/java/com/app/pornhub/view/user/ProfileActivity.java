package com.app.pornhub.view.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.y;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.user.UserMetaData;

/* loaded from: classes.dex */
public class ProfileActivity extends v3.b {
    public static final /* synthetic */ int L = 0;
    public Toolbar K;

    public static Intent C(Context context, UserMetaData userMetaData) {
        Intent intent = new Intent();
        intent.setClass(context, ProfileActivity.class);
        intent.putExtra("username", userMetaData.getUsername());
        intent.putExtra("userId", userMetaData.getId());
        return intent;
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_base_container);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.K = toolbar;
        if (toolbar != null) {
            A(toolbar);
            y().m(true);
            y().n(false);
        }
        y u2 = u();
        int i10 = ProfileFragment.U0;
        if (((ProfileFragment) u2.I("ProfileFragment")) == null) {
            String stringExtra = getIntent().getStringExtra("username");
            String stringExtra2 = getIntent().getStringExtra("userId");
            Bundle bundle2 = new Bundle();
            bundle2.putString("targetUserId", stringExtra2);
            bundle2.putString("targetUserName", stringExtra);
            ProfileFragment profileFragment = new ProfileFragment();
            profileFragment.A0(bundle2);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(u());
            aVar.i(R.id.container_main, profileFragment, "ProfileFragment");
            aVar.d();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
