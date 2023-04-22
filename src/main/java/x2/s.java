package x2;

import com.app.pornhub.data.model.comments.CommentActionResponse;
import com.app.pornhub.domain.error.OperationException;
import io.reactivex.functions.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17847c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f17848f;

    public /* synthetic */ s(w wVar, int i10) {
        this.f17847c = i10;
        this.f17848f = wVar;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17847c) {
            case 0:
                w this$0 = this.f17848f;
                CommentActionResponse it = (CommentActionResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    return this$0.f17876b.f(it);
                }
                throw new OperationException(it.getError().getCode(), it.getError().getMessage());
            case 1:
                w this$02 = this.f17848f;
                CommentActionResponse it2 = (CommentActionResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getError() == null) {
                    return this$02.f17876b.f(it2);
                }
                throw new OperationException(it2.getError().getCode(), it2.getError().getMessage());
            default:
                w this$03 = this.f17848f;
                CommentActionResponse it3 = (CommentActionResponse) obj;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                Intrinsics.checkNotNullParameter(it3, "it");
                if (it3.getError() == null) {
                    return this$03.f17876b.f(it3);
                }
                throw new OperationException(it3.getError().getCode(), it3.getError().getMessage());
        }
    }
}
