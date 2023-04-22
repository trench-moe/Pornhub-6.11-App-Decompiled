package com.mixpanel.android.java_websocket;

import ad.e;
import ad.f;
import android.annotation.SuppressLint;
import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.drafts.Draft_10;
import com.mixpanel.android.java_websocket.drafts.c;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import xc.b;

@SuppressLint({"Assert"})
/* loaded from: classes.dex */
public class a implements WebSocket {
    public static final List<Draft> C;

    /* renamed from: m  reason: collision with root package name */
    public final b f8123m;
    public Draft n;

    /* renamed from: t  reason: collision with root package name */
    public WebSocket.Role f8124t;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f8121f = false;

    /* renamed from: j  reason: collision with root package name */
    public WebSocket.READYSTATE f8122j = WebSocket.READYSTATE.NOT_YET_CONNECTED;

    /* renamed from: u  reason: collision with root package name */
    public Framedata.Opcode f8125u = null;

    /* renamed from: w  reason: collision with root package name */
    public ByteBuffer f8126w = ByteBuffer.allocate(0);
    public ad.a y = null;

    /* renamed from: z  reason: collision with root package name */
    public String f8127z = null;
    public Integer A = null;
    public Boolean B = null;

    /* renamed from: c  reason: collision with root package name */
    public final BlockingQueue<ByteBuffer> f8120c = new LinkedBlockingQueue();

    static {
        ArrayList arrayList = new ArrayList(4);
        C = arrayList;
        arrayList.add(new com.mixpanel.android.java_websocket.drafts.a());
        arrayList.add(new Draft_10());
        arrayList.add(new c());
        arrayList.add(new com.mixpanel.android.java_websocket.drafts.b());
    }

    public a(b bVar, Draft draft) {
        this.n = null;
        new LinkedBlockingQueue();
        this.f8123m = bVar;
        this.f8124t = WebSocket.Role.CLIENT;
        this.n = draft.e();
    }

    public final void a(int i10, String str, boolean z10) {
        WebSocket.READYSTATE readystate = WebSocket.READYSTATE.CLOSING;
        WebSocket.READYSTATE readystate2 = this.f8122j;
        if (readystate2 != readystate && readystate2 != WebSocket.READYSTATE.CLOSED) {
            if (readystate2 == WebSocket.READYSTATE.OPEN) {
                if (i10 == 1006) {
                    this.f8122j = readystate;
                    f(i10, str, false);
                    return;
                }
                if (this.n.h() != Draft.CloseHandshakeType.NONE) {
                    if (!z10) {
                        try {
                            try {
                                Objects.requireNonNull(this.f8123m);
                            } catch (RuntimeException e10) {
                                ((yc.a) this.f8123m).d(e10);
                            }
                        } catch (InvalidDataException e11) {
                            ((yc.a) this.f8123m).d(e11);
                            f(1006, "generated frame is invalid", false);
                        }
                    }
                    l(this.n.f(new com.mixpanel.android.java_websocket.framing.a(i10, str)));
                    f(i10, str, z10);
                }
                f(i10, str, z10);
            } else if (i10 == -3) {
                f(-3, str, true);
            } else {
                f(-1, str, false);
            }
            if (i10 == 1002) {
                f(i10, str, z10);
            }
            this.f8122j = readystate;
            this.f8126w = null;
        }
    }

    public synchronized void b(int i10, String str, boolean z10) {
        WebSocket.READYSTATE readystate = WebSocket.READYSTATE.CLOSED;
        synchronized (this) {
            if (this.f8122j == readystate) {
                return;
            }
            try {
                ((yc.a) this.f8123m).g(this, i10, str, z10);
            } catch (RuntimeException e10) {
                ((yc.a) this.f8123m).d(e10);
            }
            Draft draft = this.n;
            if (draft != null) {
                draft.k();
            }
            this.y = null;
            this.f8122j = readystate;
            this.f8120c.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mixpanel.android.java_websocket.a.c(java.nio.ByteBuffer):void");
    }

    public final void d(ByteBuffer byteBuffer) {
        Framedata.Opcode opcode = Framedata.Opcode.CONTINUOUS;
        Framedata.Opcode opcode2 = Framedata.Opcode.PONG;
        try {
        } catch (InvalidDataException e10) {
            ((yc.a) this.f8123m).d(e10);
            a(e10.a(), e10.getMessage(), false);
            return;
        }
        for (Framedata framedata : this.n.l(byteBuffer)) {
            Framedata.Opcode c10 = framedata.c();
            boolean d = framedata.d();
            if (c10 == Framedata.Opcode.CLOSING) {
                int i10 = 1005;
                String str = BuildConfig.FLAVOR;
                if (framedata instanceof zc.a) {
                    zc.a aVar = (zc.a) framedata;
                    i10 = aVar.e();
                    str = aVar.a();
                }
                if (this.f8122j == WebSocket.READYSTATE.CLOSING) {
                    b(i10, str, true);
                } else if (this.n.h() == Draft.CloseHandshakeType.TWOWAY) {
                    a(i10, str, true);
                } else {
                    f(i10, str, false);
                }
            } else if (c10 == Framedata.Opcode.PING) {
                Objects.requireNonNull((xc.a) this.f8123m);
                com.mixpanel.android.java_websocket.framing.c cVar = new com.mixpanel.android.java_websocket.framing.c(framedata);
                cVar.f8155b = opcode2;
                l(this.n.f(cVar));
            } else if (c10 == opcode2) {
                Objects.requireNonNull(this.f8123m);
            } else {
                if (d && c10 != opcode) {
                    if (this.f8125u != null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence not completed.");
                    }
                    if (c10 == Framedata.Opcode.TEXT) {
                        try {
                            ((yc.a) this.f8123m).e(bd.b.a(framedata.f()));
                        } catch (RuntimeException e11) {
                            ((yc.a) this.f8123m).d(e11);
                        }
                    } else if (c10 != Framedata.Opcode.BINARY) {
                        throw new InvalidDataException(1002, "non control or continious frame expected");
                    } else {
                        try {
                            b bVar = this.f8123m;
                            framedata.f();
                            Objects.requireNonNull(bVar);
                        } catch (RuntimeException e12) {
                            ((yc.a) this.f8123m).d(e12);
                        }
                    }
                    ((yc.a) this.f8123m).d(e10);
                    a(e10.a(), e10.getMessage(), false);
                    return;
                }
                if (c10 != opcode) {
                    if (this.f8125u != null) {
                        throw new InvalidDataException(1002, "Previous continuous frame sequence not completed.");
                    }
                    this.f8125u = c10;
                } else if (d) {
                    if (this.f8125u == null) {
                        throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                    }
                    this.f8125u = null;
                } else if (this.f8125u == null) {
                    throw new InvalidDataException(1002, "Continuous frame sequence was not started.");
                }
                try {
                    Objects.requireNonNull(this.f8123m);
                } catch (RuntimeException e13) {
                    ((yc.a) this.f8123m).d(e13);
                }
            }
        }
    }

    public void e() {
        if (this.f8122j == WebSocket.READYSTATE.NOT_YET_CONNECTED) {
            b(-1, BuildConfig.FLAVOR, true);
        } else if (this.f8121f) {
            b(this.A.intValue(), this.f8127z, this.B.booleanValue());
        } else if (this.n.h() == Draft.CloseHandshakeType.NONE) {
            b(1000, BuildConfig.FLAVOR, true);
        } else if (this.n.h() != Draft.CloseHandshakeType.ONEWAY) {
            b(1006, BuildConfig.FLAVOR, true);
        } else if (this.f8124t == WebSocket.Role.SERVER) {
            b(1006, BuildConfig.FLAVOR, true);
        } else {
            b(1000, BuildConfig.FLAVOR, true);
        }
    }

    public synchronized void f(int i10, String str, boolean z10) {
        try {
            if (this.f8121f) {
                return;
            }
            this.A = Integer.valueOf(i10);
            this.f8127z = str;
            this.B = Boolean.valueOf(z10);
            this.f8121f = true;
            Objects.requireNonNull(this.f8123m);
            try {
                Objects.requireNonNull(this.f8123m);
            } catch (RuntimeException e10) {
                ((yc.a) this.f8123m).d(e10);
            }
            Draft draft = this.n;
            if (draft != null) {
                draft.k();
            }
            this.y = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public InetSocketAddress g() {
        Socket socket = ((yc.a) this.f8123m).f18633j;
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    public final Draft.HandshakeState h(ByteBuffer byteBuffer) {
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        byteBuffer.mark();
        int limit = byteBuffer.limit();
        byte[] bArr = Draft.f8128c;
        if (limit > bArr.length) {
            return handshakeState;
        }
        if (byteBuffer.limit() >= bArr.length) {
            int i10 = 0;
            while (byteBuffer.hasRemaining()) {
                if (Draft.f8128c[i10] != byteBuffer.get()) {
                    byteBuffer.reset();
                    return handshakeState;
                }
                i10++;
            }
            return Draft.HandshakeState.MATCHED;
        }
        throw new IncompleteHandshakeException(bArr.length);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        return this.f8122j == WebSocket.READYSTATE.OPEN;
    }

    public final void j(e eVar) {
        this.f8122j = WebSocket.READYSTATE.OPEN;
        try {
            yc.a aVar = (yc.a) this.f8123m;
            aVar.y.countDown();
            aVar.f((f) eVar);
        } catch (RuntimeException e10) {
            ((yc.a) this.f8123m).d(e10);
        }
    }

    public void k(Framedata framedata) {
        l(this.n.f(framedata));
    }

    public final void l(ByteBuffer byteBuffer) {
        this.f8120c.add(byteBuffer);
        Objects.requireNonNull(this.f8123m);
    }

    public final void m(List<ByteBuffer> list) {
        for (ByteBuffer byteBuffer : list) {
            l(byteBuffer);
        }
    }

    public String toString() {
        return super.toString();
    }
}
