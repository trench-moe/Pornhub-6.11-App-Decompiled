package t;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: f  reason: collision with root package name */
    public static int f15055f;

    /* renamed from: b  reason: collision with root package name */
    public int f15057b;

    /* renamed from: c  reason: collision with root package name */
    public int f15058c;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<ConstraintWidget> f15056a = new ArrayList<>();
    public ArrayList<a> d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f15059e = -1;

    /* loaded from: classes2.dex */
    public class a {
        public a(j jVar, ConstraintWidget constraintWidget, androidx.constraintlayout.core.c cVar, int i10) {
            new WeakReference(constraintWidget);
            cVar.o(constraintWidget.L);
            cVar.o(constraintWidget.M);
            cVar.o(constraintWidget.N);
            cVar.o(constraintWidget.O);
            cVar.o(constraintWidget.P);
        }
    }

    public j(int i10) {
        this.f15057b = -1;
        this.f15058c = 0;
        int i11 = f15055f;
        f15055f = i11 + 1;
        this.f15057b = i11;
        this.f15058c = i10;
    }

    public boolean a(ConstraintWidget constraintWidget) {
        if (this.f15056a.contains(constraintWidget)) {
            return false;
        }
        this.f15056a.add(constraintWidget);
        return true;
    }

    public void b(ArrayList<j> arrayList) {
        int size = this.f15056a.size();
        if (this.f15059e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                j jVar = arrayList.get(i10);
                if (this.f15059e == jVar.f15057b) {
                    d(this.f15058c, jVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(androidx.constraintlayout.core.c cVar, int i10) {
        int o10;
        int o11;
        if (this.f15056a.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f15056a;
        androidx.constraintlayout.core.widgets.d dVar = (androidx.constraintlayout.core.widgets.d) arrayList.get(0).X;
        cVar.u();
        dVar.f(cVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList.get(i11).f(cVar, false);
        }
        if (i10 == 0 && dVar.W0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 0);
        }
        if (i10 == 1 && dVar.X0 > 0) {
            androidx.constraintlayout.core.widgets.b.a(dVar, cVar, arrayList, 1);
        }
        try {
            cVar.q();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        this.d = new ArrayList<>();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.d.add(new a(this, arrayList.get(i12), cVar, i10));
        }
        if (i10 == 0) {
            o10 = cVar.o(dVar.L);
            o11 = cVar.o(dVar.N);
            cVar.u();
        } else {
            o10 = cVar.o(dVar.M);
            o11 = cVar.o(dVar.O);
            cVar.u();
        }
        return o11 - o10;
    }

    public void d(int i10, j jVar) {
        Iterator<ConstraintWidget> it = this.f15056a.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            jVar.a(next);
            if (i10 == 0) {
                next.L0 = jVar.f15057b;
            } else {
                next.M0 = jVar.f15057b;
            }
        }
        this.f15059e = jVar.f15057b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f15058c;
        sb2.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String j10 = android.support.v4.media.a.j(sb2, this.f15057b, "] <");
        Iterator<ConstraintWidget> it = this.f15056a.iterator();
        while (it.hasNext()) {
            StringBuilder l10 = android.support.v4.media.a.l(j10, " ");
            l10.append(it.next().f1253q0);
            j10 = l10.toString();
        }
        return a1.a.l(j10, " >");
    }
}
