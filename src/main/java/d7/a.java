package d7;

import c7.d;
import c7.h;
import c7.i;
import c7.j;
import c7.t;
import c7.u;
import c7.w;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.util.Arrays;
import k8.c0;
import w6.y;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: p  reason: collision with root package name */
    public static final int[] f8808p;

    /* renamed from: s  reason: collision with root package name */
    public static final int f8811s;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f8812a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f8813b;

    /* renamed from: c  reason: collision with root package name */
    public long f8814c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f8815e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8816f;

    /* renamed from: g  reason: collision with root package name */
    public long f8817g;

    /* renamed from: h  reason: collision with root package name */
    public int f8818h;

    /* renamed from: i  reason: collision with root package name */
    public int f8819i;

    /* renamed from: j  reason: collision with root package name */
    public long f8820j;

    /* renamed from: k  reason: collision with root package name */
    public j f8821k;

    /* renamed from: l  reason: collision with root package name */
    public w f8822l;

    /* renamed from: m  reason: collision with root package name */
    public u f8823m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public static final int[] f8807o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q  reason: collision with root package name */
    public static final byte[] f8809q = c0.v("#!AMR\n");

    /* renamed from: r  reason: collision with root package name */
    public static final byte[] f8810r = c0.v("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f8808p = iArr;
        f8811s = iArr[8];
    }

    public a() {
        this.f8812a = new byte[1];
        this.f8818h = -1;
    }

    public a(int i10) {
        this.f8812a = new byte[1];
        this.f8818h = -1;
    }

    @Override // c7.h
    public void a() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final int b(c7.i r8) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.a.b(c7.i):int");
    }

    @Override // c7.h
    public void c(j jVar) {
        this.f8821k = jVar;
        this.f8822l = jVar.r(0, 1);
        jVar.l();
    }

    public final boolean d(i iVar) {
        byte[] bArr = f8809q;
        iVar.l();
        byte[] bArr2 = new byte[bArr.length];
        iVar.o(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f8813b = false;
            iVar.m(bArr.length);
            return true;
        }
        byte[] bArr3 = f8810r;
        iVar.l();
        byte[] bArr4 = new byte[bArr3.length];
        iVar.o(bArr4, 0, bArr3.length);
        if (Arrays.equals(bArr4, bArr3)) {
            this.f8813b = true;
            iVar.m(bArr3.length);
            return true;
        }
        return false;
    }

    @Override // c7.h
    public boolean f(i iVar) {
        return d(iVar);
    }

    @Override // c7.h
    public void g(long j10, long j11) {
        this.f8814c = 0L;
        this.d = 0;
        this.f8815e = 0;
        if (j10 != 0) {
            u uVar = this.f8823m;
            if (uVar instanceof d) {
                d dVar = (d) uVar;
                this.f8820j = d.c(j10, dVar.f3791b, dVar.f3793e);
                return;
            }
        }
        this.f8820j = 0L;
    }

    @Override // c7.h
    public int h(i iVar, t tVar) {
        k8.a.g(this.f8822l);
        int i10 = c0.f11939a;
        if (iVar.getPosition() == 0 && !d(iVar)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        if (!this.n) {
            this.n = true;
            boolean z10 = this.f8813b;
            String str = z10 ? "audio/amr-wb" : "audio/3gpp";
            int i11 = z10 ? 16000 : 8000;
            w wVar = this.f8822l;
            y.b bVar = new y.b();
            bVar.f16879k = str;
            bVar.f16880l = f8811s;
            bVar.f16891x = 1;
            bVar.y = i11;
            wVar.d(bVar.a());
        }
        int i12 = -1;
        if (this.f8815e == 0) {
            try {
                int b10 = b(iVar);
                this.d = b10;
                this.f8815e = b10;
                if (this.f8818h == -1) {
                    this.f8817g = iVar.getPosition();
                    this.f8818h = this.d;
                }
                if (this.f8818h == this.d) {
                    this.f8819i++;
                }
            } catch (EOFException unused) {
            }
        }
        int e10 = this.f8822l.e(iVar, this.f8815e, true);
        if (e10 != -1) {
            int i13 = this.f8815e - e10;
            this.f8815e = i13;
            if (i13 <= 0) {
                this.f8822l.b(this.f8820j + this.f8814c, 1, this.d, 0, null);
                this.f8814c += 20000;
            }
            i12 = 0;
        }
        iVar.b();
        if (!this.f8816f) {
            u.b bVar2 = new u.b(-9223372036854775807L, 0L);
            this.f8823m = bVar2;
            this.f8821k.g(bVar2);
            this.f8816f = true;
        }
        return i12;
    }
}
