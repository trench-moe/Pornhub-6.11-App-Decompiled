package a0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f0;
import b0.f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.measurement.zzbl;
import f8.f;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import k8.c0;
import k8.t;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.coroutines.internal.ThreadContextKt;
import l2.d0;
import le.p;
import le.q0;
import le.s;
import ne.d;
import ne.n;
import pe.l;
import t9.o1;
import t9.q1;
import tc.c;
import vb.y;
import w5.m;
import w9.b4;
import w9.e;
import w9.h;
import w9.o;

/* loaded from: classes.dex */
public class b implements d0, l, h5.a, q1, m, o1 {
    public static b H;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f118c = {16842755};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f119f = {16842755};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f120j = {R.attr.defaultNavHost};

    /* renamed from: m  reason: collision with root package name */
    public static final char[] f121m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final float[][] n = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: t  reason: collision with root package name */
    public static final float[][] f122t = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: u  reason: collision with root package name */
    public static final float[] f123u = {95.047f, 100.0f, 108.883f};

    /* renamed from: w  reason: collision with root package name */
    public static final float[][] f124w = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final b y = new b();

    /* renamed from: z  reason: collision with root package name */
    public static final char[] f125z = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] A = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object B = new y("CONDITION_FALSE");
    public static final int[] C = {R.attr.animateOnBoundary, R.attr.autoPlay, R.attr.disableAutoPlayOnUserInteraction, R.attr.fillColor, R.attr.indicatorGravity, R.attr.indicatorMarginHorizontal, R.attr.indicatorMarginVertical, R.attr.indicatorOrientation, R.attr.indicatorVisibility, R.attr.pageColor, R.attr.pageTransformInterval, R.attr.pageTransformer, R.attr.radius, R.attr.slideInterval, R.attr.snap, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] D = {16842948, 16842964, R.attr.centered, R.attr.fillColor, R.attr.pageColor, R.attr.radius, R.attr.snap, R.attr.strokeColor, R.attr.strokeWidth};
    public static final int[] E = new int[0];
    public static final long[] F = new long[0];
    public static final Object[] G = new Object[0];
    public static final int[] I = {R.attr.buttonSize, R.attr.colorScheme, R.attr.scopeUris};
    public static final o1 J = new b();
    public static final o1 K = new b();
    public static final o1 L = new b();
    public static final o1 M = new b();
    public static final o1 N = new b();
    public static final o1 O = new b();
    public static final o1 P = new b();
    public static final o1 Q = new b();
    public static final o1 R = new b();
    public static final o1 S = new b();
    public static final o1 T = new b();
    public static final o1 U = new b();

    public static long A(Context context) {
        return E(context).getFreeSpace();
    }

    public static final String B(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if ((r10 & 1) != 0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002d A[LOOP:0: B:3:0x0004->B:22:0x002d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int C(int r9, int r10) {
        /*
            r5 = 1
            r0 = r5
            r5 = 1
            r1 = r5
        L4:
            r2 = 2
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r1 > r2) goto L30
            r7 = 2
            int r3 = r9 + r1
            r6 = 6
            int r3 = r3 % 3
            r6 = 7
            r5 = 0
            r4 = r5
            if (r3 == 0) goto L1f
            r6 = 5
            if (r3 == r0) goto L22
            if (r3 == r2) goto L1a
            goto L29
        L1a:
            r2 = r10 & 2
            if (r2 == 0) goto L28
            r6 = 6
        L1f:
            r4 = 1
            r8 = 7
            goto L29
        L22:
            r2 = r10 & 1
            r6 = 7
            if (r2 == 0) goto L28
            goto L1f
        L28:
            r6 = 2
        L29:
            if (r4 == 0) goto L2d
            r6 = 5
            return r3
        L2d:
            int r1 = r1 + 1
            goto L4
        L30:
            r7 = 4
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.C(int, int):int");
    }

    public static final int D(f0 f0Var, RecyclerView recyclerView) {
        View d;
        Intrinsics.checkNotNullParameter(f0Var, "<this>");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        RecyclerView.l layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (d = f0Var.d(layoutManager)) != null) {
            return layoutManager.P(d);
        }
        return -1;
    }

    public static File E(Context context) {
        String externalStorageState = Environment.getExternalStorageState();
        File filesDir = (TextUtils.isEmpty(externalStorageState) || !externalStorageState.equals("mounted")) ? context.getFilesDir() : context.getExternalFilesDir(null);
        kf.a.f12078a.a("STORAGE ROOT DIR IS: %s", filesDir.getAbsolutePath());
        return filesDir;
    }

    public static TextView F(Toolbar toolbar, CharSequence charSequence) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    public static File G(Context context, String str) {
        File file = new File(E(context), "PHVideo");
        if (!file.exists()) {
            file.mkdir();
        }
        return new File(file, a1.a.l(str, ".mp4"));
    }

    public static int H(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int I(int i10) {
        for (int i11 = 4; i11 < 32; i11++) {
            int i12 = (1 << i11) - 12;
            if (i10 <= i12) {
                return i12;
            }
        }
        return i10;
    }

    public static int J(int i10) {
        return I(i10 * 4) / 4;
    }

    public static int K(int i10) {
        return I(i10 * 8) / 8;
    }

    public static int L(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = (f10 > 8.0f ? 1 : (f10 == 8.0f ? 0 : -1)) > 0 ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z10 = f13 > 0.008856452f;
        float f14 = z10 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z10) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f123u;
        return e0.a.b(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    public static final boolean M(int i10) {
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2) {
                return z10;
            }
            z10 = false;
        }
        return z10;
    }

    public static boolean N(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static boolean O(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static float P(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static String Q(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            sb2.append(str.charAt(i10));
            if (str2.length() > i10) {
                sb2.append(str2.charAt(i10));
            }
        }
        return sb2.toString();
    }

    public static LinkedHashMap R(int i10) {
        return new LinkedHashMap(i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE);
    }

    public static void S(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) list.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static void T(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        Field[] fields;
        if (obj == null) {
            return;
        }
        if (!(obj instanceof c)) {
            String p10 = p(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(p10);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str2 = (String) obj;
                if (!str2.startsWith("http") && str2.length() > 200) {
                    str2 = str2.substring(0, 200) + "[...]";
                }
                int length = str2.length();
                StringBuilder sb2 = new StringBuilder(length);
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str2.charAt(i10);
                    if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                        sb2.append(String.format("\\u%04x", Integer.valueOf(charAt)));
                    } else {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                stringBuffer2.append("\"");
                stringBuffer2.append(sb3);
                stringBuffer2.append("\"");
            } else if (obj instanceof byte[]) {
                stringBuffer2.append(Typography.quote);
                for (byte b10 : (byte[]) obj) {
                    int i11 = b10 & UByte.MAX_VALUE;
                    if (i11 == 92 || i11 == 34) {
                        stringBuffer2.append('\\');
                        stringBuffer2.append((char) i11);
                    } else if (i11 < 32 || i11 >= 127) {
                        stringBuffer2.append(String.format("\\%03o", Integer.valueOf(i11)));
                    } else {
                        stringBuffer2.append((char) i11);
                    }
                }
                stringBuffer2.append(Typography.quote);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
            return;
        }
        int length2 = stringBuffer.length();
        if (str != null) {
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(p(str));
            stringBuffer2.append(" <\n");
            stringBuffer.append("  ");
        }
        Class<?> cls = obj.getClass();
        for (Field field : cls.getFields()) {
            int modifiers = field.getModifiers();
            String name = field.getName();
            if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                Class<?> type = field.getType();
                Object obj2 = field.get(obj);
                if (!type.isArray()) {
                    T(name, obj2, stringBuffer, stringBuffer2);
                } else if (type.getComponentType() == Byte.TYPE) {
                    T(name, obj2, stringBuffer, stringBuffer2);
                } else {
                    int length3 = obj2 == null ? 0 : Array.getLength(obj2);
                    for (int i12 = 0; i12 < length3; i12++) {
                        T(name, Array.get(obj2, i12), stringBuffer, stringBuffer2);
                    }
                }
            }
        }
        for (Method method : cls.getMethods()) {
            String name2 = method.getName();
            if (name2.startsWith("set")) {
                String substring = name2.substring(3);
                try {
                    if (((Boolean) cls.getMethod("has" + substring, new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                        T(substring, cls.getMethod("get" + substring, new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
        }
        if (str != null) {
            stringBuffer.setLength(length2);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(">\n");
        }
    }

    public static y0.b U(ByteBuffer byteBuffer) {
        long j10;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i10 = duplicate.getShort() & UShort.MAX_VALUE;
        if (i10 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    j10 = -1;
                    break;
                }
                int i12 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j10 = duplicate.getInt() & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i12) {
                    break;
                }
                i11++;
            }
            if (j10 != -1) {
                duplicate.position(duplicate.position() + ((int) (j10 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j11 = duplicate.getInt() & 4294967295L;
                for (int i13 = 0; i13 < j11; i13++) {
                    int i14 = duplicate.getInt();
                    long j12 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i14 || 1701669481 == i14) {
                        duplicate.position((int) (j12 + j10));
                        y0.b bVar = new y0.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static long V(t tVar, int i10, int i11) {
        byte[] bArr;
        tVar.D(i10);
        if (tVar.a() < 5) {
            return -9223372036854775807L;
        }
        int f10 = tVar.f();
        if ((8388608 & f10) == 0 && ((2096896 & f10) >> 8) == i11) {
            if ((f10 & 32) != 0) {
                if (tVar.s() >= 7 && tVar.a() >= 7) {
                    if ((tVar.s() & 16) == 16) {
                        System.arraycopy(tVar.f12009a, tVar.f12010b, new byte[6], 0, 6);
                        tVar.f12010b += 6;
                        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
                    }
                }
                return -9223372036854775807L;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    public static f W(f fVar, String[] strArr, Map map) {
        int i10 = 0;
        if (fVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (f) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                f fVar2 = new f();
                int length = strArr.length;
                while (i10 < length) {
                    fVar2.a((f) map.get(strArr[i10]));
                    i10++;
                }
                return fVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            fVar.a((f) map.get(strArr[0]));
            return fVar;
        } else if (strArr != null && strArr.length > 1) {
            int length2 = strArr.length;
            while (i10 < length2) {
                fVar.a((f) map.get(strArr[i10]));
                i10++;
            }
        }
        return fVar;
    }

    public static final void X(s sVar, Continuation continuation, boolean z10) {
        Object d;
        Object f10 = sVar.f();
        Throwable c10 = sVar.c(f10);
        if (c10 != null) {
            Result.Companion companion = Result.Companion;
            d = ResultKt.createFailure(c10);
        } else {
            Result.Companion companion2 = Result.Companion;
            d = sVar.d(f10);
        }
        Object m16constructorimpl = Result.m16constructorimpl(d);
        if (!z10) {
            continuation.resumeWith(m16constructorimpl);
            return;
        }
        d dVar = (d) continuation;
        Continuation<T> continuation2 = dVar.n;
        Object obj = dVar.f13442u;
        CoroutineContext context = continuation2.getContext();
        Object b10 = ThreadContextKt.b(context, obj);
        q0<?> a10 = b10 != ThreadContextKt.f12118a ? p.a(continuation2, context, b10) : null;
        try {
            dVar.n.resumeWith(m16constructorimpl);
            Unit unit = Unit.INSTANCE;
            if (a10 != null && !a10.D()) {
                return;
            }
            ThreadContextKt.a(context, b10);
        } catch (Throwable th) {
            if (a10 != null) {
                if (a10.D()) {
                }
                throw th;
            }
            ThreadContextKt.a(context, b10);
            throw th;
        }
    }

    public static String Y(String str) {
        String replaceAll = str.replaceAll(",", BuildConfig.FLAVOR);
        if (replaceAll.length() > 6) {
            return replaceAll.substring(0, replaceAll.length() - 6) + "M";
        }
        if (replaceAll.length() > 3) {
            replaceAll = replaceAll.substring(0, replaceAll.length() - 3) + "K";
        }
        return replaceAll;
    }

    public static final long Z(String str, long j10, long j11, long j12) {
        String a02 = a0(str);
        if (a02 == null) {
            return j10;
        }
        Long longOrNull = StringsKt.toLongOrNull(a02);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + a02 + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        boolean z10 = false;
        if (j11 <= longValue && longValue <= j12) {
            z10 = true;
        }
        if (z10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + longValue + '\'').toString());
    }

    public static final String a0(String str) {
        int i10 = n.f13460a;
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final int b(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c10);
            }
        }
        return (c10 - c11) + 10;
    }

    public static int b0(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = IntCompanionObject.MAX_VALUE;
        }
        return (int) Z(str, i10, i11, i12);
    }

    public static /* synthetic */ long c0(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return Z(str, j10, j13, j12);
    }

    public static final String d0(String toCanonicalHost) {
        Intrinsics.checkNotNullParameter(toCanonicalHost, "$this$toCanonicalHost");
        int i10 = 0;
        int i11 = -1;
        if (!StringsKt.contains$default((CharSequence) toCanonicalHost, (CharSequence) ":", false, 2, (Object) null)) {
            try {
                String ascii = IDN.toASCII(toCanonicalHost);
                Intrinsics.checkNotNullExpressionValue(ascii, "IDN.toASCII(host)");
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                if (ascii != null) {
                    String lowerCase = ascii.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (lowerCase.length() == 0) {
                        return null;
                    }
                    int length = lowerCase.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        char charAt = lowerCase.charAt(i12);
                        if (Intrinsics.compare((int) charAt, 31) > 0 && Intrinsics.compare((int) charAt, 127) < 0 && StringsKt.indexOf$default((CharSequence) " #%/:?@[\\]", charAt, 0, false, 6, (Object) null) == -1) {
                        }
                        i10 = 1;
                        break;
                    }
                    if (i10 != 0) {
                        return null;
                    }
                    return lowerCase;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress q10 = (StringsKt.startsWith$default(toCanonicalHost, "[", false, 2, (Object) null) && StringsKt.endsWith$default(toCanonicalHost, "]", false, 2, (Object) null)) ? q(toCanonicalHost, 1, toCanonicalHost.length() - 1) : q(toCanonicalHost, 0, toCanonicalHost.length());
        if (q10 != null) {
            byte[] address = q10.getAddress();
            if (address.length != 16) {
                if (address.length == 4) {
                    return q10.getHostAddress();
                }
                throw new AssertionError("Invalid IPv6 address: '" + toCanonicalHost + '\'');
            }
            Intrinsics.checkNotNullExpressionValue(address, "address");
            int i13 = 0;
            int i14 = 0;
            while (i13 < address.length) {
                int i15 = i13;
                while (i15 < 16 && address[i15] == 0 && address[i15 + 1] == 0) {
                    i15 += 2;
                }
                int i16 = i15 - i13;
                if (i16 > i14 && i16 >= 4) {
                    i11 = i13;
                    i14 = i16;
                }
                i13 = i15 + 2;
            }
            bf.f fVar = new bf.f();
            while (true) {
                while (i10 < address.length) {
                    if (i10 == i11) {
                        fVar.i0(58);
                        i10 += i14;
                        if (i10 == 16) {
                            fVar.i0(58);
                        }
                    } else {
                        if (i10 > 0) {
                            fVar.i0(58);
                        }
                        byte b10 = address[i10];
                        byte[] bArr = qe.c.f14512a;
                        fVar.U(((b10 & UByte.MAX_VALUE) << 8) | (address[i10 + 1] & UByte.MAX_VALUE));
                        i10 += 2;
                    }
                }
                return fVar.E();
            }
        }
        return null;
    }

    public static void e(Spannable spannable, Object obj, int i10, int i11, int i12) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i10, i11, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i10 && spannable.getSpanEnd(obj2) == i11 && spannable.getSpanFlags(obj2) == i12) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i10, i11, i12);
    }

    public static String e0(int i10) {
        return c0.k("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i10)), Integer.valueOf(Color.green(i10)), Integer.valueOf(Color.blue(i10)), Double.valueOf(Color.alpha(i10) / 255.0d));
    }

    public static void f(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
            StringBuilder sb2 = new StringBuilder(a.e(str, a.e(glGetShaderInfoLog, 10)));
            sb2.append(glGetShaderInfoLog);
            sb2.append(", source: ");
            sb2.append(str);
            Log.e("GlUtil", sb2.toString());
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        k();
    }

    public static final String f0(Continuation continuation) {
        String m16constructorimpl;
        if (continuation instanceof d) {
            return continuation.toString();
        }
        try {
            Result.Companion companion = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(continuation + '@' + B(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m16constructorimpl = Result.m16constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m19exceptionOrNullimpl(m16constructorimpl) != null) {
            m16constructorimpl = ((Object) continuation.getClass().getName()) + '@' + B(continuation);
        }
        return (String) m16constructorimpl;
    }

    public static int g(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 <= i11) {
                return i14;
            } else {
                i12 = i14 - 1;
            }
        }
        return ~i13;
    }

    public static int g0(String str) {
        try {
            return NumberFormat.getNumberInstance(Locale.US).parse(str).intValue();
        } catch (ParseException e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public static int h(long[] jArr, int i10, long j10) {
        int i11 = i10 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = (jArr[i13] > j10 ? 1 : (jArr[i13] == j10 ? 0 : -1));
            if (i14 < 0) {
                i12 = i13 + 1;
            } else if (i14 <= 0) {
                return i13;
            } else {
                i11 = i13 - 1;
            }
        }
        return ~i12;
    }

    public static float h0(float f10) {
        return (f10 > 8.0f ? (float) Math.pow((f10 + 16.0d) / 116.0d, 3.0d) : f10 / 903.2963f) * 100.0f;
    }

    public static void i(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static double i0(double d) {
        int i10;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d) && d != 0.0d && i10 != 0) {
            return Math.floor(Math.abs(d)) * (i10 > 0 ? 1 : -1);
        }
        return d;
    }

    public static int j0(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 += next != null ? next.hashCode() : 0;
        }
        return i10;
    }

    public static void k() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
            Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
        if (r4 <= 'Z') goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String k0(java.lang.String r9, java.lang.String r10, java.util.Collection r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.k0(java.lang.String, java.lang.String, java.util.Collection, boolean, boolean):java.lang.String");
    }

    public static int l(Context context, String str) {
        int a10;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i10 = Build.VERSION.SDK_INT;
            String permissionToOp = i10 >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                a10 = b0.f.a(context, permissionToOp, packageName);
            } else if (i10 >= 29) {
                AppOpsManager c10 = f.a.c(context);
                a10 = f.a.a(c10, permissionToOp, Binder.getCallingUid(), packageName);
                if (a10 == 0) {
                    a10 = f.a.a(c10, permissionToOp, myUid, f.a.b(context));
                }
            } else {
                a10 = b0.f.a(context, permissionToOp, packageName);
            }
            return a10 == 0 ? 0 : -2;
        }
        return -1;
    }

    public static o l0(b4 b4Var) {
        if (b4Var == null) {
            return o.f17256k;
        }
        int B2 = b4Var.B() - 1;
        if (B2 == 1) {
            return b4Var.A() ? new w9.s(b4Var.v()) : o.f17263v;
        } else if (B2 == 2) {
            return b4Var.z() ? new h(Double.valueOf(b4Var.s())) : new h(null);
        } else if (B2 == 3) {
            return b4Var.y() ? new w9.f(Boolean.valueOf(b4Var.x())) : new w9.f(null);
        } else if (B2 == 4) {
            List<b4> w10 = b4Var.w();
            ArrayList arrayList = new ArrayList();
            for (b4 b4Var2 : w10) {
                arrayList.add(l0(b4Var2));
            }
            return new w9.p(b4Var.u(), arrayList);
        } else {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
    }

    public static int m(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        k();
        f(35633, str, glCreateProgram);
        f(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            Log.e("GlUtil", valueOf.length() != 0 ? "Unable to link shader program: \n".concat(valueOf) : new String("Unable to link shader program: \n"));
        }
        k();
        return glCreateProgram;
    }

    public static int m0(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0) {
                return (int) ((Math.floor(Math.abs(d)) * (i10 > 0 ? 1 : -1)) % 4.294967296E9d);
            }
        }
        return 0;
    }

    public static FloatBuffer n(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static String n0(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb2;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                sb2 = "null";
            } else {
                try {
                    sb2 = obj.toString();
                } catch (Exception e10) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb3 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb3.append(name);
                    sb3.append('@');
                    sb3.append(hexString);
                    String sb4 = sb3.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", sb4.length() != 0 ? "Exception during lenientFormat for ".concat(sb4) : new String("Exception during lenientFormat for "), (Throwable) e10);
                    String name2 = e10.getClass().getName();
                    StringBuilder sb5 = new StringBuilder(sb4.length() + 9 + name2.length());
                    android.support.v4.media.a.o(sb5, "<", sb4, " threw ", name2);
                    sb5.append(">");
                    sb2 = sb5.toString();
                }
            }
            objArr[i11] = sb2;
            i11++;
        }
        StringBuilder sb6 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (indexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb6.append((CharSequence) str, i12, indexOf);
            sb6.append(objArr[i10]);
            i12 = indexOf + 2;
            i10++;
        }
        sb6.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb6.append(" [");
            sb6.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb6.append(", ");
                sb6.append(objArr[i13]);
            }
            sb6.append(']');
        }
        return sb6.toString();
    }

    public static String o(String str) {
        StringBuilder n10 = a.n(a.e(str, a.e(str, 5)), ".", str, ",.", str);
        n10.append(" *");
        return n10.toString();
    }

    public static o o0(Object obj) {
        if (obj == null) {
            return o.f17257l;
        }
        if (obj instanceof String) {
            return new w9.s((String) obj);
        }
        if (obj instanceof Double) {
            return new h((Double) obj);
        }
        if (obj instanceof Long) {
            return new h(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new h(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new w9.f((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof List) {
                e eVar = new e();
                for (Object obj2 : (List) obj) {
                    eVar.u(eVar.m(), o0(obj2));
                }
                return eVar;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
        w9.l lVar = new w9.l();
        Map map = (Map) obj;
        for (Object obj3 : map.keySet()) {
            o o02 = o0(map.get(obj3));
            if (obj3 != null) {
                if (!(obj3 instanceof String)) {
                    obj3 = obj3.toString();
                }
                lVar.g((String) obj3, o02);
            }
        }
        return lVar;
    }

    public static String p(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (i10 == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static int p0(h2.h hVar) {
        int m02 = m0(hVar.d("runtime.counter").zzh().doubleValue() + 1.0d);
        if (m02 <= 1000000) {
            hVar.f("runtime.counter", new h(Double.valueOf(m02)));
            return m02;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x010a, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x010e, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010f, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0122, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.net.InetAddress q(java.lang.String r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.b.q(java.lang.String, int, int):java.net.InetAddress");
    }

    public static long q0(double d) {
        return m0(d) & 4294967295L;
    }

    public static float r(float[] fArr, int i10, float[] fArr2, int i11) {
        return (fArr[i10] * fArr2[i11]) + (fArr[i10 + 1] * fArr2[i11 + 1]) + (fArr[i10 + 2] * fArr2[i11 + 2]);
    }

    public static zzbl r0(String str) {
        zzbl zzblVar = null;
        if (str != null && !str.isEmpty()) {
            zzblVar = (zzbl) ((HashMap) zzbl.A0).get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (zzblVar != null) {
            return zzblVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean s(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static Object s0(o oVar) {
        if (o.f17257l.equals(oVar)) {
            return null;
        }
        if (o.f17256k.equals(oVar)) {
            return BuildConfig.FLAVOR;
        }
        if (oVar instanceof w9.l) {
            return t0((w9.l) oVar);
        }
        if (!(oVar instanceof e)) {
            return !oVar.zzh().isNaN() ? oVar.zzh() : oVar.zzi();
        }
        ArrayList arrayList = new ArrayList();
        e eVar = (e) oVar;
        Objects.requireNonNull(eVar);
        int i10 = 0;
        while (true) {
            if (!(i10 < eVar.m())) {
                return arrayList;
            }
            if (i10 >= eVar.m()) {
                throw new NoSuchElementException(android.support.v4.media.b.e(32, "Out of bounds index: ", i10));
            }
            int i11 = i10 + 1;
            Object s02 = s0(eVar.o(i10));
            if (s02 != null) {
                arrayList.add(s02);
            }
            i10 = i11;
        }
    }

    public static View t(View view, int i10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View findViewById = viewGroup.getChildAt(i11).findViewById(i10);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }

    public static Map t0(w9.l lVar) {
        HashMap hashMap = new HashMap();
        Objects.requireNonNull(lVar);
        Iterator it = new ArrayList(lVar.f17216c.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Object s02 = s0(lVar.l(str));
            if (s02 != null) {
                hashMap.put(str, s02);
            }
        }
        return hashMap;
    }

    public static String u(int i10) {
        if (i10 >= 1000000) {
            DecimalFormat decimalFormat = new DecimalFormat("###.#");
            return decimalFormat.format(i10 / 1000000.0d) + "M";
        } else if (i10 >= 1000) {
            return (i10 / 1000) + "K";
        } else {
            return String.valueOf(i10);
        }
    }

    public static void u0(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static ApiException v(Status status) {
        return status.f6861m != null ? new ResolvableApiException(status) : new ApiException(status);
    }

    public static void v0(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static final String w(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static void w0(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static String x(long j10) {
        String str;
        long currentTimeMillis = (System.currentTimeMillis() / 1000) - j10;
        if (currentTimeMillis < 0) {
            return new SimpleDateFormat("dd/MM/yyyy hh:mm a", Locale.getDefault()).format(Long.valueOf(j10 * 1000));
        }
        if (currentTimeMillis < 60) {
            str = BuildConfig.FLAVOR + currentTimeMillis + " second";
        } else if (currentTimeMillis < 3600) {
            currentTimeMillis /= 60;
            str = BuildConfig.FLAVOR + currentTimeMillis + " minute";
        } else if (currentTimeMillis < 86400) {
            currentTimeMillis /= 3600;
            str = BuildConfig.FLAVOR + currentTimeMillis + " hour";
        } else if (currentTimeMillis < 604800) {
            currentTimeMillis /= 86400;
            str = BuildConfig.FLAVOR + currentTimeMillis + " day";
        } else if (currentTimeMillis < 2629743) {
            currentTimeMillis /= 604800;
            str = BuildConfig.FLAVOR + currentTimeMillis + " week";
        } else if (currentTimeMillis < 31556926) {
            currentTimeMillis /= 2629743;
            str = BuildConfig.FLAVOR + currentTimeMillis + " month";
        } else {
            currentTimeMillis /= 31556926;
            str = BuildConfig.FLAVOR + currentTimeMillis + " year";
        }
        if (currentTimeMillis != 1) {
            str = a1.a.l(str, "s");
        }
        return a1.a.l(str, " ago");
    }

    public static boolean x0(o oVar) {
        if (oVar == null) {
            return false;
        }
        Double zzh = oVar.zzh();
        return !zzh.isNaN() && zzh.doubleValue() >= 0.0d && zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())));
    }

    public static String y(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 / 3600000;
        int i12 = i10 % 3600000;
        int i13 = i12 / 60000;
        int i14 = (i12 % 60000) / 1000;
        if (i11 > 0) {
            sb2.append(String.format("%02d", Integer.valueOf(i11)));
            sb2.append(":");
            sb2.append(String.format("%02d", Integer.valueOf(i13)));
            sb2.append(":");
            sb2.append(String.format("%02d", Integer.valueOf(i14)));
        } else {
            sb2.append(String.format("%02d", Integer.valueOf(i13)));
            sb2.append(":");
            sb2.append(String.format("%02d", Integer.valueOf(i14)));
        }
        return sb2.toString();
    }

    public static boolean y0(o oVar, o oVar2) {
        if (oVar.getClass().equals(oVar2.getClass())) {
            if ((oVar instanceof w9.t) || (oVar instanceof w9.m)) {
                return true;
            }
            if (!(oVar instanceof h)) {
                return oVar instanceof w9.s ? oVar.zzi().equals(oVar2.zzi()) : oVar instanceof w9.f ? oVar.b().equals(oVar2.b()) : oVar == oVar2;
            }
            if (!Double.isNaN(oVar.zzh().doubleValue()) && !Double.isNaN(oVar2.zzh().doubleValue())) {
                return oVar.zzh().equals(oVar2.zzh());
            }
            return false;
        }
        return false;
    }

    public static String z(int i10) {
        return i10 + "%";
    }

    public static String z0(String str, int i10) {
        if (i10 <= 0) {
            zzfa.zzb("index out of range for prefix", str);
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 11);
        sb2.append(str);
        sb2.append(i10);
        return sb2.toString();
    }

    @Override // pe.l
    public List a(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
            return ArraysKt.toList(allByName);
        } catch (NullPointerException e10) {
            UnknownHostException unknownHostException = new UnknownHostException(a1.a.l("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e10);
            throw unknownHostException;
        }
    }

    @Override // h5.a
    public boolean d(Object obj, File file, h5.d dVar) {
        try {
            d6.a.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e10);
            }
            return false;
        }
    }

    @Override // l2.d0
    public Object j(JsonReader jsonReader, float f10) {
        return l2.m.b(jsonReader, f10);
    }
}
