package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends SchedulerConfig {

    /* renamed from: a  reason: collision with root package name */
    public final u6.a f5976a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.a> f5977b;

    public a(u6.a aVar, Map<Priority, SchedulerConfig.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f5976a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f5977b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public u6.a a() {
        return this.f5976a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public Map<Priority, SchedulerConfig.a> c() {
        return this.f5977b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SchedulerConfig) {
            SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
            return this.f5976a.equals(schedulerConfig.a()) && this.f5977b.equals(schedulerConfig.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f5976a.hashCode() ^ 1000003) * 1000003) ^ this.f5977b.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("SchedulerConfig{clock=");
        m10.append(this.f5976a);
        m10.append(", values=");
        m10.append(this.f5977b);
        m10.append("}");
        return m10.toString();
    }
}
