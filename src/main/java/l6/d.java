package l6;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements gc.d<p6.c> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f12268a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12269b;

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f12270c;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12268a = new d();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12269b = new gc.c("logSource", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f12270c = new gc.c("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        p6.c cVar = (p6.c) obj;
        gc.e eVar2 = eVar;
        eVar2.f(f12269b, cVar.f13813a);
        eVar2.f(f12270c, cVar.f13814b);
    }
}
