package z3;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21771b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f21770a = i10;
        this.f21771b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f21770a) {
            case 0:
                View child = (View) this.f21771b;
                Intrinsics.checkNotNullParameter(child, "$child");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                child.setTranslationY(((Float) animatedValue).floatValue());
                return;
            case 1:
                ExploreFragment this$0 = (ExploreFragment) this.f21771b;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                TextView textView = this$0.M0().f4573b;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                textView.setTranslationY(((Float) animatedValue2).floatValue());
                return;
            default:
                Function1 update = (Function1) this.f21771b;
                int i10 = QuickSeekOverlayContentView.a.f5471c;
                Intrinsics.checkNotNullParameter(update, "$update");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                update.invoke(Float.valueOf(((Float) animatedValue3).floatValue()));
                return;
        }
    }
}
