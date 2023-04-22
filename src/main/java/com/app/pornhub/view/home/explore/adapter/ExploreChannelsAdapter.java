package com.app.pornhub.view.home.explore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ExploreItemChannelBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o4.d;
import o4.e;

/* loaded from: classes.dex */
public final class ExploreChannelsAdapter extends t<Item, b> {

    /* renamed from: f  reason: collision with root package name */
    public final int f5197f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5198g;

    /* renamed from: h  reason: collision with root package name */
    public d f5199h;

    /* renamed from: i  reason: collision with root package name */
    public final z f5200i;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExploreChannelsAdapter$Item$Channel;", "Lcom/app/pornhub/view/home/explore/adapter/ExploreChannelsAdapter$Item;", "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "component1", "channel", "Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "a", "()Lcom/app/pornhub/domain/model/channel/ChannelMetaData;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class Channel extends Item {
            private final ChannelMetaData channel;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Channel(ChannelMetaData channel) {
                super(null);
                Intrinsics.checkNotNullParameter(channel, "channel");
                this.channel = channel;
            }

            public final ChannelMetaData a() {
                return this.channel;
            }

            public final ChannelMetaData component1() {
                return this.channel;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Channel) && Intrinsics.areEqual(this.channel, ((Channel) obj).channel);
            }

            public int hashCode() {
                return this.channel.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Channel(channel=");
                m10.append(this.channel);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5201a = new a();

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
        public final ExploreItemChannelBinding f5202v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ExploreChannelsAdapter this$0, ExploreItemChannelBinding channelItemBinding) {
            super(channelItemBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(channelItemBinding, "channelItemBinding");
            this.f5202v = channelItemBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.Channel) {
                Item.Channel channel = (Item.Channel) item;
                this.f5202v.f4521c.setText(channel.a().getTitle());
                com.bumptech.glide.b.e(this.f5202v.f4520b).o(channel.a().getAvatar()).j(R.drawable.placeholder_channel_avatar).A(this.f5202v.f4520b);
                this.f5202v.f4519a.setTag(channel.a());
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final x1.a f5203u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5203u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class c extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExploreChannelsAdapter this$0, ItemViewMoreBinding moreBinding) {
            super(moreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(moreBinding, "moreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter.b
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    public ExploreChannelsAdapter(boolean z10, int i10) {
        super(new e());
        this.f5197f = 600;
        this.f5198g = 601;
        this.f5200i = new z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.Channel) {
            return this.f5197f;
        }
        if (item instanceof Item.a) {
            return this.f5198g;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f5200i.a(recyclerView);
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
        if (i10 == this.f5197f) {
            ExploreItemChannelBinding bind = ExploreItemChannelBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item_channel, parent, false));
            Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
            a aVar = new a(this, bind);
            aVar.f5203u.b().setOnClickListener(new x3.b(this, 6));
            return aVar;
        } else if (i10 == this.f5198g) {
            ItemViewMoreBinding a10 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, a10);
            cVar.f5203u.b().setOnClickListener(new u3.b(this, 5));
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
