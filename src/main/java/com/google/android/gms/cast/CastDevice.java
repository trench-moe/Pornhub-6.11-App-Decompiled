package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.internal.ReflectedParcelable;
import i9.a;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t9.k0;
import u8.f1;

/* loaded from: classes.dex */
public class CastDevice extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new f1();
    public String A;
    public final String B;
    public int C;
    public final String D;
    public byte[] E;
    public final String F;
    public final boolean G;

    /* renamed from: c  reason: collision with root package name */
    public String f6781c;

    /* renamed from: f  reason: collision with root package name */
    public String f6782f;

    /* renamed from: j  reason: collision with root package name */
    public InetAddress f6783j;

    /* renamed from: m  reason: collision with root package name */
    public String f6784m;
    public String n;

    /* renamed from: t  reason: collision with root package name */
    public String f6785t;

    /* renamed from: u  reason: collision with root package name */
    public int f6786u;

    /* renamed from: w  reason: collision with root package name */
    public List<g9.a> f6787w;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public int f6788z;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i10, List<g9.a> list, int i11, int i12, String str6, String str7, int i13, String str8, byte[] bArr, String str9, boolean z10) {
        String str10 = BuildConfig.FLAVOR;
        this.f6781c = str == null ? BuildConfig.FLAVOR : str;
        String str11 = str2 == null ? BuildConfig.FLAVOR : str2;
        this.f6782f = str11;
        if (!TextUtils.isEmpty(str11)) {
            try {
                this.f6783j = InetAddress.getByName(this.f6782f);
            } catch (UnknownHostException e10) {
                String str12 = this.f6782f;
                String message = e10.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str12).length() + 48 + String.valueOf(message).length());
                sb2.append("Unable to convert host address (");
                sb2.append(str12);
                sb2.append(") to ipaddress: ");
                sb2.append(message);
                Log.i("CastDevice", sb2.toString());
            }
        }
        this.f6784m = str3 == null ? BuildConfig.FLAVOR : str3;
        this.n = str4 == null ? BuildConfig.FLAVOR : str4;
        this.f6785t = str5 == null ? BuildConfig.FLAVOR : str5;
        this.f6786u = i10;
        this.f6787w = list != null ? list : new ArrayList<>();
        this.y = i11;
        this.f6788z = i12;
        this.A = str6 != null ? str6 : str10;
        this.B = str7;
        this.C = i13;
        this.D = str8;
        this.E = bArr;
        this.F = str9;
        this.G = z10;
    }

    public static CastDevice p0(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle != null && (classLoader = CastDevice.class.getClassLoader()) != null) {
            bundle.setClassLoader(classLoader);
            return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ce, code lost:
        if (r8.E == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.CastDevice.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f6781c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public boolean q0(int i10) {
        return (this.y & i10) == i10;
    }

    public String toString() {
        return String.format("\"%s\" (%s)", this.f6784m, this.f6781c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f6781c, false);
        k0.r(parcel, 3, this.f6782f, false);
        k0.r(parcel, 4, this.f6784m, false);
        k0.r(parcel, 5, this.n, false);
        k0.r(parcel, 6, this.f6785t, false);
        int i11 = this.f6786u;
        parcel.writeInt(262151);
        parcel.writeInt(i11);
        k0.u(parcel, 8, Collections.unmodifiableList(this.f6787w), false);
        int i12 = this.y;
        parcel.writeInt(262153);
        parcel.writeInt(i12);
        int i13 = this.f6788z;
        parcel.writeInt(262154);
        parcel.writeInt(i13);
        k0.r(parcel, 11, this.A, false);
        k0.r(parcel, 12, this.B, false);
        int i14 = this.C;
        parcel.writeInt(262157);
        parcel.writeInt(i14);
        k0.r(parcel, 14, this.D, false);
        k0.m(parcel, 15, this.E, false);
        k0.r(parcel, 16, this.F, false);
        boolean z10 = this.G;
        parcel.writeInt(262161);
        parcel.writeInt(z10 ? 1 : 0);
        k0.z(parcel, v2);
    }
}
