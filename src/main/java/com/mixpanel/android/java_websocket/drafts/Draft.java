package com.mixpanel.android.java_websocket.drafts;

import ad.d;
import ad.e;
import ad.f;
import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class Draft {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f8128c = bd.b.b("<policy-file-request/>\u0000");

    /* renamed from: a  reason: collision with root package name */
    public WebSocket.Role f8129a = null;

    /* renamed from: b  reason: collision with root package name */
    public Framedata.Opcode f8130b = null;

    /* loaded from: classes.dex */
    public enum CloseHandshakeType {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* loaded from: classes.dex */
    public enum HandshakeState {
        MATCHED,
        NOT_MATCHED
    }

    public static String j(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b10 = 48;
        while (true) {
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.position(byteBuffer.position() - allocate.position());
                allocate = null;
                break;
            }
            byte b11 = byteBuffer.get();
            allocate.put(b11);
            if (b10 == 13 && b11 == 10) {
                allocate.limit(allocate.position() - 2);
                allocate.position(0);
                break;
            }
            b10 = b11;
        }
        if (allocate == null) {
            return null;
        }
        byte[] array = allocate.array();
        int limit = allocate.limit();
        CodingErrorAction codingErrorAction = bd.b.f3653a;
        try {
            return new String(array, 0, limit, "ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ad.b n(ByteBuffer byteBuffer, WebSocket.Role role) {
        ad.c cVar;
        String j10 = j(byteBuffer);
        if (j10 != null) {
            String[] split = j10.split(" ", 3);
            if (split.length == 3) {
                if (role == WebSocket.Role.CLIENT) {
                    d dVar = new d();
                    Short.parseShort(split[1]);
                    dVar.f357j = split[2];
                    cVar = dVar;
                } else {
                    ad.c cVar2 = new ad.c();
                    String str = split[1];
                    if (str == null) {
                        throw new IllegalArgumentException("http resource descriptor must not be null");
                    }
                    cVar2.f356j = str;
                    cVar = cVar2;
                }
                String j11 = j(byteBuffer);
                while (j11 != null && j11.length() > 0) {
                    String[] split2 = j11.split(":", 2);
                    if (split2.length != 2) {
                        throw new InvalidHandshakeException("not an http header");
                    }
                    cVar.k(split2[0], split2[1].replaceFirst("^ +", BuildConfig.FLAVOR));
                    j11 = j(byteBuffer);
                }
                if (j11 != null) {
                    return cVar;
                }
                throw new IncompleteHandshakeException();
            }
            throw new InvalidHandshakeException();
        }
        throw new IncompleteHandshakeException(byteBuffer.capacity() + 128);
    }

    public abstract HandshakeState a(ad.a aVar, f fVar);

    public abstract HandshakeState b(ad.a aVar);

    public boolean c(e eVar) {
        return eVar.g("Upgrade").equalsIgnoreCase("websocket") && eVar.g("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    public int d(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new InvalidDataException(1002, "Negative count");
    }

    public abstract Draft e();

    public abstract ByteBuffer f(Framedata framedata);

    public List<ByteBuffer> g(e eVar, WebSocket.Role role) {
        StringBuilder sb2 = new StringBuilder(100);
        if (eVar instanceof ad.a) {
            sb2.append("GET ");
            sb2.append(((ad.a) eVar).a());
            sb2.append(" HTTP/1.1");
        } else if (!(eVar instanceof f)) {
            throw new RuntimeException("unknow role");
        } else {
            StringBuilder m10 = a1.a.m("HTTP/1.1 101 ");
            m10.append(((f) eVar).c());
            sb2.append(m10.toString());
        }
        sb2.append("\r\n");
        Iterator<String> b10 = eVar.b();
        while (b10.hasNext()) {
            String next = b10.next();
            String g10 = eVar.g(next);
            sb2.append(next);
            sb2.append(": ");
            sb2.append(g10);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        String sb3 = sb2.toString();
        CodingErrorAction codingErrorAction = bd.b.f3653a;
        try {
            byte[] bytes = sb3.getBytes("ASCII");
            byte[] d = eVar.d();
            ByteBuffer allocate = ByteBuffer.allocate((d == null ? 0 : d.length) + bytes.length);
            allocate.put(bytes);
            if (d != null) {
                allocate.put(d);
            }
            allocate.flip();
            return Collections.singletonList(allocate);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public abstract CloseHandshakeType h();

    public abstract ad.c i(ad.c cVar);

    public abstract void k();

    public abstract List<Framedata> l(ByteBuffer byteBuffer);

    public e m(ByteBuffer byteBuffer) {
        return n(byteBuffer, this.f8129a);
    }
}
