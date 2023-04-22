package androidx.fragment.app;

import android.animation.Animator;
import i0.b;

/* loaded from: classes.dex */
public class e implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f2113a;

    public e(c cVar, Animator animator) {
        this.f2113a = animator;
    }

    @Override // i0.b.a
    public void a() {
        this.f2113a.end();
    }
}
