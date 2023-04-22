package h4;

import android.view.View;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.offline.PopupSource;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10116c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AccountFragment f10117f;

    public /* synthetic */ c(AccountFragment accountFragment, int i10) {
        this.f10116c = i10;
        this.f10117f = accountFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10116c) {
            case 0:
                AccountFragment this$0 = this.f10117f;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P0("login");
                this$0.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_loginFragment)));
                return;
            case 1:
                AccountFragment this$02 = this.f10117f;
                KProperty<Object>[] kPropertyArr2 = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.P0("offline_videos");
                this$02.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.a(PopupSource.SETTINGS_SCREEN)));
                return;
            default:
                AccountFragment this$03 = this.f10117f;
                KProperty<Object>[] kPropertyArr3 = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                NavigationViewModel N0 = this$03.N0();
                UserMetaData userMetaData = N0.f5037i;
                if (userMetaData == null) {
                    return;
                }
                N0.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.g(userMetaData.getId(), userMetaData.getUsername())));
                return;
        }
    }
}
