package w6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16444a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16445b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16446c;

    /* loaded from: classes2.dex */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final InterfaceC0283b f16447c;

        /* renamed from: f  reason: collision with root package name */
        public final Handler f16448f;

        public a(Handler handler, InterfaceC0283b interfaceC0283b) {
            this.f16448f = handler;
            this.f16447c = interfaceC0283b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f16448f.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f16446c) {
                v0.this.r0(false, -1, 3);
            }
        }
    }

    /* renamed from: w6.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0283b {
    }

    public b(Context context, Handler handler, InterfaceC0283b interfaceC0283b) {
        this.f16444a = context.getApplicationContext();
        this.f16445b = new a(handler, interfaceC0283b);
    }

    public void a(boolean z10) {
        if (z10 && !this.f16446c) {
            this.f16444a.registerReceiver(this.f16445b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f16446c = true;
            return;
        }
        if (!z10 && this.f16446c) {
            this.f16444a.unregisterReceiver(this.f16445b);
            this.f16446c = false;
        }
    }
}
