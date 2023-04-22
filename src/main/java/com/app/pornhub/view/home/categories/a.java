package com.app.pornhub.view.home.categories;

import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import d3.g;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import x2.a0;
import x2.z;

/* loaded from: classes.dex */
public class a implements CategoryAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CategoriesFragment f5115a;

    public a(CategoriesFragment categoriesFragment) {
        this.f5115a = categoriesFragment;
    }

    public void a(Set<Category> set) {
        CategoriesFragment categoriesFragment = this.f5115a;
        categoriesFragment.f5099v0.setText(String.valueOf(set.size()));
        if (set.size() != 0 && set.size() < 2) {
            b bVar = categoriesFragment.f5093p0;
            Category category = set.iterator().next();
            Objects.requireNonNull(bVar);
            Intrinsics.checkNotNullParameter(category, "category");
            g gVar = bVar.f5117f;
            String categoryId = category.getId();
            Objects.requireNonNull(gVar);
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            Observable startWith = gVar.f8756a.c(categoryId).toObservable().map(z.n).onErrorReturn(a0.f17674t).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(startWith, "categoriesRepository.get…th(UseCaseResult.Loading)");
            Disposable subscribe = startWith.subscribe(new x2.b(bVar, 7));
            Intrinsics.checkNotNullExpressionValue(subscribe, "getValidCategoryComboIds…          }\n            }");
            DisposableKt.addTo(subscribe, bVar.f16001c);
        }
    }
}
