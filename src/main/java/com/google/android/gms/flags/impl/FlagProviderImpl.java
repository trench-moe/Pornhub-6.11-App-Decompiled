package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import p9.b;
import q9.a;
import q9.d;
import q9.e;
import v9.c;

@DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6888a = false;

    /* renamed from: b  reason: collision with root package name */
    public SharedPreferences f6889b;

    @Override // p9.c
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        if (this.f6888a) {
            SharedPreferences sharedPreferences = this.f6889b;
            Boolean valueOf = Boolean.valueOf(z10);
            try {
                valueOf = (Boolean) c.a(new a(sharedPreferences, str, valueOf));
            } catch (Exception e10) {
                String valueOf2 = String.valueOf(e10.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.booleanValue();
        }
        return z10;
    }

    @Override // p9.c
    public int getIntFlagValue(String str, int i10, int i11) {
        if (this.f6888a) {
            SharedPreferences sharedPreferences = this.f6889b;
            Integer valueOf = Integer.valueOf(i10);
            try {
                valueOf = (Integer) c.a(new q9.b(sharedPreferences, str, valueOf));
            } catch (Exception e10) {
                String valueOf2 = String.valueOf(e10.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.intValue();
        }
        return i10;
    }

    @Override // p9.c
    public long getLongFlagValue(String str, long j10, int i10) {
        if (this.f6888a) {
            SharedPreferences sharedPreferences = this.f6889b;
            Long valueOf = Long.valueOf(j10);
            try {
                valueOf = (Long) c.a(new q9.c(sharedPreferences, str, valueOf));
            } catch (Exception e10) {
                String valueOf2 = String.valueOf(e10.getMessage());
                Log.w("FlagDataUtils", valueOf2.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf2) : new String("Flag value not available, returning default: "));
            }
            return valueOf.longValue();
        }
        return j10;
    }

    @Override // p9.c
    public String getStringFlagValue(String str, String str2, int i10) {
        if (this.f6888a) {
            try {
                return (String) c.a(new d(this.f6889b, str, str2));
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.w("FlagDataUtils", valueOf.length() != 0 ? "Flag value not available, returning default: ".concat(valueOf) : new String("Flag value not available, returning default: "));
                return str2;
            }
        }
        return str2;
    }

    @Override // p9.c
    public void init(n9.a aVar) {
        Context context = (Context) n9.b.c1(aVar);
        if (this.f6888a) {
            return;
        }
        try {
            this.f6889b = e.a(context.createPackageContext("com.google.android.gms", 0));
            this.f6888a = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
