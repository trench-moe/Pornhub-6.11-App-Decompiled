package com.mixpanel.android.java_websocket.framing;

import com.mixpanel.android.java_websocket.framing.Framedata;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c implements b {

    /* renamed from: e  reason: collision with root package name */
    public static byte[] f8153e = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public boolean f8154a;

    /* renamed from: b  reason: collision with root package name */
    public Framedata.Opcode f8155b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f8156c;
    public boolean d;

    public c() {
    }

    public c(Framedata.Opcode opcode) {
        this.f8155b = opcode;
        this.f8156c = ByteBuffer.wrap(f8153e);
    }

    public c(Framedata framedata) {
        this.f8154a = framedata.d();
        this.f8155b = framedata.c();
        this.f8156c = framedata.f();
        this.d = framedata.b();
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public boolean b() {
        return this.d;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public Framedata.Opcode c() {
        return this.f8155b;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public boolean d() {
        return this.f8154a;
    }

    @Override // com.mixpanel.android.java_websocket.framing.Framedata
    public ByteBuffer f() {
        return this.f8156c;
    }

    @Override // com.mixpanel.android.java_websocket.framing.b
    public void g(ByteBuffer byteBuffer) {
        this.f8156c = byteBuffer;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Framedata{ optcode:");
        m10.append(this.f8155b);
        m10.append(", fin:");
        m10.append(this.f8154a);
        m10.append(", payloadlength:[pos:");
        m10.append(this.f8156c.position());
        m10.append(", len:");
        m10.append(this.f8156c.remaining());
        m10.append("], payload:");
        m10.append(Arrays.toString(bd.b.b(new String(this.f8156c.array()))));
        m10.append("}");
        return m10.toString();
    }
}
