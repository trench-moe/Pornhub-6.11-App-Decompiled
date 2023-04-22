package nb;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzgr;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import w9.a1;
import w9.a2;
import w9.b1;
import w9.d1;
import w9.h1;
import w9.k1;
import w9.l0;
import w9.q1;

/* loaded from: classes2.dex */
public final class a implements zzhx {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a2 f13418a;

    public a(a2 a2Var) {
        this.f13418a = a2Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final int zza(String str) {
        return this.f13418a.g(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final long zzb() {
        return this.f13418a.h();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final Object zzg(int i10) {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        l0 l0Var = new l0();
        a2Var.f17059a.execute(new q1(a2Var, l0Var, i10));
        return l0.c1(l0Var.a1(15000L), Object.class);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzh() {
        return this.f13418a.k();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzi() {
        return this.f13418a.l();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzj() {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        l0 l0Var = new l0();
        a2Var.f17059a.execute(new k1(a2Var, l0Var));
        return l0Var.b1(500L);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final String zzk() {
        return this.f13418a.m();
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final List zzm(String str, String str2) {
        return this.f13418a.n(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final Map zzo(String str, String str2, boolean z10) {
        return this.f13418a.o(str, str2, z10);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzp(String str) {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new h1(a2Var, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzq(String str, String str2, Bundle bundle) {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new b1(a2Var, str, str2, bundle));
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzr(String str) {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new d1(a2Var, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzs(String str, String str2, Bundle bundle) {
        this.f13418a.f(str, str2, bundle, true, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzt(String str, String str2, Bundle bundle, long j10) {
        this.f13418a.f(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzu(zzgs zzgsVar) {
        this.f13418a.a(zzgsVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzv(Bundle bundle) {
        a2 a2Var = this.f13418a;
        Objects.requireNonNull(a2Var);
        a2Var.f17059a.execute(new a1(a2Var, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzw(zzgr zzgrVar) {
        this.f13418a.b(zzgrVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzhx
    public final void zzx(zzgs zzgsVar) {
        this.f13418a.d(zzgsVar);
    }
}
