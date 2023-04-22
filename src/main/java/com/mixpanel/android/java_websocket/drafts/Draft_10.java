package com.mixpanel.android.java_websocket.drafts;

import ad.e;
import ad.f;
import android.annotation.SuppressLint;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.LimitExedeedException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.ByteCompanionObject;

@SuppressLint({"Assert", "UseValueOf"})
/* loaded from: classes.dex */
public class Draft_10 extends Draft {
    public ByteBuffer d;

    /* renamed from: e  reason: collision with root package name */
    public final SecureRandom f8138e = new SecureRandom();

    /* loaded from: classes.dex */
    public class IncompleteException extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public IncompleteException(int i10) {
            this.preferedsize = i10;
        }

        public int a() {
            return this.preferedsize;
        }
    }

    public static int p(e eVar) {
        String g10 = eVar.g("Sec-WebSocket-Version");
        if (g10.length() > 0) {
            try {
                return new Integer(g10.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState a(ad.a aVar, f fVar) {
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        if (aVar.e("Sec-WebSocket-Key")) {
            if (!fVar.e("Sec-WebSocket-Accept")) {
                return handshakeState;
            }
            if (o(aVar.g("Sec-WebSocket-Key")).equals(fVar.g("Sec-WebSocket-Accept"))) {
                return Draft.HandshakeState.MATCHED;
            }
        }
        return handshakeState;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState b(ad.a aVar) {
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        int p10 = p(aVar);
        if (p10 != 7 && p10 != 8) {
            return handshakeState;
        }
        return c(aVar) ? Draft.HandshakeState.MATCHED : handshakeState;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft e() {
        return new Draft_10();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ByteBuffer f(Framedata framedata) {
        byte b10;
        ByteBuffer f10 = framedata.f();
        int i10 = 0;
        boolean z10 = this.f8129a == WebSocket.Role.CLIENT;
        int i11 = f10.remaining() <= 125 ? 1 : f10.remaining() <= 65535 ? 2 : 8;
        ByteBuffer allocate = ByteBuffer.allocate(f10.remaining() + (i11 > 1 ? i11 + 1 : i11) + 1 + (z10 ? 4 : 0));
        Framedata.Opcode c10 = framedata.c();
        if (c10 == Framedata.Opcode.CONTINUOUS) {
            b10 = 0;
        } else if (c10 == Framedata.Opcode.TEXT) {
            b10 = 1;
        } else if (c10 == Framedata.Opcode.BINARY) {
            b10 = 2;
        } else if (c10 == Framedata.Opcode.CLOSING) {
            b10 = 8;
        } else if (c10 == Framedata.Opcode.PING) {
            b10 = 9;
        } else if (c10 != Framedata.Opcode.PONG) {
            StringBuilder m10 = a1.a.m("Don't know how to handle ");
            m10.append(c10.toString());
            throw new RuntimeException(m10.toString());
        } else {
            b10 = 10;
        }
        boolean d = framedata.d();
        byte b11 = ByteCompanionObject.MIN_VALUE;
        allocate.put((byte) (((byte) (d ? -128 : 0)) | b10));
        long remaining = f10.remaining();
        byte[] bArr = new byte[i11];
        int i12 = (i11 * 8) - 8;
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) (remaining >>> (i12 - (i13 * 8)));
        }
        if (i11 == 1) {
            byte b12 = bArr[0];
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b12 | b11));
        } else if (i11 == 2) {
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b11 | 126));
            allocate.put(bArr);
        } else if (i11 != 8) {
            throw new RuntimeException("Size representation not supported/specified");
        } else {
            if (!z10) {
                b11 = 0;
            }
            allocate.put((byte) (b11 | ByteCompanionObject.MAX_VALUE));
            allocate.put(bArr);
        }
        if (z10) {
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.putInt(this.f8138e.nextInt());
            allocate.put(allocate2.array());
            while (f10.hasRemaining()) {
                allocate.put((byte) (f10.get() ^ allocate2.get(i10 % 4)));
                i10++;
            }
        } else {
            allocate.put(f10);
        }
        allocate.flip();
        return allocate;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType h() {
        return Draft.CloseHandshakeType.TWOWAY;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ad.c i(ad.c cVar) {
        String str;
        ((TreeMap) cVar.f1018f).put("Upgrade", "websocket");
        ((TreeMap) cVar.f1018f).put("Connection", "Upgrade");
        ((TreeMap) cVar.f1018f).put("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f8138e.nextBytes(bArr);
        try {
            str = bd.a.b(bArr, 0, 16, 0);
        } catch (IOException unused) {
            str = null;
        }
        ((TreeMap) cVar.f1018f).put("Sec-WebSocket-Key", str);
        return cVar;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public void k() {
        this.d = null;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> l(ByteBuffer byteBuffer) {
        LinkedList linkedList = new LinkedList();
        if (this.d != null) {
            try {
                byteBuffer.mark();
                int remaining = byteBuffer.remaining();
                int remaining2 = this.d.remaining();
                if (remaining2 > remaining) {
                    this.d.put(byteBuffer.array(), byteBuffer.position(), remaining);
                    byteBuffer.position(byteBuffer.position() + remaining);
                    return Collections.emptyList();
                }
                this.d.put(byteBuffer.array(), byteBuffer.position(), remaining2);
                byteBuffer.position(byteBuffer.position() + remaining2);
                linkedList.add(q((ByteBuffer) this.d.duplicate().position(0)));
                this.d = null;
            } catch (IncompleteException e10) {
                this.d.limit();
                int a10 = e10.a();
                d(a10);
                ByteBuffer allocate = ByteBuffer.allocate(a10);
                this.d.rewind();
                allocate.put(this.d);
                this.d = allocate;
                return l(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(q(byteBuffer));
            } catch (IncompleteException e11) {
                byteBuffer.reset();
                int a11 = e11.a();
                d(a11);
                ByteBuffer allocate2 = ByteBuffer.allocate(a11);
                this.d = allocate2;
                allocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    public final String o(String str) {
        String l10 = a1.a.l(str.trim(), "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(l10.getBytes());
            try {
                return bd.a.b(digest, 0, digest.length, 0);
            } catch (IOException unused) {
                return null;
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Framedata q(ByteBuffer byteBuffer) {
        Framedata.Opcode opcode;
        com.mixpanel.android.java_websocket.framing.c cVar;
        Framedata.Opcode opcode2 = Framedata.Opcode.PONG;
        Framedata.Opcode opcode3 = Framedata.Opcode.PING;
        Framedata.Opcode opcode4 = Framedata.Opcode.CLOSING;
        int remaining = byteBuffer.remaining();
        int i10 = 2;
        if (remaining >= 2) {
            byte b10 = byteBuffer.get();
            boolean z10 = (b10 >> 8) != 0;
            byte b11 = (byte) ((b10 & ByteCompanionObject.MAX_VALUE) >> 4);
            if (b11 == 0) {
                byte b12 = byteBuffer.get();
                boolean z11 = (b12 & ByteCompanionObject.MIN_VALUE) != 0;
                int i11 = (byte) (b12 & ByteCompanionObject.MAX_VALUE);
                byte b13 = (byte) (b10 & 15);
                if (b13 == 0) {
                    opcode = Framedata.Opcode.CONTINUOUS;
                } else if (b13 == 1) {
                    opcode = Framedata.Opcode.TEXT;
                } else if (b13 != 2) {
                    switch (b13) {
                        case 8:
                            opcode = opcode4;
                            break;
                        case 9:
                            opcode = opcode3;
                            break;
                        case 10:
                            opcode = opcode2;
                            break;
                        default:
                            StringBuilder m10 = a1.a.m("unknow optcode ");
                            m10.append((int) b13);
                            throw new InvalidFrameException(m10.toString());
                    }
                } else {
                    opcode = Framedata.Opcode.BINARY;
                }
                if (z10 || !(opcode == opcode3 || opcode == opcode2 || opcode == opcode4)) {
                    if (i11 < 0 || i11 > 125) {
                        if (opcode == opcode3 || opcode == opcode2 || opcode == opcode4) {
                            throw new InvalidFrameException("more than 125 octets");
                        }
                        if (i11 != 126) {
                            i10 = 10;
                            if (remaining < 10) {
                                throw new IncompleteException(10);
                            }
                            byte[] bArr = new byte[8];
                            for (int i12 = 0; i12 < 8; i12++) {
                                bArr[i12] = byteBuffer.get();
                            }
                            long longValue = new BigInteger(bArr).longValue();
                            if (longValue > 2147483647L) {
                                throw new LimitExedeedException("Payloadsize is to big...");
                            }
                            i11 = (int) longValue;
                        } else if (remaining < 4) {
                            throw new IncompleteException(4);
                        } else {
                            i11 = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                            i10 = 4;
                        }
                    }
                    int i13 = i10 + (z11 ? 4 : 0) + i11;
                    if (remaining >= i13) {
                        d(i11);
                        ByteBuffer allocate = ByteBuffer.allocate(i11);
                        if (z11) {
                            byte[] bArr2 = new byte[4];
                            byteBuffer.get(bArr2);
                            for (int i14 = 0; i14 < i11; i14++) {
                                allocate.put((byte) (byteBuffer.get() ^ bArr2[i14 % 4]));
                            }
                        } else {
                            allocate.put(byteBuffer.array(), byteBuffer.position(), allocate.limit());
                            byteBuffer.position(allocate.limit() + byteBuffer.position());
                        }
                        if (opcode == opcode4) {
                            cVar = new com.mixpanel.android.java_websocket.framing.a();
                        } else {
                            cVar = new com.mixpanel.android.java_websocket.framing.c();
                            cVar.f8154a = z10;
                            cVar.f8155b = opcode;
                        }
                        allocate.flip();
                        cVar.g(allocate);
                        return cVar;
                    }
                    throw new IncompleteException(i13);
                }
                throw new InvalidFrameException("control frames may no be fragmented");
            }
            throw new InvalidFrameException(a1.a.j("bad rsv ", b11));
        }
        throw new IncompleteException(2);
    }
}
