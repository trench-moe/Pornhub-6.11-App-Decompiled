package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.circularreveal.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class CircularRevealLinearLayout extends LinearLayout implements c {

    /* renamed from: c  reason: collision with root package name */
    public final b f7319c;

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7319c = new b(this);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        Objects.requireNonNull(this.f7319c);
    }

    @Override // com.google.android.material.circularreveal.c
    public void b() {
        Objects.requireNonNull(this.f7319c);
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
        b bVar = this.f7319c;
        if (bVar != null) {
            bVar.a(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f7319c.f7324e;
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f7319c.b();
    }

    @Override // com.google.android.material.circularreveal.c
    public c.e getRevealInfo() {
        return this.f7319c.d();
    }

    @Override // android.view.View
    public boolean isOpaque() {
        b bVar = this.f7319c;
        return bVar != null ? bVar.e() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        b bVar = this.f7319c;
        bVar.f7324e = drawable;
        bVar.f7322b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(int i10) {
        b bVar = this.f7319c;
        bVar.f7323c.setColor(i10);
        bVar.f7322b.invalidate();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(c.e eVar) {
        this.f7319c.f(eVar);
    }
}
