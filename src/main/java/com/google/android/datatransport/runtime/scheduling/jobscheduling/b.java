package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes.dex */
public final class b extends SchedulerConfig.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f5978a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5979b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<SchedulerConfig.Flag> f5980c;

    /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0077b extends SchedulerConfig.a.AbstractC0076a {

        /* renamed from: a  reason: collision with root package name */
        public Long f5981a;

        /* renamed from: b  reason: collision with root package name */
        public Long f5982b;

        /* renamed from: c  reason: collision with root package name */
        public Set<SchedulerConfig.Flag> f5983c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0076a
        public SchedulerConfig.a a() {
            String str = this.f5981a == null ? " delta" : BuildConfig.FLAVOR;
            if (this.f5982b == null) {
                str = a1.a.l(str, " maxAllowedDelay");
            }
            if (this.f5983c == null) {
                str = a1.a.l(str, " flags");
            }
            if (str.isEmpty()) {
                return new b(this.f5981a.longValue(), this.f5982b.longValue(), this.f5983c, null);
            }
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0076a
        public SchedulerConfig.a.AbstractC0076a b(long j10) {
            this.f5981a = Long.valueOf(j10);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a.AbstractC0076a
        public SchedulerConfig.a.AbstractC0076a c(long j10) {
            this.f5982b = Long.valueOf(j10);
            return this;
        }
    }

    public b(long j10, long j11, Set set, a aVar) {
        this.f5978a = j10;
        this.f5979b = j11;
        this.f5980c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public long b() {
        return this.f5978a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public Set<SchedulerConfig.Flag> c() {
        return this.f5980c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public long d() {
        return this.f5979b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig.a) {
            SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
            return this.f5978a == aVar.b() && this.f5979b == aVar.d() && this.f5980c.equals(aVar.c());
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f5978a;
        long j11 = this.f5979b;
        return this.f5980c.hashCode() ^ ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ConfigValue{delta=");
        m10.append(this.f5978a);
        m10.append(", maxAllowedDelay=");
        m10.append(this.f5979b);
        m10.append(", flags=");
        m10.append(this.f5980c);
        m10.append("}");
        return m10.toString();
    }
}
