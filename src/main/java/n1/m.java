package n1;

import androidx.recyclerview.widget.u;

/* loaded from: classes2.dex */
public class m implements u {

    /* renamed from: a  reason: collision with root package name */
    public final int f13250a;

    /* renamed from: b  reason: collision with root package name */
    public final u f13251b;

    public m(int i10, u uVar) {
        this.f13250a = i10;
        this.f13251b = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        u uVar = this.f13251b;
        int i12 = this.f13250a;
        uVar.a(i10 + i12, i11 + i12);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        this.f13251b.b(i10 + this.f13250a, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11) {
        this.f13251b.c(i10 + this.f13250a, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11, Object obj) {
        this.f13251b.d(i10 + this.f13250a, i11, obj);
    }
}
