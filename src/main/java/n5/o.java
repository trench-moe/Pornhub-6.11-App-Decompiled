package n5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final q f13341a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13342b;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, C0224a<?>> f13343a = new HashMap();

        /* renamed from: n5.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0224a<Model> {

            /* renamed from: a  reason: collision with root package name */
            public final List<m<Model, ?>> f13344a;

            public C0224a(List<m<Model, ?>> list) {
                this.f13344a = list;
            }
        }
    }

    public o(m0.c<List<Throwable>> cVar) {
        q qVar = new q(cVar);
        this.f13342b = new a();
        this.f13341a = qVar;
    }
}
