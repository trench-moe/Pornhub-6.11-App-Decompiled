package p8;

import a9.d0;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbi;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import u8.e;
import u8.k0;
import u8.l0;

/* loaded from: classes2.dex */
public final class r implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13864c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f13865f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f13866j;

    public r(w wVar, o oVar) {
        this.f13866j = wVar;
        this.f13865f = oVar;
    }

    public /* synthetic */ r(k0 k0Var, d0 d0Var) {
        this.f13865f = k0Var;
        this.f13866j = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f13864c) {
            case 0:
                o oVar = (o) this.f13865f;
                j jVar = oVar.f13854a;
                Objects.requireNonNull(jVar);
                zzbe zzbeVar = (zzbe) oVar.a(zzbe.class);
                if (TextUtils.isEmpty(zzbeVar.zze())) {
                    zzbeVar.zzj(jVar.d.zzi().zzb());
                }
                if (jVar.f13846e && TextUtils.isEmpty(zzbeVar.zzd())) {
                    zzbi zze = jVar.d.zze();
                    zzbeVar.zzi(zze.zza());
                    zzbeVar.zzh(zze.zzb());
                }
                for (x xVar : ((w) this.f13866j).f13872b) {
                    xVar.zza();
                }
                o oVar2 = (o) this.f13865f;
                h9.o.g("deliver should be called from worker thread");
                h9.o.b(oVar2.f13856c, "Measurement must be submitted");
                List<y> list = oVar2.f13863k;
                if (!list.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    while (true) {
                        for (y yVar : list) {
                            Uri zzb = yVar.zzb();
                            if (!hashSet.contains(zzb)) {
                                hashSet.add(zzb);
                                yVar.a(oVar2);
                            }
                        }
                        return;
                        break;
                    }
                } else {
                    return;
                }
            default:
                d0 d0Var = (d0) this.f13866j;
                l0 l0Var = ((k0) this.f13865f).f15703a;
                a9.b bVar = l0.G;
                u8.d dVar = d0Var.f275m;
                if (!a9.a.h(dVar, l0Var.f15720t)) {
                    l0Var.f15720t = dVar;
                    l0Var.D.c(dVar);
                }
                double d = d0Var.f272c;
                if (Double.isNaN(d) || Math.abs(d - l0Var.f15722v) <= 1.0E-7d) {
                    z10 = false;
                } else {
                    l0Var.f15722v = d;
                    z10 = true;
                }
                boolean z13 = d0Var.f273f;
                if (z13 != l0Var.f15723w) {
                    l0Var.f15723w = z13;
                    z10 = true;
                }
                a9.b bVar2 = l0.G;
                bVar2.a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(l0Var.f15714m));
                e.c cVar = l0Var.D;
                if (cVar != null) {
                    if (!z10) {
                        if (l0Var.f15714m) {
                        }
                    }
                    cVar.f();
                }
                Double.isNaN(d0Var.f277u);
                int i10 = d0Var.f274j;
                if (i10 != l0Var.f15724x) {
                    l0Var.f15724x = i10;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(l0Var.f15714m));
                e.c cVar2 = l0Var.D;
                if (cVar2 != null && (z11 || l0Var.f15714m)) {
                    cVar2.a(l0Var.f15724x);
                }
                int i11 = d0Var.n;
                if (i11 != l0Var.y) {
                    l0Var.y = i11;
                    z12 = true;
                } else {
                    z12 = false;
                }
                bVar2.a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(l0Var.f15714m));
                e.c cVar3 = l0Var.D;
                if (cVar3 != null) {
                    if (!z12) {
                        if (l0Var.f15714m) {
                        }
                    }
                    cVar3.e(l0Var.y);
                }
                if (!a9.a.h(l0Var.f15725z, d0Var.f276t)) {
                    l0Var.f15725z = d0Var.f276t;
                }
                l0Var.f15714m = false;
                return;
        }
    }
}
