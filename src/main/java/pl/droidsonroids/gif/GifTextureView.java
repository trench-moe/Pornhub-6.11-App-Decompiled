package pl.droidsonroids.gif;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.d;
import pl.droidsonroids.gif.e;

/* loaded from: classes3.dex */
public class GifTextureView extends TextureView {

    /* renamed from: u  reason: collision with root package name */
    public static final ImageView.ScaleType[] f14099u = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: c  reason: collision with root package name */
    public ImageView.ScaleType f14100c;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f14101f;

    /* renamed from: j  reason: collision with root package name */
    public e f14102j;

    /* renamed from: m  reason: collision with root package name */
    public c f14103m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public d.b f14104t;

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14105a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f14105a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14105a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14105a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14105a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14105a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14105a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14105a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14105a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(Canvas canvas);
    }

    /* loaded from: classes3.dex */
    public static class c extends Thread implements TextureView.SurfaceTextureListener {

        /* renamed from: c  reason: collision with root package name */
        public final ef.b f14106c;

        /* renamed from: f  reason: collision with root package name */
        public GifInfoHandle f14107f;

        /* renamed from: j  reason: collision with root package name */
        public IOException f14108j;

        /* renamed from: m  reason: collision with root package name */
        public long[] f14109m;
        public final WeakReference<GifTextureView> n;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ GifTextureView f14110c;

            public a(GifTextureView gifTextureView) {
                this.f14110c = gifTextureView;
            }

            @Override // java.lang.Runnable
            public void run() {
                GifTextureView gifTextureView = this.f14110c;
                GifInfoHandle gifInfoHandle = c.this.f14107f;
                ImageView.ScaleType[] scaleTypeArr = GifTextureView.f14099u;
                gifTextureView.c(gifInfoHandle);
            }
        }

        public c(GifTextureView gifTextureView) {
            super("GifRenderThread");
            this.f14106c = new ef.b();
            this.f14107f = new GifInfoHandle();
            this.n = new WeakReference<>(gifTextureView);
        }

        public void a(GifTextureView gifTextureView, b bVar) {
            this.f14106c.a();
            gifTextureView.setSuperSurfaceTextureListener(bVar != null ? new f(bVar) : null);
            this.f14107f.n();
            interrupt();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            GifTextureView gifTextureView = this.n.get();
            if (gifTextureView != null) {
                GifInfoHandle gifInfoHandle = this.f14107f;
                ImageView.ScaleType[] scaleTypeArr = GifTextureView.f14099u;
                gifTextureView.c(gifInfoHandle);
            }
            this.f14106c.b();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f14106c.a();
            this.f14107f.n();
            interrupt();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                GifTextureView gifTextureView = this.n.get();
                if (gifTextureView == null) {
                    return;
                }
                GifInfoHandle a10 = gifTextureView.f14102j.a();
                this.f14107f = a10;
                a10.w((char) 1, gifTextureView.isOpaque());
                int i10 = gifTextureView.f14104t.f14127b;
                if (i10 >= 0) {
                    this.f14107f.v(i10);
                }
                GifTextureView gifTextureView2 = this.n.get();
                if (gifTextureView2 == null) {
                    this.f14107f.o();
                    return;
                }
                gifTextureView2.setSuperSurfaceTextureListener(this);
                boolean isAvailable = gifTextureView2.isAvailable();
                ef.b bVar = this.f14106c;
                synchronized (bVar) {
                    if (isAvailable) {
                        bVar.b();
                    } else {
                        bVar.a();
                    }
                }
                if (isAvailable) {
                    gifTextureView2.post(new a(gifTextureView2));
                }
                this.f14107f.x(gifTextureView2.n);
                while (!isInterrupted()) {
                    try {
                        ef.b bVar2 = this.f14106c;
                        synchronized (bVar2) {
                            while (!bVar2.f9323a) {
                                bVar2.wait();
                            }
                        }
                        GifTextureView gifTextureView3 = this.n.get();
                        if (gifTextureView3 == null) {
                            break;
                        }
                        SurfaceTexture surfaceTexture = gifTextureView3.getSurfaceTexture();
                        if (surfaceTexture != null) {
                            Surface surface = new Surface(surfaceTexture);
                            try {
                                this.f14107f.a(surface, this.f14109m);
                            } finally {
                                surface.release();
                            }
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                this.f14107f.o();
                this.f14107f = new GifInfoHandle();
            } catch (IOException e10) {
                this.f14108j = e10;
            }
        }
    }

    public GifTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14100c = ImageView.ScaleType.FIT_CENTER;
        this.f14101f = new Matrix();
        this.n = 1.0f;
        b(attributeSet, 0, 0);
    }

    public GifTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f14100c = ImageView.ScaleType.FIT_CENTER;
        this.f14101f = new Matrix();
        this.n = 1.0f;
        b(attributeSet, i10, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    public final void b(AttributeSet attributeSet, int i10, int i11) {
        e bVar;
        e eVar;
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = f14099u;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.f14100c = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, mb.a.f13056m, i10, i11);
            TypedValue typedValue = new TypedValue();
            if (obtainStyledAttributes.getValue(0, typedValue)) {
                if (typedValue.resourceId != 0) {
                    String resourceTypeName = obtainStyledAttributes.getResources().getResourceTypeName(typedValue.resourceId);
                    if (d.f14124a.contains(resourceTypeName)) {
                        bVar = new e.c(obtainStyledAttributes.getResources(), typedValue.resourceId);
                        eVar = bVar;
                    } else if (!"string".equals(resourceTypeName)) {
                        throw new IllegalArgumentException(android.support.v4.media.b.j("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                    }
                }
                bVar = new e.b(obtainStyledAttributes.getResources().getAssets(), typedValue.string.toString());
                eVar = bVar;
            } else {
                eVar = null;
            }
            this.f14102j = eVar;
            super.setOpaque(obtainStyledAttributes.getBoolean(1, false));
            obtainStyledAttributes.recycle();
            this.f14104t = new d.b(this, attributeSet, i10, i11);
        } else {
            super.setOpaque(false);
            this.f14104t = new d.b();
        }
        if (isInEditMode()) {
            return;
        }
        c cVar = new c(this);
        this.f14103m = cVar;
        if (this.f14102j != null) {
            cVar.start();
        }
    }

    public final void c(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float k10 = gifInfoHandle.k() / width;
        float f10 = gifInfoHandle.f() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.k(), gifInfoHandle.f());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        float f11 = 1.0f;
        switch (a.f14105a[this.f14100c.ordinal()]) {
            case 1:
                matrix.setScale(k10, f10, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float min = 1.0f / Math.min(k10, f10);
                matrix.setScale(k10 * min, min * f10, width / 2.0f, height / 2.0f);
                break;
            case 3:
                if (gifInfoHandle.k() > width || gifInfoHandle.f() > height) {
                    f11 = Math.min(1.0f / k10, 1.0f / f10);
                }
                matrix.setScale(k10 * f11, f11 * f10, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(k10, f10);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(k10, f10);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(k10, f10);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.f14101f);
                matrix.preScale(k10, f10);
                break;
        }
        super.setTransform(matrix);
    }

    public IOException getIOException() {
        c cVar = this.f14103m;
        IOException iOException = cVar.f14108j;
        if (iOException != null) {
            return iOException;
        }
        int h10 = cVar.f14107f.h();
        int i10 = GifIOException.f14093c;
        if (h10 == GifError.NO_ERROR.errorCode) {
            return null;
        }
        return new GifIOException(h10, null);
    }

    public ImageView.ScaleType getScaleType() {
        return this.f14100c;
    }

    @Override // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    @Override // android.view.TextureView
    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.f14101f);
        return matrix;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f14103m.a(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pl.droidsonroids.gif.c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pl.droidsonroids.gif.c cVar = (pl.droidsonroids.gif.c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f14103m.f14109m = cVar.f14123c[0];
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = this.f14103m;
        cVar.f14109m = cVar.f14107f.j();
        return new pl.droidsonroids.gif.c(super.onSaveInstanceState(), this.f14104t.f14126a ? this.f14103m.f14109m : null);
    }

    public void setFreezesAnimation(boolean z10) {
        this.f14104t.f14126a = z10;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(e eVar) {
        synchronized (this) {
            this.f14103m.a(this, null);
            try {
                this.f14103m.join();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
            this.f14102j = eVar;
            c cVar = new c(this);
            this.f14103m = cVar;
            if (eVar != null) {
                cVar.start();
            }
        }
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean z10) {
        if (z10 != isOpaque()) {
            super.setOpaque(z10);
            setInputSource(this.f14102j);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.f14100c = scaleType;
        c(this.f14103m.f14107f);
    }

    public void setSpeed(float f10) {
        this.n = f10;
        this.f14103m.f14107f.x(f10);
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        this.f14101f.set(matrix);
        c(this.f14103m.f14107f);
    }
}
