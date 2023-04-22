package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import d0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import u1.b0;
import u1.c0;
import u1.n;
import u1.o;
import u1.p;
import u1.q;
import u1.r;
import u1.u;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    public static final int[] M = {2, 1, 3, 4};
    public static final PathMotion N = new a();
    public static ThreadLocal<p.a<Animator, b>> O = new ThreadLocal<>();
    public int[] A;
    public ArrayList<q> B;
    public ArrayList<q> C;
    public ArrayList<Animator> D;
    public int E;
    public boolean F;
    public boolean G;
    public ArrayList<d> H;
    public ArrayList<Animator> I;
    public af.c J;
    public c K;
    public PathMotion L;

    /* renamed from: c  reason: collision with root package name */
    public String f3212c;

    /* renamed from: f  reason: collision with root package name */
    public long f3213f;

    /* renamed from: j  reason: collision with root package name */
    public long f3214j;

    /* renamed from: m  reason: collision with root package name */
    public TimeInterpolator f3215m;
    public ArrayList<Integer> n;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<View> f3216t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<Integer> f3217u;

    /* renamed from: w  reason: collision with root package name */
    public r f3218w;
    public r y;

    /* renamed from: z  reason: collision with root package name */
    public TransitionSet f3219z;

    /* loaded from: classes.dex */
    public static class a extends PathMotion {
        @Override // androidx.transition.PathMotion
        public Path a(float f10, float f11, float f12, float f13) {
            Path path = new Path();
            path.moveTo(f10, f11);
            path.lineTo(f12, f13);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f3220a;

        /* renamed from: b  reason: collision with root package name */
        public String f3221b;

        /* renamed from: c  reason: collision with root package name */
        public q f3222c;
        public c0 d;

        /* renamed from: e  reason: collision with root package name */
        public Transition f3223e;

        public b(View view, String str, Transition transition, c0 c0Var, q qVar) {
            this.f3220a = view;
            this.f3221b = str;
            this.f3222c = qVar;
            this.d = c0Var;
            this.f3223e = transition;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract Rect a(Transition transition);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Transition transition);

        void b(Transition transition);

        void c(Transition transition);

        void d(Transition transition);

        void e(Transition transition);
    }

    public Transition() {
        this.f3212c = getClass().getName();
        this.f3213f = -1L;
        this.f3214j = -1L;
        this.f3215m = null;
        this.n = new ArrayList<>();
        this.f3216t = new ArrayList<>();
        this.f3217u = null;
        this.f3218w = new r();
        this.y = new r();
        this.f3219z = null;
        this.A = M;
        this.D = new ArrayList<>();
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = new ArrayList<>();
        this.L = N;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        boolean z10;
        this.f3212c = getClass().getName();
        this.f3213f = -1L;
        this.f3214j = -1L;
        this.f3215m = null;
        this.n = new ArrayList<>();
        this.f3216t = new ArrayList<>();
        this.f3217u = null;
        this.f3218w = new r();
        this.y = new r();
        this.f3219z = null;
        this.A = M;
        this.D = new ArrayList<>();
        this.E = 0;
        this.F = false;
        this.G = false;
        this.H = null;
        this.I = new ArrayList<>();
        this.L = N;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15489a);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long d10 = h.d(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (d10 >= 0) {
            E(d10);
        }
        long j10 = h.f(xmlResourceParser, "startDelay") ? obtainStyledAttributes.getInt(2, -1) : -1;
        if (j10 > 0) {
            J(j10);
        }
        int resourceId = !h.f(xmlResourceParser, "interpolator") ? 0 : obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId > 0) {
            G(AnimationUtils.loadInterpolator(context, resourceId));
        }
        String e10 = h.e(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (e10 != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(e10, ",");
            int[] iArr = new int[stringTokenizer.countTokens()];
            int i10 = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String trim = stringTokenizer.nextToken().trim();
                if ("id".equalsIgnoreCase(trim)) {
                    iArr[i10] = 3;
                } else if ("instance".equalsIgnoreCase(trim)) {
                    iArr[i10] = 1;
                } else if (AppMeasurementSdk.ConditionalUserProperty.NAME.equalsIgnoreCase(trim)) {
                    iArr[i10] = 2;
                } else if ("itemId".equalsIgnoreCase(trim)) {
                    iArr[i10] = 4;
                } else if (!trim.isEmpty()) {
                    throw new InflateException(android.support.v4.media.b.j("Unknown match type in matchOrder: '", trim, "'"));
                } else {
                    int[] iArr2 = new int[iArr.length - 1];
                    System.arraycopy(iArr, 0, iArr2, 0, i10);
                    i10--;
                    iArr = iArr2;
                }
                i10++;
            }
            if (iArr.length == 0) {
                this.A = M;
            } else {
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    int i12 = iArr[i11];
                    if (!(i12 >= 1 && i12 <= 4)) {
                        throw new IllegalArgumentException("matches contains invalid value");
                    }
                    int i13 = iArr[i11];
                    int i14 = 0;
                    while (true) {
                        if (i14 >= i11) {
                            z10 = false;
                            break;
                        } else if (iArr[i14] == i13) {
                            z10 = true;
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (z10) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                }
                this.A = (int[]) iArr.clone();
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static void c(r rVar, View view, q qVar) {
        rVar.f15503a.put(view, qVar);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (rVar.f15504b.indexOfKey(id2) >= 0) {
                rVar.f15504b.put(id2, null);
            } else {
                rVar.f15504b.put(id2, view);
            }
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        String k10 = x.i.k(view);
        if (k10 != null) {
            if (rVar.d.e(k10) >= 0) {
                rVar.d.put(k10, null);
            } else {
                rVar.d.put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                p.d<View> dVar = rVar.f15505c;
                if (dVar.f13745c) {
                    dVar.d();
                }
                if (a0.b.h(dVar.f13746f, dVar.f13748m, itemIdAtPosition) < 0) {
                    x.d.r(view, true);
                    rVar.f15505c.j(itemIdAtPosition, view);
                    return;
                }
                View f10 = rVar.f15505c.f(itemIdAtPosition);
                if (f10 != null) {
                    x.d.r(f10, false);
                    rVar.f15505c.j(itemIdAtPosition, null);
                }
            }
        }
    }

    public static p.a<Animator, b> t() {
        p.a<Animator, b> aVar = O.get();
        if (aVar == null) {
            aVar = new p.a<>();
            O.set(aVar);
        }
        return aVar;
    }

    public static boolean y(q qVar, q qVar2, String str) {
        Object obj = qVar.f15500a.get(str);
        Object obj2 = qVar2.f15500a.get(str);
        boolean z10 = true;
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null) {
            if (obj2 == null) {
                return true;
            }
            z10 = true ^ obj.equals(obj2);
        }
        return z10;
    }

    public Transition A(d dVar) {
        ArrayList<d> arrayList = this.H;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.H.size() == 0) {
            this.H = null;
        }
        return this;
    }

    public Transition B(View view) {
        this.f3216t.remove(view);
        return this;
    }

    public void C(View view) {
        if (this.F) {
            if (!this.G) {
                p.a<Animator, b> t2 = t();
                int i10 = t2.f13768j;
                mb.a aVar = u.f15511a;
                WindowId windowId = view.getWindowId();
                for (int i11 = i10 - 1; i11 >= 0; i11--) {
                    b l10 = t2.l(i11);
                    if (l10.f3220a != null) {
                        c0 c0Var = l10.d;
                        if ((c0Var instanceof b0) && ((b0) c0Var).f15467a.equals(windowId)) {
                            t2.h(i11).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.H;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.H.clone();
                    int size = arrayList2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((d) arrayList2.get(i12)).e(this);
                    }
                }
            }
            this.F = false;
        }
    }

    public void D() {
        K();
        p.a<Animator, b> t2 = t();
        Iterator<Animator> it = this.I.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (t2.containsKey(next)) {
                K();
                if (next != null) {
                    next.addListener(new o(this, t2));
                    long j10 = this.f3214j;
                    if (j10 >= 0) {
                        next.setDuration(j10);
                    }
                    long j11 = this.f3213f;
                    if (j11 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j11);
                    }
                    TimeInterpolator timeInterpolator = this.f3215m;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new p(this));
                    next.start();
                }
            }
        }
        this.I.clear();
        p();
    }

    public Transition E(long j10) {
        this.f3214j = j10;
        return this;
    }

    public void F(c cVar) {
        this.K = cVar;
    }

    public Transition G(TimeInterpolator timeInterpolator) {
        this.f3215m = timeInterpolator;
        return this;
    }

    public void H(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.L = N;
        } else {
            this.L = pathMotion;
        }
    }

    public void I(af.c cVar) {
        this.J = cVar;
    }

    public Transition J(long j10) {
        this.f3213f = j10;
        return this;
    }

    public void K() {
        if (this.E == 0) {
            ArrayList<d> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) arrayList2.get(i10)).a(this);
                }
            }
            this.G = false;
        }
        this.E++;
    }

    public String L(String str) {
        StringBuilder m10 = a1.a.m(str);
        m10.append(getClass().getSimpleName());
        m10.append("@");
        m10.append(Integer.toHexString(hashCode()));
        m10.append(": ");
        String sb2 = m10.toString();
        if (this.f3214j != -1) {
            StringBuilder l10 = android.support.v4.media.a.l(sb2, "dur(");
            l10.append(this.f3214j);
            l10.append(") ");
            sb2 = l10.toString();
        }
        if (this.f3213f != -1) {
            StringBuilder l11 = android.support.v4.media.a.l(sb2, "dly(");
            l11.append(this.f3213f);
            l11.append(") ");
            sb2 = l11.toString();
        }
        if (this.f3215m != null) {
            StringBuilder l12 = android.support.v4.media.a.l(sb2, "interp(");
            l12.append(this.f3215m);
            l12.append(") ");
            sb2 = l12.toString();
        }
        if (this.n.size() > 0 || this.f3216t.size() > 0) {
            String l13 = a1.a.l(sb2, "tgts(");
            if (this.n.size() > 0) {
                for (int i10 = 0; i10 < this.n.size(); i10++) {
                    if (i10 > 0) {
                        l13 = a1.a.l(l13, ", ");
                    }
                    StringBuilder m11 = a1.a.m(l13);
                    m11.append(this.n.get(i10));
                    l13 = m11.toString();
                }
            }
            if (this.f3216t.size() > 0) {
                for (int i11 = 0; i11 < this.f3216t.size(); i11++) {
                    if (i11 > 0) {
                        l13 = a1.a.l(l13, ", ");
                    }
                    StringBuilder m12 = a1.a.m(l13);
                    m12.append(this.f3216t.get(i11));
                    l13 = m12.toString();
                }
            }
            return a1.a.l(l13, ")");
        }
        return sb2;
    }

    public Transition a(d dVar) {
        if (this.H == null) {
            this.H = new ArrayList<>();
        }
        this.H.add(dVar);
        return this;
    }

    public Transition b(View view) {
        this.f3216t.add(view);
        return this;
    }

    public void cancel() {
        for (int size = this.D.size() - 1; size >= 0; size--) {
            this.D.get(size).cancel();
        }
        ArrayList<d> arrayList = this.H;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.H.clone();
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((d) arrayList2.get(i10)).d(this);
            }
        }
    }

    public abstract void d(q qVar);

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            r2 = r5
            if (r6 != 0) goto L5
            r4 = 5
            return
        L5:
            int r4 = r6.getId()
            r0 = r4
            java.util.ArrayList<java.lang.Integer> r1 = r2.f3217u
            r4 = 2
            if (r1 == 0) goto L1c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r4 = r1.contains(r0)
            r0 = r4
            if (r0 == 0) goto L1c
            r4 = 4
            return
        L1c:
            r4 = 5
            android.view.ViewParent r4 = r6.getParent()
            r0 = r4
            boolean r0 = r0 instanceof android.view.ViewGroup
            r4 = 6
            if (r0 == 0) goto L54
            r4 = 6
            u1.q r0 = new u1.q
            r4 = 6
            r0.<init>(r6)
            if (r7 == 0) goto L35
            r2.i(r0)
            r4 = 2
            goto L38
        L35:
            r2.d(r0)
        L38:
            java.util.ArrayList<androidx.transition.Transition> r1 = r0.f15502c
            r4 = 3
            r1.add(r2)
            r2.g(r0)
            r4 = 3
            if (r7 == 0) goto L4c
            r4 = 7
            u1.r r1 = r2.f3218w
            r4 = 3
            c(r1, r6, r0)
            goto L55
        L4c:
            r4 = 7
            u1.r r1 = r2.y
            r4 = 2
            c(r1, r6, r0)
            r4 = 5
        L54:
            r4 = 3
        L55:
            boolean r0 = r6 instanceof android.view.ViewGroup
            r4 = 6
            if (r0 == 0) goto L71
            r4 = 6
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r4 = 0
            r0 = r4
        L5f:
            int r1 = r6.getChildCount()
            if (r0 >= r1) goto L71
            r4 = 4
            android.view.View r1 = r6.getChildAt(r0)
            r2.f(r1, r7)
            r4 = 5
            int r0 = r0 + 1
            goto L5f
        L71:
            r4 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.f(android.view.View, boolean):void");
    }

    public void g(q qVar) {
        if (this.J != null && !qVar.f15500a.isEmpty()) {
            String[] h10 = this.J.h();
            if (h10 == null) {
                return;
            }
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= h10.length) {
                    z10 = true;
                    break;
                } else if (!qVar.f15500a.containsKey(h10[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
            if (!z10) {
                this.J.d(qVar);
            }
        }
    }

    public abstract void i(q qVar);

    public void j(ViewGroup viewGroup, boolean z10) {
        k(z10);
        if (this.n.size() <= 0 && this.f3216t.size() <= 0) {
            f(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < this.n.size(); i10++) {
            View findViewById = viewGroup.findViewById(this.n.get(i10).intValue());
            if (findViewById != null) {
                q qVar = new q(findViewById);
                if (z10) {
                    i(qVar);
                } else {
                    d(qVar);
                }
                qVar.f15502c.add(this);
                g(qVar);
                if (z10) {
                    c(this.f3218w, findViewById, qVar);
                } else {
                    c(this.y, findViewById, qVar);
                }
            }
        }
        for (int i11 = 0; i11 < this.f3216t.size(); i11++) {
            View view = this.f3216t.get(i11);
            q qVar2 = new q(view);
            if (z10) {
                i(qVar2);
            } else {
                d(qVar2);
            }
            qVar2.f15502c.add(this);
            g(qVar2);
            if (z10) {
                c(this.f3218w, view, qVar2);
            } else {
                c(this.y, view, qVar2);
            }
        }
    }

    public void k(boolean z10) {
        if (z10) {
            this.f3218w.f15503a.clear();
            this.f3218w.f15504b.clear();
            this.f3218w.f15505c.b();
            return;
        }
        this.y.f15503a.clear();
        this.y.f15504b.clear();
        this.y.f15505c.b();
    }

    @Override // 
    /* renamed from: l */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.I = new ArrayList<>();
            transition.f3218w = new r();
            transition.y = new r();
            transition.B = null;
            transition.C = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, q qVar, q qVar2) {
        return null;
    }

    public void o(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        Animator n;
        int i10;
        int i11;
        View view;
        Animator animator;
        q qVar;
        Animator animator2;
        q qVar2;
        p.a<Animator, b> t2 = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j10 = Long.MAX_VALUE;
        int i12 = 0;
        while (i12 < size) {
            q qVar3 = arrayList.get(i12);
            q qVar4 = arrayList2.get(i12);
            if (qVar3 != null && !qVar3.f15502c.contains(this)) {
                qVar3 = null;
            }
            if (qVar4 != null && !qVar4.f15502c.contains(this)) {
                qVar4 = null;
            }
            if (qVar3 != null || qVar4 != null) {
                if ((qVar3 == null || qVar4 == null || w(qVar3, qVar4)) && (n = n(viewGroup, qVar3, qVar4)) != null) {
                    if (qVar4 != null) {
                        view = qVar4.f15501b;
                        String[] u2 = u();
                        if (u2 != null && u2.length > 0) {
                            qVar2 = new q(view);
                            i10 = size;
                            q qVar5 = rVar2.f15503a.get(view);
                            if (qVar5 != null) {
                                int i13 = 0;
                                while (i13 < u2.length) {
                                    qVar2.f15500a.put(u2[i13], qVar5.f15500a.get(u2[i13]));
                                    i13++;
                                    i12 = i12;
                                    qVar5 = qVar5;
                                }
                            }
                            i11 = i12;
                            int i14 = t2.f13768j;
                            int i15 = 0;
                            while (true) {
                                if (i15 >= i14) {
                                    animator2 = n;
                                    break;
                                }
                                b bVar = t2.get(t2.h(i15));
                                if (bVar.f3222c != null && bVar.f3220a == view && bVar.f3221b.equals(this.f3212c) && bVar.f3222c.equals(qVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i15++;
                            }
                        } else {
                            i10 = size;
                            i11 = i12;
                            animator2 = n;
                            qVar2 = null;
                        }
                        animator = animator2;
                        qVar = qVar2;
                    } else {
                        i10 = size;
                        i11 = i12;
                        view = qVar3.f15501b;
                        animator = n;
                        qVar = null;
                    }
                    if (animator != null) {
                        af.c cVar = this.J;
                        if (cVar != null) {
                            long i16 = cVar.i(viewGroup, this, qVar3, qVar4);
                            sparseIntArray.put(this.I.size(), (int) i16);
                            j10 = Math.min(i16, j10);
                        }
                        long j11 = j10;
                        String str = this.f3212c;
                        mb.a aVar = u.f15511a;
                        t2.put(animator, new b(view, str, this, new b0(viewGroup), qVar));
                        this.I.add(animator);
                        j10 = j11;
                    }
                    i12 = i11 + 1;
                    size = i10;
                }
            }
            i10 = size;
            i11 = i12;
            i12 = i11 + 1;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i17 = 0; i17 < sparseIntArray.size(); i17++) {
                Animator animator3 = this.I.get(sparseIntArray.keyAt(i17));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i17) - j10));
            }
        }
    }

    public void p() {
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 == 0) {
            ArrayList<d> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((d) arrayList2.get(i11)).c(this);
                }
            }
            for (int i12 = 0; i12 < this.f3218w.f15505c.k(); i12++) {
                View l10 = this.f3218w.f15505c.l(i12);
                if (l10 != null) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.d.r(l10, false);
                }
            }
            for (int i13 = 0; i13 < this.y.f15505c.k(); i13++) {
                View l11 = this.y.f15505c.l(i13);
                if (l11 != null) {
                    WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                    x.d.r(l11, false);
                }
            }
            this.G = true;
        }
    }

    public Transition q(int i10, boolean z10) {
        ArrayList<Integer> arrayList = this.f3217u;
        if (i10 > 0) {
            if (z10) {
                Integer valueOf = Integer.valueOf(i10);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(valueOf)) {
                    arrayList.add(valueOf);
                    this.f3217u = arrayList;
                    return this;
                }
            } else {
                Integer valueOf2 = Integer.valueOf(i10);
                if (arrayList != null) {
                    arrayList.remove(valueOf2);
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                }
            }
        }
        this.f3217u = arrayList;
        return this;
    }

    public Rect r() {
        c cVar = this.K;
        if (cVar == null) {
            return null;
        }
        return cVar.a(this);
    }

    public q s(View view, boolean z10) {
        TransitionSet transitionSet = this.f3219z;
        if (transitionSet != null) {
            return transitionSet.s(view, z10);
        }
        ArrayList<q> arrayList = z10 ? this.B : this.C;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = -1;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            q qVar = arrayList.get(i11);
            if (qVar == null) {
                return null;
            }
            if (qVar.f15501b == view) {
                i10 = i11;
                break;
            }
            i11++;
        }
        if (i10 >= 0) {
            return (z10 ? this.C : this.B).get(i10);
        }
        return null;
    }

    public String toString() {
        return L(BuildConfig.FLAVOR);
    }

    public String[] u() {
        return null;
    }

    public q v(View view, boolean z10) {
        TransitionSet transitionSet = this.f3219z;
        if (transitionSet != null) {
            return transitionSet.v(view, z10);
        }
        return (z10 ? this.f3218w : this.y).f15503a.getOrDefault(view, null);
    }

    public boolean w(q qVar, q qVar2) {
        if (qVar == null || qVar2 == null) {
            return false;
        }
        String[] u2 = u();
        if (u2 == null) {
            for (String str : qVar.f15500a.keySet()) {
                if (y(qVar, qVar2, str)) {
                }
            }
            return false;
        }
        for (String str2 : u2) {
            if (!y(qVar, qVar2, str2)) {
            }
        }
        return false;
        return true;
    }

    public boolean x(View view) {
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f3217u;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id2))) {
            if ((this.n.size() != 0 || this.f3216t.size() != 0) && !this.n.contains(Integer.valueOf(id2)) && !this.f3216t.contains(view)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void z(View view) {
        int i10;
        if (!this.G) {
            p.a<Animator, b> t2 = t();
            int i11 = t2.f13768j;
            mb.a aVar = u.f15511a;
            WindowId windowId = view.getWindowId();
            int i12 = i11 - 1;
            while (true) {
                i10 = 0;
                if (i12 < 0) {
                    break;
                }
                b l10 = t2.l(i12);
                if (l10.f3220a != null) {
                    c0 c0Var = l10.d;
                    if ((c0Var instanceof b0) && ((b0) c0Var).f15467a.equals(windowId)) {
                        i10 = 1;
                    }
                    if (i10 != 0) {
                        t2.h(i12).pause();
                    }
                }
                i12--;
            }
            ArrayList<d> arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                while (i10 < size) {
                    ((d) arrayList2.get(i10)).b(this);
                    i10++;
                }
            }
            this.F = true;
        }
    }
}
