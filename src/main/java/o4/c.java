package o4;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ExploreItemBinding;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.channel.ChannelMetaData;
import com.app.pornhub.domain.model.explore.ExploreData;
import com.app.pornhub.domain.model.explore.ExploreType;
import com.app.pornhub.domain.model.explore.TypeWrapperData;
import com.app.pornhub.domain.model.gif.GifMetaData;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.photo.Album;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.home.explore.adapter.ExploreAlbumAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreChannelsAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter;
import com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreVideoAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import w6.v0;

/* loaded from: classes2.dex */
public final class c extends t<b, a> {

    /* renamed from: f  reason: collision with root package name */
    public final v0 f13551f;

    /* renamed from: g  reason: collision with root package name */
    public final o4.d f13552g;

    /* renamed from: h  reason: collision with root package name */
    public C0235c f13553h;

    /* renamed from: i  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f13554i;

    /* renamed from: j  reason: collision with root package name */
    public final int f13555j;

    /* renamed from: k  reason: collision with root package name */
    public final RecyclerView.q f13556k;

    /* renamed from: l  reason: collision with root package name */
    public HashMap<String, Parcelable> f13557l;

    /* renamed from: m  reason: collision with root package name */
    public final e f13558m;

    /* loaded from: classes2.dex */
    public static abstract class a extends RecyclerView.z {

        /* renamed from: u  reason: collision with root package name */
        public final x1.a f13559u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x1.a binding) {
            super(((ExploreItemBinding) binding).f4512a);
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f13559u = binding;
        }

        public abstract void x(b bVar);
    }

    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13560a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13561b;

        /* loaded from: classes2.dex */
        public static final class a extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13562c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final ExploreAlbumAdapter f13563e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String title, String subtitle, ExploreAlbumAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13562c = title;
                this.d = subtitle;
                this.f13563e = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (Intrinsics.areEqual(this.f13562c, aVar.f13562c) && Intrinsics.areEqual(this.d, aVar.d) && Intrinsics.areEqual(this.f13563e, aVar.f13563e)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return this.f13563e.hashCode() + a1.a.b(this.d, this.f13562c.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("AlbumTile(title=");
                m10.append(this.f13562c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", adapter=");
                m10.append(this.f13563e);
                m10.append(')');
                return m10.toString();
            }
        }

        /* renamed from: o4.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0233b extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13564c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final ExploreCategoryAdapter f13565e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0233b(String title, String subtitle, ExploreCategoryAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13564c = title;
                this.d = subtitle;
                this.f13565e = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0233b) {
                    C0233b c0233b = (C0233b) obj;
                    return Intrinsics.areEqual(this.f13564c, c0233b.f13564c) && Intrinsics.areEqual(this.d, c0233b.d) && Intrinsics.areEqual(this.f13565e, c0233b.f13565e);
                }
                return false;
            }

            public int hashCode() {
                return this.f13565e.hashCode() + a1.a.b(this.d, this.f13564c.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("CategoryTile(title=");
                m10.append(this.f13564c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", adapter=");
                m10.append(this.f13565e);
                m10.append(')');
                return m10.toString();
            }
        }

        /* renamed from: o4.c$b$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0234c extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13566c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final ExploreChannelsAdapter f13567e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0234c(String title, String subtitle, ExploreChannelsAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13566c = title;
                this.d = subtitle;
                this.f13567e = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0234c) {
                    C0234c c0234c = (C0234c) obj;
                    return Intrinsics.areEqual(this.f13566c, c0234c.f13566c) && Intrinsics.areEqual(this.d, c0234c.d) && Intrinsics.areEqual(this.f13567e, c0234c.f13567e);
                }
                return false;
            }

            public int hashCode() {
                return this.f13567e.hashCode() + a1.a.b(this.d, this.f13566c.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("ChannelTile(title=");
                m10.append(this.f13566c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", adapter=");
                m10.append(this.f13567e);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13568c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final ExploreGifAdapter f13569e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String title, String subtitle, ExploreGifAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13568c = title;
                this.d = subtitle;
                this.f13569e = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (Intrinsics.areEqual(this.f13568c, dVar.f13568c) && Intrinsics.areEqual(this.d, dVar.d) && Intrinsics.areEqual(this.f13569e, dVar.f13569e)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return this.f13569e.hashCode() + a1.a.b(this.d, this.f13568c.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("GifTile(title=");
                m10.append(this.f13568c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", adapter=");
                m10.append(this.f13569e);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class e extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13570c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final ExplorePornstarAdapter f13571e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String title, String subtitle, ExplorePornstarAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13570c = title;
                this.d = subtitle;
                this.f13571e = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof e) {
                    e eVar = (e) obj;
                    if (Intrinsics.areEqual(this.f13570c, eVar.f13570c) && Intrinsics.areEqual(this.d, eVar.d) && Intrinsics.areEqual(this.f13571e, eVar.f13571e)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return this.f13571e.hashCode() + a1.a.b(this.d, this.f13570c.hashCode() * 31, 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("PerformerTile(title=");
                m10.append(this.f13570c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", adapter=");
                m10.append(this.f13571e);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes2.dex */
        public static final class f extends b {

            /* renamed from: c  reason: collision with root package name */
            public final String f13572c;
            public final String d;

            /* renamed from: e  reason: collision with root package name */
            public final String f13573e;

            /* renamed from: f  reason: collision with root package name */
            public final ExploreVideoAdapter f13574f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(String title, String subtitle, String flag, ExploreVideoAdapter adapter) {
                super(title, subtitle, null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(flag, "flag");
                Intrinsics.checkNotNullParameter(adapter, "adapter");
                this.f13572c = title;
                this.d = subtitle;
                this.f13573e = flag;
                this.f13574f = adapter;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    if (Intrinsics.areEqual(this.f13572c, fVar.f13572c) && Intrinsics.areEqual(this.d, fVar.d) && Intrinsics.areEqual(this.f13573e, fVar.f13573e) && Intrinsics.areEqual(this.f13574f, fVar.f13574f)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            public int hashCode() {
                return this.f13574f.hashCode() + a1.a.b(this.f13573e, a1.a.b(this.d, this.f13572c.hashCode() * 31, 31), 31);
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("VideoTile(title=");
                m10.append(this.f13572c);
                m10.append(", subtitle=");
                m10.append(this.d);
                m10.append(", flag=");
                m10.append(this.f13573e);
                m10.append(", adapter=");
                m10.append(this.f13574f);
                m10.append(')');
                return m10.toString();
            }
        }

        public b(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
            this.f13560a = str;
            this.f13561b = str2;
        }
    }

    /* renamed from: o4.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0235c extends a {

        /* renamed from: v  reason: collision with root package name */
        public final ExploreItemBinding f13575v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c f13576w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0235c(c this$0, ExploreItemBinding viewBinding) {
            super(viewBinding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(viewBinding, "viewBinding");
            this.f13576w = this$0;
            this.f13575v = viewBinding;
        }

        @Override // o4.c.a
        public void x(b item) {
            RecyclerView.l layoutManager;
            Intrinsics.checkNotNullParameter(item, "item");
            this.f13575v.f4515e.setText(item.f13560a);
            boolean z10 = false;
            if (item.f13561b.length() > 0) {
                this.f13575v.d.setVisibility(0);
                this.f13575v.d.setText(item.f13561b);
            } else {
                this.f13575v.d.setVisibility(8);
            }
            if (item instanceof b.f) {
                b.f fVar = (b.f) item;
                if (fVar.f13573e.length() > 0) {
                    z10 = true;
                }
                if (z10) {
                    com.bumptech.glide.b.e(this.f13575v.f4513b).o(fVar.f13573e).A(this.f13575v.f4513b);
                }
                this.f13575v.f4514c.r0(fVar.f13574f, true);
            } else if (item instanceof b.d) {
                this.f13575v.f4514c.r0(((b.d) item).f13569e, true);
            } else if (item instanceof b.C0233b) {
                this.f13575v.f4514c.r0(((b.C0233b) item).f13565e, true);
            } else if (item instanceof b.e) {
                this.f13575v.f4514c.r0(((b.e) item).f13571e, true);
            } else if (item instanceof b.a) {
                this.f13575v.f4514c.r0(((b.a) item).f13563e, true);
            } else if (item instanceof b.C0234c) {
                this.f13575v.f4514c.r0(((b.C0234c) item).f13567e, true);
            }
            Parcelable parcelable = this.f13576w.f13557l.get(item.f13560a);
            if (parcelable != null && (layoutManager = this.f13575v.f4514c.getLayoutManager()) != null) {
                layoutManager.m0(parcelable);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ RecyclerView f13578f;

        public d(RecyclerView recyclerView) {
            this.f13578f = recyclerView;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            Collection currentList = c.this.d.f2969f;
            Intrinsics.checkNotNullExpressionValue(currentList, "currentList");
            if (!currentList.isEmpty()) {
                c.n(c.this, this.f13578f);
                this.f13578f.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends RecyclerView.p {
        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void d(RecyclerView recyclerView, int i10) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i10 == 0) {
                c.n(c.this, recyclerView);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager linearLayoutManager;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (i11 > 0) {
                RecyclerView.l layoutManager = recyclerView.getLayoutManager();
                linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null && linearLayoutManager.Y0() == c.this.a() - 1) {
                    c.this.f13552g.b();
                }
            } else if (i11 < 0) {
                RecyclerView.l layoutManager2 = recyclerView.getLayoutManager();
                linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null && linearLayoutManager.Y0() == c.this.a() - 2) {
                    c.this.f13552g.n();
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v0 player, o4.d callback) {
        super(new g());
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f13551f = player;
        this.f13552g = callback;
        this.f13555j = 4;
        this.f13556k = new RecyclerView.q();
        this.f13557l = new HashMap<>();
        this.f13558m = new e();
    }

    public static final void n(c cVar, RecyclerView recyclerView) {
        Objects.requireNonNull(cVar);
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int U0 = linearLayoutManager.U0();
        if (U0 < 0) {
            U0 = linearLayoutManager.X0();
        }
        RecyclerView.z G = recyclerView.G(U0);
        if (G != null && (G instanceof C0235c)) {
            C0235c c0235c = cVar.f13553h;
            if (c0235c == null) {
                cVar.q((C0235c) G);
            } else if (!Intrinsics.areEqual(c0235c, G)) {
                cVar.r();
                cVar.q((C0235c) G);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.h(this.f13558m);
        this.f13554i = new d(recyclerView);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(this.f13554i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        a holder = (a) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.f2969f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "getItem(position)");
        holder.x((b) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ExploreItemBinding bind = ExploreItemBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.explore_item, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n            Lay…          false\n        )");
        bind.f4514c.setRecycledViewPool(this.f13556k);
        RecyclerView recyclerView = bind.f4514c;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        recyclerView.g(new z3.c(context, R.dimen.video_item_spacing));
        RecyclerView.l layoutManager = bind.f4514c.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        linearLayoutManager.B0(true);
        linearLayoutManager.C = this.f13555j;
        return new C0235c(this, bind);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.b0(this.f13558m);
        r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void k(RecyclerView.z zVar) {
        a holder = (a) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof C0235c) {
            o((C0235c) holder);
            if (holder == this.f13553h) {
                r();
            }
        }
    }

    public final void o(C0235c itemViewHolder) {
        Intrinsics.checkNotNullParameter(itemViewHolder, "itemViewHolder");
        ExploreItemBinding exploreItemBinding = itemViewHolder.f13575v;
        String obj = exploreItemBinding.f4515e.getText().toString();
        RecyclerView.l layoutManager = exploreItemBinding.f4514c.getLayoutManager();
        Parcelable n02 = layoutManager == null ? null : layoutManager.n0();
        if (n02 != null) {
            this.f13557l.put(obj, n02);
        }
    }

    public final void p(List<ExploreData> list) {
        if (list == null) {
            m(CollectionsKt.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            for (ExploreData exploreData : list) {
                ExploreType type = exploreData.getType();
                if (Intrinsics.areEqual(type, ExploreType.Video.INSTANCE)) {
                    List<VideoMetaData> list2 = ((TypeWrapperData.VideoWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (VideoMetaData videoMetaData : list2) {
                        arrayList2.add(new ExploreVideoAdapter.Item.Video(videoMetaData));
                    }
                    List mutableList = CollectionsKt.toMutableList((Collection) arrayList2);
                    if (!mutableList.isEmpty()) {
                        mutableList.add(ExploreVideoAdapter.Item.a.f5234a);
                    }
                    ExploreVideoAdapter exploreVideoAdapter = new ExploreVideoAdapter(this.f13551f, exploreData.getOptions(), exploreData.getTitle());
                    exploreVideoAdapter.f5227k = this.f13552g;
                    exploreVideoAdapter.m(mutableList);
                    arrayList.add(new b.f(exploreData.getTitle(), exploreData.getSubtitle(), exploreData.getCountryFlag(), exploreVideoAdapter));
                } else if (Intrinsics.areEqual(type, ExploreType.Category.INSTANCE)) {
                    List<Category> list3 = ((TypeWrapperData.CategoryWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    for (Category category : list3) {
                        arrayList3.add(new ExploreCategoryAdapter.Item.CategoryItem(category));
                    }
                    List mutableList2 = CollectionsKt.toMutableList((Collection) arrayList3);
                    if (!mutableList2.isEmpty()) {
                        mutableList2.add(ExploreCategoryAdapter.Item.a.f5192a);
                    }
                    ExploreCategoryAdapter exploreCategoryAdapter = new ExploreCategoryAdapter();
                    exploreCategoryAdapter.f5190h = this.f13552g;
                    exploreCategoryAdapter.m(mutableList2);
                    arrayList.add(new b.C0233b(exploreData.getTitle(), exploreData.getSubtitle(), exploreCategoryAdapter));
                } else if (Intrinsics.areEqual(type, ExploreType.Gif.INSTANCE)) {
                    List<GifMetaData> list4 = ((TypeWrapperData.GifWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
                    for (GifMetaData gifMetaData : list4) {
                        arrayList4.add(new ExploreGifAdapter.Item.GifItem(gifMetaData));
                    }
                    List mutableList3 = CollectionsKt.toMutableList((Collection) arrayList4);
                    if (!mutableList3.isEmpty()) {
                        mutableList3.add(ExploreGifAdapter.Item.a.f5209a);
                    }
                    ExploreGifAdapter exploreGifAdapter = new ExploreGifAdapter(exploreData.getOptions());
                    exploreGifAdapter.f5207i = this.f13552g;
                    exploreGifAdapter.m(mutableList3);
                    arrayList.add(new b.d(exploreData.getTitle(), exploreData.getSubtitle(), exploreGifAdapter));
                } else if (Intrinsics.areEqual(type, ExploreType.Album.INSTANCE)) {
                    List<Album> list5 = ((TypeWrapperData.AlbumWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                    for (Album album : list5) {
                        arrayList5.add(new ExploreAlbumAdapter.Item.AlbumItem(album));
                    }
                    List mutableList4 = CollectionsKt.toMutableList((Collection) arrayList5);
                    if (!mutableList4.isEmpty()) {
                        mutableList4.add(ExploreAlbumAdapter.Item.a.f5185a);
                    }
                    ExploreAlbumAdapter exploreAlbumAdapter = new ExploreAlbumAdapter(exploreData.getOptions());
                    exploreAlbumAdapter.f5183i = this.f13552g;
                    exploreAlbumAdapter.m(mutableList4);
                    arrayList.add(new b.a(exploreData.getTitle(), exploreData.getSubtitle(), exploreAlbumAdapter));
                } else if (Intrinsics.areEqual(type, ExploreType.Performer.INSTANCE)) {
                    List<PerformerMetaData> list6 = ((TypeWrapperData.PerformerWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                    for (PerformerMetaData performerMetaData : list6) {
                        arrayList6.add(new ExplorePornstarAdapter.Item.Performer(performerMetaData));
                    }
                    List mutableList5 = CollectionsKt.toMutableList((Collection) arrayList6);
                    if (!mutableList5.isEmpty()) {
                        mutableList5.add(ExplorePornstarAdapter.Item.a.f5218a);
                    }
                    ExplorePornstarAdapter explorePornstarAdapter = new ExplorePornstarAdapter(exploreData.getOptions(), false, 2);
                    explorePornstarAdapter.f5216j = this.f13552g;
                    explorePornstarAdapter.m(mutableList5);
                    arrayList.add(new b.e(exploreData.getTitle(), exploreData.getSubtitle(), explorePornstarAdapter));
                } else if (Intrinsics.areEqual(type, ExploreType.Channel.INSTANCE)) {
                    List<ChannelMetaData> list7 = ((TypeWrapperData.ChannelWrapperData) exploreData.getTypeWrapperData()).getList();
                    ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list7, 10));
                    for (ChannelMetaData channelMetaData : list7) {
                        arrayList7.add(new ExploreChannelsAdapter.Item.Channel(channelMetaData));
                    }
                    List mutableList6 = CollectionsKt.toMutableList((Collection) arrayList7);
                    if (!mutableList6.isEmpty()) {
                        mutableList6.add(ExploreChannelsAdapter.Item.a.f5201a);
                    }
                    ExploreChannelsAdapter exploreChannelsAdapter = new ExploreChannelsAdapter(false, 1);
                    exploreChannelsAdapter.f5199h = this.f13552g;
                    exploreChannelsAdapter.m(mutableList6);
                    arrayList.add(new b.C0234c(exploreData.getTitle(), exploreData.getSubtitle(), exploreChannelsAdapter));
                }
            }
            m(arrayList);
            return;
        }
    }

    public final void q(C0235c c0235c) {
        RecyclerView.Adapter adapter = c0235c.f13575v.f4514c.getAdapter();
        ExploreVideoAdapter exploreVideoAdapter = adapter instanceof ExploreVideoAdapter ? (ExploreVideoAdapter) adapter : null;
        if (exploreVideoAdapter != null) {
            this.f13553h = c0235c;
            RecyclerView recyclerView = c0235c.f13575v.f4514c;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "itemViewHolder.viewBinding.recyclerViewItem");
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            exploreVideoAdapter.f5231p = true;
            exploreVideoAdapter.n(recyclerView);
        }
    }

    public final void r() {
        C0235c c0235c = this.f13553h;
        if (c0235c == null) {
            return;
        }
        this.f13553h = null;
        RecyclerView.Adapter adapter = c0235c.f13575v.f4514c.getAdapter();
        ExploreVideoAdapter exploreVideoAdapter = adapter instanceof ExploreVideoAdapter ? (ExploreVideoAdapter) adapter : null;
        if (exploreVideoAdapter == null) {
            return;
        }
        exploreVideoAdapter.f5231p = false;
        exploreVideoAdapter.p(true, false, false);
    }
}
