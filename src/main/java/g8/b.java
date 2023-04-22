package g8;

import java.util.Collections;
import java.util.List;
import y7.d;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final b f9880f = new b();

    /* renamed from: c  reason: collision with root package name */
    public final List<y7.a> f9881c;

    public b() {
        this.f9881c = Collections.emptyList();
    }

    public b(y7.a aVar) {
        this.f9881c = Collections.singletonList(aVar);
    }

    @Override // y7.d
    public int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // y7.d
    public long c(int i10) {
        k8.a.c(i10 == 0);
        return 0L;
    }

    @Override // y7.d
    public List<y7.a> d(long j10) {
        return j10 >= 0 ? this.f9881c : Collections.emptyList();
    }

    @Override // y7.d
    public int e() {
        return 1;
    }
}
