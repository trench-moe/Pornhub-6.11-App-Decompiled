package g6;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

/* loaded from: classes2.dex */
public class j implements View.OnTouchListener, View.OnLayoutChangeListener {
    public g6.c F;
    public g6.e G;
    public g6.d H;
    public i I;
    public View.OnClickListener J;
    public View.OnLongClickListener K;
    public g6.f L;
    public g M;
    public h N;
    public f O;

    /* renamed from: w  reason: collision with root package name */
    public ImageView f9835w;
    public GestureDetector y;

    /* renamed from: z  reason: collision with root package name */
    public g6.a f9836z;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f9829c = new AccelerateDecelerateInterpolator();

    /* renamed from: f  reason: collision with root package name */
    public int f9830f = 200;

    /* renamed from: j  reason: collision with root package name */
    public float f9831j = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public float f9832m = 1.75f;
    public float n = 3.0f;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9833t = true;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9834u = false;
    public final Matrix A = new Matrix();
    public final Matrix B = new Matrix();
    public final Matrix C = new Matrix();
    public final RectF D = new RectF();
    public final float[] E = new float[9];
    public int P = 2;
    public int Q = 2;
    public boolean R = true;
    public ImageView.ScaleType S = ImageView.ScaleType.FIT_CENTER;
    public g6.b T = new a();

    /* loaded from: classes2.dex */
    public class a implements g6.b {
        public a() {
        }

        public void a(float f10, float f11, float f12) {
            float h10 = j.this.h();
            j jVar = j.this;
            if (h10 < jVar.n || f10 < 1.0f) {
                g6.f fVar = jVar.L;
                if (fVar != null) {
                    fVar.a(f10, f11, f12);
                }
                j.this.C.postScale(f10, f10, f11, f12);
                j.this.a();
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        public b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            j jVar = j.this;
            if (jVar.M != null && jVar.h() <= 1.0f && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1) {
                return j.this.M.onFling(motionEvent, motionEvent2, f10, f11);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnLongClickListener onLongClickListener = jVar.K;
            if (onLongClickListener != null) {
                onLongClickListener.onLongClick(jVar.f9835w);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class c implements GestureDetector.OnDoubleTapListener {
        public c() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float h10 = j.this.h();
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                j jVar = j.this;
                float f10 = jVar.f9832m;
                if (h10 < f10) {
                    jVar.j(f10, x10, y, true);
                } else {
                    if (h10 >= f10) {
                        float f11 = jVar.n;
                        if (h10 < f11) {
                            jVar.j(f11, x10, y, true);
                        }
                    }
                    jVar.j(jVar.f9831j, x10, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            j jVar = j.this;
            View.OnClickListener onClickListener = jVar.J;
            if (onClickListener != null) {
                onClickListener.onClick(jVar.f9835w);
            }
            RectF c10 = j.this.c();
            float x10 = motionEvent.getX();
            float y = motionEvent.getY();
            j jVar2 = j.this;
            i iVar = jVar2.I;
            if (iVar != null) {
                iVar.a(jVar2.f9835w, x10, y);
            }
            if (c10 != null) {
                if (c10.contains(x10, y)) {
                    float width = (x10 - c10.left) / c10.width();
                    float height = (y - c10.top) / c10.height();
                    j jVar3 = j.this;
                    g6.e eVar = jVar3.G;
                    if (eVar != null) {
                        eVar.a(jVar3.f9835w, width, height);
                    }
                    return true;
                }
                j jVar4 = j.this;
                g6.d dVar = jVar4.H;
                if (dVar != null) {
                    dVar.a(jVar4.f9835w);
                }
            }
            return false;
        }
    }

    /* loaded from: classes2.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9840a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f9840a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9840a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9840a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9840a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class e implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final float f9841c;

        /* renamed from: f  reason: collision with root package name */
        public final float f9842f;

        /* renamed from: j  reason: collision with root package name */
        public final long f9843j = System.currentTimeMillis();

        /* renamed from: m  reason: collision with root package name */
        public final float f9844m;
        public final float n;

        public e(float f10, float f11, float f12, float f13) {
            this.f9841c = f12;
            this.f9842f = f13;
            this.f9844m = f10;
            this.n = f11;
        }

        @Override // java.lang.Runnable
        public void run() {
            float interpolation = j.this.f9829c.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f9843j)) * 1.0f) / j.this.f9830f));
            float f10 = this.f9844m;
            float b10 = a0.a.b(this.n, f10, interpolation, f10) / j.this.h();
            ((a) j.this.T).a(b10, this.f9841c, this.f9842f);
            if (interpolation < 1.0f) {
                j.this.f9835w.postOnAnimation(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class f implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final OverScroller f9846c;

        /* renamed from: f  reason: collision with root package name */
        public int f9847f;

        /* renamed from: j  reason: collision with root package name */
        public int f9848j;

        public f(Context context) {
            this.f9846c = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f9846c.isFinished() && this.f9846c.computeScrollOffset()) {
                int currX = this.f9846c.getCurrX();
                int currY = this.f9846c.getCurrY();
                j.this.C.postTranslate(this.f9847f - currX, this.f9848j - currY);
                j.this.a();
                this.f9847f = currX;
                this.f9848j = currY;
                j.this.f9835w.postOnAnimation(this);
            }
        }
    }

    public j(ImageView imageView) {
        this.f9835w = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f9836z = new g6.a(imageView.getContext(), this.T);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new b());
        this.y = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new c());
    }

    public final void a() {
        RectF d10;
        if (b()) {
            Matrix e10 = e();
            this.f9835w.setImageMatrix(e10);
            if (this.F == null || (d10 = d(e10)) == null) {
                return;
            }
            this.F.a(d10);
        }
    }

    public final boolean b() {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        RectF d10 = d(e());
        if (d10 == null) {
            return false;
        }
        float height = d10.height();
        float width = d10.width();
        float f15 = f(this.f9835w);
        float f16 = 0.0f;
        if (height <= f15) {
            int i10 = d.f9840a[this.S.ordinal()];
            if (i10 != 2) {
                if (i10 != 3) {
                    f13 = (f15 - height) / 2.0f;
                    f14 = d10.top;
                } else {
                    f13 = f15 - height;
                    f14 = d10.top;
                }
                f10 = f13 - f14;
            } else {
                f10 = -d10.top;
            }
            this.Q = 2;
        } else {
            float f17 = d10.top;
            if (f17 > 0.0f) {
                this.Q = 0;
                f10 = -f17;
            } else {
                float f18 = d10.bottom;
                if (f18 < f15) {
                    this.Q = 1;
                    f10 = f15 - f18;
                } else {
                    this.Q = -1;
                    f10 = 0.0f;
                }
            }
        }
        float g10 = g(this.f9835w);
        if (width <= g10) {
            int i11 = d.f9840a[this.S.ordinal()];
            if (i11 != 2) {
                if (i11 != 3) {
                    f11 = (g10 - width) / 2.0f;
                    f12 = d10.left;
                } else {
                    f11 = g10 - width;
                    f12 = d10.left;
                }
                f16 = f11 - f12;
            } else {
                f16 = -d10.left;
            }
            this.P = 2;
        } else {
            float f19 = d10.left;
            if (f19 > 0.0f) {
                this.P = 0;
                f16 = -f19;
            } else {
                float f20 = d10.right;
                if (f20 < g10) {
                    f16 = g10 - f20;
                    this.P = 1;
                } else {
                    this.P = -1;
                }
            }
        }
        this.C.postTranslate(f16, f10);
        return true;
    }

    public RectF c() {
        b();
        return d(e());
    }

    public final RectF d(Matrix matrix) {
        Drawable drawable = this.f9835w.getDrawable();
        if (drawable != null) {
            this.D.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(this.D);
            return this.D;
        }
        return null;
    }

    public final Matrix e() {
        this.B.set(this.A);
        this.B.postConcat(this.C);
        return this.B;
    }

    public final int f(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public final int g(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    public float h() {
        this.C.getValues(this.E);
        this.C.getValues(this.E);
        return (float) Math.sqrt(((float) Math.pow(this.E[0], 2.0d)) + ((float) Math.pow(this.E[3], 2.0d)));
    }

    public final void i() {
        RectF d10;
        this.C.reset();
        this.C.postRotate(0.0f);
        a();
        Matrix e10 = e();
        this.f9835w.setImageMatrix(e10);
        if (this.F != null && (d10 = d(e10)) != null) {
            this.F.a(d10);
        }
        b();
    }

    public void j(float f10, float f11, float f12, boolean z10) {
        if (f10 < this.f9831j || f10 > this.n) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z10) {
            this.f9835w.post(new e(h(), f10, f11, f12));
            return;
        }
        this.C.setScale(f10, f10, f11, f12);
        a();
    }

    public void k() {
        if (this.R) {
            l(this.f9835w.getDrawable());
        } else {
            i();
        }
    }

    public final void l(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float g10 = g(this.f9835w);
        float f10 = f(this.f9835w);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.A.reset();
        float f11 = intrinsicWidth;
        float f12 = g10 / f11;
        float f13 = intrinsicHeight;
        float f14 = f10 / f13;
        ImageView.ScaleType scaleType = this.S;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.A.postTranslate((g10 - f11) / 2.0f, (f10 - f13) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f12, f14);
            this.A.postScale(max, max);
            this.A.postTranslate((g10 - (f11 * max)) / 2.0f, (f10 - (f13 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f12, f14));
            this.A.postScale(min, min);
            this.A.postTranslate((g10 - (f11 * min)) / 2.0f, (f10 - (f13 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f11, f13);
            RectF rectF2 = new RectF(0.0f, 0.0f, g10, f10);
            if (((int) 0.0f) % 180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f13, f11);
            }
            int i10 = d.f9840a[this.S.ordinal()];
            if (i10 == 1) {
                this.A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            } else if (i10 == 2) {
                this.A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            } else if (i10 == 3) {
                this.A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
            } else if (i10 == 4) {
                this.A.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
            }
        }
        i();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (i10 == i14 && i11 == i15 && i12 == i16 && i13 == i17) {
            return;
        }
        l(this.f9835w.getDrawable());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.j.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
