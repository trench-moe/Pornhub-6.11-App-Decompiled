package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.Constructor;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public final class StaticLayoutBuilderCompat {

    /* renamed from: m  reason: collision with root package name */
    public static final int f7526m;
    public static boolean n;

    /* renamed from: o  reason: collision with root package name */
    public static Constructor<StaticLayout> f7527o;

    /* renamed from: p  reason: collision with root package name */
    public static Object f7528p;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f7529a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f7530b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7531c;
    public int d;

    /* renamed from: k  reason: collision with root package name */
    public boolean f7538k;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f7532e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f7533f = IntCompanionObject.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f7534g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f7535h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f7536i = f7526m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f7537j = true;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f7539l = null;

    /* loaded from: classes.dex */
    public static class StaticLayoutBuilderCompatException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public StaticLayoutBuilderCompatException(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = a1.a.m(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException.<init>(java.lang.Throwable):void");
        }
    }

    static {
        f7526m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f7529a = charSequence;
        this.f7530b = textPaint;
        this.f7531c = i10;
        this.d = charSequence.length();
    }

    public StaticLayout a() {
        if (this.f7529a == null) {
            this.f7529a = BuildConfig.FLAVOR;
        }
        int max = Math.max(0, this.f7531c);
        CharSequence charSequence = this.f7529a;
        if (this.f7533f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f7530b, max, this.f7539l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            if (!n) {
                try {
                    f7528p = this.f7538k && i10 >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                    Class cls = Integer.TYPE;
                    Class cls2 = Float.TYPE;
                    Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                    f7527o = declaredConstructor;
                    declaredConstructor.setAccessible(true);
                    n = true;
                } catch (Exception e10) {
                    throw new StaticLayoutBuilderCompatException(e10);
                }
            }
            try {
                Constructor<StaticLayout> constructor = f7527o;
                Objects.requireNonNull(constructor);
                Object obj = f7528p;
                Objects.requireNonNull(obj);
                return constructor.newInstance(charSequence, 0, Integer.valueOf(this.d), this.f7530b, Integer.valueOf(max), this.f7532e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f7537j), null, Integer.valueOf(max), Integer.valueOf(this.f7533f));
            } catch (Exception e11) {
                throw new StaticLayoutBuilderCompatException(e11);
            }
        }
        if (this.f7538k && this.f7533f == 1) {
            this.f7532e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f7530b, max);
        obtain.setAlignment(this.f7532e);
        obtain.setIncludePad(this.f7537j);
        obtain.setTextDirection(this.f7538k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f7539l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f7533f);
        float f10 = this.f7534g;
        if (f10 != 0.0f || this.f7535h != 1.0f) {
            obtain.setLineSpacing(f10, this.f7535h);
        }
        if (this.f7533f > 1) {
            obtain.setHyphenationFrequency(this.f7536i);
        }
        return obtain.build();
    }
}
