package f8;

import com.google.common.collect.ImmutableSet;
import io.reactivex.annotations.SchedulerSupport;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b {
    public static final Pattern d = Pattern.compile("\\s+");

    /* renamed from: e  reason: collision with root package name */
    public static final ImmutableSet<String> f9479e;

    /* renamed from: f  reason: collision with root package name */
    public static final ImmutableSet<String> f9480f;

    /* renamed from: g  reason: collision with root package name */
    public static final ImmutableSet<String> f9481g;

    /* renamed from: h  reason: collision with root package name */
    public static final ImmutableSet<String> f9482h;

    /* renamed from: a  reason: collision with root package name */
    public final int f9483a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9484b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9485c;

    static {
        int i10 = ImmutableSet.f7958j;
        f9479e = ImmutableSet.p(2, "auto", SchedulerSupport.NONE);
        f9480f = ImmutableSet.w("dot", "sesame", "circle");
        f9481g = ImmutableSet.p(2, "filled", "open");
        f9482h = ImmutableSet.w("after", "before", "outside");
    }

    public b(int i10, int i11, int i12) {
        this.f9483a = i10;
        this.f9484b = i11;
        this.f9485c = i12;
    }
}
