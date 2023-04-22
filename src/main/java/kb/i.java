package kb;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class i extends x<Object> {

    /* renamed from: c  reason: collision with root package name */
    public boolean f12051c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f12052f;

    public i(Object obj) {
        this.f12052f = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return !this.f12051c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f12051c) {
            throw new NoSuchElementException();
        }
        this.f12051c = true;
        return this.f12052f;
    }
}
