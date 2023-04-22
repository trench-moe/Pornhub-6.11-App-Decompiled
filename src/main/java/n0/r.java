package n0;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public Object f13154a;

    public r(Object obj) {
        this.f13154a = obj;
    }

    public static r a(Context context, int i10) {
        return Build.VERSION.SDK_INT >= 24 ? new r(PointerIcon.getSystemIcon(context, i10)) : new r(null);
    }
}
