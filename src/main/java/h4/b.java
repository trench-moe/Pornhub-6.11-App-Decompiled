package h4;

import android.content.Context;
import android.view.View;
import com.app.pornhub.R;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10114c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ AccountFragment f10115f;

    public /* synthetic */ b(AccountFragment accountFragment, int i10) {
        this.f10114c = i10;
        this.f10115f = accountFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10114c) {
            case 0:
                AccountFragment this$0 = this.f10115f;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P0("sign_up");
                this$0.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_signupActivity)));
                return;
            case 1:
                AccountFragment this$02 = this.f10115f;
                KProperty<Object>[] kPropertyArr2 = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.P0("sign_out");
                Context u02 = this$02.u0();
                Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
                t3.g.b(u02, this$02.O0().f10128f.a());
                this$02.O0().f10130h.f9386a.l();
                return;
            default:
                AccountFragment this$03 = this.f10115f;
                KProperty<Object>[] kPropertyArr3 = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.N0().w();
                return;
        }
    }
}
