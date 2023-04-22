package o3;

import b3.o;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.i1;
import x2.z;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final o f13542a;

    public c(o videosRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
            this.f13542a = videosRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(videosRepository, "videosRepository");
        this.f13542a = videosRepository;
    }

    public Observable a(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Observable startWith = this.f13542a.c(vkey, 4).toObservable().map(i1.F).onErrorReturn(z.I).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.getRela…th(UseCaseResult.Loading)");
        return startWith;
    }
}
