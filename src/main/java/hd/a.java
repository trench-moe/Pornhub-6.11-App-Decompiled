package hd;

import android.annotation.TargetApi;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@TargetApi(16)
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public final Context f10415c;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Integer> f10416f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Integer> f10417j = new HashMap();

    /* renamed from: m  reason: collision with root package name */
    public int f10418m;

    public a(Context context) {
        this.f10415c = context;
    }

    public void a(String str, String str2) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            StringBuilder l10 = android.support.v4.media.a.l(str2, ": glError ");
            l10.append(GLUtils.getEGLErrorString(glGetError));
            Log.e(str, l10.toString());
        }
    }

    public void b(int i10, int i11) {
        this.f10418m = GLES20.glCreateProgram();
        int d = d(35633, i10);
        int d10 = d(35632, i11);
        GLES20.glAttachShader(this.f10418m, d);
        GLES20.glAttachShader(this.f10418m, d10);
        GLES20.glLinkProgram(this.f10418m);
        GLES20.glUseProgram(this.f10418m);
        a("GlModel", "program");
    }

    public void c(String... strArr) {
        for (String str : strArr) {
            this.f10417j.put(str, Integer.valueOf(GLES20.glGetAttribLocation(this.f10418m, str)));
        }
    }

    public int d(int i10, int i11) {
        String str;
        int glCreateShader = GLES20.glCreateShader(i10);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f10415c.getResources().openRawResource(i11)));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
                sb2.append("\n");
            } catch (IOException unused) {
                str = null;
            }
        }
        bufferedReader.close();
        str = sb2.toString();
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            StringBuilder m10 = a1.a.m("Error compiling shader: ");
            m10.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e("GlModel", m10.toString());
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        if (glCreateShader != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    public void e(String... strArr) {
        for (String str : strArr) {
            this.f10416f.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.f10418m, str)));
        }
    }
}
