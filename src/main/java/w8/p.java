package w8;

import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p extends y {
    public final /* synthetic */ int[] d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f17029e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, int[] iArr) {
        super(gVar, true);
        this.f17029e = gVar;
        this.d = iArr;
    }

    @Override // w8.y
    public final void a() {
        a9.m mVar = this.f17029e.f17010c;
        a9.o b10 = b();
        int[] iArr = this.d;
        Objects.requireNonNull(mVar);
        JSONObject jSONObject = new JSONObject();
        long a10 = mVar.a();
        try {
            jSONObject.put("requestId", a10);
            jSONObject.put("type", "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", mVar.q());
            JSONArray jSONArray = new JSONArray();
            for (int i10 : iArr) {
                jSONArray.put(i10);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        mVar.b(jSONObject.toString(), a10, null);
        mVar.f297t.a(a10, b10);
    }
}
