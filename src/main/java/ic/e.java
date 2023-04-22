package ic;

import com.google.firebase.encoders.EncodingException;
import gc.g;
import ic.e;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class e implements hc.b<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f10695e = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, gc.d<?>> f10696a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, gc.f<?>> f10697b;

    /* renamed from: c  reason: collision with root package name */
    public gc.d<Object> f10698c;
    public boolean d;

    /* loaded from: classes2.dex */
    public static final class a implements gc.f<Date> {

        /* renamed from: a  reason: collision with root package name */
        public static final DateFormat f10699a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f10699a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public a(d dVar) {
        }

        @Override // gc.b
        public void a(Object obj, g gVar) {
            gVar.d(f10699a.format((Date) obj));
        }
    }

    public e() {
        HashMap hashMap = new HashMap();
        this.f10696a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f10697b = hashMap2;
        this.f10698c = new gc.d() { // from class: ic.a
            @Override // gc.b
            public final void a(Object obj, gc.e eVar) {
                e.a aVar = e.f10695e;
                StringBuilder m10 = a1.a.m("Couldn't find encoder for type ");
                m10.append(obj.getClass().getCanonicalName());
                throw new EncodingException(m10.toString());
            }
        };
        this.d = false;
        hashMap2.put(String.class, new gc.f() { // from class: ic.b
            @Override // gc.b
            public final void a(Object obj, g gVar) {
                e.a aVar = e.f10695e;
                gVar.d((String) obj);
            }
        });
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, new gc.f() { // from class: ic.c
            @Override // gc.b
            public final void a(Object obj, g gVar) {
                e.a aVar = e.f10695e;
                gVar.e(((Boolean) obj).booleanValue());
            }
        });
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f10695e);
        hashMap.remove(Date.class);
    }

    @Override // hc.b
    public e a(Class cls, gc.d dVar) {
        this.f10696a.put(cls, dVar);
        this.f10697b.remove(cls);
        return this;
    }
}
