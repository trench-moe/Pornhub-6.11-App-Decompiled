package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.app.pornhub.R;
import u1.q;

/* loaded from: classes.dex */
public class Explode extends Visibility {
    public static final TimeInterpolator S = new DecelerateInterpolator();
    public static final TimeInterpolator T = new AccelerateInterpolator();
    public int[] R;

    public Explode() {
        this.R = new int[2];
        this.J = new u1.b();
    }

    public Explode(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new int[2];
        this.J = new u1.b();
    }

    private void M(q qVar) {
        View view = qVar.f15501b;
        view.getLocationOnScreen(this.R);
        int[] iArr = this.R;
        int i10 = iArr[0];
        int i11 = iArr[1];
        qVar.f15500a.put("android:explode:screenBounds", new Rect(i10, i11, view.getWidth() + i10, view.getHeight() + i11));
    }

    @Override // androidx.transition.Visibility
    public Animator O(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        Rect rect = (Rect) qVar2.f15500a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        R(viewGroup, rect, this.R);
        int[] iArr = this.R;
        return f.a(view, qVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, S, this);
    }

    @Override // androidx.transition.Visibility
    public Animator P(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        float f10;
        float f11;
        Rect rect = (Rect) qVar.f15500a.get("android:explode:screenBounds");
        int i10 = rect.left;
        int i11 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) qVar.f15501b.getTag(R.id.transition_position);
        if (iArr != null) {
            f10 = (iArr[0] - rect.left) + translationX;
            f11 = (iArr[1] - rect.top) + translationY;
            rect.offsetTo(iArr[0], iArr[1]);
        } else {
            f10 = translationX;
            f11 = translationY;
        }
        R(viewGroup, rect, this.R);
        int[] iArr2 = this.R;
        return f.a(view, qVar, i10, i11, translationX, translationY, f10 + iArr2[0], f11 + iArr2[1], T, this);
    }

    public final void R(View view, Rect rect, int[] iArr) {
        int centerX;
        int centerY;
        view.getLocationOnScreen(this.R);
        int[] iArr2 = this.R;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        Rect r10 = r();
        if (r10 == null) {
            centerX = Math.round(view.getTranslationX()) + (view.getWidth() / 2) + i10;
            centerY = Math.round(view.getTranslationY()) + (view.getHeight() / 2) + i11;
        } else {
            centerX = r10.centerX();
            centerY = r10.centerY();
        }
        float centerX2 = rect.centerX() - centerX;
        float centerY2 = rect.centerY() - centerY;
        if (centerX2 == 0.0f && centerY2 == 0.0f) {
            centerX2 = ((float) (Math.random() * 2.0d)) - 1.0f;
            centerY2 = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float sqrt = (float) Math.sqrt((centerY2 * centerY2) + (centerX2 * centerX2));
        int i12 = centerX - i10;
        int i13 = centerY - i11;
        float max = Math.max(i12, view.getWidth() - i12);
        float max2 = Math.max(i13, view.getHeight() - i13);
        float sqrt2 = (float) Math.sqrt((max2 * max2) + (max * max));
        iArr[0] = Math.round((centerX2 / sqrt) * sqrt2);
        iArr[1] = Math.round(sqrt2 * (centerY2 / sqrt));
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
        M(qVar);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
        M(qVar);
    }
}
