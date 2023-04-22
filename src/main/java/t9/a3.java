package t9;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a3 implements Iterator<Map.Entry> {

    /* renamed from: c  reason: collision with root package name */
    public int f15171c = -1;

    /* renamed from: f  reason: collision with root package name */
    public boolean f15172f;

    /* renamed from: j  reason: collision with root package name */
    public Iterator<Map.Entry> f15173j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ c3 f15174m;

    public final Iterator<Map.Entry> a() {
        if (this.f15173j == null) {
            this.f15173j = this.f15174m.f15198j.entrySet().iterator();
        }
        return this.f15173j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15171c + 1 >= this.f15174m.f15197f.size()) {
            return !this.f15174m.f15198j.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry next() {
        this.f15172f = true;
        int i10 = this.f15171c + 1;
        this.f15171c = i10;
        return i10 < this.f15174m.f15197f.size() ? this.f15174m.f15197f.get(this.f15171c) : a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f15172f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f15172f = false;
        c3 c3Var = this.f15174m;
        int i10 = c3.f15195u;
        c3Var.h();
        if (this.f15171c >= this.f15174m.f15197f.size()) {
            a().remove();
            return;
        }
        c3 c3Var2 = this.f15174m;
        int i11 = this.f15171c;
        this.f15171c = i11 - 1;
        c3Var2.f(i11);
    }
}
