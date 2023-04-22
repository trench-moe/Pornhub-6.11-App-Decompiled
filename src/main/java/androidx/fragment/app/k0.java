package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class k0 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2177c;

    public k0(ArrayList arrayList) {
        this.f2177c = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        p0.o(this.f2177c, 4);
    }
}
