package com.app.pornhub.view.home.categories;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.view.common.widget.CategoryImageViewCustom;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CategoryAdapter extends RecyclerView.Adapter<c> {

    /* renamed from: g  reason: collision with root package name */
    public a f5106g;
    public final List<Item> d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet<Category> f5104e = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    public final HashSet<String> f5105f = new HashSet<>();

    /* renamed from: h  reason: collision with root package name */
    public final View.OnClickListener f5107h = new x3.a(this, 5);

    /* renamed from: i  reason: collision with root package name */
    public final View.OnClickListener f5108i = new x3.b(this, 5);

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/app/pornhub/view/home/categories/CategoryAdapter$Item;", BuildConfig.FLAVOR, "Lcom/app/pornhub/view/home/categories/CategoryAdapter$d;", "component1", "itemType", "Lcom/app/pornhub/view/home/categories/CategoryAdapter$d;", "b", "()Lcom/app/pornhub/view/home/categories/CategoryAdapter$d;", "Lcom/app/pornhub/domain/model/category/Category;", ExploreModel.CATEGORY, "Lcom/app/pornhub/domain/model/category/Category;", "a", "()Lcom/app/pornhub/domain/model/category/Category;", BuildConfig.FLAVOR, "isVerified", "Z", DvdsConfig.TYPE_CATEGORY, "()Z", "isSelected", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class Item {
        private final Category category;
        private final boolean isSelected;
        private final boolean isVerified;
        private final d itemType;

        public Item(d itemType, Category category, boolean z10, boolean z11, int i10) {
            category = (i10 & 2) != 0 ? null : category;
            z10 = (i10 & 4) != 0 ? false : z10;
            z11 = (i10 & 8) != 0 ? false : z11;
            Intrinsics.checkNotNullParameter(itemType, "itemType");
            this.itemType = itemType;
            this.category = category;
            this.isVerified = z10;
            this.isSelected = z11;
        }

        public final Category a() {
            return this.category;
        }

        public final d b() {
            return this.itemType;
        }

        public final boolean c() {
            return this.isVerified;
        }

        public final d component1() {
            return this.itemType;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Item) {
                Item item = (Item) obj;
                if (Intrinsics.areEqual(this.itemType, item.itemType) && Intrinsics.areEqual(this.category, item.category) && this.isVerified == item.isVerified && this.isSelected == item.isSelected) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.itemType.hashCode() * 31;
            Category category = this.category;
            int hashCode2 = (hashCode + (category == null ? 0 : category.hashCode())) * 31;
            boolean z10 = this.isVerified;
            int i10 = 1;
            int i11 = z10;
            if (z10 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            boolean z11 = this.isSelected;
            if (!z11) {
                i10 = z11 ? 1 : 0;
            }
            return i12 + i10;
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("Item(itemType=");
            m10.append(this.itemType);
            m10.append(", category=");
            m10.append(this.category);
            m10.append(", isVerified=");
            m10.append(this.isVerified);
            m10.append(", isSelected=");
            return a0.a.l(m10, this.isSelected, ')');
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public final class b extends c {

        /* renamed from: u  reason: collision with root package name */
        public final View f5109u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ CategoryAdapter f5110v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CategoryAdapter this$0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5110v = this$0;
            this.f5109u = view;
        }

        @Override // com.app.pornhub.view.home.categories.CategoryAdapter.c
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Category a10 = item.a();
            if (a10 == null) {
                return;
            }
            ((TextView) this.f5109u.findViewById(R.id.categoryTitle)).setText(a10.getName());
            ((ImageView) this.f5109u.findViewById(R.id.icVerified)).setVisibility(item.c() ? 0 : 8);
            com.bumptech.glide.b.e((CategoryImageViewCustom) this.f5109u.findViewById(R.id.categoryImage)).o(item.a().getImageUrl()).A((CategoryImageViewCustom) this.f5109u.findViewById(R.id.categoryImage));
            ((ImageView) this.f5109u.findViewById(R.id.categorySelectionImage)).setTag(item);
            ((ImageView) this.f5109u.findViewById(R.id.categorySelectionImage)).setOnClickListener(this.f5110v.f5107h);
            ((CategoryImageViewCustom) this.f5109u.findViewById(R.id.categoryImage)).setTag(item);
            ((CategoryImageViewCustom) this.f5109u.findViewById(R.id.categoryImage)).setOnClickListener(this.f5110v.f5108i);
            int size = this.f5110v.f5104e.size();
            if (size == 0) {
                ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(0);
                CategoryAdapter.m(this.f5110v, false, this.f5109u);
            } else if (size == 2) {
                if (this.f5110v.f5104e.contains(item.a())) {
                    ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(0);
                    CategoryAdapter.m(this.f5110v, true, this.f5109u);
                    return;
                }
                ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(4);
                CategoryAdapter.m(this.f5110v, false, this.f5109u);
            } else if (this.f5110v.f5104e.contains(item.a())) {
                ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(0);
                CategoryAdapter.m(this.f5110v, true, this.f5109u);
            } else if (this.f5110v.f5105f.contains(item.a().getId())) {
                ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(0);
                CategoryAdapter.m(this.f5110v, false, this.f5109u);
            } else {
                ((LinearLayout) this.f5109u.findViewById(R.id.categorySelectionContainer)).setVisibility(4);
                CategoryAdapter.m(this.f5110v, false, this.f5109u);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5111a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5112a = new b();

            public b() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class c extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final c f5113a = new c();

            public c() {
                super(null);
            }
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public final class e extends c {

        /* renamed from: u  reason: collision with root package name */
        public final View f5114u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CategoryAdapter this$0, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(view, "view");
            this.f5114u = view;
        }

        @Override // com.app.pornhub.view.home.categories.CategoryAdapter.c
        public void x(Item item) {
            String string;
            Intrinsics.checkNotNullParameter(item, "item");
            TextView textView = (TextView) this.f5114u.findViewById(R.id.fragment_category_list_separator_title);
            d b10 = item.b();
            if (b10 instanceof d.c) {
                string = this.f5114u.getContext().getString(R.string.top_categories);
            } else if (!(b10 instanceof d.b)) {
                throw new IllegalStateException("Unsupported header");
            } else {
                string = this.f5114u.getContext().getString(R.string.all_categories);
            }
            textView.setText(string);
        }
    }

    public static final void m(CategoryAdapter categoryAdapter, boolean z10, View view) {
        Objects.requireNonNull(categoryAdapter);
        if (z10) {
            ((ImageView) view.findViewById(R.id.categorySelectionImage)).setImageResource(R.drawable.ic_categoryselected);
            ((TextView) view.findViewById(R.id.categorySelectionText)).setTextColor(c0.a.b(view.getContext(), R.color.black));
            ((TextView) view.findViewById(R.id.categorySelectionText)).setText(R.string.remove);
            view.setBackgroundColor(c0.a.b(view.getContext(), R.color.orange));
            return;
        }
        ((ImageView) view.findViewById(R.id.categorySelectionImage)).setImageResource(R.drawable.ic_addcategory);
        ((TextView) view.findViewById(R.id.categorySelectionText)).setTextColor(c0.a.b(view.getContext(), R.color.white));
        ((TextView) view.findViewById(R.id.categorySelectionText)).setText(R.string.add);
        view.setBackgroundColor(c0.a.b(view.getContext(), R.color.pornhub_grey_dark));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int a() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        d b10 = this.d.get(i10).b();
        if (b10 instanceof d.c ? true : Intrinsics.areEqual(b10, d.b.f5112a)) {
            return 0;
        }
        if (b10 instanceof d.a) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(c cVar, int i10) {
        c holder = cVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.x(this.d.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public c i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == 0) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_categories_list_separator, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(parent.context).inf…  false\n                )");
            return new e(this, inflate);
        } else if (i10 == 1) {
            View inflate2 = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_categories_grid_item, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "from(parent.context).inf…  false\n                )");
            return new b(this, inflate2);
        } else {
            throw new IllegalStateException("Unknown view type!");
        }
    }
}
