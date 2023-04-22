package s6;

import com.appsflyer.oaid.BuildConfig;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f14855a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String str = l10 == null ? " maxStorageSizeInBytes" : BuildConfig.FLAVOR;
        if (num == null) {
            str = a1.a.l(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = a1.a.l(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = a1.a.l(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = a1.a.l(str, " maxBlobByteSizePerRow");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(a1.a.l("Missing required properties:", str));
        }
        f14855a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue(), null);
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
