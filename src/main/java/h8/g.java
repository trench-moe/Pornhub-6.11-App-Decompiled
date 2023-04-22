package h8;

import com.google.android.exoplayer2.ParserException;
import java.util.regex.Pattern;
import k8.c0;
import k8.t;

/* loaded from: classes2.dex */
public final class g {
    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i10 = c0.f11939a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : c0.F(split[0], ":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void c(t tVar) {
        int i10 = tVar.f12010b;
        String g10 = tVar.g();
        if (g10 != null && g10.startsWith("WEBVTT")) {
            return;
        }
        tVar.D(i10);
        String valueOf = String.valueOf(tVar.g());
        throw ParserException.a(valueOf.length() != 0 ? "Expected WEBVTT. Got ".concat(valueOf) : new String("Expected WEBVTT. Got "), null);
    }
}
