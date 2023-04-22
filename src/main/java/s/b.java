package s;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import t.g;
import t.j;

/* loaded from: classes.dex */
public class b extends ConstraintWidget implements a {
    public ConstraintWidget[] N0 = new ConstraintWidget[4];
    public int O0 = 0;

    @Override // s.a
    public void a() {
        this.O0 = 0;
        Arrays.fill(this.N0, (Object) null);
    }

    @Override // s.a
    public void b(ConstraintWidget constraintWidget) {
        if (constraintWidget != this) {
            if (constraintWidget == null) {
                return;
            }
            int i10 = this.O0 + 1;
            ConstraintWidget[] constraintWidgetArr = this.N0;
            if (i10 > constraintWidgetArr.length) {
                this.N0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
            }
            ConstraintWidget[] constraintWidgetArr2 = this.N0;
            int i11 = this.O0;
            constraintWidgetArr2[i11] = constraintWidget;
            this.O0 = i11 + 1;
        }
    }

    public void b0(ArrayList<j> arrayList, int i10, j jVar) {
        for (int i11 = 0; i11 < this.O0; i11++) {
            jVar.a(this.N0[i11]);
        }
        for (int i12 = 0; i12 < this.O0; i12++) {
            g.a(this.N0[i12], i10, arrayList, jVar);
        }
    }

    public void c(d dVar) {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void k(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> hashMap) {
        super.k(constraintWidget, hashMap);
        b bVar = (b) constraintWidget;
        this.O0 = 0;
        int i10 = bVar.O0;
        for (int i11 = 0; i11 < i10; i11++) {
            b(hashMap.get(bVar.N0[i11]));
        }
    }
}
