package v3;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import z2.cp;

/* loaded from: classes.dex */
public class c extends Fragment implements cp {

    /* renamed from: n0  reason: collision with root package name */
    public Map<Integer, View> f15999n0;

    /* renamed from: o0  reason: collision with root package name */
    public z.b f16000o0;

    public c(int i10) {
        super(i10);
        this.f15999n0 = new LinkedHashMap();
    }

    public void K0() {
        this.f15999n0.clear();
    }

    public final z.b L0() {
        z.b bVar = this.f16000o0;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("viewModelFactory");
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        K0();
    }
}
