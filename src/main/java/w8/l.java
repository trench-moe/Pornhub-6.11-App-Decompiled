package w8;

import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l extends y {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f17019e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g gVar, Object obj, int i10) {
        super(gVar, false);
        this.d = i10;
        this.f17019e = gVar;
        this.f17020f = obj;
    }

    @Override // w8.y
    public final void a() {
        switch (this.d) {
            case 0:
                a9.m mVar = this.f17019e.f17010c;
                a9.o b10 = b();
                long[] jArr = (long[]) this.f17020f;
                Objects.requireNonNull(mVar);
                if (jArr == null) {
                    throw new IllegalArgumentException("trackIds cannot be null");
                }
                JSONObject jSONObject = new JSONObject();
                long a10 = mVar.a();
                try {
                    jSONObject.put("requestId", a10);
                    jSONObject.put("type", "EDIT_TRACKS_INFO");
                    jSONObject.put("mediaSessionId", mVar.q());
                    JSONArray jSONArray = new JSONArray();
                    for (int i10 = 0; i10 < jArr.length; i10++) {
                        jSONArray.put(i10, jArr[i10]);
                    }
                    jSONObject.put("activeTrackIds", jSONArray);
                } catch (JSONException unused) {
                }
                mVar.b(jSONObject.toString(), a10, null);
                mVar.f294q.a(a10, b10);
                return;
            default:
                a9.m mVar2 = this.f17019e.f17010c;
                a9.o b11 = b();
                JSONObject jSONObject2 = (JSONObject) this.f17020f;
                Objects.requireNonNull(mVar2);
                JSONObject jSONObject3 = new JSONObject();
                long a11 = mVar2.a();
                try {
                    jSONObject3.put("requestId", a11);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", mVar2.q());
                    if (jSONObject2 != null) {
                        jSONObject3.put("customData", jSONObject2);
                    }
                } catch (JSONException unused2) {
                }
                mVar2.b(jSONObject3.toString(), a11, null);
                mVar2.f289k.a(a11, b11);
                return;
        }
    }
}
