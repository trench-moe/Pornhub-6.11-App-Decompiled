package kf;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0174a f12078a = new C0174a(null);

    /* renamed from: b  reason: collision with root package name */
    public static volatile b[] f12079b;

    /* renamed from: kf.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0174a extends b {
        public C0174a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @Override // kf.a.b
        @JvmStatic
        public void a(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f12079b) {
                bVar.a(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // kf.a.b
        @JvmStatic
        public void b(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f12079b) {
                bVar.b(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // kf.a.b
        @JvmStatic
        public void c(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f12079b) {
                bVar.c(str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // kf.a.b
        @JvmStatic
        public void d(Throwable th, String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f12079b) {
                bVar.d(th, str, Arrays.copyOf(args, args.length));
            }
        }

        @Override // kf.a.b
        @JvmStatic
        public void e(String str, Object... args) {
            Intrinsics.checkNotNullParameter(args, "args");
            for (b bVar : a.f12079b) {
                bVar.e(str, Arrays.copyOf(args, args.length));
            }
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class b {
        public b() {
            new ThreadLocal();
        }

        public abstract void a(String str, Object... objArr);

        public abstract void b(Throwable th, String str, Object... objArr);

        public abstract void c(String str, Object... objArr);

        public abstract void d(Throwable th, String str, Object... objArr);

        public abstract void e(String str, Object... objArr);
    }

    static {
        new ArrayList();
        f12079b = new b[0];
    }

    @JvmStatic
    public static void a(String str, Object... objArr) {
        f12078a.a(str, objArr);
    }

    @JvmStatic
    public static void b(Throwable th, String str, Object... objArr) {
        f12078a.b(th, str, objArr);
    }
}
