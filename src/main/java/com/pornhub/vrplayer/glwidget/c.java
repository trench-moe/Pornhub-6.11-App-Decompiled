package com.pornhub.vrplayer.glwidget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.Eye;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.pornhub.vrplayer.VrPlayerActivity;
import hd.e;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class c extends hd.b {
    public final int[] Q;
    public final float[] R;
    public final float[] S;
    public final float[] T;
    public final float[] U;
    public final e V;
    public Buffer W;
    public Buffer X;
    public Buffer Y;
    public Buffer Z;

    /* renamed from: a0  reason: collision with root package name */
    public Buffer f8450a0;

    /* renamed from: b0  reason: collision with root package name */
    public Buffer f8451b0;

    /* renamed from: c0  reason: collision with root package name */
    public a f8452c0;

    /* loaded from: classes.dex */
    public interface a {
    }

    public c(Context context) {
        super(context);
        int[] iArr = new int[1];
        this.Q = iArr;
        this.R = l9.e.f(context, R.color.default_widget_background);
        this.S = l9.e.f(context, R.color.seekbar);
        this.T = l9.e.f(context, R.color.buffering_bar);
        this.U = l9.e.f(context, R.color.transparent);
        this.D = 0.6f;
        this.E = 0.08f;
        e eVar = new e(context);
        this.V = eVar;
        eVar.l(this);
        eVar.s("Click to Seek");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        Matrix.translateM(fArr, 0, 0.0f, -0.06f, 0.0f);
        Matrix.scaleM(fArr, 0, 0.2f, 0.2f, 1.0f);
        Matrix.translateM(fArr, 0, (-eVar.D) * 0.5f, (-eVar.E) * 0.5f, 0.0f);
        eVar.F = fArr;
        b(R.raw.widget_vertex, R.raw.widget_fragment);
        c("vPos", "vTex");
        e("eye", "mvpMat", "color", "sampler", "uOffset");
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.vr_sprites);
        this.f8451b0 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.0f, 0.5f, 0.25f, 0.5f, 0.25f, 0.25f, 0.0f, 0.25f}).position(0);
        GLES20.glActiveTexture(33984);
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 10497.0f);
        GLES20.glTexParameterf(3553, 10243, 10497.0f);
        GLUtils.texImage2D(3553, 0, decodeResource, 0);
        float f10 = this.E;
        float f11 = (f10 - 0.008f) * 0.5f;
        float f12 = this.D;
        float[] fArr2 = {0.0f, 0.0f, f12, 0.0f, f12, f10, 0.0f, f10};
        float f13 = f12 - 0.03f;
        float f14 = f11 + 0.008f;
        this.X = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr2).position(0);
        this.Y = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.03f, f11, f13, f11, f13, f14, 0.03f, f14}).position(0);
        this.W = ByteBuffer.allocateDirect(24).order(ByteOrder.nativeOrder()).asShortBuffer().put(new short[]{0, 1, 2, 0, 2, 3}).position(0);
        p(0.0f);
        o(0.0f);
    }

    @Override // hd.b
    public void g(Eye eye) {
        f(eye);
        if (this.G) {
            GLES20.glUseProgram(this.f10418m);
            float[] fArr = new float[16];
            Matrix.multiplyMM(fArr, 0, eye.getPerspective(0.01f, 10.0f), 0, eye.getEyeView(), 0);
            float[] fArr2 = new float[16];
            Matrix.multiplyMM(fArr2, 0, fArr, 0, this.J, 0);
            GLES20.glUniformMatrix4fv(this.f10416f.get("mvpMat").intValue(), 1, false, fArr2, 0);
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(770, 771);
            GLES20.glDepthFunc(519);
            GLES20.glEnableVertexAttribArray(this.f10417j.get("vPos").intValue());
            GLES20.glUniform4fv(this.f10416f.get("color").intValue(), 1, this.R, 0);
            GLES20.glVertexAttribPointer(this.f10417j.get("vPos").intValue(), 2, 5126, false, 0, this.X);
            GLES20.glDrawElements(4, 6, 5123, this.W);
            GLES20.glUniform4fv(this.f10416f.get("color").intValue(), 1, this.S, 0);
            GLES20.glVertexAttribPointer(this.f10417j.get("vPos").intValue(), 2, 5126, false, 0, this.Y);
            GLES20.glDrawElements(4, 6, 5123, this.W);
            synchronized (this) {
                GLES20.glVertexAttribPointer(this.f10417j.get("vPos").intValue(), 2, 5126, false, 0, this.Z);
                GLES20.glUniform4fv(this.f10416f.get("color").intValue(), 1, this.T, 0);
                GLES20.glDrawElements(4, 6, 5123, this.W);
                GLES20.glEnableVertexAttribArray(this.f10417j.get("vTex").intValue());
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.Q[0]);
                GLES20.glUniform1i(this.f10416f.get("sampler").intValue(), 0);
                GLES20.glUniform1f(this.f10416f.get("uOffset").intValue(), i() ? 0.25f : 0.0f);
                GLES20.glUniform4fv(this.f10416f.get("color").intValue(), 1, this.U, 0);
                GLES20.glVertexAttribPointer(this.f10417j.get("vPos").intValue(), 2, 5126, false, 0, this.f8450a0);
                GLES20.glVertexAttribPointer(this.f10417j.get("vTex").intValue(), 2, 5126, false, 0, this.f8451b0);
                GLES20.glDrawElements(4, 6, 5123, this.W);
            }
            GLES20.glDepthFunc(513);
            GLES20.glDisable(3042);
            GLES20.glDisableVertexAttribArray(this.f10417j.get("vTex").intValue());
            GLES20.glDisableVertexAttribArray(this.f10417j.get("vPos").intValue());
        }
    }

    @Override // hd.b
    public void j() {
        super.j();
        if (this.f8452c0 == null || !i()) {
            return;
        }
        float f10 = this.M / this.D;
        VrPlayerActivity.e eVar = (VrPlayerActivity.e) this.f8452c0;
        if (VrPlayerActivity.this.n == null) {
            return;
        }
        Log.d("VrPlayerActivity", String.format("Seeking to %.2f", Float.valueOf(f10)));
        VrPlayerActivity.this.n.seekTo((int) (VrPlayerActivity.this.n.getDuration() * f10));
    }

    @Override // hd.b
    public void n(HeadTransform headTransform) {
        super.n(headTransform);
        this.V.m(i());
    }

    public void o(float f10) {
        float f11 = (this.E - 0.008f) * 0.5f;
        float b10 = a0.a.b(this.D, 0.06f, f10, 0.03f);
        float f12 = f11 + 0.008f;
        float[] fArr = {0.03f, f11, b10, f11, b10, f12, 0.03f, f12};
        synchronized (this) {
            this.Z = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
        }
    }

    public void p(float f10) {
        float f11 = (this.E - 0.06f) * 0.5f;
        float b10 = a0.a.b(this.D, 0.06f, f10, 0.0f);
        float f12 = b10 + 0.06f;
        float f13 = f11 + 0.06f;
        float[] fArr = {b10, f11, f12, f11, f12, f13, b10, f13};
        synchronized (this) {
            this.f8450a0 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).position(0);
        }
    }
}
