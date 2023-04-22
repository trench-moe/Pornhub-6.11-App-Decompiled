package w6;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.i;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: t  reason: collision with root package name */
    public static final i.a f16658t = new i.a(new Object());

    /* renamed from: a  reason: collision with root package name */
    public final x0 f16659a;

    /* renamed from: b  reason: collision with root package name */
    public final i.a f16660b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16661c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16662e;

    /* renamed from: f  reason: collision with root package name */
    public final ExoPlaybackException f16663f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16664g;

    /* renamed from: h  reason: collision with root package name */
    public final w7.o f16665h;

    /* renamed from: i  reason: collision with root package name */
    public final i8.m f16666i;

    /* renamed from: j  reason: collision with root package name */
    public final List<o7.a> f16667j;

    /* renamed from: k  reason: collision with root package name */
    public final i.a f16668k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16669l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16670m;
    public final m0 n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f16671o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f16672p;

    /* renamed from: q  reason: collision with root package name */
    public volatile long f16673q;

    /* renamed from: r  reason: collision with root package name */
    public volatile long f16674r;

    /* renamed from: s  reason: collision with root package name */
    public volatile long f16675s;

    public l0(x0 x0Var, i.a aVar, long j10, long j11, int i10, ExoPlaybackException exoPlaybackException, boolean z10, w7.o oVar, i8.m mVar, List<o7.a> list, i.a aVar2, boolean z11, int i11, m0 m0Var, long j12, long j13, long j14, boolean z12, boolean z13) {
        this.f16659a = x0Var;
        this.f16660b = aVar;
        this.f16661c = j10;
        this.d = j11;
        this.f16662e = i10;
        this.f16663f = exoPlaybackException;
        this.f16664g = z10;
        this.f16665h = oVar;
        this.f16666i = mVar;
        this.f16667j = list;
        this.f16668k = aVar2;
        this.f16669l = z11;
        this.f16670m = i11;
        this.n = m0Var;
        this.f16673q = j12;
        this.f16674r = j13;
        this.f16675s = j14;
        this.f16671o = z12;
        this.f16672p = z13;
    }

    public static l0 i(i8.m mVar) {
        x0 x0Var = x0.f16838a;
        i.a aVar = f16658t;
        return new l0(x0Var, aVar, -9223372036854775807L, 0L, 1, null, false, w7.o.f16943m, mVar, ImmutableList.w(), aVar, false, 0, m0.d, 0L, 0L, 0L, false, false);
    }

    public l0 a(i.a aVar) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, this.f16662e, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, aVar, this.f16669l, this.f16670m, this.n, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }

    public l0 b(i.a aVar, long j10, long j11, long j12, long j13, w7.o oVar, i8.m mVar, List<o7.a> list) {
        return new l0(this.f16659a, aVar, j11, j12, this.f16662e, this.f16663f, this.f16664g, oVar, mVar, list, this.f16668k, this.f16669l, this.f16670m, this.n, this.f16673q, j13, j10, this.f16671o, this.f16672p);
    }

    public l0 c(boolean z10) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, this.f16662e, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, this.f16669l, this.f16670m, this.n, this.f16673q, this.f16674r, this.f16675s, z10, this.f16672p);
    }

    public l0 d(boolean z10, int i10) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, this.f16662e, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, z10, i10, this.n, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }

    public l0 e(ExoPlaybackException exoPlaybackException) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, this.f16662e, exoPlaybackException, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, this.f16669l, this.f16670m, this.n, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }

    public l0 f(m0 m0Var) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, this.f16662e, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, this.f16669l, this.f16670m, m0Var, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }

    public l0 g(int i10) {
        return new l0(this.f16659a, this.f16660b, this.f16661c, this.d, i10, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, this.f16669l, this.f16670m, this.n, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }

    public l0 h(x0 x0Var) {
        return new l0(x0Var, this.f16660b, this.f16661c, this.d, this.f16662e, this.f16663f, this.f16664g, this.f16665h, this.f16666i, this.f16667j, this.f16668k, this.f16669l, this.f16670m, this.n, this.f16673q, this.f16674r, this.f16675s, this.f16671o, this.f16672p);
    }
}
