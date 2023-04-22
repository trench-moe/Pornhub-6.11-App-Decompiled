package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.Serializable;
import l9.e;
import md.q;

/* loaded from: classes.dex */
public class BasicRequestLine implements q, Cloneable, Serializable {
    private static final long serialVersionUID = 2810581718468737193L;
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        e.l(str, "Method");
        this.method = str;
        e.l(str2, "URI");
        this.uri = str2;
        e.l(protocolVersion, "Version");
        this.protoversion = protocolVersion;
    }

    @Override // md.q
    public ProtocolVersion a() {
        return this.protoversion;
    }

    @Override // md.q
    public String b() {
        return this.method;
    }

    @Override // md.q
    public String c() {
        return this.uri;
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        String b10 = b();
        String c10 = c();
        int length = c10.length();
        charArrayBuffer.f(a().protocol.length() + 4 + length + b10.length() + 1 + 1);
        charArrayBuffer.c(b10);
        charArrayBuffer.a(' ');
        charArrayBuffer.c(c10);
        charArrayBuffer.a(' ');
        ProtocolVersion a10 = a();
        e.l(a10, "Protocol version");
        charArrayBuffer.f(a10.protocol.length() + 4);
        charArrayBuffer.c(a10.protocol);
        charArrayBuffer.a('/');
        charArrayBuffer.c(Integer.toString(a10.major));
        charArrayBuffer.a('.');
        charArrayBuffer.c(Integer.toString(a10.minor));
        return charArrayBuffer.toString();
    }
}
