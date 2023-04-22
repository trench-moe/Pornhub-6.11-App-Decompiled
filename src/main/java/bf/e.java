package bf;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements y {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f3666c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f3667f;

    public e(c cVar, y yVar) {
        this.f3666c = cVar;
        this.f3667f = yVar;
    }

    @Override // bf.y
    public long O(f sink, long j10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        c cVar = this.f3666c;
        cVar.h();
        try {
            long O = this.f3667f.O(sink, j10);
            if (cVar.i()) {
                throw cVar.j(null);
            }
            return O;
        } catch (IOException e10) {
            if (cVar.i()) {
                throw cVar.j(e10);
            }
            throw e10;
        } finally {
            cVar.i();
        }
    }

    @Override // bf.y, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c cVar = this.f3666c;
        cVar.h();
        try {
            this.f3667f.close();
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

    @Override // bf.y
    public z g() {
        return this.f3666c;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("AsyncTimeout.source(");
        m10.append(this.f3667f);
        m10.append(')');
        return m10.toString();
    }
}
