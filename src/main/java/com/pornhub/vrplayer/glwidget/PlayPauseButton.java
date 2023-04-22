package com.pornhub.vrplayer.glwidget;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.opengl.Matrix;
import com.app.pornhub.R;
import com.google.vrtoolkit.cardboard.HeadTransform;
import com.pornhub.vrplayer.VrPlayerActivity;
import hd.d;
import hd.e;

/* loaded from: classes.dex */
public class PlayPauseButton extends d {
    public final e W;
    public a X;

    /* loaded from: classes.dex */
    public enum State {
        PLAYING,
        PAUSED
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    public PlayPauseButton(Context context) {
        super(context);
        this.D = 0.12f;
        p();
        this.E = 0.12f;
        p();
        e eVar = new e(context);
        this.W = eVar;
        eVar.l(this);
        s("Play");
        r(BitmapFactory.decodeResource(context.getResources(), R.drawable.vr_sprites));
        q(0.0f, 0.0f, 0.25f, 0.25f);
    }

    @Override // hd.b
    public void j() {
        super.j();
        if (this.X != null && i()) {
            VrPlayerActivity.d dVar = (VrPlayerActivity.d) this.X;
            MediaPlayer mediaPlayer = VrPlayerActivity.this.n;
            if (mediaPlayer == null) {
                return;
            }
            if (mediaPlayer.isPlaying()) {
                VrPlayerActivity.this.n.pause();
                return;
            }
            VrPlayerActivity.this.n.start();
        }
    }

    @Override // hd.b
    public void n(HeadTransform headTransform) {
        super.n(headTransform);
        this.W.m(i());
    }

    public final void s(String str) {
        this.W.s(str);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, this.D * 0.5f, this.E * 0.5f, 0.0f);
        Matrix.translateM(fArr, 0, 0.0f, 0.08f, 0.0f);
        Matrix.scaleM(fArr, 0, 0.2f, 0.2f, 1.0f);
        e eVar = this.W;
        Matrix.translateM(fArr, 0, (-eVar.D) * 0.5f, (-eVar.E) * 0.5f, 0.0f);
        e eVar2 = this.W;
        eVar2.F = fArr;
        eVar2.k();
    }

    public void t(State state) {
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            s("Pause");
            q(0.5f, 0.0f, 0.75f, 0.25f);
        } else if (ordinal != 1) {
        } else {
            s("Play");
            q(0.0f, 0.0f, 0.25f, 0.25f);
        }
    }
}
