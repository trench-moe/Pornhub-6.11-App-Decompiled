package c9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h9.m;
import java.util.Arrays;
import t9.k0;

/* loaded from: classes.dex */
public class d extends i9.a {
    public static final Parcelable.Creator<d> CREATOR = new m();

    /* renamed from: c  reason: collision with root package name */
    public final String f3868c;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public final int f3869f;

    /* renamed from: j  reason: collision with root package name */
    public final long f3870j;

    public d(String str, int i10, long j10) {
        this.f3868c = str;
        this.f3869f = i10;
        this.f3870j = j10;
    }

    public d(String str, long j10) {
        this.f3868c = str;
        this.f3870j = j10;
        this.f3869f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof c9.d
            java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = 0
            r7 = 3
            if (r0 == 0) goto L36
            c9.d r9 = (c9.d) r9
            r7 = 3
            java.lang.String r0 = r8.f3868c
            if (r0 == 0) goto L1a
            r7 = 2
            java.lang.String r2 = r9.f3868c
            r7 = 1
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L25
            r7 = 3
        L1a:
            r7 = 6
            java.lang.String r0 = r8.f3868c
            if (r0 != 0) goto L36
            java.lang.String r0 = r9.f3868c
            r7 = 6
            if (r0 != 0) goto L36
            r7 = 5
        L25:
            long r2 = r8.p0()
            long r4 = r9.p0()
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r7 = 1
            if (r9 != 0) goto L36
            r7 = 7
            r6 = 1
            r9 = r6
            return r9
        L36:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3868c, Long.valueOf(p0())});
    }

    public long p0() {
        long j10 = this.f3870j;
        if (j10 == -1) {
            j10 = this.f3869f;
        }
        return j10;
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f3868c);
        aVar.a("version", Long.valueOf(p0()));
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 1, this.f3868c, false);
        int i11 = this.f3869f;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        long p02 = p0();
        parcel.writeInt(524291);
        parcel.writeLong(p02);
        k0.z(parcel, v2);
    }
}
