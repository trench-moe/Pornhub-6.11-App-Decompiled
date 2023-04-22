package q6;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;

/* loaded from: classes2.dex */
public final class g implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f14420a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a<s6.d> f14421b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a<SchedulerConfig> f14422c;
    public final ie.a<u6.a> d;

    public g(ie.a<Context> aVar, ie.a<s6.d> aVar2, ie.a<SchedulerConfig> aVar3, ie.a<u6.a> aVar4) {
        this.f14420a = aVar;
        this.f14421b = aVar2;
        this.f14422c = aVar3;
        this.d = aVar4;
    }

    @Override // ie.a
    public Object get() {
        this.d.get();
        return new r6.b(this.f14420a.get(), this.f14421b.get(), this.f14422c.get());
    }
}
