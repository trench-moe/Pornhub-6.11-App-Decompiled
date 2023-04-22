package ce;

import java.io.File;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c extends ThreadPoolExecutor {

    /* renamed from: f  reason: collision with root package name */
    public static final int f4098f;

    /* renamed from: c  reason: collision with root package name */
    public ReentrantLock f4099c;

    static {
        int i10 = 0;
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new b(Pattern.compile("cpu[0-9]+")));
            if (listFiles != null) {
                i10 = listFiles.length;
            }
        } catch (SecurityException unused) {
        }
        if (i10 <= 0) {
            i10 = Runtime.getRuntime().availableProcessors();
        }
        f4098f = i10 > 0 ? 1 + (i10 * 2) : 1;
    }

    public c(int i10, int i11) {
        super(i10, i11, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(100));
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f4099c = reentrantLock;
        reentrantLock.newCondition();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        this.f4099c.lock();
        this.f4099c.unlock();
    }
}
