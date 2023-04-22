package x2;

import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.user.UserMetaData;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17731c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m0 f17732f;

    public /* synthetic */ g0(m0 m0Var, int i10) {
        this.f17731c = i10;
        this.f17732f = m0Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17731c) {
            case 0:
                m0 this$0 = this.f17732f;
                UserMetaData it = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                UserMetaData userMetaData = this$0.f17804k;
                if (userMetaData == null) {
                    this$0.f17804k = it;
                    this$0.f17805l.onNext(OptionalKt.asOptional(it));
                } else {
                    Intrinsics.checkNotNull(userMetaData);
                    boolean z10 = !Intrinsics.areEqual(userMetaData.getUserType(), it.getUserType());
                    this$0.f17804k = it;
                    if (z10) {
                        this$0.f17805l.onNext(OptionalKt.asOptional(it));
                    }
                }
                this$0.y();
                return this$0.f17804k;
            default:
                m0 this$02 = this.f17732f;
                UserResponse it2 = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getUser() != null) {
                    return this$02.d.s(it2.getUser());
                }
                if (it2.getError() != null) {
                    throw new PornhubException(it2.getError().getCode(), it2.getError().getMessage());
                }
                throw this$02.v("Couldn't perform sign-up. The UserResponse object didn't contain any of expected data elements.");
        }
    }
}
