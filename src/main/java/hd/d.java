package hd;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.Eye;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class d extends b {
    public float[] Q;
    public int[] R;
    public Buffer S;
    public Buffer T;
    public Buffer U;
    public float V;

    public d(Context context) {
        super(context);
        this.R = new int[]{-1};
        this.Q = l9.e.f(context, R.color.default_widget_background);
        o();
        b(R.raw.widget_vertex, R.raw.widget_fragment);
        c("vPos", "vTex");
        e("eye", "mvpMat", "color", "sampler", "uOffset");
        Matrix.setIdentityM(this.F, 0);
    }

    @Override // hd.b
    public void g(Eye eye) {
        if (this.G) {
            GLES20.glUseProgram(this.f10418m);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, eye.getPerspective(0.01f, 10.0f), 0, eye.getEyeView(), 0);
            float[] fArr2 = new float[16];
            Matrix.multiplyMM(fArr2, 0, fArr, 0, this.J, 0);
            GLES20.glUniformMatrix4fv(this.f10416f.get("mvpMat").intValue(), 1, false, fArr2, 0);
            GLES20.glUniform4fv(this.f10416f.get("color").intValue(), 1, this.Q, 0);
            GLES20.glUniform1i(this.f10416f.get("sampler").intValue(), 0);
            GLES20.glUniform1f(this.f10416f.get("uOffset").intValue(), (this.O && i()) ? this.V : 0.0f);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.R[0]);
            GLES20.glEnableVertexAttribArray(this.f10417j.get("vTex").intValue());
            GLES20.glVertexAttribPointer(this.f10417j.get("vTex").intValue(), 2, 5126, false, 0, this.U);
            GLES20.glEnableVertexAttribArray(this.f10417j.get("vPos").intValue());
            GLES20.glVertexAttribPointer(this.f10417j.get("vPos").intValue(), 2, 5126, false, 0, this.S);
            GLES20.glDrawElements(4, 6, 5123, this.T);
            GLES20.glDisable(3042);
            GLES20.glDisableVertexAttribArray(this.f10417j.get("vTex").intValue());
            GLES20.glDisableVertexAttribArray(this.f10417j.get("vPos").intValue());
        }
        f(eye);
    }

    public final void o() {
        float f10 = this.D;
        float f11 = this.E;
        this.S = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.0f, 0.0f, f10, 0.0f, f10, f11, 0.0f, f11}).position(0);
        this.T = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asShortBuffer().put(new short[]{0, 1, 2, 0, 2, 3}).position(0);
    }

    public void p() {
        o();
    }

    public void q(float f10, float f11, float f12, float f13) {
        this.U = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{f10, f11, f12, f11, f12, f13, f10, f13}).position(0);
        this.V = f12 - f10;
    }

    public void r(Bitmap bitmap) {
        GLES20.glActiveTexture(33984);
        int[] iArr = this.R;
        if (iArr[0] == -1) {
            GLES20.glGenTextures(1, iArr, 0);
        }
        GLES20.glBindTexture(3553, this.R[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 10497.0f);
        GLES20.glTexParameterf(3553, 10243, 10497.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        GLES20.glUniform1i(this.f10416f.get("sampler").intValue(), 0);
    }
}
