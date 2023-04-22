package u1;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.transition.Transition;

/* loaded from: classes2.dex */
public class b extends a0 {
    @Override // af.c
    public long i(ViewGroup viewGroup, Transition transition, q qVar, q qVar2) {
        int i10;
        int round;
        int i11;
        if (qVar == null && qVar2 == null) {
            return 0L;
        }
        if (qVar2 == null || t(qVar) == 0) {
            i10 = -1;
        } else {
            qVar = qVar2;
            i10 = 1;
        }
        int s10 = a0.s(qVar, 0);
        int s11 = a0.s(qVar, 1);
        Rect r10 = transition.r();
        if (r10 != null) {
            i11 = r10.centerX();
            round = r10.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int round2 = Math.round(viewGroup.getTranslationX() + (viewGroup.getWidth() / 2) + i12);
            int i13 = iArr[1];
            round = Math.round(viewGroup.getTranslationY() + (viewGroup.getHeight() / 2) + i13);
            i11 = round2;
        }
        float f10 = i11 - s10;
        float f11 = round - s11;
        float sqrt = (float) Math.sqrt((f11 * f11) + (f10 * f10));
        float width = viewGroup.getWidth() - 0.0f;
        float height = viewGroup.getHeight() - 0.0f;
        float sqrt2 = sqrt / ((float) Math.sqrt((height * height) + (width * width)));
        long j10 = transition.f3214j;
        if (j10 < 0) {
            j10 = 300;
        }
        return Math.round((((float) (j10 * i10)) / 3.0f) * sqrt2);
    }
}
