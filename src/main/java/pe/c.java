package pe;

import com.appsflyer.oaid.BuildConfig;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class c {
    public static final a n = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13920a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13921b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13922c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13923e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13924f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13925g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13926h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13927i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f13928j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f13929k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f13930l;

    /* renamed from: m  reason: collision with root package name */
    public String f13931m;

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (StringsKt.contains$default((CharSequence) str2, str.charAt(i10), false, 2, (Object) null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final pe.c b(pe.o r33) {
            /*
                Method dump skipped, instructions count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.c.a.b(pe.o):pe.c");
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) IntCompanionObject.MAX_VALUE);
    }

    public c(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13920a = z10;
        this.f13921b = z11;
        this.f13922c = i10;
        this.d = i11;
        this.f13923e = z12;
        this.f13924f = z13;
        this.f13925g = z14;
        this.f13926h = i12;
        this.f13927i = i13;
        this.f13928j = z15;
        this.f13929k = z16;
        this.f13930l = z17;
        this.f13931m = str;
    }

    public String toString() {
        String str = this.f13931m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f13920a) {
                sb2.append("no-cache, ");
            }
            if (this.f13921b) {
                sb2.append("no-store, ");
            }
            if (this.f13922c != -1) {
                sb2.append("max-age=");
                sb2.append(this.f13922c);
                sb2.append(", ");
            }
            if (this.d != -1) {
                sb2.append("s-maxage=");
                sb2.append(this.d);
                sb2.append(", ");
            }
            if (this.f13923e) {
                sb2.append("private, ");
            }
            if (this.f13924f) {
                sb2.append("public, ");
            }
            if (this.f13925g) {
                sb2.append("must-revalidate, ");
            }
            if (this.f13926h != -1) {
                sb2.append("max-stale=");
                sb2.append(this.f13926h);
                sb2.append(", ");
            }
            if (this.f13927i != -1) {
                sb2.append("min-fresh=");
                sb2.append(this.f13927i);
                sb2.append(", ");
            }
            if (this.f13928j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f13929k) {
                sb2.append("no-transform, ");
            }
            if (this.f13930l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return BuildConfig.FLAVOR;
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f13931m = sb3;
            return sb3;
        }
        return str;
    }
}
