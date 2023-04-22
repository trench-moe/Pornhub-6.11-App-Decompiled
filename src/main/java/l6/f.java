package l6;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class f implements gc.d<p6.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f12273a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12274b;

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f12275c;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12273a = new f();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12274b = new gc.c("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f12275c = new gc.c("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        p6.d dVar = (p6.d) obj;
        gc.e eVar2 = eVar;
        eVar2.a(f12274b, dVar.f13815a);
        eVar2.a(f12275c, dVar.f13816b);
    }
}
