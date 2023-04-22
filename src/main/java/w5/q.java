package w5;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class q extends Fragment {

    /* renamed from: n0  reason: collision with root package name */
    public final w5.a f16434n0;

    /* renamed from: o0  reason: collision with root package name */
    public final m f16435o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Set<q> f16436p0;

    /* renamed from: q0  reason: collision with root package name */
    public q f16437q0;

    /* renamed from: r0  reason: collision with root package name */
    public com.bumptech.glide.g f16438r0;

    /* renamed from: s0  reason: collision with root package name */
    public Fragment f16439s0;

    /* loaded from: classes2.dex */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + q.this + "}";
        }
    }

    public q() {
        w5.a aVar = new w5.a();
        this.f16435o0 = new a();
        this.f16436p0 = new HashSet();
        this.f16434n0 = aVar;
    }

    public final Fragment K0() {
        Fragment fragment = this.L;
        return fragment != null ? fragment : this.f16439s0;
    }

    public final void L0(Context context, y yVar) {
        M0();
        q j10 = com.bumptech.glide.b.b(context).f5623t.j(yVar, null);
        this.f16437q0 = j10;
        if (!equals(j10)) {
            this.f16437q0.f16436p0.add(this);
        }
    }

    public final void M0() {
        q qVar = this.f16437q0;
        if (qVar != null) {
            qVar.f16436p0.remove(this);
            this.f16437q0 = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.Fragment] */
    @Override // androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        q qVar = this;
        while (true) {
            ?? r02 = qVar.L;
            if (r02 == 0) {
                break;
            }
            qVar = r02;
        }
        y yVar = qVar.I;
        if (yVar == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            L0(q(), yVar);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.U = true;
        this.f16434n0.a();
        M0();
    }

    @Override // androidx.fragment.app.Fragment
    public void Z() {
        this.U = true;
        this.f16439s0 = null;
        M0();
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        this.U = true;
        this.f16434n0.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        this.U = true;
        this.f16434n0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + K0() + "}";
    }
}
