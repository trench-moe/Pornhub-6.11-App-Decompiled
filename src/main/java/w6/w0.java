package w6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Iterator;
import w6.v0;

/* loaded from: classes2.dex */
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16827a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16828b;

    /* renamed from: c  reason: collision with root package name */
    public final b f16829c;
    public final AudioManager d;

    /* renamed from: e  reason: collision with root package name */
    public c f16830e;

    /* renamed from: f  reason: collision with root package name */
    public int f16831f;

    /* renamed from: g  reason: collision with root package name */
    public int f16832g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16833h;

    /* loaded from: classes2.dex */
    public interface b {
    }

    /* loaded from: classes2.dex */
    public final class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f16834b = 0;

        public c(a aVar) {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w0 w0Var = w0.this;
            w0Var.f16828b.post(new androidx.emoji2.text.k(w0Var, 5));
        }
    }

    public w0(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f16827a = applicationContext;
        this.f16828b = handler;
        this.f16829c = bVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        k8.a.g(audioManager);
        this.d = audioManager;
        this.f16831f = 3;
        this.f16832g = b(audioManager, 3);
        this.f16833h = a(audioManager, this.f16831f);
        c cVar = new c(null);
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f16830e = cVar;
        } catch (RuntimeException e10) {
            k8.a.k("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    public static boolean a(AudioManager audioManager, int i10) {
        return k8.c0.f11939a >= 23 ? audioManager.isStreamMute(i10) : b(audioManager, i10) == 0;
    }

    public static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Could not retrieve stream volume for stream type ");
            sb2.append(i10);
            k8.a.k("StreamVolumeManager", sb2.toString(), e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public void c(int i10) {
        if (this.f16831f == i10) {
            return;
        }
        this.f16831f = i10;
        d();
        v0.c cVar = (v0.c) this.f16829c;
        a7.a h02 = v0.h0(v0.this.f16761o);
        if (h02.equals(v0.this.K)) {
            return;
        }
        v0 v0Var = v0.this;
        v0Var.K = h02;
        Iterator<a7.b> it = v0Var.f16758k.iterator();
        while (it.hasNext()) {
            it.next().M(h02);
        }
    }

    public final void d() {
        int b10 = b(this.d, this.f16831f);
        boolean a10 = a(this.d, this.f16831f);
        if (this.f16832g == b10) {
            if (this.f16833h != a10) {
            }
        }
        this.f16832g = b10;
        this.f16833h = a10;
        Iterator<a7.b> it = v0.this.f16758k.iterator();
        while (it.hasNext()) {
            it.next().F(b10, a10);
        }
    }
}
