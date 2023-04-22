package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import com.app.pornhub.R;
import java.util.ArrayList;
import n0.b;

/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    public Drawable A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final SparseBooleanArray I;
    public e J;
    public a K;
    public RunnableC0018c L;
    public b M;
    public final f N;
    public int O;

    /* renamed from: z  reason: collision with root package name */
    public d f963z;

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.h {
        public a(Context context, androidx.appcompat.view.menu.l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.A.g()) {
                View view2 = c.this.f963z;
                this.f695f = view2 == null ? (View) c.this.f612w : view2;
            }
            d(c.this.N);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            c cVar = c.this;
            cVar.K = null;
            cVar.O = 0;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0018c implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public e f966c;

        public RunnableC0018c(e eVar) {
            this.f966c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = c.this.f608j;
            if (eVar != null && (aVar = eVar.f645e) != null) {
                aVar.b(eVar);
            }
            View view = (View) c.this.f612w;
            if (view != null && view.getWindowToken() != null && this.f966c.f()) {
                c.this.J = this.f966c;
            }
            c.this.L = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends y {
            public a(View view, c cVar) {
                super(view);
            }

            @Override // androidx.appcompat.widget.y
            public k.f b() {
                e eVar = c.this.J;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.y
            public boolean c() {
                c.this.q();
                return true;
            }

            @Override // androidx.appcompat.widget.y
            public boolean d() {
                c cVar = c.this;
                if (cVar.L != null) {
                    return false;
                }
                cVar.l();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            t0.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.q();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, R.attr.actionOverflowMenuStyle, 0);
            this.f696g = 8388613;
            d(c.this.N);
        }

        @Override // androidx.appcompat.view.menu.h
        public void c() {
            androidx.appcompat.view.menu.e eVar = c.this.f608j;
            if (eVar != null) {
                eVar.c(true);
            }
            c.this.J = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.l) {
                eVar.k().c(false);
            }
            i.a aVar = c.this.n;
            if (aVar != null) {
                aVar.d(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            c cVar = c.this;
            boolean z10 = false;
            if (eVar == cVar.f608j) {
                return false;
            }
            cVar.O = ((androidx.appcompat.view.menu.l) eVar).A.f667a;
            i.a aVar = cVar.n;
            if (aVar != null) {
                z10 = aVar.e(eVar);
            }
            return z10;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class g implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public int f972c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g() {
        }

        public g(Parcel parcel) {
            this.f972c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f972c);
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.I = new SparseBooleanArray();
        this.N = new f();
    }

    public boolean b() {
        return l() | o();
    }

    public View c(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.f()) {
            j.a aVar = view instanceof j.a ? (j.a) view : (j.a) this.f609m.inflate(this.f611u, viewGroup, false);
            aVar.d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f612w);
            if (this.M == null) {
                this.M = new b();
            }
            actionMenuItemView.setPopupCallback(this.M);
            actionView = (View) aVar;
        }
        actionView.setVisibility(gVar.C ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
        b();
        i.a aVar = this.n;
        if (aVar != null) {
            aVar.d(eVar, z10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013a  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void e(boolean r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.e(boolean):void");
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean f() {
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i10;
        int i11;
        boolean z10;
        androidx.appcompat.view.menu.e eVar = this.f608j;
        if (eVar != null) {
            arrayList = eVar.l();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i12 = this.G;
        int i13 = this.F;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f612w;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            androidx.appcompat.view.menu.g gVar = arrayList.get(i14);
            int i17 = gVar.y;
            if ((i17 & 2) == 2) {
                i16++;
            } else if ((i17 & 1) == 1) {
                i15++;
            } else {
                z11 = true;
            }
            if (this.H && gVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.C && (z11 || i15 + i16 > i12)) {
            i12--;
        }
        int i18 = i12 - i16;
        SparseBooleanArray sparseBooleanArray = this.I;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i19);
            int i21 = gVar2.y;
            if ((i21 & 2) == i11) {
                View c10 = c(gVar2, null, viewGroup);
                c10.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = c10.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = gVar2.f668b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                gVar2.l(z10);
            } else if ((i21 & 1) == z10) {
                int i23 = gVar2.f668b;
                boolean z12 = sparseBooleanArray.get(i23);
                boolean z13 = (i18 > 0 || z12) && i13 > 0;
                if (z13) {
                    View c11 = c(gVar2, null, viewGroup);
                    c11.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = c11.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 &= i13 + i20 > 0;
                }
                if (z13 && i23 != 0) {
                    sparseBooleanArray.put(i23, true);
                } else if (z12) {
                    sparseBooleanArray.put(i23, false);
                    for (int i24 = 0; i24 < i19; i24++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i24);
                        if (gVar3.f668b == i23) {
                            if (gVar3.g()) {
                                i18++;
                            }
                            gVar3.l(false);
                        }
                    }
                }
                if (z13) {
                    i18--;
                }
                gVar2.l(z13);
            } else {
                gVar2.l(false);
                i19++;
                i11 = 2;
                z10 = true;
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r2 <= 960) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(android.content.Context r7, androidx.appcompat.view.menu.e r8) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.j(android.content.Context, androidx.appcompat.view.menu.e):void");
    }

    @Override // androidx.appcompat.view.menu.i
    public void k(Parcelable parcelable) {
        MenuItem findItem;
        if (parcelable instanceof g) {
            int i10 = ((g) parcelable).f972c;
            if (i10 > 0 && (findItem = this.f608j.findItem(i10)) != null) {
                m((androidx.appcompat.view.menu.l) findItem.getSubMenu());
            }
        }
    }

    public boolean l() {
        androidx.appcompat.view.menu.j jVar;
        RunnableC0018c runnableC0018c = this.L;
        if (runnableC0018c != null && (jVar = this.f612w) != null) {
            ((View) jVar).removeCallbacks(runnableC0018c);
            this.L = null;
            return true;
        }
        e eVar = this.J;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.f699j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean m(androidx.appcompat.view.menu.l lVar) {
        boolean z10 = false;
        if (lVar.hasVisibleItems()) {
            androidx.appcompat.view.menu.l lVar2 = lVar;
            while (true) {
                androidx.appcompat.view.menu.e eVar = lVar2.f712z;
                if (eVar == this.f608j) {
                    break;
                }
                lVar2 = (androidx.appcompat.view.menu.l) eVar;
            }
            androidx.appcompat.view.menu.g gVar = lVar2.A;
            ViewGroup viewGroup = (ViewGroup) this.f612w;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i10);
                    if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == gVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view == null) {
                return false;
            }
            this.O = lVar.A.f667a;
            int size = lVar.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    break;
                }
                MenuItem item = lVar.getItem(i11);
                if (item.isVisible() && item.getIcon() != null) {
                    z10 = true;
                    break;
                }
                i11++;
            }
            a aVar = new a(this.f607f, lVar, view);
            this.K = aVar;
            aVar.f697h = z10;
            k.d dVar = aVar.f699j;
            if (dVar != null) {
                dVar.r(z10);
            }
            if (this.K.f()) {
                i.a aVar2 = this.n;
                if (aVar2 != null) {
                    aVar2.e(lVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public Parcelable n() {
        g gVar = new g();
        gVar.f972c = this.O;
        return gVar;
    }

    public boolean o() {
        a aVar = this.K;
        if (aVar != null) {
            if (aVar.b()) {
                aVar.f699j.dismiss();
            }
            return true;
        }
        return false;
    }

    public boolean p() {
        e eVar = this.J;
        return eVar != null && eVar.b();
    }

    public boolean q() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.C || p() || (eVar = this.f608j) == null || this.f612w == null || this.L != null) {
            return false;
        }
        eVar.i();
        if (eVar.f650j.isEmpty()) {
            return false;
        }
        RunnableC0018c runnableC0018c = new RunnableC0018c(new e(this.f607f, this.f608j, this.f963z, true));
        this.L = runnableC0018c;
        ((View) this.f612w).post(runnableC0018c);
        return true;
    }
}
