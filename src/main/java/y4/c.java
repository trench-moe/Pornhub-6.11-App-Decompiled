package y4;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.d;
import com.app.pornhub.common.activity.PasscodeCheckActivity;
import com.app.pornhub.common.util.PasscodeConstants$SecurityMode;
import dagger.android.DispatchingAndroidInjector;
import java.lang.ref.WeakReference;
import java.util.Date;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public abstract class c extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener, a, wd.a {

    /* renamed from: c  reason: collision with root package name */
    public DispatchingAndroidInjector<Object> f18404c;

    /* renamed from: f  reason: collision with root package name */
    public SharedPreferences f18405f;

    /* renamed from: j  reason: collision with root package name */
    public int f18406j;

    /* renamed from: m  reason: collision with root package name */
    public androidx.appcompat.app.c f18407m;

    public final androidx.appcompat.app.c a() {
        if (this.f18407m == null) {
            p.c<WeakReference<androidx.appcompat.app.c>> cVar = androidx.appcompat.app.c.f498c;
            this.f18407m = new d(this, null, null, this);
        }
        return this.f18407m;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    @Override // wd.a
    public dagger.android.a<Object> d() {
        return this.f18404c;
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return a().g();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        a().j();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 == 12 && i11 == -1) {
            this.f18405f.edit().putLong("time_name", new Date().getTime()).apply();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().k(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a().i();
        a().l(bundle);
        super.onCreate(bundle);
        getPreferenceManager().setSharedPreferencesName("persistent_prefs");
        this.f18406j = this.f18405f.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        this.f18405f.registerOnSharedPreferenceChangeListener(this);
        getWindow().setFlags(ConstantsKt.DEFAULT_BUFFER_SIZE, ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a().m();
        this.f18405f.unregisterOnSharedPreferenceChangeListener(this);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f18406j > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            this.f18405f.edit().putLong("time_name", new Date().getTime()).apply();
        }
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().n(bundle);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        a().o();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f18406j > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            if (new Date().getTime() - this.f18405f.getLong("time_name", new Date().getTime() - 2000) > 1000) {
                startActivityForResult(new Intent(getApplicationContext(), PasscodeCheckActivity.class), 12);
            }
        }
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("security_mode".equals(str)) {
            this.f18406j = this.f18405f.getInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b());
        }
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a().r();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        a().z(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        a().u(i10);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a().v(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }
}
