package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.b;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0076a {
            public abstract a a();

            public abstract AbstractC0076a b(long j10);

            public abstract AbstractC0076a c(long j10);
        }

        public static AbstractC0076a a() {
            b.C0077b c0077b = new b.C0077b();
            Set<Flag> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            c0077b.f5983c = emptySet;
            return c0077b;
        }

        public abstract long b();

        public abstract Set<Flag> c();

        public abstract long d();
    }

    public abstract u6.a a();

    public long b(Priority priority, long j10, int i10) {
        int i11;
        long a10 = j10 - a().a();
        a aVar = c().get(priority);
        long b10 = aVar.b();
        return Math.min(Math.max((long) (Math.pow(3.0d, i10 - 1) * b10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((b10 > 1 ? b10 : 2L) * i11))), a10), aVar.d());
    }

    public abstract Map<Priority, a> c();
}
