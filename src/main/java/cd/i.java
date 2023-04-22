package cd;

import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    public long f4076a;

    /* renamed from: b  reason: collision with root package name */
    public long f4077b;

    /* renamed from: c  reason: collision with root package name */
    public long f4078c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public SecureRandom f4079e;

    public i() {
        b();
        this.f4079e = new SecureRandom();
    }

    public final JSONObject a(boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.f4079e.nextLong()));
            jSONObject.put("$mp_session_id", this.d);
            jSONObject.put("$mp_session_seq_id", z10 ? this.f4076a : this.f4077b);
            jSONObject.put("$mp_session_start_sec", this.f4078c);
            if (z10) {
                this.f4076a++;
            } else {
                this.f4077b++;
            }
        } catch (JSONException e10) {
            cb.e.D("MixpanelAPI.ConfigurationChecker", "Cannot create session metadata JSON object", e10);
        }
        return jSONObject;
    }

    public void b() {
        this.f4076a = 0L;
        this.f4077b = 0L;
        this.d = Long.toHexString(new SecureRandom().nextLong());
        this.f4078c = System.currentTimeMillis() / 1000;
    }
}
