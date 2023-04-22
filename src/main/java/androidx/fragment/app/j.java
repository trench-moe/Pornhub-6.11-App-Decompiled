package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class j implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2172c;

    public j(c cVar, ArrayList arrayList) {
        this.f2172c = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        p0.o(this.f2172c, 4);
    }
}
