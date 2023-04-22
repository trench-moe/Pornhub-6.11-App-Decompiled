package l5;

import d6.l;
import e6.a;
import e6.d;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public final d6.i<h5.b, String> f12255a = new d6.i<>(1000);

    /* renamed from: b  reason: collision with root package name */
    public final m0.c<b> f12256b = e6.a.a(10, new a(this));

    /* loaded from: classes2.dex */
    public class a implements a.b<b> {
        public a(k kVar) {
        }

        @Override // e6.a.b
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements a.d {

        /* renamed from: c  reason: collision with root package name */
        public final MessageDigest f12257c;

        /* renamed from: f  reason: collision with root package name */
        public final e6.d f12258f = new d.b();

        public b(MessageDigest messageDigest) {
            this.f12257c = messageDigest;
        }

        @Override // e6.a.d
        public e6.d e() {
            return this.f12258f;
        }
    }

    public String a(h5.b bVar) {
        String a10;
        synchronized (this.f12255a) {
            a10 = this.f12255a.a(bVar);
        }
        if (a10 == null) {
            b b10 = this.f12256b.b();
            Objects.requireNonNull(b10, "Argument must not be null");
            b bVar2 = b10;
            try {
                bVar.b(bVar2.f12257c);
                byte[] digest = bVar2.f12257c.digest();
                char[] cArr = l.f8804b;
                synchronized (cArr) {
                    for (int i10 = 0; i10 < digest.length; i10++) {
                        int i11 = digest[i10] & UByte.MAX_VALUE;
                        int i12 = i10 * 2;
                        char[] cArr2 = l.f8803a;
                        cArr[i12] = cArr2[i11 >>> 4];
                        cArr[i12 + 1] = cArr2[i11 & 15];
                    }
                    a10 = new String(cArr);
                }
                this.f12256b.a(bVar2);
            } catch (Throwable th) {
                this.f12256b.a(bVar2);
                throw th;
            }
        }
        synchronized (this.f12255a) {
            this.f12255a.d(bVar, a10);
        }
        return a10;
    }
}
