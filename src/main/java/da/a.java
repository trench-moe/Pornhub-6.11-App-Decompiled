package da;

import android.os.PowerManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import x8.i;

/* loaded from: classes.dex */
public class a {

    /* renamed from: o  reason: collision with root package name */
    public static final long f8869o = TimeUnit.DAYS.toMillis(366);

    /* renamed from: p  reason: collision with root package name */
    public static volatile ScheduledExecutorService f8870p = null;

    /* renamed from: q  reason: collision with root package name */
    public static final Object f8871q = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f8872a;

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f8873b;

    /* renamed from: c  reason: collision with root package name */
    public int f8874c;
    public Future<?> d;

    /* renamed from: e  reason: collision with root package name */
    public long f8875e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<c> f8876f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8877g;

    /* renamed from: h  reason: collision with root package name */
    public int f8878h;

    /* renamed from: i  reason: collision with root package name */
    public y9.a f8879i;

    /* renamed from: j  reason: collision with root package name */
    public l9.b f8880j;

    /* renamed from: k  reason: collision with root package name */
    public final String f8881k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, b> f8882l;

    /* renamed from: m  reason: collision with root package name */
    public AtomicInteger f8883m;
    public final ScheduledExecutorService n;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(android.content.Context r7, int r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.a.<init>(android.content.Context, int, java.lang.String):void");
    }

    public void a(long j10) {
        this.f8883m.incrementAndGet();
        long max = Math.max(Math.min(Long.MAX_VALUE, f8869o), 1L);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f8872a) {
            if (!b()) {
                this.f8879i = y9.a.f18561c;
                this.f8873b.acquire();
                Objects.requireNonNull((r3.c) this.f8880j);
                SystemClock.elapsedRealtime();
            }
            this.f8874c++;
            this.f8878h++;
            if (this.f8877g) {
                TextUtils.isEmpty(null);
            }
            b bVar = this.f8882l.get(null);
            if (bVar == null) {
                bVar = new b(null);
                this.f8882l.put(null, bVar);
            }
            bVar.f8884a++;
            Objects.requireNonNull((r3.c) this.f8880j);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = Long.MAX_VALUE - elapsedRealtime > max ? elapsedRealtime + max : Long.MAX_VALUE;
            if (j11 > this.f8875e) {
                this.f8875e = j11;
                Future<?> future = this.d;
                if (future != null) {
                    future.cancel(false);
                }
                this.d = this.n.schedule(new i(this, 1), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f8872a) {
            z10 = this.f8874c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f8883m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f8881k).concat(" release without a matched acquire!"));
        }
        synchronized (this.f8872a) {
            if (this.f8877g) {
                TextUtils.isEmpty(null);
            }
            if (this.f8882l.containsKey(null)) {
                b bVar = this.f8882l.get(null);
                if (bVar != null) {
                    int i10 = bVar.f8884a - 1;
                    bVar.f8884a = i10;
                    if (i10 == 0) {
                        this.f8882l.remove(null);
                        e(0);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f8881k).concat(" counter does not exist"));
            }
            e(0);
        }
    }

    public final void d() {
        if (this.f8876f.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f8876f);
        this.f8876f.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        c cVar = (c) arrayList.get(0);
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void e(int r8) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: da.a.e(int):void");
    }
}
