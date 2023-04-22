package c9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class a implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3855a = false;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<IBinder> f3856b = new LinkedBlockingQueue();

    public IBinder a(long j10, TimeUnit timeUnit) {
        h9.o.g("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f3855a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f3855a = true;
        IBinder poll = this.f3856b.poll(j10, timeUnit);
        if (poll != null) {
            return poll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3856b.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
