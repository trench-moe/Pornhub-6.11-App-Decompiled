package e9;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b1 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final z0 f9159c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f9160f;

    public b1(c1 c1Var, z0 z0Var) {
        this.f9160f = c1Var;
        this.f9159c = z0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f9160f.f9166f) {
            c9.b bVar = this.f9159c.f9272b;
            if (bVar.p0()) {
                c1 c1Var = this.f9160f;
                f fVar = c1Var.f6862c;
                Activity a10 = c1Var.a();
                PendingIntent pendingIntent = bVar.f3859j;
                Objects.requireNonNull(pendingIntent, "null reference");
                int i10 = this.f9159c.f9271a;
                int i11 = GoogleApiActivity.f6851f;
                Intent intent = new Intent(a10, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", false);
                fVar.startActivityForResult(intent, 1);
                return;
            }
            c1 c1Var2 = this.f9160f;
            if (c1Var2.n.a(c1Var2.a(), bVar.f3858f, null) != null) {
                c1 c1Var3 = this.f9160f;
                c9.e eVar = c1Var3.n;
                Activity a11 = c1Var3.a();
                c1 c1Var4 = this.f9160f;
                eVar.i(a11, c1Var4.f6862c, bVar.f3858f, c1Var4);
            } else if (bVar.f3858f != 18) {
                this.f9160f.i(bVar, this.f9159c.f9271a);
            } else {
                c1 c1Var5 = this.f9160f;
                c9.e eVar2 = c1Var5.n;
                Activity a12 = c1Var5.a();
                c1 c1Var6 = this.f9160f;
                Objects.requireNonNull(eVar2);
                ProgressBar progressBar = new ProgressBar(a12, null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(a12);
                builder.setView(progressBar);
                builder.setMessage(h9.w.b(a12, 18));
                builder.setPositiveButton(BuildConfig.FLAVOR, (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                eVar2.g(a12, create, "GooglePlayServicesUpdatingDialog", c1Var6);
                c1 c1Var7 = this.f9160f;
                c9.e eVar3 = c1Var7.n;
                Context applicationContext = c1Var7.a().getApplicationContext();
                a1 a1Var = new a1(this, create);
                Objects.requireNonNull(eVar3);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                e0 e0Var = new e0(a1Var);
                applicationContext.registerReceiver(e0Var, intentFilter);
                e0Var.f9178a = applicationContext;
                if (c9.h.b(applicationContext, "com.google.android.gms")) {
                    return;
                }
                this.f9160f.j();
                if (create.isShowing()) {
                    create.dismiss();
                }
                e0Var.a();
            }
        }
    }
}
