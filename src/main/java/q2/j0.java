package q2;

import android.content.Context;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import x2.j1;
import x2.o0;

/* loaded from: classes2.dex */
public final class j0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14257a;

    /* renamed from: b  reason: collision with root package name */
    public final cb.e f14258b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14259c;
    public final ie.a d;

    /* renamed from: e  reason: collision with root package name */
    public final ie.a f14260e;

    /* renamed from: f  reason: collision with root package name */
    public final ie.a f14261f;

    /* renamed from: g  reason: collision with root package name */
    public final ie.a f14262g;

    public /* synthetic */ j0(cb.e eVar, ie.a aVar, ie.a aVar2, ie.a aVar3, ie.a aVar4, ie.a aVar5, int i10) {
        this.f14257a = i10;
        this.f14258b = eVar;
        this.f14259c = aVar;
        this.d = aVar2;
        this.f14260e = aVar3;
        this.f14261f = aVar4;
        this.f14262g = aVar5;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14257a) {
            case 0:
                cb.e eVar = this.f14258b;
                w2.g exploreService = (w2.g) this.f14259c.get();
                b3.e currentUserRepository = (b3.e) this.d.get();
                s2.a modelMapper = (s2.a) this.f14260e.get();
                r2.a serializationHelper = (r2.a) this.f14261f.get();
                y2.a exceptionMapper = (y2.a) this.f14262g.get();
                Objects.requireNonNull(eVar);
                Intrinsics.checkNotNullParameter(exploreService, "exploreService");
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
                Intrinsics.checkNotNullParameter(serializationHelper, "serializationHelper");
                Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
                return new o0(exploreService, currentUserRepository, modelMapper, serializationHelper, exceptionMapper);
            default:
                cb.e eVar2 = this.f14258b;
                Context context = (Context) this.f14259c.get();
                w2.l pronStoreService = (w2.l) this.d.get();
                w2.n updateDownloadService = (w2.n) this.f14260e.get();
                y2.a exceptionMapper2 = (y2.a) this.f14261f.get();
                String androidId = (String) this.f14262g.get();
                Objects.requireNonNull(eVar2);
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(pronStoreService, "pronStoreService");
                Intrinsics.checkNotNullParameter(updateDownloadService, "updateDownloadService");
                Intrinsics.checkNotNullParameter(exceptionMapper2, "exceptionMapper");
                Intrinsics.checkNotNullParameter(androidId, "androidId");
                return new j1(context, pronStoreService, updateDownloadService, exceptionMapper2, androidId);
        }
    }
}
