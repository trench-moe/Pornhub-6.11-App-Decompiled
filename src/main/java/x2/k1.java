package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17774c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m1 f17775f;

    public /* synthetic */ k1(m1 m1Var, int i10) {
        this.f17774c = i10;
        this.f17775f = m1Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17774c) {
            case 0:
                m1 this$0 = this.f17775f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.d;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                m1 this$02 = this.f17775f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.d;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
