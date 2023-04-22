package l6;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g implements gc.d<p6.e> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f12276a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12277b;

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f12278c;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12276a = new g();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12277b = new gc.c("startMs", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f12278c = new gc.c("endMs", Collections.unmodifiableMap(new HashMap(hashMap2)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        p6.e eVar2 = (p6.e) obj;
        gc.e eVar3 = eVar;
        eVar3.a(f12277b, eVar2.f13817a);
        eVar3.a(f12278c, eVar2.f13818b);
    }
}
