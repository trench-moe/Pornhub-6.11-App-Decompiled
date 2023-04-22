package com.google.firebase.encoders.proto;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.proto.Protobuf;
import gc.c;
import gc.d;
import gc.e;
import gc.f;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: f  reason: collision with root package name */
    public static final Charset f8031f;

    /* renamed from: g  reason: collision with root package name */
    public static final c f8032g;

    /* renamed from: h  reason: collision with root package name */
    public static final c f8033h;

    /* renamed from: i  reason: collision with root package name */
    public static final d<Map.Entry<Object, Object>> f8034i;

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f8035a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f8036b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, f<?>> f8037c;
    public final d<Object> d;

    /* renamed from: e  reason: collision with root package name */
    public final jc.f f8038e = new jc.f(this);

    static {
        Protobuf.IntEncoding intEncoding = Protobuf.IntEncoding.DEFAULT;
        f8031f = Charset.forName("UTF-8");
        a aVar = new a(1, intEncoding);
        HashMap hashMap = new HashMap();
        hashMap.put(aVar.annotationType(), aVar);
        f8032g = new c("key", Collections.unmodifiableMap(new HashMap(hashMap)), null);
        a aVar2 = new a(2, intEncoding);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(aVar2.annotationType(), aVar2);
        f8033h = new c(AppMeasurementSdk.ConditionalUserProperty.VALUE, Collections.unmodifiableMap(new HashMap(hashMap2)), null);
        f8034i = new d() { // from class: jc.c
            @Override // gc.b
            public final void a(Object obj, gc.e eVar) {
                Map.Entry entry = (Map.Entry) obj;
                gc.e eVar2 = eVar;
                eVar2.f(com.google.firebase.encoders.proto.b.f8032g, entry.getKey());
                eVar2.f(com.google.firebase.encoders.proto.b.f8033h, entry.getValue());
            }
        };
    }

    public b(OutputStream outputStream, Map<Class<?>, d<?>> map, Map<Class<?>, f<?>> map2, d<Object> dVar) {
        this.f8035a = outputStream;
        this.f8036b = map;
        this.f8037c = map2;
        this.d = dVar;
    }

    public static ByteBuffer h(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static Protobuf j(c cVar) {
        Protobuf protobuf = (Protobuf) ((Annotation) cVar.f9939b.get(Protobuf.class));
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    public static int k(c cVar) {
        Protobuf protobuf = (Protobuf) ((Annotation) cVar.f9939b.get(Protobuf.class));
        if (protobuf != null) {
            return ((a) protobuf).f8030a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // gc.e
    public e a(c cVar, long j10) {
        e(cVar, j10, true);
        return this;
    }

    @Override // gc.e
    public e b(c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    @Override // gc.e
    public e c(c cVar, boolean z10) {
        d(cVar, z10 ? 1 : 0, true);
        return this;
    }

    public b d(c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        l(((a) j(cVar)).f8030a << 3);
        l(i10);
        return this;
    }

    public b e(c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        l(((a) j(cVar)).f8030a << 3);
        m(j10);
        return this;
    }

    @Override // gc.e
    public e f(c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    public e g(c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f8031f);
            l(bytes.length);
            this.f8035a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                g(cVar, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i(f8034i, cVar, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (!z10 || doubleValue != 0.0d) {
                l((k(cVar) << 3) | 1);
                this.f8035a.write(h(8).putDouble(doubleValue).array());
            }
            return this;
        } else if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (!z10 || floatValue != 0.0f) {
                l((k(cVar) << 3) | 5);
                this.f8035a.write(h(4).putFloat(floatValue).array());
            }
            return this;
        } else if (obj instanceof Number) {
            e(cVar, ((Number) obj).longValue(), z10);
            return this;
        } else if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            l(bArr.length);
            this.f8035a.write(bArr);
            return this;
        } else {
            d<?> dVar = this.f8036b.get(obj.getClass());
            if (dVar != null) {
                i(dVar, cVar, obj, z10);
                return this;
            }
            f<?> fVar = this.f8037c.get(obj.getClass());
            if (fVar != null) {
                jc.f fVar2 = this.f8038e;
                fVar2.f11680a = false;
                fVar2.f11682c = cVar;
                fVar2.f11681b = z10;
                fVar.a(obj, fVar2);
                return this;
            } else if (obj instanceof jc.b) {
                d(cVar, ((jc.b) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                d(cVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                i(this.d, cVar, obj, z10);
                return this;
            }
        }
    }

    public final <T> b i(d<T> dVar, c cVar, T t2, boolean z10) {
        jc.a aVar = new jc.a();
        try {
            OutputStream outputStream = this.f8035a;
            this.f8035a = aVar;
            dVar.a(t2, this);
            this.f8035a = outputStream;
            long j10 = aVar.f11671c;
            aVar.close();
            if (z10 && j10 == 0) {
                return this;
            }
            l((k(cVar) << 3) | 2);
            m(j10);
            dVar.a(t2, this);
            return this;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void l(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f8035a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f8035a.write(i10 & 127);
    }

    public final void m(long j10) {
        while (((-128) & j10) != 0) {
            this.f8035a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f8035a.write(((int) j10) & 127);
    }
}
