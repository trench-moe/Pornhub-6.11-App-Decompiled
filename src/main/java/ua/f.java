package ua;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f15803a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f15804b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f15805c = null;
    public final Animator.AnimatorListener d = new a();

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f15805c == animator) {
                fVar.f15805c = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f15807a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f15808b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f15807a = iArr;
            this.f15808b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f15803a.add(bVar);
    }
}
