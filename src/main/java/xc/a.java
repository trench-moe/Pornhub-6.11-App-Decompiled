package xc;

import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import java.net.InetSocketAddress;

/* loaded from: classes.dex */
public abstract class a implements b {
    public String a(WebSocket webSocket) {
        InetSocketAddress g10 = ((com.mixpanel.android.java_websocket.a) webSocket).g();
        if (g10 != null) {
            StringBuffer stringBuffer = new StringBuffer(90);
            stringBuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringBuffer.append(g10.getPort());
            stringBuffer.append("\" /></cross-domain-policy>\u0000");
            return stringBuffer.toString();
        }
        throw new InvalidHandshakeException("socket not bound");
    }
}
