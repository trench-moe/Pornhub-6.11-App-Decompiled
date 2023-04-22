package m4;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentDvdInfoBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.usecase.UseCaseResult;
import e4.b;
import f3.o;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import u1.f;
import x2.h;
import x2.l0;
import x2.y;
import z2.cp;

/* loaded from: classes2.dex */
public class a extends Fragment implements cp, b.c {

    /* renamed from: x0  reason: collision with root package name */
    public static final String f12883x0 = a.class.getSimpleName();

    /* renamed from: n0  reason: collision with root package name */
    public f f12884n0;

    /* renamed from: o0  reason: collision with root package name */
    public o f12885o0;

    /* renamed from: p0  reason: collision with root package name */
    public UserOrientation f12886p0;

    /* renamed from: q0  reason: collision with root package name */
    public FragmentDvdInfoBinding f12887q0;

    /* renamed from: r0  reason: collision with root package name */
    public LinearLayoutManager f12888r0;

    /* renamed from: s0  reason: collision with root package name */
    public Disposable f12889s0;

    /* renamed from: t0  reason: collision with root package name */
    public e4.b f12890t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f12891u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f12892v0 = true;
    public boolean w0 = false;

    /* loaded from: classes2.dex */
    public class b extends RecyclerView.p {
        public b(C0205a c0205a) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void e(RecyclerView recyclerView, int i10, int i11) {
            a aVar = a.this;
            if (!aVar.w0 && aVar.f12892v0 && aVar.f12888r0.Y0() == a.this.f12890t0.m() - 1) {
                a.this.K0();
            }
        }
    }

    public void K0() {
        f fVar = this.f12884n0;
        String dvdId = this.f2019u.getString("id");
        int a10 = this.f12890t0.a();
        Objects.requireNonNull(fVar);
        Intrinsics.checkNotNullParameter(dvdId, "dvdId");
        Observable startWith = ((b3.f) fVar.f15477c).b(dvdId, 8, a10).toObservable().map(l0.f17789z).onErrorReturn(y.y).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "dvdsRepository.getDvd(\n …th(UseCaseResult.Loading)");
        this.f12889s0 = startWith.subscribe(new h(this, 8));
    }

    public void L0(String str, boolean z10) {
        this.f12891u0 = str;
        ((ImageView) this.f12887q0.f4570c.f4698a.findViewById(R.id.error_segment_image)).setImageResource(t3.o.g(z10));
        this.f12887q0.f4570c.f4698a.setVisibility(0);
        ((TextView) this.f12887q0.f4570c.f4698a.findViewById(R.id.error_txtError)).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12887q0 = FragmentDvdInfoBinding.inflate(layoutInflater);
        this.f12886p0 = this.f12885o0.a().getOrientation();
        this.f12887q0.f4571e.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(n());
        this.f12888r0 = linearLayoutManager;
        this.f12887q0.f4571e.setLayoutManager(linearLayoutManager);
        this.f12887q0.f4571e.h(new b(null));
        return this.f12887q0.f4568a;
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.U = true;
        Disposable disposable = this.f12889s0;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.U = true;
        this.f12887q0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        this.U = true;
        if (this.f12890t0 == null) {
            e4.b bVar = new e4.b(this);
            this.f12890t0 = bVar;
            this.f12887q0.f4571e.setAdapter(bVar);
            K0();
        } else if (TextUtils.isEmpty(this.f12891u0)) {
            this.f12887q0.f4571e.setAdapter(this.f12890t0);
        } else {
            L0(this.f12891u0, UsersConfig.isGay(this.f12886p0));
        }
    }
}
