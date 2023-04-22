package j4;

import com.app.pornhub.R;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.categories.b;
import com.app.pornhub.view.login.LoginFragment;
import io.reactivex.functions.BiFunction;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11376c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f11377f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f11376c = i10;
        this.f11377f = obj;
    }

    @Override // io.reactivex.functions.BiFunction
    public final Object apply(Object obj, Object obj2) {
        boolean z10 = false;
        switch (this.f11376c) {
            case 0:
                com.app.pornhub.view.home.categories.b this$0 = (com.app.pornhub.view.home.categories.b) this.f11377f;
                UseCaseResult topCategoriesResult = (UseCaseResult) obj;
                UseCaseResult allCategoriesResult = (UseCaseResult) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(topCategoriesResult, "topCategoriesResult");
                Intrinsics.checkNotNullParameter(allCategoriesResult, "allCategoriesResult");
                this$0.f5121j.l(new z3.a<>(new b.a.d(((topCategoriesResult instanceof UseCaseResult.a) || (allCategoriesResult instanceof UseCaseResult.a)) ? true : true)));
                if (topCategoriesResult instanceof UseCaseResult.Failure) {
                    throw ((UseCaseResult.Failure) topCategoriesResult).a();
                }
                if (allCategoriesResult instanceof UseCaseResult.Failure) {
                    throw ((UseCaseResult.Failure) allCategoriesResult).a();
                }
                return ((topCategoriesResult instanceof UseCaseResult.Result) && (allCategoriesResult instanceof UseCaseResult.Result)) ? TuplesKt.to((List) ((UseCaseResult.Result) topCategoriesResult).a(), (List) ((UseCaseResult.Result) allCategoriesResult).a()) : TuplesKt.to(CollectionsKt.emptyList(), CollectionsKt.emptyList());
            default:
                LoginFragment loginFragment = (LoginFragment) this.f11377f;
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                loginFragment.f5389r0.f4611h.setEnabled(bool.booleanValue() && bool2.booleanValue());
                int b10 = c0.a.b(loginFragment.u0(), (bool.booleanValue() && bool2.booleanValue()) ? R.color.orange : R.color.pornhub_grey_light);
                int b11 = c0.a.b(loginFragment.u0(), (bool.booleanValue() && bool2.booleanValue()) ? R.color.black : R.color.pornhub_txt_grey);
                loginFragment.f5389r0.f4611h.setBackgroundColor(b10);
                loginFragment.f5389r0.f4611h.setTextColor(b11);
                if (bool.booleanValue() && bool2.booleanValue()) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
        }
    }
}
