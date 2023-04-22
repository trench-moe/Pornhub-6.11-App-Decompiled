package d9;

import android.os.Looper;
import d9.a;
import java.util.Collections;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class c {

    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends e9.c {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends e9.i {
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public abstract <A extends a.b, R extends f, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t2);

    public abstract Looper b();
}
