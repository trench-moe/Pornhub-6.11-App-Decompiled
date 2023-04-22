package t9;

import android.os.Build;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final int f15363a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15363a = i10 >= 23 ? 67108864 : 0;
        if (i10 < 31 && i10 >= 30) {
            String str = Build.VERSION.CODENAME;
            if (str.length() != 1 || str.charAt(0) < 'S') {
                return;
            }
            str.charAt(0);
        }
    }
}
