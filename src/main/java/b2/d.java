package b2;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class d implements Callable<r<f>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3444c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f3445f;

    public d(LottieAnimationView lottieAnimationView, int i10) {
        this.f3445f = lottieAnimationView;
        this.f3444c = i10;
    }

    @Override // java.util.concurrent.Callable
    public r<f> call() {
        LottieAnimationView lottieAnimationView = this.f3445f;
        if (lottieAnimationView.G) {
            Context context = lottieAnimationView.getContext();
            int i10 = this.f3444c;
            return g.e(context, i10, g.h(context, i10));
        }
        return g.e(lottieAnimationView.getContext(), this.f3444c, null);
    }
}
