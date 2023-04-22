package l6;

import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class b implements gc.d<p6.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final b f12263a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12264b;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12263a = new b();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12264b = new gc.c("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        eVar.f(f12264b, ((p6.b) obj).f13811a);
    }
}
