package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final long f7373c;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(long j10) {
        this.f7373c = j10;
    }

    public e(long j10, a aVar) {
        this.f7373c = j10;
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean Y(long j10) {
        return j10 >= this.f7373c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f7373c == ((e) obj).f7373c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f7373c)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f7373c);
    }
}
