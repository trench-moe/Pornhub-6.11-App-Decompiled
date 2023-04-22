package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;
import t9.k0;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    public final a f7321a;

    /* renamed from: b */
    public final View f7322b;

    /* renamed from: c */
    public final Paint f7323c;
    public c.e d;

    /* renamed from: e */
    public Drawable f7324e;

    /* loaded from: classes.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    public b(a aVar) {
        this.f7321a = aVar;
        View view = (View) aVar;
        this.f7322b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f7323c = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.graphics.Canvas r11) {
        /*
            r10 = this;
            boolean r7 = r10.g()
            r0 = r7
            if (r0 == 0) goto L31
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            com.google.android.material.circularreveal.b$a r0 = r10.f7321a
            r0.c(r11)
            r8 = 6
            boolean r0 = r10.h()
            if (r0 == 0) goto L56
            r7 = 0
            r2 = r7
            r3 = 0
            android.view.View r0 = r10.f7322b
            r9 = 4
            int r0 = r0.getWidth()
            float r4 = (float) r0
            r9 = 6
            android.view.View r0 = r10.f7322b
            r8 = 3
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r10.f7323c
            r8 = 5
            r1 = r11
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L57
        L31:
            com.google.android.material.circularreveal.b$a r0 = r10.f7321a
            r0.c(r11)
            boolean r7 = r10.h()
            r0 = r7
            if (r0 == 0) goto L56
            r7 = 0
            r2 = r7
            r3 = 0
            android.view.View r0 = r10.f7322b
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r10.f7322b
            int r0 = r0.getHeight()
            float r5 = (float) r0
            r9 = 3
            android.graphics.Paint r6 = r10.f7323c
            r1 = r11
            r1.drawRect(r2, r3, r4, r5, r6)
            r8 = 5
        L56:
            r8 = 1
        L57:
            android.graphics.drawable.Drawable r0 = r10.f7324e
            if (r0 == 0) goto L63
            r8 = 3
            com.google.android.material.circularreveal.c$e r1 = r10.d
            if (r1 == 0) goto L63
            r7 = 1
            r1 = r7
            goto L65
        L63:
            r9 = 2
            r1 = 0
        L65:
            if (r1 == 0) goto L9c
            r8 = 3
            android.graphics.Rect r7 = r0.getBounds()
            r0 = r7
            com.google.android.material.circularreveal.c$e r1 = r10.d
            r8 = 1
            float r1 = r1.f7329a
            r8 = 1
            int r7 = r0.width()
            r2 = r7
            float r2 = (float) r2
            r8 = 5
            r7 = 1073741824(0x40000000, float:2.0)
            r3 = r7
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.c$e r2 = r10.d
            float r2 = r2.f7330b
            int r7 = r0.height()
            r0 = r7
            float r0 = (float) r0
            r8 = 4
            float r0 = r0 / r3
            r8 = 6
            float r2 = r2 - r0
            r9 = 7
            r11.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r10.f7324e
            r0.draw(r11)
            float r0 = -r1
            float r1 = -r2
            r9 = 2
            r11.translate(r0, r1)
        L9c:
            r9 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.a(android.graphics.Canvas):void");
    }

    public int b() {
        return this.f7323c.getColor();
    }

    public final float c(c.e eVar) {
        return k0.c(eVar.f7329a, eVar.f7330b, 0.0f, 0.0f, this.f7322b.getWidth(), this.f7322b.getHeight());
    }

    public c.e d() {
        c.e eVar = this.d;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar.f7329a, eVar.f7330b, eVar.f7331c);
        if (eVar2.f7331c == Float.MAX_VALUE) {
            eVar2.f7331c = c(eVar2);
        }
        return eVar2;
    }

    public boolean e() {
        return this.f7321a.d() && !g();
    }

    public void f(c.e eVar) {
        if (eVar == null) {
            this.d = null;
        } else {
            c.e eVar2 = this.d;
            if (eVar2 == null) {
                this.d = new c.e(eVar.f7329a, eVar.f7330b, eVar.f7331c);
            } else {
                float f10 = eVar.f7329a;
                float f11 = eVar.f7330b;
                float f12 = eVar.f7331c;
                eVar2.f7329a = f10;
                eVar2.f7330b = f11;
                eVar2.f7331c = f12;
            }
            if (eVar.f7331c + 1.0E-4f >= c(eVar)) {
                this.d.f7331c = Float.MAX_VALUE;
            }
        }
        this.f7322b.invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x001a, code lost:
        if ((r0.f7331c == Float.MAX_VALUE) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r7 = this;
            r4 = r7
            com.google.android.material.circularreveal.c$e r0 = r4.d
            r6 = 3
            r6 = 0
            r1 = r6
            r2 = 1
            r6 = 5
            if (r0 == 0) goto L1c
            float r0 = r0.f7331c
            r6 = 7
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L18
            r6 = 2
            r6 = 1
            r0 = r6
            goto L1a
        L18:
            r6 = 1
            r0 = 0
        L1a:
            if (r0 == 0) goto L1e
        L1c:
            r1 = 1
            r6 = 3
        L1e:
            r6 = 7
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.g():boolean");
    }

    public final boolean h() {
        return Color.alpha(this.f7323c.getColor()) != 0;
    }
}
