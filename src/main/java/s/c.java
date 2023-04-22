package s;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c extends ConstraintWidget {
    public ArrayList<ConstraintWidget> N0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void K() {
        this.N0.clear();
        super.K();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void N(q.a aVar) {
        super.N(aVar);
        int size = this.N0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.N0.get(i10).N(aVar);
        }
    }

    public void b0() {
        ArrayList<ConstraintWidget> arrayList = this.N0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.N0.get(i10);
            if (constraintWidget instanceof c) {
                ((c) constraintWidget).b0();
            }
        }
    }
}
