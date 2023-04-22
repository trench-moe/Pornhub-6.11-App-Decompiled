package x2;

import com.app.pornhub.domain.model.explore.ExploreData;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Single;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o0 implements b3.g {

    /* renamed from: a  reason: collision with root package name */
    public final w2.g f17822a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.e f17823b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.a f17824c;
    public final r2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final y2.a f17825e;

    public o0(w2.g exploreService, b3.e currentUserRepository, s2.a modelMapper, r2.a serializationHelper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(exploreService, "exploreService");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(serializationHelper, "serializationHelper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17822a = exploreService;
        this.f17823b = currentUserRepository;
        this.f17824c = modelMapper;
        this.d = serializationHelper;
        this.f17825e = exceptionMapper;
    }

    @Override // b3.g
    public Single<List<ExploreData>> a() {
        String str;
        w2.g gVar = this.f17822a;
        UserOrientation userOrientation = this.f17823b.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<List<ExploreData>> map = m9.a.i(gVar.a(str)).doOnError(new b(this, 1)).map(new e(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "exploreService.getExplor…reDataList)\n            }");
        return map;
    }

    @Override // b3.g
    public Single<List<ExploreData>> b() {
        String str;
        w2.g gVar = this.f17822a;
        String c10 = this.f17823b.c();
        UserOrientation userOrientation = this.f17823b.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<List<ExploreData>> map = m9.a.i(gVar.b(c10, str)).doOnError(new c(this, 2)).map(new j(this, 2));
        Intrinsics.checkNotNullExpressionValue(map, "exploreService.getDiscov…scoverData)\n            }");
        return map;
    }
}
