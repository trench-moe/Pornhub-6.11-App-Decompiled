package gd;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.app.pornhub.common.activity.PasscodeCheckActivity;
import com.app.pornhub.common.util.PasscodeConstants$SecurityMode;
import com.google.vrtoolkit.cardboard.CardboardActivity;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class a extends CardboardActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f9940c;

    /* renamed from: f  reason: collision with root package name */
    public int f9941f;

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 12 && i11 == -1) {
            this.f9940c.edit().putLong("time_name", new Date().getTime()).apply();
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_prefs", 0);
        this.f9940c = sharedPreferences;
        this.f9941f = sharedPreferences.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        this.f9940c.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onDestroy() {
        this.f9940c.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f9941f > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            this.f9940c.edit().putLong("time_name", new Date().getTime()).apply();
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f9941f > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            if (new Date().getTime() - this.f9940c.getLong("time_name", new Date().getTime() - 2000) > 1000) {
                startActivityForResult(new Intent(getApplicationContext(), PasscodeCheckActivity.class), 12);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("security_mode".equals(str)) {
            this.f9941f = this.f9940c.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        }
    }
}
