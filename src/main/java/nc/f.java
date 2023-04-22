package nc;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final long f13424b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f13425c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static f d;

    /* renamed from: a  reason: collision with root package name */
    public final a0.b f13426a;

    public f(a0.b bVar) {
        this.f13426a = bVar;
    }

    public static f c() {
        if (a0.b.H == null) {
            a0.b.H = new a0.b();
        }
        a0.b bVar = a0.b.H;
        if (d == null) {
            d = new f(bVar);
        }
        return d;
    }

    public long a() {
        Objects.requireNonNull(this.f13426a);
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }
}
