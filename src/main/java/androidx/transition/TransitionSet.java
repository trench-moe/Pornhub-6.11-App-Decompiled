package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import d0.h;
import java.util.ArrayList;
import java.util.Iterator;
import u1.n;
import u1.q;
import u1.r;

/* loaded from: classes.dex */
public class TransitionSet extends Transition {
    public ArrayList<Transition> P;
    public boolean Q;
    public int R;
    public boolean S;
    public int T;

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Transition f3224a;

        public a(TransitionSet transitionSet, Transition transition) {
            this.f3224a = transition;
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            this.f3224a.D();
            transition.A(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public TransitionSet f3225a;

        public b(TransitionSet transitionSet) {
            this.f3225a = transitionSet;
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void a(Transition transition) {
            TransitionSet transitionSet = this.f3225a;
            if (transitionSet.S) {
                return;
            }
            transitionSet.K();
            this.f3225a.S = true;
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            TransitionSet transitionSet = this.f3225a;
            int i10 = transitionSet.R - 1;
            transitionSet.R = i10;
            if (i10 == 0) {
                transitionSet.S = false;
                transitionSet.p();
            }
            transition.A(this);
        }
    }

    public TransitionSet() {
        this.P = new ArrayList<>();
        this.Q = true;
        this.S = false;
        this.T = 0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new ArrayList<>();
        this.Q = true;
        this.S = false;
        this.T = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15494g);
        Q(h.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Transition
    public Transition A(Transition.d dVar) {
        super.A(dVar);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition B(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).B(view);
        }
        this.f3216t.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public void C(View view) {
        super.C(view);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).C(view);
        }
    }

    @Override // androidx.transition.Transition
    public void D() {
        if (this.P.isEmpty()) {
            K();
            p();
            return;
        }
        b bVar = new b(this);
        Iterator<Transition> it = this.P.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.R = this.P.size();
        if (this.Q) {
            Iterator<Transition> it2 = this.P.iterator();
            while (it2.hasNext()) {
                it2.next().D();
            }
        } else {
            for (int i10 = 1; i10 < this.P.size(); i10++) {
                this.P.get(i10 - 1).a(new a(this, this.P.get(i10)));
            }
            Transition transition = this.P.get(0);
            if (transition != null) {
                transition.D();
            }
        }
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition E(long j10) {
        O(j10);
        return this;
    }

    @Override // androidx.transition.Transition
    public void F(Transition.c cVar) {
        this.K = cVar;
        this.T |= 8;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).F(cVar);
        }
    }

    @Override // androidx.transition.Transition
    public /* bridge */ /* synthetic */ Transition G(TimeInterpolator timeInterpolator) {
        P(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.Transition
    public void H(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.L = Transition.N;
        } else {
            this.L = pathMotion;
        }
        this.T |= 4;
        if (this.P != null) {
            for (int i10 = 0; i10 < this.P.size(); i10++) {
                this.P.get(i10).H(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public void I(af.c cVar) {
        this.J = cVar;
        this.T |= 2;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).I(cVar);
        }
    }

    @Override // androidx.transition.Transition
    public Transition J(long j10) {
        this.f3213f = j10;
        return this;
    }

    @Override // androidx.transition.Transition
    public String L(String str) {
        String L = super.L(str);
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            StringBuilder l10 = android.support.v4.media.a.l(L, "\n");
            l10.append(this.P.get(i10).L(str + "  "));
            L = l10.toString();
        }
        return L;
    }

    public TransitionSet M(Transition transition) {
        this.P.add(transition);
        transition.f3219z = this;
        long j10 = this.f3214j;
        if (j10 >= 0) {
            transition.E(j10);
        }
        if ((this.T & 1) != 0) {
            transition.G(this.f3215m);
        }
        if ((this.T & 2) != 0) {
            transition.I(this.J);
        }
        if ((this.T & 4) != 0) {
            transition.H(this.L);
        }
        if ((this.T & 8) != 0) {
            transition.F(this.K);
        }
        return this;
    }

    public Transition N(int i10) {
        if (i10 >= 0 && i10 < this.P.size()) {
            return this.P.get(i10);
        }
        return null;
    }

    public TransitionSet O(long j10) {
        ArrayList<Transition> arrayList;
        this.f3214j = j10;
        if (j10 >= 0 && (arrayList = this.P) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).E(j10);
            }
        }
        return this;
    }

    public TransitionSet P(TimeInterpolator timeInterpolator) {
        this.T |= 1;
        ArrayList<Transition> arrayList = this.P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.P.get(i10).G(timeInterpolator);
            }
        }
        this.f3215m = timeInterpolator;
        return this;
    }

    public TransitionSet Q(int i10) {
        if (i10 == 0) {
            this.Q = true;
        } else if (i10 != 1) {
            throw new AndroidRuntimeException(a1.a.j("Invalid parameter for TransitionSet ordering: ", i10));
        } else {
            this.Q = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition a(Transition.d dVar) {
        super.a(dVar);
        return this;
    }

    @Override // androidx.transition.Transition
    public Transition b(View view) {
        for (int i10 = 0; i10 < this.P.size(); i10++) {
            this.P.get(i10).b(view);
        }
        this.f3216t.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    public void cancel() {
        super.cancel();
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).cancel();
        }
    }

    @Override // androidx.transition.Transition
    public void d(q qVar) {
        if (x(qVar.f15501b)) {
            Iterator<Transition> it = this.P.iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    Transition next = it.next();
                    if (next.x(qVar.f15501b)) {
                        next.d(qVar);
                        qVar.f15502c.add(next);
                    }
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public void g(q qVar) {
        super.g(qVar);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).g(qVar);
        }
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        if (x(qVar.f15501b)) {
            Iterator<Transition> it = this.P.iterator();
            loop0: while (true) {
                while (it.hasNext()) {
                    Transition next = it.next();
                    if (next.x(qVar.f15501b)) {
                        next.i(qVar);
                        qVar.f15502c.add(next);
                    }
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.P = new ArrayList<>();
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition clone = this.P.get(i10).clone();
            transitionSet.P.add(clone);
            clone.f3219z = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public void o(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j10 = this.f3213f;
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            Transition transition = this.P.get(i10);
            if (j10 > 0 && (this.Q || i10 == 0)) {
                long j11 = transition.f3213f;
                if (j11 > 0) {
                    transition.J(j11 + j10);
                } else {
                    transition.J(j10);
                }
            }
            transition.o(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public void z(View view) {
        super.z(view);
        int size = this.P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.P.get(i10).z(view);
        }
    }
}
