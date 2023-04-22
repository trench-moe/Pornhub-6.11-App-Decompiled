package w8;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o extends y {
    public final /* synthetic */ g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(g gVar) {
        super(gVar, true);
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
            jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", mVar.q());
        } catch (JSONException unused) {
        }
        mVar.b(jSONObject.toString(), a10, null);
        mVar.f296s.a(a10, b10);
    }
}
