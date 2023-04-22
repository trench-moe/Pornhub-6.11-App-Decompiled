package x2;

import com.app.pornhub.data.model.comments.CommentsResponse;
import com.app.pornhub.data.model.comments.DeleteCommentRequest;
import com.app.pornhub.data.model.comments.PostCommentRequest;
import com.app.pornhub.data.model.comments.PostGifCommentRequest;
import com.app.pornhub.data.model.comments.RateCommentRequest;
import com.app.pornhub.data.model.comments.ReportSpamRequest;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w implements b3.d {

    /* renamed from: a  reason: collision with root package name */
    public final w2.e f17875a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17876b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17877c;
    public final PublishSubject<Pair<String, UserComment>> d;

    /* renamed from: e  reason: collision with root package name */
    public Pair<String, ? extends List<UserComment>> f17878e;

    public w(w2.e commentsService, s2.a modelMapper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(commentsService, "commentsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17875a = commentsService;
        this.f17876b = modelMapper;
        this.f17877c = exceptionMapper;
        PublishSubject<Pair<String, UserComment>> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create()");
        this.d = create;
        this.f17878e = TuplesKt.to(BuildConfig.FLAVOR, new ArrayList());
    }

    @Override // b3.d
    public Single<List<UserComment>> a(String targetUserId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<UserComment>> map = m9.a.i(this.f17875a.b(i10, i11, targetUserId, "posts")).doOnError(new r(this, 0)).map(new t(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.getUserW…          }\n            }");
        return map;
    }

    @Override // b3.d
    public Single<CommentActionResult> b(String vkey, String str, String comment) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Single<CommentActionResult> map = m9.a.i(this.f17875a.a(new PostCommentRequest(vkey, comment, str))).doOnError(new r(this, 2)).map(new t(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.postVide…esponse(it)\n            }");
        return map;
    }

    @Override // b3.d
    public Single<List<UserComment>> c(final String vkey, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Single<List<UserComment>> map = m9.a.i(this.f17875a.c(i10, i11, vkey, z10 ? 1 : null)).doOnError(new q(this, 1)).map(new Function() { // from class: x2.v
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                w this$0 = w.this;
                String vkey2 = vkey;
                CommentsResponse commentsResponse = (CommentsResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(vkey2, "$vkey");
                Intrinsics.checkNotNullParameter(commentsResponse, "it");
                if (commentsResponse.getError() == null) {
                    s2.a aVar = this$0.f17876b;
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(commentsResponse, "commentsResponse");
                    List<UserComment> g10 = aVar.g(commentsResponse.getComments());
                    this$0.p(vkey2, g10);
                    return g10;
                }
                throw new OperationException(commentsResponse.getError().getCode(), commentsResponse.getError().getMessage());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.getVideo…ey, this) }\n            }");
        return map;
    }

    @Override // b3.d
    public Observable<Pair<String, UserComment>> d() {
        return this.d;
    }

    @Override // b3.d
    public Single<List<UserComment>> e(final String gifId, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Single<List<UserComment>> map = m9.a.i(this.f17875a.h(i10, i11, gifId, z10 ? 1 : null)).doOnError(new r(this, 1)).map(new Function() { // from class: x2.u
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                w this$0 = w.this;
                String gifId2 = gifId;
                CommentsResponse commentsResponse = (CommentsResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(gifId2, "$gifId");
                Intrinsics.checkNotNullParameter(commentsResponse, "it");
                if (commentsResponse.getError() == null) {
                    s2.a aVar = this$0.f17876b;
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(commentsResponse, "commentsResponse");
                    List<UserComment> g10 = aVar.g(commentsResponse.getComments());
                    this$0.p(gifId2, g10);
                    return g10;
                }
                throw new OperationException(commentsResponse.getError().getCode(), commentsResponse.getError().getMessage());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.getGifCo…Id, this) }\n            }");
        return map;
    }

    @Override // b3.d
    public Single<CommentActionResult> f(String itemId, boolean z10) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Single<CommentActionResult> map = m9.a.i(this.f17875a.g(new RateCommentRequest(itemId, z10 ? 1 : 0))).doOnError(new p(this, 0)).map(new s(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.rateComm…esponse(it)\n            }");
        return map;
    }

    @Override // b3.d
    public Single<CommentActionResult> g(String gifId, String str, String comment) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Single<CommentActionResult> map = m9.a.i(this.f17875a.f(new PostGifCommentRequest(gifId, comment, str))).doOnError(new p(this, 2)).map(new s(this, 2));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.postGifC…esponse(it)\n            }");
        return map;
    }

    @Override // b3.d
    public Single<CommentActionResult> h(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return n(vkey, "video");
    }

    @Override // b3.d
    public Single<CommentActionResult> i(String gifId) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        return o(gifId, ExploreModel.GIF);
    }

    @Override // b3.d
    public List<UserComment> j(String itemId, String parentId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        if (Intrinsics.areEqual(this.f17878e.getFirst(), itemId)) {
            for (UserComment userComment : this.f17878e.getSecond()) {
                if (Intrinsics.areEqual(userComment.getId(), parentId)) {
                    return userComment.getChildren();
                }
            }
        }
        return CollectionsKt.emptyList();
    }

    @Override // b3.d
    public Single<CommentActionResult> k(String gifId) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        return n(gifId, ExploreModel.GIF);
    }

    @Override // b3.d
    public Single<CommentActionResult> l(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        return o(vkey, "video");
    }

    @Override // b3.d
    public void m(String parentId, UserComment userComment) {
        Intrinsics.checkNotNullParameter(parentId, "parentId");
        Intrinsics.checkNotNullParameter(userComment, "userComment");
        this.d.onNext(new Pair<>(parentId, userComment));
    }

    public final Single<CommentActionResult> n(String str, String str2) {
        Single<CommentActionResult> map = m9.a.i(this.f17875a.d(new DeleteCommentRequest(str, str2))).doOnError(new p(this, 1)).map(new s(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.deleteCo…esponse(it)\n            }");
        return map;
    }

    public final Single<CommentActionResult> o(String str, String str2) {
        Single<CommentActionResult> map = m9.a.i(this.f17875a.e(new ReportSpamRequest(str, str2))).doOnError(new q(this, 0)).map(new d(this, 2));
        Intrinsics.checkNotNullExpressionValue(map, "commentsService.reportCo…esponse(it)\n            }");
        return map;
    }

    public final void p(String str, List<UserComment> list) {
        if (Intrinsics.areEqual(str, this.f17878e.getFirst())) {
            this.f17878e.getSecond().addAll(list);
        } else {
            this.f17878e = TuplesKt.to(str, CollectionsKt.toMutableList((Collection) list));
        }
    }
}
