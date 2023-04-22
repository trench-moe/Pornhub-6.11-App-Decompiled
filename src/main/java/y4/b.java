package y4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.app.pornhub.common.activity.PasscodeCheckActivity;
import com.app.pornhub.common.util.PasscodeConstants$SecurityMode;
import dagger.android.DispatchingAndroidInjector;
import e.g;
import java.util.Date;

/* loaded from: classes.dex */
public abstract class b extends g implements SharedPreferences.OnSharedPreferenceChangeListener, a, wd.a {
    public DispatchingAndroidInjector<Object> E;
    public SharedPreferences F;
    public int G;

    public dagger.android.a<Object> d() {
        return this.E;
    }

    @Override // androidx.fragment.app.o, androidx.core.mh.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 12 && i11 == -1) {
            this.F.edit().putLong("time_name", new Date().getTime()).apply();
            i();
        }
    }

    @Override // androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.G = this.F.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        this.F.registerOnSharedPreferenceChangeListener(this);
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        this.F.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.G > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            this.F.edit().putLong("time_name", new Date().getTime()).apply();
        }
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.G > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            if (new Date().getTime() - this.F.getLong("time_name", new Date().getTime() - 2000) > 1000) {
                startActivityForResult(new Intent(getApplicationContext(), PasscodeCheckActivity.class), 12);
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("security_mode".equals(str)) {
            this.G = this.F.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        }
    }
}
