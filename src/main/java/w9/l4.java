package w9;

import android.database.ContentObserver;

/* loaded from: classes2.dex */
public final class l4 extends ContentObserver {
    public l4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        v4.f17336h.incrementAndGet();
    }
}
