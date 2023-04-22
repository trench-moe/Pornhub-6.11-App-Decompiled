package x2;

import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.domain.model.search.SearchSuggestions;
import com.app.pornhub.domain.model.user.UserOrientation;
import io.reactivex.Single;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d1 implements b3.l {

    /* renamed from: a  reason: collision with root package name */
    public final w2.m f17709a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17710b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17711c;
    public final b3.e d;

    public d1(w2.m searchSuggestionsService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(searchSuggestionsService, "searchSuggestionsService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17709a = searchSuggestionsService;
        this.f17710b = modelMapper;
        this.f17711c = exceptionMapper;
        this.d = currentUserRepository;
    }

    @Override // b3.l
    public Single<SearchSuggestions> a(String query, SearchSuggestionsConfig.SearchSource source) {
        String str;
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(source, "source");
        w2.m mVar = this.f17709a;
        UserOrientation userOrientation = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        Single<SearchSuggestions> map = m9.a.i(mVar.a(str, query, SearchSuggestionsConfig.Companion.getSearchSourceName(source))).doOnError(new m(this, 3)).map(new k(this, 7));
        Intrinsics.checkNotNullExpressionValue(map, "searchSuggestionsService…esponse(it)\n            }");
        return map;
    }
}
