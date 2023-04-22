package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p0;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public class r extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2247a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2248b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Fragment f2249c;
    public final /* synthetic */ p0.a d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ i0.b f2250e;

    public r(ViewGroup viewGroup, View view, Fragment fragment, p0.a aVar, i0.b bVar) {
        this.f2247a = viewGroup;
        this.f2248b = view;
        this.f2249c = fragment;
        this.d = aVar;
        this.f2250e = bVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f2247a.endViewTransition(this.f2248b);
        Fragment fragment = this.f2249c;
        Fragment.b bVar = fragment.Z;
        Animator animator2 = bVar == null ? null : bVar.f2025b;
        fragment.z0(null);
        if (animator2 == null || this.f2247a.indexOfChild(this.f2248b) >= 0) {
            return;
        }
        ((y.d) this.d).a(this.f2249c, this.f2250e);
    }
}
