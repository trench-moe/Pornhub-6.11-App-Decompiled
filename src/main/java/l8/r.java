package l8;

import android.os.Handler;
import java.util.Objects;
import w6.y;

/* loaded from: classes2.dex */
public interface r {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Handler f12740a;

        /* renamed from: b  reason: collision with root package name */
        public final r f12741b;

        public a(Handler handler, r rVar) {
            if (rVar != null) {
                Objects.requireNonNull(handler);
            } else {
                handler = null;
            }
            this.f12740a = handler;
            this.f12741b = rVar;
        }
    }

    void D(int i10, long j10);

    void H(z6.d dVar);

    void K(Object obj, long j10);

    void U(z6.d dVar);

    void X(Exception exc);

    void b(s sVar);

    void c(String str);

    void j0(long j10, int i10);

    void k(y yVar, z6.e eVar);

    void l(String str, long j10, long j11);

    @Deprecated
    void q(y yVar);
}
