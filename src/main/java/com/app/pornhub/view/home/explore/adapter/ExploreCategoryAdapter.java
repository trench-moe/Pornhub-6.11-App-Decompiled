package com.app.pornhub.view.home.explore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.ExploreItemCategoryBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.model.category.Category;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;

/* loaded from: classes.dex */
public final class ExploreCategoryAdapter extends t<Item, b> {

    /* renamed from: f  reason: collision with root package name */
    public final int f5188f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5189g;

    /* renamed from: h  reason: collision with root package name */
    public d f5190h;

    /* renamed from: i  reason: collision with root package name */
    public final z f5191i;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExploreCategoryAdapter$Item$CategoryItem;", "Lcom/app/pornhub/view/home/explore/adapter/ExploreCategoryAdapter$Item;", "Lcom/app/pornhub/domain/model/category/Category;", "component1", ExploreModel.CATEGORY, "Lcom/app/pornhub/domain/model/category/Category;", "a", "()Lcom/app/pornhub/domain/model/category/Category;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class CategoryItem extends Item {
            private final Category category;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CategoryItem(Category category) {
                super(null);
                Intrinsics.checkNotNullParameter(category, "category");
                this.category = category;
            }

            public final Category a() {
                return this.category;
            }

            public final Category component1() {
                return this.category;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof CategoryItem) && Intrinsics.areEqual(this.category, ((CategoryItem) obj).category)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.category.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("CategoryItem(category=");
                m10.append(this.category);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5192a = new a();

            public a() {
                super(null);
            }
        }

        public Item() {
        }

        public Item(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public final class a extends b {

        /* renamed from: x  reason: collision with root package name */
        public static final /* synthetic */ int f5193x = 0;

        /* renamed from: v  reason: collision with root package name */
        public final ExploreItemCategoryBinding f5194v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ExploreCategoryAdapter f5195w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExploreCategoryAdapter this$0, ExploreItemCategoryBinding categoryBinding) {
            super(categoryBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(categoryBinding, "categoryBinding");
            this.f5195w = this$0;
            this.f5194v = categoryBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.CategoryItem) {
                this.f2885a.setOnClickListener(new i4.d(this.f5195w, item, 1));
                Item.CategoryItem categoryItem = (Item.CategoryItem) item;
                this.f5194v.f4518c.setText(categoryItem.a().getName());
                this.f5194v.d.setText(this.f2885a.getResources().getQuantityString(R.plurals.plural_n_videos, categoryItem.a().getVideosCount(), Integer.valueOf(categoryItem.a().getVideosCount())));
                com.bumptech.glide.b.e(this.f5194v.f4517b).o(categoryItem.a().getImageUrl()).j(R.drawable.thumb_preview).A(this.f5194v.f4517b);
                this.f5194v.f4516a.setTag(categoryItem.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final x1.a f5196u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5196u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class c extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExploreCategoryAdapter this$0, ItemViewMoreBinding moreBinding) {
            super(moreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(moreBinding, "moreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    public ExploreCategoryAdapter() {
        super(new o4.b());
        this.f5188f = 300;
        this.f5189g = 301;
        this.f5191i = new z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.CategoryItem) {
            return this.f5188f;
        }
        if (item instanceof Item.a) {
            return this.f5189g;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5191i.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        b holder = (b) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.f2969f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "getItem(position)");
        holder.x((Item) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == this.f5188f) {
            ExploreItemCategoryBinding bind = ExploreItemCategoryBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item_category, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            a aVar = new a(this, bind);
            aVar.f5194v.f4516a.setOnClickListener(new u3.a(this, 9));
            return aVar;
        } else if (i10 == this.f5189g) {
            ItemViewMoreBinding a10 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, a10);
            cVar.f5196u.b().setOnClickListener(new b4.b(this, 4));
            return cVar;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Unknown view type ", Integer.valueOf(i10)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setOnFlingListener(null);
    }
}
