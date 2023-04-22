package p8;

import android.text.TextUtils;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfs;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class z implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f13875c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f13876f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ long f13877j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ boolean f13878m;
    public final /* synthetic */ boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ String f13879t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ i f13880u;

    public z(i iVar, Map map, boolean z10, String str, long j10, boolean z11, boolean z12, String str2) {
        this.f13880u = iVar;
        this.f13875c = map;
        this.f13876f = str;
        this.f13877j = j10;
        this.f13878m = z11;
        this.n = z12;
        this.f13879t = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        double d;
        a0 a0Var = this.f13880u.d;
        synchronized (a0Var) {
            z10 = a0Var.d;
            a0Var.d = false;
        }
        if (z10) {
            this.f13875c.put("sc", "start");
        }
        Map map = this.f13875c;
        c zzp = this.f13880u.zzp();
        h9.o.g("getClientId can not be called from the main thread");
        String zzb = zzp.d.zzi().zzb();
        if (zzb != null && TextUtils.isEmpty((CharSequence) map.get("cid"))) {
            map.put("cid", zzb);
        }
        String str = (String) this.f13875c.get("sf");
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (zzfs.zzj(d, (String) this.f13875c.get("cid"))) {
                this.f13880u.zzG("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        this.f13880u.zzr();
        this.f13875c.remove("ate");
        this.f13875c.remove("adid");
        zzav zza = this.f13880u.zzu().zza();
        zzfs.zzg(this.f13875c, "an", zza.zzf());
        zzfs.zzg(this.f13875c, "av", zza.zzg());
        zzfs.zzg(this.f13875c, "aid", zza.zzd());
        zzfs.zzg(this.f13875c, "aiid", zza.zze());
        this.f13875c.put("v", "1");
        this.f13875c.put("_v", zzbt.zzb);
        zzfs.zzg(this.f13875c, "ul", this.f13880u.zzx().zza().zzd());
        zzfs.zzg(this.f13875c, "sr", this.f13880u.zzx().zzb());
        if (!this.f13876f.equals("transaction") && !this.f13876f.equals("item") && !this.f13880u.f13840c.zza()) {
            this.f13880u.zzz().zzc(this.f13875c, "Too many hits sent too quickly, rate limiting invoked");
            return;
        }
        long zza2 = zzfs.zza((String) this.f13875c.get("ht"));
        if (zza2 == 0) {
            zza2 = this.f13877j;
        }
        long j10 = zza2;
        if (this.f13878m) {
            this.f13880u.zzz().zzN("Dry run enabled. Would have sent hit", new zzex(this.f13880u, this.f13875c, j10, this.n));
            return;
        }
        String str2 = (String) this.f13875c.get("cid");
        HashMap hashMap = new HashMap();
        zzfs.zzh(hashMap, "uid", this.f13875c);
        zzfs.zzh(hashMap, "an", this.f13875c);
        zzfs.zzh(hashMap, "aid", this.f13875c);
        zzfs.zzh(hashMap, "av", this.f13875c);
        zzfs.zzh(hashMap, "aiid", this.f13875c);
        Objects.requireNonNull(str2, "null reference");
        this.f13875c.put("_s", String.valueOf(this.f13880u.zzs().zza(new zzbx(0L, str2, this.f13879t, !TextUtils.isEmpty((CharSequence) this.f13875c.get("adid")), 0L, hashMap))));
        this.f13880u.zzs().zzh(new zzex(this.f13880u, this.f13875c, j10, this.n));
    }
}
