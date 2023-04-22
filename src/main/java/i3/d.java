package i3;

import b3.j;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.l0;
import x2.y;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final j f10495a;

    public d(j photosRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
            this.f10495a = photosRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
        this.f10495a = photosRepository;
    }

    public Observable a(String targetUserId, int i10) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Observable startWith = this.f10495a.e(targetUserId, 16, i10).toObservable().map(l0.D).onErrorReturn(y.D).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "photosRepository.getUser…th(UseCaseResult.Loading)");
        return startWith;
    }
}
