package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public class s {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f2255a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f2256b;

        public a(Animator animator) {
            this.f2255a = null;
            this.f2256b = animator;
        }

        public a(Animation animation) {
            this.f2255a = animation;
            this.f2256b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimationSet implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f2257c;

        /* renamed from: f  reason: collision with root package name */
        public final View f2258f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2259j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2260m;
        public boolean n;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.n = true;
            this.f2257c = viewGroup;
            this.f2258f = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.n = true;
            if (this.f2259j) {
                return !this.f2260m;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2259j = true;
                n0.q.a(this.f2257c, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.n = true;
            if (this.f2259j) {
                return !this.f2260m;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2259j = true;
                n0.q.a(this.f2257c, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2259j || !this.n) {
                this.f2257c.endViewTransition(this.f2258f);
                this.f2260m = true;
                return;
            }
            this.n = false;
            this.f2257c.post(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.fragment.app.s.a a(android.content.Context r9, androidx.fragment.app.Fragment r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.a(android.content.Context, androidx.fragment.app.Fragment, boolean, boolean):androidx.fragment.app.s$a");
    }
}
