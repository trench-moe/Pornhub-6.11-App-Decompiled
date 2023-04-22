package i8;

import android.util.Log;
import com.google.common.collect.ImmutableList;
import i8.f;
import java.util.List;
import w7.n;

/* loaded from: classes2.dex */
public class a extends i8.b {

    /* renamed from: f  reason: collision with root package name */
    public final j8.b f10578f;

    /* renamed from: g  reason: collision with root package name */
    public final k8.b f10579g;

    /* renamed from: i8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0153a {

        /* renamed from: a  reason: collision with root package name */
        public final long f10580a;

        /* renamed from: b  reason: collision with root package name */
        public final long f10581b;

        public C0153a(long j10, long j11) {
            this.f10580a = j10;
            this.f10581b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0153a) {
                C0153a c0153a = (C0153a) obj;
                return this.f10580a == c0153a.f10580a && this.f10581b == c0153a.f10581b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f10580a) * 31) + ((int) this.f10581b);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements f.b {

        /* renamed from: a  reason: collision with root package name */
        public final k8.b f10582a = k8.b.f11933a;
    }

    public a(n nVar, int[] iArr, int i10, j8.b bVar, long j10, long j11, long j12, float f10, float f11, List<C0153a> list, k8.b bVar2) {
        super(nVar, iArr, i10);
        if (j12 < j10) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
        }
        this.f10578f = bVar;
        ImmutableList.r(list);
        this.f10579g = bVar2;
    }

    public static void e(List<ImmutableList.a<C0153a>> list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ImmutableList.a<C0153a> aVar = list.get(i10);
            if (aVar != null) {
                aVar.b(new C0153a(j10, jArr[i10]));
            }
        }
    }

    @Override // i8.b, i8.f
    public void h() {
    }

    @Override // i8.f
    public int i() {
        return 0;
    }

    @Override // i8.b, i8.f
    public void k() {
    }

    @Override // i8.b, i8.f
    public void m(float f10) {
    }
}
