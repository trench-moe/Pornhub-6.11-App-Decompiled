package e5;

import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9072c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsViewModel f9073f;

    public /* synthetic */ e0(VideoDetailsViewModel videoDetailsViewModel, int i10) {
        this.f9072c = i10;
        this.f9073f = videoDetailsViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f9072c) {
            case 0:
                VideoDetailsViewModel this$0 = this.f9073f;
                UseCaseResult useCaseResult = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.A.l(new z3.a<>(new VideoDetailsViewModel.VideoState.a(useCaseResult instanceof UseCaseResult.a)));
                if (useCaseResult instanceof UseCaseResult.Result) {
                    if (this$0.f5578q.d() == null) {
                        this$0.D.add(((UseCaseResult.Result) useCaseResult).a());
                    }
                    UseCaseResult.Result result = (UseCaseResult.Result) useCaseResult;
                    Video video = (Video) result.a();
                    o3.j jVar = this$0.f5576o;
                    Objects.requireNonNull(jVar);
                    Intrinsics.checkNotNullParameter(video, "video");
                    Completable mergeDelayError = Completable.mergeDelayError(CollectionsKt.listOf((Object[]) new Completable[]{jVar.f13549a.e(video.getVideoMetaData().getVkey()), jVar.f13549a.k(video)}));
                    Intrinsics.checkNotNullExpressionValue(mergeDelayError, "mergeDelayError(listOf(\n…ackView(video)\n        ))");
                    Disposable subscribe = mergeDelayError.subscribe(new Action() { // from class: e5.d0
                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            kf.a.f12078a.e("Video view tracking and adding to history was successfully completed.", new Object[0]);
                        }
                    }, new Consumer() { // from class: e5.f0
                        @Override // io.reactivex.functions.Consumer
                        public final void accept(Object obj2) {
                            kf.a.f12078a.d((Throwable) obj2, "Couldn't track video view or add to history.", new Object[0]);
                        }
                    });
                    Intrinsics.checkNotNullExpressionValue(subscribe, "trackVideoViewUseCase.ex…istory.\") }\n            )");
                    DisposableKt.addTo(subscribe, this$0.f16001c);
                    this$0.y.l(result.a());
                    this$0.C = this$0.e(((Video) result.a()).getVideoMetaData().getVkey());
                }
                if (useCaseResult instanceof UseCaseResult.Failure) {
                    this$0.A.l(new z3.a<>(new VideoDetailsViewModel.VideoState.ErrorLoading(((UseCaseResult.Failure) useCaseResult).a())));
                }
                return;
            default:
                VideoDetailsViewModel this$02 = this.f9073f;
                UseCaseResult useCaseResult2 = (UseCaseResult) obj;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (useCaseResult2 instanceof UseCaseResult.a) {
                    this$02.B.l(VideoDetailsViewModel.a.C0064a.f5591a);
                }
                if (useCaseResult2 instanceof UseCaseResult.Result) {
                    this$02.B.l(new VideoDetailsViewModel.a.b(((Boolean) ((UseCaseResult.Result) useCaseResult2).a()).booleanValue()));
                    return;
                }
                return;
        }
    }
}
