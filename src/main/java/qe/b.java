package qe;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class b implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f14510c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f14511f;

    public b(String str, boolean z10) {
        this.f14510c = str;
        this.f14511f = z10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f14510c);
        thread.setDaemon(this.f14511f);
        return thread;
    }
}
