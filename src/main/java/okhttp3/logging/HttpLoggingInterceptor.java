package okhttp3.logging;

import com.appsflyer.oaid.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.o;
import pe.q;

/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements q {

    /* renamed from: a  reason: collision with root package name */
    public volatile Set<String> f13719a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Level f13720b;

    /* renamed from: c  reason: collision with root package name */
    public final a f13721c;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", BuildConfig.FLAVOR, "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public enum Level {
        NONE,
        /* JADX INFO: Fake field, exist only in values array */
        BASIC,
        HEADERS,
        BODY
    }

    /* loaded from: classes3.dex */
    public interface a {
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public static final a f13726a = new okhttp3.logging.a();

        void a(String str);
    }

    public HttpLoggingInterceptor(a aVar, int i10) {
        a logger = (i10 & 1) != 0 ? a.f13726a : null;
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f13721c = logger;
        this.f13719a = SetsKt.emptySet();
        this.f13720b = Level.NONE;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x025e  */
    @Override // pe.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public pe.y a(pe.q.a r23) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.logging.HttpLoggingInterceptor.a(pe.q$a):pe.y");
    }

    public final boolean b(o oVar) {
        String b10 = oVar.b("Content-Encoding");
        return (b10 == null || StringsKt.equals(b10, "identity", true) || StringsKt.equals(b10, "gzip", true)) ? false : true;
    }

    public final void c(o oVar, int i10) {
        int i11 = i10 * 2;
        String str = this.f13719a.contains(oVar.f13983c[i11]) ? "██" : oVar.f13983c[i11 + 1];
        a aVar = this.f13721c;
        aVar.a(oVar.f13983c[i11] + ": " + str);
    }
}
