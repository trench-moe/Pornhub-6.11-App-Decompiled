package c9;

import android.os.RemoteException;
import android.util.Log;
import h9.o1;
import h9.p1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class s extends o1 {

    /* renamed from: b  reason: collision with root package name */
    public final int f3890b;

    public s(byte[] bArr) {
        h9.o.a(bArr.length == 25);
        this.f3890b = Arrays.hashCode(bArr);
    }

    public static byte[] b1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // h9.p1
    public final int a() {
        return this.f3890b;
    }

    @Override // h9.p1
    public final n9.a c() {
        return new n9.b(c1());
    }

    public abstract byte[] c1();

    public final boolean equals(Object obj) {
        n9.a c10;
        if (obj != null && (obj instanceof p1)) {
            try {
                p1 p1Var = (p1) obj;
                if (p1Var.a() == this.f3890b && (c10 = p1Var.c()) != null) {
                    return Arrays.equals(c1(), (byte[]) n9.b.c1(c10));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3890b;
    }
}
