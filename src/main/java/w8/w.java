package w8;

import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.common.api.Status;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class w implements a9.o {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f17048c;

    public w(y yVar) {
        this.f17048c = yVar;
    }

    @Override // a9.o
    public final void a(long j10) {
        try {
            this.f17048c.setResult(new x(new Status(2103, null)));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestReplaced", e10);
        }
    }

    @Override // a9.o
    public final void b(long j10, int i10, Object obj) {
        MediaError mediaError = null;
        if (true != (obj instanceof a9.l)) {
            obj = null;
        }
        try {
            y yVar = this.f17048c;
            Status status = new Status(i10, null);
            JSONObject jSONObject = obj != null ? ((a9.l) obj).f280a : null;
            if (obj != null) {
                mediaError = ((a9.l) obj).f281b;
            }
            yVar.setResult(new z(status, jSONObject, mediaError));
        } catch (IllegalStateException e10) {
            Log.e("RemoteMediaClient", "Result already set when calling onRequestCompleted", e10);
        }
    }
}
