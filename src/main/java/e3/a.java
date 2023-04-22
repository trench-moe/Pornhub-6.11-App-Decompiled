package e3;

import b3.d;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.CommentsSource;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import x2.l0;
import x2.y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final d f9035a;

    public a(d commentsRepository, int i10) {
        if (i10 == 1) {
            Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
            this.f9035a = commentsRepository;
        } else if (i10 != 2) {
            Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
            this.f9035a = commentsRepository;
        } else {
            Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
            this.f9035a = commentsRepository;
        }
    }

    public Observable a(String itemId, CommentsSource commentsSource) {
        Single<CommentActionResult> k10;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(commentsSource, "commentsSource");
        if (Intrinsics.areEqual(commentsSource, CommentsSource.Video.INSTANCE)) {
            k10 = this.f9035a.h(itemId);
        } else if (!Intrinsics.areEqual(commentsSource, CommentsSource.Gif.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            k10 = this.f9035a.k(itemId);
        }
        Observable startWith = k10.toObservable().map(l0.f17787u).onErrorReturn(y.f17893t).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "source\n            .toOb…th(UseCaseResult.Loading)");
        return startWith;
    }

    public Observable b(String itemId, boolean z10) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Observable startWith = this.f9035a.f(itemId, z10).toObservable().map(l0.y).onErrorReturn(y.f17894u).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "commentsRepository.rateC…th(UseCaseResult.Loading)");
        return startWith;
    }
}
