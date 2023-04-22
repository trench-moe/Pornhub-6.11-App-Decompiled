package kb;

import kb.v;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class h {
    @NullableDecl
    public static <T> T a(Iterable<? extends T> iterable, @NullableDecl T t2) {
        u uVar = new u((v.a) iterable);
        if (uVar.hasNext()) {
            t2 = (T) uVar.next();
        }
        return t2;
    }
}
