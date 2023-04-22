package y3;

import androidx.lifecycle.p;
import com.app.pornhub.R;
import com.app.pornhub.domain.error.OperationException;
import com.app.pornhub.domain.model.comment.CommentActionResult;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.ChildCommentsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Objects;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;
import t3.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18389c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f18390f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f18391j;

    public /* synthetic */ a(Object obj, Object obj2, int i10) {
        this.f18389c = i10;
        this.f18390f = obj;
        this.f18391j = obj2;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        VideoMetaData videoMetaData;
        boolean z10 = true;
        switch (this.f18389c) {
            case 0:
                ChildCommentsActivity childCommentsActivity = (ChildCommentsActivity) this.f18390f;
                String str = (String) this.f18391j;
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
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.comment_flagged), -1).n();
                    } else {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.getString(R.string.error_comment_flag), -1).n();
                    }
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    Throwable a10 = ((UseCaseResult.Failure) useCaseResult).a();
                    kf.a.f12078a.d(a10, "Failed to flag comment id %s", str);
                    if (a10 instanceof OperationException) {
                        Snackbar.l(childCommentsActivity.T.f4375i, childCommentsActivity.C((OperationException) a10), -1).n();
                        return;
                    } else {
                        o.h(childCommentsActivity, a10);
                        return;
                    }
                }
                return;
            default:
                VideoDetailsViewModel this$0 = (VideoDetailsViewModel) this.f18390f;
                VideoDetailsViewModel.PlaylistState loadingState = (VideoDetailsViewModel.PlaylistState) this.f18391j;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(loadingState, "$loadingState");
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    this$0.f5581t.l(loadingState);
                } else {
                    this$0.f5581t.l(VideoDetailsViewModel.PlaylistState.a.f5587a);
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult2;
                    String str2 = null;
                    if (!((Playlist) result.a()).getVideos().isEmpty()) {
                        this$0.c(((Playlist) result.a()).getVideos());
                        Triple<Playlist, List<VideoMetaData>, String> d = this$0.d.f11371a.d();
                        p<String> pVar = this$0.f5580s;
                        String third = d.getThird();
                        if (third == null || third.length() == 0) {
                            List<VideoMetaData> d10 = this$0.f5579r.d();
                            if (d10 != null && (videoMetaData = d10.get(0)) != null) {
                                str2 = videoMetaData.getVkey();
                            }
                        } else if (!Intrinsics.areEqual(this$0.f5580s.d(), d.getThird())) {
                            str2 = d.getThird();
                        }
                        pVar.l(str2);
                    } else {
                        this$0.f5581t.l(new VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylistVideos(null));
                    }
                }
                if (useCaseResult2 instanceof UseCaseResult.Failure) {
                    UseCaseResult.Failure failure = (UseCaseResult.Failure) useCaseResult2;
                    kf.a.f12078a.d(failure.a(), "Error fetching more playlist videos", new Object[0]);
                    List<VideoMetaData> d11 = this$0.f5579r.d();
                    if ((d11 == null || d11.size() != 0) ? false : false) {
                        this$0.f5581t.l(new VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylist(failure.a()));
                        return;
                    } else {
                        this$0.f5581t.l(new VideoDetailsViewModel.PlaylistState.ErrorLoadingPlaylistVideos(failure.a()));
                        return;
                    }
                }
                return;
        }
    }
}
