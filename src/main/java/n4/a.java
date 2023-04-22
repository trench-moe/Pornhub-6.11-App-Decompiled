package n4;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.quickseek.overlay.CircleClipTapView;
import com.google.android.exoplayer2.ui.l;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13285b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f13284a = i10;
        this.f13285b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13284a) {
            case 0:
                ExploreFragment this$0 = (ExploreFragment) this.f13285b;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView = this$0.M0().f4573b;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                textView.setTranslationY(((Float) animatedValue).floatValue());
                return;
            case 1:
                CircleClipTapView this$02 = (CircleClipTapView) this.f13285b;
                int i10 = CircleClipTapView.F;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue2).floatValue();
                int i11 = this$02.f5468z;
                this$02.y = ((this$02.A - i11) * floatValue) + i11;
                this$02.invalidate();
                return;
            default:
                l lVar = (l) this.f13285b;
                Objects.requireNonNull(lVar);
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lVar.f6625b;
                if (view != null) {
                    view.setAlpha(floatValue2);
                }
                ViewGroup viewGroup = lVar.f6626c;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue2);
                }
                ViewGroup viewGroup2 = lVar.f6627e;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue2);
                    return;
                }
                return;
        }
    }
}
