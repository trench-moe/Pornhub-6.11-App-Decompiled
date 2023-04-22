package com.pornhub.vrplayer;

import android.media.MediaPlayer;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Vibrator;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.ImageButton;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.CardboardView;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.google.vrtoolkit.cardboard.Viewport;
import com.pornhub.vrplayer.enums.Projection;
import com.pornhub.vrplayer.enums.StereoType;
import com.pornhub.vrplayer.glwidget.PlayPauseButton;
import com.pornhub.vrplayer.glwidget.b;
import com.pornhub.vrplayer.glwidget.c;
import java.io.IOException;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import javax.microedition.khronos.egl.EGLConfig;

/* loaded from: classes.dex */
public class VrPlayerActivity extends gd.a implements CardboardView.StereoRenderer {
    public Projection A;
    public float B;

    /* renamed from: j  reason: collision with root package name */
    public Vibrator f8424j;

    /* renamed from: m  reason: collision with root package name */
    public CardboardView f8425m;
    public MediaPlayer n;

    /* renamed from: t  reason: collision with root package name */
    public hd.f f8426t;

    /* renamed from: u  reason: collision with root package name */
    public com.pornhub.vrplayer.glwidget.a f8427u;

    /* renamed from: w  reason: collision with root package name */
    public hd.c f8428w;
    public String y;

    /* renamed from: z  reason: collision with root package name */
    public StereoType f8429z;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VrPlayerActivity.this.finish();
        }
    }

    /* loaded from: classes.dex */
    public class b implements MediaPlayer.OnPreparedListener {

        /* loaded from: classes.dex */
        public class a extends TimerTask {
            public a() {
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    VrPlayerActivity vrPlayerActivity = VrPlayerActivity.this;
                    if (vrPlayerActivity.f8427u == null) {
                        return;
                    }
                    VrPlayerActivity.this.f8427u.R.p(vrPlayerActivity.n.getCurrentPosition() / VrPlayerActivity.this.n.getDuration());
                    VrPlayerActivity vrPlayerActivity2 = VrPlayerActivity.this;
                    com.pornhub.vrplayer.glwidget.a aVar = vrPlayerActivity2.f8427u;
                    if (vrPlayerActivity2.n.isPlaying()) {
                        aVar.Q.t(PlayPauseButton.State.PLAYING);
                    } else {
                        aVar.Q.t(PlayPauseButton.State.PAUSED);
                    }
                } catch (IllegalStateException | NullPointerException unused) {
                    cancel();
                }
            }
        }

        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            new Timer().scheduleAtFixedRate(new a(), 0L, 1000L);
            VrPlayerActivity.this.B = mediaPlayer.getVideoWidth() / mediaPlayer.getVideoHeight();
            VrPlayerActivity vrPlayerActivity = VrPlayerActivity.this;
            hd.f fVar = vrPlayerActivity.f8426t;
            if (fVar != null) {
                fVar.D = vrPlayerActivity.B;
                fVar.g();
            }
            mediaPlayer.start();
        }
    }

    /* loaded from: classes.dex */
    public class c implements MediaPlayer.OnBufferingUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public float f8433a = 0.0f;

        public c() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
            if (VrPlayerActivity.this.f8427u == null) {
                return;
            }
            float max = Math.max(this.f8433a, i10 * 0.01f);
            this.f8433a = max;
            VrPlayerActivity.this.f8427u.R.o(max);
        }
    }

    /* loaded from: classes.dex */
    public class d implements PlayPauseButton.a {
        public d() {
        }
    }

    /* loaded from: classes.dex */
    public class e implements c.a {
        public e() {
        }
    }

    /* loaded from: classes.dex */
    public class f implements b.a {
        public f() {
        }
    }

    public final void a() {
        hd.f fVar = this.f8426t;
        if (fVar == null) {
            return;
        }
        fVar.D = this.B;
        fVar.g();
        hd.f fVar2 = this.f8426t;
        fVar2.A = this.f8429z;
        fVar2.B = this.A;
        synchronized (fVar2) {
            fVar2.f10428w = true;
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardActivity, com.google.vrtoolkit.cardboard.sensors.SensorConnection.SensorListener
    public void onCardboardTrigger() {
        super.onCardboardTrigger();
        if (this.f8427u != null && this.f8428w != null) {
            this.f8424j.vibrate(50L);
            com.pornhub.vrplayer.glwidget.a aVar = this.f8427u;
            if (!aVar.G) {
                System.arraycopy(aVar.f10420u, 0, aVar.T, 0, 16);
                aVar.o();
                this.f8427u.m(true);
                this.f8428w.y = true;
            } else if (aVar.i()) {
                this.f8427u.j();
            } else {
                this.f8427u.m(false);
                this.f8428w.y = false;
            }
        }
    }

    @Override // gd.a, com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vr_player);
        this.f8424j = (Vibrator) getSystemService("vibrator");
        CardboardView cardboardView = (CardboardView) findViewById(R.id.cardboard_view);
        this.f8425m = cardboardView;
        cardboardView.setRestoreGLStateEnabled(false);
        this.f8425m.setRenderer(this);
        setCardboardView(this.f8425m);
        ((ImageButton) findViewById(R.id.back_button)).setOnClickListener(new a());
        this.y = getIntent().getStringExtra("com.pornhub.vrplayer.VrPlayerActivity.dataSource");
        this.f8429z = (StereoType) getIntent().getSerializableExtra("com.pornhub.vrplayer.VrPlayerActivity.stereoType");
        this.A = (Projection) getIntent().getSerializableExtra("com.pornhub.vrplayer.VrPlayerActivity.projection");
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onDrawEye(Eye eye) {
        GLES20.glClear(16640);
        hd.f fVar = this.f8426t;
        synchronized (fVar) {
            if (fVar.f10427u) {
                fVar.f10426t.updateTexImage();
                fVar.f10427u = false;
            }
            if (fVar.f10428w) {
                fVar.f();
                fVar.f10428w = false;
            }
        }
        GLES20.glUseProgram(fVar.f10418m);
        GLES20.glUniform1i(fVar.f10416f.get("eye").intValue(), eye.getType());
        GLES20.glUniform1i(fVar.f10416f.get("stereoType").intValue(), fVar.A.ordinal());
        Projection projection = fVar.B;
        Projection projection2 = Projection.NONE;
        if (projection == projection2) {
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, eye.getPerspective(0.2f, 100.0f), 0, eye.getEyeView(), 0);
            float[] fArr2 = new float[16];
            Matrix.multiplyMM(fArr2, 0, fArr, 0, fVar.C, 0);
            GLES20.glUniformMatrix4fv(fVar.f10416f.get("pvmMat").intValue(), 1, false, fArr2, 0);
        } else {
            float[] fArr3 = new float[16];
            Matrix.multiplyMM(fArr3, 0, eye.getPerspective(0.2f, 10.0f), 0, eye.getEyeView(), 0);
            float[] fArr4 = new float[16];
            Matrix.invertM(fArr4, 0, fArr3, 0);
            GLES20.glUniformMatrix4fv(fVar.f10416f.get("invProj").intValue(), 1, false, fArr4, 0);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, fVar.n[0]);
        GLES20.glEnableVertexAttribArray(fVar.f10417j.get("vPos").intValue());
        fVar.y.position(0);
        GLES20.glVertexAttribPointer(fVar.f10417j.get("vPos").intValue(), 2, 5126, false, 16, fVar.y);
        if (fVar.B == projection2) {
            GLES20.glEnableVertexAttribArray(fVar.f10417j.get("vTex").intValue());
            fVar.y.position(2);
            GLES20.glVertexAttribPointer(fVar.f10417j.get("vTex").intValue(), 2, 5126, false, 16, fVar.y);
        }
        GLES20.glDrawElements(4, 6, 5123, fVar.f10429z);
        if (fVar.B == projection2) {
            GLES20.glDisableVertexAttribArray(fVar.f10417j.get("vTex").intValue());
        }
        GLES20.glDisableVertexAttribArray(fVar.f10417j.get("vPos").intValue());
        fVar.a("VideoModel", "drawEye");
        this.f8427u.f(eye);
        hd.c cVar = this.f8428w;
        if (cVar.y) {
            GLES20.glUseProgram(cVar.f10418m);
            float[] fArr5 = new float[16];
            Matrix.multiplyMM(fArr5, 0, eye.getPerspective(0.01f, 100.0f), 0, eye.getEyeView(), 0);
            float[] fArr6 = new float[16];
            Matrix.multiplyMM(fArr6, 0, fArr5, 0, cVar.f10425w, 0);
            GLES20.glUniformMatrix4fv(cVar.f10416f.get("mvpMat").intValue(), 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, cVar.n[0]);
            GLES20.glUniform1i(cVar.f10416f.get("sampler").intValue(), 0);
            GLES20.glEnableVertexAttribArray(cVar.f10417j.get("vPos").intValue());
            cVar.f10423t.position(0);
            GLES20.glVertexAttribPointer(cVar.f10417j.get("vPos").intValue(), 2, 5126, false, 16, cVar.f10423t);
            GLES20.glEnableVertexAttribArray(cVar.f10417j.get("vTex").intValue());
            cVar.f10423t.position(2);
            GLES20.glVertexAttribPointer(cVar.f10417j.get("vTex").intValue(), 2, 5126, false, 16, cVar.f10423t);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glDrawElements(4, 6, 5123, cVar.f10424u);
            GLES20.glDisable(3042);
            GLES20.glDisableVertexAttribArray(cVar.f10417j.get("vTex").intValue());
            GLES20.glDisableVertexAttribArray(cVar.f10417j.get("vPos").intValue());
            cVar.a("Reticle", "drawEye");
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onFinishFrame(Viewport viewport) {
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onNewFrame(HeadTransform headTransform) {
        this.f8427u.n(headTransform);
        float min = Math.min(this.f8427u.h(true), 1.5f);
        hd.c cVar = this.f8428w;
        Objects.requireNonNull(cVar);
        float[] fArr = new float[4];
        headTransform.getQuaternion(fArr, 0);
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = f10 * f10;
        float f15 = f10 * f11;
        float f16 = f10 * f12;
        float f17 = f10 * f13;
        float f18 = f11 * f11;
        float f19 = f11 * f12;
        float f20 = f11 * f13;
        float f21 = f12 * f12;
        float f22 = f12 * f13;
        float[] fArr2 = {1.0f - ((f18 + f21) * 2.0f), (f15 + f22) * 2.0f, (f16 - f20) * 2.0f, 0.0f, (f15 - f22) * 2.0f, 1.0f - ((f21 + f14) * 2.0f), (f19 + f17) * 2.0f, 0.0f, (f16 + f20) * 2.0f, (f19 - f17) * 2.0f, 1.0f - ((f14 + f18) * 2.0f), 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, 0.0f, 0.0f, -min);
        Matrix.multiplyMM(cVar.f10425w, 0, fArr2, 0, fArr3, 0);
        hd.f fVar = this.f8426t;
        synchronized (fVar) {
            if (fVar.F) {
                fVar.F = false;
                headTransform.getEulerAngles(fVar.E, 0);
                fVar.g();
            }
        }
    }

    @Override // gd.a, com.google.vrtoolkit.cardboard.CardboardActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onRendererShutdown() {
        Log.i("VrPlayerActivity", "onRendererShutdown");
        this.f8426t = null;
        this.f8427u = null;
        this.f8428w = null;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.n = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        hd.f fVar = this.f8426t;
        if (fVar != null) {
            MediaPlayer mediaPlayer2 = this.n;
            Surface surface = new Surface(fVar.f10426t);
            mediaPlayer2.setSurface(surface);
            surface.release();
        }
        this.n.setOnPreparedListener(new b());
        this.n.setOnBufferingUpdateListener(new c());
        MediaPlayer mediaPlayer3 = this.n;
        if (mediaPlayer3 == null) {
            return;
        }
        try {
            mediaPlayer3.reset();
            this.n.setDataSource(this.y);
            this.n.prepareAsync();
        } catch (IOException e10) {
            Log.e("VrPlayerActivity", e10.getMessage());
            Log.e("VrPlayerActivity", Log.getStackTraceString(e10));
        }
        a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        MediaPlayer mediaPlayer = this.n;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.n = null;
        }
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onSurfaceChanged(int i10, int i11) {
    }

    @Override // com.google.vrtoolkit.cardboard.CardboardView.StereoRenderer
    public void onSurfaceCreated(EGLConfig eGLConfig) {
        Log.i("VrPlayerActivity", "onSurfaceCreated");
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glEnable(2929);
        this.f8426t = new hd.f(getApplicationContext());
        this.f8427u = new com.pornhub.vrplayer.glwidget.a(getApplicationContext());
        this.f8428w = new hd.c(getApplicationContext());
        a();
        com.pornhub.vrplayer.glwidget.a aVar = this.f8427u;
        aVar.Q.X = new d();
        aVar.R.f8452c0 = new e();
        aVar.S.X = new f();
        hd.f fVar = this.f8426t;
        MediaPlayer mediaPlayer = this.n;
        Objects.requireNonNull(fVar);
        Surface surface = new Surface(fVar.f10426t);
        mediaPlayer.setSurface(surface);
        surface.release();
    }
}
