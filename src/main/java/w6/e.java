package w6;

import java.util.Collections;
import w6.x0;

/* loaded from: classes2.dex */
public abstract class e implements n0 {

    /* renamed from: a  reason: collision with root package name */
    public final x0.c f16558a = new x0.c();

    @Override // w6.n0
    public final void A() {
        int Y;
        if (!M().q() && !a()) {
            boolean a02 = a0();
            if (c0() && !d0()) {
                if (!a02 || (Y = Y()) == -1) {
                    return;
                }
                d(Y, -9223372036854775807L);
            } else if (!a02 || getCurrentPosition() > p()) {
                n(0L);
            } else {
                int Y2 = Y();
                if (Y2 != -1) {
                    d(Y2, -9223372036854775807L);
                }
            }
        }
    }

    @Override // w6.n0
    public final boolean H(int i10) {
        return i().f16681a.f11956a.get(i10);
    }

    @Override // w6.n0
    public final void Q() {
        if (!M().q()) {
            if (a()) {
                return;
            }
            if (Z()) {
                int X = X();
                if (X != -1) {
                    d(X, -9223372036854775807L);
                }
            } else if (c0() && b0()) {
                d(z(), -9223372036854775807L);
            }
        }
    }

    @Override // w6.n0
    public final void R() {
        e0(D());
    }

    @Override // w6.n0
    public final void U() {
        e0(-W());
    }

    public final int X() {
        x0 M = M();
        if (M.q()) {
            return -1;
        }
        int z10 = z();
        int s10 = s();
        if (s10 == 1) {
            s10 = 0;
        }
        return M.e(z10, s10, O());
    }

    public final int Y() {
        x0 M = M();
        if (M.q()) {
            return -1;
        }
        int z10 = z();
        int s10 = s();
        if (s10 == 1) {
            s10 = 0;
        }
        return M.l(z10, s10, O());
    }

    public final boolean Z() {
        return X() != -1;
    }

    public final boolean a0() {
        return Y() != -1;
    }

    public final boolean b0() {
        x0 M = M();
        return !M.q() && M.n(z(), this.f16558a).f16854i;
    }

    public final boolean c0() {
        x0 M = M();
        return !M.q() && M.n(z(), this.f16558a).c();
    }

    public final boolean d0() {
        x0 M = M();
        return !M.q() && M.n(z(), this.f16558a).f16853h;
    }

    public final void e0(long j10) {
        long currentPosition = getCurrentPosition() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        n(Math.max(currentPosition, 0L));
    }

    @Override // w6.n0
    public final void h() {
        C(true);
    }

    @Override // w6.n0
    public final boolean isPlaying() {
        return g() == 3 && k() && K() == 0;
    }

    @Override // w6.n0
    public final void n(long j10) {
        d(z(), j10);
    }

    @Override // w6.n0
    public final void pause() {
        C(false);
    }

    @Override // w6.n0
    public final void y(c0 c0Var) {
        v(Collections.singletonList(c0Var), true);
    }
}
