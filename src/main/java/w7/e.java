package w7;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f16912a;

    /* renamed from: b  reason: collision with root package name */
    public final int f16913b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16914c;
    public final long d;

    /* renamed from: e  reason: collision with root package name */
    public final int f16915e;

    public e(Object obj) {
        this.f16912a = obj;
        this.f16913b = -1;
        this.f16914c = -1;
        this.d = -1L;
        this.f16915e = -1;
    }

    public e(Object obj, int i10, int i11, long j10) {
        this.f16912a = obj;
        this.f16913b = i10;
        this.f16914c = i11;
        this.d = j10;
        this.f16915e = -1;
    }

    public e(Object obj, int i10, int i11, long j10, int i12) {
        this.f16912a = obj;
        this.f16913b = i10;
        this.f16914c = i11;
        this.d = j10;
        this.f16915e = i12;
    }

    public e(Object obj, long j10, int i10) {
        this.f16912a = obj;
        this.f16913b = -1;
        this.f16914c = -1;
        this.d = j10;
        this.f16915e = i10;
    }

    public e(e eVar) {
        this.f16912a = eVar.f16912a;
        this.f16913b = eVar.f16913b;
        this.f16914c = eVar.f16914c;
        this.d = eVar.d;
        this.f16915e = eVar.f16915e;
    }

    public boolean a() {
        return this.f16913b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f16912a.equals(eVar.f16912a) && this.f16913b == eVar.f16913b && this.f16914c == eVar.f16914c && this.d == eVar.d && this.f16915e == eVar.f16915e;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f16912a.hashCode() + 527) * 31) + this.f16913b) * 31) + this.f16914c) * 31) + ((int) this.d)) * 31) + this.f16915e;
    }
}
