package d3;

import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.usecase.UseCaseResult;
import io.reactivex.Observable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import x2.i1;
import x2.z;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b3.b f8747a;

    public a(b3.b categoriesRepository) {
        Intrinsics.checkNotNullParameter(categoriesRepository, "categoriesRepository");
        this.f8747a = categoriesRepository;
    }

    public final Observable<UseCaseResult<List<Category>>> a() {
        Observable<UseCaseResult<List<Category>>> startWith = this.f8747a.f().map(i1.f17746m).onErrorReturn(z.f17901j).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "categoriesRepository.get…th(UseCaseResult.Loading)");
        return startWith;
    }
}
