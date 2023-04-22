package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class z0 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17908c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c1 f17909f;

    public /* synthetic */ z0(c1 c1Var, int i10) {
        this.f17908c = i10;
        this.f17909f = c1Var;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17908c) {
            case 0:
                c1 this$0 = this.f17909f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17691c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            default:
                c1 this$02 = this.f17909f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17691c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
        }
    }
}
