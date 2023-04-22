package h4;

import android.content.Context;
import android.widget.CompoundButton;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.launch.AccountExpiredActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10120a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10121b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f10120a = i10;
        this.f10121b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f10120a) {
            case 0:
                AccountFragment this$0 = (AccountFragment) this.f10121b;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                f3.a aVar = this$0.O0().f10133k;
                aVar.f9369a.b(aVar.f9369a.f().changeAutoPlayEnabled(z10));
                Context context = this$0.u0();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                Intrinsics.checkNotNullParameter(context, "context");
                t3.g.n(context, "phapp_account_auto_play_change", "account_auto_play", z10 ? "on" : "off");
                return;
            default:
                ((AccountExpiredActivity) this.f10121b).J.edit().putBoolean("remember_choice", z10).apply();
                return;
        }
    }
}
