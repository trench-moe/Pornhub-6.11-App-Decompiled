package cz.msebera.android.httpclient.message;

import a1.a;
import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.Serializable;
import l9.e;
import md.c;
import ud.l;

/* loaded from: classes.dex */
public class BufferedHeader implements c, Cloneable, Serializable {
    private static final long serialVersionUID = -2768352615787625448L;
    private final CharArrayBuffer buffer;
    private final String name;
    private final int valuePos;

    public BufferedHeader(CharArrayBuffer charArrayBuffer) {
        e.l(charArrayBuffer, "Char array buffer");
        int h10 = charArrayBuffer.h(58);
        if (h10 == -1) {
            StringBuilder m10 = a.m("Invalid header: ");
            m10.append(charArrayBuffer.toString());
            throw new ParseException(m10.toString());
        }
        String l10 = charArrayBuffer.l(0, h10);
        if (l10.isEmpty()) {
            StringBuilder m11 = a.m("Invalid header: ");
            m11.append(charArrayBuffer.toString());
            throw new ParseException(m11.toString());
        }
        this.buffer = charArrayBuffer;
        this.name = l10;
        this.valuePos = h10 + 1;
    }

    @Override // md.c
    public CharArrayBuffer b() {
        return this.buffer;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // md.d
    public md.e[] getElements() {
        l lVar = new l(0, this.buffer.length());
        lVar.b(this.valuePos);
        return ud.c.f15853a.a(this.buffer, lVar);
    }

    @Override // md.o
    public String getName() {
        return this.name;
    }

    @Override // md.o
    public String getValue() {
        CharArrayBuffer charArrayBuffer = this.buffer;
        return charArrayBuffer.l(this.valuePos, charArrayBuffer.length());
    }

    public String toString() {
        return this.buffer.toString();
    }
}
