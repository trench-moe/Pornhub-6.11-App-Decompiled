package com.app.pornhub.view.home.explore.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemLayoutVideoBinding;
import com.app.pornhub.databinding.ItemViewMoreBinding;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ui.PlayerView;
import i8.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import t3.o;
import t3.p;
import w6.c0;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.v0;
import w6.x0;

/* loaded from: classes.dex */
public final class ExploreVideoAdapter extends t<Item, a> {

    /* renamed from: f  reason: collision with root package name */
    public final v0 f5222f;

    /* renamed from: g  reason: collision with root package name */
    public final ExploreOptions f5223g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5224h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5225i;

    /* renamed from: j  reason: collision with root package name */
    public final int f5226j;

    /* renamed from: k  reason: collision with root package name */
    public o4.d f5227k;

    /* renamed from: l  reason: collision with root package name */
    public final z f5228l;

    /* renamed from: m  reason: collision with root package name */
    public RecyclerView f5229m;
    public PlayerView n;

    /* renamed from: o  reason: collision with root package name */
    public b f5230o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5231p;

    /* renamed from: q  reason: collision with root package name */
    public final e f5232q;

    /* renamed from: r  reason: collision with root package name */
    public final d f5233r;

    /* loaded from: classes.dex */
    public static abstract class Item {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/explore/adapter/ExploreVideoAdapter$Item$Video;", "Lcom/app/pornhub/view/home/explore/adapter/ExploreVideoAdapter$Item;", "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "component1", "videoItem", "Lcom/app/pornhub/domain/model/video/VideoMetaData;", "a", "()Lcom/app/pornhub/domain/model/video/VideoMetaData;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class Video extends Item {
            private final VideoMetaData videoItem;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Video(VideoMetaData videoItem) {
                super(null);
                Intrinsics.checkNotNullParameter(videoItem, "videoItem");
                this.videoItem = videoItem;
            }

            public final VideoMetaData a() {
                return this.videoItem;
            }

            public final VideoMetaData component1() {
                return this.videoItem;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Video) && Intrinsics.areEqual(this.videoItem, ((Video) obj).videoItem)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.videoItem.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("Video(videoItem=");
                m10.append(this.videoItem);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends Item {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5234a = new a();

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
        public final x1.a f5235u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5235u = binding;
        }

        public abstract void x(Item item);
    }

    /* loaded from: classes.dex */
    public final class b extends a {

        /* renamed from: v  reason: collision with root package name */
        public final ItemLayoutVideoBinding f5236v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ExploreVideoAdapter this$0, ItemLayoutVideoBinding videoBinding) {
            super(videoBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(videoBinding, "videoBinding");
            this.f5236v = videoBinding;
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (item instanceof Item.Video) {
                VideoMetaData a10 = ((Item.Video) item).a();
                com.bumptech.glide.b.e(this.f5236v.f4728e).o(a10.getUrlThumbnail()).j(R.drawable.thumb_preview).A(this.f5236v.f4728e);
                VideoContentType videoContentType = a10.getVideoContentType();
                ImageView imageView = this.f5236v.f4727c;
                Intrinsics.checkNotNullExpressionValue(imageView, "videoBinding.icPremium");
                o.b(videoContentType, imageView);
                this.f5236v.f4726b.setVisibility(a10.isPaid() ? 0 : 8);
                ImageView imageView2 = this.f5236v.d;
                Intrinsics.checkNotNullExpressionValue(imageView2, "videoBinding.imageViewUploaderType");
                o.o(a10, imageView2);
                this.f5236v.f4731h.setText(a10.getUserMetaData().getUsername());
                this.f5236v.f4734k.setText(a10.isVr() ? this.f5236v.f4734k.getContext().getText(R.string.vr) : a10.isHd() ? this.f5236v.f4734k.getContext().getText(R.string.f21944hd) : BuildConfig.FLAVOR);
                this.f5236v.f4733j.setText(a10.getTitle());
                this.f5236v.f4732i.setText(a0.b.y(a10.getDuration() * 1000));
                this.f5236v.f4735l.setText(a0.b.u(a10.getViewCount()));
                this.f5236v.f4730g.setText(a0.b.z(a10.getRating()));
                this.f5236v.f4725a.setTag(a10);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c extends a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ExploreVideoAdapter this$0, ItemViewMoreBinding viewMoreBinding) {
            super(viewMoreBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(viewMoreBinding, "viewMoreBinding");
        }

        @Override // com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter.a
        public void x(Item item) {
            Intrinsics.checkNotNullParameter(item, "item");
        }
    }

    /* loaded from: classes.dex */
    public static final class d implements n0.c {
        public d() {
        }

        @Override // w6.n0.c
        public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void G(boolean z10, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void L(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void W(w7.o oVar, j jVar) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Y(boolean z10, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Z(m0 m0Var) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void d(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void e(x0 x0Var, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void f(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void g(d0 d0Var) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void g0(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void h(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void i(List list) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void l0(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void m(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void n() {
        }

        @Override // w6.n0.c
        public void p(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            ExploreVideoAdapter.q(ExploreVideoAdapter.this, true, true, false, 4);
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(c0 c0Var, int i10) {
        }

        @Override // w6.n0.c
        public void v(int i10) {
            ItemLayoutVideoBinding itemLayoutVideoBinding;
            if (i10 != 1) {
                if (i10 == 3) {
                    b bVar = ExploreVideoAdapter.this.f5230o;
                    ImageView imageView = null;
                    if (bVar != null && (itemLayoutVideoBinding = bVar.f5236v) != null) {
                        imageView = itemLayoutVideoBinding.f4728e;
                    }
                    if (imageView == null) {
                        return;
                    }
                    imageView.animate().alpha(0.0f).setDuration(200L);
                    return;
                } else if (i10 != 4) {
                    return;
                }
            }
            ExploreVideoAdapter.this.p(true, false, true);
        }

        @Override // w6.n0.c
        public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        public int f5238a = -1;

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void d(RecyclerView recyclerView, int i10) {
            int D;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i10 != 0 || this.f5238a == (D = a0.b.D(ExploreVideoAdapter.this.f5228l, recyclerView))) {
                return;
            }
            ExploreVideoAdapter exploreVideoAdapter = ExploreVideoAdapter.this;
            if (exploreVideoAdapter.f5231p) {
                exploreVideoAdapter.n(recyclerView);
                this.f5238a = D;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreVideoAdapter(v0 player, ExploreOptions exploreOptions, String sectionTitle) {
        super(new o4.a(1));
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(sectionTitle, "sectionTitle");
        this.f5222f = player;
        this.f5223g = exploreOptions;
        this.f5224h = sectionTitle;
        this.f5225i = 100;
        this.f5226j = 101;
        this.f5228l = new z();
        this.f5232q = new e();
        this.f5233r = new d();
    }

    public static /* synthetic */ void q(ExploreVideoAdapter exploreVideoAdapter, boolean z10, boolean z11, boolean z12, int i10) {
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        exploreVideoAdapter.p(z10, z11, z12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        Item item = (Item) this.d.f2969f.get(i10);
        if (item instanceof Item.Video) {
            return this.f5225i;
        }
        if (item instanceof Item.a) {
            return this.f5226j;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        rv.h(this.f5232q);
        this.f5228l.a(rv);
        this.f5229m = rv;
        this.f5222f.o(this.f5233r);
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
        if (i10 == this.f5225i) {
            ItemLayoutVideoBinding a10 = ItemLayoutVideoBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a10, "inflate(\n               …lse\n                    )");
            b bVar = new b(this, a10);
            bVar.f5236v.f4725a.setOnClickListener(new x3.b(this, 7));
            return bVar;
        } else if (i10 == this.f5226j) {
            ItemViewMoreBinding a11 = ItemViewMoreBinding.a(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNullExpressionValue(a11, "inflate(\n               …lse\n                    )");
            c cVar = new c(this, a11);
            cVar.f5235u.b().setOnClickListener(new u3.b(this, 6));
            return cVar;
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Unknown view type ", Integer.valueOf(i10)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(RecyclerView rv) {
        Intrinsics.checkNotNullParameter(rv, "rv");
        v0 v0Var = this.f5222f;
        v0Var.d.n0(this.f5233r);
        this.n = null;
        this.f5230o = null;
        rv.b0(this.f5232q);
        rv.setOnFlingListener(null);
        this.f5229m = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void k(RecyclerView.z zVar) {
        a holder = (a) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder == this.f5230o) {
            p(false, true, false);
        }
    }

    public final void n(RecyclerView recyclerView) {
        int D = a0.b.D(this.f5228l, recyclerView);
        RecyclerView.z G = recyclerView.G(D);
        if (G != null && (G instanceof b)) {
            b bVar = this.f5230o;
            if (bVar == null) {
                o((b) G, D);
            } else if (!Intrinsics.areEqual(bVar, G)) {
                p(true, false, false);
                o((b) G, D);
            }
        }
    }

    public final void o(b bVar, int i10) {
        ItemLayoutVideoBinding itemLayoutVideoBinding = bVar.f5236v;
        Object obj = this.d.f2969f.get(i10);
        Item.Video video = obj instanceof Item.Video ? (Item.Video) obj : null;
        if (video == null) {
            return;
        }
        VideoMetaData a10 = video.a();
        if (itemLayoutVideoBinding.f4729f.getVisibility() != 0 && p.a(a10)) {
            this.f5230o = bVar;
            itemLayoutVideoBinding.f4729f.setVisibility(0);
            PlayerView playerView = new PlayerView(itemLayoutVideoBinding.f4729f.getContext(), null);
            this.n = playerView;
            Intrinsics.checkNotNull(playerView);
            playerView.setUseController(false);
            itemLayoutVideoBinding.f4729f.removeAllViews();
            itemLayoutVideoBinding.f4729f.addView(this.n, new FrameLayout.LayoutParams(-2, -1));
            PlayerView playerView2 = this.n;
            Intrinsics.checkNotNull(playerView2);
            playerView2.setPlayer(this.f5222f);
            c0 b10 = c0.b(a10.getPreviewUrl());
            Intrinsics.checkNotNullExpressionValue(b10, "fromUri(videoMetaData.previewUrl)");
            this.f5222f.y(b10);
            this.f5222f.f();
            this.f5222f.n(0L);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(boolean r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter.p(boolean, boolean, boolean):void");
    }
}
