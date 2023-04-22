package com.pornhub.vrplayer.glwidget;

import android.content.Context;
import android.opengl.Matrix;

/* loaded from: classes.dex */
public class a extends hd.b {
    public final PlayPauseButton Q;
    public final c R;
    public final b S;
    public final float[] T;

    public a(Context context) {
        super(context);
        float[] fArr = new float[16];
        this.T = fArr;
        PlayPauseButton playPauseButton = new PlayPauseButton(context);
        this.Q = playPauseButton;
        playPauseButton.l(this);
        c cVar = new c(context);
        this.R = cVar;
        cVar.l(this);
        b bVar = new b(context);
        this.S = bVar;
        bVar.l(this);
        this.D = 0.0f;
        this.E = 0.0f;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, (-playPauseButton.D) * 0.5f, (-playPauseButton.E) * 0.5f, 0.0f);
        Matrix.translateM(fArr2, 0, -0.08f, 0.0f, 0.0f);
        Matrix.translateM(fArr2, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        playPauseButton.F = fArr2;
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        Matrix.translateM(fArr3, 0, (-bVar.D) * 0.5f, (-bVar.E) * 0.5f, 0.0f);
        Matrix.translateM(fArr3, 0, 0.08f, 0.0f, 0.0f);
        Matrix.translateM(fArr3, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        bVar.F = fArr3;
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.translateM(fArr4, 0, (-cVar.D) * 0.5f, (-cVar.E) * 0.5f, 0.0f);
        Matrix.translateM(fArr4, 0, 0.0f, -0.14f, 0.0f);
        Matrix.translateM(fArr4, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        cVar.F = fArr4;
        Matrix.setIdentityM(fArr, 0);
        o();
    }

    public final void o() {
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, (-this.D) * 0.5f, (-this.E) * 0.5f, 0.0f);
        Matrix.translateM(fArr, 0, 0.0f, 0.0f, -0.8f);
        Matrix.multiplyMM(fArr2, 0, this.T, 0, fArr, 0);
        this.F = fArr2;
        k();
    }
}
