package i8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f10636a;

    /* renamed from: b  reason: collision with root package name */
    public final i[] f10637b;

    /* renamed from: c  reason: collision with root package name */
    public int f10638c;

    public j(i... iVarArr) {
        this.f10637b = iVarArr;
        this.f10636a = iVarArr.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            return Arrays.equals(this.f10637b, ((j) obj).f10637b);
        }
        return false;
    }

    public int hashCode() {
        if (this.f10638c == 0) {
            this.f10638c = 527 + Arrays.hashCode(this.f10637b);
        }
        return this.f10638c;
    }
}
