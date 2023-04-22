package bf;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: b  reason: collision with root package name */
    public static final int f3709b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference<u>[] f3710c;
    public static final v d = new v();

    /* renamed from: a  reason: collision with root package name */
    public static final u f3708a = new u(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f3709b = highestOneBit;
        AtomicReference<u>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i10 = 0; i10 < highestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference<>();
        }
        f3710c = atomicReferenceArr;
    }

    @JvmStatic
    public static final void b(u segment) {
        AtomicReference<u> a10;
        u uVar;
        Intrinsics.checkNotNullParameter(segment, "segment");
        if (!(segment.f3706f == null && segment.f3707g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (segment.d || (uVar = (a10 = d.a()).get()) == f3708a) {
            return;
        }
        int i10 = uVar != null ? uVar.f3704c : 0;
        if (i10 >= 65536) {
            return;
        }
        segment.f3706f = uVar;
        segment.f3703b = 0;
        segment.f3704c = i10 + ConstantsKt.DEFAULT_BUFFER_SIZE;
        if (a10.compareAndSet(uVar, segment)) {
            return;
        }
        segment.f3706f = null;
    }

    @JvmStatic
    public static final u c() {
        AtomicReference<u> a10 = d.a();
        u uVar = f3708a;
        u andSet = a10.getAndSet(uVar);
        if (andSet == uVar) {
            return new u();
        }
        if (andSet == null) {
            a10.set(null);
            return new u();
        }
        a10.set(andSet.f3706f);
        andSet.f3706f = null;
        andSet.f3704c = 0;
        return andSet;
    }

    public final AtomicReference<u> a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        return f3710c[(int) (currentThread.getId() & (f3709b - 1))];
    }
}
