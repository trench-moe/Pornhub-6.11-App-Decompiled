package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.app.pornhub.R;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l {
    public boolean A;
    public boolean B;

    /* renamed from: a  reason: collision with root package name */
    public final StyledPlayerControlView f6624a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6625b;

    /* renamed from: c  reason: collision with root package name */
    public final ViewGroup f6626c;
    public final ViewGroup d;

    /* renamed from: e  reason: collision with root package name */
    public final ViewGroup f6627e;

    /* renamed from: f  reason: collision with root package name */
    public final ViewGroup f6628f;

    /* renamed from: g  reason: collision with root package name */
    public final ViewGroup f6629g;

    /* renamed from: h  reason: collision with root package name */
    public final ViewGroup f6630h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewGroup f6631i;

    /* renamed from: j  reason: collision with root package name */
    public final View f6632j;

    /* renamed from: k  reason: collision with root package name */
    public final View f6633k;

    /* renamed from: l  reason: collision with root package name */
    public final AnimatorSet f6634l;

    /* renamed from: m  reason: collision with root package name */
    public final AnimatorSet f6635m;
    public final AnimatorSet n;

    /* renamed from: o  reason: collision with root package name */
    public final AnimatorSet f6636o;

    /* renamed from: p  reason: collision with root package name */
    public final AnimatorSet f6637p;

    /* renamed from: q  reason: collision with root package name */
    public final ValueAnimator f6638q;

    /* renamed from: r  reason: collision with root package name */
    public final ValueAnimator f6639r;

    /* renamed from: s  reason: collision with root package name */
    public final Runnable f6640s = new k(this, 0);

    /* renamed from: t  reason: collision with root package name */
    public final Runnable f6641t = new u.a(this, 5);

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f6642u = new j1.p(this, 5);

    /* renamed from: v  reason: collision with root package name */
    public final Runnable f6643v = new q0.d(this, 5);

    /* renamed from: w  reason: collision with root package name */
    public final Runnable f6644w = new k(this, 1);

    /* renamed from: x  reason: collision with root package name */
    public final View.OnLayoutChangeListener f6645x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.j
        /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00b3  */
        @Override // android.view.View.OnLayoutChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onLayoutChange(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 198
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.j.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
        }
    };
    public boolean C = true;

    /* renamed from: z  reason: collision with root package name */
    public int f6646z = 0;
    public final List<View> y = new ArrayList();

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = l.this.f6625b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = l.this.f6626c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = l.this.f6627e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l lVar = l.this;
            View view = lVar.f6632j;
            if (!(view instanceof DefaultTimeBar) || lVar.A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
            if (defaultTimeBar.U.isStarted()) {
                defaultTimeBar.U.cancel();
            }
            defaultTimeBar.U.setFloatValues(defaultTimeBar.V, 0.0f);
            defaultTimeBar.U.setDuration(250L);
            defaultTimeBar.U.start();
        }
    }

    /* loaded from: classes.dex */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = l.this.f6625b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = l.this.f6626c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            l lVar = l.this;
            ViewGroup viewGroup2 = lVar.f6627e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(lVar.A ? 0 : 4);
            }
            l lVar2 = l.this;
            View view2 = lVar2.f6632j;
            if (!(view2 instanceof DefaultTimeBar) || lVar2.A) {
                return;
            }
            DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
            if (defaultTimeBar.U.isStarted()) {
                defaultTimeBar.U.cancel();
            }
            defaultTimeBar.W = false;
            defaultTimeBar.U.setFloatValues(defaultTimeBar.V, 1.0f);
            defaultTimeBar.U.setDuration(250L);
            defaultTimeBar.U.start();
        }
    }

    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f6649a;

        public c(StyledPlayerControlView styledPlayerControlView) {
            this.f6649a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.k(1);
            l lVar = l.this;
            if (lVar.B) {
                this.f6649a.post(lVar.f6640s);
                l.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.k(3);
        }
    }

    /* loaded from: classes.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f6651a;

        public d(StyledPlayerControlView styledPlayerControlView) {
            this.f6651a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.k(2);
            l lVar = l.this;
            if (lVar.B) {
                this.f6651a.post(lVar.f6640s);
                l.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.k(3);
        }
    }

    /* loaded from: classes.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ StyledPlayerControlView f6653a;

        public e(StyledPlayerControlView styledPlayerControlView) {
            this.f6653a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.k(2);
            l lVar = l.this;
            if (lVar.B) {
                this.f6653a.post(lVar.f6640s);
                l.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.k(3);
        }
    }

    /* loaded from: classes.dex */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.k(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.k(4);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l.this.k(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            l.this.k(4);
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = l.this.f6628f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = l.this.f6630h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = l.this.f6630h;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = l.this.f6630h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = l.this.f6630h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = l.this.f6628f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    public l(StyledPlayerControlView styledPlayerControlView) {
        this.f6624a = styledPlayerControlView;
        this.f6625b = styledPlayerControlView.findViewById(R.id.exo_controls_background);
        this.f6626c = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_center_controls);
        this.f6627e = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.f6631i = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_time);
        View findViewById = styledPlayerControlView.findViewById(R.id.exo_progress);
        this.f6632j = findViewById;
        this.f6628f = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_basic_controls);
        this.f6629g = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls);
        this.f6630h = (ViewGroup) styledPlayerControlView.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = styledPlayerControlView.findViewById(R.id.exo_overflow_show);
        this.f6633k = findViewById2;
        View findViewById3 = styledPlayerControlView.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new u3.b(this, 15));
            findViewById3.setOnClickListener(new u3.c(this, 17));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l lVar = l.this;
                Objects.requireNonNull(lVar);
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = lVar.f6625b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = lVar.f6626c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
                ViewGroup viewGroup3 = lVar.f6627e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                }
            }
        });
        ofFloat.addListener(new a());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new n4.a(this, 2));
        ofFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6634l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(ofFloat).with(f(0.0f, dimension, findViewById)).with(f(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f6635m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(f(dimension, dimension2, findViewById)).with(f(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(ofFloat).with(f(0.0f, dimension2, findViewById)).with(f(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f6636o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(ofFloat2).with(f(dimension, 0.0f, findViewById)).with(f(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f6637p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(ofFloat2).with(f(dimension2, 0.0f, findViewById)).with(f(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6638q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l lVar = l.this;
                Objects.requireNonNull(lVar);
                lVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat3.addListener(new h());
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f6639r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                l lVar = l.this;
                Objects.requireNonNull(lVar);
                lVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat4.addListener(new i());
    }

    public static void a(l lVar, View view) {
        lVar.i();
        if (view.getId() == R.id.exo_overflow_show) {
            lVar.f6638q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            lVar.f6639r.start();
        }
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height;
    }

    public static int e(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator f(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public final void b(float f10) {
        ViewGroup viewGroup = this.f6630h;
        if (viewGroup != null) {
            this.f6630h.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f6631i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f6628f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public boolean d(View view) {
        return view != null && this.y.contains(view);
    }

    public final void g(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f6624a.postDelayed(runnable, j10);
        }
    }

    public void h() {
        this.f6624a.removeCallbacks(this.f6644w);
        this.f6624a.removeCallbacks(this.f6641t);
        this.f6624a.removeCallbacks(this.f6643v);
        this.f6624a.removeCallbacks(this.f6642u);
    }

    public void i() {
        if (this.f6646z == 3) {
            return;
        }
        h();
        int showTimeoutMs = this.f6624a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                g(this.f6644w, showTimeoutMs);
            } else if (this.f6646z == 1) {
                g(this.f6642u, 2000L);
            } else {
                g(this.f6643v, showTimeoutMs);
            }
        }
    }

    public void j(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.y.remove(view);
            return;
        }
        if (this.A && l(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.y.add(view);
    }

    public final void k(int i10) {
        int i11 = this.f6646z;
        this.f6646z = i10;
        if (i10 == 2) {
            this.f6624a.setVisibility(8);
        } else if (i11 == 2) {
            this.f6624a.setVisibility(0);
        }
        if (i11 != i10) {
            StyledPlayerControlView styledPlayerControlView = this.f6624a;
            Iterator<StyledPlayerControlView.m> it = styledPlayerControlView.f6513f.iterator();
            while (it.hasNext()) {
                it.next().c(styledPlayerControlView.getVisibility());
            }
        }
    }

    public final boolean l(View view) {
        int id2 = view.getId();
        if (id2 != R.id.exo_bottom_bar && id2 != R.id.exo_prev && id2 != R.id.exo_next && id2 != R.id.exo_rew && id2 != R.id.exo_rew_with_amount && id2 != R.id.exo_ffwd) {
            if (id2 != R.id.exo_ffwd_with_amount) {
                return false;
            }
        }
        return true;
    }

    public final void m() {
        if (!this.C) {
            k(0);
            i();
            return;
        }
        int i10 = this.f6646z;
        if (i10 == 1) {
            this.f6636o.start();
        } else if (i10 == 2) {
            this.f6637p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        i();
    }
}
