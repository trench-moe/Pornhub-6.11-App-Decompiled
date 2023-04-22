package l6;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.proto.Protobuf;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class c implements gc.d<LogEventDropped> {

    /* renamed from: a  reason: collision with root package name */
    public static final c f12265a;

    /* renamed from: b  reason: collision with root package name */
    public static final gc.c f12266b;

    /* renamed from: c  reason: collision with root package name */
    public static final gc.c f12267c;

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f12265a = new c();
        com.google.firebase.encoders.proto.a aVar = new com.google.firebase.encoders.proto.a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f12266b = new gc.c("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        com.google.firebase.encoders.proto.a aVar2 = new com.google.firebase.encoders.proto.a(3, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f12267c = new gc.c("reason", Collections.unmodifiableMap(new HashMap(hashMap2)), null);
    }

    @Override // gc.b
    public void a(Object obj, gc.e eVar) {
        LogEventDropped logEventDropped = (LogEventDropped) obj;
        gc.e eVar2 = eVar;
        eVar2.a(f12266b, logEventDropped.f5961a);
        eVar2.f(f12267c, logEventDropped.f5962b);
    }
}
