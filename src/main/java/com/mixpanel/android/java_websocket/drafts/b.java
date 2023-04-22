package com.mixpanel.android.java_websocket.drafts;

import ad.f;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.InvalidDataException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class b extends Draft {

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f8140f;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public List<Framedata> f8139e = new LinkedList();

    /* renamed from: g  reason: collision with root package name */
    public final SecureRandom f8141g = new SecureRandom();

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState a(ad.a aVar, f fVar) {
        return (aVar.g("WebSocket-Origin").equals(fVar.g("Origin")) && c(fVar)) ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState b(ad.a aVar) {
        return (aVar.e("Origin") && c(aVar)) ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft e() {
        return new b();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ByteBuffer f(Framedata framedata) {
        if (framedata.c() == Framedata.Opcode.TEXT) {
            ByteBuffer f10 = framedata.f();
            ByteBuffer allocate = ByteBuffer.allocate(f10.remaining() + 2);
            allocate.put((byte) 0);
            f10.mark();
            allocate.put(f10);
            f10.reset();
            allocate.put((byte) -1);
            allocate.flip();
            return allocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType h() {
        return Draft.CloseHandshakeType.NONE;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public ad.c i(ad.c cVar) {
        ((TreeMap) cVar.f1018f).put("Upgrade", "WebSocket");
        ((TreeMap) cVar.f1018f).put("Connection", "Upgrade");
        if (!((TreeMap) cVar.f1018f).containsKey("Origin")) {
            StringBuilder m10 = a1.a.m("random");
            m10.append(this.f8141g.nextInt());
            ((TreeMap) cVar.f1018f).put("Origin", m10.toString());
        }
        return cVar;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public void k() {
        this.d = false;
        this.f8140f = null;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> l(ByteBuffer byteBuffer) {
        List<Framedata> o10 = o(byteBuffer);
        if (o10 != null) {
            return o10;
        }
        throw new InvalidDataException(1002);
    }

    public List<Framedata> o(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            byte b10 = byteBuffer.get();
            if (b10 == 0) {
                if (this.d) {
                    throw new InvalidFrameException("unexpected START_OF_FRAME");
                }
                this.d = true;
            } else if (b10 == -1) {
                if (!this.d) {
                    throw new InvalidFrameException("unexpected END_OF_FRAME");
                }
                ByteBuffer byteBuffer2 = this.f8140f;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    com.mixpanel.android.java_websocket.framing.c cVar = new com.mixpanel.android.java_websocket.framing.c();
                    cVar.f8156c = this.f8140f;
                    cVar.f8154a = true;
                    cVar.f8155b = Framedata.Opcode.TEXT;
                    this.f8139e.add(cVar);
                    this.f8140f = null;
                    byteBuffer.mark();
                }
                this.d = false;
            } else if (!this.d) {
                return null;
            } else {
                ByteBuffer byteBuffer3 = this.f8140f;
                if (byteBuffer3 == null) {
                    this.f8140f = ByteBuffer.allocate(64);
                } else if (!byteBuffer3.hasRemaining()) {
                    ByteBuffer byteBuffer4 = this.f8140f;
                    byteBuffer4.flip();
                    int capacity = byteBuffer4.capacity() * 2;
                    d(capacity);
                    ByteBuffer allocate = ByteBuffer.allocate(capacity);
                    allocate.put(byteBuffer4);
                    this.f8140f = allocate;
                }
                this.f8140f.put(b10);
            }
        }
        List<Framedata> list = this.f8139e;
        this.f8139e = new LinkedList();
        return list;
    }
}
