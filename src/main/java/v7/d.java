package v7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class d extends v7.b {
    public static final Parcelable.Creator<d> CREATOR = new a();
    public final int A;
    public final int B;
    public final int C;

    /* renamed from: c  reason: collision with root package name */
    public final long f16032c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f16033f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f16034j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f16035m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final long f16036t;

    /* renamed from: u  reason: collision with root package name */
    public final long f16037u;

    /* renamed from: w  reason: collision with root package name */
    public final List<b> f16038w;
    public final boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final long f16039z;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f16040a;

        /* renamed from: b  reason: collision with root package name */
        public final long f16041b;

        /* renamed from: c  reason: collision with root package name */
        public final long f16042c;

        public b(int i10, long j10, long j11) {
            this.f16040a = i10;
            this.f16041b = j10;
            this.f16042c = j11;
        }

        public b(int i10, long j10, long j11, a aVar) {
            this.f16040a = i10;
            this.f16041b = j10;
            this.f16042c = j11;
        }
    }

    public d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f16032c = j10;
        this.f16033f = z10;
        this.f16034j = z11;
        this.f16035m = z12;
        this.n = z13;
        this.f16036t = j11;
        this.f16037u = j12;
        this.f16038w = Collections.unmodifiableList(list);
        this.y = z14;
        this.f16039z = j13;
        this.A = i10;
        this.B = i11;
        this.C = i12;
    }

    public d(Parcel parcel, a aVar) {
        this.f16032c = parcel.readLong();
        this.f16033f = parcel.readByte() == 1;
        this.f16034j = parcel.readByte() == 1;
        this.f16035m = parcel.readByte() == 1;
        this.n = parcel.readByte() == 1;
        this.f16036t = parcel.readLong();
        this.f16037u = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(new b(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f16038w = Collections.unmodifiableList(arrayList);
        this.y = parcel.readByte() == 1;
        this.f16039z = parcel.readLong();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16032c);
        parcel.writeByte(this.f16033f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16034j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16035m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16036t);
        parcel.writeLong(this.f16037u);
        int size = this.f16038w.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f16038w.get(i11);
            parcel.writeInt(bVar.f16040a);
            parcel.writeLong(bVar.f16041b);
            parcel.writeLong(bVar.f16042c);
        }
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f16039z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }
}
