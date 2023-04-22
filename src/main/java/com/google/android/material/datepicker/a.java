package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0092a();

    /* renamed from: c  reason: collision with root package name */
    public final q f7350c;

    /* renamed from: f  reason: collision with root package name */
    public final q f7351f;

    /* renamed from: j  reason: collision with root package name */
    public final c f7352j;

    /* renamed from: m  reason: collision with root package name */
    public q f7353m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int f7354t;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a((q) parcel.readParcelable(q.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (q) parcel.readParcelable(q.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f7355e = y.a(q.c(1900, 0).f7401t);

        /* renamed from: f  reason: collision with root package name */
        public static final long f7356f = y.a(q.c(2100, 11).f7401t);

        /* renamed from: a  reason: collision with root package name */
        public long f7357a;

        /* renamed from: b  reason: collision with root package name */
        public long f7358b;

        /* renamed from: c  reason: collision with root package name */
        public Long f7359c;
        public c d;

        public b(a aVar) {
            this.f7357a = f7355e;
            this.f7358b = f7356f;
            this.d = new e(Long.MIN_VALUE);
            this.f7357a = aVar.f7350c.f7401t;
            this.f7358b = aVar.f7351f.f7401t;
            this.f7359c = Long.valueOf(aVar.f7353m.f7401t);
            this.d = aVar.f7352j;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean Y(long j10);
    }

    public a(q qVar, q qVar2, c cVar, q qVar3, C0092a c0092a) {
        this.f7350c = qVar;
        this.f7351f = qVar2;
        this.f7353m = qVar3;
        this.f7352j = cVar;
        if (qVar3 != null && qVar.f7397c.compareTo(qVar3.f7397c) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (qVar3 != null && qVar3.f7397c.compareTo(qVar2.f7397c) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f7354t = qVar.h(qVar2) + 1;
        this.n = (qVar2.f7399j - qVar.f7399j) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f7350c.equals(aVar.f7350c) && this.f7351f.equals(aVar.f7351f) && Objects.equals(this.f7353m, aVar.f7353m) && this.f7352j.equals(aVar.f7352j);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7350c, this.f7351f, this.f7353m, this.f7352j});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7350c, 0);
        parcel.writeParcelable(this.f7351f, 0);
        parcel.writeParcelable(this.f7353m, 0);
        parcel.writeParcelable(this.f7352j, 0);
    }
}
