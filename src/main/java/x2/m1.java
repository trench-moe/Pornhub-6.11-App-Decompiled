package x2;

import com.app.pornhub.domain.model.user.User;
import com.app.pornhub.domain.model.user.UserMetaData;
import io.reactivex.Single;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m1 implements b3.n {

    /* renamed from: a  reason: collision with root package name */
    public final b3.e f17809a;

    /* renamed from: b  reason: collision with root package name */
    public final w2.o f17810b;

    /* renamed from: c  reason: collision with root package name */
    public final s2.a f17811c;
    public final y2.a d;

    public m1(b3.e currentUserRepository, w2.o userService, s2.a modelMapper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17809a = currentUserRepository;
        this.f17810b = userService;
        this.f17811c = modelMapper;
        this.d = exceptionMapper;
    }

    @Override // b3.n
    public Single<User> a(String targetUserId) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        w2.o oVar = this.f17810b;
        if (Intrinsics.areEqual(targetUserId, this.f17809a.c())) {
            targetUserId = null;
        }
        Single<User> map = m9.a.i(oVar.a(targetUserId)).doOnError(new h(this, 5)).map(new n(this, 4));
        Intrinsics.checkNotNullExpressionValue(map, "userService.getUserProfi…          }\n            }");
        return map;
    }

    @Override // b3.n
    public Single<List<UserMetaData>> b(String targetUserId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<UserMetaData>> map = m9.a.i(this.f17810b.b(i10, i11, targetUserId, "username")).doOnError(new k1(this, 0)).map(new l1(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "userService.getUserSubsc…          }\n            }");
        return map;
    }

    @Override // b3.n
    public Single<List<UserMetaData>> c(String targetUserId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<UserMetaData>> map = m9.a.i(this.f17810b.d(i10, i11, targetUserId, "username")).doOnError(new g(this, 5)).map(new i(this, 6));
        Intrinsics.checkNotNullExpressionValue(map, "userService.getUserFrien…          }\n            }");
        return map;
    }

    @Override // b3.n
    public Single<List<UserMetaData>> d(String targetUserId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<UserMetaData>> map = m9.a.i(this.f17810b.c(i10, i11, targetUserId, "username")).doOnError(new k1(this, 1)).map(new l1(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "userService.getUserSubsc…          }\n            }");
        return map;
    }
}
