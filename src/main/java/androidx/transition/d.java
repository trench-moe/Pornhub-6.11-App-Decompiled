package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import u1.l;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static Transition f3255a = new AutoTransition();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<p.a<ViewGroup, ArrayList<Transition>>>> f3256b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f3257c = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: c  reason: collision with root package name */
        public Transition f3258c;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f3259f;

        /* renamed from: androidx.transition.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0041a extends c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ p.a f3260a;

            public C0041a(p.a aVar) {
                this.f3260a = aVar;
            }

            @Override // androidx.transition.Transition.d
            public void c(Transition transition) {
                ((ArrayList) this.f3260a.get(a.this.f3259f)).remove(transition);
                transition.A(this);
            }
        }

        public a(Transition transition, ViewGroup viewGroup) {
            this.f3258c = transition;
            this.f3259f = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0222  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x01fa A[EDGE_INSN: B:141:0x01fa->B:90:0x01fa ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0200  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 721
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.d.a.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f3259f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f3259f.removeOnAttachStateChangeListener(this);
            d.f3257c.remove(this.f3259f);
            ArrayList<Transition> arrayList = d.b().get(this.f3259f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().C(this.f3259f);
                }
            }
            this.f3258c.k(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        if (f3257c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.g.c(viewGroup)) {
            f3257c.add(viewGroup);
            if (transition == null) {
                transition = f3255a;
            }
            Transition clone = transition.clone();
            ArrayList<Transition> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<Transition> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().z(viewGroup);
                }
            }
            if (clone != null) {
                clone.j(viewGroup, true);
            }
            if (((l) viewGroup.getTag(R.id.transition_current_scene)) != null) {
                throw null;
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                a aVar = new a(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(aVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
            }
        }
    }

    public static p.a<ViewGroup, ArrayList<Transition>> b() {
        p.a<ViewGroup, ArrayList<Transition>> aVar;
        WeakReference<p.a<ViewGroup, ArrayList<Transition>>> weakReference = f3256b.get();
        if (weakReference == null || (aVar = weakReference.get()) == null) {
            p.a<ViewGroup, ArrayList<Transition>> aVar2 = new p.a<>();
            f3256b.set(new WeakReference<>(aVar2));
            return aVar2;
        }
        return aVar;
    }
}
