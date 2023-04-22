package le;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.JvmField;

/* loaded from: classes3.dex */
public class m {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12822b = AtomicIntegerFieldUpdater.newUpdater(m.class, "_handled");
    private volatile /* synthetic */ int _handled;
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f12823a;

    public m(Throwable th, boolean z10) {
        this.f12823a = th;
        this._handled = z10 ? 1 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public m(Throwable th, boolean z10, int i10) {
        ?? r22 = (i10 & 2) != 0 ? 0 : z10;
        this.f12823a = th;
        this._handled = r22;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public String toString() {
        return getClass().getSimpleName() + '[' + this.f12823a + ']';
    }
}
