package p8;

import com.google.android.gms.internal.gtm.zzbv;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final w f13843a;

    /* renamed from: b  reason: collision with root package name */
    public final o f13844b;

    /* renamed from: c  reason: collision with root package name */
    public final List<p> f13845c;
    public final zzbv d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f13846e;

    public j(zzbv zzbvVar) {
        w zzd = zzbvVar.zzd();
        l9.b zzr = zzbvVar.zzr();
        Objects.requireNonNull(zzd, "null reference");
        this.f13843a = zzd;
        this.f13845c = new ArrayList();
        o oVar = new o(this, zzr);
        oVar.f13861i = true;
        this.f13844b = oVar;
        this.d = zzbvVar;
    }
}
