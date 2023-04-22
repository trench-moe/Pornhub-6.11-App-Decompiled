package kb;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g extends x<Object> {

    /* renamed from: c  reason: collision with root package name */
    public Iterator<? extends ImmutableCollection<Object>> f12049c;

    /* renamed from: f  reason: collision with root package name */
    public Iterator<Object> f12050f = j.n;

    public g(ImmutableMultimap immutableMultimap) {
        this.f12049c = immutableMultimap.f7953m.values().iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f12050f.hasNext() && !this.f12049c.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f12050f.hasNext()) {
            this.f12050f = this.f12049c.next().iterator();
        }
        return this.f12050f.next();
    }
}
