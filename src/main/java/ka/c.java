package ka;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import o0.d;

/* loaded from: classes2.dex */
public class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f12043b;

    public c(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f12043b = bottomSheetBehavior;
        this.f12042a = i10;
    }

    @Override // o0.d
    public boolean a(View view, d.a aVar) {
        this.f12043b.E(this.f12042a);
        return true;
    }
}
