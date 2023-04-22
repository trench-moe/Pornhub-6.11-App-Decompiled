package w8;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q extends y {
    public final /* synthetic */ u8.i d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ g f17036e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g gVar, u8.i iVar) {
        super(gVar, false);
        this.f17036e = gVar;
        this.d = iVar;
    }

    @Override // w8.y
    public final void a() {
        a9.m mVar = this.f17036e.f17010c;
        a9.o b10 = b();
        u8.i iVar = this.d;
        Objects.requireNonNull(mVar);
        if (iVar.f15681c == null && iVar.f15682f == null) {
            throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = iVar.f15681c;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.p0());
            }
            u8.l lVar = iVar.f15682f;
            if (lVar != null) {
                jSONObject.put("queueData", lVar.p0());
            }
            jSONObject.putOpt("autoplay", iVar.f15683j);
            long j10 = iVar.f15684m;
            if (j10 != -1) {
                jSONObject.put("currentTime", a9.a.b(j10));
            }
            jSONObject.put("playbackRate", iVar.n);
            jSONObject.putOpt("credentials", iVar.y);
            jSONObject.putOpt("credentialsType", iVar.f15688z);
            jSONObject.putOpt("atvCredentials", iVar.A);
            jSONObject.putOpt("atvCredentialsType", iVar.B);
            if (iVar.f15685t != null) {
                JSONArray jSONArray = new JSONArray();
                int i10 = 0;
                while (true) {
                    long[] jArr = iVar.f15685t;
                    if (i10 >= jArr.length) {
                        break;
                    }
                    jSONArray.put(i10, jArr[i10]);
                    i10++;
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            jSONObject.putOpt("customData", iVar.f15687w);
            jSONObject.put("requestId", iVar.C);
        } catch (JSONException e10) {
            a9.b bVar = u8.i.D;
            Log.e(bVar.f254a, bVar.e("Error transforming MediaLoadRequestData into JSONObject", e10));
            jSONObject = new JSONObject();
        }
        long a10 = mVar.a();
        try {
            jSONObject.put("requestId", a10);
            jSONObject.put("type", "LOAD");
        } catch (JSONException unused) {
        }
        mVar.b(jSONObject.toString(), a10, null);
        mVar.f288j.a(a10, b10);
    }
}
