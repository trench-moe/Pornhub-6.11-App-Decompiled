package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<b> f15617c;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final long f15618c;

        /* renamed from: f  reason: collision with root package name */
        public final long f15619f;

        /* renamed from: j  reason: collision with root package name */
        public final int f15620j;

        /* loaded from: classes2.dex */
        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(long j10, long j11, int i10) {
            k8.a.c(j10 < j11);
            this.f15618c = j10;
            this.f15619f = j11;
            this.f15620j = i10;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f15618c == bVar.f15618c && this.f15619f == bVar.f15619f && this.f15620j == bVar.f15620j;
        }

        public int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f15618c), Long.valueOf(this.f15619f), Integer.valueOf(this.f15620j)});
        }

        public String toString() {
            return c0.k("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f15618c), Long.valueOf(this.f15619f), Integer.valueOf(this.f15620j));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f15618c);
            parcel.writeLong(this.f15619f);
            parcel.writeInt(this.f15620j);
        }
    }

    public c(List<b> list) {
        this.f15617c = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = list.get(0).f15619f;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                } else if (list.get(i10).f15618c < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = list.get(i10).f15619f;
                    i10++;
                }
            }
        }
        k8.a.c(!z10);
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
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
        if (obj != null && c.class == obj.getClass()) {
            return this.f15617c.equals(((c) obj).f15617c);
        }
        return false;
    }

    public int hashCode() {
        return this.f15617c.hashCode();
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15617c);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f15617c);
    }
}
