package w5;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Deprecated
/* loaded from: classes2.dex */
public class k extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public final w5.a f16401c;

    /* renamed from: f  reason: collision with root package name */
    public final m f16402f;

    /* renamed from: j  reason: collision with root package name */
    public final Set<k> f16403j;

    /* renamed from: m  reason: collision with root package name */
    public com.bumptech.glide.g f16404m;
    public k n;

    /* renamed from: t  reason: collision with root package name */
    public Fragment f16405t;

    /* loaded from: classes2.dex */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        w5.a aVar = new w5.a();
        this.f16402f = new a();
        this.f16403j = new HashSet();
        this.f16401c = aVar;
    }

    public final void a(Activity activity) {
        b();
        l lVar = com.bumptech.glide.b.b(activity).f5623t;
        Objects.requireNonNull(lVar);
        k i10 = lVar.i(activity.getFragmentManager(), null);
        this.n = i10;
        if (!equals(i10)) {
            this.n.f16403j.add(this);
        }
    }

    public final void b() {
        k kVar = this.n;
        if (kVar != null) {
            kVar.f16403j.remove(this);
            this.n = null;
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f16401c.a();
        b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        b();
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.f16401c.b();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.f16401c.d();
    }

    @Override // android.app.Fragment
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f16405t;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
