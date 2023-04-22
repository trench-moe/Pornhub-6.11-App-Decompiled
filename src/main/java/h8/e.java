package h8;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.c0;
import k8.t;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f10247a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f10248b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    public static final Map<String, Integer> f10249c;
    public static final Map<String, Integer> d;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<b> f10250c = z7.b.f21869j;

        /* renamed from: a  reason: collision with root package name */
        public final c f10251a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10252b;

        public b(c cVar, int i10, a aVar) {
            this.f10251a = cVar;
            this.f10252b = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f10253a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10254b;

        /* renamed from: c  reason: collision with root package name */
        public final String f10255c;
        public final Set<String> d;

        public c(String str, int i10, String str2, Set<String> set) {
            this.f10254b = i10;
            this.f10253a = str;
            this.f10255c = str2;
            this.d = set;
        }
    }

    /* loaded from: classes2.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: c  reason: collision with root package name */
        public final int f10256c;

        /* renamed from: f  reason: collision with root package name */
        public final h8.c f10257f;

        public d(int i10, h8.c cVar) {
            this.f10256c = i10;
            this.f10257f = cVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return Integer.compare(this.f10256c, dVar.f10256c);
        }
    }

    /* renamed from: h8.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0146e {

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f10260c;

        /* renamed from: a  reason: collision with root package name */
        public long f10258a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f10259b = 0;
        public int d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f10261e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f10262f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f10263g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f10264h = -3.4028235E38f;

        /* renamed from: i  reason: collision with root package name */
        public int f10265i = IntCompanionObject.MIN_VALUE;

        /* renamed from: j  reason: collision with root package name */
        public float f10266j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public int f10267k = IntCompanionObject.MIN_VALUE;

        /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
            if (r6 == 0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public y7.a.b a() {
            /*
                Method dump skipped, instructions count: 237
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: h8.e.C0146e.a():y7.a$b");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, (int) KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f10249c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, (int) KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, (int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, (int) KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb((int) KotlinVersion.MAX_COMPONENT_VALUE, 0, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, (int) KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    public static void a(String str, c cVar, List<b> list, SpannableStringBuilder spannableStringBuilder, List<h8.c> list2) {
        char c10;
        int i10 = cVar.f10254b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f10253a;
        Objects.requireNonNull(str2);
        int hashCode = str2.hashCode();
        int i11 = -1;
        if (hashCode == 0) {
            if (str2.equals(BuildConfig.FLAVOR)) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode == 105) {
            if (str2.equals("i")) {
                c10 = 3;
            }
            c10 = 65535;
        } else if (hashCode == 3314158) {
            if (str2.equals("lang")) {
                c10 = 6;
            }
            c10 = 65535;
        } else if (hashCode == 3511770) {
            if (str2.equals("ruby")) {
                c10 = 7;
            }
            c10 = 65535;
        } else if (hashCode == 98) {
            if (str2.equals("b")) {
                c10 = 1;
            }
            c10 = 65535;
        } else if (hashCode == 99) {
            if (str2.equals(DvdsConfig.TYPE_CATEGORY)) {
                c10 = 2;
            }
            c10 = 65535;
        } else if (hashCode != 117) {
            if (hashCode == 118 && str2.equals("v")) {
                c10 = 5;
            }
            c10 = 65535;
        } else {
            if (str2.equals("u")) {
                c10 = 4;
            }
            c10 = 65535;
        }
        switch (c10) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case 2:
                for (String str3 : cVar.d) {
                    Map<String, Integer> map = f10249c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i10, length, 33);
                    } else {
                        Map<String, Integer> map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case 7:
                int c11 = c(list2, str, cVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, b.f10250c);
                int i12 = cVar.f10254b;
                int i13 = 0;
                int i14 = 0;
                while (i13 < arrayList.size()) {
                    if ("rt".equals(((b) arrayList.get(i13)).f10251a.f10253a)) {
                        b bVar = (b) arrayList.get(i13);
                        int c12 = c(list2, str, bVar.f10251a);
                        if (c12 == i11) {
                            c12 = c11 != i11 ? c11 : 1;
                        }
                        int i15 = bVar.f10251a.f10254b - i14;
                        int i16 = bVar.f10252b - i14;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i15, i16);
                        spannableStringBuilder.delete(i15, i16);
                        spannableStringBuilder.setSpan(new c8.c(subSequence.toString(), c12), i12, i15, 33);
                        i14 = subSequence.length() + i14;
                        i12 = i15;
                    }
                    i13++;
                    i11 = -1;
                }
                break;
            default:
                return;
        }
        List<d> b10 = b(list2, str, cVar);
        int i17 = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) b10;
            if (i17 >= arrayList2.size()) {
                return;
            }
            h8.c cVar2 = ((d) arrayList2.get(i17)).f10257f;
            if (cVar2 != null) {
                if (cVar2.a() != -1) {
                    a0.b.e(spannableStringBuilder, new StyleSpan(cVar2.a()), i10, length, 33);
                }
                if (cVar2.f10237j == 1) {
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, length, 33);
                }
                if (cVar2.f10238k == 1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                }
                if (cVar2.f10234g) {
                    if (!cVar2.f10234g) {
                        throw new IllegalStateException("Font color not defined");
                    }
                    a0.b.e(spannableStringBuilder, new ForegroundColorSpan(cVar2.f10233f), i10, length, 33);
                }
                if (cVar2.f10236i) {
                    if (!cVar2.f10236i) {
                        throw new IllegalStateException("Background color not defined.");
                    }
                    a0.b.e(spannableStringBuilder, new BackgroundColorSpan(cVar2.f10235h), i10, length, 33);
                }
                if (cVar2.f10232e != null) {
                    a0.b.e(spannableStringBuilder, new TypefaceSpan(cVar2.f10232e), i10, length, 33);
                }
                int i18 = cVar2.n;
                if (i18 == 1) {
                    a0.b.e(spannableStringBuilder, new AbsoluteSizeSpan((int) cVar2.f10241o, true), i10, length, 33);
                } else if (i18 == 2) {
                    a0.b.e(spannableStringBuilder, new RelativeSizeSpan(cVar2.f10241o), i10, length, 33);
                } else if (i18 == 3) {
                    a0.b.e(spannableStringBuilder, new RelativeSizeSpan(cVar2.f10241o / 100.0f), i10, length, 33);
                }
                if (cVar2.f10243q) {
                    spannableStringBuilder.setSpan(new c8.a(), i10, length, 33);
                }
            }
            i17++;
        }
    }

    public static List<d> b(List<h8.c> list, String str, c cVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            h8.c cVar2 = list.get(i11);
            String str2 = cVar.f10253a;
            Set<String> set = cVar.d;
            String str3 = cVar.f10255c;
            if (cVar2.f10229a.isEmpty() && cVar2.f10230b.isEmpty() && cVar2.f10231c.isEmpty() && cVar2.d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2) ? 1 : 0;
            } else {
                int b10 = h8.c.b(h8.c.b(h8.c.b(0, cVar2.f10229a, str, 1073741824), cVar2.f10230b, str2, 2), cVar2.d, str3, 4);
                if (b10 != -1 && set.containsAll(cVar2.f10231c)) {
                    i10 = b10 + (cVar2.f10231c.size() * 4);
                }
                i10 = 0;
            }
            if (i10 > 0) {
                arrayList.add(new d(i10, cVar2));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List<h8.c> list, String str, c cVar) {
        List<d> b10 = b(list, str, cVar);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) b10;
            if (i10 >= arrayList.size()) {
                return -1;
            }
            int i11 = ((d) arrayList.get(i10)).f10257f.f10242p;
            if (i11 != -1) {
                return i11;
            }
            i10++;
        }
    }

    public static h8.d d(String str, Matcher matcher, t tVar, List<h8.c> list) {
        C0146e c0146e = new C0146e();
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            c0146e.f10258a = g.b(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            c0146e.f10259b = g.b(group2);
            String group3 = matcher.group(3);
            Objects.requireNonNull(group3);
            e(group3, c0146e);
            StringBuilder sb2 = new StringBuilder();
            String g10 = tVar.g();
            while (!TextUtils.isEmpty(g10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(g10.trim());
                g10 = tVar.g();
            }
            c0146e.f10260c = f(str, sb2.toString(), list);
            return new h8.d(c0146e.a().a(), c0146e.f10258a, c0146e.f10259b);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping cue with bad header: ".concat(valueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(String str, C0146e c0146e) {
        Matcher matcher = f10248b.matcher(str);
        while (matcher.find()) {
            int i10 = 1;
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            try {
                if ("line".equals(group)) {
                    g(group2, c0146e);
                } else if ("align".equals(group)) {
                    char c10 = 65535;
                    switch (group2.hashCode()) {
                        case -1364013995:
                            if (group2.equals("center")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case -1074341483:
                            if (!group2.equals("middle")) {
                                break;
                            } else {
                                c10 = 1;
                                break;
                            }
                        case 100571:
                            if (group2.equals("end")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3317767:
                            if (group2.equals("left")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 108511772:
                            if (group2.equals("right")) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 109757538:
                            if (!group2.equals("start")) {
                                break;
                            } else {
                                c10 = 5;
                                break;
                            }
                    }
                    switch (c10) {
                        case 0:
                        case 1:
                            i10 = 2;
                            break;
                        case 2:
                            i10 = 3;
                            break;
                        case 3:
                            i10 = 4;
                            break;
                        case 4:
                            i10 = 5;
                            break;
                        case 5:
                            break;
                        default:
                            Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid alignment value: ".concat(group2) : new String("Invalid alignment value: "));
                            i10 = 2;
                            break;
                    }
                    c0146e.d = i10;
                } else if ("position".equals(group)) {
                    h(group2, c0146e);
                } else if ("size".equals(group)) {
                    c0146e.f10266j = g.a(group2);
                } else if ("vertical".equals(group)) {
                    if (group2.equals("lr")) {
                        i10 = 2;
                    } else if (!group2.equals("rl")) {
                        Log.w("WebvttCueParser", group2.length() != 0 ? "Invalid 'vertical' value: ".concat(group2) : new String("Invalid 'vertical' value: "));
                        i10 = IntCompanionObject.MIN_VALUE;
                    }
                    c0146e.f10267k = i10;
                } else {
                    StringBuilder sb2 = new StringBuilder(group.length() + 21 + group2.length());
                    sb2.append("Unknown cue setting ");
                    sb2.append(group);
                    sb2.append(":");
                    sb2.append(group2);
                    Log.w("WebvttCueParser", sb2.toString());
                }
            } catch (NumberFormatException unused) {
                String valueOf = String.valueOf(matcher.group());
                Log.w("WebvttCueParser", valueOf.length() != 0 ? "Skipping bad cue setting: ".concat(valueOf) : new String("Skipping bad cue setting: "));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static SpannedString f(String str, String str2, List<h8.c> list) {
        char c10;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int length = str2.length();
            String str3 = BuildConfig.FLAVOR;
            if (i11 >= length) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new c(BuildConfig.FLAVOR, 0, BuildConfig.FLAVOR, Collections.emptySet()), Collections.emptyList(), spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char charAt = str2.charAt(i11);
            if (charAt == '&') {
                i11++;
                int indexOf = str2.indexOf(59, i11);
                int indexOf2 = str2.indexOf(32, i11);
                char c11 = 65535;
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    String substring = str2.substring(i11, indexOf);
                    Objects.requireNonNull(substring);
                    switch (substring.hashCode()) {
                        case 3309:
                            if (substring.equals("gt")) {
                                c11 = 0;
                                break;
                            }
                            break;
                        case 3464:
                            if (substring.equals("lt")) {
                                c11 = 1;
                                break;
                            }
                            break;
                        case 96708:
                            if (substring.equals("amp")) {
                                c11 = 2;
                                break;
                            }
                            break;
                        case 3374865:
                            if (substring.equals("nbsp")) {
                                c11 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c11) {
                        case 0:
                            spannableStringBuilder.append(Typography.greater);
                            break;
                        case 1:
                            spannableStringBuilder.append(Typography.less);
                            break;
                        case 2:
                            spannableStringBuilder.append(Typography.amp);
                            break;
                        case 3:
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder(substring.length() + 33);
                            sb2.append("ignoring unsupported entity: '&");
                            sb2.append(substring);
                            sb2.append(";'");
                            Log.w("WebvttCueParser", sb2.toString());
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i11 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i11++;
            } else {
                int i12 = i11 + 1;
                if (i12 < str2.length()) {
                    boolean z11 = str2.charAt(i12) == '/';
                    int indexOf3 = str2.indexOf(62, i12);
                    i12 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i13 = i12 - 2;
                    boolean z12 = str2.charAt(i13) == '/';
                    int i14 = i11 + (z11 ? 2 : 1);
                    if (!z12) {
                        i13 = i12 - 1;
                    }
                    String substring2 = str2.substring(i14, i13);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        k8.a.c(!trim.isEmpty());
                        int i15 = c0.f11939a;
                        String str4 = trim.split("[ \\.]", 2)[i10];
                        Objects.requireNonNull(str4);
                        switch (str4.hashCode()) {
                            case 98:
                                if (str4.equals("b")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 99:
                                if (str4.equals(DvdsConfig.TYPE_CATEGORY)) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 105:
                                if (str4.equals("i")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 117:
                                if (str4.equals("u")) {
                                    c10 = 3;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 118:
                                if (str4.equals("v")) {
                                    c10 = 4;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3650:
                                if (str4.equals("rt")) {
                                    c10 = 5;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3314158:
                                if (str4.equals("lang")) {
                                    c10 = 6;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 3511770:
                                if (str4.equals("ruby")) {
                                    c10 = 7;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                                z10 = true;
                                break;
                            default:
                                z10 = false;
                                break;
                        }
                        if (z10) {
                            if (z11) {
                                while (!arrayDeque.isEmpty()) {
                                    c cVar = (c) arrayDeque.pop();
                                    a(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (arrayDeque.isEmpty()) {
                                        arrayList.clear();
                                    } else {
                                        arrayList.add(new b(cVar, spannableStringBuilder.length(), null));
                                    }
                                    if (cVar.f10253a.equals(str4)) {
                                    }
                                }
                            } else if (!z12) {
                                int length2 = spannableStringBuilder.length();
                                String trim2 = substring2.trim();
                                k8.a.c(!trim2.isEmpty());
                                int indexOf4 = trim2.indexOf(" ");
                                if (indexOf4 != -1) {
                                    str3 = trim2.substring(indexOf4).trim();
                                    trim2 = trim2.substring(i10, indexOf4);
                                }
                                String[] F = c0.F(trim2, "\\.");
                                String str5 = F[i10];
                                HashSet hashSet = new HashSet();
                                for (int i16 = 1; i16 < F.length; i16++) {
                                    hashSet.add(F[i16]);
                                }
                                arrayDeque.push(new c(str5, length2, str3, hashSet));
                            }
                        }
                    }
                    i11 = i12;
                }
                i11 = i12;
            }
            i10 = 0;
        }
    }

    public static void g(String str, C0146e c0146e) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            Objects.requireNonNull(substring);
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i10 = IntCompanionObject.MIN_VALUE;
                    break;
            }
            c0146e.f10263g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            c0146e.f10261e = g.a(str);
            c0146e.f10262f = 0;
            return;
        }
        c0146e.f10261e = Integer.parseInt(str);
        c0146e.f10262f = 1;
    }

    public static void h(String str, C0146e c0146e) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            Objects.requireNonNull(substring);
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1842484672:
                    if (substring.equals("line-left")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (!substring.equals("center")) {
                        break;
                    } else {
                        c10 = 1;
                        break;
                    }
                case -1276788989:
                    if (substring.equals("line-right")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 109757538:
                    if (!substring.equals("start")) {
                        break;
                    } else {
                        c10 = 5;
                        break;
                    }
            }
            switch (c10) {
                case 0:
                case 5:
                    i10 = 0;
                    break;
                case 1:
                case 3:
                    i10 = 1;
                    break;
                case 2:
                case 4:
                    break;
                default:
                    Log.w("WebvttCueParser", substring.length() != 0 ? "Invalid anchor value: ".concat(substring) : new String("Invalid anchor value: "));
                    i10 = IntCompanionObject.MIN_VALUE;
                    break;
            }
            c0146e.f10265i = i10;
            str = str.substring(0, indexOf);
        }
        c0146e.f10264h = g.a(str);
    }
}
