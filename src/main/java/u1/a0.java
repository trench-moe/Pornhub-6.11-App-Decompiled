package u1;

import android.view.View;

/* loaded from: classes2.dex */
public abstract class a0 extends af.c {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f15466a = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int s(q qVar, int i10) {
        int[] iArr;
        if (qVar == null || (iArr = (int[]) qVar.f15500a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // af.c
    public void d(q qVar) {
        View view = qVar.f15501b;
        Integer num = (Integer) qVar.f15500a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        qVar.f15500a.put("android:visibilityPropagation:visibility", num);
        view.getLocationOnScreen(r2);
        int[] iArr = {Math.round(view.getTranslationX()) + iArr[0]};
        iArr[0] = (view.getWidth() / 2) + iArr[0];
        iArr[1] = Math.round(view.getTranslationY()) + iArr[1];
        iArr[1] = (view.getHeight() / 2) + iArr[1];
        qVar.f15500a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // af.c
    public String[] h() {
        return f15466a;
    }

    public int t(q qVar) {
        Integer num;
        if (qVar != null && (num = (Integer) qVar.f15500a.get("android:visibilityPropagation:visibility")) != null) {
            return num.intValue();
        }
        return 8;
    }
}
