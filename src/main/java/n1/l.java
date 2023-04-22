package n1;

import androidx.recyclerview.widget.n;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class l extends n.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f13245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13246b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f13247c;
    public final /* synthetic */ n.e d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f13248e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f13249f;

    public l(k kVar, int i10, k kVar2, n.e eVar, int i11, int i12) {
        this.f13245a = kVar;
        this.f13246b = i10;
        this.f13247c = kVar2;
        this.d = eVar;
        this.f13248e = i11;
        this.f13249f = i12;
    }

    @Override // androidx.recyclerview.widget.n.b
    public boolean a(int i10, int i11) {
        Object obj = this.f13245a.get(i10 + this.f13246b);
        k kVar = this.f13247c;
        Object obj2 = kVar.get(i11 + kVar.f13238c);
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj2 != null) {
            return this.d.a(obj, obj2);
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.n.b
    public boolean b(int i10, int i11) {
        Object obj = this.f13245a.get(i10 + this.f13246b);
        k kVar = this.f13247c;
        Object obj2 = kVar.get(i11 + kVar.f13238c);
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return this.d.b(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.n.b
    public Object c(int i10, int i11) {
        Object obj = this.f13245a.get(i10 + this.f13246b);
        k kVar = this.f13247c;
        Object obj2 = kVar.get(i11 + kVar.f13238c);
        if (obj != null) {
            if (obj2 == null) {
                return null;
            }
            Objects.requireNonNull(this.d);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n.b
    public int d() {
        return this.f13249f;
    }

    @Override // androidx.recyclerview.widget.n.b
    public int e() {
        return this.f13248e;
    }
}
