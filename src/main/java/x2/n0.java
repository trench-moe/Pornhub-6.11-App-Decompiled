package x2;

import com.app.pornhub.domain.model.dvd.DvdContainer;
import com.app.pornhub.domain.model.dvd.DvdListContainer;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class n0 implements b3.f {

    /* renamed from: a  reason: collision with root package name */
    public final w2.f f17814a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17815b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17816c;
    public final b3.e d;

    public n0(w2.f dvdsService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(dvdsService, "dvdsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17814a = dvdsService;
        this.f17815b = modelMapper;
        this.f17816c = exceptionMapper;
        this.d = currentUserRepository;
    }

    @Override // b3.f
    public Single<DvdListContainer> a(String orderParamValue, String str, String str2, int i10, int i11) {
        String str3;
        Intrinsics.checkNotNullParameter(orderParamValue, "orderParamValue");
        w2.f fVar = this.f17814a;
        UserOrientation userOrientation = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str3 = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str3 = "gay";
        }
        Single<DvdListContainer> map = m9.a.i(fVar.b(orderParamValue, i10, i11, str3, c(str, str2))).doOnError(new m(this, 1)).map(new k(this, 3));
        Intrinsics.checkNotNullExpressionValue(map, "dvdsService.getDvds(\n   …esponse(it)\n            }");
        return map;
    }

    @Override // b3.f
    public Single<DvdContainer> b(String dvdId, int i10, int i11) {
        Intrinsics.checkNotNullParameter(dvdId, "dvdId");
        Single<DvdContainer> map = m9.a.i(this.f17814a.a(i10, i11, dvdId)).doOnError(new g(this, 2)).map(new i(this, 2));
        Intrinsics.checkNotNullExpressionValue(map, "dvdsService.getDvd(\n    …esponse(it)\n            }");
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> c(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            r3 = 0
            r0 = r3
            r1 = 1
            r6 = 1
            if (r8 == 0) goto L10
            int r2 = r8.length()
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            r3 = 0
            r2 = r3
            goto L12
        L10:
            r4 = 7
        L11:
            r2 = 1
        L12:
            if (r2 != 0) goto L30
            r6 = 7
            if (r9 == 0) goto L20
            r5 = 6
            int r3 = r9.length()
            r2 = r3
            if (r2 != 0) goto L21
            r5 = 7
        L20:
            r0 = 1
        L21:
            r6 = 2
            if (r0 == 0) goto L25
            goto L31
        L25:
            r6 = 7
            kotlin.Pair r3 = kotlin.TuplesKt.to(r8, r9)
            r8 = r3
            java.util.Map r8 = kotlin.collections.MapsKt.mapOf(r8)
            goto L36
        L30:
            r4 = 2
        L31:
            java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
            r8 = r3
        L36:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.n0.c(java.lang.String, java.lang.String):java.util.Map");
    }
}
