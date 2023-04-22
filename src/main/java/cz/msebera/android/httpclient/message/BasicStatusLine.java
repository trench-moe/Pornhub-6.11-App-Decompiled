package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.ProtocolVersion;
import java.io.Serializable;
import l9.e;
import md.r;
import t9.j0;

/* loaded from: classes.dex */
public class BasicStatusLine implements r, Cloneable, Serializable {
    private static final long serialVersionUID = -2443303766890459269L;
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolVersion, int i10, String str) {
        e.l(protocolVersion, "Version");
        this.protoVersion = protocolVersion;
        e.j(i10, "Status code");
        this.statusCode = i10;
        this.reasonPhrase = str;
    }

    @Override // md.r
    public ProtocolVersion a() {
        return this.protoVersion;
    }

    @Override // md.r
    public int b() {
        return this.statusCode;
    }

    @Override // md.r
    public String c() {
        return this.reasonPhrase;
    }

    public Object clone() {
        return super.clone();
    }

    public String toString() {
        return j0.f15266m.e(null, this).toString();
    }
}
