package androidx.recyclerview.widget;

import androidx.recyclerview.widget.n;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f2957c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List f2958f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f2959j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Runnable f2960m;
    public final /* synthetic */ e n;

    /* loaded from: classes.dex */
    public class a extends n.b {
        public a() {
        }

        @Override // androidx.recyclerview.widget.n.b
        public boolean a(int i10, int i11) {
            Object obj = d.this.f2957c.get(i10);
            Object obj2 = d.this.f2958f.get(i11);
            if (obj == null || obj2 == null) {
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }
            return d.this.n.f2966b.f2951b.a(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public boolean b(int i10, int i11) {
            Object obj = d.this.f2957c.get(i10);
            Object obj2 = d.this.f2958f.get(i11);
            return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.n.f2966b.f2951b.b(obj, obj2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public Object c(int i10, int i11) {
            Object obj = d.this.f2957c.get(i10);
            Object obj2 = d.this.f2958f.get(i11);
            if (obj == null || obj2 == null) {
                throw new AssertionError();
            }
            Objects.requireNonNull(d.this.n.f2966b.f2951b);
            return null;
        }

        @Override // androidx.recyclerview.widget.n.b
        public int d() {
            return d.this.f2958f.size();
        }

        @Override // androidx.recyclerview.widget.n.b
        public int e() {
            return d.this.f2957c.size();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n.d f2962c;

        public b(n.d dVar) {
            this.f2962c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            e eVar = dVar.n;
            if (eVar.f2970g == dVar.f2959j) {
                List<T> list = dVar.f2958f;
                n.d dVar2 = this.f2962c;
                Runnable runnable = dVar.f2960m;
                Collection collection = eVar.f2969f;
                eVar.f2968e = list;
                eVar.f2969f = Collections.unmodifiableList(list);
                dVar2.b(eVar.f2965a);
                eVar.a(collection, runnable);
            }
        }
    }

    public d(e eVar, List list, List list2, int i10, Runnable runnable) {
        this.n = eVar;
        this.f2957c = list;
        this.f2958f = list2;
        this.f2959j = i10;
        this.f2960m = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.n.f2967c.execute(new b(n.a(new a(), true)));
    }
}
