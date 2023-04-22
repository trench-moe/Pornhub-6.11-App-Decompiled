package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.y;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements j.a, View.OnClickListener, ActionMenuView.a {
    public y A;
    public b B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public int G;

    /* renamed from: u  reason: collision with root package name */
    public g f592u;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f593w;
    public Drawable y;

    /* renamed from: z  reason: collision with root package name */
    public e.b f594z;

    /* loaded from: classes.dex */
    public class a extends y {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.y
        public k.f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.B;
            if (bVar == null || (aVar = androidx.appcompat.widget.c.this.K) == null) {
                return null;
            }
            return aVar.a();
        }

        @Override // androidx.appcompat.widget.y
        public boolean c() {
            k.f b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f594z;
            return bVar != null && bVar.a(actionMenuItemView.f592u) && (b10 = b()) != null && b10.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.C = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b7.k.f3606w, i10, 0);
        this.E = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.G = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.F = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return a();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return a() && this.f592u.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i10) {
        this.f592u = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f667a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.A == null) {
            this.A = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r9 = this;
            java.lang.CharSequence r0 = r9.f593w
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 1
            r0 = r0 ^ r1
            r8 = 2
            android.graphics.drawable.Drawable r2 = r9.y
            r5 = 0
            r3 = r5
            if (r2 == 0) goto L30
            r6 = 2
            androidx.appcompat.view.menu.g r2 = r9.f592u
            r6 = 4
            int r2 = r2.y
            r4 = 4
            r6 = 5
            r2 = r2 & r4
            if (r2 != r4) goto L1d
            r5 = 1
            r2 = r5
            goto L1f
        L1d:
            r7 = 6
            r2 = 0
        L1f:
            if (r2 == 0) goto L2d
            boolean r2 = r9.C
            r7 = 1
            if (r2 != 0) goto L30
            boolean r2 = r9.D
            r8 = 6
            if (r2 == 0) goto L2d
            r6 = 2
            goto L31
        L2d:
            r6 = 1
            r5 = 0
            r1 = r5
        L30:
            r8 = 4
        L31:
            r0 = r0 & r1
            r5 = 0
            r1 = r5
            if (r0 == 0) goto L3a
            java.lang.CharSequence r2 = r9.f593w
            r6 = 2
            goto L3c
        L3a:
            r6 = 2
            r2 = r1
        L3c:
            r9.setText(r2)
            androidx.appcompat.view.menu.g r2 = r9.f592u
            java.lang.CharSequence r2 = r2.f681q
            r7 = 5
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L59
            r6 = 3
            if (r0 == 0) goto L50
            r6 = 7
            r2 = r1
            goto L55
        L50:
            r7 = 7
            androidx.appcompat.view.menu.g r2 = r9.f592u
            java.lang.CharSequence r2 = r2.f670e
        L55:
            r9.setContentDescription(r2)
            goto L5d
        L59:
            r9.setContentDescription(r2)
            r7 = 7
        L5d:
            androidx.appcompat.view.menu.g r2 = r9.f592u
            r7 = 3
            java.lang.CharSequence r2 = r2.f682r
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L76
            if (r0 == 0) goto L6b
            goto L71
        L6b:
            androidx.appcompat.view.menu.g r0 = r9.f592u
            r6 = 5
            java.lang.CharSequence r1 = r0.f670e
            r8 = 1
        L71:
            androidx.appcompat.widget.t0.a(r9, r1)
            r6 = 7
            goto L7b
        L76:
            r8 = 1
            androidx.appcompat.widget.t0.a(r9, r2)
            r6 = 7
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.f():void");
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f592u;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f594z;
        if (bVar != null) {
            bVar.a(this.f592u);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.C = e();
        f();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean a10 = a();
        if (a10 && (i12 = this.F) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.E) : this.E;
        if (mode != 1073741824 && this.E > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!a10 && this.y != null) {
            super.setPadding((getMeasuredWidth() - this.y.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        y yVar;
        if (this.f592u.hasSubMenu() && (yVar = this.A) != null && yVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            g gVar = this.f592u;
            if (gVar != null) {
                e eVar = gVar.n;
                eVar.f651k = true;
                eVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.y = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.G;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f594z = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.F = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.B = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f593w = charSequence;
        f();
    }
}
