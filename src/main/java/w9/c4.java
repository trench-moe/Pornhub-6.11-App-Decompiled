package w9;

import android.database.ContentObserver;

/* loaded from: classes2.dex */
public final class c4 extends ContentObserver {
    public c4() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        d4.d.set(true);
    }
}
