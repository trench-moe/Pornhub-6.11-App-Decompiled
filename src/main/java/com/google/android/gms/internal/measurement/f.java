package com.google.android.gms.internal.measurement;

import w9.i5;
import w9.s6;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public volatile s6 f6992a;

    /* renamed from: b  reason: collision with root package name */
    public volatile zzix f6993b;

    static {
        i5.a();
    }

    public final int a() {
        if (this.f6993b != null) {
            return ((zziv) this.f6993b).zza.length;
        }
        if (this.f6992a != null) {
            return this.f6992a.b();
        }
        return 0;
    }

    public final zzix b() {
        if (this.f6993b != null) {
            return this.f6993b;
        }
        synchronized (this) {
            if (this.f6993b != null) {
                return this.f6993b;
            }
            if (this.f6992a == null) {
                this.f6993b = zzix.f7071c;
            } else {
                this.f6993b = this.f6992a.f();
            }
            return this.f6993b;
        }
    }

    public final void c(s6 s6Var) {
        if (this.f6992a != null) {
            return;
        }
        synchronized (this) {
            if (this.f6992a == null) {
                try {
                    this.f6992a = s6Var;
                    this.f6993b = zzix.f7071c;
                } catch (zzkh unused) {
                    this.f6992a = s6Var;
                    this.f6993b = zzix.f7071c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            s6 s6Var = this.f6992a;
            s6 s6Var2 = fVar.f6992a;
            if (s6Var == null && s6Var2 == null) {
                return b().equals(fVar.b());
            }
            if (s6Var != null && s6Var2 != null) {
                return s6Var.equals(s6Var2);
            }
            if (s6Var != null) {
                fVar.c(s6Var.d());
                return s6Var.equals(fVar.f6992a);
            }
            c(s6Var2.d());
            return this.f6992a.equals(s6Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
