package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;
import t.j;

/* loaded from: classes.dex */
public class ConstraintAnchor {

    /* renamed from: b  reason: collision with root package name */
    public int f1208b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1209c;
    public final ConstraintWidget d;

    /* renamed from: e  reason: collision with root package name */
    public final Type f1210e;

    /* renamed from: f  reason: collision with root package name */
    public ConstraintAnchor f1211f;

    /* renamed from: i  reason: collision with root package name */
    public SolverVariable f1214i;

    /* renamed from: a  reason: collision with root package name */
    public HashSet<ConstraintAnchor> f1207a = null;

    /* renamed from: g  reason: collision with root package name */
    public int f1212g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f1213h = IntCompanionObject.MIN_VALUE;

    /* loaded from: classes.dex */
    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.d = constraintWidget;
        this.f1210e = type;
    }

    public boolean a(ConstraintAnchor constraintAnchor, int i10) {
        return b(constraintAnchor, i10, IntCompanionObject.MIN_VALUE, false);
    }

    public boolean b(ConstraintAnchor constraintAnchor, int i10, int i11, boolean z10) {
        if (constraintAnchor == null) {
            k();
            return true;
        } else if (z10 || j(constraintAnchor)) {
            this.f1211f = constraintAnchor;
            if (constraintAnchor.f1207a == null) {
                constraintAnchor.f1207a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f1211f.f1207a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f1212g = i10;
            this.f1213h = i11;
            return true;
        } else {
            return false;
        }
    }

    public void c(int i10, ArrayList<j> arrayList, j jVar) {
        HashSet<ConstraintAnchor> hashSet = this.f1207a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                t.g.a(it.next().d, i10, arrayList, jVar);
            }
        }
    }

    public int d() {
        if (this.f1209c) {
            return this.f1208b;
        }
        return 0;
    }

    public int e() {
        ConstraintAnchor constraintAnchor;
        if (this.d.f1251p0 == 8) {
            return 0;
        }
        int i10 = this.f1213h;
        return (i10 == Integer.MIN_VALUE || (constraintAnchor = this.f1211f) == null || constraintAnchor.d.f1251p0 != 8) ? this.f1212g : i10;
    }

    public final ConstraintAnchor f() {
        switch (this.f1210e.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return this.d.N;
            case 2:
                return this.d.O;
            case 3:
                return this.d.L;
            case 4:
                return this.d.M;
            default:
                throw new AssertionError(this.f1210e.name());
        }
    }

    public boolean g() {
        HashSet<ConstraintAnchor> hashSet = this.f1207a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().i()) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        HashSet<ConstraintAnchor> hashSet = this.f1207a;
        if (hashSet == null) {
            return false;
        }
        return hashSet.size() > 0;
    }

    public boolean i() {
        return this.f1211f != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean j(androidx.constraintlayout.core.widgets.ConstraintAnchor r13) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.j(androidx.constraintlayout.core.widgets.ConstraintAnchor):boolean");
    }

    public void k() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f1211f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f1207a) != null) {
            hashSet.remove(this);
            if (this.f1211f.f1207a.size() == 0) {
                this.f1211f.f1207a = null;
            }
        }
        this.f1207a = null;
        this.f1211f = null;
        this.f1212g = 0;
        this.f1213h = IntCompanionObject.MIN_VALUE;
        this.f1209c = false;
        this.f1208b = 0;
    }

    public void l() {
        SolverVariable solverVariable = this.f1214i;
        if (solverVariable == null) {
            this.f1214i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.d();
        }
    }

    public void m(int i10) {
        this.f1208b = i10;
        this.f1209c = true;
    }

    public void n(int i10) {
        if (i()) {
            this.f1213h = i10;
        }
    }

    public String toString() {
        return this.d.f1253q0 + ":" + this.f1210e.toString();
    }
}
