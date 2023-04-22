package r3;

import android.app.Activity;
import android.util.Log;
import cb.e;
import com.bumptech.glide.load.EncodeStrategy;
import d6.a;
import h5.f;
import j5.i;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import md.j;
import org.json.JSONObject;
import t9.o1;
import w5.g;

/* loaded from: classes2.dex */
public class c implements f, cc.d, l9.b, j, o1, v5.b, g {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f14632c = {16842755, 16842960, 16842961};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f14633f = {16842755, 16842961};

    /* renamed from: j  reason: collision with root package name */
    public static final c f14634j = new c();

    /* renamed from: m  reason: collision with root package name */
    public static final c f14635m = new c();
    public static final String[] n = {"GET"};

    /* renamed from: t  reason: collision with root package name */
    public static final String[] f14636t = {"POST", "PUT"};

    /* renamed from: u  reason: collision with root package name */
    public static final String[] f14637u = {"HEAD", "OPTIONS", "DELETE", "TRACE", "CONNECT"};

    /* renamed from: w  reason: collision with root package name */
    public static final String[] f14638w = {"PATCH"};
    public static final o1 y = new c();

    /* renamed from: z  reason: collision with root package name */
    public static final o1 f14639z = new c();
    public static final o1 A = new c();
    public static final o1 B = new c();

    public /* synthetic */ c() {
    }

    public /* synthetic */ c(int i10, float f10, float f11) {
    }

    public static dc.b f(JSONObject jSONObject) {
        return new dc.b(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false));
    }

    public static long h(e eVar, long j10, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        Objects.requireNonNull(eVar);
        return (j10 * 1000) + System.currentTimeMillis();
    }

    public static boolean i(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // v5.b
    public i a(i iVar, h5.d dVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((u5.c) iVar.get()).f15572c.f15580a.f15582a.e().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = d6.a.f8777a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f8780a == 0 && bVar.f8781b == bVar.f8782c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new r5.b(bArr);
    }

    @Override // w5.g
    public void b(Activity activity) {
    }

    @Override // h5.f
    public EncodeStrategy c(h5.d dVar) {
        return EncodeStrategy.SOURCE;
    }

    @Override // h5.a
    public boolean d(Object obj, File file, h5.d dVar) {
        try {
            d6.a.d(((u5.c) ((i) obj).get()).f15572c.f15580a.f15582a.e().asReadOnlyBuffer(), file);
            return true;
        } catch (IOException e10) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e10);
            }
            return false;
        }
    }

    @Override // cc.d
    public dc.e e(e eVar, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        return new dc.e(h(eVar, optInt2, jSONObject), new dc.a(jSONObject2.getString("status"), jSONObject2.getString("url"), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false)), new dc.c(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4), f(jSONObject.getJSONObject("features")), optInt, optInt2);
    }

    public long g() {
        return System.currentTimeMillis();
    }
}
