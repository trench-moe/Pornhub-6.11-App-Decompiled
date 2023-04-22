package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17898c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f17899f;

    public /* synthetic */ y0(c1 c1Var, int i10) {
        this.f17898c = i10;
        this.f17899f = c1Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17898c) {
            case 0:
                c1 this$0 = this.f17899f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17691c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                c1 this$02 = this.f17899f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17691c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
