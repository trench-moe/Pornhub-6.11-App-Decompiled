package f4;

import aa.d;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import b4.d;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.view.login.LoginActivity;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.Objects;
import k8.m;
import kotlin.jvm.internal.Intrinsics;
import s6.s;
import w6.l0;
import w6.n0;
import x6.c0;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements d.a, ea.e, o2.d, s.b, m.a, m.b, ub.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9404c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f9405f;

    public /* synthetic */ i(Object obj, int i10) {
        this.f9404c = i10;
        this.f9405f = obj;
    }

    @Override // o2.d
    public View a(int i10) {
        LockedPayVideoActivity this$0 = (LockedPayVideoActivity) this.f9405f;
        int i11 = LockedPayVideoActivity.R;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LayoutInflater layoutInflater = this$0.getLayoutInflater();
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this$0.N;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        View inflate = layoutInflater.inflate(R.layout.layout_combine_images_horizontal, (ViewGroup) activityLockedPayVideoBinding.f4407l, false);
        t3.o oVar = t3.o.f15126a;
        int[] iArr = t3.o.f15127b;
        int i12 = i10 * 2;
        ((ImageView) inflate.findViewById(R.id.image1)).setImageResource(iArr[i12]);
        ((ImageView) inflate.findViewById(R.id.image2)).setImageResource(iArr[i12 + 1]);
        return inflate;
    }

    @Override // s6.s.b
    public Object apply(Object obj) {
        s sVar = (s) this.f9405f;
        Cursor cursor = (Cursor) obj;
        i6.b bVar = s.f14890t;
        Objects.requireNonNull(sVar);
        while (cursor.moveToNext()) {
            int i10 = cursor.getInt(0);
            sVar.e(i10, LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    @Override // ub.b
    public void b(ub.a aVar) {
        rb.a aVar2 = (rb.a) this.f9405f;
        synchronized (aVar2) {
            if (aVar2.f14745c instanceof ub.c) {
                aVar2.d.add(aVar);
            }
            aVar2.f14745c.b(aVar);
        }
    }

    @Override // b4.d.a
    public void c() {
        n nVar = (n) this.f9405f;
        int i10 = n.E0;
        nVar.I0(LoginActivity.C(nVar.q()));
        nVar.A0.add(nVar.f9414q0.a(false).subscribe(new x2.c(nVar, 9)));
    }

    @Override // k8.m.b
    public void e(Object obj, k8.h hVar) {
        ((n0.c) obj).C((n0) this.f9405f, new n0.d(hVar));
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f9404c) {
            case 4:
                ((n0.c) obj).Z(((l0) this.f9405f).n);
                return;
            default:
                ((c0) obj).h((c0.a) this.f9405f);
                return;
        }
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        LoginFragment loginFragment = (LoginFragment) this.f9405f;
        int i10 = LoginFragment.f5386u0;
        Objects.requireNonNull(loginFragment);
        String m10 = ((d.b) ((d9.f) ((d.a) obj).f11775f)).m();
        if (m10.isEmpty()) {
            loginFragment.N0(loginFragment.I(R.string.error_captcha_init_failed));
        } else {
            loginFragment.M0(m10);
        }
    }
}
