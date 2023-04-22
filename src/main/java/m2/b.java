package m2;

import android.util.Log;
import b2.o;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class b implements o {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f12866a = new HashSet();

    public void a(String str, Throwable th) {
        Set<String> set = f12866a;
        if (((HashSet) set).contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        ((HashSet) set).add(str);
    }
}
