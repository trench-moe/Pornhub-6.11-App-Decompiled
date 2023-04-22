package y3;

import com.app.pornhub.R;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.comment.UserComment;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.comments.a;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18398c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f18399f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ String f18400j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Object f18401m;

    public /* synthetic */ d(CommentsFragment commentsFragment, String str, boolean z10) {
        this.f18401m = commentsFragment;
        this.f18400j = str;
        this.f18399f = z10;
    }

    public /* synthetic */ d(boolean z10, VideoDetailsViewModel videoDetailsViewModel, String str) {
        this.f18399f = z10;
        this.f18401m = videoDetailsViewModel;
        this.f18400j = str;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f18398c) {
            case 0:
                CommentsFragment commentsFragment = (CommentsFragment) this.f18401m;
                String str = this.f18400j;
                boolean z10 = this.f18399f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = CommentsFragment.M0;
                Objects.requireNonNull(commentsFragment);
                if (useCaseResult instanceof UseCaseResult.a) {
                    commentsFragment.J0.u(str, z10, true);
                } else {
                    commentsFragment.J0.u(str, z10, false);
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    if (((CommentActionResult) ((UseCaseResult.Result) useCaseResult).a()).getResult()) {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.comment_rated), -1).n();
                        com.app.pornhub.view.comments.a aVar = commentsFragment.J0;
                        int i11 = 0;
                        while (true) {
                            if (i11 < aVar.d.size()) {
                                UserComment userComment = ((a.c) aVar.d.get(i11)).f4959a;
                                if (userComment.getId().equals(str)) {
                                    if (z10) {
                                        userComment.incrementVotesUp();
                                    } else {
                                        userComment.incrementVotesDown();
                                    }
                                    aVar.d(i11);
                                } else {
                                    i11++;
                                }
                            }
                        }
                    } else {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.error_comment_rate), -1).n();
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a10, "Failed to rate comment id %s", str);
                    if (a10 instanceof OperationException) {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.L0((OperationException) a10), -1).n();
                        return;
                    } else {
                        o.h(commentsFragment.u0(), a10);
                        return;
                    }
                }
                return;
            default:
                boolean z11 = this.f18399f;
                VideoDetailsViewModel this$0 = (VideoDetailsViewModel) this.f18401m;
                String vkey = this.f18400j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(vkey, "$vkey");
                kf.a.f12078a.d((Throwable) obj, Intrinsics.stringPlus("Failed to changed video like status to ", Boolean.valueOf(z11)), new Object[0]);
                this$0.e(vkey);
                return;
        }
    }
}
