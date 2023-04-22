package s4;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.ImageView;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PerformersFilterFragment f14824a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bitmap f14825b;

    public d(PerformersFilterFragment performersFilterFragment, Bitmap bitmap) {
        this.f14824a = performersFilterFragment;
        this.f14825b = bitmap;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Context u02 = this.f14824a.u0();
        int i10 = je.c.f11705a;
        new View(u02).setTag(DvdsConfig.TYPE_CATEGORY);
        je.b bVar = new je.b();
        Bitmap bitmap = this.f14825b;
        ImageView imageView = this.f14824a.M0().f4638f;
        bVar.f11701a = bitmap.getWidth();
        bVar.f11702b = bitmap.getHeight();
        imageView.setImageDrawable(new BitmapDrawable(u02.getResources(), je.a.a(imageView.getContext(), bitmap, bVar)));
        this.f14824a.M0().f4638f.setAlpha(0.0f);
    }
}
