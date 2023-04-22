package vb;

import android.content.Context;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import xb.a0;
import xb.r;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Integer> f16164e;

    /* renamed from: f  reason: collision with root package name */
    public static final String f16165f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f16166a;

    /* renamed from: b  reason: collision with root package name */
    public final w f16167b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16168c;
    public final ec.a d;

    static {
        HashMap hashMap = new HashMap();
        f16164e = hashMap;
        a0.a.r(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
        f16165f = String.format(Locale.US, "Crashlytics Android SDK/%s", "18.2.8");
    }

    public q(Context context, w wVar, a aVar, ec.a aVar2) {
        this.f16166a = context;
        this.f16167b = wVar;
        this.f16168c = aVar;
        this.d = aVar2;
    }

    public final xb.b0<a0.e.d.a.b.AbstractC0298a> a() {
        a0.e.d.a.b.AbstractC0298a[] abstractC0298aArr = new a0.e.d.a.b.AbstractC0298a[1];
        Long l10 = 0L;
        Long l11 = 0L;
        String str = this.f16168c.d;
        Objects.requireNonNull(str, "Null name");
        String str2 = this.f16168c.f16110b;
        String str3 = l10 == null ? " baseAddress" : BuildConfig.FLAVOR;
        if (l11 == null) {
            str3 = a1.a.l(str3, " size");
        }
        if (str3.isEmpty()) {
            abstractC0298aArr[0] = new xb.n(l10.longValue(), l11.longValue(), str, str2, null);
            return new xb.b0<>(Arrays.asList(abstractC0298aArr));
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:5|(7:(1:46)(2:42|(1:44))|45|9|10|(1:(2:13|14)(1:36))|38|14)(1:7)|8|9|10|(0)|38|14) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
        android.util.Log.e("FirebaseCrashlytics", "An error occurred getting battery state.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final xb.a0.e.d.c b(int r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vb.q.b(int):xb.a0$e$d$c");
    }

    public final a0.e.d.a.b.AbstractC0299b c(z.a aVar, int i10, int i11, int i12) {
        String str = (String) aVar.f18662b;
        String str2 = (String) aVar.f18661a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) aVar.f18663c;
        int i13 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        z.a aVar2 = (z.a) aVar.d;
        if (i12 >= i11) {
            z.a aVar3 = aVar2;
            while (aVar3 != null) {
                aVar3 = (z.a) aVar3.d;
                i13++;
            }
        }
        Objects.requireNonNull(str, "Null type");
        xb.b0 b0Var = new xb.b0(d(stackTraceElementArr, i10));
        Integer valueOf = Integer.valueOf(i13);
        a0.e.d.a.b.AbstractC0299b c10 = (aVar2 == null || i13 != 0) ? null : c(aVar2, i10, i11, i12 + 1);
        String str3 = valueOf == null ? " overflowCount" : BuildConfig.FLAVOR;
        if (str3.isEmpty()) {
            return new xb.o(str, str2, b0Var, c10, valueOf.intValue(), null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }

    public final xb.b0<a0.e.d.a.b.AbstractC0300d.AbstractC0301a> d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            r.b bVar = new r.b();
            bVar.f18313e = Integer.valueOf(i10);
            long j10 = 0;
            long max = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j10 = stackTraceElement.getLineNumber();
            }
            bVar.f18310a = Long.valueOf(max);
            Objects.requireNonNull(str, "Null symbol");
            bVar.f18311b = str;
            bVar.f18312c = fileName;
            bVar.d = Long.valueOf(j10);
            arrayList.add(bVar.a());
        }
        return new xb.b0<>(arrayList);
    }

    public final a0.e.d.a.b.c e() {
        Long l10 = 0L;
        String str = l10 == null ? " address" : BuildConfig.FLAVOR;
        if (str.isEmpty()) {
            return new xb.p("0", "0", l10.longValue(), null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str));
    }

    public final a0.e.d.a.b.AbstractC0300d f(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        String name = thread.getName();
        Objects.requireNonNull(name, "Null name");
        Integer valueOf = Integer.valueOf(i10);
        xb.b0 b0Var = new xb.b0(d(stackTraceElementArr, i10));
        String str = valueOf == null ? " importance" : BuildConfig.FLAVOR;
        if (str.isEmpty()) {
            return new xb.q(name, valueOf.intValue(), b0Var, null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str));
    }
}
