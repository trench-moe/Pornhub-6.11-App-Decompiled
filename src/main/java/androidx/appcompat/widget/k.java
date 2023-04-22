package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1029a;

    /* renamed from: b  reason: collision with root package name */
    public n0 f1030b;

    /* renamed from: c  reason: collision with root package name */
    public n0 f1031c;
    public int d = 0;

    public k(ImageView imageView) {
        this.f1029a = imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r9 = this;
            r5 = r9
            android.widget.ImageView r0 = r5.f1029a
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L10
            r7 = 3
            androidx.appcompat.widget.v.b(r0)
            r8 = 3
        L10:
            if (r0 == 0) goto L90
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            r2 = r8
            r8 = 1
            r3 = r8
            r4 = 0
            r7 = 6
            if (r1 <= r2) goto L21
        L1d:
            r8 = 5
            r8 = 0
            r1 = r8
            goto L26
        L21:
            if (r1 != r2) goto L1d
            r7 = 6
            r8 = 1
            r1 = r8
        L26:
            if (r1 == 0) goto L81
            androidx.appcompat.widget.n0 r1 = r5.f1031c
            if (r1 != 0) goto L35
            r7 = 5
            androidx.appcompat.widget.n0 r1 = new androidx.appcompat.widget.n0
            r1.<init>()
            r5.f1031c = r1
            r8 = 6
        L35:
            r7 = 5
            androidx.appcompat.widget.n0 r1 = r5.f1031c
            r8 = 4
            r7 = 0
            r2 = r7
            r1.f1047a = r2
            r1.d = r4
            r8 = 1
            r1.f1048b = r2
            r1.f1049c = r4
            r7 = 4
            android.widget.ImageView r2 = r5.f1029a
            r8 = 7
            android.content.res.ColorStateList r2 = r2.getImageTintList()
            if (r2 == 0) goto L52
            r1.d = r3
            r1.f1047a = r2
        L52:
            r8 = 5
            android.widget.ImageView r2 = r5.f1029a
            r8 = 3
            android.graphics.PorterDuff$Mode r2 = r2.getImageTintMode()
            if (r2 == 0) goto L62
            r1.f1049c = r3
            r7 = 3
            r1.f1048b = r2
            r7 = 6
        L62:
            r7 = 1
            boolean r2 = r1.d
            if (r2 != 0) goto L72
            r8 = 6
            boolean r2 = r1.f1049c
            r7 = 4
            if (r2 == 0) goto L6e
            goto L73
        L6e:
            r7 = 4
            r8 = 0
            r3 = r8
            goto L7d
        L72:
            r7 = 6
        L73:
            android.widget.ImageView r2 = r5.f1029a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.h.f(r0, r1, r2)
            r8 = 2
        L7d:
            if (r3 == 0) goto L81
            r8 = 2
            return
        L81:
            r7 = 5
            androidx.appcompat.widget.n0 r1 = r5.f1030b
            r7 = 4
            if (r1 == 0) goto L90
            android.widget.ImageView r2 = r5.f1029a
            int[] r2 = r2.getDrawableState()
            androidx.appcompat.widget.h.f(r0, r1, r2)
        L90:
            r7 = 2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a():void");
    }

    public void b(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int m10;
        Context context = this.f1029a.getContext();
        int[] iArr = b7.k.B;
        p0 r10 = p0.r(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1029a;
        n0.x.u(imageView, imageView.getContext(), iArr, attributeSet, r10.f1055b, i10, 0);
        try {
            Drawable drawable3 = this.f1029a.getDrawable();
            if (drawable3 == null && (m10 = r10.m(1, -1)) != -1 && (drawable3 = f.a.a(this.f1029a.getContext(), m10)) != null) {
                this.f1029a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                v.b(drawable3);
            }
            if (r10.p(2)) {
                ImageView imageView2 = this.f1029a;
                ColorStateList c10 = r10.c(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView2.setImageTintList(c10);
                if (i11 == 21 && (drawable2 = imageView2.getDrawable()) != null && imageView2.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (r10.p(3)) {
                ImageView imageView3 = this.f1029a;
                PorterDuff.Mode e10 = v.e(r10.j(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView3.setImageTintMode(e10);
                if (i12 == 21 && (drawable = imageView3.getDrawable()) != null && imageView3.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            r10.f1055b.recycle();
        } catch (Throwable th) {
            r10.f1055b.recycle();
            throw th;
        }
    }

    public void c(int i10) {
        if (i10 != 0) {
            Drawable a10 = f.a.a(this.f1029a.getContext(), i10);
            if (a10 != null) {
                v.b(a10);
            }
            this.f1029a.setImageDrawable(a10);
        } else {
            this.f1029a.setImageDrawable(null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f1030b == null) {
            this.f1030b = new n0();
        }
        n0 n0Var = this.f1030b;
        n0Var.f1047a = colorStateList;
        n0Var.d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f1030b == null) {
            this.f1030b = new n0();
        }
        n0 n0Var = this.f1030b;
        n0Var.f1048b = mode;
        n0Var.f1049c = true;
        a();
    }
}
