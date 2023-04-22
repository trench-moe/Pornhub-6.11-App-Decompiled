package n5;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.d;
import n5.m;

/* loaded from: classes2.dex */
public class t<Model> implements m<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final t<?> f13368a = new t<>();

    /* loaded from: classes2.dex */
    public static class a<Model> implements n<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f13369a = new a<>();

        @Override // n5.n
        public m<Model, Model> a(q qVar) {
            return t.f13368a;
        }
    }

    /* loaded from: classes2.dex */
    public static class b<Model> implements com.bumptech.glide.load.data.d<Model> {

        /* renamed from: c  reason: collision with root package name */
        public final Model f13370c;

        public b(Model model) {
            this.f13370c = model;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Model> a() {
            return (Class<Model>) this.f13370c.getClass();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public DataSource d() {
            return DataSource.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(Priority priority, d.a<? super Model> aVar) {
            aVar.f((Model) this.f13370c);
        }
    }

    @Override // n5.m
    public boolean a(Model model) {
        return true;
    }

    @Override // n5.m
    public m.a<Model> b(Model model, int i10, int i11, h5.d dVar) {
        return new m.a<>(new c6.d(model), new b(model));
    }
}
