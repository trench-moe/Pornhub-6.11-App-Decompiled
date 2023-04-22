package com.app.pornhub.view.home.overlay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ItemSortingOptionBinding;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class OverlayAdapter extends t<OverlaySelectionItem, b> {

    /* renamed from: f  reason: collision with root package name */
    public a f5241f;

    /* loaded from: classes.dex */
    public static abstract class OverlayItemType {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType$PerformerFilter;", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", BuildConfig.FLAVOR, "component1", "filterName", "Ljava/lang/String;", "getFilterName", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PerformerFilter extends OverlayItemType {
            private final String filterName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerFilter(String filterName) {
                super(null);
                Intrinsics.checkNotNullParameter(filterName, "filterName");
                this.filterName = filterName;
            }

            public final String component1() {
                return this.filterName;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PerformerFilter) && Intrinsics.areEqual(this.filterName, ((PerformerFilter) obj).filterName);
            }

            public int hashCode() {
                return this.filterName.hashCode();
            }

            public String toString() {
                return android.support.v4.media.b.l(a1.a.m("PerformerFilter(filterName="), this.filterName, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType$PerformerOrder;", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", BuildConfig.FLAVOR, "component1", "orderName", "Ljava/lang/String;", "getOrderName", "()Ljava/lang/String;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class PerformerOrder extends OverlayItemType {
            private final String orderName;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PerformerOrder(String orderName) {
                super(null);
                Intrinsics.checkNotNullParameter(orderName, "orderName");
                this.orderName = orderName;
            }

            public final String component1() {
                return this.orderName;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PerformerOrder) && Intrinsics.areEqual(this.orderName, ((PerformerOrder) obj).orderName);
            }

            public int hashCode() {
                return this.orderName.hashCode();
            }

            public String toString() {
                return android.support.v4.media.b.l(a1.a.m("PerformerOrder(orderName="), this.orderName, ')');
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType$TopNavChild;", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "component1", "item", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "a", "()Lcom/app/pornhub/view/home/topnav/TopNavigation$ChildItem;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class TopNavChild extends OverlayItemType {
            private final TopNavigation.ChildItem item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopNavChild(TopNavigation.ChildItem item) {
                super(null);
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public final TopNavigation.ChildItem a() {
                return this.item;
            }

            public final TopNavigation.ChildItem component1() {
                return this.item;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof TopNavChild) && Intrinsics.areEqual(this.item, ((TopNavChild) obj).item)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("TopNavChild(item=");
                m10.append(this.item);
                m10.append(')');
                return m10.toString();
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType$TopNavParent;", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "component1", "item", "Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "a", "()Lcom/app/pornhub/view/home/topnav/TopNavigation$ParentItem;", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class TopNavParent extends OverlayItemType {
            private final TopNavigation.ParentItem item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopNavParent(TopNavigation.ParentItem item) {
                super(null);
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public final TopNavigation.ParentItem a() {
                return this.item;
            }

            public final TopNavigation.ParentItem component1() {
                return this.item;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TopNavParent) && Intrinsics.areEqual(this.item, ((TopNavParent) obj).item);
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                StringBuilder m10 = a1.a.m("TopNavParent(item=");
                m10.append(this.item);
                m10.append(')');
                return m10.toString();
            }
        }

        /* loaded from: classes.dex */
        public static final class a extends OverlayItemType {

            /* renamed from: a  reason: collision with root package name */
            public static final a f5242a = new a();

            public a() {
                super(null);
            }
        }

        public OverlayItemType(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b(OverlayItemType overlayItemType, Object obj);
    }

    /* loaded from: classes.dex */
    public static abstract class b extends RecyclerView.z {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x1.a binding) {
            super(((ItemSortingOptionBinding) binding).f4795a);
            Intrinsics.checkNotNullParameter(binding, "binding");
        }

        public abstract void x(OverlaySelectionItem overlaySelectionItem);
    }

    /* loaded from: classes.dex */
    public final class c extends b {

        /* renamed from: u  reason: collision with root package name */
        public final ItemSortingOptionBinding f5243u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ OverlayAdapter f5244v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(OverlayAdapter this$0, ItemSortingOptionBinding binding) {
            super(binding);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.f5244v = this$0;
            this.f5243u = binding;
        }

        @Override // com.app.pornhub.view.home.overlay.OverlayAdapter.b
        public void x(final OverlaySelectionItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f5243u.f4796b.setText(item.b());
            if (item.d()) {
                TextView textView = this.f5243u.f4796b;
                textView.setTextColor(c0.a.b(textView.getContext(), R.color.white));
            } else {
                TextView textView2 = this.f5243u.f4796b;
                textView2.setTextColor(c0.a.b(textView2.getContext(), R.color.pornhub_txt_grey));
            }
            TextView textView3 = this.f5243u.f4796b;
            final OverlayAdapter overlayAdapter = this.f5244v;
            textView3.setOnClickListener(new View.OnClickListener() { // from class: q4.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OverlayAdapter.c this$0 = OverlayAdapter.c.this;
                    OverlayAdapter this$1 = overlayAdapter;
                    OverlaySelectionItem item2 = item;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    Intrinsics.checkNotNullParameter(this$1, "this$1");
                    Intrinsics.checkNotNullParameter(item2, "$item");
                    if (this$0.f() == this$1.d.f2969f.size() - 1 || item2.d()) {
                        OverlayAdapter.a aVar = this$1.f5241f;
                        if (aVar == null) {
                            return;
                        }
                        aVar.a();
                        return;
                    }
                    OverlayAdapter.a aVar2 = this$1.f5241f;
                    if (aVar2 == null) {
                        return;
                    }
                    OverlayAdapter.OverlayItemType c10 = item2.c();
                    Intrinsics.checkNotNull(c10);
                    aVar2.b(c10, item2.a());
                }
            });
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public OverlayAdapter(androidx.recyclerview.widget.n.e r1, int r2) {
        /*
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto La
            q4.a r1 = new q4.a
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
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.home.overlay.OverlayAdapter.<init>(androidx.recyclerview.widget.n$e, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void h(RecyclerView.z zVar, int i10) {
        b holder = (b) zVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Object obj = this.d.f2969f.get(i10);
        Intrinsics.checkNotNullExpressionValue(obj, "getItem(position)");
        holder.x((OverlaySelectionItem) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.z i(ViewGroup parent, int i10) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        ItemSortingOptionBinding bind = ItemSortingOptionBinding.bind(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sorting_option, parent, false));
        Intrinsics.checkNotNullExpressionValue(bind, "inflate(\n               …      false\n            )");
        return new c(this, bind);
    }
}
