package t9;

import com.google.android.gms.internal.cast.zzoe;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class z0 extends a1 {

    /* renamed from: c  reason: collision with root package name */
    public int f15373c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f15374f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ zzoe f15375j;

    public z0(zzoe zzoeVar) {
        this.f15375j = zzoeVar;
        this.f15374f = zzoeVar.g();
    }

    @Override // t9.a1
    public final byte a() {
        int i10 = this.f15373c;
        if (i10 < this.f15374f) {
            this.f15373c = i10 + 1;
            return this.f15375j.e(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15373c < this.f15374f;
    }
}
