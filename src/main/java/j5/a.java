package j5;

import com.bumptech.glide.load.engine.a;
import java.util.Objects;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.a f11384c;

    public a(com.bumptech.glide.load.engine.a aVar) {
        this.f11384c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.load.engine.a aVar = this.f11384c;
        Objects.requireNonNull(aVar);
        while (true) {
            try {
                aVar.b((a.b) aVar.f5740c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
