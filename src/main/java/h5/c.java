package h5;

import android.text.TextUtils;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class c<T> {

    /* renamed from: e  reason: collision with root package name */
    public static final b<Object> f10147e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final T f10148a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f10149b;

    /* renamed from: c  reason: collision with root package name */
    public final String f10150c;
    public volatile byte[] d;

    /* loaded from: classes2.dex */
    public class a implements b<Object> {
        @Override // h5.c.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void a(byte[] bArr, T t2, MessageDigest messageDigest);
    }

    public c(String str, T t2, b<T> bVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f10150c = str;
        this.f10148a = t2;
        Objects.requireNonNull(bVar, "Argument must not be null");
        this.f10149b = bVar;
    }

    public static <T> c<T> a(String str, T t2) {
        return new c<>(str, t2, f10147e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f10150c.equals(((c) obj).f10150c);
        }
        return false;
    }

    public int hashCode() {
        return this.f10150c.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Option{key='");
        m10.append(this.f10150c);
        m10.append('\'');
        m10.append('}');
        return m10.toString();
    }
}
