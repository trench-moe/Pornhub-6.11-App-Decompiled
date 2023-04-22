package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class f implements u {

    /* renamed from: a  reason: collision with root package name */
    public final u f2973a;

    /* renamed from: b  reason: collision with root package name */
    public int f2974b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f2975c = -1;
    public int d = -1;

    /* renamed from: e  reason: collision with root package name */
    public Object f2976e = null;

    public f(u uVar) {
        this.f2973a = uVar;
    }

    @Override // androidx.recyclerview.widget.u
    public void a(int i10, int i11) {
        e();
        this.f2973a.a(i10, i11);
    }

    @Override // androidx.recyclerview.widget.u
    public void b(int i10, int i11) {
        int i12;
        if (this.f2974b == 1 && i10 >= (i12 = this.f2975c)) {
            int i13 = this.d;
            if (i10 <= i12 + i13) {
                this.d = i13 + i11;
                this.f2975c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f2975c = i10;
        this.d = i11;
        this.f2974b = 1;
    }

    @Override // androidx.recyclerview.widget.u
    public void c(int i10, int i11) {
        int i12;
        if (this.f2974b == 2 && (i12 = this.f2975c) >= i10 && i12 <= i10 + i11) {
            this.d += i11;
            this.f2975c = i10;
            return;
        }
        e();
        this.f2975c = i10;
        this.d = i11;
        this.f2974b = 2;
    }

    @Override // androidx.recyclerview.widget.u
    public void d(int i10, int i11, Object obj) {
        int i12;
        if (this.f2974b == 3) {
            int i13 = this.f2975c;
            int i14 = this.d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f2976e == obj) {
                this.f2975c = Math.min(i10, i13);
                this.d = Math.max(i14 + i13, i12) - this.f2975c;
                return;
            }
        }
        e();
        this.f2975c = i10;
        this.d = i11;
        this.f2976e = obj;
        this.f2974b = 3;
    }

    public void e() {
        int i10 = this.f2974b;
        if (i10 == 0) {
            return;
        }
        if (i10 == 1) {
            this.f2973a.b(this.f2975c, this.d);
        } else if (i10 == 2) {
            this.f2973a.c(this.f2975c, this.d);
        } else if (i10 == 3) {
            this.f2973a.d(this.f2975c, this.d, this.f2976e);
        }
        this.f2976e = null;
        this.f2974b = 0;
    }
}
