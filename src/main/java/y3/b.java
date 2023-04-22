package y3;

import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.performerdetails.a;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.Map;
import java.util.Objects;
import kf.a;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18392c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f18393f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18394j;

    public /* synthetic */ b(Object obj, String str, int i10) {
        this.f18392c = i10;
        this.f18394j = obj;
        this.f18393f = str;
    }

    public /* synthetic */ b(String str, HomeActivityViewModel homeActivityViewModel) {
        this.f18392c = 2;
        this.f18393f = str;
        this.f18394j = homeActivityViewModel;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        boolean z10 = true;
        switch (this.f18392c) {
            case 0:
                ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) this.f18394j;
                String str = this.f18393f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                int i10 = ChildCommentsActivity.Z;
                Objects.requireNonNull(childCommentsActivity);
                if (useCaseResult instanceof UseCaseResult.a) {
                    childCommentsActivity.U.u(str, true);
                } else {
                    childCommentsActivity.U.u(str, false);
                }
                if (useCaseResult instanceof UseCaseResult.Result) {
                    if (((CommentActionResult) ((UseCaseResult.Result) useCaseResult).a()).getResult()) {
                        childCommentsActivity.U.s(str);
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.comment_deleted), -1).n();
                    } else {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.error_comment_delete), -1).n();
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a10, "Failed to delete comment id %s", str);
                    if (a10 instanceof OperationException) {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.C((OperationException) a10), -1).n();
                        return;
                    } else {
                        o.h(childCommentsActivity, a10);
                        return;
                    }
                }
                return;
            case 1:
                CommentsFragment commentsFragment = (CommentsFragment) this.f18394j;
                String str2 = this.f18393f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                int i11 = CommentsFragment.M0;
                Objects.requireNonNull(commentsFragment);
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    commentsFragment.J0.v(str2, true);
                } else {
                    commentsFragment.J0.v(str2, false);
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    if (((CommentActionResult) ((UseCaseResult.Result) useCaseResult2).a()).getResult()) {
                        commentsFragment.J0.t(str2);
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.comment_flagged), -1).n();
                    } else {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.I(R.string.error_comment_flag), -1).n();
                    }
                }
                if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    Throwable a11 = ((UseCaseResult.Failure) useCaseResult2).a();
                    kf.a.f12078a.d(a11, "Failed to flag comment id %s", str2);
                    if (a11 instanceof OperationException) {
                        Snackbar.l(commentsFragment.C0.f4669o, commentsFragment.L0((OperationException) a11), -1).n();
                        return;
                    } else {
                        o.h(commentsFragment.u0(), a11);
                        return;
                    }
                }
                return;
            case 2:
                String query = this.f18393f;
                HomeActivityViewModel this$0 = (HomeActivityViewModel) this.f18394j;
                UseCaseResult useCaseResult3 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(query, "$query");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (useCaseResult3 instanceof UseCaseResult.a) {
                    a.C0174a c0174a = kf.a.f12078a;
                    c0174a.a("Fetching search suggestions for query " + query + "...", new Object[0]);
                    return;
                } else if (useCaseResult3 instanceof UseCaseResult.Result) {
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult3;
                    kf.a.f12078a.a(Intrinsics.stringPlus("Search suggestions fetched! ", result.a()), new Object[0]);
                    this$0.f5014l.l(new HomeActivityViewModel.GlobalStateEvent.SearchSuggestion(query, OptionalKt.asOptional(result.a())));
                    return;
                } else if (useCaseResult3 instanceof UseCaseResult.Failure) {
                    kf.a.f12078a.d(((UseCaseResult.Failure) useCaseResult3).a(), "Error fetching search suggestions", new Object[0]);
                    this$0.f5014l.l(new HomeActivityViewModel.GlobalStateEvent.SearchSuggestion(query, OptionalKt.asOptional(null)));
                    return;
                } else {
                    return;
                }
            default:
                com.app.pornhub.view.performerdetails.a this$02 = (com.app.pornhub.view.performerdetails.a) this.f18394j;
                String slug = this.f18393f;
                UseCaseResult useCaseResult4 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(slug, "$slug");
                if (useCaseResult4 instanceof UseCaseResult.a) {
                    if (Intrinsics.areEqual(this$02.f5416j, slug)) {
                        this$02.f5414h.l(new z3.a<>(a.AbstractC0058a.e.f5423a));
                    } else {
                        this$02.f5414h.l(new z3.a<>(a.AbstractC0058a.c.f5421a));
                    }
                } else if (Intrinsics.areEqual(this$02.f5416j, slug)) {
                    this$02.f5414h.l(new z3.a<>(a.AbstractC0058a.f.f5424a));
                } else {
                    this$02.f5414h.l(new z3.a<>(a.AbstractC0058a.d.f5422a));
                }
                if (useCaseResult4 instanceof UseCaseResult.Result) {
                    String str3 = this$02.f5415i;
                    if (str3 != null && str3.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this$02.f5415i = (String) ((Map.Entry) CollectionsKt.first(((PerformerContainer) ((UseCaseResult.Result) useCaseResult4).a()).getOrders().entrySet())).getKey();
                    }
                    if (!Intrinsics.areEqual(this$02.f5416j, slug)) {
                        this$02.f5416j = slug;
                        this$02.f5412f.l(((UseCaseResult.Result) useCaseResult4).a());
                    }
                    this$02.f5413g.l(((PerformerContainer) ((UseCaseResult.Result) useCaseResult4).a()).getVideos());
                }
                if (useCaseResult4 instanceof UseCaseResult.Failure) {
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) useCaseResult4;
                    kf.a.f12078a.d(failure.a(), "Error fetching pornstar", new Object[0]);
                    this$02.f5414h.l(new z3.a<>(new a.AbstractC0058a.b(UsersConfig.Companion.isGay(this$02.d.a().getOrientation()), failure.a())));
                    return;
                }
                return;
        }
    }
}
