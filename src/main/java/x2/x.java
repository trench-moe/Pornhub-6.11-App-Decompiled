package x2;

import com.app.pornhub.domain.error.PornhubException;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17882c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m0 f17883f;

    public /* synthetic */ x(m0 m0Var, int i10) {
        this.f17882c = i10;
        this.f17883f = m0Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17882c) {
            case 0:
                m0 this$0 = this.f17883f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Throwable) obj) instanceof PornhubException) {
                    this$0.l();
                    return;
                }
                return;
            default:
                m0 this$02 = this.f17883f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar = this$02.f17799f;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
        }
    }
}
