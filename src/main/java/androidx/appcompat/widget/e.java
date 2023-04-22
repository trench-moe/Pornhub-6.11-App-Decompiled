package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f975a;
    public n0 d;

    /* renamed from: e  reason: collision with root package name */
    public n0 f978e;

    /* renamed from: f  reason: collision with root package name */
    public n0 f979f;

    /* renamed from: c  reason: collision with root package name */
    public int f977c = -1;

    /* renamed from: b  reason: collision with root package name */
    public final h f976b = h.a();

    public e(View view) {
        this.f975a = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r1 == 21) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            android.view.View r0 = r10.f975a
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L9f
            r9 = 4
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            r7 = 7
            r3 = 1
            r9 = 5
            r6 = 0
            r4 = r6
            if (r1 <= r2) goto L22
            androidx.appcompat.widget.n0 r1 = r10.d
            r7 = 4
            if (r1 == 0) goto L1f
            r9 = 3
        L1c:
            r6 = 1
            r1 = r6
            goto L26
        L1f:
            r9 = 5
            r1 = 0
            goto L26
        L22:
            r9 = 1
            if (r1 != r2) goto L1f
            goto L1c
        L26:
            if (r1 == 0) goto L80
            r9 = 2
            androidx.appcompat.widget.n0 r1 = r10.f979f
            if (r1 != 0) goto L35
            r8 = 2
            androidx.appcompat.widget.n0 r1 = new androidx.appcompat.widget.n0
            r1.<init>()
            r10.f979f = r1
        L35:
            androidx.appcompat.widget.n0 r1 = r10.f979f
            r2 = 0
            r1.f1047a = r2
            r1.d = r4
            r8 = 6
            r1.f1048b = r2
            r9 = 1
            r1.f1049c = r4
            r8 = 5
            android.view.View r2 = r10.f975a
            r9 = 1
            java.util.WeakHashMap<android.view.View, n0.a0> r5 = n0.x.f13156a
            r9 = 1
            android.content.res.ColorStateList r6 = n0.x.i.g(r2)
            r2 = r6
            if (r2 == 0) goto L56
            r1.d = r3
            r9 = 3
            r1.f1047a = r2
            r8 = 6
        L56:
            android.view.View r2 = r10.f975a
            r9 = 5
            android.graphics.PorterDuff$Mode r2 = n0.x.i.h(r2)
            if (r2 == 0) goto L64
            r9 = 5
            r1.f1049c = r3
            r1.f1048b = r2
        L64:
            r7 = 3
            boolean r2 = r1.d
            r7 = 6
            if (r2 != 0) goto L71
            boolean r2 = r1.f1049c
            if (r2 == 0) goto L6f
            goto L71
        L6f:
            r3 = 0
            goto L7c
        L71:
            android.view.View r2 = r10.f975a
            r9 = 7
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.h.f(r0, r1, r2)
            r8 = 5
        L7c:
            if (r3 == 0) goto L80
            r8 = 1
            return
        L80:
            r8 = 4
            androidx.appcompat.widget.n0 r1 = r10.f978e
            if (r1 == 0) goto L90
            android.view.View r2 = r10.f975a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.h.f(r0, r1, r2)
            r8 = 1
            goto L9f
        L90:
            r9 = 5
            androidx.appcompat.widget.n0 r1 = r10.d
            if (r1 == 0) goto L9f
            android.view.View r2 = r10.f975a
            r8 = 6
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.h.f(r0, r1, r2)
        L9f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.a():void");
    }

    public ColorStateList b() {
        n0 n0Var = this.f978e;
        if (n0Var != null) {
            return n0Var.f1047a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        n0 n0Var = this.f978e;
        if (n0Var != null) {
            return n0Var.f1048b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: all -> 0x0092, TryCatch #0 {all -> 0x0092, blocks: (B:3:0x0023, B:5:0x002b, B:7:0x0043, B:8:0x0047, B:10:0x0053, B:12:0x0064, B:14:0x006f, B:23:0x0083, B:25:0x0089, B:28:0x0094, B:29:0x0098, B:31:0x00a1, B:33:0x00b9, B:35:0x00c4, B:40:0x00d0, B:42:0x00d7, B:43:0x00df), top: B:49:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(android.util.AttributeSet r11, int r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e.d(android.util.AttributeSet, int):void");
    }

    public void e() {
        this.f977c = -1;
        g(null);
        a();
    }

    public void f(int i10) {
        this.f977c = i10;
        h hVar = this.f976b;
        g(hVar != null ? hVar.d(this.f975a.getContext(), i10) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new n0();
            }
            n0 n0Var = this.d;
            n0Var.f1047a = colorStateList;
            n0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f978e == null) {
            this.f978e = new n0();
        }
        n0 n0Var = this.f978e;
        n0Var.f1047a = colorStateList;
        n0Var.d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f978e == null) {
            this.f978e = new n0();
        }
        n0 n0Var = this.f978e;
        n0Var.f1048b = mode;
        n0Var.f1049c = true;
        a();
    }
}
