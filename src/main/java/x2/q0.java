package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class q0 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17836c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ r0 f17837f;

    public /* synthetic */ q0(r0 r0Var, int i10) {
        this.f17836c = i10;
        this.f17837f = r0Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17836c) {
            case 0:
                r0 this$0 = this.f17837f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17844c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                r0 this$02 = this.f17837f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17844c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
