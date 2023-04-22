package t9;

/* loaded from: classes2.dex */
public final class g3 {
    public static final g3 d = new g3(new int[0], new Object[0]);

    /* renamed from: a  reason: collision with root package name */
    public int[] f15225a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15226b;

    /* renamed from: c  reason: collision with root package name */
    public int f15227c;

    public g3() {
        this(new int[8], new Object[8]);
    }

    public g3(int[] iArr, Object[] objArr) {
        this.f15227c = -1;
        this.f15225a = iArr;
        this.f15226b = objArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g3)) {
            g3 g3Var = (g3) obj;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 506991;
    }
}
