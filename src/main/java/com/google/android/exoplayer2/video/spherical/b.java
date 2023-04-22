package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.android.exoplayer2.video.spherical.a;

/* loaded from: classes.dex */
public final class b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, a.InterfaceC0086a {

    /* renamed from: j  reason: collision with root package name */
    public final a f6767j;

    /* renamed from: m  reason: collision with root package name */
    public final float f6768m;
    public final GestureDetector n;

    /* renamed from: c  reason: collision with root package name */
    public final PointF f6765c = new PointF();

    /* renamed from: f  reason: collision with root package name */
    public final PointF f6766f = new PointF();

    /* renamed from: t  reason: collision with root package name */
    public volatile float f6769t = 3.1415927f;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context, a aVar, float f10) {
        this.f6767j = aVar;
        this.f6768m = f10;
        this.n = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0086a
    public void a(float[] fArr, float f10) {
        this.f6769t = -f10;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f6765c.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        float x10 = (motionEvent2.getX() - this.f6765c.x) / this.f6768m;
        float y = motionEvent2.getY();
        PointF pointF = this.f6765c;
        float f12 = (y - pointF.y) / this.f6768m;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f6769t;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f6766f;
        pointF2.x -= (cos * x10) - (sin * f12);
        float f13 = (cos * f12) + (sin * x10) + pointF2.y;
        pointF2.y = f13;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f13));
        a aVar = this.f6767j;
        PointF pointF3 = this.f6766f;
        SphericalGLSurfaceView.a aVar2 = (SphericalGLSurfaceView.a) aVar;
        synchronized (aVar2) {
            try {
                aVar2.f6756u = pointF3.y;
                aVar2.b();
                Matrix.setRotateM(aVar2.f6755t, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.n.onTouchEvent(motionEvent);
    }
}
