package p8;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzbs;
import com.google.android.gms.internal.gtm.zzbv;

/* loaded from: classes2.dex */
public final class a0 extends zzbs {

    /* renamed from: a  reason: collision with root package name */
    public boolean f13821a;

    /* renamed from: b  reason: collision with root package name */
    public int f13822b;

    /* renamed from: c  reason: collision with root package name */
    public long f13823c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public long f13824e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f13825f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i iVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.f13825f = iVar;
        this.f13823c = -1L;
    }

    public final void c() {
        if (this.f13823c < 0 && !this.f13821a) {
            c zzp = zzp();
            zzp.f13832g.remove(this.f13825f.d);
            return;
        }
        c zzp2 = zzp();
        zzp2.f13832g.add(this.f13825f.d);
        Context zza = zzp2.d.zza();
        if (zza instanceof Application) {
            Application application = (Application) zza;
            if (!zzp2.f13833h) {
                application.registerActivityLifecycleCallbacks(new l(zzp2));
                zzp2.f13833h = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
    }
}
