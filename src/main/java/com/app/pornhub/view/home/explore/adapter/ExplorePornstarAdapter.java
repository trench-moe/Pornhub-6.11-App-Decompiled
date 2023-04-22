package com.app.pornhub.view.home.explore.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ExploreItemPornstarBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;
import o4.h;

/* loaded from: classes.dex */
public final class ExplorePornstarAdapter extends t<Item, a> {

    /* renamed from: f  reason: collision with root package name */
    public final ExploreOptions f5212f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5213g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5214h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5215i;

    /* renamed from: j  reason: collision with root package name */
    public d f5216j;

    /* renamed from: k  reason: collision with root package name */
    public final z3.b f5217k;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExplorePornstarAdapter$Item$Performer;", "Lcom/app/pornhub/view/home/explore/adapter/ExplorePornstarAdapter$Item;", "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "component1", "performer", "Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "a", "()Lcom/app/pornhub/domain/model/performer/PerformerMetaData;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class Performer extends Item {
            private final PerformerMetaData performer;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Performer(PerformerMetaData performer) {
                super(null);
                Intrinsics.checkNotNullParameter(performer, "performer");
                this.performer = performer;
            }

            public final PerformerMetaData a() {
                return this.performer;
            }

            public final PerformerMetaData component1() {
                return this.performer;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Performer) && Intrinsics.areEqual(this.performer, ((Performer) obj).performer)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.performer.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Performer(performer=");
                m10.append(this.performer);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5218a = new a();

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
    public static abstract class a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final x1.a f5219u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5219u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class b extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ExplorePornstarAdapter this$0, ItemViewMoreBinding moreBinding) {
            super(moreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(moreBinding, "moreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    /* loaded from: classes.dex */
    public final class c extends a {

        /* renamed from: v  reason: collision with root package name */
        public final ExploreItemPornstarBinding f5220v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ExplorePornstarAdapter f5221w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExplorePornstarAdapter this$0, ExploreItemPornstarBinding pornstarBinding) {
            super(pornstarBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pornstarBinding, "pornstarBinding");
            this.f5221w = this$0;
            this.f5220v = pornstarBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.Performer) {
                Item.Performer performer = (Item.Performer) item;
                com.bumptech.glide.b.e(this.f5220v.f4528e).o(performer.a().getThumb()).j(this.f5221w.f5213g ? R.drawable.pornstar_thumb_male_placeholder : R.drawable.pornstar_thumb_female_placeholder).A(this.f5220v.f4528e);
                int i10 = 8;
                this.f5220v.d.setVisibility(performer.a().isVerified() ? 0 : 8);
                this.f5220v.f4527c.setVisibility(performer.a().isPremium() ? 0 : 8);
                ImageView imageView = this.f5220v.f4526b;
                Intrinsics.checkNotNullExpressionValue(imageView, "pornstarBinding.imageViewIconAward");
                if (performer.a().getTrophy()) {
                    i10 = 0;
                }
                imageView.setVisibility(i10);
                Context context = this.f2885a.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                this.f5220v.f4529f.setText(performer.a().getName());
                this.f5220v.f4531h.setText(context.getResources().getQuantityString(R.plurals.plural_n_videos, performer.a().getNumberOfVideos(), a0.b.Y(String.valueOf(performer.a().getNumberOfVideos()))));
                this.f5220v.f4532i.setText(context.getResources().getQuantityString(R.plurals.plural_n_views, a0.b.g0(performer.a().getViews()), a0.b.Y(performer.a().getViews())));
                this.f5220v.f4530g.setText(performer.a().getRank());
                String rating = performer.a().getRating();
                if (Intrinsics.areEqual(rating, PerformersConfig.RATING_UP)) {
                    this.f5220v.f4530g.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_rank_up, 0);
                } else if (Intrinsics.areEqual(rating, PerformersConfig.RATING_DOWN)) {
                    this.f5220v.f4530g.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_rank_down, 0);
                } else {
                    this.f5220v.f4530g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                }
                this.f5220v.f4525a.setTag(performer.a());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorePornstarAdapter(ExploreOptions exploreOptions, boolean z10, int i10) {
        super(new h());
        z10 = (i10 & 2) != 0 ? false : z10;
        this.f5212f = exploreOptions;
        this.f5213g = z10;
        this.f5214h = 400;
        this.f5215i = 401;
        this.f5217k = new z3.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.Performer) {
            return this.f5214h;
        }
        if (item instanceof Item.a) {
            return this.f5215i;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5217k.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        a holder = (a) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.f2969f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "getItem(position)");
        holder.x((Item) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i10 == this.f5214h) {
            ExploreItemPornstarBinding bind = ExploreItemPornstarBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item_pornstar, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, bind);
            cVar.f5220v.f4525a.setOnClickListener(new b4.b(this, 5));
            return cVar;
        } else if (i10 == this.f5215i) {
            ItemViewMoreBinding a10 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            b bVar = new b(this, a10);
            bVar.f5219u.b().setOnClickListener(new x3.a(this, 6));
            return bVar;
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
