package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.i0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final CharSequence A;
    public final ArrayList<String> B;
    public final ArrayList<String> C;
    public final boolean D;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f2082c;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList<String> f2083f;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2084j;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f2085m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final String f2086t;

    /* renamed from: u  reason: collision with root package name */
    public final int f2087u;

    /* renamed from: w  reason: collision with root package name */
    public final int f2088w;
    public final CharSequence y;

    /* renamed from: z  reason: collision with root package name */
    public final int f2089z;

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

    public b(Parcel parcel) {
        this.f2082c = parcel.createIntArray();
        this.f2083f = parcel.createStringArrayList();
        this.f2084j = parcel.createIntArray();
        this.f2085m = parcel.createIntArray();
        this.n = parcel.readInt();
        this.f2086t = parcel.readString();
        this.f2087u = parcel.readInt();
        this.f2088w = parcel.readInt();
        this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2089z = parcel.readInt();
        this.A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.B = parcel.createStringArrayList();
        this.C = parcel.createStringArrayList();
        this.D = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f2151a.size();
        this.f2082c = new int[size * 5];
        if (!aVar.f2156g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2083f = new ArrayList<>(size);
        this.f2084j = new int[size];
        this.f2085m = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            i0.a aVar2 = aVar.f2151a.get(i10);
            int i12 = i11 + 1;
            this.f2082c[i11] = aVar2.f2165a;
            ArrayList<String> arrayList = this.f2083f;
            Fragment fragment = aVar2.f2166b;
            arrayList.add(fragment != null ? fragment.f2018t : null);
            int[] iArr = this.f2082c;
            int i13 = i12 + 1;
            iArr[i12] = aVar2.f2167c;
            int i14 = i13 + 1;
            iArr[i13] = aVar2.d;
            int i15 = i14 + 1;
            iArr[i14] = aVar2.f2168e;
            iArr[i15] = aVar2.f2169f;
            this.f2084j[i10] = aVar2.f2170g.ordinal();
            this.f2085m[i10] = aVar2.f2171h.ordinal();
            i10++;
            i11 = i15 + 1;
        }
        this.n = aVar.f2155f;
        this.f2086t = aVar.f2158i;
        this.f2087u = aVar.f2074s;
        this.f2088w = aVar.f2159j;
        this.y = aVar.f2160k;
        this.f2089z = aVar.f2161l;
        this.A = aVar.f2162m;
        this.B = aVar.n;
        this.C = aVar.f2163o;
        this.D = aVar.f2164p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2082c);
        parcel.writeStringList(this.f2083f);
        parcel.writeIntArray(this.f2084j);
        parcel.writeIntArray(this.f2085m);
        parcel.writeInt(this.n);
        parcel.writeString(this.f2086t);
        parcel.writeInt(this.f2087u);
        parcel.writeInt(this.f2088w);
        TextUtils.writeToParcel(this.y, parcel, 0);
        parcel.writeInt(this.f2089z);
        TextUtils.writeToParcel(this.A, parcel, 0);
        parcel.writeStringList(this.B);
        parcel.writeStringList(this.C);
        parcel.writeInt(this.D ? 1 : 0);
    }
}
