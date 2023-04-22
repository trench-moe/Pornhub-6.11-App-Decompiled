package w9;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.zzfj;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g1 extends u1 {
    public final /* synthetic */ Context n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ Bundle f17162t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ a2 f17163u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(a2 a2Var, String str, String str2, Context context, Bundle bundle) {
        super(a2Var, true);
        this.f17163u = a2Var;
        this.n = context;
        this.f17162t = bundle;
    }

    @Override // w9.u1
    public final void a() {
        p0 p0Var;
        try {
            Objects.requireNonNull(this.n, "null reference");
            a2 a2Var = this.f17163u;
            Context context = this.n;
            Objects.requireNonNull(a2Var);
            try {
                p0Var = o0.asInterface(DynamiteModule.c(context, DynamiteModule.f6873c, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (DynamiteModule.LoadingException e10) {
                a2Var.e(e10, true, false);
                p0Var = null;
            }
            a2Var.f17064g = p0Var;
            if (this.f17163u.f17064g == null) {
                Objects.requireNonNull(this.f17163u);
                Log.w("FA", "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.n, ModuleDescriptor.MODULE_ID);
            int d = DynamiteModule.d(this.n, ModuleDescriptor.MODULE_ID, false);
            y0 y0Var = new y0(55005L, Math.max(a10, d), d < a10, null, null, null, this.f17162t, zzfj.zza(this.n));
            p0 p0Var2 = this.f17163u.f17064g;
            Objects.requireNonNull(p0Var2, "null reference");
            p0Var2.initialize(new n9.b(this.n), y0Var, this.f17312c);
        } catch (Exception e11) {
            this.f17163u.e(e11, true, false);
        }
    }
}
