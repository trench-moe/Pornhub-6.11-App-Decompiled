package j3;

import b3.k;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.z;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final k f11373a;

    public e(k playlistsRepository) {
        Intrinsics.checkNotNullParameter(playlistsRepository, "playlistsRepository");
        this.f11373a = playlistsRepository;
    }

    public final Observable<UseCaseResult<Playlist>> a(long j10, Integer num) {
        Observable<UseCaseResult<Playlist>> startWith = this.f11373a.a(j10, 8, Integer.valueOf(num == null ? 0 : num.intValue())).toObservable().map(z.E).onErrorReturn(a0.H).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "playlistsRepository.getP…th(UseCaseResult.Loading)");
        return startWith;
    }
}
