package v4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.view.offline.OfflineModeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f16013c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.app.pornhub.view.launch.a f16014f;

    public /* synthetic */ d(com.app.pornhub.view.launch.a aVar, int i10) {
        this.f16013c = i10;
        this.f16014f = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f16013c) {
            case 0:
                com.app.pornhub.view.launch.a aVar = this.f16014f;
                int i10 = com.app.pornhub.view.launch.a.f5378x0;
                Context q10 = aVar.q();
                int i11 = OfflineModeActivity.L;
                aVar.I0(new Intent(q10, OfflineModeActivity.class));
                aVar.n().finish();
                return;
            default:
                com.app.pornhub.view.launch.a aVar2 = this.f16014f;
                int i12 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar2);
                t3.a.y("update_retry");
                Context q11 = aVar2.q();
                Bundle bundle = new Bundle();
                bundle.putString("update_event", "update_retry");
                Intrinsics.checkNotNull(q11);
                FirebaseAnalytics.getInstance(q11).a("update", bundle);
                aVar2.O0(R.string.update_check);
                aVar2.f5381r0.f4647c.setVisibility(8);
                aVar2.f5381r0.f4648e.setVisibility(0);
                aVar2.f5381r0.f4655l.setVisibility(4);
                aVar2.f5381r0.f4646b.setVisibility(4);
                aVar2.P0(false);
                aVar2.f5380q0.c();
                t3.a.A(aVar2.q(), "update_launch");
                aVar2.f5381r0.d.setVisibility(8);
                aVar2.f5381r0.f4649f.setVisibility(8);
                return;
        }
    }
}
