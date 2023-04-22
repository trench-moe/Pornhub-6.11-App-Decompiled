package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.h0;
import androidx.navigation.m;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class o extends m implements Iterable<m> {
    public String A;
    public final p.h<m> y;

    /* renamed from: z  reason: collision with root package name */
    public int f2703z;

    /* loaded from: classes.dex */
    public class a implements Iterator<m> {

        /* renamed from: c  reason: collision with root package name */
        public int f2704c = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2705f = false;

        public a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2704c + 1 < o.this.y.j();
        }

        @Override // java.util.Iterator
        public m next() {
            if (hasNext()) {
                this.f2705f = true;
                p.h<m> hVar = o.this.y;
                int i10 = this.f2704c + 1;
                this.f2704c = i10;
                return hVar.k(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2705f) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            o.this.y.k(this.f2704c).f2693f = null;
            p.h<m> hVar = o.this.y;
            int i10 = this.f2704c;
            Object[] objArr = hVar.f13771j;
            Object obj = objArr[i10];
            Object obj2 = p.h.n;
            if (obj != obj2) {
                objArr[i10] = obj2;
                hVar.f13769c = true;
            }
            this.f2704c = i10 - 1;
            this.f2705f = false;
        }
    }

    public o(v<? extends o> vVar) {
        super(vVar);
        this.y = new p.h<>();
    }

    @Override // java.lang.Iterable
    public final Iterator<m> iterator() {
        return new a();
    }

    @Override // androidx.navigation.m
    public m.a j(h0 h0Var) {
        m.a j10 = super.j(h0Var);
        a aVar = new a();
        while (aVar.hasNext()) {
            m.a j11 = ((m) aVar.next()).j(h0Var);
            if (j11 != null && (j10 == null || j11.compareTo(j10) > 0)) {
                j10 = j11;
            }
        }
        return j10;
    }

    @Override // androidx.navigation.m
    public void l(Context context, AttributeSet attributeSet) {
        super.l(context, attributeSet);
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, f1.a.f9358u);
        int resourceId = obtainAttributes.getResourceId(0, 0);
        if (resourceId != this.f2694j) {
            this.f2703z = resourceId;
            this.A = null;
            this.A = m.h(context, resourceId);
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Start destination " + resourceId + " cannot use the same id as the graph " + this);
    }

    public final void m(m mVar) {
        int i10 = mVar.f2694j;
        if (i10 == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (i10 == this.f2694j) {
            throw new IllegalArgumentException("Destination " + mVar + " cannot have the same id as graph " + this);
        }
        m d = this.y.d(i10);
        if (d == mVar) {
            return;
        }
        if (mVar.f2693f != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (d != null) {
            d.f2693f = null;
        }
        mVar.f2693f = this;
        this.y.i(mVar.f2694j, mVar);
    }

    public final m o(int i10) {
        return p(i10, true);
    }

    public final m p(int i10, boolean z10) {
        o oVar;
        m mVar = null;
        m f10 = this.y.f(i10, null);
        if (f10 != null) {
            return f10;
        }
        if (z10 && (oVar = this.f2693f) != null) {
            mVar = oVar.o(i10);
        }
        return mVar;
    }

    @Override // androidx.navigation.m
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" startDestination=");
        m o10 = o(this.f2703z);
        if (o10 == null) {
            String str = this.A;
            if (str == null) {
                sb2.append("0x");
                sb2.append(Integer.toHexString(this.f2703z));
            } else {
                sb2.append(str);
            }
        } else {
            sb2.append("{");
            sb2.append(o10.toString());
            sb2.append("}");
        }
        return sb2.toString();
    }
}
