package j0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public class m implements ThreadFactory {

    /* renamed from: c  reason: collision with root package name */
    public String f11125c;

    /* renamed from: f  reason: collision with root package name */
    public int f11126f;

    /* loaded from: classes2.dex */
    public static class a extends Thread {

        /* renamed from: c  reason: collision with root package name */
        public final int f11127c;

        public a(Runnable runnable, String str, int i10) {
            super(runnable, str);
            this.f11127c = i10;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f11127c);
            super.run();
        }
    }

    public m(String str, int i10) {
        this.f11125c = str;
        this.f11126f = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f11125c, this.f11126f);
    }
}
