package b0;

import android.app.Activity;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f3385c;

    public b(Activity activity) {
        this.f3385c = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f3385c.isFinishing() && !d.b(this.f3385c)) {
            this.f3385c.recreate();
        }
    }
}
