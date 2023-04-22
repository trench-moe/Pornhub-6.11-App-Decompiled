package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import i9.a;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import t9.k0;

@KeepName
/* loaded from: classes.dex */
public final class DataHolder extends a implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new f9.a();

    /* renamed from: c  reason: collision with root package name */
    public final int f6863c;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f6864f;

    /* renamed from: j  reason: collision with root package name */
    public Bundle f6865j;

    /* renamed from: m  reason: collision with root package name */
    public final CursorWindow[] f6866m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f6867t;

    /* renamed from: u  reason: collision with root package name */
    public int[] f6868u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6869w = false;
    public boolean y = true;

    static {
        Objects.requireNonNull(new String[0], "null reference");
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i10, String[] strArr, CursorWindow[] cursorWindowArr, int i11, Bundle bundle) {
        this.f6863c = i10;
        this.f6864f = strArr;
        this.f6866m = cursorWindowArr;
        this.n = i11;
        this.f6867t = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.f6869w) {
                this.f6869w = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f6866m;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z10;
        try {
            if (this.y && this.f6866m.length > 0) {
                synchronized (this) {
                    z10 = this.f6869w;
                }
                if (!z10) {
                    close();
                    String obj = toString();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 178);
                    sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb2.append(obj);
                    sb2.append(")");
                    Log.e("DataBuffer", sb2.toString());
                    super.finalize();
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        String[] strArr = this.f6864f;
        if (strArr != null) {
            int v10 = k0.v(parcel, 1);
            parcel.writeStringArray(strArr);
            k0.z(parcel, v10);
        }
        k0.t(parcel, 2, this.f6866m, i10, false);
        int i11 = this.n;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        k0.l(parcel, 4, this.f6867t, false);
        int i12 = this.f6863c;
        parcel.writeInt(263144);
        parcel.writeInt(i12);
        k0.z(parcel, v2);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
