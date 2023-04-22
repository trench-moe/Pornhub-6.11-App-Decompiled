package x2;

import com.app.pornhub.data.model.videos.AddFavoriteVideoRequest;
import com.app.pornhub.data.model.videos.AddVideoHistoryRequest;
import com.app.pornhub.data.model.videos.RateVideoRequest;
import com.app.pornhub.data.model.videos.RemoveFavoriteVideoRequest;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.domain.model.video.VideoMetaData;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s1 implements b3.o {

    /* renamed from: a  reason: collision with root package name */
    public final w2.p f17851a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.e f17852b;

    /* renamed from: c  reason: collision with root package name */
    public final b3.b f17853c;
    public final s2.a d;

    /* renamed from: e  reason: collision with root package name */
    public final y2.a f17854e;

    /* renamed from: f  reason: collision with root package name */
    public VideoFilters f17855f;

    /* renamed from: g  reason: collision with root package name */
    public final PublishSubject<VideoFilters> f17856g;

    public s1(w2.p videoService, b3.e currentUserRepository, b3.b categoriesRepository, s2.a modelMapper, y2.a exceptionMapper) {
        Intrinsics.checkNotNullParameter(videoService, "videoService");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        Intrinsics.checkNotNullParameter(categoriesRepository, "categoriesRepository");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        this.f17851a = videoService;
        this.f17852b = currentUserRepository;
        this.f17853c = categoriesRepository;
        this.d = modelMapper;
        this.f17854e = exceptionMapper;
        this.f17855f = new VideoFilters(null, null, null, null, null, 31, null);
        PublishSubject<VideoFilters> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<VideoFilters>()");
        this.f17856g = create;
    }

    @Override // b3.o
    public Single<Video> a(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Single<Video> map = m9.a.i(this.f17851a.a(vkey)).doOnError(new b(this, 4)).map(new e(this, 5));
        Intrinsics.checkNotNullExpressionValue(map, "videoService.getVideo(\n …          }\n            }");
        return map;
    }

    @Override // b3.o
    public Single<Boolean> b(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Single<Boolean> map = m9.a.i(this.f17851a.i(vkey)).doOnError(new q1(this, 1)).map(l0.f17784j);
        Intrinsics.checkNotNullExpressionValue(map, "videoService.isVideoFavo…  it.result\n            }");
        return map;
    }

    @Override // b3.o
    public Single<List<VideoMetaData>> c(String vkey, int i10) {
        String str;
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        w2.p pVar = this.f17851a;
        UserOrientation userOrientation = this.f17852b.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<List<VideoMetaData>> map = m9.a.i(pVar.d(i10, null, vkey, str, 1)).doOnError(new o1(this, 0)).map(new n(this, 5));
        Intrinsics.checkNotNullExpressionValue(map, "videoService.getRelatedV…          }\n            }");
        return map;
    }

    @Override // b3.o
    public Completable d(String vkey, boolean z10) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        if (z10) {
            Completable ignoreElement = m9.a.i(this.f17851a.b(new AddFavoriteVideoRequest(vkey))).doOnError(new o1(this, 1)).ignoreElement();
            Intrinsics.checkNotNullExpressionValue(ignoreElement, "videoService.addFavorite…         .ignoreElement()");
            return ignoreElement;
        }
        Completable ignoreElement2 = m9.a.i(this.f17851a.f(new RemoveFavoriteVideoRequest(vkey))).doOnError(new n1(this, 1)).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(ignoreElement2, "videoService.removeFavor…         .ignoreElement()");
        return ignoreElement2;
    }

    @Override // b3.o
    public Completable e(String vkey) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        String c10 = this.f17852b.c();
        if (c10 == null || c10.length() == 0) {
            Completable complete = Completable.complete();
            Intrinsics.checkNotNullExpressionValue(complete, "{\n            Completable.complete()\n        }");
            return complete;
        }
        return m9.a.h(this.f17851a.c(new AddVideoHistoryRequest(vkey)));
    }

    @Override // b3.o
    public Single<List<VideoMetaData>> f(String vkey, int i10, int i11) {
        String str;
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        w2.p pVar = this.f17851a;
        Integer valueOf = Integer.valueOf(i11);
        UserOrientation userOrientation = this.f17852b.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<List<VideoMetaData>> map = m9.a.i(pVar.d(i10, valueOf, vkey, str, null)).doOnError(new p1(this, 0)).map(new r1(this, 0));
        Intrinsics.checkNotNullExpressionValue(map, "videoService.getRelatedV…          }\n            }");
        return map;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0135  */
    @Override // b3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<java.util.List<com.app.pornhub.domain.model.video.VideoMetaData>> g(java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.s1.g(java.lang.String, java.lang.String, java.lang.String, int, int):io.reactivex.Single");
    }

    @Override // b3.o
    public void h(VideoFilters videoFilters) {
        Intrinsics.checkNotNullParameter(videoFilters, "videoFilters");
        this.f17855f = videoFilters;
        this.f17856g.onNext(videoFilters);
    }

    @Override // b3.o
    public Observable<VideoFilters> i() {
        return this.f17856g;
    }

    @Override // b3.o
    public Completable j(String vkey, boolean z10) {
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Completable ignoreElement = m9.a.i(this.f17851a.j(new RateVideoRequest(vkey, z10 ? 1 : 0))).doOnError(new n1(this, 0)).ignoreElement();
        Intrinsics.checkNotNullExpressionValue(ignoreElement, "videoService.rateVideo(\n…         .ignoreElement()");
        return ignoreElement;
    }

    @Override // b3.o
    public Completable k(Video video) {
        Intrinsics.checkNotNullParameter(video, "video");
        return m9.a.h(this.f17851a.e(video.getTrackUrl()));
    }

    @Override // b3.o
    public Single<List<VideoMetaData>> l(String targetUserId, VideosConfig.UserVideosType userVideosType, int i10, int i11) {
        String str;
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Intrinsics.checkNotNullParameter(userVideosType, "userVideosType");
        w2.p pVar = this.f17851a;
        if (userVideosType instanceof VideosConfig.UserVideosType.Private) {
            str = "pri";
        } else if (userVideosType instanceof VideosConfig.UserVideosType.Public) {
            str = "pub";
        } else if (userVideosType instanceof VideosConfig.UserVideosType.Favorite) {
            str = "faves";
        } else if (!(userVideosType instanceof VideosConfig.UserVideosType.History)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "pv";
        }
        Single<List<VideoMetaData>> map = m9.a.i(pVar.g(i10, i11, targetUserId, str)).doOnError(new p1(this, 1)).map(new r1(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "videoService.getUserVide…          }\n            }");
        return map;
    }

    @Override // b3.o
    public VideoFilters m() {
        return this.f17855f;
    }
}
