package com.mixpanel.android.java_websocket.drafts;

import ad.e;
import ad.f;
import android.annotation.SuppressLint;
import androidx.appcompat.widget.i;
import com.appsflyer.oaid.BuildConfig;
import com.mixpanel.android.java_websocket.WebSocket;
import com.mixpanel.android.java_websocket.drafts.Draft;
import com.mixpanel.android.java_websocket.exceptions.IncompleteHandshakeException;
import com.mixpanel.android.java_websocket.exceptions.InvalidFrameException;
import com.mixpanel.android.java_websocket.exceptions.InvalidHandshakeException;
import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

@SuppressLint({"UseValueOf"})
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f8142i = {-1, 0};

    /* renamed from: h  reason: collision with root package name */
    public final SecureRandom f8143h = new SecureRandom();

    public static byte[] p(String str, String str2, byte[] bArr) {
        byte[] r10 = r(str);
        byte[] r11 = r(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{r10[0], r10[1], r10[2], r10[3], r11[0], r11[1], r11[2], r11[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static String q() {
        SecureRandom secureRandom = new SecureRandom();
        long nextInt = secureRandom.nextInt(12) + 1;
        String l10 = Long.toString((secureRandom.nextInt(Math.abs(new Long(4294967295L / nextInt).intValue())) + 1) * nextInt);
        int nextInt2 = secureRandom.nextInt(12) + 1;
        for (int i10 = 0; i10 < nextInt2; i10++) {
            int abs = Math.abs(secureRandom.nextInt(l10.length()));
            char nextInt3 = (char) (secureRandom.nextInt(95) + 33);
            if (nextInt3 >= '0' && nextInt3 <= '9') {
                nextInt3 = (char) (nextInt3 - 15);
            }
            l10 = new StringBuilder(l10).insert(abs, nextInt3).toString();
        }
        for (int i11 = 0; i11 < nextInt; i11++) {
            l10 = new StringBuilder(l10).insert(Math.abs(secureRandom.nextInt(l10.length() - 1) + 1), " ").toString();
        }
        return l10;
    }

    public static byte[] r(String str) {
        try {
            long parseLong = Long.parseLong(str.replaceAll("[^0-9]", BuildConfig.FLAVOR));
            long length = str.split(" ").length - 1;
            if (length != 0) {
                long longValue = new Long(parseLong / length).longValue();
                return new byte[]{(byte) (longValue >> 24), (byte) ((longValue << 8) >> 24), (byte) ((longValue << 16) >> 24), (byte) ((longValue << 24) >> 24)};
            }
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new InvalidHandshakeException("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState a(ad.a aVar, f fVar) {
        Draft.HandshakeState handshakeState = Draft.HandshakeState.NOT_MATCHED;
        try {
            if (fVar.g("Sec-WebSocket-Origin").equals(aVar.g("Origin")) && c(fVar)) {
                byte[] d = fVar.d();
                if (d == null || d.length == 0) {
                    throw new IncompleteHandshakeException();
                }
                return Arrays.equals(d, p(aVar.g("Sec-WebSocket-Key1"), aVar.g("Sec-WebSocket-Key2"), aVar.d())) ? Draft.HandshakeState.MATCHED : handshakeState;
            }
            return handshakeState;
        } catch (InvalidHandshakeException e10) {
            throw new RuntimeException("bad handshakerequest", e10);
        }
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.HandshakeState b(ad.a aVar) {
        return (aVar.g("Upgrade").equals("WebSocket") && aVar.g("Connection").contains("Upgrade") && aVar.g("Sec-WebSocket-Key1").length() > 0 && !aVar.g("Sec-WebSocket-Key2").isEmpty() && aVar.e("Origin")) ? Draft.HandshakeState.MATCHED : Draft.HandshakeState.NOT_MATCHED;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft e() {
        return new c();
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public ByteBuffer f(Framedata framedata) {
        return framedata.c() == Framedata.Opcode.CLOSING ? ByteBuffer.wrap(f8142i) : super.f(framedata);
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public Draft.CloseHandshakeType h() {
        return Draft.CloseHandshakeType.ONEWAY;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public ad.c i(ad.c cVar) {
        ((TreeMap) cVar.f1018f).put("Upgrade", "WebSocket");
        ((TreeMap) cVar.f1018f).put("Connection", "Upgrade");
        ((TreeMap) cVar.f1018f).put("Sec-WebSocket-Key1", q());
        ((TreeMap) cVar.f1018f).put("Sec-WebSocket-Key2", q());
        if (!((TreeMap) cVar.f1018f).containsKey("Origin")) {
            StringBuilder m10 = a1.a.m("random");
            m10.append(this.f8143h.nextInt());
            ((TreeMap) cVar.f1018f).put("Origin", m10.toString());
        }
        byte[] bArr = new byte[8];
        this.f8143h.nextBytes(bArr);
        cVar.f1017c = bArr;
        return cVar;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.b, com.mixpanel.android.java_websocket.drafts.Draft
    public List<Framedata> l(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        List<Framedata> o10 = o(byteBuffer);
        if (o10 == null) {
            byteBuffer.reset();
            List<Framedata> list = this.f8139e;
            this.d = true;
            if (this.f8140f == null) {
                this.f8140f = ByteBuffer.allocate(2);
                if (byteBuffer.remaining() <= this.f8140f.remaining()) {
                    this.f8140f.put(byteBuffer);
                    if (this.f8140f.hasRemaining()) {
                        this.f8139e = new LinkedList();
                        return list;
                    } else if (Arrays.equals(this.f8140f.array(), f8142i)) {
                        list.add(new com.mixpanel.android.java_websocket.framing.a(1000));
                        return list;
                    } else {
                        throw new InvalidFrameException();
                    }
                }
                throw new InvalidFrameException();
            }
            throw new InvalidFrameException();
        }
        return o10;
    }

    @Override // com.mixpanel.android.java_websocket.drafts.Draft
    public e m(ByteBuffer byteBuffer) {
        ad.b n = Draft.n(byteBuffer, this.f8129a);
        i iVar = (i) n;
        if ((((TreeMap) iVar.f1018f).containsKey("Sec-WebSocket-Key1") || this.f8129a == WebSocket.Role.CLIENT) && !((TreeMap) iVar.f1018f).containsKey("Sec-WebSocket-Version")) {
            byte[] bArr = new byte[this.f8129a == WebSocket.Role.SERVER ? 8 : 16];
            try {
                byteBuffer.get(bArr);
                iVar.f1017c = bArr;
            } catch (BufferUnderflowException unused) {
                throw new IncompleteHandshakeException(byteBuffer.capacity() + 16);
            }
        }
        return n;
    }
}
