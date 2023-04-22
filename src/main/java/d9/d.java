package d9;

import com.google.android.gms.common.api.Status;
import d9.f;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class d<R extends f> {

    /* loaded from: classes.dex */
    public interface a {
        void a(Status status);
    }

    public abstract R await(long j10, TimeUnit timeUnit);

    public abstract void cancel();

    public abstract void setResultCallback(g<? super R> gVar);
}
