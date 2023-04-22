package bf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d implements w {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3664c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ w f3665f;

    public d(c cVar, w wVar) {
        this.f3664c = cVar;
        this.f3665f = wVar;
    }

    @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f3664c;
        cVar.h();
        try {
            this.f3665f.close();
            Unit unit = Unit.INSTANCE;
            if (cVar.i()) {
                throw cVar.j(null);
            }
        } catch (IOException e10) {
            if (!cVar.i()) {
                throw e10;
            }
            throw cVar.j(e10);
        } finally {
            cVar.i();
        }
    }

    @Override // bf.w, java.io.Flushable
    public void flush() {
        c cVar = this.f3664c;
        cVar.h();
        try {
            this.f3665f.flush();
            Unit unit = Unit.INSTANCE;
            if (cVar.i()) {
                throw cVar.j(null);
            }
        } catch (IOException e10) {
            if (!cVar.i()) {
                throw e10;
            }
            throw cVar.j(e10);
        } finally {
            cVar.i();
        }
    }

    @Override // bf.w
    public z g() {
        return this.f3664c;
    }

    @Override // bf.w
    public void l0(f source, long j10) {
        Intrinsics.checkNotNullParameter(source, "source");
        b.b(source.f3669f, 0L, j10);
        while (true) {
            long j11 = 0;
            if (j10 <= 0) {
                return;
            }
            u uVar = source.f3668c;
            Intrinsics.checkNotNull(uVar);
            while (true) {
                if (j11 >= 65536) {
                    break;
                }
                j11 += uVar.f3704c - uVar.f3703b;
                if (j11 >= j10) {
                    j11 = j10;
                    break;
                } else {
                    uVar = uVar.f3706f;
                    Intrinsics.checkNotNull(uVar);
                }
            }
            c cVar = this.f3664c;
            cVar.h();
            try {
                this.f3665f.l0(source, j11);
                Unit unit = Unit.INSTANCE;
                if (cVar.i()) {
                    throw cVar.j(null);
                }
                j10 -= j11;
            } catch (IOException e10) {
                if (!cVar.i()) {
                    throw e10;
                }
                throw cVar.j(e10);
            } finally {
                cVar.i();
            }
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AsyncTimeout.sink(");
        m10.append(this.f3665f);
        m10.append(')');
        return m10.toString();
    }
}
