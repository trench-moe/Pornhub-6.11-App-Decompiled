package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import com.google.android.exoplayer2.video.spherical.a;
import com.google.android.exoplayer2.video.spherical.b;
import java.nio.Buffer;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import k8.c0;
import k8.z;
import l8.j;
import m8.c;
import m8.d;
import m8.f;
import m8.h;
import w.s;

/* loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public boolean A;

    /* renamed from: c  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f6743c;

    /* renamed from: f  reason: collision with root package name */
    public final SensorManager f6744f;

    /* renamed from: j  reason: collision with root package name */
    public final Sensor f6745j;

    /* renamed from: m  reason: collision with root package name */
    public final com.google.android.exoplayer2.video.spherical.a f6746m;
    public final Handler n;

    /* renamed from: t  reason: collision with root package name */
    public final h f6747t;

    /* renamed from: u  reason: collision with root package name */
    public SurfaceTexture f6748u;

    /* renamed from: w  reason: collision with root package name */
    public Surface f6749w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f6750z;

    /* loaded from: classes.dex */
    public final class a implements GLSurfaceView.Renderer, b.a, a.InterfaceC0086a {

        /* renamed from: c  reason: collision with root package name */
        public final h f6751c;

        /* renamed from: m  reason: collision with root package name */
        public final float[] f6754m;
        public final float[] n;

        /* renamed from: t  reason: collision with root package name */
        public final float[] f6755t;

        /* renamed from: u  reason: collision with root package name */
        public float f6756u;

        /* renamed from: w  reason: collision with root package name */
        public float f6757w;

        /* renamed from: f  reason: collision with root package name */
        public final float[] f6752f = new float[16];

        /* renamed from: j  reason: collision with root package name */
        public final float[] f6753j = new float[16];
        public final float[] y = new float[16];

        /* renamed from: z  reason: collision with root package name */
        public final float[] f6758z = new float[16];

        public a(h hVar) {
            float[] fArr = new float[16];
            this.f6754m = fArr;
            float[] fArr2 = new float[16];
            this.n = fArr2;
            float[] fArr3 = new float[16];
            this.f6755t = fArr3;
            this.f6751c = hVar;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.f6757w = 3.1415927f;
        }

        @Override // com.google.android.exoplayer2.video.spherical.a.InterfaceC0086a
        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f6754m;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f6757w = -f10;
            b();
        }

        public final void b() {
            Matrix.setRotateM(this.n, 0, -this.f6756u, (float) Math.cos(this.f6757w), (float) Math.sin(this.f6757w), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            Long d;
            float[] fArr;
            synchronized (this) {
                Matrix.multiplyMM(this.f6758z, 0, this.f6754m, 0, this.f6755t, 0);
                Matrix.multiplyMM(this.y, 0, this.n, 0, this.f6758z, 0);
            }
            Matrix.multiplyMM(this.f6753j, 0, this.f6752f, 0, this.y, 0);
            h hVar = this.f6751c;
            float[] fArr2 = this.f6753j;
            Objects.requireNonNull(hVar);
            GLES20.glClear(16384);
            a0.b.k();
            if (hVar.f12991c.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = hVar.f12998z;
                Objects.requireNonNull(surfaceTexture);
                surfaceTexture.updateTexImage();
                a0.b.k();
                if (hVar.f12992f.compareAndSet(true, false)) {
                    Matrix.setIdentityM(hVar.f12996u, 0);
                }
                long timestamp = hVar.f12998z.getTimestamp();
                z<Long> zVar = hVar.n;
                synchronized (zVar) {
                    d = zVar.d(timestamp, false);
                }
                Long l10 = d;
                if (l10 != null) {
                    c cVar = hVar.f12994m;
                    float[] fArr3 = hVar.f12996u;
                    float[] e10 = cVar.f12965c.e(l10.longValue());
                    if (e10 != null) {
                        float[] fArr4 = cVar.f12964b;
                        float f10 = e10[0];
                        float f11 = -e10[1];
                        float f12 = -e10[2];
                        float length = Matrix.length(f10, f11, f12);
                        if (length != 0.0f) {
                            fArr = fArr3;
                            Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                        } else {
                            fArr = fArr3;
                            Matrix.setIdentityM(fArr4, 0);
                        }
                        if (!cVar.d) {
                            c.a(cVar.f12963a, cVar.f12964b);
                            cVar.d = true;
                        }
                        Matrix.multiplyMM(fArr, 0, cVar.f12963a, 0, cVar.f12964b, 0);
                    }
                }
                d e11 = hVar.f12995t.e(timestamp);
                if (e11 != null) {
                    f fVar = hVar.f12993j;
                    Objects.requireNonNull(fVar);
                    if (f.a(e11)) {
                        fVar.f12979a = e11.f12968c;
                        f.a aVar = new f.a(e11.f12966a.f12969a[0]);
                        fVar.f12980b = aVar;
                        if (!e11.d) {
                            aVar = new f.a(e11.f12967b.f12969a[0]);
                        }
                        fVar.f12981c = aVar;
                    }
                }
            }
            Matrix.multiplyMM(hVar.f12997w, 0, fArr2, 0, hVar.f12996u, 0);
            f fVar2 = hVar.f12993j;
            int i10 = hVar.y;
            float[] fArr5 = hVar.f12997w;
            f.a aVar2 = fVar2.f12980b;
            if (aVar2 == null) {
                return;
            }
            GLES20.glUseProgram(fVar2.d);
            a0.b.k();
            GLES20.glEnableVertexAttribArray(fVar2.f12984g);
            GLES20.glEnableVertexAttribArray(fVar2.f12985h);
            a0.b.k();
            int i11 = fVar2.f12979a;
            GLES20.glUniformMatrix3fv(fVar2.f12983f, 1, false, i11 == 1 ? f.f12976m : i11 == 2 ? f.f12977o : f.f12975l, 0);
            GLES20.glUniformMatrix4fv(fVar2.f12982e, 1, false, fArr5, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(fVar2.f12986i, 0);
            a0.b.k();
            GLES20.glVertexAttribPointer(fVar2.f12984g, 3, 5126, false, 12, (Buffer) aVar2.f12988b);
            a0.b.k();
            GLES20.glVertexAttribPointer(fVar2.f12985h, 2, 5126, false, 8, (Buffer) aVar2.f12989c);
            a0.b.k();
            GLES20.glDrawArrays(aVar2.d, 0, aVar2.f12987a);
            a0.b.k();
            GLES20.glDisableVertexAttribArray(fVar2.f12984g);
            GLES20.glDisableVertexAttribArray(fVar2.f12985h);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = i10 / i11;
            Matrix.perspectiveM(this.f6752f, 0, f10 > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f10)) * 2.0d) : 90.0f, f10, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
                sphericalGLSurfaceView.n.post(new s(sphericalGLSurfaceView, this.f6751c.a(), 6));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void t(Surface surface);

        void u(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, null);
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6743c = new CopyOnWriteArrayList<>();
        this.n = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        Objects.requireNonNull(systemService);
        SensorManager sensorManager = (SensorManager) systemService;
        this.f6744f = sensorManager;
        Sensor defaultSensor = c0.f11939a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f6745j = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        h hVar = new h();
        this.f6747t = hVar;
        a aVar = new a(hVar);
        View.OnTouchListener bVar = new com.google.android.exoplayer2.video.spherical.b(context, aVar, 25.0f);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        Objects.requireNonNull(windowManager);
        this.f6746m = new com.google.android.exoplayer2.video.spherical.a(windowManager.getDefaultDisplay(), bVar, aVar);
        this.y = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(bVar);
    }

    public final void a() {
        boolean z10 = this.y && this.f6750z;
        Sensor sensor = this.f6745j;
        if (sensor != null) {
            if (z10 == this.A) {
                return;
            }
            if (z10) {
                this.f6744f.registerListener(this.f6746m, sensor, 0);
            } else {
                this.f6744f.unregisterListener(this.f6746m);
            }
            this.A = z10;
        }
    }

    public m8.a getCameraMotionListener() {
        return this.f6747t;
    }

    public j getVideoFrameMetadataListener() {
        return this.f6747t;
    }

    public Surface getVideoSurface() {
        return this.f6749w;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.n.post(new q0.d(this, 6));
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        this.f6750z = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public void onResume() {
        super.onResume();
        this.f6750z = true;
        a();
    }

    public void setDefaultStereoMode(int i10) {
        this.f6747t.A = i10;
    }

    public void setUseSensorRotation(boolean z10) {
        this.y = z10;
        a();
    }
}
