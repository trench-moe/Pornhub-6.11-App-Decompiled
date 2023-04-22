package w8;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class m extends y {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ JSONObject f17021e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g f17022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g gVar, JSONObject jSONObject, int i10) {
        super(gVar, false);
        this.d = i10;
        this.f17022f = gVar;
        this.f17021e = jSONObject;
    }

    @Override // w8.y
    public final void a() {
        switch (this.d) {
            case 0:
                this.f17022f.f17010c.c(b(), 0, -1L, null, -1, false, null, this.f17021e);
                return;
            default:
                a9.m mVar = this.f17022f.f17010c;
                a9.o b10 = b();
                JSONObject jSONObject = this.f17021e;
                Objects.requireNonNull(mVar);
                JSONObject jSONObject2 = new JSONObject();
                long a10 = mVar.a();
                try {
                    jSONObject2.put("requestId", a10);
                    jSONObject2.put("type", "PLAY");
                    jSONObject2.put("mediaSessionId", mVar.q());
                    if (jSONObject != null) {
                        jSONObject2.put("customData", jSONObject);
                    }
                } catch (JSONException unused) {
                }
                mVar.b(jSONObject2.toString(), a10, null);
                mVar.f290l.a(a10, b10);
                return;
        }
    }
}
