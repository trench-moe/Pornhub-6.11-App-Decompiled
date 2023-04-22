package f4;

import android.view.View;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.user.ProfileActivity;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9400c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f9401f;

    public /* synthetic */ g(n nVar, int i10) {
        this.f9400c = i10;
        this.f9401f = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9400c) {
            case 0:
                n nVar = this.f9401f;
                if (!t3.l.d(nVar.f9419v0.getUserMetaData())) {
                    nVar.I0(ProfileActivity.C(nVar.q(), nVar.f9419v0.getUserMetaData()));
                }
                return;
            default:
                n nVar2 = this.f9401f;
                int i10 = n.E0;
                Objects.requireNonNull(nVar2);
                nVar2.I0(PerformerActivity.C(nVar2.q(), ((String) view.getTag()).replaceAll(" ", "-"), PerformersConfig.PerformerType.Pornstar.INSTANCE));
                return;
        }
    }
}
