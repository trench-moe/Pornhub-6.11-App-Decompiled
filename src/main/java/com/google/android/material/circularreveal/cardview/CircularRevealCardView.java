package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements c {
    public final b H;

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        Objects.requireNonNull(this.H);
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        Objects.requireNonNull(this.H);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void c(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean d() {
        return super.isOpaque();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        b bVar = this.H;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.H.f7324e;
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.H.b();
    }

    @Override // com.google.android.material.circularreveal.c
    public c.e getRevealInfo() {
        return this.H.d();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        b bVar = this.H;
        return bVar != null ? bVar.e() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        b bVar = this.H;
        bVar.f7324e = drawable;
        bVar.f7322b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(int i10) {
        b bVar = this.H;
        bVar.f7323c.setColor(i10);
        bVar.f7322b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(c.e eVar) {
        this.H.f(eVar);
    }
}
