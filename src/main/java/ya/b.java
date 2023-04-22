package ya;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.app.pornhub.R;
import java.util.Arrays;
import java.util.Objects;
import ya.c;

/* loaded from: classes.dex */
public abstract class b<S extends ya.c> extends ProgressBar {
    public final v1.b A;
    public final v1.b B;

    /* renamed from: c  reason: collision with root package name */
    public S f18562c;

    /* renamed from: f  reason: collision with root package name */
    public int f18563f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f18564j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f18565m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public ya.a f18566t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f18567u;

    /* renamed from: w  reason: collision with root package name */
    public int f18568w;
    public final Runnable y;

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f18569z;

    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            if (bVar.n > 0) {
                SystemClock.uptimeMillis();
            }
            bVar.setVisibility(0);
        }
    }

    /* renamed from: ya.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0310b implements Runnable {
        public RunnableC0310b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = b.this;
            boolean z10 = false;
            ((k) bVar.getCurrentDrawable()).h(false, false, true);
            if ((bVar.getProgressDrawable() == null || !bVar.getProgressDrawable().isVisible()) && (bVar.getIndeterminateDrawable() == null || !bVar.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                bVar.setVisibility(4);
            }
            Objects.requireNonNull(b.this);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends v1.b {
        public c() {
        }

        @Override // v1.b
        public void a(Drawable drawable) {
            b.this.setIndeterminate(false);
            b bVar = b.this;
            bVar.c(bVar.f18563f, bVar.f18564j);
        }
    }

    /* loaded from: classes2.dex */
    public class d extends v1.b {
        public d() {
        }

        @Override // v1.b
        public void a(Drawable drawable) {
            b bVar = b.this;
            if (!bVar.f18567u) {
                bVar.setVisibility(bVar.f18568w);
            }
        }
    }

    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(hb.a.a(context, attributeSet, i10, 2132018262), attributeSet, i10);
        this.f18567u = false;
        this.f18568w = 4;
        this.y = new a();
        this.f18569z = new RunnableC0310b();
        this.A = new c();
        this.B = new d();
        Context context2 = getContext();
        this.f18562c = b(context2, attributeSet);
        TypedArray d10 = ua.j.d(context2, attributeSet, m9.a.f13030z, i10, i11, new int[0]);
        d10.getInt(5, -1);
        this.n = Math.min(d10.getInt(3, -1), 1000);
        d10.recycle();
        this.f18566t = new ya.a();
        this.f18565m = true;
    }

    private l<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().B;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().B;
        }
    }

    public void a(boolean z10) {
        if (this.f18565m) {
            ((k) getCurrentDrawable()).h(d(), false, z10);
        }
    }

    public abstract S b(Context context, AttributeSet attributeSet);

    public void c(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() != null && !z10) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f18563f = i10;
            this.f18564j = z10;
            this.f18567u = true;
            if (getIndeterminateDrawable().isVisible() && this.f18566t.a(getContext().getContentResolver()) != 0.0f) {
                getIndeterminateDrawable().C.e();
                return;
            }
            this.A.a(getIndeterminateDrawable());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (getWindowVisibility() == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d() {
        /*
            r6 = this;
            java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f13156a
            boolean r0 = n0.x.g.b(r6)
            r4 = 0
            r1 = r4
            r4 = 1
            r2 = r4
            if (r0 == 0) goto L3d
            int r0 = r6.getWindowVisibility()
            if (r0 != 0) goto L3d
            r0 = r6
        L13:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L1a
            goto L2b
        L1a:
            r5 = 5
            android.view.ViewParent r4 = r0.getParent()
            r0 = r4
            if (r0 != 0) goto L2d
            int r0 = r6.getWindowVisibility()
            if (r0 != 0) goto L2b
        L28:
            r4 = 1
            r0 = r4
            goto L34
        L2b:
            r0 = 0
            goto L34
        L2d:
            boolean r3 = r0 instanceof android.view.View
            r5 = 3
            if (r3 != 0) goto L38
            r5 = 6
            goto L28
        L34:
            if (r0 == 0) goto L3d
            r1 = 1
            goto L3e
        L38:
            r5 = 4
            android.view.View r0 = (android.view.View) r0
            r5 = 7
            goto L13
        L3d:
            r5 = 7
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.b.d():boolean");
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f18562c.f18578f;
    }

    @Override // android.widget.ProgressBar
    public n<S> getIndeterminateDrawable() {
        return (n) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.f18562c.f18576c;
    }

    @Override // android.widget.ProgressBar
    public h<S> getProgressDrawable() {
        return (h) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.f18562c.f18577e;
    }

    public int getTrackColor() {
        return this.f18562c.d;
    }

    public int getTrackCornerRadius() {
        return this.f18562c.f18575b;
    }

    public int getTrackThickness() {
        return this.f18562c.f18574a;
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().C.d(this.A);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(this.B);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g(this.B);
        }
        if (d()) {
            if (this.n > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.f18569z);
        removeCallbacks(this.y);
        ((k) getCurrentDrawable()).d();
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().j(this.B);
            getIndeterminateDrawable().C.g();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().j(this.B);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i10, int i11) {
        try {
            super.onMeasure(i10, i11);
            l<S> currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            int e10 = currentDrawingDelegate.e();
            int d10 = currentDrawingDelegate.d();
            setMeasuredDimension(e10 < 0 ? getMeasuredWidth() : e10 + getPaddingLeft() + getPaddingRight(), d10 < 0 ? getMeasuredHeight() : d10 + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a(i10 == 0);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        a(false);
    }

    public void setAnimatorDurationScaleProvider(ya.a aVar) {
        this.f18566t = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f18599j = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f18599j = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f18562c.f18578f = i10;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z10) {
        if (z10 == isIndeterminate()) {
            return;
        }
        k kVar = (k) getCurrentDrawable();
        if (kVar != null) {
            kVar.d();
        }
        super.setIndeterminate(z10);
        k kVar2 = (k) getCurrentDrawable();
        if (kVar2 != null) {
            kVar2.h(d(), false, false);
        }
        if ((kVar2 instanceof n) && d()) {
            ((n) kVar2).C.f();
        }
        this.f18567u = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof n)) {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((k) drawable).d();
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{l9.e.d(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f18562c.f18576c = iArr;
        getIndeterminateDrawable().C.c();
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i10) {
        if (isIndeterminate()) {
            return;
        }
        c(i10, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (!(drawable instanceof h)) {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        } else {
            h hVar = (h) drawable;
            hVar.d();
            super.setProgressDrawable(hVar);
            hVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f18562c.f18577e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f18562c;
        if (s10.d != i10) {
            s10.d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f18562c;
        if (s10.f18575b != i10) {
            s10.f18575b = Math.min(i10, s10.f18574a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f18562c;
        if (s10.f18574a != i10) {
            s10.f18574a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 != 0 && i10 != 4) {
            if (i10 != 8) {
                throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
            }
        }
        this.f18568w = i10;
    }
}
