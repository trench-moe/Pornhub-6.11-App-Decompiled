package b2;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class e implements Callable<r<f>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3446c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ LottieAnimationView f3447f;

    public e(LottieAnimationView lottieAnimationView, String str) {
        this.f3447f = lottieAnimationView;
        this.f3446c = str;
    }

    @Override // java.util.concurrent.Callable
    public r<f> call() {
        LottieAnimationView lottieAnimationView = this.f3447f;
        if (lottieAnimationView.G) {
            Context context = lottieAnimationView.getContext();
            String str = this.f3446c;
            Map<String, t<f>> map = g.f3461a;
            return g.b(context, str, "asset_" + str);
        }
        return g.b(lottieAnimationView.getContext(), this.f3446c, null);
    }
}
