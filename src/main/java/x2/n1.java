package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17817c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s1 f17818f;

    public /* synthetic */ n1(s1 s1Var, int i10) {
        this.f17817c = i10;
        this.f17818f = s1Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17817c) {
            case 0:
                s1 this$0 = this.f17818f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17854e;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                s1 this$02 = this.f17818f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17854e;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
