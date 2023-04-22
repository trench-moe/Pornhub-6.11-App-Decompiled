package w9;

/* loaded from: classes2.dex */
public final class b7 implements o6 {

    /* renamed from: a  reason: collision with root package name */
    public final s6 f17083a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17084b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f17085c;
    public final int d;

    public b7(s6 s6Var, String str, Object[] objArr) {
        this.f17083a = s6Var;
        this.f17084b = str;
        this.f17085c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i10 = charAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char charAt2 = str.charAt(i12);
            if (charAt2 < 55296) {
                this.d = i10 | (charAt2 << i11);
                return;
            }
            i10 |= (charAt2 & 8191) << i11;
            i11 += 13;
            i12 = i13;
        }
    }

    @Override // w9.o6
    public final int a() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    @Override // w9.o6
    public final s6 zza() {
        return this.f17083a;
    }

    @Override // w9.o6
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }
}
