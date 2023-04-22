package g4;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.launch.AccountExpiredActivity;
import com.app.pornhub.view.launch.LaunchViewModel;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import m.b;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements androidx.lifecycle.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f9731a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9732b;

    public /* synthetic */ d(Ref.ObjectRef objectRef, HomeActivity homeActivity) {
        this.f9731a = objectRef;
        this.f9732b = homeActivity;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [T, com.app.pornhub.view.launch.LaunchViewModel$UpdateState] */
    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        Intent intent;
        Ref.ObjectRef updateState = this.f9731a;
        HomeActivity this$0 = this.f9732b;
        ?? r10 = (LaunchViewModel.UpdateState) obj;
        int i10 = HomeActivity.f4998a0;
        Intrinsics.checkNotNullParameter(updateState, "$updateState");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        updateState.element = r10;
        boolean z10 = r10 instanceof LaunchViewModel.UpdateState.b;
        if (1 == 0) {
            Objects.requireNonNull(this$0);
            String simpleName = Reflection.getOrCreateKotlinClass(com.app.pornhub.view.launch.a.class).getSimpleName();
            if (this$0.u().I(simpleName) == null) {
                this$0.setContentView(R.layout.activity_launch);
                com.app.pornhub.view.launch.a aVar = new com.app.pornhub.view.launch.a();
                Intrinsics.checkNotNullExpressionValue(aVar, "newInstance()");
                androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(this$0.u());
                aVar2.i(R.id.container_main, aVar, simpleName);
                aVar2.d();
                return;
            }
            return;
        }
        LaunchViewModel launchViewModel = this$0.L;
        LaunchViewModel launchViewModel2 = null;
        if (launchViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("launchViewModel");
            launchViewModel = null;
        }
        Objects.requireNonNull(launchViewModel);
        boolean z11 = false;
        if (UsersConfig.Companion.isPremiumExpired(launchViewModel.d()) && !launchViewModel.f5368f.getBoolean("remember_choice", false)) {
            z11 = true;
        }
        if (z11) {
            intent = new Intent(this$0, AccountExpiredActivity.class);
            intent.addFlags(268435456);
        } else {
            intent = null;
        }
        if (intent != null) {
            this$0.startActivity(intent);
        }
        this$0.M();
        LaunchViewModel launchViewModel3 = this$0.L;
        if (launchViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("launchViewModel");
        } else {
            launchViewModel2 = launchViewModel3;
        }
        androidx.lifecycle.p<LaunchViewModel.UpdateState> pVar = launchViewModel2.n;
        Objects.requireNonNull(pVar);
        LiveData.a("removeObservers");
        Iterator<Map.Entry<androidx.lifecycle.q<? super LaunchViewModel.UpdateState>, LiveData<LaunchViewModel.UpdateState>.c>> it = pVar.f2335b.iterator();
        while (true) {
            while (true) {
                b.e eVar = (b.e) it;
                if (!eVar.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((LiveData.c) entry.getValue()).j(this$0)) {
                    pVar.k((androidx.lifecycle.q) entry.getKey());
                }
            }
        }
    }
}
