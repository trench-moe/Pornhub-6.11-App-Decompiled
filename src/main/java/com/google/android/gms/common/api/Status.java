package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import c9.b;
import cb.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import d9.f;
import d9.i;
import h9.m;
import i9.a;
import java.util.Arrays;
import t9.k0;

/* loaded from: classes.dex */
public final class Status extends a implements f, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR;

    /* renamed from: t  reason: collision with root package name */
    public static final Status f6855t = new Status(0, null);

    /* renamed from: u  reason: collision with root package name */
    public static final Status f6856u = new Status(14, null);

    /* renamed from: w  reason: collision with root package name */
    public static final Status f6857w;
    public static final Status y;

    /* renamed from: c  reason: collision with root package name */
    public final int f6858c;

    /* renamed from: f  reason: collision with root package name */
    public final int f6859f;

    /* renamed from: j  reason: collision with root package name */
    public final String f6860j;

    /* renamed from: m  reason: collision with root package name */
    public final PendingIntent f6861m;
    public final b n;

    static {
        new Status(8, null);
        f6857w = new Status(15, null);
        y = new Status(16, null);
        new Status(17, null);
        new Status(18, null);
        CREATOR = new i();
    }

    public Status(int i10, int i11, String str, PendingIntent pendingIntent, b bVar) {
        this.f6858c = i10;
        this.f6859f = i11;
        this.f6860j = str;
        this.f6861m = pendingIntent;
        this.n = bVar;
    }

    public Status(int i10, String str) {
        this.f6858c = 1;
        this.f6859f = i10;
        this.f6860j = str;
        this.f6861m = null;
        this.n = null;
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this.f6858c = 1;
        this.f6859f = i10;
        this.f6860j = str;
        this.f6861m = null;
        this.n = null;
    }

    @Override // d9.f
    public Status V() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            return this.f6858c == status.f6858c && this.f6859f == status.f6859f && m.a(this.f6860j, status.f6860j) && m.a(this.f6861m, status.f6861m) && m.a(this.n, status.n);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6858c), Integer.valueOf(this.f6859f), this.f6860j, this.f6861m, this.n});
    }

    public boolean p0() {
        return this.f6859f <= 0;
    }

    public String toString() {
        m.a aVar = new m.a(this);
        String str = this.f6860j;
        if (str == null) {
            str = e.K(this.f6859f);
        }
        aVar.a("statusCode", str);
        aVar.a("resolution", this.f6861m);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f6859f;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.r(parcel, 2, this.f6860j, false);
        k0.q(parcel, 3, this.f6861m, i10, false);
        k0.q(parcel, 4, this.n, i10, false);
        int i12 = this.f6858c;
        parcel.writeInt(263144);
        parcel.writeInt(i12);
        k0.z(parcel, v2);
    }
}
