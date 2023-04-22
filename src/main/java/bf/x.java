package bf;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x extends c {

    /* renamed from: l  reason: collision with root package name */
    public final Socket f3711l;

    public x(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f3711l = socket;
    }

    @Override // bf.c
    public IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // bf.c
    public void k() {
        try {
            this.f3711l.close();
        } catch (AssertionError e10) {
            if (!cb.e.R(e10)) {
                throw e10;
            }
            Logger logger = o.f3684a;
            Level level = Level.WARNING;
            StringBuilder m10 = a1.a.m("Failed to close timed out socket ");
            m10.append(this.f3711l);
            logger.log(level, m10.toString(), (Throwable) e10);
        } catch (Exception e11) {
            Logger logger2 = o.f3684a;
            Level level2 = Level.WARNING;
            StringBuilder m11 = a1.a.m("Failed to close timed out socket ");
            m11.append(this.f3711l);
            logger2.log(level2, m11.toString(), (Throwable) e11);
        }
    }
}
