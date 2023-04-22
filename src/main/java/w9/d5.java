package w9;

import com.google.android.gms.internal.measurement.zzix;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class d5 extends e5 {

    /* renamed from: c  reason: collision with root package name */
    public int f17112c = 0;

    /* renamed from: f  reason: collision with root package name */
    public final int f17113f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ zzix f17114j;

    public d5(zzix zzixVar) {
        this.f17114j = zzixVar;
        this.f17113f = zzixVar.g();
    }

    @Override // w9.e5
    public final byte a() {
        int i10 = this.f17112c;
        if (i10 < this.f17113f) {
            this.f17112c = i10 + 1;
            return this.f17114j.e(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f17112c < this.f17113f;
    }
}
