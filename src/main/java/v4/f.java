package v4;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.app.pornhub.view.launch.a f16016a;

    public f(com.app.pornhub.view.launch.a aVar) {
        this.f16016a = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        this.f16016a.f5381r0.f4650g.setVisibility(0);
    }
}
