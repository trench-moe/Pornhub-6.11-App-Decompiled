package com.app.pornhub.view.launch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.app.pornhub.databinding.ActivityPremiumUpsellLaunchBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.view.home.HomeActivity;
import f3.h;
import q3.d;
import y4.b;

/* loaded from: classes.dex */
public class PremiumUpsellLaunchActivity extends b {
    public static final /* synthetic */ int K = 0;
    public SharedPreferences H;
    public h I;
    public d J;

    @Override // y4.a
    public void i() {
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Intent intent;
        this.f1829t.b();
        if (!UsersConfig.isPremiumExpired(this.I.a()) || this.H.getBoolean("remember_choice", false)) {
            intent = null;
        } else {
            intent = new Intent(this, AccountExpiredActivity.class);
            intent.addFlags(268435456);
        }
        startActivity(new Intent(this, HomeActivity.class));
        if (intent != null) {
            startActivity(intent);
        }
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPremiumUpsellLaunchBinding inflate = ActivityPremiumUpsellLaunchBinding.inflate(getLayoutInflater());
        setContentView(inflate.f4466a);
        inflate.f4468c.setOnClickListener(new x3.a(this, 7));
        inflate.f4467b.setOnClickListener(new x3.b(this, 9));
    }
}
