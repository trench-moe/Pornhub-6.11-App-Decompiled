package d8;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.Log;
import com.google.common.primitives.Ints;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.c0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f8833a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8834b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f8835c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8836e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f8837f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8838g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8839h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8840a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8841b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8842c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f8843e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8844f;

        /* renamed from: g  reason: collision with root package name */
        public final int f8845g;

        /* renamed from: h  reason: collision with root package name */
        public final int f8846h;

        /* renamed from: i  reason: collision with root package name */
        public final int f8847i;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            this.f8840a = i10;
            this.f8841b = i11;
            this.f8842c = i12;
            this.d = i13;
            this.f8843e = i14;
            this.f8844f = i15;
            this.f8845g = i16;
            this.f8846h = i17;
            this.f8847i = i18;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final Pattern f8848a = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: b  reason: collision with root package name */
        public static final Pattern f8849b = Pattern.compile(c0.k("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: c  reason: collision with root package name */
        public static final Pattern f8850c = Pattern.compile(c0.k("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        public static final Pattern d = Pattern.compile("\\\\an(\\d+)");

        public static PointF a(String str) {
            String group;
            String group2;
            Matcher matcher = f8849b.matcher(str);
            Matcher matcher2 = f8850c.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 82);
                    sb2.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb2.append(str);
                    sb2.append("'");
                    Log.i("SsaStyle.Overrides", sb2.toString());
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            Objects.requireNonNull(group);
            float parseFloat = Float.parseFloat(group.trim());
            Objects.requireNonNull(group2);
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }
    }

    public c(String str, int i10, Integer num, float f10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f8833a = str;
        this.f8834b = i10;
        this.f8835c = num;
        this.d = f10;
        this.f8836e = z10;
        this.f8837f = z11;
        this.f8838g = z12;
        this.f8839h = z13;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        String valueOf = String.valueOf(str);
        Log.w("SsaStyle", valueOf.length() != 0 ? "Ignoring unknown alignment: ".concat(valueOf) : new String("Ignoring unknown alignment: "));
        return -1;
    }

    public static boolean b(String str) {
        boolean z10 = false;
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt == 1 || parseInt == -1) {
                z10 = true;
            }
            return z10;
        } catch (NumberFormatException e10) {
            k8.a.k("SsaStyle", android.support.v4.media.b.f(a0.a.e(str, 33), "Failed to parse boolean value: '", str, "'"), e10);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            k8.a.c(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(Ints.a(((parseLong >> 24) & 255) ^ 255), Ints.a(parseLong & 255), Ints.a((parseLong >> 8) & 255), Ints.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            k8.a.k("SsaStyle", android.support.v4.media.b.f(a0.a.e(str, 36), "Failed to parse color expression: '", str, "'"), e10);
            return null;
        }
    }
}
