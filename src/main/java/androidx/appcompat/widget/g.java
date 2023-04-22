package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f997a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f998b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f999c = null;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1000e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1001f;

    public g(CompoundButton compoundButton) {
        this.f997a = compoundButton;
    }

    public void a() {
        Drawable a10 = q0.c.a(this.f997a);
        if (a10 != null) {
            if (this.d || this.f1000e) {
                Drawable mutate = f0.a.h(a10).mutate();
                if (this.d) {
                    mutate.setTintList(this.f998b);
                }
                if (this.f1000e) {
                    mutate.setTintMode(this.f999c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f997a.getDrawableState());
                }
                this.f997a.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0031, B:12:0x0045, B:14:0x004c, B:16:0x0052, B:17:0x0062, B:19:0x006b, B:23:0x007b, B:25:0x0084), top: B:31:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #0 {all -> 0x0078, blocks: (B:3:0x0024, B:5:0x002a, B:8:0x0031, B:12:0x0045, B:14:0x004c, B:16:0x0052, B:17:0x0062, B:19:0x006b, B:23:0x007b, B:25:0x0084), top: B:31:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(android.util.AttributeSet r13, int r14) {
        /*
            r12 = this;
            android.widget.CompoundButton r0 = r12.f997a
            android.content.Context r9 = r0.getContext()
            r0 = r9
            int[] r3 = b7.k.I
            r11 = 6
            r9 = 0
            r8 = r9
            androidx.appcompat.widget.p0 r0 = androidx.appcompat.widget.p0.r(r0, r13, r3, r14, r8)
            android.widget.CompoundButton r1 = r12.f997a
            android.content.Context r9 = r1.getContext()
            r2 = r9
            android.content.res.TypedArray r5 = r0.f1055b
            r10 = 1
            r7 = 0
            r11 = 6
            r4 = r13
            r6 = r14
            n0.x.u(r1, r2, r3, r4, r5, r6, r7)
            r11 = 7
            r13 = 1
            r11 = 6
            boolean r14 = r0.p(r13)     // Catch: java.lang.Throwable -> L78
            if (r14 == 0) goto L41
            int r14 = r0.m(r13, r8)     // Catch: java.lang.Throwable -> L78
            if (r14 == 0) goto L41
            r11 = 4
            android.widget.CompoundButton r1 = r12.f997a     // Catch: android.content.res.Resources.NotFoundException -> L41 java.lang.Throwable -> L78
            r11 = 5
            android.content.Context r2 = r1.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L41 java.lang.Throwable -> L78
            android.graphics.drawable.Drawable r9 = f.a.a(r2, r14)     // Catch: android.content.res.Resources.NotFoundException -> L41 java.lang.Throwable -> L78
            r14 = r9
            r1.setButtonDrawable(r14)     // Catch: android.content.res.Resources.NotFoundException -> L41 java.lang.Throwable -> L78
            goto L43
        L41:
            r13 = 0
            r11 = 5
        L43:
            if (r13 != 0) goto L62
            boolean r9 = r0.p(r8)     // Catch: java.lang.Throwable -> L78
            r13 = r9
            if (r13 == 0) goto L62
            int r13 = r0.m(r8, r8)     // Catch: java.lang.Throwable -> L78
            if (r13 == 0) goto L62
            r10 = 7
            android.widget.CompoundButton r14 = r12.f997a     // Catch: java.lang.Throwable -> L78
            r11 = 6
            android.content.Context r9 = r14.getContext()     // Catch: java.lang.Throwable -> L78
            r1 = r9
            android.graphics.drawable.Drawable r13 = f.a.a(r1, r13)     // Catch: java.lang.Throwable -> L78
            r14.setButtonDrawable(r13)     // Catch: java.lang.Throwable -> L78
        L62:
            r11 = 1
            r13 = 2
            r11 = 7
            boolean r14 = r0.p(r13)     // Catch: java.lang.Throwable -> L78
            if (r14 == 0) goto L7a
            r10 = 4
            android.widget.CompoundButton r14 = r12.f997a     // Catch: java.lang.Throwable -> L78
            android.content.res.ColorStateList r9 = r0.c(r13)     // Catch: java.lang.Throwable -> L78
            r13 = r9
            r14.setButtonTintList(r13)     // Catch: java.lang.Throwable -> L78
            r10 = 3
            goto L7b
        L78:
            r13 = move-exception
            goto L9b
        L7a:
            r11 = 7
        L7b:
            r9 = 3
            r13 = r9
            boolean r9 = r0.p(r13)     // Catch: java.lang.Throwable -> L78
            r14 = r9
            if (r14 == 0) goto L94
            android.widget.CompoundButton r14 = r12.f997a     // Catch: java.lang.Throwable -> L78
            r9 = -1
            r1 = r9
            int r13 = r0.j(r13, r1)     // Catch: java.lang.Throwable -> L78
            r1 = 0
            android.graphics.PorterDuff$Mode r13 = androidx.appcompat.widget.v.e(r13, r1)     // Catch: java.lang.Throwable -> L78
            r14.setButtonTintMode(r13)     // Catch: java.lang.Throwable -> L78
        L94:
            android.content.res.TypedArray r13 = r0.f1055b
            r13.recycle()
            r10 = 7
            return
        L9b:
            android.content.res.TypedArray r14 = r0.f1055b
            r14.recycle()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.g.b(android.util.AttributeSet, int):void");
    }
}
