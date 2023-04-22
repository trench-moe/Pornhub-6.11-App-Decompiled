package h8;

import com.appsflyer.oaid.BuildConfig;
import java.util.regex.Pattern;
import k8.t;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f10226c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    public final t f10227a = new t();

    /* renamed from: b  reason: collision with root package name */
    public final StringBuilder f10228b = new StringBuilder();

    public static String a(t tVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = tVar.f12010b;
        int i11 = tVar.f12011c;
        while (i10 < i11 && !z10) {
            char c10 = (char) tVar.f12009a[i10];
            if (c10 >= 'A') {
                if (c10 <= 'Z') {
                    i10++;
                    sb2.append(c10);
                }
            }
            if (c10 >= 'a') {
                if (c10 <= 'z') {
                    i10++;
                    sb2.append(c10);
                }
            }
            if (c10 >= '0' && c10 <= '9') {
                i10++;
                sb2.append(c10);
            }
            if (c10 != '#' && c10 != '-' && c10 != '.') {
                if (c10 == '_') {
                    i10++;
                    sb2.append(c10);
                } else {
                    z10 = true;
                }
            }
            i10++;
            sb2.append(c10);
        }
        tVar.E(i10 - tVar.f12010b);
        return sb2.toString();
    }

    public static String b(t tVar, StringBuilder sb2) {
        c(tVar);
        if (tVar.a() == 0) {
            return null;
        }
        String a10 = a(tVar, sb2);
        if (BuildConfig.FLAVOR.equals(a10)) {
            StringBuilder sb3 = new StringBuilder(1);
            sb3.append((char) tVar.s());
            return sb3.toString();
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0088 A[LOOP:1: B:4:0x0005->B:40:0x0088, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(k8.t r11) {
        /*
            r8 = r11
            r10 = 1
            r0 = r10
        L3:
            r10 = 1
            r1 = r10
        L5:
            int r10 = r8.a()
            r2 = r10
            if (r2 <= 0) goto L8d
            r10 = 2
            if (r1 == 0) goto L8d
            r10 = 7
            int r1 = r8.f12010b
            r10 = 2
            byte[] r2 = r8.f12009a
            r1 = r2[r1]
            char r1 = (char) r1
            r10 = 1
            r2 = 9
            r10 = 1
            r3 = 0
            if (r1 == r2) goto L36
            r10 = 1
            r2 = 10
            if (r1 == r2) goto L36
            r10 = 12
            r2 = r10
            if (r1 == r2) goto L36
            r10 = 13
            r2 = r10
            if (r1 == r2) goto L36
            r2 = 32
            r10 = 4
            if (r1 == r2) goto L36
            r10 = 0
            r1 = r10
            goto L3b
        L36:
            r10 = 7
            r8.E(r0)
            r1 = 1
        L3b:
            if (r1 != 0) goto L3
            int r1 = r8.f12010b
            int r2 = r8.f12011c
            byte[] r4 = r8.f12009a
            r10 = 2
            int r5 = r1 + 2
            r10 = 1
            if (r5 > r2) goto L81
            r10 = 7
            int r5 = r1 + 1
            r10 = 6
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L81
            int r1 = r5 + 1
            r10 = 1
            r5 = r4[r5]
            r10 = 42
            r7 = r10
            if (r5 != r7) goto L81
            r10 = 2
        L5e:
            int r5 = r1 + 1
            if (r5 >= r2) goto L77
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L74
            r1 = r4[r5]
            r10 = 1
            char r1 = (char) r1
            r10 = 4
            if (r1 != r6) goto L74
            r10 = 7
            int r2 = r5 + 1
            r10 = 6
            r1 = r2
            goto L5e
        L74:
            r10 = 5
            r1 = r5
            goto L5e
        L77:
            r10 = 1
            int r1 = r8.f12010b
            int r2 = r2 - r1
            r8.E(r2)
            r10 = 1
            r1 = r10
            goto L83
        L81:
            r10 = 0
            r1 = r10
        L83:
            if (r1 == 0) goto L88
            r10 = 7
            goto L3
        L88:
            r10 = 5
            r10 = 0
            r1 = r10
            goto L5
        L8d:
            r10 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.b.c(k8.t):void");
    }
}
