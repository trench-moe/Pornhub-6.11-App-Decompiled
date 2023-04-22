package l7;

import java.util.Arrays;
import l7.d0;

/* loaded from: classes2.dex */
public final class l implements j {

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12471l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final e0 f12472a;

    /* renamed from: f  reason: collision with root package name */
    public b f12476f;

    /* renamed from: g  reason: collision with root package name */
    public long f12477g;

    /* renamed from: h  reason: collision with root package name */
    public String f12478h;

    /* renamed from: i  reason: collision with root package name */
    public c7.w f12479i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12480j;

    /* renamed from: k  reason: collision with root package name */
    public long f12481k;

    /* renamed from: c  reason: collision with root package name */
    public final boolean[] f12474c = new boolean[4];
    public final a d = new a(128);

    /* renamed from: e  reason: collision with root package name */
    public final r f12475e = new r(178, 128);

    /* renamed from: b  reason: collision with root package name */
    public final k8.t f12473b = new k8.t();

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f12482f = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f12483a;

        /* renamed from: b  reason: collision with root package name */
        public int f12484b;

        /* renamed from: c  reason: collision with root package name */
        public int f12485c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public byte[] f12486e;

        public a(int i10) {
            this.f12486e = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12483a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f12486e;
                int length = bArr2.length;
                int i13 = this.f12485c;
                if (length < i13 + i12) {
                    this.f12486e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f12486e, this.f12485c, i12);
                this.f12485c += i12;
            }
        }

        public void b() {
            this.f12483a = false;
            this.f12485c = 0;
            this.f12484b = 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final c7.w f12487a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f12488b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12489c;
        public boolean d;

        /* renamed from: e  reason: collision with root package name */
        public int f12490e;

        /* renamed from: f  reason: collision with root package name */
        public int f12491f;

        /* renamed from: g  reason: collision with root package name */
        public long f12492g;

        /* renamed from: h  reason: collision with root package name */
        public long f12493h;

        public b(c7.w wVar) {
            this.f12487a = wVar;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12489c) {
                int i12 = this.f12491f;
                int i13 = (i10 + 1) - i12;
                if (i13 < i11) {
                    this.d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f12489c = false;
                    return;
                }
                this.f12491f = (i11 - i10) + i12;
            }
        }
    }

    public l(e0 e0Var) {
        this.f12472a = e0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0257 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0201  */
    @Override // l7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k8.t r26) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.l.b(k8.t):void");
    }

    @Override // l7.j
    public void c() {
        k8.q.a(this.f12474c);
        this.d.b();
        b bVar = this.f12476f;
        if (bVar != null) {
            bVar.f12488b = false;
            bVar.f12489c = false;
            bVar.d = false;
            bVar.f12490e = -1;
        }
        r rVar = this.f12475e;
        if (rVar != null) {
            rVar.c();
        }
        this.f12477g = 0L;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.f12478h = dVar.b();
        c7.w r10 = jVar.r(dVar.c(), 2);
        this.f12479i = r10;
        this.f12476f = new b(r10);
        e0 e0Var = this.f12472a;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12481k = j10;
    }
}
