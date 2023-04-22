package x2;

import com.app.pornhub.data.model.user.SubscribersResponse;
import com.app.pornhub.data.model.user.SubscriptionsResponse;
import com.app.pornhub.domain.error.PornhubException;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l1 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17791c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m1 f17792f;

    public /* synthetic */ l1(m1 m1Var, int i10) {
        this.f17791c = i10;
        this.f17792f = m1Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17791c) {
            case 0:
                m1 this$0 = this.f17792f;
                SubscriptionsResponse it = (SubscriptionsResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    return this$0.f17811c.t(it.getSubscriptions());
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            default:
                m1 this$02 = this.f17792f;
                SubscribersResponse it2 = (SubscribersResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getError() == null) {
                    return this$02.f17811c.t(it2.getSubscribers());
                }
                throw new PornhubException(it2.getError().getCode(), it2.getError().getMessage());
        }
    }
}
