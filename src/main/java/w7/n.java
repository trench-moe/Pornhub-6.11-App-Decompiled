package w7;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.oaid.BuildConfig;
import java.util.Arrays;
import w6.y;

/* loaded from: classes2.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: c */
    public final int f16940c;

    /* renamed from: f */
    public final y[] f16941f;

    /* renamed from: j */
    public int f16942j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public n[] newArray(int i10) {
            return new n[i10];
        }
    }

    public n(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f16940c = readInt;
        this.f16941f = new y[readInt];
        for (int i10 = 0; i10 < this.f16940c; i10++) {
            this.f16941f[i10] = (y) parcel.readParcelable(y.class.getClassLoader());
        }
    }

    public n(y... yVarArr) {
        int i10 = 1;
        k8.a.f(yVarArr.length > 0);
        this.f16941f = yVarArr;
        this.f16940c = yVarArr.length;
        String str = yVarArr[0].f16864j;
        str = (str == null || str.equals("und")) ? BuildConfig.FLAVOR : str;
        int i11 = yVarArr[0].n | 16384;
        while (true) {
            y[] yVarArr2 = this.f16941f;
            if (i10 >= yVarArr2.length) {
                return;
            }
            String str2 = yVarArr2[i10].f16864j;
            if (!str.equals((str2 == null || str2.equals("und")) ? BuildConfig.FLAVOR : str2)) {
                y[] yVarArr3 = this.f16941f;
                a("languages", yVarArr3[0].f16864j, yVarArr3[i10].f16864j, i10);
                return;
            }
            y[] yVarArr4 = this.f16941f;
            if (i11 != (yVarArr4[i10].n | 16384)) {
                a("role flags", Integer.toBinaryString(yVarArr4[0].n), Integer.toBinaryString(this.f16941f[i10].n), i10);
                return;
            }
            i10++;
        }
    }

    public static void a(String str, String str2, String str3, int i10) {
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, str.length() + 78)), "Different ", str, " combined in one TrackGroup: '", str2);
        n.append("' (track 0) and '");
        n.append(str3);
        n.append("' (track ");
        n.append(i10);
        n.append(")");
        k8.a.i("TrackGroup", BuildConfig.FLAVOR, new IllegalStateException(n.toString()));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            return this.f16940c == nVar.f16940c && Arrays.equals(this.f16941f, nVar.f16941f);
        }
        return false;
    }

    public int hashCode() {
        if (this.f16942j == 0) {
            this.f16942j = 527 + Arrays.hashCode(this.f16941f);
        }
        return this.f16942j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16940c);
        for (int i11 = 0; i11 < this.f16940c; i11++) {
            parcel.writeParcelable(this.f16941f[i11], 0);
        }
    }
}
