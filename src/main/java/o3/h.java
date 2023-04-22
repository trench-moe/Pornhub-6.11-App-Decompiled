package o3;

import b3.o;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x2.l0;
import x2.y;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final o f13547a;

    public h(o videosRepository) {
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13547a = videosRepository;
    }

    public final Observable<UseCaseResult<List<VideoMetaData>>> a(String order, String str, String str2, int i10) {
        Intrinsics.checkNotNullParameter(order, "order");
        o oVar = this.f13547a;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        Observable<UseCaseResult<List<VideoMetaData>>> startWith = oVar.g(order, str, str2, 16, i10).toObservable().map(l0.I).onErrorReturn(y.J).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.getVide…th(UseCaseResult.Loading)");
        return startWith;
    }
}
