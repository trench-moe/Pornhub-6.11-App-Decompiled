package x2;

import com.app.pornhub.data.model.photo.AlbumResponse;
import com.app.pornhub.data.model.photo.FavoritePhotosResponse;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.photo.AlbumFilters;
import com.app.pornhub.domain.model.photo.Photo;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x0 implements b3.j {

    /* renamed from: a  reason: collision with root package name */
    public final w2.j f17884a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17885b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17886c;
    public final b3.e d;

    /* renamed from: e  reason: collision with root package name */
    public Pair<String, ? extends List<Photo>> f17887e;

    /* renamed from: f  reason: collision with root package name */
    public AlbumFilters f17888f;

    /* renamed from: g  reason: collision with root package name */
    public final PublishSubject<AlbumFilters> f17889g;

    public x0(w2.j photosService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(photosService, "photosService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17884a = photosService;
        this.f17885b = modelMapper;
        this.f17886c = exceptionMapper;
        this.d = currentUserRepository;
        this.f17887e = TuplesKt.to(BuildConfig.FLAVOR, new ArrayList());
        this.f17888f = new AlbumFilters(null, null, 3, null);
        PublishSubject<AlbumFilters> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<AlbumFilters>()");
        this.f17889g = create;
    }

    @Override // b3.j
    public Observable<AlbumFilters> a() {
        return this.f17889g;
    }

    @Override // b3.j
    public List<Photo> b() {
        return CollectionsKt.toMutableList((Collection) this.f17887e.getSecond());
    }

    @Override // b3.j
    public void c(AlbumFilters albumFilters) {
        Intrinsics.checkNotNullParameter(albumFilters, "albumFilters");
        this.f17888f = albumFilters;
        this.f17889g.onNext(albumFilters);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    @Override // b3.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.reactivex.Single<java.util.List<com.app.pornhub.domain.model.photo.Album>> d(java.lang.String r20, java.lang.String r21, int r22, int r23, java.lang.String r24) {
        /*
            r19 = this;
            r0 = r19
            java.lang.String r1 = "order"
            r3 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            w2.j r2 = r0.f17884a
            com.app.pornhub.domain.model.photo.AlbumFilters r1 = r0.f17888f
            java.util.List r1 = r1.getSegmentSelection()
            if (r1 != 0) goto L1d
            b3.e r1 = r0.d
            com.app.pornhub.domain.model.user.UserOrientation r1 = r1.i()
            java.util.List r1 = r0.j(r1)
        L1d:
            boolean r4 = r1.isEmpty()
            r5 = 0
            r6 = 2
            r6 = 0
            r9 = 3
            r9 = 1
            if (r4 == 0) goto L29
            goto L72
        L29:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r1.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            com.app.pornhub.domain.config.PhotosConfig$Companion r8 = com.app.pornhub.domain.config.PhotosConfig.Companion
            java.lang.String r7 = r8.getSegmentValue(r7)
            r4.add(r7)
            goto L32
        L4c:
            java.util.List r10 = kotlin.collections.CollectionsKt.filterNotNull(r4)
            r12 = 0
            r13 = 2
            r13 = 0
            r14 = 2
            r14 = 0
            r15 = 0
            r16 = 19613(0x4c9d, float:2.7484E-41)
            r16 = 0
            r17 = 62
            r18 = 0
            java.lang.String r11 = "-"
            java.lang.String r1 = kotlin.collections.CollectionsKt.joinToString$default(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            int r4 = r1.length()
            if (r4 <= 0) goto L6d
            r4 = 3
            r4 = 1
            goto L6e
        L6d:
            r4 = 0
        L6e:
            if (r4 == 0) goto L72
            r7 = r1
            goto L73
        L72:
            r7 = r5
        L73:
            if (r24 == 0) goto L7b
            int r1 = r24.length()
            if (r1 != 0) goto L7d
        L7b:
            r6 = 4
            r6 = 1
        L7d:
            if (r6 == 0) goto L99
            com.app.pornhub.domain.config.PhotosConfig$Companion r1 = com.app.pornhub.domain.config.PhotosConfig.Companion
            com.app.pornhub.domain.model.photo.AlbumFilters r4 = r0.f17888f
            java.lang.String r4 = r4.getTag()
            com.app.pornhub.domain.config.UsersConfig$Companion r5 = com.app.pornhub.domain.config.UsersConfig.Companion
            b3.e r6 = r0.d
            com.app.pornhub.domain.model.user.UserOrientation r6 = r6.i()
            boolean r5 = r5.isGay(r6)
            java.lang.String r1 = r1.getAlbumTagValue(r4, r5)
            r8 = r1
            goto L9b
        L99:
            r8 = r24
        L9b:
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            io.reactivex.Single r1 = r2.a(r3, r4, r5, r6, r7, r8)
            io.reactivex.Single r1 = m9.a.i(r1)
            x2.u0 r2 = new x2.u0
            r2.<init>(r0, r9)
            io.reactivex.Single r1 = r1.doOnError(r2)
            x2.k r2 = new x2.k
            r3 = 2
            r3 = 5
            r2.<init>(r0, r3)
            io.reactivex.Single r1 = r1.map(r2)
            java.lang.String r2 = "photosService.getCommuni…          }\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.x0.d(java.lang.String, java.lang.String, int, int, java.lang.String):io.reactivex.Single");
    }

    @Override // b3.j
    public Single<List<Photo>> e(final String targetUserId, int i10, final int i11) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<Photo>> map = m9.a.i(this.f17884a.b(i10, i11, targetUserId)).doOnError(new u0(this, 0)).map(new Function() { // from class: x2.w0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                x0 this$0 = x0.this;
                String targetUserId2 = targetUserId;
                int i12 = i11;
                FavoritePhotosResponse it = (FavoritePhotosResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(targetUserId2, "$targetUserId");
                Intrinsics.checkNotNullParameter(it, "it");
                List<Photo> m10 = this$0.f17885b.m(it.getUserFavoritePhotos());
                if (!Intrinsics.areEqual(this$0.f17887e.getFirst(), targetUserId2)) {
                    this$0.f17887e = TuplesKt.to(targetUserId2, new ArrayList());
                }
                if (i12 == this$0.f17887e.getSecond().size()) {
                    this$0.f17887e.getSecond().addAll(m10);
                }
                return m10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "photosService.getUserFav…     result\n            }");
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return Intrinsics.areEqual(this.f17884a, x0Var.f17884a) && Intrinsics.areEqual(this.f17885b, x0Var.f17885b) && Intrinsics.areEqual(this.f17886c, x0Var.f17886c) && Intrinsics.areEqual(this.d, x0Var.d);
        }
        return false;
    }

    @Override // b3.j
    public Single<List<Photo>> f(final String albumId, int i10, final int i11) {
        Intrinsics.checkNotNullParameter(albumId, "albumId");
        Single<List<Photo>> map = m9.a.i(this.f17884a.c(i10, i11, albumId)).doOnError(new g(this, 3)).map(new Function() { // from class: x2.v0
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                x0 this$0 = x0.this;
                String albumId2 = albumId;
                int i12 = i11;
                AlbumResponse it = (AlbumResponse) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(albumId2, "$albumId");
                Intrinsics.checkNotNullParameter(it, "it");
                List<Photo> m10 = this$0.f17885b.m(it.getAlbumPhotos());
                if (!Intrinsics.areEqual(this$0.f17887e.getFirst(), albumId2)) {
                    this$0.f17887e = TuplesKt.to(albumId2, new ArrayList());
                }
                if (i12 == this$0.f17887e.getSecond().size()) {
                    this$0.f17887e.getSecond().addAll(m10);
                }
                return m10;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "photosService.getAlbumPh…     result\n            }");
        return map;
    }

    @Override // b3.j
    public AlbumFilters g() {
        return new AlbumFilters(j(this.d.i()), BuildConfig.FLAVOR);
    }

    @Override // b3.j
    public Single<List<Album>> h(String targetUserId, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Single<List<Album>> map = m9.a.i(this.f17884a.d(i10, i11, targetUserId, z10 ? PlaylistsConfig.TYPE_PRIVATE : PlaylistsConfig.TYPE_PUBLIC)).doOnError(new h(this, 4)).map(new n(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "photosService.getUserAlb…userAlbums)\n            }");
        return map;
    }

    public int hashCode() {
        int hashCode = this.f17884a.hashCode() * 31;
        int hashCode2 = this.f17886c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((this.f17885b.hashCode() + hashCode) * 31)) * 31);
    }

    @Override // b3.j
    public AlbumFilters i() {
        if (this.f17888f.getSegmentSelection() == null) {
            c(g());
        }
        return AlbumFilters.copy$default(this.f17888f, null, null, 3, null);
    }

    public final List<Integer> j(UserOrientation userOrientation) {
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            return CollectionsKt.listOf(3);
        }
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            return CollectionsKt.listOf((Object[]) new Integer[]{0, 1});
        }
        throw new NoWhenBranchMatchedException();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("PhotoRepositoryImpl(photosService=");
        m10.append(this.f17884a);
        m10.append(", modelMapper=");
        m10.append(this.f17885b);
        m10.append(", exceptionMapper=");
        m10.append(this.f17886c);
        m10.append(", currentUserRepository=");
        m10.append(this.d);
        m10.append(')');
        return m10.toString();
    }
}
