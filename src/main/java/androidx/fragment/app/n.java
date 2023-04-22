package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class n implements b.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f2207a;

    public n(o oVar) {
        this.f2207a = oVar;
    }

    @Override // b.b
    public void a(Context context) {
        v<?> vVar = this.f2207a.y.f2263a;
        vVar.f2273m.b(vVar, vVar, null);
        Bundle a10 = this.f2207a.f1828m.f3134b.a("android:support:fragments");
        if (a10 != null) {
            Parcelable parcelable = a10.getParcelable("android:support:fragments");
            v<?> vVar2 = this.f2207a.y.f2263a;
            if (!(vVar2 instanceof androidx.lifecycle.b0)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            vVar2.f2273m.c0(parcelable);
        }
    }
}
