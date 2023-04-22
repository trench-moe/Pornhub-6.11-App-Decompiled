package kb;

/* loaded from: classes2.dex */
public final class j<T> extends a<T> {
    public static final a n = new j(new Object[0], 0, 0, 0);

    /* renamed from: j  reason: collision with root package name */
    public final T[] f12053j;

    /* renamed from: m  reason: collision with root package name */
    public final int f12054m;

    public j(T[] tArr, int i10, int i11, int i12) {
        super(i11, i12);
        this.f12053j = tArr;
        this.f12054m = i10;
    }

    @Override // kb.a
    public T a(int i10) {
        return this.f12053j[this.f12054m + i10];
    }
}
