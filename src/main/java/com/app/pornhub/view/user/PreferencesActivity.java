package com.app.pornhub.view.user;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import b4.c;
import com.app.pornhub.R;
import com.app.pornhub.common.activity.PasscodeSetterActivity;
import com.app.pornhub.common.util.PasscodeConstants$SecurityMode;
import com.app.pornhub.view.browser.BrowserActivity;
import com.app.pornhub.view.user.PreferencesActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import g4.f;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import q3.d;
import t3.g;
import t3.n;
import y4.c;

/* loaded from: classes.dex */
public class PreferencesActivity extends c {
    public static final /* synthetic */ int E = 0;
    public Preference.OnPreferenceClickListener A = new Preference.OnPreferenceClickListener() { // from class: d5.a
        @Override // android.preference.Preference.OnPreferenceClickListener
        public final boolean onPreferenceClick(Preference preference) {
            PreferencesActivity preferencesActivity = PreferencesActivity.this;
            preferencesActivity.startActivity(BrowserActivity.B(preferencesActivity, preferencesActivity.f5474t.a(), preferencesActivity.getString(R.string.terms_of_service)));
            return true;
        }
    };
    public Preference.OnPreferenceClickListener B = new Preference.OnPreferenceClickListener() { // from class: d5.b
        @Override // android.preference.Preference.OnPreferenceClickListener
        public final boolean onPreferenceClick(Preference preference) {
            PreferencesActivity preferencesActivity = PreferencesActivity.this;
            preferencesActivity.startActivity(BrowserActivity.B(preferencesActivity, preferencesActivity.f5474t.n(), preferencesActivity.getString(R.string.privacy_policy)));
            return true;
        }
    };
    public Preference.OnPreferenceClickListener C = new a();
    public c.a D = new f(this, 3);
    public SharedPreferences n;

    /* renamed from: t  reason: collision with root package name */
    public d f5474t;

    /* renamed from: u  reason: collision with root package name */
    public ViewGroup f5475u;

    /* renamed from: w  reason: collision with root package name */
    public PreferenceCategory f5476w;
    public CheckBoxPreference y;

    /* renamed from: z  reason: collision with root package name */
    public EditTextPreference f5477z;

    /* loaded from: classes.dex */
    public enum AliasNames {
        NORMAL,
        DISCREET
    }

    /* loaded from: classes.dex */
    public class a implements Preference.OnPreferenceClickListener {
        public a() {
        }

        @Override // android.preference.Preference.OnPreferenceClickListener
        public boolean onPreferenceClick(Preference preference) {
            b4.c cVar = new b4.c(PreferencesActivity.this);
            cVar.f3560z = PreferencesActivity.this.D;
            cVar.show();
            return true;
        }
    }

    public final void b(boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putString("settings_password", z10 ? "on" : "off");
        g.i(this, "phapp_settings_use_password", bundle);
    }

    @Override // y4.a
    public void i() {
    }

    @Override // y4.c, android.preference.PreferenceActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 789 || i11 == -1) {
            return;
        }
        ((CheckBoxPreference) findPreference("passcode_active")).setChecked(false);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f18406j > PasscodeConstants$SecurityMode.NOLOCK.b()) {
            this.n.edit().putLong("time_name", new Date().getTime()).apply();
        }
        super.onBackPressed();
    }

    @Override // y4.c, android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        this.f5475u = viewGroup;
        LinearLayout linearLayout = (LinearLayout) viewGroup.getChildAt(0);
        LinearLayout linearLayout2 = (LinearLayout) View.inflate(this, R.layout.activity_preferences, null);
        this.f5475u.removeAllViews();
        linearLayout2.addView(linearLayout);
        this.f5475u.addView(linearLayout2);
        Toolbar toolbar = (Toolbar) linearLayout2.findViewById(R.id.toolbar);
        ((TextView) toolbar.findViewById(R.id.toolbar_title)).setText(R.string.settings);
        a().x(toolbar);
        a().h().m(true);
        a().h().n(false);
        addPreferencesFromResource(R.xml.preferences);
        getListView().setBackgroundColor(0);
        getListView().setCacheColorHint(0);
        this.n.registerOnSharedPreferenceChangeListener(this);
        PreferenceManager preferenceManager = getPreferenceManager();
        preferenceManager.findPreference("discreet_icon").setOnPreferenceClickListener(this.C);
        preferenceManager.findPreference(getString(R.string.pref_privacy)).setOnPreferenceClickListener(this.B);
        preferenceManager.findPreference(getString(R.string.pref_terms)).setOnPreferenceClickListener(this.A);
        this.f5476w = (PreferenceCategory) preferenceManager.findPreference(getString(R.string.about));
        this.y = (CheckBoxPreference) preferenceManager.findPreference(getString(R.string.pref_use_stage));
        this.f5477z = (EditTextPreference) preferenceManager.findPreference(getString(R.string.pref_stage_input));
        EditTextPreference editTextPreference = (EditTextPreference) preferenceManager.findPreference(getString(R.string.pref_web_domain_non_premium));
        this.f5476w.removePreference(this.y);
        this.f5476w.removePreference(this.f5477z);
        this.f5476w.removePreference(editTextPreference);
        this.f5476w.removePreference((EditTextPreference) preferenceManager.findPreference(getString(R.string.pref_web_domain_premium)));
        t3.a.u("Preferences");
    }

    @Override // y4.c, android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        this.n.unregisterOnSharedPreferenceChangeListener(this);
        super.onDestroy();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // y4.c, android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        super.onSharedPreferenceChanged(sharedPreferences, str);
        if (!str.equals("passcode_active")) {
            if (str.equals("cdata")) {
                if (sharedPreferences.getBoolean(str, true)) {
                    return;
                }
                b.a aVar = new b.a(this);
                aVar.a(R.string.applied_after_restart_message);
                aVar.d(R.string.collect_anonymous_data);
                aVar.setPositiveButton(R.string.ok, n.n).create().show();
            }
        } else if (sharedPreferences.getBoolean(str, false)) {
            startActivityForResult(new Intent(getApplicationContext(), PasscodeSetterActivity.class), 789);
            t3.a.y("preference_password_on");
            Bundle bundle = new Bundle();
            bundle.putString("passcode_event", "passcode_set");
            Intrinsics.checkNotNull(this);
            FirebaseAnalytics.getInstance(this).a("passcode", bundle);
            b(true);
        } else {
            this.n.edit().putInt("security_mode", PasscodeConstants$SecurityMode.NOLOCK.b()).apply();
            t3.a.y("preference_password_off");
            Bundle bundle2 = new Bundle();
            bundle2.putString("passcode_event", "passcode_removed");
            Intrinsics.checkNotNull(this);
            FirebaseAnalytics.getInstance(this).a("passcode", bundle2);
            b(false);
        }
    }
}
