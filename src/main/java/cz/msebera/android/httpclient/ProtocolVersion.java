package cz.msebera.android.httpclient;

import java.io.Serializable;
import l9.e;

/* loaded from: classes.dex */
public class ProtocolVersion implements Serializable, Cloneable {
    private static final long serialVersionUID = 8950662842175091068L;
    public final int major;
    public final int minor;
    public final String protocol;

    public ProtocolVersion(String str, int i10, int i11) {
        e.l(str, "Protocol name");
        this.protocol = str;
        e.j(i10, "Protocol minor version");
        this.major = i10;
        e.j(i11, "Protocol minor version");
        this.minor = i11;
    }

    public ProtocolVersion a(int i10, int i11) {
        return (i10 == this.major && i11 == this.minor) ? this : new ProtocolVersion(this.protocol, i10, i11);
    }

    public final boolean b(ProtocolVersion protocolVersion) {
        if (protocolVersion != null && this.protocol.equals(protocolVersion.protocol)) {
            e.l(protocolVersion, "Protocol version");
            Object[] objArr = {this, protocolVersion};
            if (!this.protocol.equals(protocolVersion.protocol)) {
                throw new IllegalArgumentException(String.format("Versions for different protocols cannot be compared: %s %s", objArr));
            }
            int i10 = this.major - protocolVersion.major;
            if (i10 == 0) {
                i10 = this.minor - protocolVersion.minor;
            }
            if (i10 <= 0) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProtocolVersion) {
            ProtocolVersion protocolVersion = (ProtocolVersion) obj;
            return this.protocol.equals(protocolVersion.protocol) && this.major == protocolVersion.major && this.minor == protocolVersion.minor;
        }
        return false;
    }

    public final int hashCode() {
        return (this.protocol.hashCode() ^ (this.major * 100000)) ^ this.minor;
    }

    public String toString() {
        return this.protocol + '/' + Integer.toString(this.major) + '.' + Integer.toString(this.minor);
    }
}
