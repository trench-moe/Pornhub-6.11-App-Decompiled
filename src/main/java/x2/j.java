package x2;

import com.app.pornhub.data.model.pornstar.PerformerResponse;
import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.repository.DataWrapper;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.login.SignupActivity;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17752c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17753f;

    public /* synthetic */ j(Object obj, int i10) {
        this.f17752c = i10;
        this.f17753f = obj;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17752c) {
            case 0:
                Collection categoryNames = (Collection) this.f17753f;
                DataWrapper wrapper = (DataWrapper) obj;
                Intrinsics.checkNotNullParameter(categoryNames, "$categoryNames");
                Intrinsics.checkNotNullParameter(wrapper, "wrapper");
                if (wrapper instanceof DataWrapper.Success) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (Iterable) ((DataWrapper.Success) wrapper).a()) {
                        if (categoryNames.contains(((Category) obj2).getName())) {
                            arrayList.add(obj2);
                        }
                    }
                    return arrayList;
                }
                return CollectionsKt.emptyList();
            case 1:
                m0 this$0 = (m0) this.f17753f;
                UserResponse it = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getUser() != null) {
                    this$0.f17807o = BuildConfig.FLAVOR;
                    return this$0.d.s(it.getUser());
                } else if (it.getError() != null) {
                    throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
                } else {
                    throw this$0.v("Couldn't perform 2FA. UserResponse object didn't contain any of expected data payload.");
                }
            case 2:
                o0 this$02 = (o0) this.f17753f;
                pe.a0 it2 = (pe.a0) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                return this$02.f17824c.j(this$02.d.a(it2.c()));
            case 3:
                t0 this$03 = (t0) this.f17753f;
                PerformerResponse it3 = (PerformerResponse) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                return this$03.f17860b.q(it3);
            case 4:
                return ((VideoDlService) this.f17753f).f4914f.a((String) obj).delay(1L, TimeUnit.SECONDS);
            default:
                CharSequence charSequence = (CharSequence) obj;
                int i10 = SignupActivity.S;
                return Boolean.valueOf(((SignupActivity) this.f17753f).I());
        }
    }
}
