package a9;

import d9.a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final a.g<b0> f278a = new a.g<>();

    /* renamed from: b  reason: collision with root package name */
    public static final a.g<c0> f279b = new a.g<>();

    static {
        try {
            Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        Pattern pattern = a.f249a;
        "urn:x-cast:".concat("com.google.cast.multizone");
    }
}
