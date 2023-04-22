package c9;

/* loaded from: classes.dex */
public class e0 {
    public static final e0 d = new e0(true, null, null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3873a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3874b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f3875c;

    public e0(boolean z10, String str, Throwable th) {
        this.f3873a = z10;
        this.f3874b = str;
        this.f3875c = th;
    }

    public static e0 b(String str) {
        return new e0(false, str, null);
    }

    public static e0 c(String str, Throwable th) {
        return new e0(false, str, th);
    }

    public String a() {
        return this.f3874b;
    }
}
