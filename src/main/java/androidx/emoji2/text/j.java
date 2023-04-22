package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.emoji2.text.d;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class j extends d.c {
    public static final a d = new a();

    /* loaded from: classes.dex */
    public static class a {
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1979a;

        /* renamed from: b  reason: collision with root package name */
        public final j0.e f1980b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1981c;
        public final Object d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1982e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1983f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1984g;

        /* renamed from: h  reason: collision with root package name */
        public d.h f1985h;

        /* renamed from: i  reason: collision with root package name */
        public ContentObserver f1986i;

        /* renamed from: j  reason: collision with root package name */
        public Runnable f1987j;

        public b(Context context, j0.e eVar, a aVar) {
            cb.e.u(context, "Context cannot be null");
            cb.e.u(eVar, "FontRequest cannot be null");
            this.f1979a = context.getApplicationContext();
            this.f1980b = eVar;
            this.f1981c = aVar;
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            synchronized (this.d) {
                this.f1985h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.d) {
                this.f1985h = null;
                ContentObserver contentObserver = this.f1986i;
                if (contentObserver != null) {
                    a aVar = this.f1981c;
                    Context context = this.f1979a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f1986i = null;
                }
                Handler handler = this.f1982e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1987j);
                }
                this.f1982e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1984g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1983f = null;
                this.f1984g = null;
            }
        }

        public void c() {
            synchronized (this.d) {
                if (this.f1985h == null) {
                    return;
                }
                if (this.f1983f == null) {
                    ThreadPoolExecutor a10 = androidx.emoji2.text.b.a("emojiCompat");
                    this.f1984g = a10;
                    this.f1983f = a10;
                }
                this.f1983f.execute(new l(this, 0));
            }
        }

        public final j0.l d() {
            try {
                a aVar = this.f1981c;
                Context context = this.f1979a;
                j0.e eVar = this.f1980b;
                Objects.requireNonNull(aVar);
                j0.k a10 = j0.d.a(context, eVar, null);
                if (a10.f11119a == 0) {
                    j0.l[] lVarArr = a10.f11120b;
                    if (lVarArr == null || lVarArr.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return lVarArr[0];
                }
                throw new RuntimeException(android.support.v4.media.a.j(a1.a.m("fetchFonts failed ("), a10.f11119a, ")"));
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }
    }

    public j(Context context, j0.e eVar) {
        super(new b(context, eVar, d));
    }
}
