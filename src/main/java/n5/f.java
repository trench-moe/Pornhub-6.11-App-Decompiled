package n5;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Objects;

/* loaded from: classes2.dex */
public class f implements h5.b {

    /* renamed from: b  reason: collision with root package name */
    public final g f13317b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f13318c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public String f13319e;

    /* renamed from: f  reason: collision with root package name */
    public URL f13320f;

    /* renamed from: g  reason: collision with root package name */
    public volatile byte[] f13321g;

    /* renamed from: h  reason: collision with root package name */
    public int f13322h;

    public f(String str) {
        g gVar = g.f13323a;
        this.f13318c = null;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.d = str;
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f13317b = gVar;
    }

    public f(URL url) {
        g gVar = g.f13323a;
        Objects.requireNonNull(url, "Argument must not be null");
        this.f13318c = url;
        this.d = null;
        Objects.requireNonNull(gVar, "Argument must not be null");
        this.f13317b = gVar;
    }

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        if (this.f13321g == null) {
            this.f13321g = c().getBytes(h5.b.f10146a);
        }
        messageDigest.update(this.f13321g);
    }

    public String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.f13318c;
        Objects.requireNonNull(url, "Argument must not be null");
        return url.toString();
    }

    public URL d() {
        if (this.f13320f == null) {
            if (TextUtils.isEmpty(this.f13319e)) {
                String str = this.d;
                if (TextUtils.isEmpty(str)) {
                    URL url = this.f13318c;
                    Objects.requireNonNull(url, "Argument must not be null");
                    str = url.toString();
                }
                this.f13319e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f13320f = new URL(this.f13319e);
        }
        return this.f13320f;
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return c().equals(fVar.c()) && this.f13317b.equals(fVar.f13317b);
        }
        return false;
    }

    @Override // h5.b
    public int hashCode() {
        if (this.f13322h == 0) {
            int hashCode = c().hashCode();
            this.f13322h = hashCode;
            this.f13322h = this.f13317b.hashCode() + (hashCode * 31);
        }
        return this.f13322h;
    }

    public String toString() {
        return c();
    }
}
