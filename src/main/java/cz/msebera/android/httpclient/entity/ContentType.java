package cz.msebera.android.httpclient.entity;

import cz.msebera.android.httpclient.util.CharArrayBuffer;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.text.Typography;
import l9.e;
import md.b;
import md.o;

/* loaded from: classes.dex */
public final class ContentType implements Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final ContentType f8583c;

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, ContentType> f8584f;

    /* renamed from: j  reason: collision with root package name */
    public static final ContentType f8585j;
    private static final long serialVersionUID = -7768694718232371896L;
    private final Charset charset;
    private final String mimeType;
    private final o[] params = null;

    static {
        Charset charset = b.f13085c;
        ContentType b10 = b("application/atom+xml", charset);
        ContentType b11 = b("application/x-www-form-urlencoded", charset);
        ContentType b12 = b("application/json", b.f13083a);
        b("application/octet-stream", null);
        ContentType b13 = b("application/svg+xml", charset);
        ContentType b14 = b("application/xhtml+xml", charset);
        ContentType b15 = b("application/xml", charset);
        ContentType a10 = a("image/bmp");
        ContentType a11 = a("image/gif");
        ContentType a12 = a("image/jpeg");
        ContentType a13 = a("image/png");
        ContentType a14 = a("image/svg+xml");
        ContentType a15 = a("image/tiff");
        ContentType a16 = a("image/webp");
        ContentType b16 = b("multipart/form-data", charset);
        ContentType b17 = b("text/html", charset);
        ContentType b18 = b("text/plain", charset);
        f8583c = b18;
        ContentType b19 = b("text/xml", charset);
        b("*/*", null);
        ContentType[] contentTypeArr = {b10, b11, b12, b13, b14, b15, a10, a11, a12, a13, a14, a15, a16, b16, b17, b18, b19};
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 17; i10++) {
            ContentType contentType = contentTypeArr[i10];
            hashMap.put(contentType.mimeType, contentType);
        }
        f8584f = Collections.unmodifiableMap(hashMap);
        f8585j = f8583c;
    }

    public ContentType(String str, Charset charset) {
        this.mimeType = str;
        this.charset = charset;
    }

    public static ContentType a(String str) {
        return b(str, null);
    }

    public static ContentType b(String str, Charset charset) {
        if (str != null) {
            if (e.h(str)) {
                throw new IllegalArgumentException("MIME type may not be blank");
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= lowerCase.length()) {
                    z10 = true;
                    break;
                }
                char charAt = lowerCase.charAt(i10);
                if (charAt == '\"' || charAt == ',') {
                    break;
                } else if (charAt == ';') {
                    break;
                } else {
                    i10++;
                }
            }
            e.a(z10, "MIME type may not contain reserved characters");
            return new ContentType(lowerCase, charset);
        }
        throw new IllegalArgumentException("MIME type may not be null");
    }

    public Charset c() {
        return this.charset;
    }

    public String d() {
        return this.mimeType;
    }

    public String toString() {
        int length;
        int length2;
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(64);
        charArrayBuffer.c(this.mimeType);
        if (this.params != null) {
            charArrayBuffer.c("; ");
            o[] oVarArr = this.params;
            e.l(oVarArr, "Header parameter array");
            if (oVarArr.length < 1) {
                length = 0;
            } else {
                length = (oVarArr.length - 1) * 2;
                for (o oVar : oVarArr) {
                    if (oVar == null) {
                        length2 = 0;
                    } else {
                        length2 = oVar.getName().length();
                        String value = oVar.getValue();
                        if (value != null) {
                            length2 += value.length() + 3;
                        }
                    }
                    length += length2;
                }
            }
            charArrayBuffer.f(length);
            for (int i10 = 0; i10 < oVarArr.length; i10++) {
                if (i10 > 0) {
                    charArrayBuffer.c("; ");
                }
                o oVar2 = oVarArr[i10];
                e.l(oVar2, "Name / value pair");
                int length3 = oVar2.getName().length();
                String value2 = oVar2.getValue();
                if (value2 != null) {
                    length3 += value2.length() + 3;
                }
                charArrayBuffer.f(length3);
                charArrayBuffer.c(oVar2.getName());
                String value3 = oVar2.getValue();
                if (value3 != null) {
                    charArrayBuffer.a('=');
                    boolean z10 = false;
                    for (int i11 = 0; i11 < value3.length() && !z10; i11++) {
                        z10 = " ;,:@()<>\\\"/[]?={}\t".indexOf(value3.charAt(i11)) >= 0;
                    }
                    if (z10) {
                        charArrayBuffer.a(Typography.quote);
                    }
                    for (int i12 = 0; i12 < value3.length(); i12++) {
                        char charAt = value3.charAt(i12);
                        if ("\"\\".indexOf(charAt) >= 0) {
                            charArrayBuffer.a('\\');
                        }
                        charArrayBuffer.a(charAt);
                    }
                    if (z10) {
                        charArrayBuffer.a(Typography.quote);
                    }
                }
            }
        } else if (this.charset != null) {
            charArrayBuffer.c("; charset=");
            charArrayBuffer.c(this.charset.name());
        }
        return charArrayBuffer.toString();
    }
}
