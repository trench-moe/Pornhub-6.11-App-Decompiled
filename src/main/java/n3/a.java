package n3;

import b3.n;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.k0;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13281a;

    /* renamed from: b  reason: collision with root package name */
    public final n f13282b;

    public a(n userRepository, int i10) {
        this.f13281a = i10;
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            this.f13282b = userRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f13282b = userRepository;
    }

    public final Observable a(String targetUserId, int i10) {
        switch (this.f13281a) {
            case 0:
                Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
                Observable startWith = this.f13282b.c(targetUserId, 16, i10).toObservable().map(a0.M).onErrorReturn(k0.E).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "userRepository.getFriend…th(UseCaseResult.Loading)");
                return startWith;
            default:
                Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
                Observable startWith2 = this.f13282b.d(targetUserId, 16, i10).toObservable().map(a0.N).onErrorReturn(k0.F).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith2, "userRepository.getSubscr…th(UseCaseResult.Loading)");
                return startWith2;
        }
    }
}
