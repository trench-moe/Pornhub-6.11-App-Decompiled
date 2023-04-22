package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import g6.c;
import g6.d;
import g6.e;
import g6.f;
import g6.g;
import g6.h;
import g6.i;
import g6.j;
import g6.k;
import java.util.Objects;

/* loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {

    /* renamed from: m  reason: collision with root package name */
    public j f5929m;
    public ImageView.ScaleType n;

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5929m = new j(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.n;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.n = null;
        }
    }

    public j getAttacher() {
        return this.f5929m;
    }

    public RectF getDisplayRect() {
        return this.f5929m.c();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f5929m.B;
    }

    public float getMaximumScale() {
        return this.f5929m.n;
    }

    public float getMediumScale() {
        return this.f5929m.f9832m;
    }

    public float getMinimumScale() {
        return this.f5929m.f9831j;
    }

    public float getScale() {
        return this.f5929m.h();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f5929m.S;
    }

    public void setAllowParentInterceptOnEdge(boolean z10) {
        this.f5929m.f9833t = z10;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i10, int i11, int i12, int i13) {
        boolean frame = super.setFrame(i10, i11, i12, i13);
        if (frame) {
            this.f5929m.k();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        j jVar = this.f5929m;
        if (jVar != null) {
            jVar.k();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i10) {
        super.setImageResource(i10);
        j jVar = this.f5929m;
        if (jVar != null) {
            jVar.k();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        j jVar = this.f5929m;
        if (jVar != null) {
            jVar.k();
        }
    }

    public void setMaximumScale(float f10) {
        j jVar = this.f5929m;
        k.a(jVar.f9831j, jVar.f9832m, f10);
        jVar.n = f10;
    }

    public void setMediumScale(float f10) {
        j jVar = this.f5929m;
        k.a(jVar.f9831j, f10, jVar.n);
        jVar.f9832m = f10;
    }

    public void setMinimumScale(float f10) {
        j jVar = this.f5929m;
        k.a(f10, jVar.f9832m, jVar.n);
        jVar.f9831j = f10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5929m.J = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f5929m.y.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5929m.K = onLongClickListener;
    }

    public void setOnMatrixChangeListener(c cVar) {
        this.f5929m.F = cVar;
    }

    public void setOnOutsidePhotoTapListener(d dVar) {
        this.f5929m.H = dVar;
    }

    public void setOnPhotoTapListener(e eVar) {
        this.f5929m.G = eVar;
    }

    public void setOnScaleChangeListener(f fVar) {
        this.f5929m.L = fVar;
    }

    public void setOnSingleFlingListener(g gVar) {
        this.f5929m.M = gVar;
    }

    public void setOnViewDragListener(h hVar) {
        this.f5929m.N = hVar;
    }

    public void setOnViewTapListener(i iVar) {
        this.f5929m.I = iVar;
    }

    public void setRotationBy(float f10) {
        j jVar = this.f5929m;
        jVar.C.postRotate(f10 % 360.0f);
        jVar.a();
    }

    public void setRotationTo(float f10) {
        j jVar = this.f5929m;
        jVar.C.setRotate(f10 % 360.0f);
        jVar.a();
    }

    public void setScale(float f10) {
        j jVar = this.f5929m;
        jVar.j(f10, jVar.f9835w.getRight() / 2, jVar.f9835w.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        j jVar = this.f5929m;
        if (jVar == null) {
            this.n = scaleType;
            return;
        }
        Objects.requireNonNull(jVar);
        boolean z10 = true;
        if (scaleType == null) {
            z10 = false;
        } else if (k.a.f9850a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (z10 && scaleType != jVar.S) {
            jVar.S = scaleType;
            jVar.k();
        }
    }

    public void setZoomTransitionDuration(int i10) {
        this.f5929m.f9830f = i10;
    }

    public void setZoomable(boolean z10) {
        j jVar = this.f5929m;
        jVar.R = z10;
        jVar.k();
    }
}
