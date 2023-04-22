package e8;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.t;
import kotlin.jvm.internal.IntCompanionObject;
import y7.d;

/* loaded from: classes.dex */
public final class a extends y7.b {

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f9141p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f9142q = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder n;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<String> f9143o;

    public a() {
        super("SubripDecoder");
        this.n = new StringBuilder();
        this.f9143o = new ArrayList<>();
    }

    public static float l(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return 0.92f;
                }
                throw new IllegalArgumentException();
            }
            return 0.5f;
        }
        return 0.08f;
    }

    public static long m(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0L;
        String group2 = matcher.group(i10 + 2);
        Objects.requireNonNull(group2);
        String group3 = matcher.group(i10 + 3);
        Objects.requireNonNull(group3);
        long parseLong2 = (Long.parseLong(group3) * 1000) + (Long.parseLong(group2) * 60 * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // y7.b
    public d k(byte[] bArr, int i10, boolean z10) {
        t tVar;
        String g10;
        long[] jArr;
        t tVar2;
        char c10;
        int i11;
        char c11;
        y7.a aVar;
        a aVar2 = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        t tVar3 = new t(bArr, i10);
        int i12 = 0;
        int i13 = 0;
        while (true) {
            String g11 = tVar3.g();
            if (g11 != null) {
                if (g11.length() != 0) {
                    try {
                        Integer.parseInt(g11);
                        g10 = tVar3.g();
                    } catch (NumberFormatException unused) {
                        tVar = tVar3;
                        Log.w("SubripDecoder", g11.length() != 0 ? "Skipping invalid index: ".concat(g11) : new String("Skipping invalid index: "));
                    }
                    if (g10 == null) {
                        Log.w("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = f9141p.matcher(g10);
                        if (matcher.matches()) {
                            long m10 = m(matcher, 1);
                            if (i13 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i13 * 2);
                            }
                            int i14 = i13 + 1;
                            jArr2[i13] = m10;
                            long m11 = m(matcher, 6);
                            if (i14 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i14 * 2);
                            }
                            int i15 = i14 + 1;
                            jArr2[i14] = m11;
                            aVar2.n.setLength(i12);
                            aVar2.f9143o.clear();
                            for (String g12 = tVar3.g(); !TextUtils.isEmpty(g12); g12 = tVar3.g()) {
                                if (aVar2.n.length() > 0) {
                                    aVar2.n.append("<br>");
                                }
                                StringBuilder sb2 = aVar2.n;
                                ArrayList<String> arrayList2 = aVar2.f9143o;
                                String trim = g12.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = f9142q.matcher(trim);
                                int i16 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i16;
                                    int length = group.length();
                                    sb3.replace(start, start + length, BuildConfig.FLAVOR);
                                    i16 += length;
                                }
                                sb2.append(sb3.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(aVar2.n.toString());
                            String str = null;
                            int i17 = 0;
                            while (true) {
                                if (i17 < aVar2.f9143o.size()) {
                                    String str2 = aVar2.f9143o.get(i17);
                                    if (str2.matches("\\{\\\\an[1-9]\\}")) {
                                        str = str2;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            if (str == null) {
                                aVar = new y7.a(fromHtml, null, null, null, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);
                                jArr = jArr2;
                                tVar2 = tVar3;
                                i11 = i15;
                            } else {
                                jArr = jArr2;
                                tVar2 = tVar3;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                i11 = i15;
                                int i18 = (c10 == 0 || c10 == 1 || c10 == 2) ? 0 : (c10 == 3 || c10 == 4 || c10 == 5) ? 2 : 1;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        if (str.equals("{\\an1}")) {
                                            c11 = 0;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620679:
                                        if (str.equals("{\\an2}")) {
                                            c11 = 1;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620648:
                                        if (str.equals("{\\an3}")) {
                                            c11 = 2;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620617:
                                        if (str.equals("{\\an4}")) {
                                            c11 = 6;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620586:
                                        if (str.equals("{\\an5}")) {
                                            c11 = 7;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620555:
                                        if (str.equals("{\\an6}")) {
                                            c11 = '\b';
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620524:
                                        if (str.equals("{\\an7}")) {
                                            c11 = 3;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620493:
                                        if (str.equals("{\\an8}")) {
                                            c11 = 4;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    case -685620462:
                                        if (str.equals("{\\an9}")) {
                                            c11 = 5;
                                            break;
                                        }
                                        c11 = 65535;
                                        break;
                                    default:
                                        c11 = 65535;
                                        break;
                                }
                                int i19 = (c11 == 0 || c11 == 1 || c11 == 2) ? 2 : (c11 == 3 || c11 == 4 || c11 == 5) ? 0 : 1;
                                aVar = new y7.a(fromHtml, null, null, null, l(i19), 0, i19, l(i18), i18, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, IntCompanionObject.MIN_VALUE, 0.0f, null);
                            }
                            arrayList.add(aVar);
                            arrayList.add(y7.a.f18511r);
                            aVar2 = this;
                            jArr2 = jArr;
                            tVar3 = tVar2;
                            i13 = i11;
                            i12 = 0;
                        } else {
                            tVar = tVar3;
                            Log.w("SubripDecoder", g10.length() != 0 ? "Skipping invalid timing: ".concat(g10) : new String("Skipping invalid timing: "));
                            aVar2 = this;
                            tVar3 = tVar;
                            i12 = 0;
                        }
                    }
                }
            }
        }
        return new b((y7.a[]) arrayList.toArray(new y7.a[0]), Arrays.copyOf(jArr2, i13));
    }
}
