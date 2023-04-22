package x2;

import com.app.pornhub.domain.model.channel.ChannelContainer;
import com.app.pornhub.domain.model.channel.ChannelListContainer;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements b3.c {

    /* renamed from: a  reason: collision with root package name */
    public final w2.d f17819a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17820b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17821c;
    public final b3.e d;

    public o(w2.d channelsService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(channelsService, "channelsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17819a = channelsService;
        this.f17820b = modelMapper;
        this.f17821c = exceptionMapper;
        this.d = currentUserRepository;
    }

    @Override // b3.c
    public Single<ChannelContainer> a(String channelId, int i10, int i11, String str) {
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Single<ChannelContainer> map = m9.a.i(this.f17819a.b(channelId, i10, Integer.valueOf(i11), str)).doOnError(new m(this, 0)).map(new k(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "channelsService.getChann…esponse(it)\n            }");
        return map;
    }

    @Override // b3.c
    public Single<ChannelListContainer> b(int i10, int i11, String order) {
        String str;
        Intrinsics.checkNotNullParameter(order, "order");
        w2.d dVar = this.f17819a;
        UserOrientation userOrientation = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<ChannelListContainer> map = m9.a.i(dVar.a(order, i10, i11, str)).doOnError(new h(this, 1)).map(new n(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "channelsService.getChann…esponse(it)\n            }");
        return map;
    }
}
