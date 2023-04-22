package k8;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k8.i;

/* loaded from: classes2.dex */
public final class y implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final List<b> f12030b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f12031a;

    /* loaded from: classes2.dex */
    public static final class b implements i.a {

        /* renamed from: a  reason: collision with root package name */
        public Message f12032a;

        public b() {
        }

        public b(a aVar) {
        }

        public final void a() {
            this.f12032a = null;
            List<b> list = y.f12030b;
            synchronized (list) {
                if (((ArrayList) list).size() < 50) {
                    ((ArrayList) list).add(this);
                }
            }
        }

        public void b() {
            Message message = this.f12032a;
            Objects.requireNonNull(message);
            message.sendToTarget();
            a();
        }
    }

    public y(Handler handler) {
        this.f12031a = handler;
    }

    public static b l() {
        b bVar;
        List<b> list = f12030b;
        synchronized (list) {
            if (((ArrayList) list).isEmpty()) {
                bVar = new b(null);
            } else {
                bVar = (b) ((ArrayList) list).remove(((ArrayList) list).size() - 1);
            }
        }
        return bVar;
    }

    @Override // k8.i
    public i.a a(int i10, int i11, int i12) {
        b l10 = l();
        l10.f12032a = this.f12031a.obtainMessage(i10, i11, i12);
        return l10;
    }

    @Override // k8.i
    public boolean b(Runnable runnable) {
        return this.f12031a.post(runnable);
    }

    @Override // k8.i
    public i.a c(int i10) {
        b l10 = l();
        l10.f12032a = this.f12031a.obtainMessage(i10);
        return l10;
    }

    @Override // k8.i
    public boolean d(int i10) {
        return this.f12031a.hasMessages(i10);
    }

    @Override // k8.i
    public boolean e(int i10) {
        return this.f12031a.sendEmptyMessage(i10);
    }

    @Override // k8.i
    public i.a f(int i10, int i11, int i12, Object obj) {
        b l10 = l();
        l10.f12032a = this.f12031a.obtainMessage(i10, i11, i12, obj);
        return l10;
    }

    @Override // k8.i
    public boolean g(i.a aVar) {
        b bVar = (b) aVar;
        Handler handler = this.f12031a;
        Message message = bVar.f12032a;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        bVar.a();
        return sendMessageAtFrontOfQueue;
    }

    @Override // k8.i
    public boolean h(int i10, long j10) {
        return this.f12031a.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // k8.i
    public void i(int i10) {
        this.f12031a.removeMessages(i10);
    }

    @Override // k8.i
    public i.a j(int i10, Object obj) {
        b l10 = l();
        l10.f12032a = this.f12031a.obtainMessage(i10, obj);
        return l10;
    }

    @Override // k8.i
    public void k(Object obj) {
        this.f12031a.removeCallbacksAndMessages(null);
    }
}
