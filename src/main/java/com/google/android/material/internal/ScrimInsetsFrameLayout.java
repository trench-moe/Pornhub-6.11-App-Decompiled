package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import e0.b;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.n;
import n0.x;
import ua.j;

/* loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public Drawable f7521c;

    /* renamed from: f  reason: collision with root package name */
    public Rect f7522f;

    /* renamed from: j  reason: collision with root package name */
    public Rect f7523j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7524m;
    public boolean n;

    /* loaded from: classes.dex */
    public class a implements n {
        public a() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f7522f == null) {
                scrimInsetsFrameLayout.f7522f = new Rect();
            }
            ScrimInsetsFrameLayout.this.f7522f.set(d0Var.c(), d0Var.e(), d0Var.d(), d0Var.b());
            ScrimInsetsFrameLayout.this.a(d0Var);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout2 = ScrimInsetsFrameLayout.this;
            boolean z10 = true;
            if (!d0Var.f13113a.i().equals(b.f8966e)) {
                if (ScrimInsetsFrameLayout.this.f7521c != null) {
                    z10 = false;
                }
                scrimInsetsFrameLayout2.setWillNotDraw(z10);
                ScrimInsetsFrameLayout scrimInsetsFrameLayout3 = ScrimInsetsFrameLayout.this;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(scrimInsetsFrameLayout3);
                return d0Var.a();
            }
            scrimInsetsFrameLayout2.setWillNotDraw(z10);
            ScrimInsetsFrameLayout scrimInsetsFrameLayout32 = ScrimInsetsFrameLayout.this;
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.k(scrimInsetsFrameLayout32);
            return d0Var.a();
        }
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7523j = new Rect();
        this.f7524m = true;
        this.n = true;
        int[] iArr = m9.a.f13015m0;
        j.a(context, attributeSet, i10, 2132018034);
        j.b(context, attributeSet, iArr, i10, 2132018034, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 2132018034);
        this.f7521c = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        setWillNotDraw(true);
        a aVar = new a();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.i.u(this, aVar);
    }

    public void a(d0 d0Var) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f7522f == null || this.f7521c == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f7524m) {
            this.f7523j.set(0, 0, width, this.f7522f.top);
            this.f7521c.setBounds(this.f7523j);
            this.f7521c.draw(canvas);
        }
        if (this.n) {
            this.f7523j.set(0, height - this.f7522f.bottom, width, height);
            this.f7521c.setBounds(this.f7523j);
            this.f7521c.draw(canvas);
        }
        Rect rect = this.f7523j;
        Rect rect2 = this.f7522f;
        rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
        this.f7521c.setBounds(this.f7523j);
        this.f7521c.draw(canvas);
        Rect rect3 = this.f7523j;
        Rect rect4 = this.f7522f;
        rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
        this.f7521c.setBounds(this.f7523j);
        this.f7521c.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f7521c;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f7521c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z10) {
        this.n = z10;
    }

    public void setDrawTopInsetForeground(boolean z10) {
        this.f7524m = z10;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f7521c = drawable;
    }
}
