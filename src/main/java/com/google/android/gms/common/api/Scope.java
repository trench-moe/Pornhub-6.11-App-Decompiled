package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.h;
import h9.o;
import i9.a;
import t9.k0;

/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new h();

    /* renamed from: c  reason: collision with root package name */
    public final int f6853c;

    /* renamed from: f  reason: collision with root package name */
    public final String f6854f;

    public Scope(int i10, String str) {
        o.f(str, "scopeUri must not be null or empty");
        this.f6853c = i10;
        this.f6854f = str;
    }

    public Scope(String str) {
        o.f(str, "scopeUri must not be null or empty");
        this.f6853c = 1;
        this.f6854f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6854f.equals(((Scope) obj).f6854f);
        }
        return false;
    }

    public int hashCode() {
        return this.f6854f.hashCode();
    }

    public String toString() {
        return this.f6854f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f6853c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.r(parcel, 2, this.f6854f, false);
        k0.z(parcel, v2);
    }
}
