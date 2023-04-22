package w8;

import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;
import w8.g;

/* loaded from: classes2.dex */
public final class z implements g.c {

    /* renamed from: c  reason: collision with root package name */
    public final Status f17053c;

    public z(Status status, JSONObject jSONObject, MediaError mediaError) {
        this.f17053c = status;
    }

    @Override // d9.f
    public final Status V() {
        return this.f17053c;
    }
}
