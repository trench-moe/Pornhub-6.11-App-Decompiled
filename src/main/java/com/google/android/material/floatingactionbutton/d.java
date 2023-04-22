package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.e;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f7465a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.g f7466b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f7467c;

    public d(e eVar, boolean z10, e.g gVar) {
        this.f7467c = eVar;
        this.f7465a = z10;
        this.f7466b = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        e eVar = this.f7467c;
        eVar.f7484s = 0;
        eVar.f7479m = null;
        e.g gVar = this.f7466b;
        if (gVar != null) {
            b bVar = (b) gVar;
            bVar.f7460a.b(bVar.f7461b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        this.f7467c.f7488w.b(0, this.f7465a);
        e eVar = this.f7467c;
        eVar.f7484s = 2;
        eVar.f7479m = animator;
    }
}
