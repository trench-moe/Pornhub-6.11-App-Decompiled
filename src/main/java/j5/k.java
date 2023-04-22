package j5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11413a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f11414b = new Handler(Looper.getMainLooper(), new a());

    /* loaded from: classes2.dex */
    public static final class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((i) message.obj).b();
                return true;
            }
            return false;
        }
    }

    public synchronized void a(i<?> iVar, boolean z10) {
        if (!this.f11413a && !z10) {
            this.f11413a = true;
            iVar.b();
            this.f11413a = false;
        }
        this.f11414b.obtainMessage(1, iVar).sendToTarget();
    }
}
