package cz.msebera.android.httpclient.message;

import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.Serializable;
import md.d;
import md.e;
import t9.j0;
import ud.c;
import ud.l;

/* loaded from: classes.dex */
public class BasicHeader implements d, Cloneable, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final e[] f8586c = new e[0];
    private static final long serialVersionUID = -5427236326487562174L;
    private final String name;
    private final String value;

    public BasicHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // md.d
    public e[] getElements() {
        String str = this.value;
        if (str != null) {
            c cVar = c.f15853a;
            l9.e.l(str, "Value");
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(str.length());
            charArrayBuffer.c(str);
            return c.f15853a.a(charArrayBuffer, new l(0, str.length()));
        }
        return f8586c;
    }

    @Override // md.o
    public String getName() {
        return this.name;
    }

    @Override // md.o
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return j0.f15266m.d(null, this).toString();
    }
}
