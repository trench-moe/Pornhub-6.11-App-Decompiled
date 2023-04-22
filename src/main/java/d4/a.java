package d4;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.emoji2.text.k;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c4.e;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import t3.o;
import z2.cp;

/* loaded from: classes.dex */
public abstract class a extends Fragment implements cp {

    /* renamed from: y0  reason: collision with root package name */
    public static final /* synthetic */ int f8757y0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public z.b f8758n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f8759o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f8760p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f8761q0 = true;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f8762r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f8763s0;

    /* renamed from: t0  reason: collision with root package name */
    public View f8764t0;

    /* renamed from: u0  reason: collision with root package name */
    public View f8765u0;

    /* renamed from: v0  reason: collision with root package name */
    public View f8766v0;
    public TextView w0;

    /* renamed from: x0  reason: collision with root package name */
    public RecyclerView f8767x0;

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0119a extends GridLayoutManager.b {
        public C0119a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int c(int i10) {
            int c10 = a.this.L0().c(i10);
            if (c10 != 0) {
                if (c10 == 1) {
                    return a.this.O0();
                }
                throw new IllegalStateException("Unsupported view type");
            }
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public class b extends RecyclerView.p {
        public b(C0119a c0119a) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            NotifyingGridLayoutManager N0 = a.this.N0();
            if (N0 == null || a.this.f8762r0 || N0.Y0() != a.this.L0().a() - 1) {
                return;
            }
            a aVar = a.this;
            if (aVar.f8761q0) {
                aVar.K0();
            }
            a aVar2 = a.this;
            aVar2.U0(aVar2.f8761q0);
        }
    }

    public abstract void K0();

    public abstract c4.a L0();

    public abstract String M0();

    public NotifyingGridLayoutManager N0() {
        return (NotifyingGridLayoutManager) this.f8767x0.getLayoutManager();
    }

    public abstract int O0();

    public abstract void P0();

    public void Q0() {
        NotifyingGridLayoutManager notifyingGridLayoutManager = new NotifyingGridLayoutManager(u0(), O0());
        notifyingGridLayoutManager.K = new C0119a();
        this.f8767x0.setLayoutManager(notifyingGridLayoutManager);
    }

    public void R0() {
        if (L0().a() == 0) {
            this.f8766v0.setVisibility(0);
            this.w0.setText(this.f8760p0);
        }
    }

    public void S0() {
        this.f8762r0 = true;
        if (L0().a() != 0) {
            new Handler().post(new k(this, 2));
            return;
        }
        this.f8764t0.setVisibility(0);
        this.f8766v0.setVisibility(8);
        this.f8765u0.setVisibility(8);
    }

    public void T0() {
        this.f8762r0 = false;
        if (L0().a() == 0) {
            this.f8764t0.setVisibility(8);
        } else {
            L0().p(false);
        }
    }

    public void U0(boolean z10) {
        kf.a.f12078a.a("Scrolled to bottom, load more = %s", Boolean.valueOf(z10));
    }

    public void V0(String str, boolean z10) {
        this.f8759o0 = str;
        ((ImageView) this.f8765u0.findViewById(R.id.error_segment_image)).setImageResource(o.g(z10));
        this.f8765u0.setVisibility(0);
        ((TextView) this.f8765u0.findViewById(R.id.error_txtError)).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_listings, viewGroup, this.f8763s0);
        this.f8764t0 = inflate.findViewById(R.id.container_loading);
        this.f8765u0 = inflate.findViewById(R.id.error_container);
        this.f8766v0 = inflate.findViewById(R.id.empty_content_msg_container);
        this.w0 = (TextView) inflate.findViewById(R.id.empty_content_msg);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recyclerview);
        this.f8767x0 = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f8767x0.g(new e(E().getDimensionPixelSize(R.dimen.item_grid_spacing_small), O0()));
        this.f8767x0.h(new b(null));
        Q0();
        this.f8764t0.setVisibility(this.f8762r0 ? 0 : 8);
        this.f8760p0 = M0();
        this.f8765u0.setOnClickListener(new x3.b(this, 3));
        W0();
        return inflate;
    }

    public abstract void W0();

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        this.U = true;
        if (L0() == null) {
            P0();
            this.f8767x0.setAdapter(L0());
            K0();
            return;
        }
        this.f8767x0.setAdapter(L0());
        if (!TextUtils.isEmpty(this.f8759o0)) {
            K0();
        }
        if (L0().a() == 0) {
            R0();
        }
    }
}
