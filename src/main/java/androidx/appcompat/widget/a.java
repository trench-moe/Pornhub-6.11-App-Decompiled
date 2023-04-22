package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.app.pornhub.R;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: c  reason: collision with root package name */
    public final C0017a f952c;

    /* renamed from: f  reason: collision with root package name */
    public final Context f953f;

    /* renamed from: j  reason: collision with root package name */
    public ActionMenuView f954j;

    /* renamed from: m  reason: collision with root package name */
    public c f955m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public n0.a0 f956t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f957u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f958w;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0017a implements n0.b0 {

        /* renamed from: c  reason: collision with root package name */
        public boolean f959c = false;

        /* renamed from: f  reason: collision with root package name */
        public int f960f;

        public C0017a() {
        }

        @Override // n0.b0
        public void b(View view) {
            this.f959c = true;
        }

        @Override // n0.b0
        public void d(View view) {
            if (this.f959c) {
                return;
            }
            a aVar = a.this;
            aVar.f956t = null;
            a.super.setVisibility(this.f960f);
        }

        @Override // n0.b0
        public void l(View view) {
            a.super.setVisibility(0);
            this.f959c = false;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f952c = new C0017a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f953f = context;
        } else {
            this.f953f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, IntCompanionObject.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int d(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z10) {
            measuredWidth = -measuredWidth;
        }
        return measuredWidth;
    }

    public n0.a0 e(int i10, long j10) {
        n0.a0 a0Var = this.f956t;
        if (a0Var != null) {
            a0Var.b();
        }
        if (i10 != 0) {
            n0.a0 b10 = n0.x.b(this);
            b10.a(0.0f);
            b10.c(j10);
            C0017a c0017a = this.f952c;
            a.this.f956t = b10;
            c0017a.f960f = i10;
            View view = b10.f13093a.get();
            if (view != null) {
                b10.e(view, c0017a);
            }
            return b10;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        n0.a0 b11 = n0.x.b(this);
        b11.a(1.0f);
        b11.c(j10);
        C0017a c0017a2 = this.f952c;
        a.this.f956t = b11;
        c0017a2.f960f = i10;
        View view2 = b11.f13093a.get();
        if (view2 != null) {
            b11.e(view2, c0017a2);
        }
        return b11;
    }

    public int getAnimatedVisibility() {
        return this.f956t != null ? this.f952c.f960f : getVisibility();
    }

    public int getContentHeight() {
        return this.n;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onConfigurationChanged(android.content.res.Configuration r9) {
        /*
            r8 = this;
            super.onConfigurationChanged(r9)
            r6 = 1
            android.content.Context r9 = r8.getContext()
            int[] r0 = b7.k.f3604t
            r6 = 7
            r4 = 0
            r1 = r4
            r2 = 2130968584(0x7f040008, float:1.7545826E38)
            r6 = 1
            r3 = 0
            r6 = 1
            android.content.res.TypedArray r9 = r9.obtainStyledAttributes(r1, r0, r2, r3)
            r0 = 13
            int r4 = r9.getLayoutDimension(r0, r3)
            r0 = r4
            r8.setContentHeight(r0)
            r9.recycle()
            r7 = 1
            androidx.appcompat.widget.c r9 = r8.f955m
            if (r9 == 0) goto L8a
            r5 = 4
            android.content.Context r0 = r9.f607f
            r5 = 4
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r4 = r0.getConfiguration()
            r0 = r4
            int r1 = r0.screenWidthDp
            int r2 = r0.screenHeightDp
            r6 = 1
            int r0 = r0.smallestScreenWidthDp
            r5 = 4
            r4 = 600(0x258, float:8.41E-43)
            r3 = r4
            if (r0 > r3) goto L7d
            r7 = 2
            if (r1 > r3) goto L7d
            r0 = 720(0x2d0, float:1.009E-42)
            r5 = 7
            r3 = 960(0x3c0, float:1.345E-42)
            if (r1 <= r3) goto L50
            if (r2 > r0) goto L7d
            r5 = 6
        L50:
            r6 = 6
            if (r1 <= r0) goto L57
            r5 = 3
            if (r2 <= r3) goto L57
            goto L7d
        L57:
            r0 = 500(0x1f4, float:7.0E-43)
            r5 = 6
            if (r1 >= r0) goto L7a
            r6 = 5
            r4 = 480(0x1e0, float:6.73E-43)
            r0 = r4
            r4 = 640(0x280, float:8.97E-43)
            r3 = r4
            if (r1 <= r3) goto L67
            if (r2 > r0) goto L7a
        L67:
            r6 = 1
            if (r1 <= r0) goto L6d
            if (r2 <= r3) goto L6d
            goto L7a
        L6d:
            r5 = 5
            r4 = 360(0x168, float:5.04E-43)
            r0 = r4
            if (r1 < r0) goto L76
            r4 = 3
            r0 = r4
            goto L7e
        L76:
            r7 = 3
            r4 = 2
            r0 = r4
            goto L7e
        L7a:
            r4 = 4
            r0 = r4
            goto L7e
        L7d:
            r0 = 5
        L7e:
            r9.G = r0
            r7 = 3
            androidx.appcompat.view.menu.e r9 = r9.f608j
            if (r9 == 0) goto L8a
            r0 = 1
            r6 = 6
            r9.p(r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f958w = false;
        }
        if (!this.f958w) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f958w = true;
            }
        }
        if (actionMasked != 10) {
            if (actionMasked == 3) {
            }
            return true;
        }
        this.f958w = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f957u = false;
        }
        if (!this.f957u) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f957u = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f957u = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.n = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            n0.a0 a0Var = this.f956t;
            if (a0Var != null) {
                a0Var.b();
            }
            super.setVisibility(i10);
        }
    }
}
