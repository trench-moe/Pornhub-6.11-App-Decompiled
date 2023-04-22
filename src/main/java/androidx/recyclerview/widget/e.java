package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class e<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final Executor f2964h = new b();

    /* renamed from: a  reason: collision with root package name */
    public final u f2965a;

    /* renamed from: b  reason: collision with root package name */
    public final c<T> f2966b;

    /* renamed from: e  reason: collision with root package name */
    public List<T> f2968e;

    /* renamed from: g  reason: collision with root package name */
    public int f2970g;
    public final List<a<T>> d = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    public List<T> f2969f = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Executor f2967c = f2964h;

    /* loaded from: classes.dex */
    public interface a<T> {
        void a(List<T> list, List<T> list2);
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {

        /* renamed from: c  reason: collision with root package name */
        public final Handler f2971c = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f2971c.post(runnable);
        }
    }

    public e(u uVar, c<T> cVar) {
        this.f2965a = uVar;
        this.f2966b = cVar;
    }

    public final void a(List<T> list, Runnable runnable) {
        for (a<T> aVar : this.d) {
            aVar.a(list, this.f2969f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
