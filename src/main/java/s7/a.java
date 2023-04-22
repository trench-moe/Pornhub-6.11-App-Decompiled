package s7;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jd.e;
import o7.d;

/* loaded from: classes2.dex */
public final class a extends e {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f14914j = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: c  reason: collision with root package name */
    public final CharsetDecoder f14915c = jb.b.f11660c.newDecoder();

    /* renamed from: f  reason: collision with root package name */
    public final CharsetDecoder f14916f = jb.b.f11659b.newDecoder();

    @Override // jd.e
    public o7.a g(d dVar, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f14915c.decode(byteBuffer).toString();
            this.f14915c.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            this.f14915c.reset();
            byteBuffer.rewind();
            try {
                str = this.f14916f.decode(byteBuffer).toString();
                this.f14916f.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f14916f.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f14916f.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            this.f14915c.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new o7.a(new c(bArr, null, null));
        }
        Matcher matcher = f14914j.matcher(str);
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String v2 = t3.a.v(group);
                Objects.requireNonNull(v2);
                if (v2.equals("streamurl")) {
                    str3 = group2;
                } else {
                    if (v2.equals("streamtitle")) {
                        str2 = group2;
                    }
                }
            }
        }
        return new o7.a(new c(bArr, str2, str3));
    }
}
