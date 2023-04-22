package com.app.pornhub.view.home.categories;

import androidx.lifecycle.p;
import com.app.pornhub.domain.model.category.Category;
import d3.e;
import d3.g;
import f3.c;
import f3.m;
import f3.o;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.i;
import v3.d;

/* loaded from: classes.dex */
public final class b extends d {
    public final e d;

    /* renamed from: e  reason: collision with root package name */
    public final d3.a f5116e;

    /* renamed from: f  reason: collision with root package name */
    public final g f5117f;

    /* renamed from: g  reason: collision with root package name */
    public final c f5118g;

    /* renamed from: h  reason: collision with root package name */
    public final i f5119h;

    /* renamed from: i  reason: collision with root package name */
    public final o f5120i;

    /* renamed from: j  reason: collision with root package name */
    public final p<z3.a<a>> f5121j;

    /* renamed from: k  reason: collision with root package name */
    public final p<Pair<List<Category>, List<Category>>> f5122k;

    /* renamed from: l  reason: collision with root package name */
    public final p<List<String>> f5123l;

    /* loaded from: classes.dex */
    public static abstract class a {

        /* renamed from: com.app.pornhub.view.home.categories.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0052a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5124a;

            public C0052a(boolean z10) {
                super(null);
                this.f5124a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0052a) && this.f5124a == ((C0052a) obj).f5124a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5124a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("ComboLoading(isLoading="), this.f5124a, ')');
            }
        }

        /* renamed from: com.app.pornhub.view.home.categories.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0053b extends a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5125a;

            public C0053b(boolean z10) {
                super(null);
                this.f5125a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0053b) && this.f5125a == ((C0053b) obj).f5125a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [int] */
            /* JADX WARN: Type inference failed for: r0v2 */
            /* JADX WARN: Type inference failed for: r0v3 */
            public int hashCode() {
                boolean z10 = this.f5125a;
                ?? r02 = z10;
                if (z10) {
                    r02 = 1;
                }
                return r02;
            }

            public String toString() {
                return a0.a.l(a1.a.m("Error(isGay="), this.f5125a, ')');
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5126a = new c();

            public c() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f5127a;

            public d(boolean z10) {
                super(null);
                this.f5127a = z10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f5127a == ((d) obj).f5127a;
            }

            public int hashCode() {
                boolean z10 = this.f5127a;
                if (z10) {
                    return 1;
                }
                return z10 ? 1 : 0;
            }

            public String toString() {
                return a0.a.l(a1.a.m("Loading(isLoading="), this.f5127a, ')');
            }
        }

        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public b(e getTopCategoriesUseCase, d3.a getAllCategoriesUseCase, g getValidCategoryComboIdsUseCase, c changeUserOrientationUseCase, i saveVideoFiltersUseCase, o getUserSettingsUseCase, m getUserOrientationObservableUseCase) {
        Intrinsics.checkNotNullParameter(getTopCategoriesUseCase, "getTopCategoriesUseCase");
        Intrinsics.checkNotNullParameter(getAllCategoriesUseCase, "getAllCategoriesUseCase");
        Intrinsics.checkNotNullParameter(getValidCategoryComboIdsUseCase, "getValidCategoryComboIdsUseCase");
        Intrinsics.checkNotNullParameter(changeUserOrientationUseCase, "changeUserOrientationUseCase");
        Intrinsics.checkNotNullParameter(saveVideoFiltersUseCase, "saveVideoFiltersUseCase");
        Intrinsics.checkNotNullParameter(getUserSettingsUseCase, "getUserSettingsUseCase");
        Intrinsics.checkNotNullParameter(getUserOrientationObservableUseCase, "getUserOrientationObservableUseCase");
        this.d = getTopCategoriesUseCase;
        this.f5116e = getAllCategoriesUseCase;
        this.f5117f = getValidCategoryComboIdsUseCase;
        this.f5118g = changeUserOrientationUseCase;
        this.f5119h = saveVideoFiltersUseCase;
        this.f5120i = getUserSettingsUseCase;
        this.f5121j = new p<>();
        this.f5122k = new p<>();
        this.f5123l = new p<>();
        Disposable subscribe = getUserOrientationObservableUseCase.a(true).subscribe(new x2.c(this, 12));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getUserOrientationObserv…fetchData()\n            }");
        DisposableKt.addTo(subscribe, this.f16001c);
    }
}
