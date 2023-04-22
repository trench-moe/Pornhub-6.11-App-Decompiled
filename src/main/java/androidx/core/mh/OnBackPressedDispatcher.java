package androidx.core.mh;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f1842a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<f> f1843b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements i, androidx.core.mh.a {

        /* renamed from: a  reason: collision with root package name */
        public final Lifecycle f1844a;

        /* renamed from: b  reason: collision with root package name */
        public final f f1845b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.core.mh.a f1846c;

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, f fVar) {
            this.f1844a = lifecycle;
            this.f1845b = fVar;
            lifecycle.a(this);
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                f fVar = this.f1845b;
                onBackPressedDispatcher.f1843b.add(fVar);
                a aVar = new a(fVar);
                fVar.f1858b.add(aVar);
                this.f1846c = aVar;
            } else if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.core.mh.a aVar2 = this.f1846c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }

        @Override // androidx.core.mh.a
        public void cancel() {
            l lVar = (l) this.f1844a;
            lVar.d("removeObserver");
            lVar.f2374a.j(this);
            this.f1845b.f1858b.remove(this);
            androidx.core.mh.a aVar = this.f1846c;
            if (aVar != null) {
                aVar.cancel();
                this.f1846c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.core.mh.a {

        /* renamed from: a  reason: collision with root package name */
        public final f f1847a;

        public a(f fVar) {
            this.f1847a = fVar;
        }

        @Override // androidx.core.mh.a
        public void cancel() {
            OnBackPressedDispatcher.this.f1843b.remove(this.f1847a);
            this.f1847a.f1858b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1842a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(k kVar, f fVar) {
        Lifecycle b10 = kVar.b();
        if (((l) b10).f2375b == Lifecycle.State.DESTROYED) {
            return;
        }
        fVar.f1858b.add(new LifecycleOnBackPressedCancellable(b10, fVar));
    }

    public void b() {
        Iterator<f> descendingIterator = this.f1843b.descendingIterator();
        while (descendingIterator.hasNext()) {
            f next = descendingIterator.next();
            if (next.f1857a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f1842a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
