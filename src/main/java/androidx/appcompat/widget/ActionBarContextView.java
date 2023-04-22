package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    public View A;
    public View B;
    public View C;
    public LinearLayout D;
    public TextView E;
    public TextView F;
    public int G;
    public int H;
    public boolean I;
    public int J;
    public CharSequence y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f721z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j.a f722c;

        public a(ActionBarContextView actionBarContextView, j.a aVar) {
            this.f722c = aVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f722c.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b7.k.y, i10, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.a.a(context, resourceId);
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.d.q(this, drawable);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        this.H = obtainStyledAttributes.getResourceId(4, 0);
        this.n = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.J = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public void f(j.a aVar) {
        View view = this.A;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.J, (ViewGroup) this, false);
            this.A = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.A);
        }
        View findViewById = this.A.findViewById(R.id.action_mode_close_button);
        this.B = findViewById;
        findViewById.setOnClickListener(new a(this, aVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) aVar.e();
        c cVar = this.f955m;
        if (cVar != null) {
            cVar.b();
        }
        c cVar2 = new c(getContext());
        this.f955m = cVar2;
        cVar2.C = true;
        cVar2.D = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.b(this.f955m, this.f953f);
        c cVar3 = this.f955m;
        androidx.appcompat.view.menu.j jVar = cVar3.f612w;
        if (jVar == null) {
            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) cVar3.f609m.inflate(cVar3.f610t, (ViewGroup) this, false);
            cVar3.f612w = jVar2;
            jVar2.b(cVar3.f608j);
            cVar3.e(true);
        }
        androidx.appcompat.view.menu.j jVar3 = cVar3.f612w;
        if (jVar != jVar3) {
            ((ActionMenuView) jVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jVar3;
        this.f954j = actionMenuView;
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.d.q(actionMenuView, null);
        addView(this.f954j, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r10 = this;
            android.widget.LinearLayout r0 = r10.D
            if (r0 != 0) goto L60
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 2131558400(0x7f0d0000, float:1.8742115E38)
            r0.inflate(r1, r10)
            int r0 = r10.getChildCount()
            int r0 = r0 + (-1)
            android.view.View r6 = r10.getChildAt(r0)
            r0 = r6
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r10.D = r0
            r1 = 2131361856(0x7f0a0040, float:1.8343476E38)
            r9 = 4
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.E = r0
            r8 = 5
            android.widget.LinearLayout r0 = r10.D
            r7 = 5
            r1 = 2131361855(0x7f0a003f, float:1.8343474E38)
            r8 = 3
            android.view.View r0 = r0.findViewById(r1)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.F = r0
            r7 = 2
            int r0 = r10.G
            r7 = 7
            if (r0 == 0) goto L4e
            android.widget.TextView r0 = r10.E
            android.content.Context r6 = r10.getContext()
            r1 = r6
            int r2 = r10.G
            r0.setTextAppearance(r1, r2)
        L4e:
            r8 = 6
            int r0 = r10.H
            if (r0 == 0) goto L60
            android.widget.TextView r0 = r10.F
            r8 = 4
            android.content.Context r1 = r10.getContext()
            int r2 = r10.H
            r0.setTextAppearance(r1, r2)
            r9 = 2
        L60:
            android.widget.TextView r0 = r10.E
            java.lang.CharSequence r1 = r10.y
            r7 = 2
            r0.setText(r1)
            r9 = 5
            android.widget.TextView r0 = r10.F
            java.lang.CharSequence r1 = r10.f721z
            r0.setText(r1)
            java.lang.CharSequence r0 = r10.y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.CharSequence r1 = r10.f721z
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r1 = r6
            r1 = r1 ^ 1
            android.widget.TextView r2 = r10.F
            r3 = 0
            r9 = 6
            r4 = 8
            r8 = 5
            if (r1 == 0) goto L8e
            r7 = 6
            r6 = 0
            r5 = r6
            goto L92
        L8e:
            r7 = 5
            r5 = 8
            r7 = 5
        L92:
            r2.setVisibility(r5)
            android.widget.LinearLayout r2 = r10.D
            if (r0 != 0) goto L9f
            r9 = 7
            if (r1 == 0) goto L9d
            goto La0
        L9d:
            r3 = 8
        L9f:
            r9 = 5
        La0:
            r2.setVisibility(r3)
            android.widget.LinearLayout r0 = r10.D
            android.view.ViewParent r6 = r0.getParent()
            r0 = r6
            if (r0 != 0) goto Lb3
            r8 = 2
            android.widget.LinearLayout r0 = r10.D
            r7 = 1
            r10.addView(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.g():void");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f721z;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public void h() {
        removeAllViews();
        this.C = null;
        this.f954j = null;
        this.f955m = null;
        View view = this.B;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f955m;
        if (cVar != null) {
            cVar.l();
            this.f955m.o();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = x0.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.A;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = b10 ? paddingRight - i14 : paddingRight + i14;
            int d = i16 + d(this.A, i16, paddingTop, paddingTop2, b10);
            paddingRight = b10 ? d - i15 : d + i15;
        }
        int i17 = paddingRight;
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.C == null && linearLayout.getVisibility() != 8) {
            i17 += d(this.D, i17, paddingTop, paddingTop2, b10);
        }
        int i18 = i17;
        View view2 = this.C;
        if (view2 != null) {
            d(view2, i18, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f954j;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.onMeasure(int, int):void");
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.n = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.C;
        if (view2 != null) {
            removeView(view2);
        }
        this.C = view;
        if (view != null && (linearLayout = this.D) != null) {
            removeView(linearLayout);
            this.D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f721z = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.y = charSequence;
        g();
        n0.x.w(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.I) {
            requestLayout();
        }
        this.I = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
