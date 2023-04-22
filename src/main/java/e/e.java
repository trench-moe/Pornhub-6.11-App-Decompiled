package e;

import android.os.Bundle;
import androidx.savedstate.a;

/* loaded from: classes.dex */
public class e implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f8930a;

    public e(g gVar) {
        this.f8930a = gVar;
    }

    @Override // androidx.savedstate.a.b
    public Bundle a() {
        Bundle bundle = new Bundle();
        this.f8930a.x().p(bundle);
        return bundle;
    }
}
