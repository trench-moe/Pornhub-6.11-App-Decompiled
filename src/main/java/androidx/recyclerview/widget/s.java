package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class s extends f0 {
    public y d;

    /* renamed from: e  reason: collision with root package name */
    public y f3117e;

    @Override // androidx.recyclerview.widget.f0
    public int[] b(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = g(view, j(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = g(view, k(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.f0
    public View d(RecyclerView.l lVar) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b  */
    @Override // androidx.recyclerview.widget.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int e(androidx.recyclerview.widget.RecyclerView.l r13, int r14, int r15) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            r8 = -1
            r1 = r8
            if (r0 != 0) goto L7
            return r1
        L7:
            r11 = 1
            int r0 = r13.H()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            android.view.View r2 = r12.d(r13)
            if (r2 != 0) goto L17
            r11 = 1
            return r1
        L17:
            r11 = 4
            int r8 = r13.P(r2)
            r2 = r8
            if (r2 != r1) goto L20
            return r1
        L20:
            r3 = r13
            androidx.recyclerview.widget.RecyclerView$v$b r3 = (androidx.recyclerview.widget.RecyclerView.v.b) r3
            int r4 = r0 + (-1)
            r11 = 3
            android.graphics.PointF r8 = r3.a(r4)
            r3 = r8
            if (r3 != 0) goto L2e
            return r1
        L2e:
            r9 = 4
            boolean r5 = r13.e()
            r8 = 0
            r6 = r8
            r8 = 0
            r7 = r8
            if (r5 == 0) goto L4d
            r11 = 2
            androidx.recyclerview.widget.y r5 = r12.j(r13)
            int r8 = r12.h(r13, r5, r14, r7)
            r14 = r8
            float r5 = r3.x
            r10 = 2
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4f
            int r14 = -r14
            r10 = 2
            goto L50
        L4d:
            r9 = 2
            r14 = 0
        L4f:
            r9 = 6
        L50:
            boolean r8 = r13.f()
            r5 = r8
            if (r5 == 0) goto L6b
            androidx.recyclerview.widget.y r8 = r12.k(r13)
            r5 = r8
            int r15 = r12.h(r13, r5, r7, r15)
            float r3 = r3.y
            r11 = 2
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r11 = 1
            if (r3 >= 0) goto L6e
            r11 = 5
            int r15 = -r15
            goto L6f
        L6b:
            r9 = 6
            r15 = 0
            r9 = 2
        L6e:
            r10 = 6
        L6f:
            boolean r13 = r13.f()
            if (r13 == 0) goto L76
            r14 = r15
        L76:
            r10 = 1
            if (r14 != 0) goto L7b
            r11 = 4
            return r1
        L7b:
            int r2 = r2 + r14
            r11 = 5
            if (r2 >= 0) goto L80
            goto L81
        L80:
            r7 = r2
        L81:
            if (r7 < r0) goto L85
            r11 = 3
            goto L86
        L85:
            r4 = r7
        L86:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.s.e(androidx.recyclerview.widget.RecyclerView$l, int, int):int");
    }

    public final int g(View view, y yVar) {
        return ((yVar.c(view) / 2) + yVar.e(view)) - ((yVar.l() / 2) + yVar.k());
    }

    public final int h(RecyclerView.l lVar, y yVar, int i10, int i11) {
        int max;
        this.f2978b.fling(0, 0, i10, i11, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE, IntCompanionObject.MIN_VALUE, IntCompanionObject.MAX_VALUE);
        int[] iArr = {this.f2978b.getFinalX(), this.f2978b.getFinalY()};
        int x10 = lVar.x();
        float f10 = 1.0f;
        if (x10 != 0) {
            View view = null;
            View view2 = null;
            int i12 = IntCompanionObject.MAX_VALUE;
            int i13 = IntCompanionObject.MIN_VALUE;
            for (int i14 = 0; i14 < x10; i14++) {
                View w10 = lVar.w(i14);
                int P = lVar.P(w10);
                if (P != -1) {
                    if (P < i12) {
                        view = w10;
                        i12 = P;
                    }
                    if (P > i13) {
                        view2 = w10;
                        i13 = P;
                    }
                }
            }
            if (view != null && view2 != null && (max = Math.max(yVar.b(view), yVar.b(view2)) - Math.min(yVar.e(view), yVar.e(view2))) != 0) {
                f10 = (max * 1.0f) / ((i13 - i12) + 1);
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f10);
    }

    public final View i(RecyclerView.l lVar, y yVar) {
        int x10 = lVar.x();
        View view = null;
        if (x10 == 0) {
            return null;
        }
        int l10 = (yVar.l() / 2) + yVar.k();
        int i10 = IntCompanionObject.MAX_VALUE;
        for (int i11 = 0; i11 < x10; i11++) {
            View w10 = lVar.w(i11);
            int abs = Math.abs(((yVar.c(w10) / 2) + yVar.e(w10)) - l10);
            if (abs < i10) {
                view = w10;
                i10 = abs;
            }
        }
        return view;
    }

    public final y j(RecyclerView.l lVar) {
        y yVar = this.f3117e;
        if (yVar == null || yVar.f3121a != lVar) {
            this.f3117e = new w(lVar);
        }
        return this.f3117e;
    }

    public final y k(RecyclerView.l lVar) {
        y yVar = this.d;
        if (yVar == null || yVar.f3121a != lVar) {
            this.d = new x(lVar);
        }
        return this.d;
    }
}
