package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import k8.c0;

/* loaded from: classes.dex */
public final class b implements Comparator<C0080b>, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final C0080b[] f6173c;

    /* renamed from: f  reason: collision with root package name */
    public int f6174f;

    /* renamed from: j  reason: collision with root package name */
    public final String f6175j;

    /* renamed from: m  reason: collision with root package name */
    public final int f6176m;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0080b implements Parcelable {
        public static final Parcelable.Creator<C0080b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f6177c;

        /* renamed from: f  reason: collision with root package name */
        public final UUID f6178f;

        /* renamed from: j  reason: collision with root package name */
        public final String f6179j;

        /* renamed from: m  reason: collision with root package name */
        public final String f6180m;
        public final byte[] n;

        /* renamed from: com.google.android.exoplayer2.drm.b$b$a */
        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<C0080b> {
            @Override // android.os.Parcelable.Creator
            public C0080b createFromParcel(Parcel parcel) {
                return new C0080b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0080b[] newArray(int i10) {
                return new C0080b[i10];
            }
        }

        public C0080b(Parcel parcel) {
            this.f6178f = new UUID(parcel.readLong(), parcel.readLong());
            this.f6179j = parcel.readString();
            String readString = parcel.readString();
            int i10 = c0.f11939a;
            this.f6180m = readString;
            this.n = parcel.createByteArray();
        }

        public C0080b(UUID uuid, String str, String str2, byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f6178f = uuid;
            this.f6179j = str;
            Objects.requireNonNull(str2);
            this.f6180m = str2;
            this.n = bArr;
        }

        public C0080b(UUID uuid, String str, byte[] bArr) {
            Objects.requireNonNull(uuid);
            this.f6178f = uuid;
            this.f6179j = null;
            this.f6180m = str;
            this.n = bArr;
        }

        public boolean a(UUID uuid) {
            if (!w6.g.f16588a.equals(this.f6178f) && !uuid.equals(this.f6178f)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            boolean z10 = false;
            if (obj instanceof C0080b) {
                if (obj == this) {
                    return true;
                }
                C0080b c0080b = (C0080b) obj;
                if (c0.a(this.f6179j, c0080b.f6179j) && c0.a(this.f6180m, c0080b.f6180m) && c0.a(this.f6178f, c0080b.f6178f) && Arrays.equals(this.n, c0080b.n)) {
                    z10 = true;
                }
                return z10;
            }
            return false;
        }

        public int hashCode() {
            if (this.f6177c == 0) {
                int hashCode = this.f6178f.hashCode() * 31;
                String str = this.f6179j;
                this.f6177c = Arrays.hashCode(this.n) + a1.a.b(this.f6180m, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f6177c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f6178f.getMostSignificantBits());
            parcel.writeLong(this.f6178f.getLeastSignificantBits());
            parcel.writeString(this.f6179j);
            parcel.writeString(this.f6180m);
            parcel.writeByteArray(this.n);
        }
    }

    public b(Parcel parcel) {
        this.f6175j = parcel.readString();
        C0080b[] c0080bArr = (C0080b[]) parcel.createTypedArray(C0080b.CREATOR);
        int i10 = c0.f11939a;
        this.f6173c = c0080bArr;
        this.f6176m = c0080bArr.length;
    }

    public b(String str, boolean z10, C0080b... c0080bArr) {
        this.f6175j = str;
        c0080bArr = z10 ? (C0080b[]) c0080bArr.clone() : c0080bArr;
        this.f6173c = c0080bArr;
        this.f6176m = c0080bArr.length;
        Arrays.sort(c0080bArr, this);
    }

    public b a(String str) {
        return c0.a(this.f6175j, str) ? this : new b(str, false, this.f6173c);
    }

    @Override // java.util.Comparator
    public int compare(C0080b c0080b, C0080b c0080b2) {
        C0080b c0080b3 = c0080b;
        C0080b c0080b4 = c0080b2;
        UUID uuid = w6.g.f16588a;
        return uuid.equals(c0080b3.f6178f) ? uuid.equals(c0080b4.f6178f) ? 0 : 1 : c0080b3.f6178f.compareTo(c0080b4.f6178f);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return c0.a(this.f6175j, bVar.f6175j) && Arrays.equals(this.f6173c, bVar.f6173c);
    }

    public int hashCode() {
        if (this.f6174f == 0) {
            String str = this.f6175j;
            this.f6174f = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f6173c);
        }
        return this.f6174f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6175j);
        parcel.writeTypedArray(this.f6173c, 0);
    }
}
