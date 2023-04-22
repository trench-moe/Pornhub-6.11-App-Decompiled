package m8;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final a f12966a;

    /* renamed from: b  reason: collision with root package name */
    public final a f12967b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12968c;
    public final boolean d;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f12969a;

        public a(b... bVarArr) {
            this.f12969a = bVarArr;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f12970a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12971b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f12972c;
        public final float[] d;

        public b(int i10, float[] fArr, float[] fArr2, int i11) {
            this.f12970a = i10;
            k8.a.c(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f12972c = fArr;
            this.d = fArr2;
            this.f12971b = i11;
        }
    }

    public d(a aVar, int i10) {
        this.f12966a = aVar;
        this.f12967b = aVar;
        this.f12968c = i10;
        this.d = true;
    }

    public d(a aVar, a aVar2, int i10) {
        this.f12966a = aVar;
        this.f12967b = aVar2;
        this.f12968c = i10;
        this.d = aVar == aVar2;
    }
}
