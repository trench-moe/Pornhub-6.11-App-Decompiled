package m8;

import java.nio.FloatBuffer;
import m8.d;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f12973j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f12974k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12975l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f12976m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f12977o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p  reason: collision with root package name */
    public static final float[] f12978p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f12979a;

    /* renamed from: b  reason: collision with root package name */
    public a f12980b;

    /* renamed from: c  reason: collision with root package name */
    public a f12981c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f12982e;

    /* renamed from: f  reason: collision with root package name */
    public int f12983f;

    /* renamed from: g  reason: collision with root package name */
    public int f12984g;

    /* renamed from: h  reason: collision with root package name */
    public int f12985h;

    /* renamed from: i  reason: collision with root package name */
    public int f12986i;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12987a;

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f12988b;

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f12989c;
        public final int d;

        public a(d.b bVar) {
            float[] fArr = bVar.f12972c;
            this.f12987a = fArr.length / 3;
            this.f12988b = a0.b.n(fArr);
            this.f12989c = a0.b.n(bVar.d);
            int i10 = bVar.f12971b;
            if (i10 == 1) {
                this.d = 5;
            } else if (i10 != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean a(d dVar) {
        d.a aVar = dVar.f12966a;
        d.a aVar2 = dVar.f12967b;
        d.b[] bVarArr = aVar.f12969a;
        if (bVarArr.length == 1 && bVarArr[0].f12970a == 0) {
            d.b[] bVarArr2 = aVar2.f12969a;
            if (bVarArr2.length == 1 && bVarArr2[0].f12970a == 0) {
                return true;
            }
        }
        return false;
    }
}
