package i3;

import b3.j;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.k0;
import x2.l0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final j f10492a;

    public a(j photosRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
            this.f10492a = photosRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(photosRepository, "photosRepository");
        this.f10492a = photosRepository;
    }

    public Observable a(String albumId, int i10) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Observable startWith = this.f10492a.f(albumId, 16, i10).toObservable().map(k0.A).onErrorReturn(l0.C).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "photosRepository.getAlbu…th(UseCaseResult.Loading)");
        return startWith;
    }
}
