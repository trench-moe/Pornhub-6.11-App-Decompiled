package com.app.pornhub.view.home.explore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.ExploreItemGifBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.gif.GifMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;
import o4.f;

/* loaded from: classes.dex */
public final class ExploreGifAdapter extends t<Item, a> {

    /* renamed from: f  reason: collision with root package name */
    public final ExploreOptions f5204f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5205g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5206h;

    /* renamed from: i  reason: collision with root package name */
    public d f5207i;

    /* renamed from: j  reason: collision with root package name */
    public final z f5208j;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExploreGifAdapter$Item$GifItem;", "Lcom/app/pornhub/view/home/explore/adapter/ExploreGifAdapter$Item;", "Lcom/app/pornhub/domain/model/gif/GifMetaData;", "component1", ExploreModel.GIF, "Lcom/app/pornhub/domain/model/gif/GifMetaData;", "a", "()Lcom/app/pornhub/domain/model/gif/GifMetaData;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class GifItem extends Item {
            private final GifMetaData gif;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GifItem(GifMetaData gif) {
                super(null);
                Intrinsics.checkNotNullParameter(gif, "gif");
                this.gif = gif;
            }

            public final GifMetaData a() {
                return this.gif;
            }

            public final GifMetaData component1() {
                return this.gif;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GifItem) && Intrinsics.areEqual(this.gif, ((GifItem) obj).gif);
            }

            public int hashCode() {
                return this.gif.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("GifItem(gif=");
                m10.append(this.gif);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5209a = new a();

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
        public final x1.a f5210u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5210u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class b extends a {

        /* renamed from: v  reason: collision with root package name */
        public final ExploreItemGifBinding f5211v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ExploreGifAdapter this$0, ExploreItemGifBinding gifBinding) {
            super(gifBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(gifBinding, "gifBinding");
            this.f5211v = gifBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.GifItem) {
                Item.GifItem gifItem = (Item.GifItem) item;
                if (gifItem.a().getUrlThumbnail().length() > 0) {
                    com.bumptech.glide.b.e(this.f5211v.f4523b).o(gifItem.a().getUrlThumbnail()).j(R.drawable.thumb_preview).A(this.f5211v.f4523b);
                }
                this.f5211v.f4524c.setText(gifItem.a().getTitle());
                this.f5211v.f4522a.setTag(gifItem.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExploreGifAdapter this$0, ItemViewMoreBinding moreBinding) {
            super(moreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(moreBinding, "moreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    public ExploreGifAdapter(ExploreOptions exploreOptions) {
        super(new f());
        this.f5204f = exploreOptions;
        this.f5205g = 200;
        this.f5206h = 201;
        this.f5208j = new z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.GifItem) {
            return this.f5205g;
        }
        if (item instanceof Item.a) {
            return this.f5206h;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5208j.a(recyclerView);
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
        if (i10 == this.f5205g) {
            ExploreItemGifBinding bind = ExploreItemGifBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item_gif, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            b bVar = new b(this, bind);
            bVar.f5211v.f4522a.setOnClickListener(new u3.c(this, 7));
            return bVar;
        } else if (i10 == this.f5206h) {
            ItemViewMoreBinding a10 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, a10);
            cVar.f5210u.b().setOnClickListener(new u3.a(this, 10));
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
