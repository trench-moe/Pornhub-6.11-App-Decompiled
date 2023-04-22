package d3;

import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x2.k0;
import x2.l0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b3.b f8750a;

    public c(b3.b categoriesRepository) {
        Intrinsics.checkNotNullParameter(categoriesRepository, "categoriesRepository");
        this.f8750a = categoriesRepository;
    }

    public final Observable<UseCaseResult<List<Category>>> a(Collection<String> categoryIds) {
        Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
        Observable<UseCaseResult<List<Category>>> startWith = this.f8750a.b(categoryIds).toObservable().map(k0.f17768m).onErrorReturn(l0.f17785m).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "categoriesRepository.get…th(UseCaseResult.Loading)");
        return startWith;
    }
}
