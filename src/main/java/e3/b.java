package e3;

import b3.d;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d f9036a;

    public b(d commentsRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
            this.f9036a = commentsRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
        this.f9036a = commentsRepository;
    }

    public Observable a(String itemId, CommentsSource commentsSource) {
        Single<CommentActionResult> i10;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(commentsSource, "commentsSource");
        if (Intrinsics.areEqual(commentsSource, CommentsSource.Video.INSTANCE)) {
            i10 = this.f9036a.l(itemId);
        } else if (!Intrinsics.areEqual(commentsSource, CommentsSource.Gif.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            i10 = this.f9036a.i(itemId);
        }
        Observable startWith = i10.toObservable().map(z.f17904u).onErrorReturn(a0.f17676w).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        return startWith;
    }

    public Observable b(String itemId, String str, String comment, CommentsSource commentsSource) {
        Single<CommentActionResult> g10;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(commentsSource, "commentsSource");
        if (Intrinsics.areEqual(commentsSource, CommentsSource.Video.INSTANCE)) {
            g10 = this.f9036a.b(itemId, str, comment);
        } else if (!Intrinsics.areEqual(commentsSource, CommentsSource.Gif.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            g10 = this.f9036a.g(itemId, str, comment);
        }
        Observable startWith = g10.toObservable().map(z.y).onErrorReturn(a0.y).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        return startWith;
    }
}
