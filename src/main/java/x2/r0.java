package x2;

import com.app.pornhub.data.model.gifs.AddFavoriteGifRequest;
import com.app.pornhub.data.model.gifs.RateGifRequest;
import com.app.pornhub.data.model.gifs.ReportGifRequest;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.gif.MostRecentGifsContainer;
import io.reactivex.Completable;
import io.reactivex.Single;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r0 implements b3.h {

    /* renamed from: a  reason: collision with root package name */
    public final w2.h f17842a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17843b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17844c;
    public final b3.e d;

    public r0(w2.h gifsService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(gifsService, "gifsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17842a = gifsService;
        this.f17843b = modelMapper;
        this.f17844c = exceptionMapper;
        this.d = currentUserRepository;
    }

    @Override // b3.h
    public Single<Gif> a(String gifId) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Single<Gif> map = m9.a.i(this.f17842a.a(gifId)).doOnError(new q0(this, 0)).map(new k(this, 4));
        Intrinsics.checkNotNullExpressionValue(map, "gifsService.getGif(\n    …del(it.gif)\n            }");
        return map;
    }

    @Override // b3.h
    public Single<List<GifMetaData>> b(String gifId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Single<List<GifMetaData>> map = m9.a.i(this.f17842a.g(i10, i11, gifId)).doOnError(new h(this, 3)).map(new n(this, 2));
        Intrinsics.checkNotNullExpressionValue(map, "gifsService.getRelatedGi…elatedGifs)\n            }");
        return map;
    }

    @Override // b3.h
    public Completable c(String gifId, int i10, String reason) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Completable doOnError = m9.a.h(this.f17842a.f(new ReportGifRequest(gifId, String.valueOf(i10), reason))).doOnError(new p0(this, 0));
        Intrinsics.checkNotNullExpressionValue(doOnError, "gifsService.flagGif(\n   …Mapper.mapException(it) }");
        return doOnError;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // b3.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<java.util.List<com.app.pornhub.domain.model.gif.GifMetaData>> d(java.lang.String r10, java.lang.String r11, int r12, int r13, java.lang.String r14) {
        /*
            r9 = this;
            java.lang.String r8 = "order"
            r0 = r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r8 = 2
            w2.h r1 = r9.f17842a
            b3.e r0 = r9.d
            com.app.pornhub.domain.model.user.UserOrientation r8 = r0.i()
            r0 = r8
            java.lang.String r8 = "userOrientation"
            r2 = r8
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            com.app.pornhub.domain.model.user.UserOrientation$Straight r2 = com.app.pornhub.domain.model.user.UserOrientation.Straight.INSTANCE
            r8 = 5
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r2 = r8
            if (r2 == 0) goto L26
            r8 = 1
            java.lang.String r8 = "straight"
            r0 = r8
        L24:
            r6 = r0
            goto L33
        L26:
            r8 = 5
            com.app.pornhub.domain.model.user.UserOrientation$Gay r2 = com.app.pornhub.domain.model.user.UserOrientation.Gay.INSTANCE
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r0 = r8
            if (r0 == 0) goto L84
            java.lang.String r0 = "gay"
            goto L24
        L33:
            if (r14 == 0) goto L40
            int r8 = r14.length()
            r0 = r8
            if (r0 != 0) goto L3d
            goto L41
        L3d:
            r0 = 0
            r8 = 3
            goto L43
        L40:
            r8 = 2
        L41:
            r8 = 1
            r0 = r8
        L43:
            if (r0 == 0) goto L48
            r14 = 0
            r8 = 7
            goto L59
        L48:
            kotlin.text.Regex r0 = new kotlin.text.Regex
            r8 = 1
            java.lang.String r2 = " "
            r8 = 1
            r0.<init>(r2)
            java.lang.String r8 = "+"
            r2 = r8
            java.lang.String r8 = r0.replace(r14, r2)
            r14 = r8
        L59:
            r7 = r14
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            io.reactivex.Single r10 = r1.c(r2, r3, r4, r5, r6, r7)
            io.reactivex.Single r8 = m9.a.i(r10)
            r10 = r8
            x2.b r11 = new x2.b
            r8 = 4
            r12 = 2
            r11.<init>(r9, r12)
            io.reactivex.Single r10 = r10.doOnError(r11)
            x2.e r11 = new x2.e
            r8 = 4
            r12 = r8
            r11.<init>(r9, r12)
            io.reactivex.Single r10 = r10.map(r11)
            java.lang.String r11 = "gifsService.getGifs(\n   …          }\n            }"
            r8 = 6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            return r10
        L84:
            r8 = 2
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
            r8 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.r0.d(java.lang.String, java.lang.String, int, int, java.lang.String):io.reactivex.Single");
    }

    @Override // b3.h
    public Single<MostRecentGifsContainer> e(String gifId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Single<MostRecentGifsContainer> map = m9.a.i(this.f17842a.d(i10, i11, gifId)).doOnError(new p0(this, 1)).map(new i(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "gifsService.getMostRecen…esponse(it)\n            }");
        return map;
    }

    @Override // b3.h
    public Single<Boolean> f(String gifId, boolean z10) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Single<Boolean> map = m9.a.i(this.f17842a.b(new AddFavoriteGifRequest(gifId, z10 ? 1 : 0))).doOnError(new q0(this, 1)).map(a0.f17673m);
        Intrinsics.checkNotNullExpressionValue(map, "gifsService.addFavoriteG…  it.result\n            }");
        return map;
    }

    @Override // b3.h
    public Completable g(String gifId) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        return i(gifId, 0);
    }

    @Override // b3.h
    public Completable h(String gifId) {
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        return i(gifId, 1);
    }

    public final Completable i(String str, int i10) {
        Completable doOnError = m9.a.h(this.f17842a.e(new RateGifRequest(str, i10))).doOnError(new c(this, 3));
        Intrinsics.checkNotNullExpressionValue(doOnError, "gifsService.rateGif(\n   …Mapper.mapException(it) }");
        return doOnError;
    }
}
