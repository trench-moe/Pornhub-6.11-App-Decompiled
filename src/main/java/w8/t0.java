package w8;

import android.util.LruCache;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t0 extends LruCache<Integer, u8.m> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f17045a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(d dVar, int i10) {
        super(i10);
        this.f17045a = dVar;
    }

    @Override // android.util.LruCache
    public final void entryRemoved(boolean z10, Integer num, u8.m mVar, u8.m mVar2) {
        Integer num2 = num;
        if (z10) {
            Objects.requireNonNull(this.f17045a.f16968g, "null reference");
            this.f17045a.f16968g.add(num2);
        }
    }
}
