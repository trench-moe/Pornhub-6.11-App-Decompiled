package q2;

import android.util.Base64;
import com.app.pornhub.data.util.JNI;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import pe.o;
import pe.q;

/* loaded from: classes2.dex */
public final class a0 implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f14179a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<JNI> f14180b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<String> f14181c;
    public final ie.a<String> d;

    public a0(a0.b bVar, ie.a<JNI> aVar, ie.a<String> aVar2, ie.a<String> aVar3) {
        this.f14179a = bVar;
        this.f14180b = aVar;
        this.f14181c = aVar2;
        this.d = aVar3;
    }

    @Override // ie.a
    public Object get() {
        a0.b bVar = this.f14179a;
        final JNI jni = this.f14180b.get();
        final String androidId = this.f14181c.get();
        final String targetUrl = this.d.get();
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(jni, "jni");
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(targetUrl, "targetUrl");
        return new pe.q() { // from class: q2.s
            @Override // pe.q
            public final pe.y a(q.a it) {
                String str;
                Map unmodifiableMap;
                String value = androidId;
                JNI jni2 = jni;
                String targetUrl2 = targetUrl;
                Intrinsics.checkNotNullParameter(value, "$androidId");
                Intrinsics.checkNotNullParameter(jni2, "$jni");
                Intrinsics.checkNotNullParameter(targetUrl2, "$targetUrl");
                Intrinsics.checkNotNullParameter(it, "it");
                ue.g gVar = (ue.g) it;
                pe.u request = gVar.f15888f;
                pe.x xVar = request.f14051e;
                String value2 = BuildConfig.FLAVOR;
                if (xVar != null) {
                    bf.f fVar = new bf.f();
                    Intrinsics.checkNotNull(xVar);
                    xVar.c(fVar);
                    str = fVar.E();
                } else {
                    str = BuildConfig.FLAVOR;
                }
                String d = request.f14049b.d();
                if (d == null) {
                    d = BuildConfig.FLAVOR;
                }
                Intrinsics.checkNotNullParameter(request, "request");
                new LinkedHashMap();
                pe.p pVar = request.f14049b;
                String str2 = request.f14050c;
                pe.x xVar2 = request.f14051e;
                Map toImmutableMap = request.f14052f.isEmpty() ? new LinkedHashMap() : MapsKt.toMutableMap(request.f14052f);
                o.a g10 = request.d.g();
                String msg = android.support.v4.media.b.j(value, d, str);
                String keyString = jni2.c(targetUrl2);
                Intrinsics.checkNotNullExpressionValue(keyString, "jni.getSessionSeed(targetUrl)");
                Intrinsics.checkNotNullParameter(msg, "msg");
                Intrinsics.checkNotNullParameter(keyString, "keyString");
                try {
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    byte[] bytes = keyString.getBytes(UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bytes, "HmacSHA256");
                    Mac mac = Mac.getInstance("HmacSHA256");
                    mac.init(secretKeySpec);
                    Charset UTF_82 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_82, "UTF_8");
                    byte[] bytes2 = msg.getBytes(UTF_82);
                    Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                    String encodeToString = Base64.encodeToString(mac.doFinal(bytes2), 2);
                    Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(\n        …e64.NO_WRAP\n            )");
                    value2 = encodeToString;
                } catch (InvalidKeyException e10) {
                    e10.printStackTrace();
                } catch (NoSuchAlgorithmException e11) {
                    e11.printStackTrace();
                }
                Intrinsics.checkNotNullParameter("Session-Seed", AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullParameter(value2, "value");
                g10.a("Session-Seed", value2);
                Intrinsics.checkNotNullParameter("uuid", AppMeasurementSdk.ConditionalUserProperty.NAME);
                Intrinsics.checkNotNullParameter(value, "value");
                g10.a("uuid", value);
                if (pVar != null) {
                    pe.o c10 = g10.c();
                    byte[] bArr = qe.c.f14512a;
                    Intrinsics.checkNotNullParameter(toImmutableMap, "$this$toImmutableMap");
                    if (toImmutableMap.isEmpty()) {
                        unmodifiableMap = MapsKt.emptyMap();
                    } else {
                        unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(toImmutableMap));
                        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
                    }
                    return gVar.c(new pe.u(pVar, str2, c10, xVar2, unmodifiableMap));
                }
                throw new IllegalStateException("url == null".toString());
            }
        };
    }
}
