package com.google.android.gms.internal.cast;

import t9.j2;

/* loaded from: classes.dex */
public class m1 {

    /* renamed from: a  reason: collision with root package name */
    public volatile j2 f6905a;

    /* renamed from: b  reason: collision with root package name */
    public volatile zzoe f6906b;

    static {
        if (t9.c1.f15190b == null) {
            synchronized (t9.c1.class) {
                if (t9.c1.f15190b == null) {
                    t9.c1.f15190b = t9.c1.f15191c;
                }
            }
        }
    }

    public final int a() {
        if (this.f6906b != null) {
            return ((zzoc) this.f6906b).zza.length;
        }
        if (this.f6905a != null) {
            return this.f6905a.f();
        }
        return 0;
    }

    public final zzoe b() {
        if (this.f6906b != null) {
            return this.f6906b;
        }
        synchronized (this) {
            if (this.f6906b != null) {
                return this.f6906b;
            }
            if (this.f6905a == null) {
                this.f6906b = zzoe.f6957c;
            } else {
                this.f6906b = this.f6905a.g();
            }
            return this.f6906b;
        }
    }

    public final void c(j2 j2Var) {
        if (this.f6905a != null) {
            return;
        }
        synchronized (this) {
            if (this.f6905a == null) {
                try {
                    this.f6905a = j2Var;
                    this.f6906b = zzoe.f6957c;
                } catch (zzpj unused) {
                    this.f6905a = j2Var;
                    this.f6906b = zzoe.f6957c;
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            j2 j2Var = this.f6905a;
            j2 j2Var2 = m1Var.f6905a;
            if (j2Var == null && j2Var2 == null) {
                return b().equals(m1Var.b());
            }
            if (j2Var != null && j2Var2 != null) {
                return j2Var.equals(j2Var2);
            }
            if (j2Var != null) {
                m1Var.c(j2Var.k());
                return j2Var.equals(m1Var.f6905a);
            }
            c(j2Var2.k());
            return this.f6905a.equals(j2Var2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }
}
