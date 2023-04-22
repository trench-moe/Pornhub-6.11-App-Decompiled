package k8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static r f12000e;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f12001a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<b>> f12002b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final Object f12003c = new Object();
    public int d = 0;

    /* loaded from: classes2.dex */
    public interface b {
        void a(int i10);
    }

    /* loaded from: classes2.dex */
    public final class c extends BroadcastReceiver {
        public c(a aVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0071 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[Catch: RuntimeException -> 0x00a0, TryCatch #1 {RuntimeException -> 0x00a0, blocks: (B:39:0x0074, B:41:0x0090, B:43:0x009c, B:42:0x0096), top: B:51:0x0074 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: RuntimeException -> 0x00a0, TryCatch #1 {RuntimeException -> 0x00a0, blocks: (B:39:0x0074, B:41:0x0090, B:43:0x009c, B:42:0x0096), top: B:51:0x0074 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onReceive(android.content.Context r12, android.content.Intent r13) {
            /*
                Method dump skipped, instructions count: 212
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.r.c.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* loaded from: classes2.dex */
    public class d extends PhoneStateListener {
        public d(a aVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
        @Override // android.telephony.PhoneStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo r6) {
            /*
                r5 = this;
                r1 = r5
                int r3 = r6.getOverrideNetworkType()
                r6 = r3
                r0 = 3
                java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                if (r6 == r0) goto L15
                r0 = 4
                r3 = 2
                if (r6 != r0) goto L11
                r3 = 3
                goto L16
            L11:
                r3 = 6
                r3 = 0
                r6 = r3
                goto L18
            L15:
                r3 = 5
            L16:
                r6 = 1
                r3 = 6
            L18:
                k8.r r0 = k8.r.this
                r4 = 6
                if (r6 == 0) goto L22
                r3 = 5
                r6 = 10
                r4 = 3
                goto L25
            L22:
                r4 = 2
                r3 = 5
                r6 = r3
            L25:
                k8.r.a(r0, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.r.d.onDisplayInfoChanged(android.telephony.TelephonyDisplayInfo):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
        @Override // android.telephony.PhoneStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onServiceStateChanged(android.telephony.ServiceState r5) {
            /*
                r4 = this;
                r1 = r4
                if (r5 != 0) goto L8
                r3 = 2
                java.lang.String r5 = ""
                r3 = 1
                goto Le
            L8:
                r3 = 1
                java.lang.String r3 = r5.toString()
                r5 = r3
            Le:
                java.lang.String r0 = "nrState=CONNECTED"
                boolean r0 = r5.contains(r0)
                if (r0 != 0) goto L23
                java.lang.String r3 = "nrState=NOT_RESTRICTED"
                r0 = r3
                boolean r5 = r5.contains(r0)
                if (r5 == 0) goto L20
                goto L24
            L20:
                r3 = 0
                r5 = r3
                goto L26
            L23:
                r3 = 4
            L24:
                r3 = 1
                r5 = r3
            L26:
                k8.r r0 = k8.r.this
                r3 = 5
                if (r5 == 0) goto L2f
                r3 = 10
                r5 = r3
                goto L32
            L2f:
                r3 = 3
                r5 = 5
                r3 = 6
            L32:
                k8.r.a(r0, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.r.d.onServiceStateChanged(android.telephony.ServiceState):void");
        }
    }

    public r(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(null), intentFilter);
    }

    public static void a(r rVar, int i10) {
        synchronized (rVar.f12003c) {
            try {
                if (rVar.d == i10) {
                    return;
                }
                rVar.d = i10;
                Iterator<WeakReference<b>> it = rVar.f12002b.iterator();
                while (it.hasNext()) {
                    WeakReference<b> next = it.next();
                    b bVar = next.get();
                    if (bVar != null) {
                        bVar.a(i10);
                    } else {
                        rVar.f12002b.remove(next);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
