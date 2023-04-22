package x2;

import com.app.pornhub.data.model.comments.CommentActionResponse;
import com.app.pornhub.data.model.comments.UserCommentModel;
import com.app.pornhub.data.model.user.ProfileCommentsResponse;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.comment.UserComment;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17857c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f17858f;

    public /* synthetic */ t(w wVar, int i10) {
        this.f17857c = i10;
        this.f17858f = wVar;
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        switch (this.f17857c) {
            case 0:
                w this$0 = this.f17858f;
                ProfileCommentsResponse it = (ProfileCommentsResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getError() == null) {
                    s2.a aVar = this$0.f17876b;
                    List<UserCommentModel> comments = it.getWallComments();
                    Objects.requireNonNull(aVar);
                    Intrinsics.checkNotNullParameter(comments, "comments");
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(comments, 10));
                    for (UserCommentModel userCommentModel : comments) {
                        arrayList.add(new UserComment(userCommentModel.getId(), userCommentModel.getText(), userCommentModel.getDateAdded(), 0, 0, new ArrayList(), aVar.s(userCommentModel.getUser())));
                    }
                    return arrayList;
                }
                throw new PornhubException(it.getError().getCode(), it.getError().getMessage());
            default:
                w this$02 = this.f17858f;
                CommentActionResponse it2 = (CommentActionResponse) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(it2, "it");
                if (it2.getError() == null) {
                    return this$02.f17876b.f(it2);
                }
                throw new OperationException(it2.getError().getCode(), it2.getError().getMessage());
        }
    }
}
