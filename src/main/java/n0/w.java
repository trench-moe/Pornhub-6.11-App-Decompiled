package n0;

import android.view.View;
import n0.x;

/* loaded from: classes2.dex */
public class w extends x.b<Boolean> {
    public w(int i10, Class cls, int i11) {
        super(i10, cls, i11);
    }

    @Override // n0.x.b
    public Boolean b(View view) {
        return Boolean.valueOf(x.m.c(view));
    }

    @Override // n0.x.b
    public void c(View view, Boolean bool) {
        x.m.g(view, bool.booleanValue());
    }

    @Override // n0.x.b
    public boolean f(Boolean bool, Boolean bool2) {
        return !a(bool, bool2);
    }
}
