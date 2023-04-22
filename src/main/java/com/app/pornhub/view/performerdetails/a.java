package com.app.pornhub.view.performerdetails;

import androidx.lifecycle.p;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import f3.o;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import java.util.Objects;
import k3.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import v3.d;
import x2.a0;
import x2.i1;
import x2.k0;
import x2.z;

/* loaded from: classes.dex */
public final class a extends d {
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final c f5411e;

    /* renamed from: f  reason: collision with root package name */
    public final p<PerformerContainer> f5412f;

    /* renamed from: g  reason: collision with root package name */
    public final p<List<VideoMetaData>> f5413g;

    /* renamed from: h  reason: collision with root package name */
    public final p<z3.a<AbstractC0058a>> f5414h;

    /* renamed from: i  reason: collision with root package name */
    public String f5415i;

    /* renamed from: j  reason: collision with root package name */
    public String f5416j;

    /* renamed from: k  reason: collision with root package name */
    public PerformersConfig.PerformerType f5417k;

    /* renamed from: com.app.pornhub.view.performerdetails.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0058a {

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0059a extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0059a f5418a = new C0059a();

            public C0059a() {
                super(null);
            }
        }

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$b */
        /* loaded from: classes.dex */
        public static final class b extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5419a;

            /* renamed from: b  reason: collision with root package name */
            public final Throwable f5420b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z10, Throwable throwable) {
                super(null);
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.f5419a = z10;
                this.f5420b = throwable;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    return this.f5419a == bVar.f5419a && Intrinsics.areEqual(this.f5420b, bVar.f5420b);
                }
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            public int hashCode() {
                boolean z10 = this.f5419a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return this.f5420b.hashCode() + (r02 * 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Error(isGay=");
                m10.append(this.f5419a);
                m10.append(", throwable=");
                m10.append(this.f5420b);
                m10.append(')');
                return m10.toString();
            }
        }

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$c */
        /* loaded from: classes.dex */
        public static final class c extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5421a = new c();

            public c() {
                super(null);
            }
        }

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$d */
        /* loaded from: classes.dex */
        public static final class d extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f5422a = new d();

            public d() {
                super(null);
            }
        }

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$e */
        /* loaded from: classes.dex */
        public static final class e extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f5423a = new e();

            public e() {
                super(null);
            }
        }

        /* renamed from: com.app.pornhub.view.performerdetails.a$a$f */
        /* loaded from: classes.dex */
        public static final class f extends AbstractC0058a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f5424a = new f();

            public f() {
                super(null);
            }
        }

        public AbstractC0058a() {
        }

        public AbstractC0058a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public a(o getUserSettingsUseCase, c getPerformerUseCase) {
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getPerformerUseCase, "getPerformerUseCase");
        this.d = getUserSettingsUseCase;
        this.f5411e = getPerformerUseCase;
        this.f5412f = new p<>();
        this.f5413g = new p<>();
        this.f5414h = new p<>();
        this.f5416j = BuildConfig.FLAVOR;
    }

    public final void c(String slug, int i10) {
        Observable error;
        c cVar = this.f5411e;
        PerformersConfig.PerformerType performerType = this.f5417k;
        String str = this.f5415i;
        Integer valueOf = Integer.valueOf(i10);
        Objects.requireNonNull(cVar);
        Intrinsics.checkNotNullParameter(slug, "slug");
        if (performerType instanceof PerformersConfig.PerformerType.Pornstar) {
            error = cVar.f11780a.d(slug, str == null ? PerformersConfig.DEFAULT_VIDEOS_ORDER : str, 8, valueOf == null ? 0 : valueOf.intValue(), false).toObservable().map(i1.B).onErrorReturn(z.G).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(error, "{\n                perfor…lt.Loading)\n            }");
        } else if (performerType instanceof PerformersConfig.PerformerType.Model) {
            error = cVar.f11780a.i(slug, str == null ? PerformersConfig.DEFAULT_VIDEOS_ORDER : str, 8, valueOf == null ? 0 : valueOf.intValue(), false).toObservable().map(a0.J).onErrorReturn(k0.C).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(error, "{\n                perfor…lt.Loading)\n            }");
        } else {
            error = Observable.error(new IllegalStateException("Unknown performer type"));
            Intrinsics.checkNotNullExpressionValue(error, "error(\n                I…rmer type\")\n            )");
        }
        Disposable subscribe = error.subscribe(new y3.b(this, slug, 3));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getPerformerUseCase.exec…          }\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }

    public final void d(int i10) {
        Performer performer;
        PerformerMetaData performerMetaData;
        PerformerContainer d = this.f5412f.d();
        String str = null;
        if (d != null && (performer = d.getPerformer()) != null && (performerMetaData = performer.getPerformerMetaData()) != null) {
            str = performerMetaData.getSlug();
        }
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        c(str, i10);
    }
}
