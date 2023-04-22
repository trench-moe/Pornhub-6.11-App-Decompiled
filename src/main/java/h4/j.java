package h4;

import androidx.lifecycle.p;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.OptionalKt;
import com.app.pornhub.domain.model.user.UserMetaData;
import f3.o;
import f3.q;
import kotlin.jvm.internal.Intrinsics;
import q3.a;

/* loaded from: classes2.dex */
public final class j extends v3.d {
    public final f3.k d;

    /* renamed from: e  reason: collision with root package name */
    public final o f10127e;

    /* renamed from: f  reason: collision with root package name */
    public final f3.i f10128f;

    /* renamed from: g  reason: collision with root package name */
    public final f3.h f10129g;

    /* renamed from: h  reason: collision with root package name */
    public final q f10130h;

    /* renamed from: i  reason: collision with root package name */
    public final f3.c f10131i;

    /* renamed from: j  reason: collision with root package name */
    public final f3.b f10132j;

    /* renamed from: k  reason: collision with root package name */
    public final f3.a f10133k;

    /* renamed from: l  reason: collision with root package name */
    public final q3.a f10134l;

    /* renamed from: m  reason: collision with root package name */
    public final p<Optional<UserMetaData>> f10135m;
    public final p<Boolean> n;

    /* renamed from: o  reason: collision with root package name */
    public final a f10136o;

    /* loaded from: classes2.dex */
    public static final class a implements a.InterfaceC0247a {
        public a() {
        }

        @Override // q3.a.InterfaceC0247a
        public void a(boolean z10, boolean z11) {
            j.this.n.j(Boolean.valueOf(z11));
        }
    }

    public j(f3.k getOenMetaDataUseCase, o getUserSettingsUseCase, f3.i getOwnUserIdUseCase, f3.h getUserAuthLevelUseCase, q logOutUseCase, f3.c changeUserOrientationUseCase, f3.b changeAutoRotationUseCase, f3.a changeAutoPlayUseCase, q3.a networkManager) {
        Intrinsics.checkNotNullParameter(getOenMetaDataUseCase, "getOenMetaDataUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getOwnUserIdUseCase, "getOwnUserIdUseCase");
        Intrinsics.checkNotNullParameter(getUserAuthLevelUseCase, "getUserAuthLevelUseCase");
        Intrinsics.checkNotNullParameter(logOutUseCase, "logOutUseCase");
        Intrinsics.checkNotNullParameter(changeUserOrientationUseCase, "changeUserOrientationUseCase");
        Intrinsics.checkNotNullParameter(changeAutoRotationUseCase, "changeAutoRotationUseCase");
        Intrinsics.checkNotNullParameter(changeAutoPlayUseCase, "changeAutoPlayUseCase");
        Intrinsics.checkNotNullParameter(networkManager, "networkManager");
        this.d = getOenMetaDataUseCase;
        this.f10127e = getUserSettingsUseCase;
        this.f10128f = getOwnUserIdUseCase;
        this.f10129g = getUserAuthLevelUseCase;
        this.f10130h = logOutUseCase;
        this.f10131i = changeUserOrientationUseCase;
        this.f10132j = changeAutoRotationUseCase;
        this.f10133k = changeAutoPlayUseCase;
        this.f10134l = networkManager;
        p<Optional<UserMetaData>> pVar = new p<>();
        this.f10135m = pVar;
        this.n = new p<>();
        a aVar = new a();
        this.f10136o = aVar;
        pVar.l(OptionalKt.asOptional(getOenMetaDataUseCase.a()));
        networkManager.c(aVar);
    }

    @Override // v3.d, androidx.lifecycle.x
    public void a() {
        this.f16001c.dispose();
        this.f10134l.b(this.f10136o);
    }

    public final boolean c() {
        return Intrinsics.areEqual(this.n.d(), Boolean.TRUE);
    }
}
