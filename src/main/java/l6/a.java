package l6;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a implements gc.d<p6.a> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12259a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12260b;

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f12261c;
    public static final gc.c d;

    /* renamed from: e  reason: collision with root package name */
    public static final gc.c f12262e;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12259a = new a();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12260b = new gc.c("window", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f12261c = new gc.c("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)), null);
        com.google.firebase.encoders.proto.a aVar3 = new com.google.firebase.encoders.proto.a(3, intEncoding);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(aVar3.annotationType(), aVar3);
        d = new gc.c("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)), null);
        com.google.firebase.encoders.proto.a aVar4 = new com.google.firebase.encoders.proto.a(4, intEncoding);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(aVar4.annotationType(), aVar4);
        f12262e = new gc.c("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        p6.a aVar = (p6.a) obj;
        gc.e eVar2 = eVar;
        eVar2.f(f12260b, aVar.f13805a);
        eVar2.f(f12261c, aVar.f13806b);
        eVar2.f(d, aVar.f13807c);
        eVar2.f(f12262e, aVar.d);
    }
}
