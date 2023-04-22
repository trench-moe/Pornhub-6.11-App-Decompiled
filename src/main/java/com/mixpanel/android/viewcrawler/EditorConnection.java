package com.mixpanel.android.viewcrawler;

import android.os.Message;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import com.mixpanel.android.viewcrawler.d;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EditorConnection {
    public static final ByteBuffer d = ByteBuffer.allocate(0);

    /* renamed from: a  reason: collision with root package name */
    public final b f8337a;

    /* renamed from: b  reason: collision with root package name */
    public final c f8338b;

    /* renamed from: c  reason: collision with root package name */
    public final URI f8339c;

    /* loaded from: classes.dex */
    public class EditorConnectionException extends IOException {
        private static final long serialVersionUID = -1884953175346045636L;

        public EditorConnectionException(Throwable th) {
            super(th.getMessage());
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public class c extends yc.a {
        public c(URI uri, int i10, Socket socket) {
            super(uri, new com.mixpanel.android.java_websocket.drafts.a(), null, i10);
            if (this.f18633j != null) {
                throw new IllegalStateException("socket has already been set");
            }
            this.f18633j = socket;
        }

        @Override // yc.a
        public void c(int i10, String str, boolean z10) {
            cb.e.h0("MixpanelAPI.EditorCnctn", "WebSocket closed. Code: " + i10 + ", reason: " + str + "\nURI: " + EditorConnection.this.f8339c);
            d.b bVar = (d.b) EditorConnection.this.f8337a;
            com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(8));
        }

        @Override // yc.a
        public void d(Exception exc) {
            if (exc == null || exc.getMessage() == null) {
                cb.e.B("MixpanelAPI.EditorCnctn", "Unknown websocket error occurred");
                return;
            }
            StringBuilder m10 = a1.a.m("Websocket Error: ");
            m10.append(exc.getMessage());
            cb.e.B("MixpanelAPI.EditorCnctn", m10.toString());
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x013f -> B:25:0x0140). Please submit an issue!!! */
        @Override // yc.a
        public void e(String str) {
            JSONObject jSONObject;
            String string;
            cb.e.h0("MixpanelAPI.EditorCnctn", "Received message from editor:\n" + str);
            try {
                jSONObject = new JSONObject(str);
                string = jSONObject.getString("type");
            } catch (JSONException e10) {
                str = "Bad JSON received:" + str;
                cb.e.D("MixpanelAPI.EditorCnctn", str, e10);
            }
            if (string.equals("device_info_request")) {
                d.b bVar = (d.b) EditorConnection.this.f8337a;
                com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(4));
            } else if (string.equals("snapshot_request")) {
                d.b bVar2 = (d.b) EditorConnection.this.f8337a;
                Message obtainMessage = com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(2);
                obtainMessage.obj = jSONObject;
                com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(obtainMessage);
            } else if (string.equals("change_request")) {
                d.b bVar3 = (d.b) EditorConnection.this.f8337a;
                Message obtainMessage2 = com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(3);
                obtainMessage2.obj = jSONObject;
                com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(obtainMessage2);
            } else if (string.equals("event_binding_request")) {
                d.b bVar4 = (d.b) EditorConnection.this.f8337a;
                Message obtainMessage3 = com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(6);
                obtainMessage3.obj = jSONObject;
                com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(obtainMessage3);
            } else if (string.equals("clear_request")) {
                d.b bVar5 = (d.b) EditorConnection.this.f8337a;
                Message obtainMessage4 = com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(10);
                obtainMessage4.obj = jSONObject;
                com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(obtainMessage4);
            } else {
                if (string.equals("tweak_request")) {
                    d.b bVar6 = (d.b) EditorConnection.this.f8337a;
                    Message obtainMessage5 = com.mixpanel.android.viewcrawler.d.this.f8367h.obtainMessage(11);
                    obtainMessage5.obj = jSONObject;
                    com.mixpanel.android.viewcrawler.d.this.f8367h.sendMessage(obtainMessage5);
                }
            }
        }

        @Override // yc.a
        public void f(ad.f fVar) {
            cb.e.h0("MixpanelAPI.EditorCnctn", "Websocket connected");
        }
    }

    /* loaded from: classes.dex */
    public class d extends OutputStream {
        public d(a aVar) {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            try {
                EditorConnection.this.f8338b.h(Framedata.Opcode.TEXT, EditorConnection.d, true);
            } catch (WebsocketNotConnectedException e10) {
                throw new EditorConnectionException(e10);
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            write(new byte[]{(byte) i10}, 0, 1);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            write(bArr, 0, bArr.length);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            try {
                EditorConnection.this.f8338b.h(Framedata.Opcode.TEXT, ByteBuffer.wrap(bArr, i10, i11), false);
            } catch (WebsocketNotConnectedException e10) {
                throw new EditorConnectionException(e10);
            }
        }
    }

    public EditorConnection(URI uri, b bVar, Socket socket) {
        this.f8337a = bVar;
        this.f8339c = uri;
        try {
            c cVar = new c(uri, 5000, socket);
            this.f8338b = cVar;
            if (cVar.f18636u != null) {
                throw new IllegalStateException("WebSocketClient objects are not reuseable");
            }
            Thread thread = new Thread(cVar);
            cVar.f18636u = thread;
            thread.start();
            cVar.y.await();
            Objects.requireNonNull(cVar.f18632f);
        } catch (InterruptedException e10) {
            throw new EditorConnectionException(e10);
        }
    }

    public BufferedOutputStream a() {
        return new BufferedOutputStream(new d(null));
    }

    public boolean b() {
        return this.f8338b.f18632f.i();
    }

    public boolean c() {
        com.mixpanel.android.java_websocket.a aVar = this.f8338b.f18632f;
        WebSocket.READYSTATE readystate = aVar.f8122j;
        if (readystate == WebSocket.READYSTATE.CLOSED) {
            return false;
        }
        return ((readystate == WebSocket.READYSTATE.CLOSING) || aVar.f8121f) ? false : true;
    }
}
