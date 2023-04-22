package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;
import n0.x;

/* loaded from: classes.dex */
public class n extends l {
    public final SeekBar d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1042e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1043f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1044g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1045h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1046i;

    public n(SeekBar seekBar) {
        super(seekBar);
        this.f1043f = null;
        this.f1044g = null;
        this.f1045h = false;
        this.f1046i = false;
        this.d = seekBar;
    }

    @Override // androidx.appcompat.widget.l
    public void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        Context context = this.d.getContext();
        int[] iArr = b7.k.C;
        p0 r10 = p0.r(context, attributeSet, iArr, i10, 0);
        SeekBar seekBar = this.d;
        n0.x.u(seekBar, seekBar.getContext(), iArr, attributeSet, r10.f1055b, i10, 0);
        Drawable h10 = r10.h(0);
        if (h10 != null) {
            this.d.setThumb(h10);
        }
        Drawable g10 = r10.g(1);
        Drawable drawable = this.f1042e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1042e = g10;
        if (g10 != null) {
            g10.setCallback(this.d);
            SeekBar seekBar2 = this.d;
            WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
            f0.a.c(g10, x.e.d(seekBar2));
            if (g10.isStateful()) {
                g10.setState(this.d.getDrawableState());
            }
            c();
        }
        this.d.invalidate();
        if (r10.p(3)) {
            this.f1044g = v.e(r10.j(3, -1), this.f1044g);
            this.f1046i = true;
        }
        if (r10.p(2)) {
            this.f1043f = r10.c(2);
            this.f1045h = true;
        }
        r10.f1055b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1042e;
        if (drawable != null) {
            if (this.f1045h || this.f1046i) {
                Drawable h10 = f0.a.h(drawable.mutate());
                this.f1042e = h10;
                if (this.f1045h) {
                    h10.setTintList(this.f1043f);
                }
                if (this.f1046i) {
                    this.f1042e.setTintMode(this.f1044g);
                }
                if (this.f1042e.isStateful()) {
                    this.f1042e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f1042e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1042e.getIntrinsicWidth();
                int intrinsicHeight = this.f1042e.getIntrinsicHeight();
                int i10 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i11 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1042e.setBounds(-i10, -i11, i10, i11);
                float width = ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.d.getPaddingLeft(), this.d.getHeight() / 2);
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1042e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
