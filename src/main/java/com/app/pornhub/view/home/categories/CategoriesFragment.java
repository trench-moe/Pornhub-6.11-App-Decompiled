package com.app.pornhub.view.home.categories;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.CategoriesConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import g4.o;
import g4.p;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import v3.c;

/* loaded from: classes.dex */
public class CategoriesFragment extends c {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f5092y0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public com.app.pornhub.view.home.categories.b f5093p0;

    /* renamed from: q0  reason: collision with root package name */
    public NavigationViewModel f5094q0;

    /* renamed from: r0  reason: collision with root package name */
    public HomeActivityViewModel f5095r0;

    /* renamed from: s0  reason: collision with root package name */
    public RecyclerView f5096s0;

    /* renamed from: t0  reason: collision with root package name */
    public CategoryAdapter f5097t0;

    /* renamed from: u0  reason: collision with root package name */
    public GridLayoutManager f5098u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f5099v0;
    public ProgressBar w0;

    /* renamed from: x0  reason: collision with root package name */
    public LinearLayout f5100x0;

    /* loaded from: classes.dex */
    public class a extends GridLayoutManager.b {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int c(int r6) {
            /*
                r5 = this;
                com.app.pornhub.view.home.categories.CategoriesFragment r0 = com.app.pornhub.view.home.categories.CategoriesFragment.this
                java.lang.String r4 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                com.app.pornhub.view.home.categories.CategoryAdapter r0 = r0.f5097t0
                java.util.List<com.app.pornhub.view.home.categories.CategoryAdapter$Item> r1 = r0.d
                r4 = 2
                java.lang.Object r3 = r1.get(r6)
                r1 = r3
                com.app.pornhub.view.home.categories.CategoryAdapter$Item r1 = (com.app.pornhub.view.home.categories.CategoryAdapter.Item) r1
                com.app.pornhub.view.home.categories.CategoryAdapter$d r1 = r1.b()
                com.app.pornhub.view.home.categories.CategoryAdapter$d$c r2 = com.app.pornhub.view.home.categories.CategoryAdapter.d.c.f5113a
                r4 = 5
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
                r2 = 1
                if (r1 != 0) goto L3a
                r4 = 5
                java.util.List<com.app.pornhub.view.home.categories.CategoryAdapter$Item> r0 = r0.d
                java.lang.Object r6 = r0.get(r6)
                com.app.pornhub.view.home.categories.CategoryAdapter$Item r6 = (com.app.pornhub.view.home.categories.CategoryAdapter.Item) r6
                r4 = 2
                com.app.pornhub.view.home.categories.CategoryAdapter$d r6 = r6.b()
                com.app.pornhub.view.home.categories.CategoryAdapter$d$b r0 = com.app.pornhub.view.home.categories.CategoryAdapter.d.b.f5112a
                boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r0)
                if (r6 == 0) goto L36
                r4 = 6
                goto L3a
            L36:
                r4 = 5
                r6 = 0
                r4 = 1
                goto L3b
            L3a:
                r6 = 1
            L3b:
                if (r6 == 0) goto L45
                r4 = 5
                com.app.pornhub.view.home.categories.CategoriesFragment r6 = com.app.pornhub.view.home.categories.CategoriesFragment.this
                androidx.recyclerview.widget.GridLayoutManager r6 = r6.f5098u0
                int r2 = r6.F
                r4 = 7
            L45:
                r4 = 5
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.categories.CategoriesFragment.a.c(int):int");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.k {

        /* renamed from: a  reason: collision with root package name */
        public int f5102a;

        public b(Context context) {
            this.f5102a = context.getResources().getDimensionPixelSize(R.dimen.item_grid_spacing_small);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k
        public void d(Rect rect, View view, RecyclerView recyclerView, RecyclerView.w wVar) {
            int i10 = this.f5102a;
            rect.left = i10;
            rect.right = i10;
            rect.bottom = i10;
            rect.top = i10;
        }
    }

    public CategoriesFragment() {
        super(R.layout.fragment_categories);
    }

    public final void M0(List<Category> categories) {
        Object obj;
        com.app.pornhub.view.home.categories.b bVar = this.f5093p0;
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(categories, "categories");
        Iterator<T> it = categories.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((Category) obj).getId(), CategoriesConfig.CATEGORY_ID_GAY)) {
                break;
            }
        }
        if (((Category) obj) != null && !UsersConfig.Companion.isGay(bVar.f5120i.a())) {
            bVar.f5118g.a(UserOrientation.Gay.INSTANCE);
        }
        bVar.f5119h.a(new VideoFilters(null, null, null, null, CollectionsKt.joinToString$default(categories, ",", null, null, 0, null, new Function1<Category, CharSequence>() { // from class: com.app.pornhub.view.home.categories.CategoriesViewModel$applyCategories$1
            @Override // kotlin.jvm.functions.Function1
            public CharSequence invoke(Category category) {
                Category it2 = category;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.getName();
            }
        }, 30, null), 15, null));
        NavigationViewModel navigationViewModel = this.f5094q0;
        Objects.requireNonNull(navigationViewModel);
        NavigationViewModel.y(navigationViewModel, null, null, 3);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z zVar = new z(s0(), this.f16000o0);
        this.f5094q0 = (NavigationViewModel) zVar.a(NavigationViewModel.class);
        this.f5095r0 = (HomeActivityViewModel) zVar.a(HomeActivityViewModel.class);
        View inflate = layoutInflater.inflate(R.layout.fragment_categories, viewGroup, false);
        this.w0 = (ProgressBar) inflate.findViewById(R.id.categoriesProgressBar);
        this.f5100x0 = (LinearLayout) inflate.findViewById(R.id.errorLayout);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.categoriesRecyclerView);
        this.f5096s0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(n(), 3);
        this.f5098u0 = gridLayoutManager;
        gridLayoutManager.K = new a();
        this.f5096s0.setLayoutManager(this.f5098u0);
        this.f5096s0.g(new b(u0()));
        ((e0) this.f5096s0.getItemAnimator()).f2972g = false;
        ((TextView) inflate.findViewById(R.id.fragment_category_list_txtClear)).setOnClickListener(new u3.a(this, 7));
        this.f5099v0 = (TextView) inflate.findViewById(R.id.fragment_category_list_txtCount);
        ((LinearLayout) inflate.findViewById(R.id.fragment_category_list_llyApplyAndGo)).setOnClickListener(new b4.b(this, 2));
        t3.a.x(q(), "Home", "Categories");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        RecyclerView recyclerView = this.f5096s0;
        recyclerView.setPadding(recyclerView.getLeft(), this.f5095r0.f5019r, this.f5096s0.getRight(), this.f5096s0.getBottom());
        if (this.f5097t0 == null) {
            CategoryAdapter categoryAdapter = new CategoryAdapter();
            this.f5097t0 = categoryAdapter;
            com.app.pornhub.view.home.categories.a listener = new com.app.pornhub.view.home.categories.a(this);
            Intrinsics.checkNotNullParameter(listener, "listener");
            categoryAdapter.f5106g = listener;
        }
        this.f5096s0.setAdapter(this.f5097t0);
        this.f5093p0.f5122k.f(K(), new g4.c(this, 1));
        this.f5093p0.f5121j.f(K(), new o(this, 1));
        this.f5093p0.f5123l.f(K(), new g4.b(this, 1));
        this.f5095r0.f5013k.f(K(), new p(this, 2));
    }
}
