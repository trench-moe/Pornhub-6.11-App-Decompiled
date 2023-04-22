package j1;

import j1.f0;

/* loaded from: classes2.dex */
public class e0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f0.a f11170c;

    public e0(f0.a aVar) {
        this.f11170c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f0.a aVar = this.f11170c;
        int size = aVar.f11191h.size();
        for (int i10 = 0; i10 < size; i10++) {
            aVar.f11191h.valueAt(i10).a(null, null);
        }
        aVar.f11191h.clear();
    }
}
