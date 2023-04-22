package cz.msebera.android.httpclient.message;

import java.io.Serializable;
import l9.e;
import m9.a;
import md.o;

/* loaded from: classes.dex */
public class BasicNameValuePair implements o, Cloneable, Serializable {
    private static final long serialVersionUID = -6437800749411518984L;
    private final String name;
    private final String value;

    public BasicNameValuePair(String str, String str2) {
        e.l(str, "Name");
        this.name = str;
        this.value = str2;
    }

    public Object clone() {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
            return this.name.equals(basicNameValuePair.name) && a.r(this.value, basicNameValuePair.value);
        }
        return false;
    }

    @Override // md.o
    public String getName() {
        return this.name;
    }

    @Override // md.o
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return a.v(a.v(17, this.name), this.value);
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb2 = new StringBuilder(this.value.length() + this.name.length() + 1);
        sb2.append(this.name);
        sb2.append("=");
        sb2.append(this.value);
        return sb2.toString();
    }
}
