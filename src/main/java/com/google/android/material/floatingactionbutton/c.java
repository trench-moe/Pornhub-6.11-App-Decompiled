package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.e;

/* loaded from: classes.dex */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7462a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f7463b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e.g f7464c;
    public final /* synthetic */ e d;

    public c(e eVar, boolean z10, e.g gVar) {
        this.d = eVar;
        this.f7463b = z10;
        this.f7464c = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f7462a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        e eVar = this.d;
        eVar.f7484s = 0;
        eVar.f7479m = null;
        if (!this.f7462a) {
            FloatingActionButton floatingActionButton = eVar.f7488w;
            boolean z10 = this.f7463b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            e.g gVar = this.f7464c;
            if (gVar != null) {
                b bVar = (b) gVar;
                bVar.f7460a.a(bVar.f7461b);
            }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.d.f7488w.b(0, this.f7463b);
        e eVar = this.d;
        eVar.f7484s = 1;
        eVar.f7479m = animator;
        this.f7462a = false;
    }
}
