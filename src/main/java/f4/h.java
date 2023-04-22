package f4;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.view.home.HomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9402c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f9403f;

    public /* synthetic */ h(n nVar, int i10) {
        this.f9402c = i10;
        this.f9403f = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9402c) {
            case 0:
                n nVar = this.f9403f;
                if (!UsersConfig.isUserLoggedIn(nVar.f9413p0.a())) {
                    new b4.e(nVar.u0()).show();
                    return;
                }
                Map<String, String> flagTypes = nVar.f9419v0.getFlagTypes();
                String str = p4.d.G0;
                String[] strArr = new String[flagTypes.size()];
                flagTypes.values().toArray(strArr);
                Bundle bundle = new Bundle();
                bundle.putStringArray("flag_options", strArr);
                p4.d dVar = new p4.d();
                dVar.A0(bundle);
                dVar.G0(nVar, 1634);
                dVar.Q0(nVar.n().u(), p4.d.G0);
                return;
            default:
                n nVar2 = this.f9403f;
                int i10 = n.E0;
                Objects.requireNonNull(nVar2);
                String str2 = (String) view.getTag();
                t3.a.y("gif_tag");
                Context q10 = nVar2.q();
                Bundle bundle2 = new Bundle();
                bundle2.putString("tag_name", str2);
                Intrinsics.checkNotNull(q10);
                FirebaseAnalytics.getInstance(q10).a("video_tag_selection", bundle2);
                nVar2.I0(HomeActivity.F(nVar2.u0(), str2, R.id.gifsFragment));
                return;
        }
    }
}
