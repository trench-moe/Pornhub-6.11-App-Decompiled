package u5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import u5.f;

/* loaded from: classes2.dex */
public class c extends Drawable implements f.b, Animatable {

    /* renamed from: c  reason: collision with root package name */
    public final a f15572c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15573f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f15574j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15575m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public int f15576t;

    /* renamed from: u  reason: collision with root package name */
    public int f15577u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15578w;
    public Paint y;

    /* renamed from: z  reason: collision with root package name */
    public Rect f15579z;

    /* loaded from: classes2.dex */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final f f15580a;

        public a(f fVar) {
            this.f15580a = fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    public c(Context context, g5.a aVar, h5.g<Bitmap> gVar, int i10, int i11, Bitmap bitmap) {
        a aVar2 = new a(new f(com.bumptech.glide.b.b(context), aVar, i10, i11, gVar, bitmap));
        this.n = true;
        this.f15577u = -1;
        this.f15572c = aVar2;
    }

    public c(a aVar) {
        this.n = true;
        this.f15577u = -1;
        this.f15572c = aVar;
    }

    @Override // u5.f.b
    public void a() {
        f fVar;
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        f.a aVar = this.f15572c.f15580a.f15589i;
        if ((aVar != null ? aVar.n : -1) == fVar.f15582a.c() - 1) {
            this.f15576t++;
        }
        int i10 = this.f15577u;
        if (i10 != -1 && this.f15576t >= i10) {
            stop();
        }
    }

    public Bitmap b() {
        return this.f15572c.f15580a.f15592l;
    }

    public final Paint c() {
        if (this.y == null) {
            this.y = new Paint(2);
        }
        return this.y;
    }

    public final void d() {
        a0.b.i(!this.f15575m, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f15572c.f15580a.f15582a.c() == 1) {
            invalidateSelf();
        } else if (this.f15573f) {
        } else {
            this.f15573f = true;
            f fVar = this.f15572c.f15580a;
            if (fVar.f15590j) {
                throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
            }
            if (fVar.f15584c.contains(this)) {
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            boolean isEmpty = fVar.f15584c.isEmpty();
            fVar.f15584c.add(this);
            if (isEmpty && !fVar.f15586f) {
                fVar.f15586f = true;
                fVar.f15590j = false;
                fVar.a();
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f15575m) {
            return;
        }
        if (this.f15578w) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f15579z == null) {
                this.f15579z = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f15579z);
            this.f15578w = false;
        }
        f fVar = this.f15572c.f15580a;
        f.a aVar = fVar.f15589i;
        Bitmap bitmap = aVar != null ? aVar.f15599u : fVar.f15592l;
        if (this.f15579z == null) {
            this.f15579z = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f15579z, c());
    }

    public final void e() {
        this.f15573f = false;
        f fVar = this.f15572c.f15580a;
        fVar.f15584c.remove(this);
        if (fVar.f15584c.isEmpty()) {
            fVar.f15586f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f15572c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f15572c.f15580a.f15596q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f15572c.f15580a.f15595p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f15573f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f15578w = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c().setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        a0.b.i(!this.f15575m, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.n = z10;
        if (!z10) {
            e();
        } else if (this.f15574j) {
            d();
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f15574j = true;
        this.f15576t = 0;
        if (this.n) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f15574j = false;
        e();
    }
}
