package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class f extends v7.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<c> f16043c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16044a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16045b;

        public b(int i10, long j10) {
            this.f16044a = i10;
            this.f16045b = j10;
        }

        public b(int i10, long j10, a aVar) {
            this.f16044a = i10;
            this.f16045b = j10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f16046a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16047b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16048c;
        public final boolean d;

        /* renamed from: e  reason: collision with root package name */
        public final long f16049e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f16050f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16051g;

        /* renamed from: h  reason: collision with root package name */
        public final long f16052h;

        /* renamed from: i  reason: collision with root package name */
        public final int f16053i;

        /* renamed from: j  reason: collision with root package name */
        public final int f16054j;

        /* renamed from: k  reason: collision with root package name */
        public final int f16055k;

        public c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f16046a = j10;
            this.f16047b = z10;
            this.f16048c = z11;
            this.d = z12;
            this.f16050f = Collections.unmodifiableList(list);
            this.f16049e = j11;
            this.f16051g = z13;
            this.f16052h = j12;
            this.f16053i = i10;
            this.f16054j = i11;
            this.f16055k = i12;
        }

        public c(Parcel parcel) {
            this.f16046a = parcel.readLong();
            this.f16047b = parcel.readByte() == 1;
            this.f16048c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(new b(parcel.readInt(), parcel.readLong()));
            }
            this.f16050f = Collections.unmodifiableList(arrayList);
            this.f16049e = parcel.readLong();
            this.f16051g = parcel.readByte() == 1;
            this.f16052h = parcel.readLong();
            this.f16053i = parcel.readInt();
            this.f16054j = parcel.readInt();
            this.f16055k = parcel.readInt();
        }
    }

    public f(Parcel parcel, a aVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new c(parcel));
        }
        this.f16043c = Collections.unmodifiableList(arrayList);
    }

    public f(List<c> list) {
        this.f16043c = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f16043c.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            c cVar = this.f16043c.get(i11);
            parcel.writeLong(cVar.f16046a);
            parcel.writeByte(cVar.f16047b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f16048c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f16050f.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                b bVar = cVar.f16050f.get(i12);
                parcel.writeInt(bVar.f16044a);
                parcel.writeLong(bVar.f16045b);
            }
            parcel.writeLong(cVar.f16049e);
            parcel.writeByte(cVar.f16051g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f16052h);
            parcel.writeInt(cVar.f16053i);
            parcel.writeInt(cVar.f16054j);
            parcel.writeInt(cVar.f16055k);
        }
    }
}
