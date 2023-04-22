package q7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: u  reason: collision with root package name */
    public static final y f14423u;

    /* renamed from: w  reason: collision with root package name */
    public static final y f14424w;

    /* renamed from: c  reason: collision with root package name */
    public final String f14425c;

    /* renamed from: f  reason: collision with root package name */
    public final String f14426f;

    /* renamed from: j  reason: collision with root package name */
    public final long f14427j;

    /* renamed from: m  reason: collision with root package name */
    public final long f14428m;
    public final byte[] n;

    /* renamed from: t  reason: collision with root package name */
    public int f14429t;

    /* renamed from: q7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0249a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    static {
        y.b bVar = new y.b();
        bVar.f16879k = "application/id3";
        f14423u = bVar.a();
        y.b bVar2 = new y.b();
        bVar2.f16879k = "application/x-scte35";
        f14424w = bVar2.a();
        CREATOR = new C0249a();
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f14425c = readString;
        this.f14426f = parcel.readString();
        this.f14427j = parcel.readLong();
        this.f14428m = parcel.readLong();
        this.n = parcel.createByteArray();
    }

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f14425c = str;
        this.f14426f = str2;
        this.f14427j = j10;
        this.f14428m = j11;
        this.n = bArr;
    }

    @Override // o7.a.b
    public y E() {
        String str = this.f14425c;
        Objects.requireNonNull(str);
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (!str.equals("urn:scte:scte35:2014:bin")) {
                    break;
                } else {
                    c10 = 0;
                    break;
                }
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (!str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    break;
                } else {
                    c10 = 2;
                    break;
                }
        }
        switch (c10) {
            case 0:
                return f14424w;
            case 1:
            case 2:
                return f14423u;
            default:
                return null;
        }
    }

    @Override // o7.a.b
    public /* synthetic */ void J(d0.b bVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return this.f14427j == aVar.f14427j && this.f14428m == aVar.f14428m && c0.a(this.f14425c, aVar.f14425c) && c0.a(this.f14426f, aVar.f14426f) && Arrays.equals(this.n, aVar.n);
        }
        return false;
    }

    public int hashCode() {
        if (this.f14429t == 0) {
            String str = this.f14425c;
            int i10 = 0;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f14426f;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            long j10 = this.f14427j;
            long j11 = this.f14428m;
            this.f14429t = Arrays.hashCode(this.n) + ((((((hashCode + i10) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.f14429t;
    }

    @Override // o7.a.b
    public byte[] i0() {
        if (E() != null) {
            return this.n;
        }
        return null;
    }

    public String toString() {
        String str = this.f14425c;
        long j10 = this.f14428m;
        long j11 = this.f14427j;
        String str2 = this.f14426f;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str2, a0.a.e(str, 79)));
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j10);
        sb2.append(", durationMs=");
        sb2.append(j11);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14425c);
        parcel.writeString(this.f14426f);
        parcel.writeLong(this.f14427j);
        parcel.writeLong(this.f14428m);
        parcel.writeByteArray(this.n);
    }
}
