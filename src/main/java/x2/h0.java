package x2;

import com.app.pornhub.data.model.user.UserResponse;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.user.UserMetaData;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17737c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m0 f17738f;

    public /* synthetic */ h0(m0 m0Var, int i10) {
        this.f17737c = i10;
        this.f17738f = m0Var;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17737c) {
            case 0:
                m0 this$0 = this.f17738f;
                UserResponse it = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    if (it.getAdditionalSecurity() != null) {
                        this$0.f17807o = it.getAdditionalSecurity().getToken();
                        throw new PornhubException(114, it.getAdditionalSecurity().getPhoneNumber());
                    } else if (it.getUser() != null) {
                        this$0.w(it);
                        return this$0.d.s(it.getUser());
                    } else {
                        throw this$0.v("Couldn't perform login. UserResponse object didn't contain any of expected elements.");
                    }
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            default:
                m0 this$02 = this.f17738f;
                UserMetaData it2 = (UserMetaData) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                return this$02.u(it2);
        }
    }
}
