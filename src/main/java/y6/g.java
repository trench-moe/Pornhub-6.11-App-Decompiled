package y6;

import com.google.android.exoplayer2.audio.a;
import java.util.Objects;
import k8.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18447c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.C0078a f18448f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ z6.d f18449j;

    public /* synthetic */ g(a.C0078a c0078a, z6.d dVar, int i10) {
        this.f18447c = i10;
        this.f18448f = c0078a;
        this.f18449j = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18447c) {
            case 0:
                a.C0078a c0078a = this.f18448f;
                z6.d dVar = this.f18449j;
                Objects.requireNonNull(c0078a);
                synchronized (dVar) {
                }
                com.google.android.exoplayer2.audio.a aVar = c0078a.f5990b;
                int i10 = c0.f11939a;
                aVar.E(dVar);
                return;
            default:
                a.C0078a c0078a2 = this.f18448f;
                z6.d dVar2 = this.f18449j;
                com.google.android.exoplayer2.audio.a aVar2 = c0078a2.f5990b;
                int i11 = c0.f11939a;
                aVar2.e0(dVar2);
                return;
        }
    }
}
