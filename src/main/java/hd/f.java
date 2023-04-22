package hd;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.app.pornhub.R;
import com.pornhub.vrplayer.enums.Projection;
import com.pornhub.vrplayer.enums.StereoType;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@TargetApi(16)
/* loaded from: classes2.dex */
public class f extends a implements SurfaceTexture.OnFrameAvailableListener {
    public StereoType A;
    public Projection B;
    public float[] C;
    public float D;
    public float[] E;
    public boolean F;
    public int[] n;

    /* renamed from: t  reason: collision with root package name */
    public SurfaceTexture f10426t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f10427u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f10428w;
    public Buffer y;

    /* renamed from: z  reason: collision with root package name */
    public Buffer f10429z;

    public f(Context context) {
        super(context);
        this.n = new int[1];
        this.f10427u = false;
        this.f10428w = false;
        this.A = StereoType.MONO;
        this.B = Projection.NONE;
        this.C = new float[16];
        this.D = 1.333f;
        this.E = new float[3];
        this.F = false;
        f();
        this.y = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f10429z = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asShortBuffer().put(new short[]{0, 1, 2, 0, 2, 3}).position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.n, 0);
        a("VideoModel", "glGenTextures");
        GLES20.glBindTexture(36197, this.n[0]);
        a("VideoModel", "glBindTexture");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glUniform1i(this.f10416f.get("sampler").intValue(), 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.n[0]);
        this.f10426t = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void f() {
        Projection projection = this.B;
        if (projection == Projection.NONE) {
            b(R.raw.video_no_projection_vertex, R.raw.video_no_projection_fragment);
            c("vPos", "vTex");
            e("sampler", "eye", "stereoType", "pvmMat");
            g();
            return;
        }
        int ordinal = projection.ordinal();
        int i10 = R.raw.video_equidistant_180_fragment;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    i10 = R.raw.video_equirectagular_360_fragment;
                }
                b(R.raw.video_vertex, i10);
                c("vPos");
                e("sampler", "eye", "stereoType", "invProj");
            }
            i10 = R.raw.video_equirectagular_180_fragment;
        }
        b(R.raw.video_vertex, i10);
        c("vPos");
        e("sampler", "eye", "stereoType", "invProj");
    }

    public final synchronized void g() {
        Matrix.setIdentityM(this.C, 0);
        Matrix.rotateM(this.C, 0, 180.0f * (this.E[0] / 3.1415927f), 1.0f, 0.0f, 0.0f);
        float f10 = this.D;
        if (f10 > 1.0d) {
            Matrix.scaleM(this.C, 0, 11.0f, 11.0f / f10, 1.0f);
        } else {
            Matrix.scaleM(this.C, 0, f10 * 11.0f, 11.0f, 1.0f);
        }
        Matrix.translateM(this.C, 0, 0.0f, 0.0f, -16.0f);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            this.f10427u = true;
        }
    }
}
