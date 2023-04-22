package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class q implements Comparable<q>, Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final Calendar f7397c;

    /* renamed from: f  reason: collision with root package name */
    public final int f7398f;

    /* renamed from: j  reason: collision with root package name */
    public final int f7399j;

    /* renamed from: m  reason: collision with root package name */
    public final int f7400m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final long f7401t;

    /* renamed from: u  reason: collision with root package name */
    public String f7402u;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public q createFromParcel(Parcel parcel) {
            return q.c(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public q[] newArray(int i10) {
            return new q[i10];
        }
    }

    public q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = y.b(calendar);
        this.f7397c = b10;
        this.f7398f = b10.get(2);
        this.f7399j = b10.get(1);
        this.f7400m = b10.getMaximum(7);
        this.n = b10.getActualMaximum(5);
        this.f7401t = b10.getTimeInMillis();
    }

    public static q c(int i10, int i11) {
        Calendar e10 = y.e();
        e10.set(1, i10);
        e10.set(2, i11);
        return new q(e10);
    }

    public static q d(long j10) {
        Calendar e10 = y.e();
        e10.setTimeInMillis(j10);
        return new q(e10);
    }

    @Override // java.lang.Comparable
    /* renamed from: b */
    public int compareTo(q qVar) {
        return this.f7397c.compareTo(qVar.f7397c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        int firstDayOfWeek = this.f7397c.get(7) - this.f7397c.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f7400m : firstDayOfWeek;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return this.f7398f == qVar.f7398f && this.f7399j == qVar.f7399j;
        }
        return false;
    }

    public String f(Context context) {
        if (this.f7402u == null) {
            long timeInMillis = this.f7397c.getTimeInMillis();
            this.f7402u = DateUtils.formatDateTime(context, timeInMillis - TimeZone.getDefault().getOffset(timeInMillis), 36);
        }
        return this.f7402u;
    }

    public q g(int i10) {
        Calendar b10 = y.b(this.f7397c);
        b10.add(2, i10);
        return new q(b10);
    }

    public int h(q qVar) {
        if (this.f7397c instanceof GregorianCalendar) {
            return (qVar.f7398f - this.f7398f) + ((qVar.f7399j - this.f7399j) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7398f), Integer.valueOf(this.f7399j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7399j);
        parcel.writeInt(this.f7398f);
    }
}
