package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.a;

/* loaded from: classes.dex */
public class m implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f2199a;

    public m(o oVar) {
        this.f2199a = oVar;
    }

    @Override // androidx.savedstate.a.b
    public Bundle a() {
        Bundle bundle = new Bundle();
        do {
        } while (o.v(this.f2199a.u(), Lifecycle.State.CREATED));
        this.f2199a.f2214z.e(Lifecycle.Event.ON_STOP);
        Parcelable d02 = this.f2199a.y.f2263a.f2273m.d0();
        if (d02 != null) {
            bundle.putParcelable("android:support:fragments", d02);
        }
        return bundle;
    }
}
