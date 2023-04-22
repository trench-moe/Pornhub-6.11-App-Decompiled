package qd;

import cz.msebera.android.httpclient.ConnectionClosedException;
import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.ProtocolException;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l9.e;
import sd.f;
import sd.g;
import sd.h;
import sd.i;
import sd.j;
import sd.k;
import sd.l;
import sd.n;
import sd.o;
import t9.j0;
import t9.k0;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    public final n f14496c;

    /* renamed from: f  reason: collision with root package name */
    public final o f14497f;

    /* renamed from: j  reason: collision with root package name */
    public final d f14498j;

    /* renamed from: m  reason: collision with root package name */
    public final pd.d f14499m;
    public final pd.d n;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicReference f14500t;

    /* renamed from: u  reason: collision with root package name */
    public final sd.a f14501u;

    /* renamed from: w  reason: collision with root package name */
    public final k.b f14502w;

    public a(int i10) {
        rd.a aVar = rd.a.f14755f;
        e.m(i10, "Buffer size");
        k kVar = new k();
        k kVar2 = new k();
        n nVar = new n(kVar, i10, -1, od.a.f13635j, null);
        this.f14496c = nVar;
        o oVar = new o(kVar2, i10, i10, null);
        this.f14497f = oVar;
        this.f14498j = new d(kVar, kVar2);
        this.f14499m = aVar;
        this.n = cb.e.C;
        this.f14500t = new AtomicReference();
        g gVar = g.f14983c;
        this.f14501u = new f(nVar, gVar.f14984a, gVar.f14985b, null);
        i iVar = i.f14986a;
        this.f14502w = new h(oVar, j0.f15266m);
    }

    public void a(Socket socket) {
        e.l(socket, "Socket");
        this.f14500t.set(socket);
        this.f14496c.f14998g = null;
        this.f14497f.f15006e = null;
    }

    public void c() {
        Socket socket = (Socket) this.f14500t.get();
        if (socket == null) {
            throw new ConnectionClosedException();
        }
        n nVar = this.f14496c;
        if (!(nVar.f14998g != null)) {
            nVar.f14998g = socket.getInputStream();
        }
        o oVar = this.f14497f;
        if (oVar.f15006e != null) {
            return;
        }
        oVar.f15006e = socket.getOutputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = (Socket) this.f14500t.getAndSet(null);
        if (socket != null) {
            try {
                n nVar = this.f14496c;
                nVar.f14999h = 0;
                nVar.f15000i = 0;
                this.f14497f.flush();
                try {
                    try {
                        socket.shutdownOutput();
                    } catch (IOException unused) {
                    }
                    socket.shutdownInput();
                } catch (IOException | UnsupportedOperationException unused2) {
                }
            } finally {
                socket.close();
            }
        }
    }

    public void d(md.g gVar) {
        e.l(gVar, "HTTP request");
        c();
        pd.b bVar = new pd.b();
        long k10 = this.f14499m.k(gVar);
        n nVar = this.f14496c;
        int i10 = (k10 > (-2L) ? 1 : (k10 == (-2L) ? 0 : -1));
        InputStream bVar2 = i10 == 0 ? new sd.b(nVar, null) : k10 == -1 ? new l(nVar) : k10 == 0 ? j.f14987c : new sd.d(nVar, k10);
        if (i10 == 0) {
            bVar.f13901j = true;
            bVar.n = -1L;
            bVar.f13902m = bVar2;
        } else if (k10 == -1) {
            bVar.f13901j = false;
            bVar.n = -1L;
            bVar.f13902m = bVar2;
        } else {
            bVar.f13901j = false;
            bVar.n = k10;
            bVar.f13902m = bVar2;
        }
        md.d n = gVar.n("Content-Type");
        if (n != null) {
            bVar.f13899c = n;
        }
        md.d n10 = gVar.n("Content-Encoding");
        if (n10 != null) {
            bVar.f13900f = n10;
        }
        gVar.c(bVar);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [md.h, T extends md.h] */
    public md.i e() {
        c();
        sd.a aVar = this.f14501u;
        int i10 = aVar.f14960e;
        if (i10 == 0) {
            try {
                aVar.f14961f = aVar.a(aVar.f14957a);
                aVar.f14960e = 1;
            } catch (ParseException e10) {
                throw new ProtocolException(e10.getMessage(), e10);
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("Inconsistent parser state");
        }
        td.b bVar = aVar.f14957a;
        od.a aVar2 = aVar.f14958b;
        aVar.f14961f.k(sd.a.b(bVar, aVar2.f13637f, aVar2.f13636c, aVar.d, aVar.f14959c));
        T t2 = aVar.f14961f;
        aVar.f14961f = null;
        aVar.f14959c.clear();
        aVar.f14960e = 0;
        md.i iVar = (md.i) t2;
        this.f14498j.f14507a++;
        return iVar;
    }

    public void f(md.l lVar) {
        c();
        k.b bVar = this.f14502w;
        Objects.requireNonNull(bVar);
        bVar.e(lVar);
        md.f o10 = ((ud.a) lVar).o();
        while (true) {
            ud.h hVar = (ud.h) o10;
            if (!hVar.hasNext()) {
                break;
            }
            ((td.c) bVar.f11723a).b(((j0) ((ud.j) bVar.f11725c)).d((CharArrayBuffer) bVar.f11724b, hVar.b()));
        }
        ((CharArrayBuffer) bVar.f11724b).clear();
        ((td.c) bVar.f11723a).b((CharArrayBuffer) bVar.f11724b);
        if (((ud.f) lVar).g().b() >= 200) {
            this.f14498j.f14508b++;
        }
    }

    public void h() {
        Socket socket = (Socket) this.f14500t.getAndSet(null);
        if (socket != null) {
            try {
                socket.setSoLinger(true, 0);
            } catch (IOException unused) {
            } catch (Throwable th) {
                socket.close();
                throw th;
            }
            socket.close();
        }
    }

    public String toString() {
        Socket socket = (Socket) this.f14500t.get();
        if (socket != null) {
            StringBuilder sb2 = new StringBuilder();
            SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
            SocketAddress localSocketAddress = socket.getLocalSocketAddress();
            if (remoteSocketAddress != null && localSocketAddress != null) {
                k0.d(sb2, localSocketAddress);
                sb2.append("<->");
                k0.d(sb2, remoteSocketAddress);
            }
            return sb2.toString();
        }
        return "[Not bound]";
    }
}
