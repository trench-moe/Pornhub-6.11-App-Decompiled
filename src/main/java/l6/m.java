package l6;

import com.appsflyer.oaid.BuildConfig;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import l6.h;

@AutoValue
/* loaded from: classes2.dex */
public abstract class m {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract m b();

        public abstract Map<String, String> c();

        public abstract a d(l lVar);

        public abstract a e(long j10);

        public abstract a f(String str);

        public abstract a g(long j10);
    }

    public static a a() {
        h.b bVar = new h.b();
        bVar.f12288f = new HashMap();
        return bVar;
    }

    public final String b(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            str2 = BuildConfig.FLAVOR;
        }
        return str2;
    }

    public abstract Map<String, String> c();

    public abstract Integer d();

    public abstract l e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String h();

    public abstract long i();

    public a j() {
        h.b bVar = new h.b();
        bVar.f(h());
        bVar.f12285b = d();
        bVar.d(e());
        bVar.e(f());
        bVar.g(i());
        bVar.f12288f = new HashMap(c());
        return bVar;
    }
}
