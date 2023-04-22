package w9;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class f7 extends l7 {
    public f7(int i10) {
        super(i10);
    }

    @Override // w9.l7
    public final void a() {
        if (!this.f17228m) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry d = d(i10);
                if (((m5) d.getKey()).a()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : this.f17227j.isEmpty() ? t9.j0.f15269w : this.f17227j.entrySet()) {
                if (((m5) entry.getKey()).a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
