package y8;

import android.app.Activity;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.google.android.gms.internal.cast.zzju;
import h9.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import t9.t0;
import w8.g;

/* loaded from: classes2.dex */
public class b implements g.b, v8.h<v8.d> {

    /* renamed from: t  reason: collision with root package name */
    public static final a9.b f18546t = new a9.b("UIMediaController");

    /* renamed from: c  reason: collision with root package name */
    public final Activity f18547c;

    /* renamed from: f  reason: collision with root package name */
    public final v8.g f18548f;

    /* renamed from: j  reason: collision with root package name */
    public final Map<View, List<a>> f18549j = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public o3.d f18550m;
    public w8.g n;

    public b(Activity activity) {
        new HashSet();
        this.f18550m = new o3.d(5);
        this.f18547c = activity;
        v8.b d = v8.b.d(activity);
        t0.b(zzju.UI_MEDIA_CONTROLLER);
        v8.g b10 = d != null ? d.b() : null;
        this.f18548f = b10;
        if (b10 != null) {
            b10.a(this, v8.d.class);
            s(b10.c());
        }
    }

    @Override // v8.h
    public final /* bridge */ /* synthetic */ void a(v8.d dVar, int i10) {
    }

    @Override // w8.g.b
    public void b() {
        u();
    }

    @Override // w8.g.b
    public void c() {
        u();
    }

    @Override // w8.g.b
    public void d() {
        for (List<a> list : this.f18549j.values()) {
            for (a aVar : list) {
                aVar.c();
            }
        }
    }

    @Override // v8.h
    public final void e(v8.d dVar, int i10) {
        r();
    }

    @Override // v8.h
    public final void f(v8.d dVar, boolean z10) {
        s(dVar);
    }

    @Override // v8.h
    public final /* bridge */ /* synthetic */ void g(v8.d dVar) {
    }

    @Override // v8.h
    public final void h(v8.d dVar, String str) {
        s(dVar);
    }

    @Override // w8.g.b
    public void i() {
        u();
    }

    @Override // v8.h
    public final /* bridge */ /* synthetic */ void j(v8.d dVar, String str) {
    }

    @Override // v8.h
    public final /* bridge */ /* synthetic */ void k(v8.d dVar) {
    }

    @Override // v8.h
    public final void l(v8.d dVar, int i10) {
        r();
    }

    @Override // w8.g.b
    public void m() {
        u();
    }

    @Override // v8.h
    public final void n(v8.d dVar, int i10) {
        r();
    }

    @Override // w8.g.b
    public void o() {
        u();
    }

    public w8.g p() {
        o.d("Must be called from the main thread.");
        return this.n;
    }

    @EnsuresNonNullIf(expression = {"remoteMediaClient"}, result = ViewDataBinding.f1896i)
    public boolean q() {
        o.d("Must be called from the main thread.");
        return this.n != null;
    }

    public final void r() {
        if (q()) {
            this.f18550m.f13543c = null;
            for (List<a> list : this.f18549j.values()) {
                for (a aVar : list) {
                    aVar.e();
                }
            }
            Objects.requireNonNull(this.n, "null reference");
            w8.g gVar = this.n;
            Objects.requireNonNull(gVar);
            o.d("Must be called from the main thread.");
            gVar.f17013g.remove(this);
            this.n = null;
        }
    }

    public final void s(v8.f fVar) {
        if (!q() && fVar != null) {
            if (!fVar.c()) {
                return;
            }
            v8.d dVar = (v8.d) fVar;
            w8.g l10 = dVar.l();
            this.n = l10;
            if (l10 != null) {
                o.d("Must be called from the main thread.");
                l10.f17013g.add(this);
                Objects.requireNonNull(this.f18550m, "null reference");
                this.f18550m.f13543c = dVar.l();
                for (List<a> list : this.f18549j.values()) {
                    for (a aVar : list) {
                        aVar.d(dVar);
                    }
                }
                u();
            }
        }
    }

    public final void t(View view, a aVar) {
        if (this.f18548f == null) {
            return;
        }
        List<a> list = this.f18549j.get(view);
        if (list == null) {
            list = new ArrayList<>();
            this.f18549j.put(view, list);
        }
        list.add(aVar);
        if (q()) {
            v8.d c10 = this.f18548f.c();
            Objects.requireNonNull(c10, "null reference");
            aVar.d(c10);
            u();
        }
    }

    public final void u() {
        for (List<a> list : this.f18549j.values()) {
            for (a aVar : list) {
                aVar.b();
            }
        }
    }
}
