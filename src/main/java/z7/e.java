package z7;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e implements y7.d {

    /* renamed from: c  reason: collision with root package name */
    public final List<y7.a> f21914c;

    public e(List<y7.a> list) {
        this.f21914c = list;
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
        return j10 >= 0 ? this.f21914c : Collections.emptyList();
    }

    @Override // y7.d
    public int e() {
        return 1;
    }
}
