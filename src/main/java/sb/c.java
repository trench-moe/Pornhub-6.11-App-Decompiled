package sb;

import android.util.Log;
import g4.g;
import java.util.concurrent.atomic.AtomicReference;
import mc.a;
import qb.q;
import xb.c0;

/* loaded from: classes2.dex */
public final class c implements sb.a {

    /* renamed from: c  reason: collision with root package name */
    public static final e f14941c = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final mc.a<sb.a> f14942a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<sb.a> f14943b = new AtomicReference<>(null);

    /* loaded from: classes2.dex */
    public static final class b implements e {
        public b(a aVar) {
        }
    }

    public c(mc.a<sb.a> aVar) {
        this.f14942a = aVar;
        ((q) aVar).a(new g(this));
    }

    @Override // sb.a
    public e a(String str) {
        sb.a aVar = this.f14943b.get();
        return aVar == null ? f14941c : aVar.a(str);
    }

    @Override // sb.a
    public boolean b() {
        sb.a aVar = this.f14943b.get();
        return aVar != null && aVar.b();
    }

    @Override // sb.a
    public void c(final String str, final String str2, final long j10, final c0 c0Var) {
        String l10 = a1.a.l("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", l10, null);
        }
        ((q) this.f14942a).a(new a.InterfaceC0215a() { // from class: sb.b
            @Override // mc.a.InterfaceC0215a
            public final void b(mc.b bVar) {
                ((a) bVar.get()).c(str, str2, j10, c0Var);
            }
        });
    }

    @Override // sb.a
    public boolean d(String str) {
        sb.a aVar = this.f14943b.get();
        return aVar != null && aVar.d(str);
    }
}
