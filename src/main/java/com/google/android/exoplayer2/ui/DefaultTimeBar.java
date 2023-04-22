package com.google.android.exoplayer2.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.exoplayer2.ui.o;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import k8.c0;
import kotlin.io.ConstantsKt;

/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements o {

    /* renamed from: i0  reason: collision with root package name */
    public static final /* synthetic */ int f6449i0 = 0;
    public final Drawable A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final StringBuilder K;
    public final Formatter L;
    public final Runnable M;
    public final CopyOnWriteArraySet<o.a> N;
    public final Point O;
    public final float P;
    public int Q;
    public long R;
    public int S;
    public Rect T;
    public ValueAnimator U;
    public float V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f6450a0;

    /* renamed from: b0  reason: collision with root package name */
    public long f6451b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f6452c;

    /* renamed from: c0  reason: collision with root package name */
    public long f6453c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f6454d0;

    /* renamed from: e0  reason: collision with root package name */
    public long f6455e0;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f6456f;

    /* renamed from: f0  reason: collision with root package name */
    public int f6457f0;

    /* renamed from: g0  reason: collision with root package name */
    public long[] f6458g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean[] f6459h0;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f6460j;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f6461m;
    public final Paint n;

    /* renamed from: t  reason: collision with root package name */
    public final Paint f6462t;

    /* renamed from: u  reason: collision with root package name */
    public final Paint f6463u;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f6464w;
    public final Paint y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f6465z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2, int i11) {
        super(context, attributeSet, i10);
        this.f6452c = new Rect();
        this.f6456f = new Rect();
        this.f6460j = new Rect();
        this.f6461m = new Rect();
        Paint paint = new Paint();
        this.n = paint;
        Paint paint2 = new Paint();
        this.f6462t = paint2;
        Paint paint3 = new Paint();
        this.f6463u = paint3;
        Paint paint4 = new Paint();
        this.f6464w = paint4;
        Paint paint5 = new Paint();
        this.y = paint5;
        Paint paint6 = new Paint();
        this.f6465z = paint6;
        paint6.setAntiAlias(true);
        this.N = new CopyOnWriteArraySet<>();
        this.O = new Point();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.P = f10;
        this.J = c(f10, -50);
        int c10 = c(f10, 4);
        int c11 = c(f10, 26);
        int c12 = c(f10, 4);
        int c13 = c(f10, 12);
        int c14 = c(f10, 0);
        int c15 = c(f10, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o9.b.f13623m, i10, i11);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.A = drawable;
                if (drawable != null) {
                    int i12 = c0.f11939a;
                    if (i12 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i12 < 23 || !drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    c11 = Math.max(drawable.getMinimumHeight(), c11);
                }
                this.B = obtainStyledAttributes.getDimensionPixelSize(3, c10);
                this.C = obtainStyledAttributes.getDimensionPixelSize(12, c11);
                this.D = obtainStyledAttributes.getInt(2, 0);
                this.E = obtainStyledAttributes.getDimensionPixelSize(1, c12);
                this.F = obtainStyledAttributes.getDimensionPixelSize(11, c13);
                this.G = obtainStyledAttributes.getDimensionPixelSize(8, c14);
                this.H = obtainStyledAttributes.getDimensionPixelSize(9, c15);
                int i13 = obtainStyledAttributes.getInt(6, -1);
                int i14 = obtainStyledAttributes.getInt(7, -1);
                int i15 = obtainStyledAttributes.getInt(4, -855638017);
                int i16 = obtainStyledAttributes.getInt(13, 872415231);
                int i17 = obtainStyledAttributes.getInt(0, -1291845888);
                int i18 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i13);
                paint6.setColor(i14);
                paint2.setColor(i15);
                paint3.setColor(i16);
                paint4.setColor(i17);
                paint5.setColor(i18);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.B = c10;
            this.C = c11;
            this.D = 0;
            this.E = c12;
            this.F = c13;
            this.G = c14;
            this.H = c15;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.A = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.K = sb2;
        this.L = new Formatter(sb2, Locale.getDefault());
        this.M = new androidx.emoji2.text.k(this, 7);
        Drawable drawable2 = this.A;
        if (drawable2 != null) {
            this.I = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.I = (Math.max(this.G, Math.max(this.F, this.H)) + 1) / 2;
        }
        this.V = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.U = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar defaultTimeBar = DefaultTimeBar.this;
                int i19 = DefaultTimeBar.f6449i0;
                Objects.requireNonNull(defaultTimeBar);
                defaultTimeBar.V = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                defaultTimeBar.invalidate(defaultTimeBar.f6452c);
            }
        });
        this.f6453c0 = -9223372036854775807L;
        this.R = -9223372036854775807L;
        this.Q = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int c(float f10, int i10) {
        return (int) ((i10 * f10) + 0.5f);
    }

    private long getPositionIncrement() {
        long j10 = this.R;
        if (j10 == -9223372036854775807L) {
            long j11 = this.f6453c0;
            if (j11 == -9223372036854775807L) {
                return 0L;
            }
            j10 = j11 / this.Q;
        }
        return j10;
    }

    private String getProgressText() {
        return c0.t(this.K, this.L, this.f6454d0);
    }

    private long getScrubberPosition() {
        if (this.f6456f.width() > 0 && this.f6453c0 != -9223372036854775807L) {
            return (this.f6461m.width() * this.f6453c0) / this.f6456f.width();
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.ui.o
    public void a(long[] jArr, boolean[] zArr, int i10) {
        k8.a.c(i10 == 0 || !(jArr == null || zArr == null));
        this.f6457f0 = i10;
        this.f6458g0 = jArr;
        this.f6459h0 = zArr;
        i();
    }

    @Override // com.google.android.exoplayer2.ui.o
    public void b(o.a aVar) {
        this.N.add(aVar);
    }

    public void d(boolean z10) {
        if (this.U.isStarted()) {
            this.U.cancel();
        }
        this.W = z10;
        this.V = 0.0f;
        invalidate(this.f6452c);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        j();
    }

    public final void e(float f10) {
        Rect rect = this.f6461m;
        Rect rect2 = this.f6456f;
        rect.right = c0.h((int) f10, rect2.left, rect2.right);
    }

    public final boolean f(long j10) {
        long j11 = this.f6453c0;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f6450a0 ? this.f6451b0 : this.f6454d0;
        long i10 = c0.i(j12 + j10, 0L, j11);
        if (i10 == j12) {
            return false;
        }
        if (this.f6450a0) {
            k(i10);
        } else {
            g(i10);
        }
        i();
        return true;
    }

    public final void g(long j10) {
        this.f6451b0 = j10;
        this.f6450a0 = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<o.a> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().l(this, j10);
        }
    }

    @Override // com.google.android.exoplayer2.ui.o
    public long getPreferredUpdateDelay() {
        int width = (int) (this.f6456f.width() / this.P);
        if (width != 0) {
            long j10 = this.f6453c0;
            if (j10 != 0) {
                if (j10 == -9223372036854775807L) {
                    return Long.MAX_VALUE;
                }
                return j10 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(boolean z10) {
        removeCallbacks(this.M);
        this.f6450a0 = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<o.a> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().k(this, this.f6451b0, z10);
        }
    }

    public final void i() {
        this.f6460j.set(this.f6456f);
        this.f6461m.set(this.f6456f);
        long j10 = this.f6450a0 ? this.f6451b0 : this.f6454d0;
        if (this.f6453c0 > 0) {
            int width = (int) ((this.f6456f.width() * this.f6455e0) / this.f6453c0);
            Rect rect = this.f6460j;
            Rect rect2 = this.f6456f;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f6456f.width() * j10) / this.f6453c0);
            Rect rect3 = this.f6461m;
            Rect rect4 = this.f6456f;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f6460j;
            int i10 = this.f6456f.left;
            rect5.right = i10;
            this.f6461m.right = i10;
        }
        invalidate(this.f6452c);
    }

    public final void j() {
        Drawable drawable = this.A;
        if (drawable != null && drawable.isStateful() && this.A.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(long j10) {
        if (this.f6451b0 == j10) {
            return;
        }
        this.f6451b0 = j10;
        Iterator<o.a> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().c(this, j10);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int height = this.f6456f.height();
        int centerY = this.f6456f.centerY() - (height / 2);
        int i10 = height + centerY;
        if (this.f6453c0 <= 0) {
            Rect rect = this.f6456f;
            canvas.drawRect(rect.left, centerY, rect.right, i10, this.f6463u);
        } else {
            Rect rect2 = this.f6460j;
            int i11 = rect2.left;
            int i12 = rect2.right;
            int max = Math.max(Math.max(this.f6456f.left, i12), this.f6461m.right);
            int i13 = this.f6456f.right;
            if (max < i13) {
                canvas.drawRect(max, centerY, i13, i10, this.f6463u);
            }
            int max2 = Math.max(i11, this.f6461m.right);
            if (i12 > max2) {
                canvas.drawRect(max2, centerY, i12, i10, this.f6462t);
            }
            if (this.f6461m.width() > 0) {
                Rect rect3 = this.f6461m;
                canvas.drawRect(rect3.left, centerY, rect3.right, i10, this.n);
            }
            if (this.f6457f0 != 0) {
                long[] jArr = this.f6458g0;
                Objects.requireNonNull(jArr);
                boolean[] zArr = this.f6459h0;
                Objects.requireNonNull(zArr);
                int i14 = this.E / 2;
                for (int i15 = 0; i15 < this.f6457f0; i15++) {
                    long i16 = c0.i(jArr[i15], 0L, this.f6453c0);
                    Rect rect4 = this.f6456f;
                    int min = Math.min(rect4.width() - this.E, Math.max(0, ((int) ((this.f6456f.width() * i16) / this.f6453c0)) - i14)) + rect4.left;
                    canvas.drawRect(min, centerY, min + this.E, i10, zArr[i15] ? this.y : this.f6464w);
                }
            }
        }
        if (this.f6453c0 > 0) {
            Rect rect5 = this.f6461m;
            int h10 = c0.h(rect5.right, rect5.left, this.f6456f.right);
            int centerY2 = this.f6461m.centerY();
            Drawable drawable = this.A;
            if (drawable == null) {
                canvas.drawCircle(h10, centerY2, (int) ((((this.f6450a0 || isFocused()) ? this.H : isEnabled() ? this.F : this.G) * this.V) / 2.0f), this.f6465z);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.V)) / 2;
                int intrinsicHeight = ((int) (this.A.getIntrinsicHeight() * this.V)) / 2;
                this.A.setBounds(h10 - intrinsicWidth, centerY2 - intrinsicHeight, h10 + intrinsicWidth, centerY2 + intrinsicHeight);
                this.A.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        if (!this.f6450a0 || z10) {
            return;
        }
        h(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f6453c0 <= 0) {
            return;
        }
        if (c0.f11939a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
        accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r9, android.view.KeyEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L3b
            r6 = 5
            long r0 = r8.getPositionIncrement()
            r4 = 66
            r2 = r4
            r4 = 1
            r3 = r4
            if (r9 == r2) goto L2e
            r6 = 3
            switch(r9) {
                case 21: goto L17;
                case 22: goto L19;
                case 23: goto L2e;
                default: goto L16;
            }
        L16:
            goto L3b
        L17:
            long r0 = -r0
            r5 = 5
        L19:
            r5 = 7
            boolean r4 = r8.f(r0)
            r0 = r4
            if (r0 == 0) goto L3b
            java.lang.Runnable r9 = r8.M
            r8.removeCallbacks(r9)
            java.lang.Runnable r9 = r8.M
            r0 = 1000(0x3e8, double:4.94E-321)
            r8.postDelayed(r9, r0)
            return r3
        L2e:
            r7 = 2
            boolean r0 = r8.f6450a0
            r6 = 1
            if (r0 == 0) goto L3b
            r7 = 2
            r9 = 0
            r8.h(r9)
            r7 = 4
            return r3
        L3b:
            boolean r4 = super.onKeyDown(r9, r10)
            r9 = r4
            return r9
            r5 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i16 - getPaddingRight();
        int i18 = this.W ? 0 : this.I;
        if (this.D == 1) {
            i14 = (i17 - getPaddingBottom()) - this.C;
            int i19 = this.B;
            i15 = ((i17 - getPaddingBottom()) - i19) - Math.max(i18 - (i19 / 2), 0);
        } else {
            i14 = (i17 - this.C) / 2;
            i15 = (i17 - this.B) / 2;
        }
        this.f6452c.set(paddingLeft, i14, paddingRight, this.C + i14);
        Rect rect = this.f6456f;
        Rect rect2 = this.f6452c;
        rect.set(rect2.left + i18, i15, rect2.right - i18, this.B + i15);
        if (c0.f11939a >= 29) {
            Rect rect3 = this.T;
            if (rect3 != null && rect3.width() == i16 && this.T.height() == i17) {
                i();
            }
            Rect rect4 = new Rect(0, 0, i16, i17);
            this.T = rect4;
            setSystemGestureExclusionRects(Collections.singletonList(rect4));
        }
        i();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == 0) {
            size = this.C;
        } else if (mode != 1073741824) {
            size = Math.min(this.C, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        j();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        Drawable drawable = this.A;
        if (drawable != null) {
            if (c0.f11939a >= 23 && drawable.setLayoutDirection(i10)) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.f6453c0 > 0) {
                this.O.set((int) motionEvent.getX(), (int) motionEvent.getY());
                Point point = this.O;
                int i10 = point.x;
                int i11 = point.y;
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                            }
                        } else if (this.f6450a0) {
                            if (i11 < this.J) {
                                int i12 = this.S;
                                e(((i10 - i12) / 3) + i12);
                            } else {
                                this.S = i10;
                                e(i10);
                            }
                            k(getScrubberPosition());
                            i();
                            invalidate();
                            return true;
                        }
                    }
                    if (this.f6450a0) {
                        h(motionEvent.getAction() == 3);
                        return true;
                    }
                } else {
                    float f10 = i10;
                    if (this.f6452c.contains((int) f10, i11)) {
                        e(f10);
                        g(getScrubberPosition());
                        i();
                        invalidate();
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (super.performAccessibilityAction(i10, bundle)) {
            return true;
        }
        if (this.f6453c0 <= 0) {
            return false;
        }
        if (i10 == 8192) {
            if (f(-getPositionIncrement())) {
                h(false);
            }
        } else if (i10 != 4096) {
            return false;
        } else {
            if (f(getPositionIncrement())) {
                h(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i10) {
        this.f6464w.setColor(i10);
        invalidate(this.f6452c);
    }

    public void setBufferedColor(int i10) {
        this.f6462t.setColor(i10);
        invalidate(this.f6452c);
    }

    @Override // com.google.android.exoplayer2.ui.o
    public void setBufferedPosition(long j10) {
        this.f6455e0 = j10;
        i();
    }

    @Override // com.google.android.exoplayer2.ui.o
    public void setDuration(long j10) {
        this.f6453c0 = j10;
        if (this.f6450a0 && j10 == -9223372036854775807L) {
            h(true);
        }
        i();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.o
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (this.f6450a0 && !z10) {
            h(true);
        }
    }

    public void setKeyCountIncrement(int i10) {
        k8.a.c(i10 > 0);
        this.Q = i10;
        this.R = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j10) {
        k8.a.c(j10 > 0);
        this.Q = -1;
        this.R = j10;
    }

    public void setPlayedAdMarkerColor(int i10) {
        this.y.setColor(i10);
        invalidate(this.f6452c);
    }

    public void setPlayedColor(int i10) {
        this.n.setColor(i10);
        invalidate(this.f6452c);
    }

    @Override // com.google.android.exoplayer2.ui.o
    public void setPosition(long j10) {
        this.f6454d0 = j10;
        setContentDescription(getProgressText());
        i();
    }

    public void setScrubberColor(int i10) {
        this.f6465z.setColor(i10);
        invalidate(this.f6452c);
    }

    public void setUnplayedColor(int i10) {
        this.f6463u.setColor(i10);
        invalidate(this.f6452c);
    }
}
