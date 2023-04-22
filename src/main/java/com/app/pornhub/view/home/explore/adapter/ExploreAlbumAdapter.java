package com.app.pornhub.view.home.explore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.app.pornhub.databinding.ExploreItemAlbumBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.photo.Album;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;

/* loaded from: classes.dex */
public final class ExploreAlbumAdapter extends t<Item, b> {

    /* renamed from: f  reason: collision with root package name */
    public final ExploreOptions f5180f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5181g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5182h;

    /* renamed from: i  reason: collision with root package name */
    public d f5183i;

    /* renamed from: j  reason: collision with root package name */
    public final z3.b f5184j;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExploreAlbumAdapter$Item$AlbumItem;", "Lcom/app/pornhub/view/home/explore/adapter/ExploreAlbumAdapter$Item;", "Lcom/app/pornhub/domain/model/photo/Album;", "component1", ExploreModel.ALBUM, "Lcom/app/pornhub/domain/model/photo/Album;", "a", "()Lcom/app/pornhub/domain/model/photo/Album;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class AlbumItem extends Item {
            private final Album album;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AlbumItem(Album album) {
                super(null);
                Intrinsics.checkNotNullParameter(album, "album");
                this.album = album;
            }

            public final Album a() {
                return this.album;
            }

            public final Album component1() {
                return this.album;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof AlbumItem) && Intrinsics.areEqual(this.album, ((AlbumItem) obj).album)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.album.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("AlbumItem(album=");
                m10.append(this.album);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5185a = new a();

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

        /* renamed from: v  reason: collision with root package name */
        public final ExploreItemAlbumBinding f5186v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExploreAlbumAdapter this$0, ExploreItemAlbumBinding albumBinding) {
            super(albumBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(albumBinding, "albumBinding");
            this.f5186v = albumBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.AlbumItem) {
                Item.AlbumItem albumItem = (Item.AlbumItem) item;
                this.f5186v.f4510c.setText(albumItem.a().getTitle());
                TextView textView = this.f5186v.d;
                textView.setText(textView.getResources().getQuantityString(R.plurals.plural_n_photos, albumItem.a().getImgCount(), Integer.valueOf(albumItem.a().getImgCount())));
                this.f5186v.f4511e.setText(a0.b.z(albumItem.a().getRating()));
                com.bumptech.glide.b.e(this.f5186v.f4509b).o(albumItem.a().getUrlThumbnail()).j(R.drawable.thumb_preview).A(this.f5186v.f4509b);
                this.f5186v.f4508a.setTag(albumItem.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final x1.a f5187u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5187u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class c extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExploreAlbumAdapter this$0, ItemViewMoreBinding moreBinding) {
            super(moreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(moreBinding, "moreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    public ExploreAlbumAdapter(ExploreOptions exploreOptions) {
        super(new o4.a(0));
        this.f5180f = exploreOptions;
        this.f5181g = 500;
        this.f5182h = 501;
        this.f5184j = new z3.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.AlbumItem) {
            return this.f5181g;
        }
        if (item instanceof Item.a) {
            return this.f5182h;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5184j.a(recyclerView);
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
        if (i10 == this.f5181g) {
            ExploreItemAlbumBinding bind = ExploreItemAlbumBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item_album, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            a aVar = new a(this, bind);
            aVar.f5186v.f4508a.setOnClickListener(new u3.b(this, 4));
            return aVar;
        } else if (i10 == this.f5182h) {
            ItemViewMoreBinding a10 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, a10);
            cVar.f5187u.b().setOnClickListener(new u3.c(this, 6));
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
