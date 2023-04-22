package h4;

import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.home.account.AccountFragment;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10118a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10119b;

    public /* synthetic */ d(Fragment fragment, int i10) {
        this.f10118a = i10;
        this.f10119b = fragment;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f10118a) {
            case 0:
                AccountFragment this$0 = (AccountFragment) this.f10119b;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                j O0 = this$0.O0();
                Objects.requireNonNull(O0);
                O0.f10131i.a(z10 ? UserOrientation.Gay.INSTANCE : UserOrientation.Straight.INSTANCE);
                Context context = this$0.u0();
                Intrinsics.checkNotNullExpressionValue(context, "requireContext()");
                Intrinsics.checkNotNullParameter(context, "context");
                t3.g.n(context, "phapp_account_orientation_change", "account_orientation", z10 ? "gay" : "straight");
                return;
            default:
                ((com.app.pornhub.view.videodetails.a) this.f10119b).G0 = !z10;
                return;
        }
    }
}
