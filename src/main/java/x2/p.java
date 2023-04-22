package x2;

import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17828c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f17829f;

    public /* synthetic */ p(w wVar, int i10) {
        this.f17828c = i10;
        this.f17829f = wVar;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f17828c) {
            case 0:
                w this$0 = this.f17829f;
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                y2.a aVar = this$0.f17877c;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                throw aVar.a(it);
            case 1:
                w this$02 = this.f17829f;
                Throwable it2 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                y2.a aVar2 = this$02.f17877c;
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                throw aVar2.a(it2);
            default:
                w this$03 = this.f17829f;
                Throwable it3 = (Throwable) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                y2.a aVar3 = this$03.f17877c;
                Intrinsics.checkNotNullExpressionValue(it3, "it");
                throw aVar3.a(it3);
        }
    }
}
