package e5;

import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9113c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.app.pornhub.view.videodetails.c f9114f;

    public /* synthetic */ w(com.app.pornhub.view.videodetails.c cVar, int i10) {
        this.f9113c = i10;
        this.f9114f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9113c) {
            case 0:
                com.app.pornhub.view.videodetails.c cVar = this.f9114f;
                if (UsersConfig.isUserLoggedIn(cVar.f5594p0.a())) {
                    cVar.N0(!cVar.f5600v0);
                    return;
                }
                b4.d dVar = new b4.d(cVar.n(), cVar.I(R.string.dialog_fav_video_add));
                dVar.f3563j = new g4.n(cVar);
                dVar.show();
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar2 = this.f9114f;
                int i10 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar2);
                cVar2.I0(PerformerActivity.C(cVar2.q(), (String) view.getTag(), PerformersConfig.PerformerType.Pornstar.INSTANCE));
                return;
        }
    }
}
