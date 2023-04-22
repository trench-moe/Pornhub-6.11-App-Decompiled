package com.google.vrtoolkit.cardboard;

import a1.a;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public class DistortionRenderer {
    public static final String FRAGMENT_SHADER = "#ifdef GL_ES\n#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\n#endif\nvarying vec2 vTextureCoord;\nvarying float vVignette;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = vVignette * texture2D(uTextureSampler, vTextureCoord);\n}\n";
    public static final String FRAGMENT_SHADER_ABERRATION = "#ifdef GL_ES\n#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\n#endif\nvarying vec2 vRedTextureCoord;\nvarying vec2 vBlueTextureCoord;\nvarying vec2 vGreenTextureCoord;\nvarying float vVignette;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = vVignette * vec4(texture2D(uTextureSampler, vRedTextureCoord).r,\n          texture2D(uTextureSampler, vGreenTextureCoord).g,\n          texture2D(uTextureSampler, vBlueTextureCoord).b, 1.0);\n}\n";
    private static final String TAG = "DistortionRenderer";
    private static final int TEXTURE_FORMAT = 6407;
    private static final int TEXTURE_TYPE = 5121;
    public static final String VERTEX_SHADER = "attribute vec2 aPosition;\nattribute float aVignette;\nattribute vec2 aBlueTextureCoord;\nvarying vec2 vTextureCoord;\nvarying float vVignette;\nuniform float uTextureCoordScale;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vTextureCoord = aBlueTextureCoord.xy * uTextureCoordScale;\n  vVignette = aVignette;\n}\n";
    public static final String VERTEX_SHADER_ABERRATION = "attribute vec2 aPosition;\nattribute float aVignette;\nattribute vec2 aRedTextureCoord;\nattribute vec2 aGreenTextureCoord;\nattribute vec2 aBlueTextureCoord;\nvarying vec2 vRedTextureCoord;\nvarying vec2 vBlueTextureCoord;\nvarying vec2 vGreenTextureCoord;\nvarying float vVignette;\nuniform float uTextureCoordScale;\nvoid main() {\n  gl_Position = vec4(aPosition, 0.0, 1.0);\n  vRedTextureCoord = aRedTextureCoord.xy * uTextureCoordScale;\n  vGreenTextureCoord = aGreenTextureCoord.xy * uTextureCoordScale;\n  vBlueTextureCoord = aBlueTextureCoord.xy * uTextureCoordScale;\n  vVignette = aVignette;\n}\n";
    private boolean chromaticAberrationCorrectionEnabled;
    private boolean drawingFrame;
    private boolean fovsChanged;
    private HeadMountedDisplay hmd;
    private DistortionMesh leftEyeDistortionMesh;
    private EyeViewport leftEyeViewport;
    private float metersPerTanAngle;
    private ProgramHolder programHolder;
    private ProgramHolderAberration programHolderAberration;
    private boolean restoreGLStateEnabled;
    private DistortionMesh rightEyeDistortionMesh;
    private EyeViewport rightEyeViewport;
    private boolean viewportsChanged;
    private boolean vignetteEnabled;
    private float xPxPerTanAngle;
    private float yPxPerTanAngle;
    private int textureId = -1;
    private int renderbufferId = -1;
    private int framebufferId = -1;
    private IntBuffer originalFramebufferId = IntBuffer.allocate(1);
    private float resolutionScale = 1.0f;
    private GLStateBackup gLStateBackup = new GLStateBackup();
    private GLStateBackup gLStateBackupAberration = new GLStateBackup();

    /* loaded from: classes.dex */
    public class DistortionMesh {
        public static final int BYTES_PER_FLOAT = 4;
        public static final int BYTES_PER_SHORT = 2;
        public static final int COLS = 40;
        public static final int COMPONENTS_PER_VERT = 9;
        public static final int DATA_BUV_OFFSET = 7;
        public static final int DATA_GUV_OFFSET = 5;
        public static final int DATA_POS_COMPONENTS = 2;
        public static final int DATA_POS_OFFSET = 0;
        public static final int DATA_RUV_OFFSET = 3;
        public static final int DATA_STRIDE_BYTES = 36;
        public static final int DATA_UV_COMPONENTS = 2;
        public static final int DATA_VIGNETTE_COMPONENTS = 1;
        public static final int DATA_VIGNETTE_OFFSET = 2;
        public static final int ROWS = 40;
        public static final float VIGNETTE_SIZE_TAN_ANGLE = 0.05f;
        public int arrayBufferId;
        public int elementBufferId;
        public int nIndices;

        public DistortionMesh(Distortion distortion, Distortion distortion2, Distortion distortion3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, boolean z10) {
            float f22;
            float f23;
            this.arrayBufferId = -1;
            this.elementBufferId = -1;
            float[] fArr = new float[14400];
            int i10 = 0;
            short s10 = 0;
            while (true) {
                if (i10 >= 40) {
                    break;
                }
                int i11 = 0;
                for (int i12 = 40; i11 < i12; i12 = 40) {
                    float f24 = (f18 / f14) + ((f20 / f14) * (i11 / 39.0f));
                    float f25 = (f19 / f15) + ((f21 / f15) * (i10 / 39.0f));
                    float f26 = (f24 * f14) - f16;
                    float f27 = (f25 * f15) - f17;
                    float sqrt = (float) Math.sqrt((f27 * f27) + (f26 * f26));
                    float distortInverse = sqrt > 0.0f ? distortion3.distortInverse(sqrt) / sqrt : 1.0f;
                    float f28 = f26 * distortInverse;
                    float f29 = f27 * distortInverse;
                    float f30 = (f28 + f12) / f10;
                    float f31 = (f29 + f13) / f11;
                    float f32 = sqrt * distortInverse;
                    int i13 = (f32 > 0.0f ? 1 : (f32 == 0.0f ? 0 : -1));
                    float distortionFactor = i13 > 0 ? distortion2.distortionFactor(f32) : 1.0f;
                    float f33 = ((f28 * distortionFactor) + f16) / f14;
                    float f34 = ((distortionFactor * f29) + f17) / f15;
                    float distortionFactor2 = i13 > 0 ? distortion.distortionFactor(f32) : 1.0f;
                    float f35 = ((f28 * distortionFactor2) + f16) / f14;
                    float f36 = ((f29 * distortionFactor2) + f17) / f15;
                    float f37 = 0.05f / distortInverse;
                    float f38 = f26 + f16;
                    float clamp = f38 - DistortionRenderer.clamp(f38, f18 + f37, (f18 + f20) - f37);
                    float f39 = f27 + f17;
                    float clamp2 = f39 - DistortionRenderer.clamp(f39, f19 + f37, (f19 + f21) - f37);
                    float sqrt2 = (float) Math.sqrt((clamp2 * clamp2) + (clamp * clamp));
                    if (DistortionRenderer.this.vignetteEnabled) {
                        float f40 = sqrt2 / f37;
                        f22 = 1.0f;
                        f23 = 1.0f - DistortionRenderer.clamp(f40, 0.0f, 1.0f);
                    } else {
                        f22 = 1.0f;
                        f23 = 1.0f;
                    }
                    if (z10) {
                        f24 = f22 - f24;
                        f35 = f22 - f35;
                        f33 = f22 - f33;
                        f25 = f22 - f25;
                        f36 = f22 - f36;
                        f34 = f22 - f34;
                    }
                    fArr[s10 + 0] = (f30 * 2.0f) - f22;
                    fArr[s10 + 1] = (f31 * 2.0f) - f22;
                    fArr[s10 + 2] = f23;
                    fArr[s10 + 3] = f35;
                    fArr[s10 + 4] = f36;
                    fArr[s10 + 5] = f33;
                    fArr[s10 + 6] = f34;
                    fArr[s10 + 7] = f24;
                    fArr[s10 + 8] = f25;
                    s10 = (short) (s10 + 9);
                    i11++;
                }
                i10++;
            }
            this.nIndices = 3158;
            short[] sArr = new short[3158];
            short s11 = 0;
            short s12 = 0;
            for (int i14 = 0; i14 < 39; i14++) {
                if (i14 > 0) {
                    sArr[s11] = sArr[s11 - 1];
                    s11 = (short) (s11 + 1);
                }
                for (int i15 = 0; i15 < 40; i15++) {
                    if (i15 > 0) {
                        s12 = (short) (i14 % 2 == 0 ? s12 + 1 : s12 - 1);
                    }
                    short s13 = (short) (s11 + 1);
                    sArr[s11] = s12;
                    s11 = (short) (s13 + 1);
                    sArr[s13] = (short) (s12 + 40);
                }
                s12 = (short) (s12 + 40);
            }
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(57600).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(fArr).position(0);
            int i16 = 3158 * 2;
            ShortBuffer asShortBuffer = ByteBuffer.allocateDirect(i16).order(ByteOrder.nativeOrder()).asShortBuffer();
            asShortBuffer.put(sArr).position(0);
            int[] iArr = new int[2];
            GLES20.glGenBuffers(2, iArr, 0);
            int i17 = iArr[0];
            this.arrayBufferId = i17;
            this.elementBufferId = iArr[1];
            GLES20.glBindBuffer(34962, i17);
            GLES20.glBufferData(34962, 57600, asFloatBuffer, 35044);
            GLES20.glBindBuffer(34963, this.elementBufferId);
            GLES20.glBufferData(34963, i16, asShortBuffer, 35044);
            GLES20.glBindBuffer(34962, 0);
            GLES20.glBindBuffer(34963, 0);
        }
    }

    /* loaded from: classes.dex */
    public class EyeViewport {
        public float eyeX;
        public float eyeY;
        public float height;
        public float width;

        /* renamed from: x  reason: collision with root package name */
        public float f8107x;
        public float y;

        private EyeViewport() {
        }

        public String toString() {
            StringBuilder m10 = a.m("{\n");
            float f10 = this.f8107x;
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("  x: ");
            sb2.append(f10);
            sb2.append(",\n");
            m10.append(sb2.toString());
            float f11 = this.y;
            StringBuilder sb3 = new StringBuilder(22);
            sb3.append("  y: ");
            sb3.append(f11);
            sb3.append(",\n");
            m10.append(sb3.toString());
            float f12 = this.width;
            StringBuilder sb4 = new StringBuilder(26);
            sb4.append("  width: ");
            sb4.append(f12);
            sb4.append(",\n");
            m10.append(sb4.toString());
            float f13 = this.height;
            StringBuilder sb5 = new StringBuilder(27);
            sb5.append("  height: ");
            sb5.append(f13);
            sb5.append(",\n");
            m10.append(sb5.toString());
            float f14 = this.eyeX;
            StringBuilder sb6 = new StringBuilder(25);
            sb6.append("  eyeX: ");
            sb6.append(f14);
            sb6.append(",\n");
            m10.append(sb6.toString());
            float f15 = this.eyeY;
            StringBuilder sb7 = new StringBuilder(25);
            sb7.append("  eyeY: ");
            sb7.append(f15);
            sb7.append(",\n");
            m10.append(sb7.toString());
            m10.append("}");
            return m10.toString();
        }
    }

    /* loaded from: classes.dex */
    public class ProgramHolder {
        public int aBlueTextureCoord;
        public int aPosition;
        public int aVignette;
        public int program;
        public int uTextureCoordScale;
        public int uTextureSampler;

        private ProgramHolder() {
        }
    }

    /* loaded from: classes.dex */
    public class ProgramHolderAberration extends ProgramHolder {
        public int aGreenTextureCoord;
        public int aRedTextureCoord;

        private ProgramHolderAberration() {
            super();
        }
    }

    private void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(a0.a.e(str, 21));
        sb2.append(str);
        sb2.append(": glError ");
        sb2.append(glGetError);
        Log.e(TAG, sb2.toString());
        StringBuilder sb3 = new StringBuilder(a0.a.e(str, 21));
        sb3.append(str);
        sb3.append(": glError ");
        sb3.append(glGetError);
        throw new RuntimeException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float clamp(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    private void clearGlError() {
        do {
        } while (GLES20.glGetError() != 0);
    }

    private DistortionMesh createDistortionMesh(EyeViewport eyeViewport, float f10, float f11, float f12, float f13, boolean z10) {
        return new DistortionMesh(this.hmd.getCardboardDeviceParams().getDistortion(), this.hmd.getCardboardDeviceParams().getDistortion(), this.hmd.getCardboardDeviceParams().getDistortion(), this.hmd.getScreenParams().getWidthMeters() / this.metersPerTanAngle, this.hmd.getScreenParams().getHeightMeters() / this.metersPerTanAngle, f12, f13, f10, f11, eyeViewport.eyeX, eyeViewport.eyeY, eyeViewport.f8107x, eyeViewport.y, eyeViewport.width, eyeViewport.height, z10);
    }

    private int createProgram(String str, String str2) {
        int loadShader;
        int loadShader2 = loadShader(35633, str);
        if (loadShader2 != 0 && (loadShader = loadShader(35632, str2)) != 0) {
            int glCreateProgram = GLES20.glCreateProgram();
            if (glCreateProgram != 0) {
                clearGlError();
                GLES20.glAttachShader(glCreateProgram, loadShader2);
                checkGlError("glAttachShader");
                GLES20.glAttachShader(glCreateProgram, loadShader);
                checkGlError("glAttachShader");
                GLES20.glLinkProgram(glCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    Log.e(TAG, "Could not link program: ");
                    Log.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
                    GLES20.glDeleteProgram(glCreateProgram);
                    return 0;
                }
            }
            return glCreateProgram;
        }
        return 0;
    }

    private ProgramHolder createProgramHolder() {
        return createProgramHolder(false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private com.google.vrtoolkit.cardboard.DistortionRenderer.ProgramHolder createProgramHolder(boolean r8) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.vrtoolkit.cardboard.DistortionRenderer.createProgramHolder(boolean):com.google.vrtoolkit.cardboard.DistortionRenderer$ProgramHolder");
    }

    private int createTexture(int i10, int i11, int i12, int i13) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, i12, i13, null);
        return iArr[0];
    }

    private EyeViewport initViewportForEye(FieldOfView fieldOfView, float f10) {
        float tan = (float) Math.tan(Math.toRadians(fieldOfView.getLeft()));
        float tan2 = (float) Math.tan(Math.toRadians(fieldOfView.getBottom()));
        float tan3 = (float) Math.tan(Math.toRadians(fieldOfView.getTop()));
        EyeViewport eyeViewport = new EyeViewport();
        eyeViewport.f8107x = f10;
        eyeViewport.y = 0.0f;
        eyeViewport.width = ((float) Math.tan(Math.toRadians(fieldOfView.getRight()))) + tan;
        eyeViewport.height = tan3 + tan2;
        eyeViewport.eyeX = tan + f10;
        eyeViewport.eyeY = tan2;
        return eyeViewport;
    }

    private int loadShader(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Could not compile shader ");
                sb2.append(i10);
                sb2.append(":");
                Log.e(TAG, sb2.toString());
                Log.e(TAG, GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                return 0;
            }
            return glCreateShader;
        }
        return glCreateShader;
    }

    private void renderDistortionMesh(DistortionMesh distortionMesh, int i10) {
        ProgramHolder programHolder = this.chromaticAberrationCorrectionEnabled ? this.programHolderAberration : this.programHolder;
        GLES20.glBindBuffer(34962, distortionMesh.arrayBufferId);
        GLES20.glVertexAttribPointer(programHolder.aPosition, 2, 5126, false, 36, 0);
        GLES20.glEnableVertexAttribArray(programHolder.aPosition);
        GLES20.glVertexAttribPointer(programHolder.aVignette, 1, 5126, false, 36, 8);
        GLES20.glEnableVertexAttribArray(programHolder.aVignette);
        GLES20.glVertexAttribPointer(programHolder.aBlueTextureCoord, 2, 5126, false, 36, 28);
        GLES20.glEnableVertexAttribArray(programHolder.aBlueTextureCoord);
        if (this.chromaticAberrationCorrectionEnabled) {
            ProgramHolderAberration programHolderAberration = (ProgramHolderAberration) programHolder;
            GLES20.glVertexAttribPointer(programHolderAberration.aRedTextureCoord, 2, 5126, false, 36, 12);
            GLES20.glEnableVertexAttribArray(programHolderAberration.aRedTextureCoord);
            GLES20.glVertexAttribPointer(programHolderAberration.aGreenTextureCoord, 2, 5126, false, 36, 20);
            GLES20.glEnableVertexAttribArray(programHolderAberration.aGreenTextureCoord);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i10);
        GLES20.glUniform1i(this.programHolder.uTextureSampler, 0);
        GLES20.glUniform1f(this.programHolder.uTextureCoordScale, this.resolutionScale);
        GLES20.glBindBuffer(34963, distortionMesh.elementBufferId);
        GLES20.glDrawElements(5, distortionMesh.nIndices, 5123, 0);
    }

    private int setupRenderTextureAndRenderbuffer() {
        EyeViewport eyeViewport = this.leftEyeViewport;
        float f10 = eyeViewport.width;
        EyeViewport eyeViewport2 = this.rightEyeViewport;
        float max = Math.max(eyeViewport.height, eyeViewport2.height);
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        return setupRenderTextureAndRenderbuffer(Math.min(Math.round((f10 + eyeViewport2.width) * this.xPxPerTanAngle), iArr[0]), Math.min(Math.round(max * this.yPxPerTanAngle), iArr[0]));
    }

    private int setupRenderTextureAndRenderbuffer(int i10, int i11) {
        int i12 = this.textureId;
        if (i12 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i12}, 0);
        }
        int i13 = this.renderbufferId;
        if (i13 != -1) {
            GLES20.glDeleteRenderbuffers(1, new int[]{i13}, 0);
        }
        int i14 = this.framebufferId;
        if (i14 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i14}, 0);
        }
        clearGlError();
        this.textureId = createTexture(i10, i11, TEXTURE_FORMAT, TEXTURE_TYPE);
        checkGlError("setupRenderTextureAndRenderbuffer: create texture");
        int[] iArr = new int[1];
        GLES20.glGenRenderbuffers(1, iArr, 0);
        GLES20.glBindRenderbuffer(36161, iArr[0]);
        GLES20.glRenderbufferStorage(36161, 33189, i10, i11);
        this.renderbufferId = iArr[0];
        checkGlError("setupRenderTextureAndRenderbuffer: create renderbuffer");
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        this.framebufferId = iArr2[0];
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.textureId, 0);
        GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, iArr[0]);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus != 36053) {
            String valueOf = String.valueOf(Integer.toHexString(glCheckFramebufferStatus));
            throw new RuntimeException(valueOf.length() != 0 ? "Framebuffer is not complete: ".concat(valueOf) : new String("Framebuffer is not complete: "));
        }
        GLES20.glBindFramebuffer(36160, 0);
        return iArr2[0];
    }

    private void updateDistortionMesh(boolean z10) {
        ScreenParams screenParams = this.hmd.getScreenParams();
        CardboardDeviceParams cardboardDeviceParams = this.hmd.getCardboardDeviceParams();
        if (this.programHolder == null) {
            this.programHolder = createProgramHolder();
        }
        if (this.programHolderAberration == null) {
            this.programHolderAberration = (ProgramHolderAberration) createProgramHolder(true);
        }
        EyeViewport eyeViewport = this.leftEyeViewport;
        float f10 = eyeViewport.width;
        EyeViewport eyeViewport2 = this.rightEyeViewport;
        float f11 = f10 + eyeViewport2.width;
        float max = Math.max(eyeViewport.height, eyeViewport2.height);
        float widthMeters = ((screenParams.getWidthMeters() / 2.0f) - (cardboardDeviceParams.getInterLensDistance() / 2.0f)) / this.metersPerTanAngle;
        float yEyeOffsetMeters = cardboardDeviceParams.getYEyeOffsetMeters(screenParams) / this.metersPerTanAngle;
        this.leftEyeDistortionMesh = createDistortionMesh(this.leftEyeViewport, f11, max, widthMeters, yEyeOffsetMeters, z10);
        this.rightEyeDistortionMesh = createDistortionMesh(this.rightEyeViewport, f11, max, (screenParams.getWidthMeters() / this.metersPerTanAngle) - widthMeters, yEyeOffsetMeters, z10);
    }

    public void afterDrawFrame() {
        GLES20.glBindFramebuffer(36160, this.originalFramebufferId.array()[0]);
        undistortTexture(this.textureId);
        this.drawingFrame = false;
    }

    public void beforeDrawFrame() {
        this.drawingFrame = true;
        if (this.fovsChanged) {
            updateDistortionMesh(false);
            setupRenderTextureAndRenderbuffer();
            this.fovsChanged = false;
        }
        GLES20.glGetIntegerv(36006, this.originalFramebufferId);
        GLES20.glBindFramebuffer(36160, this.framebufferId);
    }

    public boolean haveViewportsChanged() {
        return this.viewportsChanged;
    }

    public void onFovChanged(HeadMountedDisplay headMountedDisplay, FieldOfView fieldOfView, FieldOfView fieldOfView2, float f10) {
        if (this.drawingFrame) {
            throw new IllegalStateException("Cannot change FOV while rendering a frame.");
        }
        this.hmd = new HeadMountedDisplay(headMountedDisplay);
        EyeViewport initViewportForEye = initViewportForEye(fieldOfView, 0.0f);
        this.leftEyeViewport = initViewportForEye;
        this.rightEyeViewport = initViewportForEye(fieldOfView2, initViewportForEye.width);
        this.metersPerTanAngle = f10;
        ScreenParams screenParams = headMountedDisplay.getScreenParams();
        this.xPxPerTanAngle = screenParams.getWidth() / (screenParams.getWidthMeters() / this.metersPerTanAngle);
        this.yPxPerTanAngle = screenParams.getHeight() / (screenParams.getHeightMeters() / this.metersPerTanAngle);
        this.fovsChanged = true;
        this.viewportsChanged = true;
    }

    public void setChromaticAberrationCorrectionEnabled(boolean z10) {
        this.chromaticAberrationCorrectionEnabled = z10;
    }

    public void setResolutionScale(float f10) {
        this.resolutionScale = f10;
        this.viewportsChanged = true;
    }

    public void setRestoreGLStateEnabled(boolean z10) {
        this.restoreGLStateEnabled = z10;
    }

    public void setVignetteEnabled(boolean z10) {
        this.vignetteEnabled = z10;
        this.fovsChanged = true;
    }

    public void undistortTexture(int i10) {
        if (this.restoreGLStateEnabled) {
            if (this.chromaticAberrationCorrectionEnabled) {
                this.gLStateBackupAberration.readFromGL();
            } else {
                this.gLStateBackup.readFromGL();
            }
        }
        if (this.fovsChanged) {
            updateDistortionMesh(false);
            this.fovsChanged = false;
        }
        GLES20.glViewport(0, 0, this.hmd.getScreenParams().getWidth(), this.hmd.getScreenParams().getHeight());
        GLES20.glDisable(3089);
        GLES20.glDisable(2884);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        if (this.chromaticAberrationCorrectionEnabled) {
            GLES20.glUseProgram(this.programHolderAberration.program);
        } else {
            GLES20.glUseProgram(this.programHolder.program);
        }
        GLES20.glEnable(3089);
        GLES20.glScissor(0, 0, this.hmd.getScreenParams().getWidth() / 2, this.hmd.getScreenParams().getHeight());
        renderDistortionMesh(this.leftEyeDistortionMesh, i10);
        GLES20.glScissor(this.hmd.getScreenParams().getWidth() / 2, 0, this.hmd.getScreenParams().getWidth() / 2, this.hmd.getScreenParams().getHeight());
        renderDistortionMesh(this.rightEyeDistortionMesh, i10);
        if (this.restoreGLStateEnabled) {
            if (this.chromaticAberrationCorrectionEnabled) {
                this.gLStateBackupAberration.writeToGL();
                return;
            } else {
                this.gLStateBackup.writeToGL();
                return;
            }
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindBuffer(34962, 0);
        GLES20.glBindBuffer(34963, 0);
        GLES20.glDisable(3089);
    }

    public void updateViewports(Viewport viewport, Viewport viewport2) {
        viewport.setViewport(Math.round(this.leftEyeViewport.f8107x * this.xPxPerTanAngle * this.resolutionScale), Math.round(this.leftEyeViewport.y * this.yPxPerTanAngle * this.resolutionScale), Math.round(this.leftEyeViewport.width * this.xPxPerTanAngle * this.resolutionScale), Math.round(this.leftEyeViewport.height * this.yPxPerTanAngle * this.resolutionScale));
        viewport2.setViewport(Math.round(this.rightEyeViewport.f8107x * this.xPxPerTanAngle * this.resolutionScale), Math.round(this.rightEyeViewport.y * this.yPxPerTanAngle * this.resolutionScale), Math.round(this.rightEyeViewport.width * this.xPxPerTanAngle * this.resolutionScale), Math.round(this.rightEyeViewport.height * this.yPxPerTanAngle * this.resolutionScale));
        this.viewportsChanged = false;
    }
}
