package w9;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i5 {

    /* renamed from: b  reason: collision with root package name */
    public static volatile i5 f17192b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile i5 f17193c;
    public static final i5 d = new i5(true);

    /* renamed from: a  reason: collision with root package name */
    public final Map f17194a;

    public i5() {
        this.f17194a = new HashMap();
    }

    public i5(boolean z10) {
        this.f17194a = Collections.emptyMap();
    }

    public static i5 a() {
        i5 i5Var = f17192b;
        if (i5Var == null) {
            synchronized (i5.class) {
                i5Var = f17192b;
                if (i5Var == null) {
                    i5Var = d;
                    f17192b = i5Var;
                }
            }
        }
        return i5Var;
    }
}
