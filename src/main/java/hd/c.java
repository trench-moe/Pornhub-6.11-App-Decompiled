package hd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.app.pornhub.R;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public class c extends a {
    public int[] n;

    /* renamed from: t  reason: collision with root package name */
    public Buffer f10423t;

    /* renamed from: u  reason: collision with root package name */
    public Buffer f10424u;

    /* renamed from: w  reason: collision with root package name */
    public float[] f10425w;
    public boolean y;

    public c(Context context) {
        super(context);
        this.n = new int[]{-1};
        this.f10425w = new float[16];
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.vr_sprites);
        b(R.raw.reticle_vertex, R.raw.reticle_fragment);
        c("vPos", "vTex");
        e("mvpMat", "sampler");
        this.f10423t = ByteBuffer.allocateDirect(64).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{-0.03f, -0.03f, 0.0f, 1.0f, 0.03f, -0.03f, 0.25f, 1.0f, 0.03f, 0.03f, 0.25f, 0.75f, -0.03f, 0.03f, 0.0f, 0.75f}).position(0);
        this.f10424u = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asShortBuffer().put(new short[]{0, 1, 2, 0, 2, 3}).position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, this.n, 0);
        GLES20.glBindTexture(3553, this.n[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 10497.0f);
        GLES20.glTexParameterf(3553, 10243, 10497.0f);
        GLUtils.texImage2D(3553, 0, decodeResource, 0);
    }
}
