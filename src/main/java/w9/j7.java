package w9;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class j7 implements Iterator {

    /* renamed from: c  reason: collision with root package name */
    public int f17205c = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f17206f;

    /* renamed from: j  reason: collision with root package name */
    public Iterator f17207j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ l7 f17208m;

    public final Iterator a() {
        if (this.f17207j == null) {
            this.f17207j = this.f17208m.f17227j.entrySet().iterator();
        }
        return this.f17207j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10 = true;
        if (this.f17205c + 1 >= this.f17208m.f17226f.size()) {
            if (!this.f17208m.f17227j.isEmpty()) {
                if (a().hasNext()) {
                    return z10;
                }
                return false;
            }
            z10 = false;
        }
        return z10;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f17206f = true;
        int i10 = this.f17205c + 1;
        this.f17205c = i10;
        return i10 < this.f17208m.f17226f.size() ? (Map.Entry) this.f17208m.f17226f.get(this.f17205c) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f17206f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f17206f = false;
        l7 l7Var = this.f17208m;
        int i10 = l7.f17224u;
        l7Var.h();
        if (this.f17205c >= this.f17208m.f17226f.size()) {
            a().remove();
            return;
        }
        l7 l7Var2 = this.f17208m;
        int i11 = this.f17205c;
        this.f17205c = i11 - 1;
        l7Var2.f(i11);
    }
}
