package f4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.view.home.HomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9398c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f9399f;

    public /* synthetic */ f(n nVar, int i10) {
        this.f9398c = i10;
        this.f9399f = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9398c) {
            case 0:
                n nVar = this.f9399f;
                int i10 = n.E0;
                Objects.requireNonNull(nVar);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.SUBJECT", nVar.f9419v0.getGifMetaData().getTitle());
                intent.putExtra("android.intent.extra.TEXT", "http://www.pornhub.com/gif/view?id=" + nVar.f9419v0.getUserMetaData().getId());
                intent.setType("text/plain");
                nVar.I0(Intent.createChooser(intent, nVar.E().getText(R.string.share_gif)));
                t3.a.y("share_video");
                Context q10 = nVar.q();
                Bundle bundle = new Bundle();
                bundle.putString("share_platform", "share_video");
                Intrinsics.checkNotNull(q10);
                FirebaseAnalytics.getInstance(q10).a("video_share", bundle);
                return;
            default:
                n nVar2 = this.f9399f;
                int i11 = n.E0;
                Objects.requireNonNull(nVar2);
                nVar2.I0(HomeActivity.D(nVar2.u0(), ((Category) view.getTag()).getName()));
                return;
        }
    }
}
