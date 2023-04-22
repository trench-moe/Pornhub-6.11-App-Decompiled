package v7;

import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public abstract class b implements a.b {
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

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        return simpleName.length() != 0 ? "SCTE-35 splice command: type=".concat(simpleName) : new String("SCTE-35 splice command: type=");
    }
}
