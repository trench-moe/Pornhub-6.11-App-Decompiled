package ua;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c0;
import com.app.pornhub.R;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes2.dex */
public class c implements androidx.appcompat.view.menu.i {
    public ColorStateList A;
    public Drawable B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public int L;
    public int M;
    public int N;

    /* renamed from: c  reason: collision with root package name */
    public NavigationMenuView f15786c;

    /* renamed from: f  reason: collision with root package name */
    public LinearLayout f15787f;

    /* renamed from: j  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f15788j;

    /* renamed from: m  reason: collision with root package name */
    public int f15789m;
    public C0274c n;

    /* renamed from: t  reason: collision with root package name */
    public LayoutInflater f15790t;

    /* renamed from: w  reason: collision with root package name */
    public ColorStateList f15792w;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f15793z;

    /* renamed from: u  reason: collision with root package name */
    public int f15791u = 0;
    public int y = 0;
    public boolean K = true;
    public int O = -1;
    public final View.OnClickListener P = new a();

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z10 = true;
            c.this.c(true);
            androidx.appcompat.view.menu.g itemData = ((NavigationMenuItemView) view).getItemData();
            c cVar = c.this;
            boolean r10 = cVar.f15788j.r(itemData, cVar, 0);
            if (itemData != null && itemData.isCheckable() && r10) {
                c.this.n.n(itemData);
            } else {
                z10 = false;
            }
            c.this.c(false);
            if (z10) {
                c.this.e(false);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* renamed from: ua.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0274c extends RecyclerView.Adapter<l> {
        public final ArrayList<e> d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f15795e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f15796f;

        public C0274c() {
            m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int a() {
            return this.d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long b(int i10) {
            return i10;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int c(int i10) {
            e eVar = this.d.get(i10);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).f15800a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void h(l lVar, int i10) {
            l lVar2 = lVar;
            int c10 = c(i10);
            if (c10 != 0) {
                if (c10 != 1) {
                    if (c10 != 2) {
                        return;
                    }
                    f fVar = (f) this.d.get(i10);
                    View view = lVar2.f2885a;
                    c cVar = c.this;
                    view.setPadding(cVar.G, fVar.f15798a, cVar.H, fVar.f15799b);
                    return;
                }
                TextView textView = (TextView) lVar2.f2885a;
                textView.setText(((g) this.d.get(i10)).f15800a.f670e);
                int i11 = c.this.f15791u;
                if (i11 != 0) {
                    q0.h.f(textView, i11);
                }
                int i12 = c.this.I;
                int paddingTop = textView.getPaddingTop();
                Objects.requireNonNull(c.this);
                textView.setPadding(i12, paddingTop, 0, textView.getPaddingBottom());
                ColorStateList colorStateList = c.this.f15792w;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.f2885a;
            navigationMenuItemView.setIconTintList(c.this.A);
            int i13 = c.this.y;
            if (i13 != 0) {
                navigationMenuItemView.setTextAppearance(i13);
            }
            ColorStateList colorStateList2 = c.this.f15793z;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = c.this.B;
            Drawable newDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.q(navigationMenuItemView, newDrawable);
            g gVar = (g) this.d.get(i10);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.f15801b);
            c cVar2 = c.this;
            int i14 = cVar2.C;
            int i15 = cVar2.D;
            navigationMenuItemView.setPadding(i14, i15, i14, i15);
            navigationMenuItemView.setIconPadding(c.this.E);
            c cVar3 = c.this;
            if (cVar3.J) {
                navigationMenuItemView.setIconSize(cVar3.F);
            }
            navigationMenuItemView.setMaxLines(c.this.L);
            navigationMenuItemView.d(gVar.f15800a, 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public l i(ViewGroup viewGroup, int i10) {
            l iVar;
            if (i10 == 0) {
                c cVar = c.this;
                iVar = new i(cVar.f15790t, viewGroup, cVar.P);
            } else if (i10 == 1) {
                iVar = new k(c.this.f15790t, viewGroup);
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return null;
                }
                return new b(c.this.f15787f);
            } else {
                iVar = new j(c.this.f15790t, viewGroup);
            }
            return iVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void l(l lVar) {
            l lVar2 = lVar;
            if (lVar2 instanceof i) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar2.f2885a;
                FrameLayout frameLayout = navigationMenuItemView.P;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.O.setCompoundDrawables(null, null, null, null);
            }
        }

        public final void m() {
            if (this.f15796f) {
                return;
            }
            this.f15796f = true;
            this.d.clear();
            this.d.add(new d());
            int i10 = -1;
            int size = c.this.f15788j.l().size();
            boolean z10 = false;
            int i11 = 0;
            boolean z11 = false;
            int i12 = 0;
            while (i11 < size) {
                androidx.appcompat.view.menu.g gVar = c.this.f15788j.l().get(i11);
                if (gVar.isChecked()) {
                    n(gVar);
                }
                if (gVar.isCheckable()) {
                    gVar.k(z10);
                }
                if (gVar.hasSubMenu()) {
                    androidx.appcompat.view.menu.l lVar = gVar.f679o;
                    if (lVar.hasVisibleItems()) {
                        if (i11 != 0) {
                            this.d.add(new f(c.this.N, z10 ? 1 : 0));
                        }
                        this.d.add(new g(gVar));
                        int size2 = lVar.size();
                        int i13 = 0;
                        boolean z12 = false;
                        while (i13 < size2) {
                            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) lVar.getItem(i13);
                            if (gVar2.isVisible()) {
                                if (!z12 && gVar2.getIcon() != null) {
                                    z12 = true;
                                }
                                if (gVar2.isCheckable()) {
                                    gVar2.k(z10);
                                }
                                if (gVar.isChecked()) {
                                    n(gVar);
                                }
                                this.d.add(new g(gVar2));
                            }
                            i13++;
                            z10 = false;
                        }
                        if (z12) {
                            int size3 = this.d.size();
                            for (int size4 = this.d.size(); size4 < size3; size4++) {
                                ((g) this.d.get(size4)).f15801b = true;
                            }
                        }
                    }
                } else {
                    int i14 = gVar.f668b;
                    if (i14 != i10) {
                        i12 = this.d.size();
                        z11 = gVar.getIcon() != null;
                        if (i11 != 0) {
                            i12++;
                            ArrayList<e> arrayList = this.d;
                            int i15 = c.this.N;
                            arrayList.add(new f(i15, i15));
                        }
                    } else if (!z11 && gVar.getIcon() != null) {
                        int size5 = this.d.size();
                        for (int i16 = i12; i16 < size5; i16++) {
                            ((g) this.d.get(i16)).f15801b = true;
                        }
                        z11 = true;
                    }
                    g gVar3 = new g(gVar);
                    gVar3.f15801b = z11;
                    this.d.add(gVar3);
                    i10 = i14;
                }
                i11++;
                z10 = false;
            }
            this.f15796f = false;
        }

        public void n(androidx.appcompat.view.menu.g gVar) {
            if (this.f15795e != gVar) {
                if (!gVar.isCheckable()) {
                    return;
                }
                androidx.appcompat.view.menu.g gVar2 = this.f15795e;
                if (gVar2 != null) {
                    gVar2.setChecked(false);
                }
                this.f15795e = gVar;
                gVar.setChecked(true);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements e {
    }

    /* loaded from: classes2.dex */
    public interface e {
    }

    /* loaded from: classes2.dex */
    public static class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final int f15798a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15799b;

        public f(int i10, int i11) {
            this.f15798a = i10;
            this.f15799b = i11;
        }
    }

    /* loaded from: classes2.dex */
    public static class g implements e {

        /* renamed from: a  reason: collision with root package name */
        public final androidx.appcompat.view.menu.g f15800a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15801b;

        public g(androidx.appcompat.view.menu.g gVar) {
            this.f15800a = gVar;
        }
    }

    /* loaded from: classes2.dex */
    public class h extends c0 {
        public h(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.c0, n0.a
        public void d(View view, o0.b bVar) {
            super.d(view, bVar);
            C0274c c0274c = c.this.n;
            int i10 = c.this.f15787f.getChildCount() == 0 ? 0 : 1;
            for (int i11 = 0; i11 < c.this.n.a(); i11++) {
                if (c.this.n.c(i11) == 0) {
                    i10++;
                }
            }
            bVar.f13479a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i10, 0, false));
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends l {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public i(android.view.LayoutInflater r3, android.view.ViewGroup r4, android.view.View.OnClickListener r5) {
            /*
                r2 = this;
                r0 = 2131558471(0x7f0d0047, float:1.8742259E38)
                r1 = 0
                android.view.View r3 = r3.inflate(r0, r4, r1)
                r2.<init>(r3)
                r3.setOnClickListener(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ua.c.i.<init>(android.view.LayoutInflater, android.view.ViewGroup, android.view.View$OnClickListener):void");
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends l {
        public j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    public static class k extends l {
        public k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class l extends RecyclerView.z {
        public l(View view) {
            super(view);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public int a() {
        return this.f15789m;
    }

    public void b(int i10) {
        this.E = i10;
        e(false);
    }

    public void c(boolean z10) {
        C0274c c0274c = this.n;
        if (c0274c != null) {
            c0274c.f15796f = z10;
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.i
    public void e(boolean z10) {
        C0274c c0274c = this.n;
        if (c0274c != null) {
            c0274c.m();
            c0274c.f2802a.b();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f15790t = LayoutInflater.from(context);
        this.f15788j = eVar;
        this.N = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
        androidx.appcompat.view.menu.g gVar;
        View actionView;
        ua.e eVar;
        androidx.appcompat.view.menu.g gVar2;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.f15786c.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                C0274c c0274c = this.n;
                Objects.requireNonNull(c0274c);
                int i10 = bundle2.getInt("android:menu:checked", 0);
                if (i10 != 0) {
                    c0274c.f15796f = true;
                    int size = c0274c.d.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= size) {
                            break;
                        }
                        e eVar2 = c0274c.d.get(i11);
                        if ((eVar2 instanceof g) && (gVar2 = ((g) eVar2).f15800a) != null && gVar2.f667a == i10) {
                            c0274c.n(gVar2);
                            break;
                        }
                        i11++;
                    }
                    c0274c.f15796f = false;
                    c0274c.m();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = c0274c.d.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        e eVar3 = c0274c.d.get(i12);
                        if ((eVar3 instanceof g) && (gVar = ((g) eVar3).f15800a) != null && (actionView = gVar.getActionView()) != null && (eVar = (ua.e) sparseParcelableArray2.get(gVar.f667a)) != null) {
                            actionView.restoreHierarchyState(eVar);
                        }
                    }
                }
            }
            SparseArray sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.f15787f.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    public final void l() {
        int i10 = (this.f15787f.getChildCount() == 0 && this.K) ? this.M : 0;
        NavigationMenuView navigationMenuView = this.f15786c;
        navigationMenuView.setPadding(0, i10, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(androidx.appcompat.view.menu.l lVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        Bundle bundle = new Bundle();
        if (this.f15786c != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f15786c.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        C0274c c0274c = this.n;
        if (c0274c != null) {
            Objects.requireNonNull(c0274c);
            Bundle bundle2 = new Bundle();
            androidx.appcompat.view.menu.g gVar = c0274c.f15795e;
            if (gVar != null) {
                bundle2.putInt("android:menu:checked", gVar.f667a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = c0274c.d.size();
            for (int i10 = 0; i10 < size; i10++) {
                e eVar = c0274c.d.get(i10);
                if (eVar instanceof g) {
                    androidx.appcompat.view.menu.g gVar2 = ((g) eVar).f15800a;
                    View actionView = gVar2 != null ? gVar2.getActionView() : null;
                    if (actionView != null) {
                        ua.e eVar2 = new ua.e();
                        actionView.saveHierarchyState(eVar2);
                        sparseArray2.put(gVar2.f667a, eVar2);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.f15787f != null) {
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>();
            this.f15787f.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }
}
