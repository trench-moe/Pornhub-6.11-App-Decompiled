package ef;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes2.dex */
public final class c extends ScheduledThreadPoolExecutor {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f9324c = 0;

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f9325a = new c(null);
    }

    public c(a aVar) {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
