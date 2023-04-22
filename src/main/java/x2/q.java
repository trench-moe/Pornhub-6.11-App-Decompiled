package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17834c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f17835f;

    public /* synthetic */ q(w wVar, int i10) {
        this.f17834c = i10;
        this.f17835f = wVar;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17834c) {
            case 0:
                w this$0 = this.f17835f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17877c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                w this$02 = this.f17835f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17877c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
