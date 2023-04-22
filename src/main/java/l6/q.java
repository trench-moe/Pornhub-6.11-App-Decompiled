package l6;

import android.util.Base64;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import l6.i;

@AutoValue
/* loaded from: classes2.dex */
public abstract class q {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract q a();

        public abstract a b(String str);

        public abstract a c(Priority priority);
    }

    public static a a() {
        i.b bVar = new i.b();
        bVar.c(Priority.DEFAULT);
        return bVar;
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract Priority d();

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
