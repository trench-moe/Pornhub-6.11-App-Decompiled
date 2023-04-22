package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.widget.a;
import java.util.ArrayList;
import t9.j0;

/* loaded from: classes.dex */
public class Carousel extends MotionHelper {
    public b C;
    public final ArrayList<View> D;
    public int E;
    public int F;
    public MotionLayout G;
    public int H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public int S;
    public int T;
    public Runnable U;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: androidx.constraintlayout.helper.widget.Carousel$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0019a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ float f1371c;

            public RunnableC0019a(float f10) {
                this.f1371c = f10;
            }

            @Override // java.lang.Runnable
            public void run() {
                Carousel.this.G.N(5, 1.0f, this.f1371c);
            }
        }

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Carousel.this.G.setProgress(0.0f);
            Carousel.this.x();
            Carousel carousel = Carousel.this;
            carousel.C.a(carousel.F);
            float velocity = Carousel.this.G.getVelocity();
            Carousel carousel2 = Carousel.this;
            if (carousel2.Q != 2 || velocity <= carousel2.R || carousel2.F >= carousel2.C.c() - 1) {
                return;
            }
            Carousel carousel3 = Carousel.this;
            float f10 = velocity * carousel3.N;
            int i10 = carousel3.F;
            if (i10 != 0 || carousel3.E <= i10) {
                if (i10 == carousel3.C.c() - 1) {
                    Carousel carousel4 = Carousel.this;
                    if (carousel4.E < carousel4.F) {
                        return;
                    }
                }
                Carousel.this.G.post(new RunnableC0019a(f10));
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10);

        void b(View view, int i10);

        int c();
    }

    public Carousel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = null;
        this.D = new ArrayList<>();
        this.E = 0;
        this.F = 0;
        this.H = -1;
        this.I = false;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0.9f;
        this.O = 0;
        this.P = 4;
        this.Q = 1;
        this.R = 2.0f;
        this.S = -1;
        this.T = 200;
        this.U = new a();
        w(context, attributeSet);
    }

    public Carousel(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = null;
        this.D = new ArrayList<>();
        this.E = 0;
        this.F = 0;
        this.H = -1;
        this.I = false;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 0.9f;
        this.O = 0;
        this.P = 4;
        this.Q = 1;
        this.R = 2.0f;
        this.S = -1;
        this.T = 200;
        this.U = new a();
        w(context, attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionHelper, androidx.constraintlayout.motion.widget.MotionLayout.i
    public void d(MotionLayout motionLayout, int i10) {
        int i11 = this.F;
        this.E = i11;
        if (i10 == this.M) {
            this.F = i11 + 1;
        } else if (i10 == this.L) {
            this.F = i11 - 1;
        }
        if (this.I) {
            if (this.F >= this.C.c()) {
                this.F = 0;
            }
            if (this.F < 0) {
                this.F = this.C.c() - 1;
            }
        } else {
            if (this.F >= this.C.c()) {
                this.F = this.C.c() - 1;
            }
            if (this.F < 0) {
                this.F = 0;
            }
        }
        if (this.E != this.F) {
            this.G.post(this.U);
        }
    }

    public int getCount() {
        b bVar = this.C;
        if (bVar != null) {
            return bVar.c();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.F;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        androidx.constraintlayout.motion.widget.b bVar;
        androidx.constraintlayout.motion.widget.b bVar2;
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            for (int i10 = 0; i10 < this.f1602f; i10++) {
                int i11 = this.f1601c[i10];
                View i12 = motionLayout.i(i11);
                if (this.H == i11) {
                    this.O = i10;
                }
                this.D.add(i12);
            }
            this.G = motionLayout;
            if (this.Q == 2) {
                a.b F = motionLayout.F(this.K);
                if (F != null && (bVar2 = F.f1461l) != null) {
                    bVar2.f1472c = 5;
                }
                a.b F2 = this.G.F(this.J);
                if (F2 != null && (bVar = F2.f1461l) != null) {
                    bVar.f1472c = 5;
                }
            }
            x();
        }
    }

    public void setAdapter(b bVar) {
        this.C = bVar;
    }

    public final boolean v(int i10, boolean z10) {
        MotionLayout motionLayout;
        a.b F;
        if (i10 != -1 && (motionLayout = this.G) != null && (F = motionLayout.F(i10)) != null && z10 != (!F.f1463o)) {
            F.f1463o = !z10;
            return true;
        }
        return false;
    }

    public final void w(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.y);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 2) {
                    this.H = obtainStyledAttributes.getResourceId(index, this.H);
                } else if (index == 0) {
                    this.J = obtainStyledAttributes.getResourceId(index, this.J);
                } else if (index == 3) {
                    this.K = obtainStyledAttributes.getResourceId(index, this.K);
                } else if (index == 1) {
                    this.P = obtainStyledAttributes.getInt(index, this.P);
                } else if (index == 6) {
                    this.L = obtainStyledAttributes.getResourceId(index, this.L);
                } else if (index == 5) {
                    this.M = obtainStyledAttributes.getResourceId(index, this.M);
                } else if (index == 8) {
                    this.N = obtainStyledAttributes.getFloat(index, this.N);
                } else if (index == 7) {
                    this.Q = obtainStyledAttributes.getInt(index, this.Q);
                } else if (index == 9) {
                    this.R = obtainStyledAttributes.getFloat(index, this.R);
                } else if (index == 4) {
                    this.I = obtainStyledAttributes.getBoolean(index, this.I);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void x() {
        b bVar = this.C;
        if (bVar != null && this.G != null && bVar.c() != 0) {
            int size = this.D.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.D.get(i10);
                int i11 = (this.F + i10) - this.O;
                if (this.I) {
                    if (i11 < 0) {
                        int i12 = this.P;
                        if (i12 != 4) {
                            y(view, i12);
                        } else {
                            y(view, 0);
                        }
                        if (i11 % this.C.c() == 0) {
                            this.C.b(view, 0);
                        } else {
                            b bVar2 = this.C;
                            bVar2.b(view, (i11 % this.C.c()) + bVar2.c());
                        }
                    } else if (i11 >= this.C.c()) {
                        if (i11 == this.C.c()) {
                            i11 = 0;
                        } else if (i11 > this.C.c()) {
                            i11 %= this.C.c();
                        }
                        int i13 = this.P;
                        if (i13 != 4) {
                            y(view, i13);
                        } else {
                            y(view, 0);
                        }
                        this.C.b(view, i11);
                    } else {
                        y(view, 0);
                        this.C.b(view, i11);
                    }
                } else if (i11 < 0) {
                    y(view, this.P);
                } else if (i11 >= this.C.c()) {
                    y(view, this.P);
                } else {
                    y(view, 0);
                    this.C.b(view, i11);
                }
            }
            int i14 = this.S;
            if (i14 != -1 && i14 != this.F) {
                this.G.post(new u.a(this, 0));
            } else if (i14 == this.F) {
                this.S = -1;
            }
            if (this.J != -1 && this.K != -1) {
                if (this.I) {
                    return;
                }
                int c10 = this.C.c();
                if (this.F == 0) {
                    v(this.J, false);
                } else {
                    v(this.J, true);
                    this.G.setTransition(this.J);
                }
                if (this.F == c10 - 1) {
                    v(this.K, false);
                    return;
                }
                v(this.K, true);
                this.G.setTransition(this.K);
                return;
            }
            Log.w("Carousel", "No backward or forward transitions defined for Carousel!");
        }
    }

    public final boolean y(View view, int i10) {
        int[] constraintSetIds;
        a.C0022a k10;
        MotionLayout motionLayout = this.G;
        if (motionLayout == null) {
            return false;
        }
        boolean z10 = false;
        for (int i11 : motionLayout.getConstraintSetIds()) {
            androidx.constraintlayout.motion.widget.a aVar = this.G.I;
            androidx.constraintlayout.widget.a b10 = aVar == null ? null : aVar.b(i11);
            boolean z11 = true;
            if (b10 != null && (k10 = b10.k(view.getId())) != null) {
                k10.f1691c.f1762c = 1;
                view.setVisibility(i10);
                z10 |= z11;
            }
            z11 = false;
            z10 |= z11;
        }
        return z10;
    }
}
