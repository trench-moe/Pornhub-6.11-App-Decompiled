package w8;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class n extends y {
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f17024e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(g gVar, Object obj, int i10) {
        super(gVar, false);
        this.d = i10;
        this.f17024e = gVar;
        this.f17025f = obj;
    }

    @Override // w8.y
    public final void a() {
        switch (this.d) {
            case 0:
                this.f17024e.f17010c.c(b(), 0, -1L, null, 1, false, null, (JSONObject) this.f17025f);
                return;
            default:
                a9.m mVar = this.f17024e.f17010c;
                a9.o b10 = b();
                u8.n nVar = (u8.n) this.f17025f;
                Objects.requireNonNull(mVar);
                JSONObject jSONObject = new JSONObject();
                long a10 = mVar.a();
                long j10 = nVar.f15735c ? 4294967296000L : nVar.f15733a;
                try {
                    jSONObject.put("requestId", a10);
                    jSONObject.put("type", "SEEK");
                    jSONObject.put("mediaSessionId", mVar.q());
                    jSONObject.put("currentTime", a9.a.b(j10));
                    int i10 = nVar.f15734b;
                    if (i10 == 1) {
                        jSONObject.put("resumeState", "PLAYBACK_START");
                    } else if (i10 == 2) {
                        jSONObject.put("resumeState", "PLAYBACK_PAUSE");
                    }
                    JSONObject jSONObject2 = nVar.d;
                    if (jSONObject2 != null) {
                        jSONObject.put("customData", jSONObject2);
                    }
                } catch (JSONException unused) {
                }
                mVar.b(jSONObject.toString(), a10, null);
                mVar.f285g = Long.valueOf(j10);
                mVar.f291m.a(a10, new hf.c(mVar, b10));
                return;
        }
    }
}
