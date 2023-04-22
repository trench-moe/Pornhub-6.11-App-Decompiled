package w8;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k extends y {
    public final /* synthetic */ g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar) {
        super(gVar, false);
        this.d = gVar;
    }

    @Override // w8.y
    public final void a() {
        a9.m mVar = this.d.f17010c;
        a9.o b10 = b();
        Objects.requireNonNull(mVar);
        JSONObject jSONObject = new JSONObject();
        long a10 = mVar.a();
        try {
            jSONObject.put("requestId", a10);
            jSONObject.put("type", "GET_STATUS");
            u8.o oVar = mVar.f284f;
            if (oVar != null) {
                jSONObject.put("mediaSessionId", oVar.f15737f);
            }
        } catch (JSONException unused) {
        }
        mVar.b(jSONObject.toString(), a10, null);
        mVar.f293p.a(a10, b10);
    }
}
