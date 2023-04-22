package vb;

import android.content.Context;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16148a;

    /* renamed from: b  reason: collision with root package name */
    public final s f16149b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16150c;
    public androidx.appcompat.widget.p d;

    /* renamed from: e  reason: collision with root package name */
    public androidx.appcompat.widget.p f16151e;

    /* renamed from: f  reason: collision with root package name */
    public com.google.firebase.crashlytics.internal.common.d f16152f;

    /* renamed from: g  reason: collision with root package name */
    public final w f16153g;

    /* renamed from: h  reason: collision with root package name */
    public final ac.c f16154h;

    /* renamed from: i  reason: collision with root package name */
    public final ub.b f16155i;

    /* renamed from: j  reason: collision with root package name */
    public final tb.a f16156j;

    /* renamed from: k  reason: collision with root package name */
    public final ExecutorService f16157k;

    /* renamed from: l  reason: collision with root package name */
    public final e f16158l;

    /* renamed from: m  reason: collision with root package name */
    public final sb.a f16159m;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ cc.c f16160c;

        public a(cc.c cVar) {
            this.f16160c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            o.a(o.this, this.f16160c);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements Callable<Boolean> {
        public b() {
        }

        @Override // java.util.concurrent.Callable
        public Boolean call() {
            try {
                boolean delete = o.this.d.c().delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public o(mb.c cVar, w wVar, sb.a aVar, s sVar, ub.b bVar, tb.a aVar2, ac.c cVar2, ExecutorService executorService) {
        this.f16149b = sVar;
        cVar.a();
        this.f16148a = cVar.f13066a;
        this.f16153g = wVar;
        this.f16159m = aVar;
        this.f16155i = bVar;
        this.f16156j = aVar2;
        this.f16157k = executorService;
        this.f16154h = cVar2;
        this.f16158l = new e(executorService);
        this.f16150c = System.currentTimeMillis();
    }

    public static ea.g a(final o oVar, cc.c cVar) {
        ea.g<Void> c10;
        oVar.f16158l.a();
        oVar.d.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                oVar.f16155i.b(new ub.a() { // from class: vb.m
                    @Override // ub.a
                    public final void a(String str) {
                        o oVar2 = o.this;
                        Objects.requireNonNull(oVar2);
                        long currentTimeMillis = System.currentTimeMillis() - oVar2.f16150c;
                        com.google.firebase.crashlytics.internal.common.d dVar = oVar2.f16152f;
                        dVar.d.b(new j(dVar, currentTimeMillis, str));
                    }
                });
                cc.b bVar = (cc.b) cVar;
                if (bVar.b().a().f8895a) {
                    if (!oVar.f16152f.e(bVar)) {
                        Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                    }
                    c10 = oVar.f16152f.g(bVar.f4024i.get().f9273a);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    c10 = ea.j.c(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
                c10 = ea.j.c(e10);
            }
            return c10;
        } finally {
            oVar.c();
        }
    }

    public final void b(cc.c cVar) {
        Future<?> submit = this.f16157k.submit(new a(cVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public void c() {
        this.f16158l.b(new b());
    }
}
