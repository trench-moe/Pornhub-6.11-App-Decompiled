package n5;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import n5.m;

/* loaded from: classes2.dex */
public class p<Model, Data> implements m<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<m<Model, Data>> f13345a;

    /* renamed from: b  reason: collision with root package name */
    public final m0.c<List<Throwable>> f13346b;

    /* loaded from: classes2.dex */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: c  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f13347c;

        /* renamed from: f  reason: collision with root package name */
        public final m0.c<List<Throwable>> f13348f;

        /* renamed from: j  reason: collision with root package name */
        public int f13349j;

        /* renamed from: m  reason: collision with root package name */
        public Priority f13350m;
        public d.a<? super Data> n;

        /* renamed from: t  reason: collision with root package name */
        public List<Throwable> f13351t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f13352u;

        public a(List<com.bumptech.glide.load.data.d<Data>> list, m0.c<List<Throwable>> cVar) {
            this.f13348f = cVar;
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.f13347c = list;
            this.f13349j = 0;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f13347c.get(0).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List<Throwable> list = this.f13351t;
            if (list != null) {
                this.f13348f.a(list);
            }
            this.f13351t = null;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f13347c) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            List<Throwable> list = this.f13351t;
            Objects.requireNonNull(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f13352u = true;
            for (com.bumptech.glide.load.data.d<Data> dVar : this.f13347c) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return this.f13347c.get(0).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super Data> aVar) {
            this.f13350m = priority;
            this.n = aVar;
            this.f13351t = this.f13348f.b();
            this.f13347c.get(this.f13349j).e(priority, this);
            if (this.f13352u) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Data data) {
            if (data != null) {
                this.n.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.f13352u) {
                return;
            }
            if (this.f13349j < this.f13347c.size() - 1) {
                this.f13349j++;
                e(this.f13350m, this.n);
                return;
            }
            Objects.requireNonNull(this.f13351t, "Argument must not be null");
            this.n.c(new GlideException("Fetch failed", new ArrayList(this.f13351t)));
        }
    }

    public p(List<m<Model, Data>> list, m0.c<List<Throwable>> cVar) {
        this.f13345a = list;
        this.f13346b = cVar;
    }

    @Override // n5.m
    public boolean a(Model model) {
        for (m<Model, Data> mVar : this.f13345a) {
            if (mVar.a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // n5.m
    public m.a<Data> b(Model model, int i10, int i11, h5.d dVar) {
        m.a<Data> b10;
        int size = this.f13345a.size();
        ArrayList arrayList = new ArrayList(size);
        m.a<Data> aVar = null;
        h5.b bVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            m<Model, Data> mVar = this.f13345a.get(i12);
            if (mVar.a(model) && (b10 = mVar.b(model, i10, i11, dVar)) != null) {
                bVar = b10.f13338a;
                arrayList.add(b10.f13340c);
            }
        }
        if (!arrayList.isEmpty() && bVar != null) {
            aVar = new m.a<>(bVar, new a(arrayList, this.f13346b));
        }
        return aVar;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("MultiModelLoader{modelLoaders=");
        m10.append(Arrays.toString(this.f13345a.toArray()));
        m10.append('}');
        return m10.toString();
    }
}
