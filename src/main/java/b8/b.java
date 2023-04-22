package b8;

import java.util.Collections;
import java.util.List;
import y7.d;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3619c;

    /* renamed from: f  reason: collision with root package name */
    public final List f3620f;

    public b(List list, int i10) {
        this.f3619c = i10;
        if (i10 != 1) {
            this.f3620f = list;
        } else {
            this.f3620f = Collections.unmodifiableList(list);
        }
    }

    @Override // y7.d
    public int b(long j10) {
        int i10 = -1;
        switch (this.f3619c) {
            case 0:
                return -1;
            default:
                if (j10 < 0) {
                    i10 = 0;
                }
                return i10;
        }
    }

    @Override // y7.d
    public long c(int i10) {
        switch (this.f3619c) {
            case 0:
                return 0L;
            default:
                k8.a.c(i10 == 0);
                return 0L;
        }
    }

    @Override // y7.d
    public List d(long j10) {
        switch (this.f3619c) {
            case 0:
                return this.f3620f;
            default:
                return j10 >= 0 ? this.f3620f : Collections.emptyList();
        }
    }

    @Override // y7.d
    public int e() {
        return 1;
    }
}
