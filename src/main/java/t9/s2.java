package t9;

/* loaded from: classes2.dex */
public final class s2 implements h2 {

    /* renamed from: a  reason: collision with root package name */
    public final j2 f15338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15339b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f15340c;
    public final int d;

    public s2(j2 j2Var, String str, Object[] objArr) {
        this.f15338a = j2Var;
        this.f15339b = str;
        this.f15340c = objArr;
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

    @Override // t9.h2
    public final int a() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    @Override // t9.h2
    public final j2 zza() {
        return this.f15338a;
    }

    @Override // t9.h2
    public final boolean zzb() {
        return (this.d & 2) == 2;
    }
}
