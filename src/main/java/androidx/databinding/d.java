package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static b f1907a = new DataBinderMapperImpl();

    public static <T extends ViewDataBinding> T a(c cVar, View view, int i10) {
        return (T) f1907a.b(cVar, view, i10);
    }

    public static <T extends ViewDataBinding> T b(c cVar, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        if (i12 == 1) {
            return (T) a(cVar, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) f1907a.c(cVar, viewArr, i11);
    }

    public static <T extends ViewDataBinding> T c(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, c cVar) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) b(cVar, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : (T) a(cVar, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static <T extends ViewDataBinding> T d(Activity activity, int i10) {
        activity.setContentView(i10);
        return (T) b(null, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i10);
    }
}
