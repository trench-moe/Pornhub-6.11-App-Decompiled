package e5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.view.home.HomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9115c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.app.pornhub.view.videodetails.c f9116f;

    public /* synthetic */ x(com.app.pornhub.view.videodetails.c cVar, int i10) {
        this.f9115c = i10;
        this.f9116f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9115c) {
            case 0:
                com.app.pornhub.view.videodetails.c cVar = this.f9116f;
                int i10 = com.app.pornhub.view.videodetails.c.C0;
                if (cVar.M0(false)) {
                    cVar.O0();
                }
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar2 = this.f9116f;
                int i11 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar2);
                String str = (String) view.getTag();
                t3.a.y("video_tag");
                Context q10 = cVar2.q();
                Bundle bundle = new Bundle();
                bundle.putString("tag_name", str);
                Intrinsics.checkNotNull(q10);
                FirebaseAnalytics.getInstance(q10).a("video_tag_selection", bundle);
                cVar2.I0(HomeActivity.F(cVar2.u0(), str, R.id.videosFragment));
                return;
        }
    }
}
