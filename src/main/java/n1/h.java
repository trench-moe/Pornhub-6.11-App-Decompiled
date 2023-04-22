package n1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class h<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final h f13221c = new h(Collections.emptyList(), 0);
    public static final h d = new h(Collections.emptyList(), 0);

    /* renamed from: a  reason: collision with root package name */
    public final List<T> f13222a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13223b;

    /* loaded from: classes2.dex */
    public static abstract class a<T> {
        public abstract void a(int i10, h<T> hVar);
    }

    public h(List<T> list, int i10) {
        this.f13222a = list;
        this.f13223b = i10;
    }

    public h(List<T> list, int i10, int i11, int i12) {
        this.f13222a = list;
        this.f13223b = i12;
    }

    public String toString() {
        StringBuilder n = a1.a.n("Result ", 0, ", ");
        n.append(this.f13222a);
        n.append(", ");
        n.append(0);
        n.append(", offset ");
        n.append(this.f13223b);
        return n.toString();
    }
}
