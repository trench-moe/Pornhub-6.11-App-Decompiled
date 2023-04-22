package com.pornhub.vrplayer.glwidget;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.opengl.Matrix;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.pornhub.vrplayer.VrPlayerActivity;
import hd.d;
import hd.e;
import hd.f;

/* loaded from: classes.dex */
public class b extends d {
    public final e W;
    public a X;

    /* loaded from: classes.dex */
    public interface a {
    }

    public b(Context context) {
        super(context);
        this.D = 0.12f;
        o();
        this.E = 0.12f;
        o();
        e eVar = new e(context);
        this.W = eVar;
        eVar.l(this);
        eVar.s("Recenter View");
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        Matrix.translateM(fArr, 0, 0.0f, 0.08f, 0.0f);
        Matrix.scaleM(fArr, 0, 0.2f, 0.2f, 1.0f);
        Matrix.translateM(fArr, 0, (-eVar.D) * 0.5f, (-eVar.E) * 0.5f, 0.0f);
        eVar.F = fArr;
        r(BitmapFactory.decodeResource(context.getResources(), R.drawable.vr_sprites));
        q(0.5f, 0.5f, 0.75f, 0.25f);
    }

    @Override // hd.b
    public void j() {
        super.j();
        if (this.X == null || !i()) {
            return;
        }
        VrPlayerActivity.f fVar = (VrPlayerActivity.f) this.X;
        VrPlayerActivity.this.f8425m.resetHeadTracker();
        VrPlayerActivity.this.f8427u.m(false);
        VrPlayerActivity vrPlayerActivity = VrPlayerActivity.this;
        vrPlayerActivity.f8428w.y = false;
        f fVar2 = vrPlayerActivity.f8426t;
        synchronized (fVar2) {
            fVar2.F = true;
        }
    }

    @Override // hd.b
    public void n(HeadTransform headTransform) {
        super.n(headTransform);
        this.W.m(i());
    }
}
