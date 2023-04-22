package t9;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w2 extends c3 {
    public w2(int i10) {
        super(i10);
    }

    @Override // t9.c3
    public final void a() {
        if (!this.f15199m) {
            for (int i10 = 0; i10 < b(); i10++) {
                Map.Entry d = d(i10);
                if (((g1) d.getKey()).a()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            loop1: while (true) {
                for (Map.Entry entry : this.f15198j.isEmpty() ? k0.f15281j : this.f15198j.entrySet()) {
                    if (((g1) entry.getKey()).a()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
        }
        super.a();
    }
}
