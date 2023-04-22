package q7;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import jd.e;
import k8.t;
import o7.d;

/* loaded from: classes2.dex */
public final class b extends e {
    @Override // jd.e
    public o7.a g(d dVar, ByteBuffer byteBuffer) {
        t tVar = new t(byteBuffer.array(), byteBuffer.limit());
        String n = tVar.n();
        Objects.requireNonNull(n);
        String n10 = tVar.n();
        Objects.requireNonNull(n10);
        return new o7.a(new a(n, n10, tVar.m(), tVar.m(), Arrays.copyOfRange(tVar.f12009a, tVar.f12010b, tVar.f12011c)));
    }
}
