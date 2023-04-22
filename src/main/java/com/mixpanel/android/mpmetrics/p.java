package com.mixpanel.android.mpmetrics;

import com.mixpanel.android.mpmetrics.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class p implements k.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8303a;

    public p(String str) {
        this.f8303a = str;
    }

    public void a(k kVar) {
        k.e eVar = kVar.f8277e;
        String str = this.f8303a;
        synchronized (k.this.f8279g) {
            cb.e.x("MixpanelAPI.API", "Setting push token on people profile: " + str);
            k.this.f8279g.m(str);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            if (!k.this.l()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("$android_devices", jSONArray);
                    k.a(k.this, eVar.h("$union", jSONObject));
                } catch (JSONException unused) {
                    cb.e.B("MixpanelAPI.API", "Exception unioning a property");
                }
            }
        }
    }
}
