package t9;

import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import com.google.android.gms.internal.cast.zzju;
import j1.c0;
import j1.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f extends d3 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.l f15207a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<j1.k, Set<l.b>> f15208b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public g f15209c;

    public f(j1.l lVar, v8.c cVar) {
        this.f15207a = lVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 30) {
            boolean z10 = cVar.f16077z;
            boolean z11 = cVar.A;
            c0.a aVar = new c0.a();
            if (i10 >= 30) {
                aVar.f11141a = z10;
            }
            if (i10 >= 30) {
                aVar.f11142b = z11;
            }
            j1.c0 c0Var = new j1.c0(aVar);
            j1.l.b();
            l.e eVar = j1.l.d;
            j1.c0 c0Var2 = eVar.n;
            eVar.n = c0Var;
            if (eVar.f11284b) {
                if ((c0Var2 == null ? false : c0Var2.f11140c) != c0Var.f11140c) {
                    j1.e eVar2 = eVar.f11285c;
                    eVar2.f11219e = eVar.f11303w;
                    if (!eVar2.f11220f) {
                        eVar2.f11220f = true;
                        eVar2.f11218c.sendEmptyMessage(2);
                    }
                }
            }
            if (z10) {
                t0.b(zzju.CAST_OUTPUT_SWITCHER_ENABLED);
            }
            if (z11) {
                this.f15209c = new g();
                d dVar = new d(this.f15209c);
                j1.l.b();
                j1.l.d.y = dVar;
                t0.b(zzju.CAST_TRANSFER_TO_LOCAL_ENABLED);
            }
        }
    }

    public final void b1(MediaSessionCompat mediaSessionCompat) {
        Objects.requireNonNull(this.f15207a);
        if (j1.l.f11277c) {
            Log.d("MediaRouter", "addMediaSessionCompat: " + mediaSessionCompat);
        }
        l.e eVar = j1.l.d;
        eVar.B = mediaSessionCompat;
        l.e.d dVar = mediaSessionCompat != null ? new l.e.d(mediaSessionCompat) : null;
        l.e.d dVar2 = eVar.A;
        if (dVar2 != null) {
            dVar2.a();
        }
        eVar.A = dVar;
        if (dVar != null) {
            eVar.n();
        }
    }

    public final void c1(j1.k kVar, int i10) {
        for (l.b bVar : this.f15208b.get(kVar)) {
            this.f15207a.a(kVar, bVar, i10);
        }
    }

    public final void d1(j1.k kVar) {
        for (l.b bVar : this.f15208b.get(kVar)) {
            this.f15207a.i(bVar);
        }
    }
}
