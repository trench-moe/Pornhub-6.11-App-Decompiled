package w9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public final List f17332a = new ArrayList();

    public abstract o a(String str, h2.h hVar, List list);

    public final o b(String str) {
        if (this.f17332a.contains(a0.b.r0(str))) {
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? "Command not implemented: ".concat(valueOf) : new String("Command not implemented: "));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
