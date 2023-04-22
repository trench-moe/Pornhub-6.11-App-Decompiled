package androidx.databinding;

import android.view.Choreographer;

/* loaded from: classes.dex */
public class e implements Choreographer.FrameCallback {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewDataBinding f1908c;

    public e(ViewDataBinding viewDataBinding) {
        this.f1908c = viewDataBinding;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        this.f1908c.f1899a.run();
    }
}
