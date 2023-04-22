package g;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import g.b;
import g.d;
import p.h;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class a extends g.d implements f0.d {
    public c F;
    public g G;
    public int H;
    public int I;
    public boolean J;

    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f9648a;

        public b(Animatable animatable) {
            super(null);
            this.f9648a = animatable;
        }

        @Override // g.a.g
        public void c() {
            this.f9648a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f9648a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends d.a {
        public p.d<Long> K;
        public h<Integer> L;

        public c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new p.d<>(10);
            this.L = new h<>();
        }

        public static long h(int i10, int i11) {
            return i11 | (i10 << 32);
        }

        @Override // g.d.a, g.b.c
        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return this.L.f(i10, 0).intValue();
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // g.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final v1.c f9649a;

        public d(v1.c cVar) {
            super(null);
            this.f9649a = cVar;
        }

        @Override // g.a.g
        public void c() {
            this.f9649a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f9649a.stop();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f9650a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9651b;

        public e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super(null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            h.a.a(ofInt, true);
            ofInt.setDuration(fVar.f9654c);
            ofInt.setInterpolator(fVar);
            this.f9651b = z11;
            this.f9650a = ofInt;
        }

        @Override // g.a.g
        public boolean a() {
            return this.f9651b;
        }

        @Override // g.a.g
        public void b() {
            this.f9650a.reverse();
        }

        @Override // g.a.g
        public void c() {
            this.f9650a.start();
        }

        @Override // g.a.g
        public void d() {
            this.f9650a.cancel();
        }
    }

    /* loaded from: classes.dex */
    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f9652a;

        /* renamed from: b  reason: collision with root package name */
        public int f9653b;

        /* renamed from: c  reason: collision with root package name */
        public int f9654c;

        public f(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f9653b = numberOfFrames;
            int[] iArr = this.f9652a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f9652a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f9652a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f9654c = i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f9654c) + 0.5f);
            int i11 = this.f9653b;
            int[] iArr = this.f9652a;
            int i12 = 0;
            while (i12 < i11 && i10 >= iArr[i12]) {
                i10 -= iArr[i12];
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f9654c : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public g(C0136a c0136a) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public a(c cVar, Resources resources) {
        super(null);
        this.H = -1;
        this.I = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.F = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0204, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(android.support.v4.media.b.o(r21, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g.a g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):g.a");
    }

    @Override // g.d, g.b
    public b.c b() {
        return new c(this.F, this, null);
    }

    @Override // g.d, g.b
    public void e(b.c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.F = (c) cVar;
        }
    }

    @Override // g.d
    public d.a f() {
        return new c(this.F, this, null);
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.G;
        if (gVar != null) {
            gVar.d();
            this.G = null;
            d(this.H);
            this.H = -1;
            this.I = -1;
        }
    }

    @Override // g.d, g.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.J) {
            super.mutate();
            this.F.e();
            this.J = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    @Override // g.d, g.b, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStateChange(int[] r19) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g.a.onStateChange(int[]):boolean");
    }

    @Override // g.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.G;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
