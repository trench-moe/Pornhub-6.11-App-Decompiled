package w9;

import android.database.ContentObserver;

/* loaded from: classes2.dex */
public final class g4 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h4 f17164a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(h4 h4Var) {
        super(null);
        this.f17164a = h4Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        h4 h4Var = this.f17164a;
        synchronized (h4Var.d) {
            h4Var.f17178e = null;
            v4.f17336h.incrementAndGet();
        }
        synchronized (h4Var) {
            for (i4 i4Var : h4Var.f17179f) {
                i4Var.zza();
            }
        }
    }
}
