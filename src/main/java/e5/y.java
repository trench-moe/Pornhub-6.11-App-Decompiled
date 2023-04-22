package e5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.view.home.HomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9117c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.app.pornhub.view.videodetails.c f9118f;

    public /* synthetic */ y(com.app.pornhub.view.videodetails.c cVar, int i10) {
        this.f9117c = i10;
        this.f9118f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9117c) {
            case 0:
                com.app.pornhub.view.videodetails.c cVar = this.f9118f;
                int i10 = com.app.pornhub.view.videodetails.c.C0;
                if (cVar.M0(true)) {
                    cVar.P0();
                    return;
                }
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar2 = this.f9118f;
                int i11 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar2);
                t3.a.y("video_category");
                Context q10 = cVar2.q();
                String slug = ((Category) view.getTag()).getSlug();
                Bundle bundle = new Bundle();
                bundle.putString("category_selection", slug);
                Intrinsics.checkNotNull(q10);
                FirebaseAnalytics.getInstance(q10).a(ExploreModel.CATEGORY, bundle);
                cVar2.I0(HomeActivity.D(cVar2.u0(), ((Category) view.getTag()).getName()));
                return;
        }
    }
}
