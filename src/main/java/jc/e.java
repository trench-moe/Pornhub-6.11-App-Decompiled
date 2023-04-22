package jc;

import com.google.firebase.encoders.EncodingException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, gc.d<?>> f11674a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, gc.f<?>> f11675b;

    /* renamed from: c  reason: collision with root package name */
    public final gc.d<Object> f11676c;

    /* loaded from: classes2.dex */
    public static final class a implements hc.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, gc.d<?>> f11677a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class<?>, gc.f<?>> f11678b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public gc.d<Object> f11679c = new gc.d() { // from class: jc.d
            @Override // gc.b
            public final void a(Object obj, gc.e eVar) {
                StringBuilder m10 = a1.a.m("Couldn't find encoder for type ");
                m10.append(obj.getClass().getCanonicalName());
                throw new EncodingException(m10.toString());
            }
        };

        @Override // hc.b
        public a a(Class cls, gc.d dVar) {
            this.f11677a.put(cls, dVar);
            this.f11678b.remove(cls);
            return this;
        }
    }

    public e(Map<Class<?>, gc.d<?>> map, Map<Class<?>, gc.f<?>> map2, gc.d<Object> dVar) {
        this.f11674a = map;
        this.f11675b = map2;
        this.f11676c = dVar;
    }

    public void a(Object obj, OutputStream outputStream) {
        Map<Class<?>, gc.d<?>> map = this.f11674a;
        com.google.firebase.encoders.proto.b bVar = new com.google.firebase.encoders.proto.b(outputStream, map, this.f11675b, this.f11676c);
        if (obj == null) {
            return;
        }
        gc.d<?> dVar = map.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, bVar);
            return;
        }
        StringBuilder m10 = a1.a.m("No encoder for ");
        m10.append(obj.getClass());
        throw new EncodingException(m10.toString());
    }
}
