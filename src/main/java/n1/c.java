package n1;

import java.util.concurrent.Executor;
import n1.h;

/* loaded from: classes.dex */
public abstract class c<Key, Value> extends e<Key, Value> {
    @Override // n1.e
    public boolean c() {
        return true;
    }

    public abstract void f(int i10, Value value, int i11, Executor executor, h.a<Value> aVar);

    public abstract void g(int i10, Value value, int i11, Executor executor, h.a<Value> aVar);

    public abstract void h(Key key, int i10, int i11, boolean z10, Executor executor, h.a<Value> aVar);

    public abstract Key i(int i10, Value value);

    public boolean j() {
        return true;
    }
}
