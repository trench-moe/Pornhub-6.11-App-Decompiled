package c7;

import java.util.Arrays;

/* loaded from: classes.dex */
public interface w {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f3836a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f3837b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3838c;
        public final int d;

        public a(int i10, byte[] bArr, int i11, int i12) {
            this.f3836a = i10;
            this.f3837b = bArr;
            this.f3838c = i11;
            this.d = i12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                return this.f3836a == aVar.f3836a && this.f3838c == aVar.f3838c && this.d == aVar.d && Arrays.equals(this.f3837b, aVar.f3837b);
            }
            return false;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f3837b) + (this.f3836a * 31)) * 31) + this.f3838c) * 31) + this.d;
        }
    }

    void a(k8.t tVar, int i10);

    void b(long j10, int i10, int i11, int i12, a aVar);

    void c(k8.t tVar, int i10, int i11);

    void d(w6.y yVar);

    int e(j8.d dVar, int i10, boolean z10);
}
