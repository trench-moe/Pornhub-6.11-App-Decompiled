package yc;

import ad.c;
import ad.f;
import android.annotation.SuppressLint;
import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;

@SuppressLint({"Assert"})
/* loaded from: classes.dex */
public abstract class a extends xc.a implements Runnable, WebSocket {
    public int A;

    /* renamed from: c  reason: collision with root package name */
    public URI f18631c;

    /* renamed from: f  reason: collision with root package name */
    public com.mixpanel.android.java_websocket.a f18632f;

    /* renamed from: m  reason: collision with root package name */
    public InputStream f18634m;
    public OutputStream n;

    /* renamed from: u  reason: collision with root package name */
    public Thread f18636u;

    /* renamed from: w  reason: collision with root package name */
    public Map<String, String> f18637w;

    /* renamed from: j  reason: collision with root package name */
    public Socket f18633j = null;

    /* renamed from: t  reason: collision with root package name */
    public Proxy f18635t = Proxy.NO_PROXY;
    public CountDownLatch y = new CountDownLatch(1);

    /* renamed from: z  reason: collision with root package name */
    public CountDownLatch f18638z = new CountDownLatch(1);

    /* loaded from: classes2.dex */
    public class b implements Runnable {
        public b(C0312a c0312a) {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebsocketWriteThread");
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = a.this.f18632f.f8120c.take();
                    a.this.n.write(take.array(), 0, take.limit());
                    a.this.n.flush();
                } catch (IOException unused) {
                    a.this.f18632f.e();
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public a(URI uri, Draft draft, Map<String, String> map, int i10) {
        this.f18631c = null;
        this.f18632f = null;
        this.A = 0;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        this.f18631c = uri;
        this.f18637w = null;
        this.A = i10;
        this.f18632f = new com.mixpanel.android.java_websocket.a(this, draft);
    }

    public final int b() {
        int port = this.f18631c.getPort();
        if (port == -1) {
            String scheme = this.f18631c.getScheme();
            if (scheme.equals("wss")) {
                return 443;
            }
            if (scheme.equals("ws")) {
                return 80;
            }
            throw new RuntimeException(a1.a.l("unkonow scheme", scheme));
        }
        return port;
    }

    public abstract void c(int i10, String str, boolean z10);

    public abstract void d(Exception exc);

    public abstract void e(String str);

    public abstract void f(f fVar);

    public final void g(WebSocket webSocket, int i10, String str, boolean z10) {
        Socket socket;
        this.y.countDown();
        this.f18638z.countDown();
        Thread thread = this.f18636u;
        if (thread != null) {
            thread.interrupt();
        }
        try {
            socket = this.f18633j;
        } catch (IOException e10) {
            d(e10);
        }
        if (socket != null) {
            socket.close();
            c(i10, str, z10);
        }
        c(i10, str, z10);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void h(com.mixpanel.android.java_websocket.framing.Framedata.Opcode r7, java.nio.ByteBuffer r8, boolean r9) {
        /*
            r6 = this;
            com.mixpanel.android.java_websocket.a r0 = r6.f18632f
            r5 = 7
            com.mixpanel.android.java_websocket.drafts.Draft r1 = r0.n
            r5 = 2
            java.util.Objects.requireNonNull(r1)
            com.mixpanel.android.java_websocket.framing.Framedata$Opcode r2 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.BINARY
            r5 = 1
            if (r7 == r2) goto L21
            r5 = 5
            com.mixpanel.android.java_websocket.framing.Framedata$Opcode r2 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.TEXT
            r5 = 5
            if (r7 == r2) goto L21
            r5 = 6
            if (r7 != r2) goto L18
            goto L22
        L18:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r5 = 5
            java.lang.String r8 = "Only Opcode.BINARY or  Opcode.TEXT are allowed"
            r7.<init>(r8)
            throw r7
        L21:
            r5 = 5
        L22:
            com.mixpanel.android.java_websocket.framing.Framedata$Opcode r2 = r1.f8130b
            r5 = 1
            if (r2 == 0) goto L2d
            com.mixpanel.android.java_websocket.framing.Framedata$Opcode r2 = com.mixpanel.android.java_websocket.framing.Framedata.Opcode.CONTINUOUS
            r5 = 2
            r1.f8130b = r2
            goto L30
        L2d:
            r1.f8130b = r7
            r5 = 7
        L30:
            com.mixpanel.android.java_websocket.framing.c r2 = new com.mixpanel.android.java_websocket.framing.c
            com.mixpanel.android.java_websocket.framing.Framedata$Opcode r3 = r1.f8130b
            r5 = 3
            r2.<init>(r3)
            r5 = 5
            r5 = 6
            r2.f8156c = r8     // Catch: com.mixpanel.android.java_websocket.exceptions.InvalidDataException -> L78
            r2.f8154a = r9
            r5 = 3
            if (r9 == 0) goto L46
            r4 = 0
            r7 = r4
            r1.f8130b = r7
            goto L49
        L46:
            r5 = 6
            r1.f8130b = r7
        L49:
            java.util.List r7 = java.util.Collections.singletonList(r2)
            boolean r8 = r0.i()
            if (r8 == 0) goto L70
            r5 = 4
            java.util.Iterator r4 = r7.iterator()
            r7 = r4
        L59:
            boolean r4 = r7.hasNext()
            r8 = r4
            if (r8 == 0) goto L6e
            r5 = 4
            java.lang.Object r4 = r7.next()
            r8 = r4
            com.mixpanel.android.java_websocket.framing.Framedata r8 = (com.mixpanel.android.java_websocket.framing.Framedata) r8
            r5 = 7
            r0.k(r8)
            r5 = 1
            goto L59
        L6e:
            r5 = 2
            return
        L70:
            com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException r7 = new com.mixpanel.android.java_websocket.exceptions.WebsocketNotConnectedException
            r5 = 2
            r7.<init>()
            throw r7
            r5 = 5
        L78:
            r7 = move-exception
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            r5 = 3
            r8.<init>(r7)
            throw r8
            r5 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.a.h(com.mixpanel.android.java_websocket.framing.Framedata$Opcode, java.nio.ByteBuffer, boolean):void");
    }

    public final void i() {
        String path = this.f18631c.getPath();
        String query = this.f18631c.getQuery();
        path = (path == null || path.length() == 0) ? "/" : "/";
        if (query != null) {
            path = android.support.v4.media.b.j(path, "?", query);
        }
        int b10 = b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f18631c.getHost());
        sb2.append(b10 != 80 ? a1.a.j(":", b10) : BuildConfig.FLAVOR);
        String sb3 = sb2.toString();
        c cVar = new c();
        if (path == null) {
            throw new IllegalArgumentException("http resource descriptor must not be null");
        }
        cVar.f356j = path;
        ((TreeMap) cVar.f1018f).put("Host", sb3);
        Map<String, String> map = this.f18637w;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                cVar.k(entry.getKey(), entry.getValue());
            }
        }
        com.mixpanel.android.java_websocket.a aVar = this.f18632f;
        aVar.y = aVar.n.i(cVar);
        try {
            Objects.requireNonNull(aVar.f8123m);
            aVar.m(aVar.n.g(aVar.y, aVar.f8124t));
        } catch (InvalidDataException unused) {
            throw new InvalidHandshakeException("Handshake data rejected by client.");
        } catch (RuntimeException e10) {
            ((a) aVar.f8123m).d(e10);
            throw new InvalidHandshakeException("rejected because of" + e10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int read;
        try {
            Socket socket = this.f18633j;
            if (socket == null) {
                this.f18633j = new Socket(this.f18635t);
            } else if (socket.isClosed()) {
                throw new IOException();
            }
            if (!this.f18633j.isBound()) {
                this.f18633j.connect(new InetSocketAddress(this.f18631c.getHost(), b()), this.A);
            }
            this.f18634m = this.f18633j.getInputStream();
            this.n = this.f18633j.getOutputStream();
            i();
            Thread thread = new Thread(new b(null));
            this.f18636u = thread;
            thread.start();
            List<Draft> list = com.mixpanel.android.java_websocket.a.C;
            byte[] bArr = new byte[16384];
            while (true) {
                try {
                    if ((this.f18632f.f8122j == WebSocket.READYSTATE.CLOSED) || (read = this.f18634m.read(bArr)) == -1) {
                        break;
                    }
                    this.f18632f.c(ByteBuffer.wrap(bArr, 0, read));
                } catch (IOException unused) {
                    this.f18632f.e();
                    return;
                } catch (RuntimeException e10) {
                    d(e10);
                    this.f18632f.b(1006, e10.getMessage(), false);
                    return;
                }
            }
            this.f18632f.e();
        } catch (Exception e11) {
            d(e11);
            this.f18632f.b(-1, e11.getMessage(), false);
        }
    }
}
