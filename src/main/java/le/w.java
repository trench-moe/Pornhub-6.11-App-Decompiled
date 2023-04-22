package le;

import java.util.Objects;
import kotlin.collections.ArraysKt;

/* loaded from: classes3.dex */
public abstract class w extends kotlinx.coroutines.b {

    /* renamed from: f  reason: collision with root package name */
    public long f12839f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f12840j;

    /* renamed from: m  reason: collision with root package name */
    public ne.a<s<?>> f12841m;

    public final boolean E() {
        return this.f12839f >= t(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    public final boolean F() {
        ne.a<s<?>> aVar = this.f12841m;
        if (aVar == null) {
            return false;
        }
        int i10 = aVar.f13435b;
        s sVar = null;
        if (i10 != aVar.f13436c) {
            ?? r32 = aVar.f13434a;
            ?? r62 = r32[i10];
            r32[i10] = 0;
            aVar.f13435b = (i10 + 1) & (r32.length - 1);
            Objects.requireNonNull(r62, "null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
            sVar = r62;
        }
        s sVar2 = sVar;
        if (sVar2 == null) {
            return false;
        }
        sVar2.run();
        return true;
    }

    public final void s(boolean z10) {
        long t2 = this.f12839f - t(z10);
        this.f12839f = t2;
        if (t2 <= 0 && this.f12840j) {
            shutdown();
        }
    }

    public void shutdown() {
    }

    public final long t(boolean z10) {
        return z10 ? 4294967296L : 1L;
    }

    public final void v(s<?> sVar) {
        ne.a<s<?>> aVar = this.f12841m;
        if (aVar == null) {
            aVar = new ne.a<>();
            this.f12841m = aVar;
        }
        Object[] objArr = aVar.f13434a;
        int i10 = aVar.f13436c;
        objArr[i10] = sVar;
        int length = (objArr.length - 1) & (i10 + 1);
        aVar.f13436c = length;
        int i11 = aVar.f13435b;
        if (length == i11) {
            int length2 = objArr.length;
            Object[] objArr2 = new Object[length2 << 1];
            ArraysKt.copyInto$default(objArr, objArr2, 0, i11, 0, 10, (Object) null);
            Object[] objArr3 = aVar.f13434a;
            int length3 = objArr3.length;
            int i12 = aVar.f13435b;
            ArraysKt.copyInto$default(objArr3, objArr2, length3 - i12, 0, i12, 4, (Object) null);
            aVar.f13434a = objArr2;
            aVar.f13435b = 0;
            aVar.f13436c = length2;
        }
    }

    public final void w(boolean z10) {
        this.f12839f = t(z10) + this.f12839f;
        if (z10) {
            return;
        }
        this.f12840j = true;
    }
}
