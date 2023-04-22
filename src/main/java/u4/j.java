package u4;

import android.widget.ImageView;
import com.app.pornhub.databinding.ItemLayoutVideoBinding;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import u4.i;
import w6.c0;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x0;
import w7.o;

/* loaded from: classes2.dex */
public final class j implements n0.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f15550c;

    public j(i iVar) {
        this.f15550c = iVar;
    }

    @Override // w6.n0.c
    public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void G(boolean z10, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void L(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void P(n0.b bVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void W(o oVar, i8.j jVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void Y(boolean z10, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void Z(m0 m0Var) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void d(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void e(x0 x0Var, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void g(d0 d0Var) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void g0(PlaybackException playbackException) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void h(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void i(List list) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void l0(boolean z10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void m(boolean z10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void n() {
    }

    @Override // w6.n0.c
    public void p(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f15550c.p(true, true);
    }

    @Override // w6.n0.c
    public /* synthetic */ void s(c0 c0Var, int i10) {
    }

    @Override // w6.n0.c
    public void v(int i10) {
        ItemLayoutVideoBinding itemLayoutVideoBinding;
        if (i10 != 1) {
            if (i10 == 3) {
                i.c cVar = this.f15550c.f15543i;
                ImageView imageView = null;
                if (cVar != null && (itemLayoutVideoBinding = cVar.f15547u) != null) {
                    imageView = itemLayoutVideoBinding.f4728e;
                }
                if (imageView == null) {
                    return;
                }
                imageView.animate().alpha(0.0f).setDuration(200L);
                return;
            } else if (i10 != 4) {
                return;
            }
        }
        this.f15550c.p(true, false);
    }

    @Override // w6.n0.c
    public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void z(boolean z10) {
    }
}
