package androidx.fragment.app;

import androidx.fragment.app.c;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.d f2176c;

    public k(c cVar, c.d dVar) {
        this.f2176c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2176c.a();
    }
}
