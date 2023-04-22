package pl.droidsonroids.gif;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import android.widget.MediaController;
import ef.c;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class b extends Drawable implements Animatable, MediaController.MediaPlayerControl {
    public PorterDuff.Mode A;
    public final boolean B;
    public final ef.d C;
    public final g D;
    public final Rect E;
    public ScheduledFuture<?> F;
    public int G;
    public int H;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f14113c;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f14114f;

    /* renamed from: j  reason: collision with root package name */
    public long f14115j;

    /* renamed from: m  reason: collision with root package name */
    public final Rect f14116m;
    public final Paint n;

    /* renamed from: t  reason: collision with root package name */
    public final Bitmap f14117t;

    /* renamed from: u  reason: collision with root package name */
    public final GifInfoHandle f14118u;

    /* renamed from: w  reason: collision with root package name */
    public final ConcurrentLinkedQueue<ef.a> f14119w;
    public ColorStateList y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuffColorFilter f14120z;

    /* loaded from: classes3.dex */
    public class a extends h {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f14121f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, int i10) {
            super(bVar);
            this.f14121f = i10;
        }

        @Override // pl.droidsonroids.gif.h
        public void a() {
            b bVar = b.this;
            bVar.f14118u.u(this.f14121f, bVar.f14117t);
            this.f14133c.C.sendEmptyMessageAtTime(-1, 0L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            r2 = this;
            int r0 = pl.droidsonroids.gif.GifInfoHandle.f14096b
            java.lang.String r0 = r4.getScheme()
            java.lang.String r1 = "file"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L18
            pl.droidsonroids.gif.GifInfoHandle r3 = new pl.droidsonroids.gif.GifInfoHandle
            java.lang.String r4 = r4.getPath()
            r3.<init>(r4)
            goto L26
        L18:
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r3 = r3.openAssetFileDescriptor(r4, r0)
            if (r3 == 0) goto L2c
            pl.droidsonroids.gif.GifInfoHandle r4 = new pl.droidsonroids.gif.GifInfoHandle
            r4.<init>(r3)
            r3 = r4
        L26:
            r4 = 1
            r0 = 0
            r2.<init>(r3, r0, r0, r4)
            return
        L2c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Could not open AssetFileDescriptor for "
            java.lang.String r4 = android.support.v4.media.b.i(r0, r4)
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.b.<init>(android.content.ContentResolver, android.net.Uri):void");
    }

    public b(Resources resources, int i10) {
        this(new GifInfoHandle(resources.openRawResourceFd(i10)), null, null, true);
        List<String> list = d.f14124a;
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        float f10 = (i11 <= 0 || i12 <= 0) ? 1.0f : i12 / i11;
        this.H = (int) (this.f14118u.f() * f10);
        this.G = (int) (this.f14118u.k() * f10);
    }

    public b(GifInfoHandle gifInfoHandle, b bVar, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z10) {
        this.f14114f = true;
        this.f14115j = Long.MIN_VALUE;
        this.f14116m = new Rect();
        this.n = new Paint(6);
        this.f14119w = new ConcurrentLinkedQueue<>();
        g gVar = new g(this);
        this.D = gVar;
        this.B = z10;
        int i10 = ef.c.f9324c;
        this.f14113c = c.b.f9325a;
        this.f14118u = gifInfoHandle;
        Bitmap createBitmap = Bitmap.createBitmap(gifInfoHandle.k(), gifInfoHandle.f(), Bitmap.Config.ARGB_8888);
        this.f14117t = createBitmap;
        createBitmap.setHasAlpha(true ^ gifInfoHandle.l());
        this.E = new Rect(0, 0, gifInfoHandle.k(), gifInfoHandle.f());
        this.C = new ef.d(this);
        gVar.a();
        this.G = gifInfoHandle.k();
        this.H = gifInfoHandle.f();
    }

    public void a(long j10) {
        if (this.B) {
            this.f14115j = 0L;
            this.C.sendEmptyMessageAtTime(-1, 0L);
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.F;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.C.removeMessages(-1);
        this.F = this.f14113c.schedule(this.D, Math.max(j10, 0L), TimeUnit.MILLISECONDS);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f14118u.i() > 1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f14118u.i() > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        if (this.f14120z == null || this.n.getColorFilter() != null) {
            z10 = false;
        } else {
            this.n.setColorFilter(this.f14120z);
            z10 = true;
        }
        canvas.drawBitmap(this.f14117t, this.E, this.f14116m, this.n);
        if (z10) {
            this.n.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.n.getAlpha();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 100;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.n.getColorFilter();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return this.f14118u.d();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return this.f14118u.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.H;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return (!this.f14118u.l() || this.n.getAlpha() < 255) ? -2 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        if (this.B && this.f14114f) {
            long j10 = this.f14115j;
            if (j10 != Long.MIN_VALUE) {
                long max = Math.max(0L, j10 - SystemClock.uptimeMillis());
                this.f14115j = Long.MIN_VALUE;
                this.f14113c.remove(this.D);
                this.F = this.f14113c.schedule(this.D, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return this.f14114f;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f14114f;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        return super.isStateful() || ((colorStateList = this.y) != null && colorStateList.isStateful());
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f14116m.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.y;
        if (colorStateList == null || (mode = this.A) == null) {
            return false;
        }
        this.f14120z = b(colorStateList, mode);
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        stop();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Position is not positive");
        }
        this.f14113c.execute(new a(this, i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.n.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.n.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.n.setDither(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.n.setFilterBitmap(z10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.y = colorStateList;
        this.f14120z = b(colorStateList, this.A);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.A = mode;
        this.f14120z = b(this.y, mode);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        if (!this.B) {
            if (z10) {
                if (z11) {
                    this.f14113c.execute(new pl.droidsonroids.gif.a(this, this));
                }
                if (visible) {
                    start();
                }
            } else if (visible) {
                stop();
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this) {
            if (this.f14114f) {
                return;
            }
            this.f14114f = true;
            a(this.f14118u.r());
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        synchronized (this) {
            if (this.f14114f) {
                this.f14114f = false;
                ScheduledFuture<?> scheduledFuture = this.F;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.C.removeMessages(-1);
                this.f14118u.t();
            }
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "GIF: size: %dx%d, frames: %d, error: %d", Integer.valueOf(this.f14118u.k()), Integer.valueOf(this.f14118u.f()), Integer.valueOf(this.f14118u.i()), Integer.valueOf(this.f14118u.h()));
    }
}
