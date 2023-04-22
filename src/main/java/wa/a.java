package wa;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.t0;
import c0.a;
import com.app.pornhub.R;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.r;
import n0.x;
import o0.b;
import q0.h;

/* loaded from: classes2.dex */
public abstract class a extends FrameLayout implements j.a {
    public static final int[] S = {16842912};
    public static final c T = new c(null);
    public static final c U = new d(null);
    public final ImageView A;
    public final ViewGroup B;
    public final TextView C;
    public final TextView D;
    public int E;
    public androidx.appcompat.view.menu.g F;
    public ColorStateList G;
    public Drawable H;
    public Drawable I;
    public ValueAnimator J;
    public c K;
    public float L;
    public boolean M;
    public int N;
    public int O;
    public boolean P;
    public int Q;
    public ha.a R;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17395c;

    /* renamed from: f  reason: collision with root package name */
    public int f17396f;

    /* renamed from: j  reason: collision with root package name */
    public int f17397j;

    /* renamed from: m  reason: collision with root package name */
    public float f17398m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public float f17399t;

    /* renamed from: u  reason: collision with root package name */
    public int f17400u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f17401w;
    public final FrameLayout y;

    /* renamed from: z  reason: collision with root package name */
    public final View f17402z;

    /* renamed from: wa.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class View$OnLayoutChangeListenerC0284a implements View.OnLayoutChangeListener {
        public View$OnLayoutChangeListenerC0284a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            if (a.this.A.getVisibility() == 0) {
                a aVar = a.this;
                ImageView imageView = aVar.A;
                if (!aVar.b()) {
                    return;
                }
                ha.b.c(aVar.R, imageView, null);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f17404c;

        public b(int i10) {
            this.f17404c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.h(this.f17404c);
        }
    }

    /* loaded from: classes2.dex */
    public static class c {
        public c(View$OnLayoutChangeListenerC0284a view$OnLayoutChangeListenerC0284a) {
        }

        public float a(float f10, float f11) {
            return 1.0f;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        public d(View$OnLayoutChangeListenerC0284a view$OnLayoutChangeListenerC0284a) {
            super(null);
        }

        @Override // wa.a.c
        public float a(float f10, float f11) {
            return ga.a.a(0.4f, 1.0f, f10);
        }
    }

    public a(Context context) {
        super(context);
        this.f17395c = false;
        this.E = -1;
        this.K = T;
        this.L = 0.0f;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = false;
        this.Q = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.y = (FrameLayout) findViewById(R.id.navigation_bar_item_icon_container);
        this.f17402z = findViewById(R.id.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(R.id.navigation_bar_item_icon_view);
        this.A = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.navigation_bar_item_labels_group);
        this.B = viewGroup;
        TextView textView = (TextView) findViewById(R.id.navigation_bar_item_small_label_view);
        this.C = textView;
        TextView textView2 = (TextView) findViewById(R.id.navigation_bar_item_large_label_view);
        this.D = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f17396f = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f17397j = viewGroup.getPaddingBottom();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.s(textView, 2);
        x.d.s(textView2, 2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0284a());
        }
    }

    public static void f(View view, float f10, float f11, int i10) {
        view.setScaleX(f10);
        view.setScaleY(f11);
        view.setVisibility(i10);
    }

    public static void g(View view, int i10, int i11) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i10;
        layoutParams.bottomMargin = i10;
        layoutParams.gravity = i11;
        view.setLayoutParams(layoutParams);
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.y;
        return frameLayout != null ? frameLayout : this.A;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i10 = 0;
        for (int i11 = 0; i11 < indexOfChild; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof a) && childAt.getVisibility() == 0) {
                i10++;
            }
        }
        return i10;
    }

    private int getSuggestedIconHeight() {
        ha.a aVar = this.R;
        int minimumHeight = aVar != null ? aVar.getMinimumHeight() / 2 : 0;
        return this.A.getMeasuredWidth() + Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        ha.a aVar = this.R;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.R.f10403w.A;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.A.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i10) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i10);
    }

    public final void a(float f10, float f11) {
        this.f17398m = f10 - f11;
        this.n = (f11 * 1.0f) / f10;
        this.f17399t = (f10 * 1.0f) / f11;
    }

    public final boolean b() {
        return this.R != null;
    }

    public final void c() {
        androidx.appcompat.view.menu.g gVar = this.F;
        if (gVar != null) {
            setChecked(gVar.isChecked());
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(androidx.appcompat.view.menu.g gVar, int i10) {
        this.F = gVar;
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setIcon(gVar.getIcon());
        setTitle(gVar.f670e);
        setId(gVar.f667a);
        if (!TextUtils.isEmpty(gVar.f681q)) {
            setContentDescription(gVar.f681q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(gVar.f682r) ? gVar.f682r : gVar.f670e;
        if (Build.VERSION.SDK_INT > 23) {
            t0.a(this, charSequence);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        this.f17395c = true;
    }

    public final void e(float f10, float f11) {
        View view = this.f17402z;
        if (view != null) {
            c cVar = this.K;
            Objects.requireNonNull(cVar);
            view.setScaleX(ga.a.a(0.4f, 1.0f, f10));
            view.setScaleY(cVar.a(f10, f11));
            int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
            view.setAlpha(ga.a.b(0.0f, 1.0f, i10 == 0 ? 0.8f : 0.0f, i10 == 0 ? 1.0f : 0.2f, f10));
        }
        this.L = f10;
    }

    public Drawable getActiveIndicatorDrawable() {
        View view = this.f17402z;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public ha.a getBadge() {
        return this.R;
    }

    public int getItemBackgroundResId() {
        return R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.F;
    }

    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.E;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        return this.B.getMeasuredHeight() + getSuggestedIconHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.B.getLayoutParams();
        int i10 = layoutParams.leftMargin;
        return Math.max(getSuggestedIconWidth(), this.B.getMeasuredWidth() + i10 + layoutParams.rightMargin);
    }

    public final void h(int i10) {
        if (this.f17402z == null) {
            return;
        }
        int min = Math.min(this.N, i10 - (this.Q * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f17402z.getLayoutParams();
        layoutParams.height = this.P && this.f17400u == 2 ? min : this.O;
        layoutParams.width = min;
        this.f17402z.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.F;
        if (gVar != null && gVar.isCheckable() && this.F.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, S);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ha.a aVar = this.R;
        if (aVar != null && aVar.isVisible()) {
            androidx.appcompat.view.menu.g gVar = this.F;
            CharSequence charSequence = gVar.f670e;
            if (!TextUtils.isEmpty(gVar.f681q)) {
                charSequence = this.F.f681q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.R.c()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).f13496a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.f13484g.f13492a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        post(new b(i10));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.f17402z;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z10) {
        this.M = z10;
        View view = this.f17402z;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i10) {
        this.O = i10;
        h(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i10) {
        this.Q = i10;
        h(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z10) {
        this.P = z10;
    }

    public void setActiveIndicatorWidth(int i10) {
        this.N = i10;
        h(getWidth());
    }

    public void setBadge(ha.a aVar) {
        this.R = aVar;
        ImageView imageView = this.A;
        if (imageView == null || !b() || imageView == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ha.b.a(this.R, imageView, null);
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setChecked(boolean r13) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.a.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.C.setEnabled(z10);
        this.D.setEnabled(z10);
        this.A.setEnabled(z10);
        if (z10) {
            x.x(this, r.a(getContext(), 1002));
        } else {
            x.x(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.H) {
            return;
        }
        this.H = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = f0.a.h(drawable).mutate();
            this.I = drawable;
            ColorStateList colorStateList = this.G;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.A.setImageDrawable(drawable);
    }

    public void setIconSize(int i10) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        this.A.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.G = colorStateList;
        if (this.F == null || (drawable = this.I) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.I.invalidateSelf();
    }

    public void setItemBackground(int i10) {
        Drawable b10;
        if (i10 == 0) {
            b10 = null;
        } else {
            Context context = getContext();
            Object obj = c0.a.f3717a;
            b10 = a.c.b(context, i10);
        }
        setItemBackground(b10);
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.q(this, drawable);
    }

    public void setItemPaddingBottom(int i10) {
        if (this.f17397j != i10) {
            this.f17397j = i10;
            c();
        }
    }

    public void setItemPaddingTop(int i10) {
        if (this.f17396f != i10) {
            this.f17396f = i10;
            c();
        }
    }

    public void setItemPosition(int i10) {
        this.E = i10;
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f17400u != i10) {
            this.f17400u = i10;
            if (this.P && i10 == 2) {
                this.K = U;
            } else {
                this.K = T;
            }
            h(getWidth());
            c();
        }
    }

    public void setShifting(boolean z10) {
        if (this.f17401w != z10) {
            this.f17401w = z10;
            c();
        }
    }

    public void setTextAppearanceActive(int i10) {
        h.f(this.D, i10);
        a(this.C.getTextSize(), this.D.getTextSize());
    }

    public void setTextAppearanceInactive(int i10) {
        h.f(this.C, i10);
        a(this.C.getTextSize(), this.D.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.C.setTextColor(colorStateList);
            this.D.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTitle(java.lang.CharSequence r6) {
        /*
            r5 = this;
            r2 = r5
            android.widget.TextView r0 = r2.C
            r4 = 2
            r0.setText(r6)
            r4 = 1
            android.widget.TextView r0 = r2.D
            r4 = 6
            r0.setText(r6)
            androidx.appcompat.view.menu.g r0 = r2.F
            if (r0 == 0) goto L1e
            r4 = 4
            java.lang.CharSequence r0 = r0.f681q
            r4 = 2
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r0 = r4
            if (r0 == 0) goto L22
            r4 = 2
        L1e:
            r4 = 1
            r2.setContentDescription(r6)
        L22:
            r4 = 6
            androidx.appcompat.view.menu.g r0 = r2.F
            r4 = 1
            if (r0 == 0) goto L38
            r4 = 3
            java.lang.CharSequence r0 = r0.f682r
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            r0 = r4
            if (r0 == 0) goto L33
            goto L39
        L33:
            androidx.appcompat.view.menu.g r6 = r2.F
            java.lang.CharSequence r6 = r6.f682r
            r4 = 2
        L38:
            r4 = 7
        L39:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            r1 = r4
            if (r0 <= r1) goto L44
            androidx.appcompat.widget.t0.a(r2, r6)
            r4 = 2
        L44:
            r4 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.a.setTitle(java.lang.CharSequence):void");
    }
}
