package g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import g.d;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int C = 0;
    public long A;
    public C0137b B;

    /* renamed from: c  reason: collision with root package name */
    public c f9655c;

    /* renamed from: f  reason: collision with root package name */
    public Rect f9656f;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f9657j;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f9658m;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9659t;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9661w;
    public Runnable y;

    /* renamed from: z  reason: collision with root package name */
    public long f9662z;
    public int n = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: u  reason: collision with root package name */
    public int f9660u = -1;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* renamed from: g.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0137b implements Drawable.Callback {

        /* renamed from: c  reason: collision with root package name */
        public Drawable.Callback f9664c;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f9664c;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9664c;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public int A;
        public int B;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final b f9665a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f9666b;

        /* renamed from: c  reason: collision with root package name */
        public int f9667c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f9668e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f9669f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f9670g;

        /* renamed from: h  reason: collision with root package name */
        public int f9671h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f9672i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f9673j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f9674k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f9675l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f9676m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f9677o;

        /* renamed from: p  reason: collision with root package name */
        public int f9678p;

        /* renamed from: q  reason: collision with root package name */
        public int f9679q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f9680r;

        /* renamed from: s  reason: collision with root package name */
        public int f9681s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9682t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f9683u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f9684v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f9685w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f9686x;
        public boolean y;

        /* renamed from: z  reason: collision with root package name */
        public int f9687z;

        public c(c cVar, b bVar, Resources resources) {
            this.f9672i = false;
            this.f9675l = false;
            this.f9686x = true;
            this.A = 0;
            this.B = 0;
            this.f9665a = bVar;
            this.f9666b = resources != null ? resources : cVar != null ? cVar.f9666b : null;
            int i10 = cVar != null ? cVar.f9667c : 0;
            int i11 = b.C;
            i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
            i10 = i10 == 0 ? 160 : i10;
            this.f9667c = i10;
            if (cVar == null) {
                this.f9670g = new Drawable[10];
                this.f9671h = 0;
                return;
            }
            this.d = cVar.d;
            this.f9668e = cVar.f9668e;
            this.f9684v = true;
            this.f9685w = true;
            this.f9672i = cVar.f9672i;
            this.f9675l = cVar.f9675l;
            this.f9686x = cVar.f9686x;
            this.y = cVar.y;
            this.f9687z = cVar.f9687z;
            this.A = cVar.A;
            this.B = cVar.B;
            this.C = cVar.C;
            this.D = cVar.D;
            this.E = cVar.E;
            this.F = cVar.F;
            this.G = cVar.G;
            this.H = cVar.H;
            this.I = cVar.I;
            if (cVar.f9667c == i10) {
                if (cVar.f9673j) {
                    this.f9674k = cVar.f9674k != null ? new Rect(cVar.f9674k) : null;
                    this.f9673j = true;
                }
                if (cVar.f9676m) {
                    this.n = cVar.n;
                    this.f9677o = cVar.f9677o;
                    this.f9678p = cVar.f9678p;
                    this.f9679q = cVar.f9679q;
                    this.f9676m = true;
                }
            }
            if (cVar.f9680r) {
                this.f9681s = cVar.f9681s;
                this.f9680r = true;
            }
            if (cVar.f9682t) {
                this.f9683u = cVar.f9683u;
                this.f9682t = true;
            }
            Drawable[] drawableArr = cVar.f9670g;
            this.f9670g = new Drawable[drawableArr.length];
            this.f9671h = cVar.f9671h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f9669f;
            if (sparseArray != null) {
                this.f9669f = sparseArray.clone();
            } else {
                this.f9669f = new SparseArray<>(this.f9671h);
            }
            int i12 = this.f9671h;
            for (int i13 = 0; i13 < i12; i13++) {
                if (drawableArr[i13] != null) {
                    Drawable.ConstantState constantState = drawableArr[i13].getConstantState();
                    if (constantState != null) {
                        this.f9669f.put(i13, constantState);
                    } else {
                        this.f9670g[i13] = drawableArr[i13];
                    }
                }
            }
        }

        public final int a(Drawable drawable) {
            int i10 = this.f9671h;
            if (i10 >= this.f9670g.length) {
                int i11 = i10 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i11];
                Drawable[] drawableArr2 = aVar.f9670g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
                }
                aVar.f9670g = drawableArr;
                int[][] iArr = new int[i11];
                System.arraycopy(aVar.J, 0, iArr, 0, i10);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9665a);
            this.f9670g[i10] = drawable;
            this.f9671h++;
            this.f9668e = drawable.getChangingConfigurations() | this.f9668e;
            this.f9680r = false;
            this.f9682t = false;
            this.f9674k = null;
            this.f9673j = false;
            this.f9676m = false;
            this.f9684v = false;
            return i10;
        }

        public void b() {
            this.f9676m = true;
            c();
            int i10 = this.f9671h;
            Drawable[] drawableArr = this.f9670g;
            this.f9677o = -1;
            this.n = -1;
            this.f9679q = 0;
            this.f9678p = 0;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.n) {
                    this.n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9677o) {
                    this.f9677o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9678p) {
                    this.f9678p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9679q) {
                    this.f9679q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f9669f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i10 = 0; i10 < size; i10++) {
                    int keyAt = this.f9669f.keyAt(i10);
                    Drawable[] drawableArr = this.f9670g;
                    Drawable newDrawable = this.f9669f.valueAt(i10).newDrawable(this.f9666b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        f0.a.c(newDrawable, this.f9687z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f9665a);
                    drawableArr[keyAt] = mutate;
                }
                this.f9669f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i10 = this.f9671h;
            Drawable[] drawableArr = this.f9670g;
            for (int i11 = 0; i11 < i10; i11++) {
                Drawable drawable = drawableArr[i11];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f9669f.get(i11);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i10) {
            int indexOfKey;
            Drawable drawable = this.f9670g[i10];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f9669f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i10)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f9669f.valueAt(indexOfKey).newDrawable(this.f9666b);
            if (Build.VERSION.SDK_INT >= 23) {
                f0.a.c(newDrawable, this.f9687z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f9665a);
            this.f9670g[i10] = mutate;
            this.f9669f.removeAt(indexOfKey);
            if (this.f9669f.size() == 0) {
                this.f9669f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f9666b = resources;
                int i10 = b.C;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = this.f9667c;
                this.f9667c = i11;
                if (i12 != i11) {
                    this.f9676m = false;
                    this.f9673j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d | this.f9668e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(boolean r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.String r13 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            r14.f9659t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r14.f9657j
            r4 = 255(0xff, double:1.26E-321)
            r13 = 6
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L47
            long r9 = r14.f9662z
            r13 = 5
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L4b
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r13 = 4
            if (r11 > 0) goto L29
            int r9 = r14.n
            r3.setAlpha(r9)
            r13 = 2
            r14.f9662z = r7
            r13 = 7
            goto L4c
        L29:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            r13 = 6
            g.b$c r9 = r14.f9655c
            r13 = 5
            int r9 = r9.A
            r13 = 2
            int r10 = r10 / r9
            r13 = 2
            int r9 = 255 - r10
            r13 = 7
            int r10 = r14.n
            int r9 = r9 * r10
            r13 = 2
            int r9 = r9 / 255
            r13 = 3
            r3.setAlpha(r9)
            r13 = 7
            r3 = 1
            goto L4e
        L47:
            r13 = 5
            r14.f9662z = r7
            r13 = 6
        L4b:
            r13 = 3
        L4c:
            r13 = 0
            r3 = r13
        L4e:
            android.graphics.drawable.Drawable r9 = r14.f9658m
            r13 = 2
            if (r9 == 0) goto L81
            r13 = 6
            long r10 = r14.A
            r13 = 3
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r13 = 2
            if (r12 == 0) goto L83
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L6a
            r13 = 1
            r9.setVisible(r6, r6)
            r0 = 0
            r14.f9658m = r0
            r14.A = r7
            goto L83
        L6a:
            r13 = 3
            long r10 = r10 - r1
            r13 = 7
            long r10 = r10 * r4
            int r3 = (int) r10
            g.b$c r4 = r14.f9655c
            int r4 = r4.B
            int r3 = r3 / r4
            r13 = 2
            int r4 = r14.n
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r13 = 2
            goto L84
        L81:
            r14.A = r7
        L83:
            r0 = r3
        L84:
            if (r15 == 0) goto L94
            r13 = 2
            if (r0 == 0) goto L94
            java.lang.Runnable r15 = r14.y
            r13 = 5
            r3 = 16
            r13 = 3
            long r1 = r1 + r3
            r14.scheduleSelf(r15, r1)
            r13 = 2
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f9655c;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i10 = cVar.f9671h;
            Drawable[] drawableArr = cVar.f9670g;
            for (int i11 = 0; i11 < i10; i11++) {
                if (drawableArr[i11] != null && drawableArr[i11].canApplyTheme()) {
                    drawableArr[i11].applyTheme(theme);
                    cVar.f9668e |= drawableArr[i11].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.B == null) {
            this.B = new C0137b();
        }
        C0137b c0137b = this.B;
        c0137b.f9664c = drawable.getCallback();
        drawable.setCallback(c0137b);
        try {
            if (this.f9655c.A <= 0 && this.f9659t) {
                drawable.setAlpha(this.n);
            }
            c cVar = this.f9655c;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    drawable.setTintList(cVar.F);
                }
                c cVar2 = this.f9655c;
                if (cVar2.I) {
                    drawable.setTintMode(cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9655c.f9686x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                f0.a.c(drawable, f0.a.b(this));
            }
            drawable.setAutoMirrored(this.f9655c.C);
            Rect rect = this.f9656f;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            C0137b c0137b2 = this.B;
            Drawable.Callback callback = c0137b2.f9664c;
            c0137b2.f9664c = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C0137b c0137b3 = this.B;
            Drawable.Callback callback2 = c0137b3.f9664c;
            c0137b3.f9664c = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f9655c.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean d(int r13) {
        /*
            Method dump skipped, instructions count: 162
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.b.d(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9658m;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9655c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f9655c;
        boolean z10 = false;
        if (!cVar.f9684v) {
            cVar.c();
            cVar.f9684v = true;
            int i10 = cVar.f9671h;
            Drawable[] drawableArr = cVar.f9670g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    cVar.f9685w = true;
                    z10 = true;
                    break;
                } else if (drawableArr[i11].getConstantState() == null) {
                    cVar.f9685w = false;
                    break;
                } else {
                    i11++;
                }
            }
        } else {
            z10 = cVar.f9685w;
        }
        if (z10) {
            this.f9655c.d = getChangingConfigurations();
            return this.f9655c;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f9657j;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f9656f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f9655c;
        if (cVar.f9675l) {
            if (!cVar.f9676m) {
                cVar.b();
            }
            return cVar.f9677o;
        }
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f9655c;
        if (cVar.f9675l) {
            if (!cVar.f9676m) {
                cVar.b();
            }
            return cVar.n;
        }
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f9655c;
        if (cVar.f9675l) {
            if (!cVar.f9676m) {
                cVar.b();
            }
            return cVar.f9679q;
        }
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f9655c;
        if (cVar.f9675l) {
            if (!cVar.f9676m) {
                cVar.b();
            }
            return cVar.f9678p;
        }
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            if (!drawable.isVisible()) {
                return -2;
            }
            c cVar = this.f9655c;
            if (cVar.f9680r) {
                return cVar.f9681s;
            }
            cVar.c();
            int i10 = cVar.f9671h;
            Drawable[] drawableArr = cVar.f9670g;
            r1 = i10 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i11 = 1; i11 < i10; i11++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i11].getOpacity());
            }
            cVar.f9681s = r1;
            cVar.f9680r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f9655c;
        Rect rect2 = null;
        boolean z10 = true;
        if (!cVar.f9672i) {
            Rect rect3 = cVar.f9674k;
            if (rect3 == null && !cVar.f9673j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i10 = cVar.f9671h;
                Drawable[] drawableArr = cVar.f9670g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                cVar.f9673j = true;
                cVar.f9674k = rect2;
            }
            rect2 = rect3;
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f9657j;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.f9655c.C || f0.a.b(this) != 1) {
            z10 = false;
        }
        if (z10) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f9655c;
        if (cVar != null) {
            cVar.f9680r = false;
            cVar.f9682t = false;
        }
        if (drawable != this.f9657j || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9655c.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f9658m;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9658m = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f9657j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9659t) {
                this.f9657j.setAlpha(this.n);
            }
        }
        if (this.A != 0) {
            this.A = 0L;
            z10 = true;
        }
        if (this.f9662z != 0) {
            this.f9662z = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9661w && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.f9661w = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9658m;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9657j;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i10) {
        c cVar = this.f9655c;
        int i11 = this.f9660u;
        int i12 = cVar.f9671h;
        Drawable[] drawableArr = cVar.f9670g;
        boolean z10 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            if (drawableArr[i13] != null) {
                boolean c10 = Build.VERSION.SDK_INT >= 23 ? f0.a.c(drawableArr[i13], i10) : false;
                if (i13 == i11) {
                    z10 = c10;
                }
            }
        }
        cVar.f9687z = i10;
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i10) {
        Drawable drawable = this.f9658m;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f9657j;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f9658m;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9657j;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f9657j || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f9659t && this.n == i10) {
            return;
        }
        this.f9659t = true;
        this.n = i10;
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            if (this.f9662z == 0) {
                drawable.setAlpha(i10);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        c cVar = this.f9655c;
        if (cVar.C != z10) {
            cVar.C = z10;
            Drawable drawable = this.f9657j;
            if (drawable != null) {
                drawable.setAutoMirrored(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f9655c;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f9657j;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        c cVar = this.f9655c;
        if (cVar.f9686x != z10) {
            cVar.f9686x = z10;
            Drawable drawable = this.f9657j;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f10, float f11) {
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f9656f;
        if (rect == null) {
            this.f9656f = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f9657j;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f9655c;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            f0.a.e(this.f9657j, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f9655c;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            f0.a.f(this.f9657j, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f9658m;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f9657j;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f9657j || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
