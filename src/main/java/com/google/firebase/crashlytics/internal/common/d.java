package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.p;
import com.appsflyer.oaid.BuildConfig;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import ea.f;
import ea.g;
import ea.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import sb.d;
import vb.l;
import vb.q;
import vb.s;
import vb.w;
import vb.z;
import xb.a0;
import xb.b;
import xb.g;
import xb.j;
import xb.u;
import xb.x;
import xb.y;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8005a;

    /* renamed from: b  reason: collision with root package name */
    public final s f8006b;

    /* renamed from: c  reason: collision with root package name */
    public final p f8007c;
    public final vb.e d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8008e;

    /* renamed from: f  reason: collision with root package name */
    public final ac.c f8009f;

    /* renamed from: g  reason: collision with root package name */
    public final vb.a f8010g;

    /* renamed from: h  reason: collision with root package name */
    public final wb.c f8011h;

    /* renamed from: i  reason: collision with root package name */
    public final sb.a f8012i;

    /* renamed from: j  reason: collision with root package name */
    public final tb.a f8013j;

    /* renamed from: k  reason: collision with root package name */
    public final z f8014k;

    /* renamed from: l  reason: collision with root package name */
    public e f8015l;

    /* renamed from: m  reason: collision with root package name */
    public final h<Boolean> f8016m = new h<>();
    public final h<Boolean> n = new h<>();

    /* renamed from: o  reason: collision with root package name */
    public final h<Void> f8017o = new h<>();

    /* loaded from: classes.dex */
    public class a implements f<Boolean, Void> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ g f8018c;

        public a(g gVar) {
            this.f8018c = gVar;
        }

        @Override // ea.f
        public g<Void> a(Boolean bool) {
            return d.this.d.c(new c(this, bool));
        }
    }

    public d(Context context, vb.e eVar, w wVar, s sVar, ac.c cVar, p pVar, vb.a aVar, wb.g gVar, wb.c cVar2, z zVar, sb.a aVar2, tb.a aVar3) {
        new AtomicBoolean(false);
        this.f8005a = context;
        this.d = eVar;
        this.f8008e = wVar;
        this.f8006b = sVar;
        this.f8009f = cVar;
        this.f8007c = pVar;
        this.f8010g = aVar;
        this.f8011h = cVar2;
        this.f8012i = aVar2;
        this.f8013j = aVar3;
        this.f8014k = zVar;
    }

    public static void a(d dVar, String str) {
        d.a aVar;
        Integer num;
        Objects.requireNonNull(dVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String l10 = a1.a.l("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", l10, null);
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "18.2.8");
        w wVar = dVar.f8008e;
        vb.a aVar2 = dVar.f8010g;
        x xVar = new x(wVar.f16186c, aVar2.f16112e, aVar2.f16113f, wVar.c(), (aVar2.f16111c != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).b(), aVar2.f16114g);
        Context context = dVar.f8005a;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        xb.z zVar = new xb.z(str2, str3, CommonUtils.k(context));
        Context context2 = dVar.f8005a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        CommonUtils.Architecture architecture = CommonUtils.Architecture.UNKNOWN;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            CommonUtils.Architecture architecture2 = (CommonUtils.Architecture) ((HashMap) CommonUtils.Architecture.f7994f).get(str4.toLowerCase(locale));
            if (architecture2 != null) {
                architecture = architecture2;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = architecture.ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long h10 = CommonUtils.h();
        boolean j10 = CommonUtils.j(context2);
        int d = CommonUtils.d(context2);
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        dVar.f8012i.c(str, format, currentTimeMillis, new xb.w(xVar, zVar, new y(ordinal, str5, availableProcessors, h10, blockCount, j10, d, str6, str7)));
        dVar.f8011h.a(str);
        z zVar2 = dVar.f8014k;
        q qVar = zVar2.f16191a;
        Objects.requireNonNull(qVar);
        Charset charset = a0.f18195a;
        b.C0305b c0305b = new b.C0305b();
        c0305b.f18203a = "18.2.8";
        String str8 = qVar.f16168c.f16109a;
        Objects.requireNonNull(str8, "Null gmpAppId");
        c0305b.f18204b = str8;
        String c10 = qVar.f16167b.c();
        Objects.requireNonNull(c10, "Null installationUuid");
        c0305b.d = c10;
        String str9 = qVar.f16168c.f16112e;
        Objects.requireNonNull(str9, "Null buildVersion");
        c0305b.f18206e = str9;
        String str10 = qVar.f16168c.f16113f;
        Objects.requireNonNull(str10, "Null displayVersion");
        c0305b.f18207f = str10;
        c0305b.f18205c = 4;
        g.b bVar = new g.b();
        bVar.b(false);
        bVar.f18243c = Long.valueOf(currentTimeMillis);
        Objects.requireNonNull(str, "Null identifier");
        bVar.f18242b = str;
        String str11 = q.f16165f;
        Objects.requireNonNull(str11, "Null generator");
        bVar.f18241a = str11;
        String str12 = qVar.f16167b.f16186c;
        Objects.requireNonNull(str12, "Null identifier");
        String str13 = qVar.f16168c.f16112e;
        Objects.requireNonNull(str13, "Null version");
        String str14 = qVar.f16168c.f16113f;
        String c11 = qVar.f16167b.c();
        sb.d dVar2 = qVar.f16168c.f16114g;
        if (dVar2.f14945b == null) {
            aVar = null;
            dVar2.f14945b = new d.b(dVar2, null);
        } else {
            aVar = null;
        }
        String str15 = dVar2.f14945b.f14946a;
        sb.d dVar3 = qVar.f16168c.f16114g;
        if (dVar3.f14945b == null) {
            dVar3.f14945b = new d.b(dVar3, aVar);
        }
        bVar.f18245f = new xb.h(str12, str13, str14, null, c11, str15, dVar3.f14945b.f14947b, null);
        Integer num2 = 3;
        Boolean valueOf = Boolean.valueOf(CommonUtils.k(qVar.f16166a));
        String str16 = num2 == null ? " platform" : BuildConfig.FLAVOR;
        if (valueOf == null) {
            str16 = a1.a.l(str16, " jailbroken");
        }
        if (!str16.isEmpty()) {
            throw new IllegalStateException(a1.a.l("Missing required properties:", str16));
        }
        bVar.f18247h = new u(num2.intValue(), str2, str3, valueOf.booleanValue(), null);
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) ((HashMap) q.f16164e).get(str4.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long h11 = CommonUtils.h();
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean j11 = CommonUtils.j(qVar.f16166a);
        int d10 = CommonUtils.d(qVar.f16166a);
        j.b bVar2 = new j.b();
        bVar2.f18265a = Integer.valueOf(i10);
        bVar2.f18266b = str5;
        bVar2.f18267c = Integer.valueOf(availableProcessors2);
        bVar2.d = Long.valueOf(h11);
        bVar2.f18268e = Long.valueOf(blockCount2);
        bVar2.f18269f = Boolean.valueOf(j11);
        bVar2.f18270g = Integer.valueOf(d10);
        bVar2.f18271h = str6;
        bVar2.f18272i = str7;
        bVar.f18248i = bVar2.a();
        bVar.f18250k = 3;
        c0305b.f18208g = bVar.a();
        a0 a10 = c0305b.a();
        ac.b bVar3 = zVar2.f16192b;
        Objects.requireNonNull(bVar3);
        a0.e h12 = a10.h();
        if (h12 == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String g10 = h12.g();
        try {
            ac.b.f(bVar3.f350b.f(g10, "report"), ac.b.f346f.h(a10));
            File f10 = bVar3.f350b.f(g10, "start-time");
            long i11 = h12.i();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f10), ac.b.d);
            outputStreamWriter.write(BuildConfig.FLAVOR);
            f10.setLastModified(i11 * 1000);
            outputStreamWriter.close();
        } catch (IOException e10) {
            String l11 = a1.a.l("Could not persist report for session ", g10);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", l11, e10);
            }
        }
    }

    public static ea.g b(d dVar) {
        boolean z10;
        ea.g b10;
        Objects.requireNonNull(dVar);
        ArrayList arrayList = new ArrayList();
        ac.c cVar = dVar.f8009f;
        for (File file : ac.c.i(cVar.f352a.listFiles(vb.g.f16129b))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                    z10 = false;
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    b10 = ea.j.d(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    b10 = ea.j.b(new ScheduledThreadPoolExecutor(1), new l(dVar, parseLong));
                }
                arrayList.add(b10);
            } catch (NumberFormatException unused2) {
                StringBuilder m10 = a1.a.m("Could not parse app exception timestamp from file ");
                m10.append(file.getName());
                Log.w("FirebaseCrashlytics", m10.toString(), null);
            }
            file.delete();
        }
        return ea.j.e(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r27, cc.c r28) {
        /*
            Method dump skipped, instructions count: 1277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.d.c(boolean, cc.c):void");
    }

    public final void d(long j10) {
        try {
            ac.c cVar = this.f8009f;
            if (cVar.a(".ae" + j10).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
    }

    public boolean e(cc.c cVar) {
        this.d.a();
        e eVar = this.f8015l;
        if (eVar != null && eVar.f8023e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            c(true, cVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String f() {
        SortedSet<String> c10 = this.f8014k.f16192b.c();
        if (c10.isEmpty()) {
            return null;
        }
        return c10.first();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ea.g<java.lang.Void> g(ea.g<dc.a> r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.d.g(ea.g):ea.g");
    }
}
