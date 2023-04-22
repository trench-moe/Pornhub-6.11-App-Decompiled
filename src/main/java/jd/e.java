package jd;

import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class e implements o7.b, qb.c {
    @Override // qb.c
    public Object a(Class cls) {
        mc.b b10 = b(cls);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    @Override // o7.b
    public o7.a c(o7.d dVar) {
        ByteBuffer byteBuffer = dVar.f6108j;
        Objects.requireNonNull(byteBuffer);
        k8.a.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dVar.i()) {
            return null;
        }
        return g(dVar, byteBuffer);
    }

    @Override // qb.c
    public Set e(Class cls) {
        return (Set) d(cls).get();
    }

    public abstract o7.a g(o7.d dVar, ByteBuffer byteBuffer);

    public abstract Object h();
}
