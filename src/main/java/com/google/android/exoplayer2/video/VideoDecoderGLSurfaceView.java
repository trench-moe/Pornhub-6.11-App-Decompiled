package com.google.android.exoplayer2.video;

import a0.b;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import l8.h;
import l8.i;

/* loaded from: classes.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements i {

    /* renamed from: c  reason: collision with root package name */
    public final a f6734c;

    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: c  reason: collision with root package name */
        public final GLSurfaceView f6736c;

        /* renamed from: f  reason: collision with root package name */
        public final int[] f6737f = new int[3];

        /* renamed from: j  reason: collision with root package name */
        public final int[] f6738j = new int[3];

        /* renamed from: m  reason: collision with root package name */
        public final int[] f6739m = new int[3];
        public final int[] n = new int[3];

        /* renamed from: t  reason: collision with root package name */
        public final AtomicReference<h> f6740t = new AtomicReference<>();

        /* renamed from: u  reason: collision with root package name */
        public int f6741u;

        /* renamed from: w  reason: collision with root package name */
        public int f6742w;
        public h y;

        /* renamed from: z  reason: collision with root package name */
        public static final float[] f6735z = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        public static final String[] A = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer B = b.n(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        public a(GLSurfaceView gLSurfaceView) {
            this.f6736c = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f6739m;
                this.n[i10] = -1;
                iArr[i10] = -1;
            }
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(javax.microedition.khronos.opengles.GL10 r8) {
            /*
                r7 = this;
                r4 = r7
                java.util.concurrent.atomic.AtomicReference<l8.h> r8 = r4.f6740t
                java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                r0 = 0
                r6 = 7
                java.lang.Object r8 = r8.getAndSet(r0)
                l8.h r8 = (l8.h) r8
                r6 = 4
                if (r8 != 0) goto L17
                r6 = 4
                l8.h r1 = r4.y
                if (r1 != 0) goto L17
                r6 = 2
                return
            L17:
                r6 = 2
                if (r8 == 0) goto L27
                l8.h r1 = r4.y
                r6 = 2
                if (r1 == 0) goto L24
                java.util.Objects.requireNonNull(r1)
                throw r0
                r6 = 7
            L24:
                r4.y = r8
                r6 = 2
            L27:
                r6 = 3
                l8.h r8 = r4.y
                r6 = 1
                java.util.Objects.requireNonNull(r8)
                float[] r8 = com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.a.f6735z
                int r1 = r4.f6742w
                r6 = 2
                r6 = 1
                r2 = r6
                r6 = 0
                r3 = r6
                android.opengl.GLES20.glUniformMatrix3fv(r1, r2, r3, r8, r3)
                r6 = 6
                java.util.Objects.requireNonNull(r0)
                throw r0
                r6 = 4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView.a.onDrawFrame(javax.microedition.khronos.opengles.GL10):void");
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int m10 = b.m("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f6741u = m10;
            GLES20.glUseProgram(m10);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f6741u, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) B);
            this.f6738j[0] = GLES20.glGetAttribLocation(this.f6741u, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f6738j[0]);
            this.f6738j[1] = GLES20.glGetAttribLocation(this.f6741u, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f6738j[1]);
            this.f6738j[2] = GLES20.glGetAttribLocation(this.f6741u, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f6738j[2]);
            b.k();
            this.f6742w = GLES20.glGetUniformLocation(this.f6741u, "mColorConversion");
            b.k();
            GLES20.glGenTextures(3, this.f6737f, 0);
            for (int i10 = 0; i10 < 3; i10++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f6741u, A[i10]), i10);
                GLES20.glActiveTexture(33984 + i10);
                GLES20.glBindTexture(3553, this.f6737f[i10]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            b.k();
            b.k();
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f6734c = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public i getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(h hVar) {
        a aVar = this.f6734c;
        if (aVar.f6740t.getAndSet(hVar) != null) {
            throw null;
        }
        aVar.f6736c.requestRender();
    }
}
