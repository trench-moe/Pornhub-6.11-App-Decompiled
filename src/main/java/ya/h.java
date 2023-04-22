package ya;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import x0.a;
import ya.c;

/* loaded from: classes2.dex */
public final class h<S extends c> extends k {
    public static final x0.c G = new a("indicatorLevel");
    public l<S> B;
    public final x0.e C;
    public final x0.d D;
    public float E;
    public boolean F;

    /* loaded from: classes2.dex */
    public static class a extends x0.c {
        public a(String str) {
            super(str);
        }

        @Override // x0.c
        public float a(Object obj) {
            return ((h) obj).E * 10000.0f;
        }

        @Override // x0.c
        public void b(Object obj, float f10) {
            h hVar = (h) obj;
            hVar.E = f10 / 10000.0f;
            hVar.invalidateSelf();
        }
    }

    public h(Context context, c cVar, l<S> lVar) {
        super(context, cVar);
        this.F = false;
        this.B = lVar;
        lVar.f18606b = this;
        x0.e eVar = new x0.e();
        this.C = eVar;
        eVar.f17661b = 1.0f;
        eVar.f17662c = false;
        eVar.a(50.0f);
        x0.d dVar = new x0.d(this, G);
        this.D = dVar;
        dVar.f17657r = eVar;
        if (this.f18603w != 1.0f) {
            this.f18603w = 1.0f;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            l<S> lVar = this.B;
            float c10 = c();
            lVar.f18605a.a();
            lVar.a(canvas, c10);
            this.B.c(canvas, this.y);
            this.B.b(canvas, this.y, 0.0f, this.E, l9.e.b(this.f18598f.f18576c[0], this.f18604z));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.B.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.B.e();
    }

    @Override // ya.k
    public boolean i(boolean z10, boolean z11, boolean z12) {
        boolean i10 = super.i(z10, z11, z12);
        float a10 = this.f18599j.a(this.f18597c.getContentResolver());
        if (a10 == 0.0f) {
            this.F = true;
        } else {
            this.F = false;
            this.C.a(50.0f / a10);
        }
        return i10;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.D.d();
        this.E = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        if (this.F) {
            this.D.d();
            this.E = i10 / 10000.0f;
            invalidateSelf();
        } else {
            x0.d dVar = this.D;
            dVar.f17645b = this.E * 10000.0f;
            dVar.f17646c = true;
            float f10 = i10;
            if (dVar.f17648f) {
                dVar.f17658s = f10;
            } else {
                if (dVar.f17657r == null) {
                    dVar.f17657r = new x0.e(f10);
                }
                x0.e eVar = dVar.f17657r;
                double d = f10;
                eVar.f17667i = d;
                double d10 = (float) d;
                if (d10 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d10 < dVar.f17649g) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double abs = Math.abs(dVar.f17651i * 0.75f);
                eVar.d = abs;
                eVar.f17663e = abs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z10 = dVar.f17648f;
                if (!z10 && !z10) {
                    dVar.f17648f = true;
                    if (!dVar.f17646c) {
                        dVar.f17645b = dVar.f17647e.a(dVar.d);
                    }
                    float f11 = dVar.f17645b;
                    if (f11 > Float.MAX_VALUE || f11 < dVar.f17649g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    x0.a a10 = x0.a.a();
                    if (a10.f17630b.size() == 0) {
                        if (a10.d == null) {
                            a10.d = new a.d(a10.f17631c);
                        }
                        a.d dVar2 = (a.d) a10.d;
                        dVar2.f17636b.postFrameCallback(dVar2.f17637c);
                    }
                    if (!a10.f17630b.contains(dVar)) {
                        a10.f17630b.add(dVar);
                    }
                }
            }
        }
        return true;
    }
}
