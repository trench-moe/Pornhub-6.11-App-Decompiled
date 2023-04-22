package u1;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f15506a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Method f15507b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f15508c;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
            return;
        }
        if (f15506a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f15506a = false;
            }
        }
    }
}
