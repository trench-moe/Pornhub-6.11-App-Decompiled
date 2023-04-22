package s1;

import android.animation.Animator;
import s1.d;

/* loaded from: classes2.dex */
public class c implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f14780a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f14781b;

    public c(d dVar, d.a aVar) {
        this.f14781b = dVar;
        this.f14780a = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        this.f14781b.a(1.0f, this.f14780a, true);
        d.a aVar = this.f14780a;
        aVar.f14798k = aVar.f14792e;
        aVar.f14799l = aVar.f14793f;
        aVar.f14800m = aVar.f14794g;
        aVar.a((aVar.f14797j + 1) % aVar.f14796i.length);
        d dVar = this.f14781b;
        if (!dVar.f14788t) {
            dVar.n += 1.0f;
            return;
        }
        dVar.f14788t = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        this.f14780a.b(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f14781b.n = 0.0f;
    }
}
