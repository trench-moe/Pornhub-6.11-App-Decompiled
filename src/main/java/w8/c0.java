package w8;

import java.util.HashSet;
import java.util.Set;
import w8.g;

/* loaded from: classes2.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g.d> f16959a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final long f16960b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f16961c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f16962e;

    public c0(g gVar, long j10) {
        this.f16962e = gVar;
        this.f16960b = j10;
        this.f16961c = new b0(this, gVar);
    }

    public final void a() {
        this.f16962e.f17009b.removeCallbacks(this.f16961c);
        this.d = true;
        this.f16962e.f17009b.postDelayed(this.f16961c, this.f16960b);
    }
}
