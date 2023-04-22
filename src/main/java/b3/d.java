package b3;

import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.List;
import kotlin.Pair;

/* loaded from: classes.dex */
public interface d {
    Single<List<UserComment>> a(String str, int i10, int i11);

    Single<CommentActionResult> b(String str, String str2, String str3);

    Single<List<UserComment>> c(String str, int i10, int i11, boolean z10);

    Observable<Pair<String, UserComment>> d();

    Single<List<UserComment>> e(String str, int i10, int i11, boolean z10);

    Single<CommentActionResult> f(String str, boolean z10);

    Single<CommentActionResult> g(String str, String str2, String str3);

    Single<CommentActionResult> h(String str);

    Single<CommentActionResult> i(String str);

    List<UserComment> j(String str, String str2);

    Single<CommentActionResult> k(String str);

    Single<CommentActionResult> l(String str);

    void m(String str, UserComment userComment);
}
