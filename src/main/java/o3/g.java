package o3;

import b3.o;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.z;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final o f13546a;

    public g(o videosRepository) {
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13546a = videosRepository;
    }

    public final Observable<UseCaseResult<Video>> a(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Observable<UseCaseResult<Video>> startWith = this.f13546a.a(vkey).toObservable().map(z.K).onErrorReturn(a0.O).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.getVide…th(UseCaseResult.Loading)");
        return startWith;
    }
}
