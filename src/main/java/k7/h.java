package k7;

import c7.j;
import c7.u;
import c7.w;
import k8.t;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import w6.y;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: b  reason: collision with root package name */
    public w f11910b;

    /* renamed from: c  reason: collision with root package name */
    public j f11911c;
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public long f11912e;

    /* renamed from: f  reason: collision with root package name */
    public long f11913f;

    /* renamed from: g  reason: collision with root package name */
    public long f11914g;

    /* renamed from: h  reason: collision with root package name */
    public int f11915h;

    /* renamed from: i  reason: collision with root package name */
    public int f11916i;

    /* renamed from: k  reason: collision with root package name */
    public long f11918k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f11919l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f11920m;

    /* renamed from: a  reason: collision with root package name */
    public final d f11909a = new d();

    /* renamed from: j  reason: collision with root package name */
    public b f11917j = new b();

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public y f11921a;

        /* renamed from: b  reason: collision with root package name */
        public f f11922b;
    }

    /* loaded from: classes2.dex */
    public static final class c implements f {
        public c(a aVar) {
        }

        @Override // k7.f
        public u a() {
            return new u.b(-9223372036854775807L, 0L);
        }

        @Override // k7.f
        public long b(c7.i iVar) {
            return -1L;
        }

        @Override // k7.f
        public void c(long j10) {
        }
    }

    public long a(long j10) {
        return (this.f11916i * j10) / 1000000;
    }

    public void b(long j10) {
        this.f11914g = j10;
    }

    public abstract long c(t tVar);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean d(t tVar, long j10, b bVar);

    public void e(boolean z10) {
        if (z10) {
            this.f11917j = new b();
            this.f11913f = 0L;
            this.f11915h = 0;
        } else {
            this.f11915h = 1;
        }
        this.f11912e = -1L;
        this.f11914g = 0L;
    }
}
