package w2;

import com.app.pornhub.data.model.comments.CommentActionResponse;
import com.app.pornhub.data.model.comments.CommentsResponse;
import com.app.pornhub.data.model.comments.DeleteCommentRequest;
import com.app.pornhub.data.model.comments.PostCommentRequest;
import com.app.pornhub.data.model.comments.PostGifCommentRequest;
import com.app.pornhub.data.model.comments.RateCommentRequest;
import com.app.pornhub.data.model.comments.ReportSpamRequest;
import com.app.pornhub.data.model.user.ProfileCommentsResponse;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Single;
import jf.t;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\fH'J?\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0011\u0010\u000bJ\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\u0012H'J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\u0014H'J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\u0016H'J\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\r\u001a\u00020\u0018H'J6\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0005H'¨\u0006\u001e"}, d2 = {"Lw2/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "limit", "offset", BuildConfig.FLAVOR, "vkey", "popular", "Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/comments/CommentsResponse;", DvdsConfig.TYPE_CATEGORY, "(IILjava/lang/String;Ljava/lang/Integer;)Lio/reactivex/Single;", "Lcom/app/pornhub/data/model/comments/PostCommentRequest;", "body", "Lcom/app/pornhub/data/model/comments/CommentActionResponse;", "a", "id", "h", "Lcom/app/pornhub/data/model/comments/PostGifCommentRequest;", "f", "Lcom/app/pornhub/data/model/comments/DeleteCommentRequest;", "d", "Lcom/app/pornhub/data/model/comments/RateCommentRequest;", "g", "Lcom/app/pornhub/data/model/comments/ReportSpamRequest;", "e", "targetUserId", "section", "Lcom/app/pornhub/data/model/user/ProfileCommentsResponse;", "b", "data_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public interface e {
    @jf.o("postComment")
    Single<CommentActionResponse> a(@jf.a PostCommentRequest postCommentRequest);

    @jf.f("getUserWallComments")
    Single<ProfileCommentsResponse> b(@t("limit") int i10, @t("offset") int i11, @t("targetUserId") String str, @t("section") String str2);

    @jf.f("getVideoComments")
    Single<CommentsResponse> c(@t("limit") int i10, @t("offset") int i11, @t("vkey") String str, @t("popular") Integer num);

    @jf.o("deleteUserComment")
    Single<CommentActionResponse> d(@jf.a DeleteCommentRequest deleteCommentRequest);

    @jf.o("reportCommentSpam")
    Single<CommentActionResponse> e(@jf.a ReportSpamRequest reportSpamRequest);

    @jf.o("postGifComment")
    Single<CommentActionResponse> f(@jf.a PostGifCommentRequest postGifCommentRequest);

    @jf.o("rateComment")
    Single<CommentActionResponse> g(@jf.a RateCommentRequest rateCommentRequest);

    @jf.f("getGifComments")
    Single<CommentsResponse> h(@t("limit") int i10, @t("offset") int i11, @t("id") String str, @t("popular") Integer num);
}
