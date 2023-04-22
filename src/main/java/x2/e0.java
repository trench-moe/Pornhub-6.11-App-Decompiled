package x2;

import com.app.pornhub.data.model.user.UserResponse;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17714c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m0 f17715f;

    public /* synthetic */ e0(m0 m0Var, int i10) {
        this.f17714c = i10;
        this.f17715f = m0Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17714c) {
            case 0:
                m0 this$0 = this.f17715f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17799f;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                m0 this$02 = this.f17715f;
                UserResponse it2 = (UserResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                this$02.w(it2);
                return;
        }
    }
}
