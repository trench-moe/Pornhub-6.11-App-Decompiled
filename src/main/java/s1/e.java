package s1;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes2.dex */
public class e extends Animation {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f14808c;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.f14808c = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f10, Transformation transformation) {
        this.f14808c.setAnimationProgress(f10);
    }
}
