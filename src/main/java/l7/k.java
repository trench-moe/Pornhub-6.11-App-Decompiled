package l7;

import java.util.Arrays;
import l7.d0;

/* loaded from: classes2.dex */
public final class k implements j {

    /* renamed from: q  reason: collision with root package name */
    public static final double[] f12452q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a  reason: collision with root package name */
    public String f12453a;

    /* renamed from: b  reason: collision with root package name */
    public c7.w f12454b;

    /* renamed from: c  reason: collision with root package name */
    public final e0 f12455c;
    public final k8.t d;

    /* renamed from: e  reason: collision with root package name */
    public final r f12456e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean[] f12457f = new boolean[4];

    /* renamed from: g  reason: collision with root package name */
    public final a f12458g = new a(128);

    /* renamed from: h  reason: collision with root package name */
    public long f12459h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12460i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12461j;

    /* renamed from: k  reason: collision with root package name */
    public long f12462k;

    /* renamed from: l  reason: collision with root package name */
    public long f12463l;

    /* renamed from: m  reason: collision with root package name */
    public long f12464m;
    public long n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f12465o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f12466p;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f12467e = {0, 0, 1};

        /* renamed from: a  reason: collision with root package name */
        public boolean f12468a;

        /* renamed from: b  reason: collision with root package name */
        public int f12469b;

        /* renamed from: c  reason: collision with root package name */
        public int f12470c;
        public byte[] d;

        public a(int i10) {
            this.d = new byte[i10];
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f12468a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i13 = this.f12469b;
                if (length < i13 + i12) {
                    this.d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.d, this.f12469b, i12);
                this.f12469b += i12;
            }
        }
    }

    public k(e0 e0Var) {
        this.f12455c = e0Var;
        if (e0Var != null) {
            this.f12456e = new r(178, 128);
            this.d = new k8.t();
            return;
        }
        this.f12456e = null;
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0215  */
    @Override // l7.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(k8.t r26) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.k.b(k8.t):void");
    }

    @Override // l7.j
    public void c() {
        k8.q.a(this.f12457f);
        a aVar = this.f12458g;
        aVar.f12468a = false;
        aVar.f12469b = 0;
        aVar.f12470c = 0;
        r rVar = this.f12456e;
        if (rVar != null) {
            rVar.c();
        }
        this.f12459h = 0L;
        this.f12460i = false;
    }

    @Override // l7.j
    public void d(c7.j jVar, d0.d dVar) {
        dVar.a();
        this.f12453a = dVar.b();
        this.f12454b = jVar.r(dVar.c(), 2);
        e0 e0Var = this.f12455c;
        if (e0Var != null) {
            e0Var.b(jVar, dVar);
        }
    }

    @Override // l7.j
    public void e() {
    }

    @Override // l7.j
    public void f(long j10, int i10) {
        this.f12463l = j10;
    }
}
