package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements q1.b<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f1951b = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1934a;

        public b(Context context) {
            this.f1934a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            ThreadPoolExecutor a10 = androidx.emoji2.text.b.a("EmojiCompatInitializer");
            a10.execute(new e(this, hVar, a10, 0));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                int i10 = i0.h.f10456a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.c()) {
                    d.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i11 = i0.h.f10456a;
                Trace.endSection();
                throw th;
            }
        }
    }

    @Override // q1.b
    public List<Class<? extends q1.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // q1.b
    public /* bridge */ /* synthetic */ Boolean b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public Boolean c(Context context) {
        a aVar = new a(context);
        if (d.f1937k == null) {
            synchronized (d.f1936j) {
                if (d.f1937k == null) {
                    d.f1937k = new d(aVar);
                }
            }
        }
        q1.a b10 = q1.a.b(context);
        Objects.requireNonNull(b10);
        final Lifecycle b11 = ((androidx.lifecycle.k) b10.a(ProcessLifecycleInitializer.class, new HashSet())).b();
        b11.a(new androidx.lifecycle.e() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.e
            public void a(androidx.lifecycle.k kVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                androidx.emoji2.text.b.b().postDelayed(new c(), 500L);
                androidx.lifecycle.l lVar = (androidx.lifecycle.l) b11;
                lVar.d("removeObserver");
                lVar.f2374a.j(this);
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void b(androidx.lifecycle.k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void d(androidx.lifecycle.k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void e(androidx.lifecycle.k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void f(androidx.lifecycle.k kVar) {
            }

            @Override // androidx.lifecycle.e
            public /* synthetic */ void g(androidx.lifecycle.k kVar) {
            }
        });
        return Boolean.TRUE;
    }
}
