package r3;

import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import c7.h;
import c7.l;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.source.p;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.realm.x;
import java.util.Map;
import java.util.Objects;
import k8.e;
import l7.w;
import s6.s;
import xb.a0;
import xb.n;
import yb.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements x.c, s.b, d.b, l, e, a.InterfaceC0311a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ a f14624c = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ a f14625f = new a();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ a f14626j = new a();

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ a f14627m = new a();
    public static final /* synthetic */ a n = new a();

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ a f14628t = new a();

    @Override // com.google.android.exoplayer2.drm.d.b
    public void a() {
        int i10 = b7.c.f3589a;
    }

    @Override // k8.e
    public void accept(Object obj) {
        ((p.c) obj).f6435b.a();
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        i6.b bVar = s.f14890t;
        throw new SynchronizationException("Timed out while trying to open db.", (Throwable) obj);
    }

    public h[] b() {
        return new h[]{new w()};
    }

    @Override // yb.a.InterfaceC0311a
    public Object c(JsonReader jsonReader) {
        gc.a aVar = yb.a.f18630a;
        jsonReader.beginObject();
        Long l10 = null;
        Long l11 = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Objects.requireNonNull(nextName);
            nextName.hashCode();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals("uuid")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    str = jsonReader.nextString();
                    Objects.requireNonNull(str, "Null name");
                    break;
                case 1:
                    l11 = Long.valueOf(jsonReader.nextLong());
                    break;
                case 2:
                    str2 = new String(Base64.decode(jsonReader.nextString(), 2), a0.f18195a);
                    break;
                case 3:
                    l10 = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String str3 = l10 == null ? " baseAddress" : BuildConfig.FLAVOR;
        if (l11 == null) {
            str3 = a1.a.l(str3, " size");
        }
        if (str == null) {
            str3 = a1.a.l(str3, " name");
        }
        if (str3.isEmpty()) {
            return new n(l10.longValue(), l11.longValue(), str, str2, null);
        }
        throw new IllegalStateException(a1.a.l("Missing required properties:", str3));
    }

    @Override // io.realm.x.c
    public void d(io.realm.e eVar) {
        eVar.y("uploaderName", BuildConfig.FLAVOR);
        eVar.y("uploaderType", "std");
    }

    @Override // c7.l
    public h[] f(Uri uri, Map map) {
        return b();
    }
}
