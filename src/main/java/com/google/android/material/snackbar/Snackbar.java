package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import com.app.pornhub.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.i;

/* loaded from: classes.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f7660s = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* renamed from: q  reason: collision with root package name */
    public final AccessibilityManager f7661q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7662r;

    /* loaded from: classes.dex */
    public static final class SnackbarLayout extends BaseTransientBottomBar.i {
        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.i, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, db.f fVar) {
        super(context, viewGroup, view, fVar);
        this.f7661q = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static Snackbar k(View view, int i10, int i11) {
        return l(view, view.getResources().getText(i10), i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.material.snackbar.Snackbar l(android.view.View r11, java.lang.CharSequence r12, int r13) {
        /*
            r0 = 0
            java.lang.String r9 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r1 = r0
        L4:
            boolean r2 = r11 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r2 == 0) goto Ld
            r10 = 7
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r9 = 5
            goto L3d
        Ld:
            r10 = 5
            boolean r2 = r11 instanceof android.widget.FrameLayout
            r9 = 1
            if (r2 == 0) goto L27
            r9 = 7
            int r8 = r11.getId()
            r1 = r8
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            if (r1 != r2) goto L23
            r10 = 3
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r10 = 6
            goto L3d
        L23:
            r10 = 5
            r1 = r11
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L27:
            r10 = 4
            if (r11 == 0) goto L39
            r10 = 5
            android.view.ViewParent r11 = r11.getParent()
            boolean r2 = r11 instanceof android.view.View
            r10 = 7
            if (r2 == 0) goto L38
            r9 = 7
            android.view.View r11 = (android.view.View) r11
            goto L3a
        L38:
            r11 = r0
        L39:
            r9 = 5
        L3a:
            if (r11 != 0) goto L4
            r11 = r1
        L3d:
            if (r11 == 0) goto L97
            android.content.Context r8 = r11.getContext()
            r0 = r8
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r0)
            r1 = r8
            int[] r2 = com.google.android.material.snackbar.Snackbar.f7660s
            r10 = 6
            android.content.res.TypedArray r8 = r0.obtainStyledAttributes(r2)
            r2 = r8
            r3 = -1
            r4 = 0
            java.lang.String r10 = "Ⓢⓜⓞⓑ⓸⓺"
            int r8 = r2.getResourceId(r4, r3)
            r5 = r8
            r6 = 1
            r9 = 7
            int r8 = r2.getResourceId(r6, r3)
            r7 = r8
            r2.recycle()
            if (r5 == r3) goto L6b
            r10 = 7
            if (r7 == r3) goto L6b
            r10 = 6
            goto L6d
        L6b:
            r8 = 0
            r6 = r8
        L6d:
            if (r6 == 0) goto L74
            r2 = 2131558636(0x7f0d00ec, float:1.8742593E38)
            r9 = 3
            goto L79
        L74:
            r10 = 3
            r2 = 2131558467(0x7f0d0043, float:1.874225E38)
            r9 = 3
        L79:
            android.view.View r1 = r1.inflate(r2, r11, r4)
            com.google.android.material.snackbar.SnackbarContentLayout r1 = (com.google.android.material.snackbar.SnackbarContentLayout) r1
            com.google.android.material.snackbar.Snackbar r2 = new com.google.android.material.snackbar.Snackbar
            r2.<init>(r0, r11, r1, r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$i r11 = r2.f7637c
            android.view.View r11 = r11.getChildAt(r4)
            com.google.android.material.snackbar.SnackbarContentLayout r11 = (com.google.android.material.snackbar.SnackbarContentLayout) r11
            android.widget.TextView r11 = r11.getMessageView()
            r11.setText(r12)
            r2.f7638e = r13
            r10 = 1
            return r2
        L97:
            r9 = 1
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "No suitable parent found from the given view. Please provide a valid view."
            r11.<init>(r12)
            r9 = 4
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.Snackbar.l(android.view.View, java.lang.CharSequence, int):com.google.android.material.snackbar.Snackbar");
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void a() {
        b(3);
    }

    public int i() {
        int i10 = this.f7638e;
        if (i10 == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f7661q.getRecommendedTimeoutMillis(i10, (this.f7662r ? 4 : 0) | 1 | 2);
        } else if (this.f7662r && this.f7661q.isTouchExplorationEnabled()) {
            return -2;
        } else {
            return i10;
        }
    }

    public boolean j() {
        boolean c10;
        i b10 = i.b();
        i.b bVar = this.f7646m;
        synchronized (b10.f7675a) {
            c10 = b10.c(bVar);
        }
        return c10;
    }

    public Snackbar m(int i10, View.OnClickListener onClickListener) {
        CharSequence text = this.f7636b.getText(i10);
        Button actionView = ((SnackbarContentLayout) this.f7637c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(text)) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f7662r = false;
        } else {
            this.f7662r = true;
            actionView.setVisibility(0);
            actionView.setText(text);
            actionView.setOnClickListener(new db.g(this, onClickListener));
        }
        return this;
    }

    public void n() {
        i b10 = i.b();
        int i10 = i();
        i.b bVar = this.f7646m;
        synchronized (b10.f7675a) {
            if (b10.c(bVar)) {
                i.c cVar = b10.f7677c;
                cVar.f7680b = i10;
                b10.f7676b.removeCallbacksAndMessages(cVar);
                b10.g(b10.f7677c);
                return;
            }
            if (b10.d(bVar)) {
                b10.d.f7680b = i10;
            } else {
                b10.d = new i.c(i10, bVar);
            }
            i.c cVar2 = b10.f7677c;
            if (cVar2 == null || !b10.a(cVar2, 4)) {
                b10.f7677c = null;
                b10.h();
            }
        }
    }
}
