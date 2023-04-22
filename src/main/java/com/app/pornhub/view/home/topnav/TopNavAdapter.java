package com.app.pornhub.view.home.topnav;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import c0.a;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemTopNavChildBinding;
import com.app.pornhub.databinding.ItemTopNavParentBinding;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.appsflyer.oaid.BuildConfig;
import g4.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class TopNavAdapter extends t<TopNavItem, c> {

    /* renamed from: f  reason: collision with root package name */
    public a f5323f;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/app/pornhub/view/home/topnav/TopNavAdapter$TopNavItem;", BuildConfig.FLAVOR, "Lcom/app/pornhub/view/home/topnav/TopNavigation;", "component1", "identifier", "Lcom/app/pornhub/view/home/topnav/TopNavigation;", "a", "()Lcom/app/pornhub/view/home/topnav/TopNavigation;", BuildConfig.FLAVOR, "title", "Ljava/lang/String;", DvdsConfig.TYPE_CATEGORY, "()Ljava/lang/String;", BuildConfig.FLAVOR, "isSelected", "Z", "d", "()Z", "Lcom/app/pornhub/view/home/topnav/TopNavAdapter$d;", "level", "Lcom/app/pornhub/view/home/topnav/TopNavAdapter$d;", "b", "()Lcom/app/pornhub/view/home/topnav/TopNavAdapter$d;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class TopNavItem {
        private final TopNavigation identifier;
        private final boolean isSelected;
        private final d level;
        private final String title;

        public TopNavItem(TopNavigation identifier, String title, boolean z10, d level) {
            Intrinsics.checkNotNullParameter(identifier, "identifier");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(level, "level");
            this.identifier = identifier;
            this.title = title;
            this.isSelected = z10;
            this.level = level;
        }

        public /* synthetic */ TopNavItem(TopNavigation topNavigation, String str, boolean z10, d dVar, int i10) {
            this(topNavigation, str, (i10 & 4) != 0 ? false : z10, dVar);
        }

        public final TopNavigation a() {
            return this.identifier;
        }

        public final d b() {
            return this.level;
        }

        public final String c() {
            return this.title;
        }

        public final TopNavigation component1() {
            return this.identifier;
        }

        public final boolean d() {
            return this.isSelected;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof TopNavItem) {
                TopNavItem topNavItem = (TopNavItem) obj;
                if (Intrinsics.areEqual(this.identifier, topNavItem.identifier) && Intrinsics.areEqual(this.title, topNavItem.title) && this.isSelected == topNavItem.isSelected && Intrinsics.areEqual(this.level, topNavItem.level)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int b10 = a1.a.b(this.title, this.identifier.hashCode() * 31, 31);
            boolean z10 = this.isSelected;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return this.level.hashCode() + ((b10 + i10) * 31);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("TopNavItem(identifier=");
            m10.append(this.identifier);
            m10.append(", title=");
            m10.append(this.title);
            m10.append(", isSelected=");
            m10.append(this.isSelected);
            m10.append(", level=");
            m10.append(this.level);
            m10.append(')');
            return m10.toString();
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(TopNavItem topNavItem);
    }

    /* loaded from: classes.dex */
    public final class b extends c {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f5324w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final ItemTopNavChildBinding f5325u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ TopNavAdapter f5326v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TopNavAdapter this$0, ItemTopNavChildBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5326v = this$0;
            this.f5325u = binding;
        }

        @Override // com.app.pornhub.view.home.topnav.TopNavAdapter.c
        public void x(TopNavItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f5325u.d.setText(item.c());
            if (item.a() instanceof TopNavigation.ChildItem.PerformerContentSelection) {
                ImageView imageView = this.f5325u.f4799b;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.expandIcon");
                imageView.setVisibility(8);
                if (item.d()) {
                    ItemTopNavChildBinding itemTopNavChildBinding = this.f5325u;
                    ConstraintLayout constraintLayout = itemTopNavChildBinding.f4800c;
                    Context context = itemTopNavChildBinding.f4798a.getContext();
                    Object obj = c0.a.f3717a;
                    constraintLayout.setBackground(a.c.b(context, R.drawable.bg_item_top_nav_fill));
                } else {
                    ItemTopNavChildBinding itemTopNavChildBinding2 = this.f5325u;
                    ConstraintLayout constraintLayout2 = itemTopNavChildBinding2.f4800c;
                    Context context2 = itemTopNavChildBinding2.f4798a.getContext();
                    Object obj2 = c0.a.f3717a;
                    constraintLayout2.setBackground(a.c.b(context2, R.drawable.bg_item_top_nav_bordered));
                }
            } else {
                ImageView imageView2 = this.f5325u.f4799b;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.expandIcon");
                imageView2.setVisibility(0);
                ItemTopNavChildBinding itemTopNavChildBinding3 = this.f5325u;
                ConstraintLayout constraintLayout3 = itemTopNavChildBinding3.f4800c;
                Context context3 = itemTopNavChildBinding3.f4798a.getContext();
                Object obj3 = c0.a.f3717a;
                constraintLayout3.setBackground(a.c.b(context3, R.drawable.bg_item_top_nav_fill));
            }
            this.f5325u.f4798a.setOnClickListener(new l(this.f5326v, item, 3));
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(x1.a binding) {
            super(binding.b());
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public abstract void x(TopNavItem topNavItem);
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public static final class a extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5327a = new a();

            public a() {
                super(null);
            }
        }

        /* loaded from: classes.dex */
        public static final class b extends d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f5328a = new b();

            public b() {
                super(null);
            }
        }

        public d(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public final class e extends c {

        /* renamed from: w  reason: collision with root package name */
        public static final /* synthetic */ int f5329w = 0;

        /* renamed from: u  reason: collision with root package name */
        public final ItemTopNavParentBinding f5330u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ TopNavAdapter f5331v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TopNavAdapter this$0, ItemTopNavParentBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5331v = this$0;
            this.f5330u = binding;
        }

        @Override // com.app.pornhub.view.home.topnav.TopNavAdapter.c
        public void x(TopNavItem item) {
            Drawable b10;
            Intrinsics.checkNotNullParameter(item, "item");
            TopNavigation a10 = item.a();
            TopNavigation.Companion companion = TopNavigation.Companion;
            if (Intrinsics.areEqual(a10, companion.getTopNavRootItem())) {
                Context context = this.f5330u.f4801a.getContext();
                Object obj = c0.a.f3717a;
                b10 = a.c.b(context, R.drawable.bg_item_top_nav_fill);
            } else if (item.d()) {
                Context context2 = this.f5330u.f4801a.getContext();
                Object obj2 = c0.a.f3717a;
                b10 = a.c.b(context2, R.drawable.bg_item_top_nav_fill);
            } else {
                Context context3 = this.f5330u.f4801a.getContext();
                Object obj3 = c0.a.f3717a;
                b10 = a.c.b(context3, R.drawable.bg_item_top_nav_bordered);
            }
            if (!Intrinsics.areEqual(item.a(), companion.getTopNavRootItem())) {
                r2 = item.d() ? 0 : 8;
            }
            this.f5330u.f4803c.setBackground(b10);
            this.f5330u.f4802b.setVisibility(r2);
            this.f5330u.d.setText(item.c());
            this.f5330u.f4801a.setOnClickListener(new x3.c(this.f5331v, item, 4));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TopNavAdapter(androidx.recyclerview.widget.n.e r1, int r2) {
        /*
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto La
            t4.a r1 = new t4.a
            r1.<init>()
            goto Lb
        La:
            r1 = 0
        Lb:
            java.lang.String r2 = "diffCallback"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.topnav.TopNavAdapter.<init>(androidx.recyclerview.widget.n$e, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int c(int i10) {
        d b10 = ((TopNavItem) this.d.f2969f.get(i10)).b();
        if (b10 instanceof d.b) {
            return R.layout.item_top_nav_parent;
        }
        if (b10 instanceof d.a) {
            return R.layout.item_top_nav_child;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        c holder = (c) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.f2969f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "getItem(position)");
        holder.x((TopNavItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (i10) {
            case R.layout.item_top_nav_child /* 2131558570 */:
                ItemTopNavChildBinding bind = ItemTopNavChildBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_top_nav_child, parent, false));
                Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …lse\n                    )");
                return new b(this, bind);
            case R.layout.item_top_nav_parent /* 2131558571 */:
                ItemTopNavParentBinding bind2 = ItemTopNavParentBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_top_nav_parent, parent, false));
                Intrinsics.checkNotNullExpressionValue(bind2, "inflate(\n               …lse\n                    )");
                return new e(this, bind2);
            default:
                throw new IllegalArgumentException("Unknown view type");
        }
    }
}
