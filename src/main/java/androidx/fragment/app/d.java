package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2106b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f2107c;
    public final /* synthetic */ SpecialEffectsController.Operation d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.b f2108e;

    public d(c cVar, ViewGroup viewGroup, View view, boolean z10, SpecialEffectsController.Operation operation, c.b bVar) {
        this.f2105a = viewGroup;
        this.f2106b = view;
        this.f2107c = z10;
        this.d = operation;
        this.f2108e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2105a.endViewTransition(this.f2106b);
        if (this.f2107c) {
            this.d.f2052a.b(this.f2106b);
        }
        this.f2108e.a();
    }
}
