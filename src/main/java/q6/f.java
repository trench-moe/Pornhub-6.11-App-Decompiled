package q6;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class f implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<u6.a> f14419a;

    public f(ie.a<u6.a> aVar) {
        this.f14419a = aVar;
    }

    @Override // ie.a
    public Object get() {
        u6.a aVar = this.f14419a.get();
        HashMap hashMap = new HashMap();
        Priority priority = Priority.DEFAULT;
        SchedulerConfig.a.AbstractC0076a a10 = SchedulerConfig.a.a();
        a10.b(30000L);
        a10.c(86400000L);
        hashMap.put(priority, a10.a());
        Priority priority2 = Priority.HIGHEST;
        SchedulerConfig.a.AbstractC0076a a11 = SchedulerConfig.a.a();
        a11.b(1000L);
        a11.c(86400000L);
        hashMap.put(priority2, a11.a());
        Priority priority3 = Priority.VERY_LOW;
        SchedulerConfig.a.AbstractC0076a a12 = SchedulerConfig.a.a();
        a12.b(86400000L);
        a12.c(86400000L);
        Set<SchedulerConfig.Flag> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(SchedulerConfig.Flag.NETWORK_UNMETERED, SchedulerConfig.Flag.DEVICE_IDLE)));
        b.C0077b c0077b = (b.C0077b) a12;
        Objects.requireNonNull(unmodifiableSet, "Null flags");
        c0077b.f5983c = unmodifiableSet;
        hashMap.put(priority3, c0077b.a());
        Objects.requireNonNull(aVar, "missing required property: clock");
        if (hashMap.keySet().size() >= Priority.values().length) {
            new HashMap();
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(aVar, hashMap);
        }
        throw new IllegalStateException("Not all priorities have been configured");
    }
}
