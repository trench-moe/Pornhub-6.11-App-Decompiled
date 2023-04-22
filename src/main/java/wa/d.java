package wa;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.appcompat.view.menu.j;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import cb.k;
import com.app.pornhub.R;
import java.util.HashSet;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import ua.h;

/* loaded from: classes2.dex */
public abstract class d extends ViewGroup implements j {
    public static final int[] S = {16842912};
    public static final int[] T = {-16842910};
    public ColorStateList A;
    public final ColorStateList B;
    public int C;
    public int D;
    public Drawable E;
    public int F;
    public SparseArray<ha.a> G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public int L;
    public int M;
    public k N;
    public boolean O;
    public ColorStateList P;
    public e Q;
    public androidx.appcompat.view.menu.e R;

    /* renamed from: c  reason: collision with root package name */
    public final TransitionSet f17409c;

    /* renamed from: f  reason: collision with root package name */
    public final View.OnClickListener f17410f;

    /* renamed from: j  reason: collision with root package name */
    public final m0.c<wa.a> f17411j;

    /* renamed from: m  reason: collision with root package name */
    public final SparseArray<View.OnTouchListener> f17412m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public wa.a[] f17413t;

    /* renamed from: u  reason: collision with root package name */
    public int f17414u;

    /* renamed from: w  reason: collision with root package name */
    public int f17415w;
    public ColorStateList y;

    /* renamed from: z  reason: collision with root package name */
    public int f17416z;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            androidx.appcompat.view.menu.g itemData = ((wa.a) view).getItemData();
            d dVar = d.this;
            if (dVar.R.r(itemData, dVar.Q, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public d(Context context) {
        super(context);
        this.f17411j = new m0.e(5);
        this.f17412m = new SparseArray<>(5);
        this.f17414u = 0;
        this.f17415w = 0;
        this.G = new SparseArray<>(5);
        this.H = -1;
        this.I = -1;
        this.O = false;
        this.B = c(16842808);
        AutoTransition autoTransition = new AutoTransition();
        this.f17409c = autoTransition;
        autoTransition.Q(0);
        autoTransition.O(va.a.c(getContext(), R.attr.motionDurationLong1, getResources().getInteger(R.integer.material_motion_duration_long_1)));
        autoTransition.P(va.a.d(getContext(), R.attr.motionEasingStandard, ga.a.f9887b));
        autoTransition.M(new h());
        this.f17410f = new a();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(this, 1);
    }

    private wa.a getNewItem() {
        wa.a b10 = this.f17411j.b();
        if (b10 == null) {
            b10 = e(getContext());
        }
        return b10;
    }

    private void setBadgeIfNeeded(wa.a aVar) {
        int id2 = aVar.getId();
        if (id2 != -1) {
            ha.a aVar2 = this.G.get(id2);
            if (aVar2 != null) {
                aVar.setBadge(aVar2);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a() {
        removeAllViews();
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f17411j.a(aVar);
                    ImageView imageView = aVar.A;
                    if (aVar.b()) {
                        if (imageView != null) {
                            aVar.setClipChildren(true);
                            aVar.setClipToPadding(true);
                            ha.b.b(aVar.R, imageView);
                        }
                        aVar.R = null;
                    }
                    aVar.F = null;
                    aVar.L = 0.0f;
                    aVar.f17395c = false;
                }
            }
        }
        if (this.R.size() == 0) {
            this.f17414u = 0;
            this.f17415w = 0;
            this.f17413t = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < this.R.size(); i10++) {
            hashSet.add(Integer.valueOf(this.R.getItem(i10).getItemId()));
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            int keyAt = this.G.keyAt(i11);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.G.delete(keyAt);
            }
        }
        this.f17413t = new wa.a[this.R.size()];
        boolean f10 = f(this.n, this.R.l().size());
        for (int i12 = 0; i12 < this.R.size(); i12++) {
            this.Q.f17419f = true;
            this.R.getItem(i12).setCheckable(true);
            this.Q.f17419f = false;
            wa.a newItem = getNewItem();
            this.f17413t[i12] = newItem;
            newItem.setIconTintList(this.y);
            newItem.setIconSize(this.f17416z);
            newItem.setTextColor(this.B);
            newItem.setTextAppearanceInactive(this.C);
            newItem.setTextAppearanceActive(this.D);
            newItem.setTextColor(this.A);
            int i13 = this.H;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.I;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            newItem.setActiveIndicatorWidth(this.K);
            newItem.setActiveIndicatorHeight(this.L);
            newItem.setActiveIndicatorMarginHorizontal(this.M);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.O);
            newItem.setActiveIndicatorEnabled(this.J);
            Drawable drawable = this.E;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.F);
            }
            newItem.setShifting(f10);
            newItem.setLabelVisibilityMode(this.n);
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.R.getItem(i12);
            newItem.d(gVar, 0);
            newItem.setItemPosition(i12);
            int i15 = gVar.f667a;
            newItem.setOnTouchListener(this.f17412m.get(i15));
            newItem.setOnClickListener(this.f17410f);
            int i16 = this.f17414u;
            if (i16 != 0 && i15 == i16) {
                this.f17415w = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.R.size() - 1, this.f17415w);
        this.f17415w = min;
        this.R.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.R = eVar;
    }

    public ColorStateList c(int i10) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            ColorStateList c10 = c0.a.c(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
                int i11 = typedValue.data;
                int defaultColor = c10.getDefaultColor();
                int[] iArr = T;
                return new ColorStateList(new int[][]{iArr, S, ViewGroup.EMPTY_STATE_SET}, new int[]{c10.getColorForState(iArr, defaultColor), i11, defaultColor});
            }
            return null;
        }
        return null;
    }

    public final Drawable d() {
        if (this.N == null || this.P == null) {
            return null;
        }
        cb.g gVar = new cb.g(this.N);
        gVar.r(this.P);
        return gVar;
    }

    public abstract wa.a e(Context context);

    public boolean f(int i10, int i11) {
        if (i10 == -1) {
            if (i11 > 3) {
                return true;
            }
        } else if (i10 == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<ha.a> getBadgeDrawables() {
        return this.G;
    }

    public ColorStateList getIconTintList() {
        return this.y;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.P;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.J;
    }

    public int getItemActiveIndicatorHeight() {
        return this.L;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.M;
    }

    public k getItemActiveIndicatorShapeAppearance() {
        return this.N;
    }

    public int getItemActiveIndicatorWidth() {
        return this.K;
    }

    public Drawable getItemBackground() {
        wa.a[] aVarArr = this.f17413t;
        return (aVarArr == null || aVarArr.length <= 0) ? this.E : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.F;
    }

    public int getItemIconSize() {
        return this.f17416z;
    }

    public int getItemPaddingBottom() {
        return this.I;
    }

    public int getItemPaddingTop() {
        return this.H;
    }

    public int getItemTextAppearanceActive() {
        return this.D;
    }

    public int getItemTextAppearanceInactive() {
        return this.C;
    }

    public ColorStateList getItemTextColor() {
        return this.A;
    }

    public int getLabelVisibilityMode() {
        return this.n;
    }

    public androidx.appcompat.view.menu.e getMenu() {
        return this.R;
    }

    public int getSelectedItemId() {
        return this.f17414u;
    }

    public int getSelectedItemPosition() {
        return this.f17415w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0228b.a(1, this.R.l().size(), false, 1).f13495a);
    }

    public void setBadgeDrawables(SparseArray<ha.a> sparseArray) {
        this.G = sparseArray;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.J = z10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorEnabled(z10);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.L = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorHeight(i10);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.M = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorMarginHorizontal(i10);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z10) {
        this.O = z10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorResizeable(z10);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(k kVar) {
        this.N = kVar;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.K = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setActiveIndicatorWidth(i10);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.E = drawable;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i10) {
        this.F = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setItemBackground(i10);
            }
        }
    }

    public void setItemIconSize(int i10) {
        this.f17416z = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setIconSize(i10);
            }
        }
    }

    public void setItemPaddingBottom(int i10) {
        this.I = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setItemPaddingBottom(i10);
            }
        }
    }

    public void setItemPaddingTop(int i10) {
        this.H = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setItemPaddingTop(i10);
            }
        }
    }

    public void setItemTextAppearanceActive(int i10) {
        this.D = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i10);
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.C = i10;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i10);
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        wa.a[] aVarArr = this.f17413t;
        if (aVarArr != null) {
            for (wa.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i10) {
        this.n = i10;
    }

    public void setPresenter(e eVar) {
        this.Q = eVar;
    }
}
