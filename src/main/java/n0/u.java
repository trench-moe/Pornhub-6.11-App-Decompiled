package n0;

import android.text.TextUtils;
import android.view.View;
import n0.x;

/* loaded from: classes2.dex */
public class u extends x.b<CharSequence> {
    public u(int i10, Class cls, int i11, int i12) {
        super(i10, cls, i11, i12);
    }

    @Override // n0.x.b
    public CharSequence b(View view) {
        return x.m.b(view);
    }

    @Override // n0.x.b
    public void c(View view, CharSequence charSequence) {
        x.m.h(view, charSequence);
    }

    @Override // n0.x.b
    public boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
