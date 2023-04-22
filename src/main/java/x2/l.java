package x2;

import android.net.Uri;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.repository.DataWrapper;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class l implements b3.b {

    /* renamed from: a  reason: collision with root package name */
    public final w2.c f17776a;

    /* renamed from: b  reason: collision with root package name */
    public final s2.a f17777b;

    /* renamed from: c  reason: collision with root package name */
    public final y2.a f17778c;
    public final b3.e d;

    /* renamed from: e  reason: collision with root package name */
    public BehaviorSubject<DataWrapper<List<Category>>> f17779e;

    /* renamed from: f  reason: collision with root package name */
    public BehaviorSubject<DataWrapper<List<Category>>> f17780f;

    /* renamed from: g  reason: collision with root package name */
    public Disposable f17781g;

    /* renamed from: h  reason: collision with root package name */
    public UserOrientation f17782h;

    public l(w2.c categoryService, s2.a modelMapper, y2.a exceptionMapper, b3.e currentUserRepository) {
        Intrinsics.checkNotNullParameter(categoryService, "categoryService");
        Intrinsics.checkNotNullParameter(modelMapper, "modelMapper");
        Intrinsics.checkNotNullParameter(exceptionMapper, "exceptionMapper");
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f17776a = categoryService;
        this.f17777b = modelMapper;
        this.f17778c = exceptionMapper;
        this.d = currentUserRepository;
        BehaviorSubject<DataWrapper<List<Category>>> create = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "create<DataWrapper<List<Category>>>()");
        this.f17779e = create;
        BehaviorSubject<DataWrapper<List<Category>>> create2 = BehaviorSubject.create();
        Intrinsics.checkNotNullExpressionValue(create2, "create<DataWrapper<List<Category>>>()");
        this.f17780f = create2;
        this.f17782h = currentUserRepository.i();
    }

    @Override // b3.b
    public String a(String categoryNames) {
        Object obj;
        Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
        DataWrapper<List<Category>> value = this.f17780f.getValue();
        if (value == null || !(value instanceof DataWrapper.Success)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : StringsKt.split$default((CharSequence) categoryNames, new String[]{","}, false, 0, 6, (Object) null)) {
            Iterator it = ((Iterable) ((DataWrapper.Success) value).a()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Category) obj).getName(), str)) {
                    break;
                }
            }
            Category category = (Category) obj;
            arrayList.add(category == null ? null : category.getId());
        }
        return CollectionsKt.joinToString$default(CollectionsKt.filterNotNull(arrayList), "+", null, null, 0, null, null, 62, null);
    }

    @Override // b3.b
    public Single<List<Category>> b(Collection<String> categoryIds) {
        Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
        if (i(this.f17780f)) {
            g();
        }
        Single<List<Category>> single = this.f17780f.map(new k(categoryIds, 0)).take(1L).single(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(single, "allCategoriesSubject\n   …        .single(listOf())");
        return single;
    }

    @Override // b3.b
    public Single<List<String>> c(String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        w2.c cVar = this.f17776a;
        String encode = Uri.encode(CollectionsKt.joinToString$default(h(), ",", null, null, 0, null, null, 62, null));
        Intrinsics.checkNotNullExpressionValue(encode, "encode(getAllCategoryIds().joinToString(\",\"))");
        Single<List<String>> map = m9.a.i(cVar.b(categoryId, encode)).doOnError(new a(this, 1)).map(new d(this, 1));
        Intrinsics.checkNotNullExpressionValue(map, "categoryService.getCateg…dComboIds }\n            }");
        return map;
    }

    @Override // b3.b
    public Single<List<Category>> d(Collection<String> categoryNames) {
        Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
        if (i(this.f17780f)) {
            g();
        }
        Single<List<Category>> single = this.f17780f.map(new j(categoryNames, 0)).take(1L).single(CollectionsKt.emptyList());
        Intrinsics.checkNotNullExpressionValue(single, "allCategoriesSubject\n   …        .single(listOf())");
        return single;
    }

    @Override // b3.b
    public Observable<DataWrapper<List<Category>>> e() {
        if (i(this.f17779e)) {
            g();
        }
        return this.f17779e;
    }

    @Override // b3.b
    public Observable<DataWrapper<List<Category>>> f() {
        if (i(this.f17780f)) {
            g();
        }
        return this.f17780f;
    }

    public final void g() {
        String str;
        w2.c cVar = this.f17776a;
        UserOrientation userOrientation = this.d.i();
        Intrinsics.checkNotNullParameter(userOrientation, "userOrientation");
        if (Intrinsics.areEqual(userOrientation, UserOrientation.Straight.INSTANCE)) {
            str = "straight";
        } else if (!Intrinsics.areEqual(userOrientation, UserOrientation.Gay.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        } else {
            str = "gay";
        }
        this.f17781g = m9.a.i(cVar.a(str)).doOnError(new g(this, 0)).map(new i(this, 0)).subscribe(new h(this, 0), new c(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    public final List<String> h() {
        DataWrapper<List<Category>> value = this.f17780f.getValue();
        ArrayList arrayList = null;
        DataWrapper.Success success = value instanceof DataWrapper.Success ? (DataWrapper.Success) value : null;
        List<Category> list = success == null ? null : (List) success.a();
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (Category category : list) {
                arrayList.add(category.getId());
            }
        }
        if (arrayList == null) {
            arrayList = CollectionsKt.emptyList();
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(io.reactivex.subjects.BehaviorSubject<com.app.pornhub.domain.repository.DataWrapper<java.util.List<com.app.pornhub.domain.model.category.Category>>> r7) {
        /*
            r6 = this;
            boolean r3 = r7.hasValue()
            r0 = r3
            r1 = 1
            r4 = 3
            r2 = 0
            r4 = 5
            if (r0 == 0) goto L25
            r4 = 5
            java.lang.Object r7 = r7.getValue()
            boolean r7 = r7 instanceof com.app.pornhub.domain.repository.DataWrapper.Error
            if (r7 != 0) goto L25
            r4 = 5
            b3.e r7 = r6.d
            com.app.pornhub.domain.model.user.UserOrientation r7 = r7.i()
            com.app.pornhub.domain.model.user.UserOrientation r0 = r6.f17782h
            r5 = 7
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r0)
            r7 = r3
            if (r7 != 0) goto L3d
        L25:
            io.reactivex.disposables.Disposable r7 = r6.f17781g
            r4 = 7
            if (r7 == 0) goto L39
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            r5 = 2
            boolean r3 = r7.isDisposed()
            r7 = r3
            if (r7 != 0) goto L39
            r4 = 7
            r3 = 1
            r7 = r3
            goto L3a
        L39:
            r7 = 0
        L3a:
            if (r7 != 0) goto L3d
            goto L40
        L3d:
            r4 = 1
            r3 = 0
            r1 = r3
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.l.i(io.reactivex.subjects.BehaviorSubject):boolean");
    }
}
