package c9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import h9.r0;
import h9.s0;
import h9.t0;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static final u f3894a;

    /* renamed from: b  reason: collision with root package name */
    public static final u f3895b;

    /* renamed from: c  reason: collision with root package name */
    public static volatile t0 f3896c;
    public static final Object d;

    /* renamed from: e  reason: collision with root package name */
    public static Context f3897e;

    static {
        new o(s.b1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
        new p(s.b1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
        f3894a = new q(s.b1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
        f3895b = new r(s.b1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
        d = new Object();
    }

    public static e0 a(final String str, final s sVar, final boolean z10, boolean z11) {
        try {
            b();
            Objects.requireNonNull(f3897e, "null reference");
            try {
                return f3896c.K0(new b0(str, sVar, z10, z11), new n9.b(f3897e.getPackageManager())) ? e0.d : new d0(new Callable() { // from class: c9.n
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        boolean z12 = z10;
                        String str2 = str;
                        s sVar2 = sVar;
                        Object[] objArr = new Object[5];
                        objArr[0] = true != (!z12 && w.a(str2, sVar2, true, false).f3873a) ? "not allowed" : "debug cert rejected";
                        objArr[1] = str2;
                        MessageDigest a10 = l9.a.a("SHA-1");
                        Objects.requireNonNull(a10, "null reference");
                        byte[] digest = a10.digest(sVar2.c1());
                        int length = digest.length;
                        char[] cArr = new char[length + length];
                        int i10 = 0;
                        for (byte b10 : digest) {
                            int i11 = b10 & UByte.MAX_VALUE;
                            int i12 = i10 + 1;
                            char[] cArr2 = a0.b.A;
                            cArr[i10] = cArr2[i11 >>> 4];
                            i10 = i12 + 1;
                            cArr[i12] = cArr2[i11 & 15];
                        }
                        objArr[2] = new String(cArr);
                        objArr[3] = Boolean.valueOf(z12);
                        objArr[4] = "12451000.false";
                        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", objArr);
                    }
                });
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
                return e0.c("module call", e10);
            }
        } catch (DynamiteModule.LoadingException e11) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
            String valueOf = String.valueOf(e11.getMessage());
            return e0.c(valueOf.length() != 0 ? "module init: ".concat(valueOf) : new String("module init: "), e11);
        }
    }

    public static void b() {
        t0 r0Var;
        if (f3896c != null) {
            return;
        }
        Objects.requireNonNull(f3897e, "null reference");
        synchronized (d) {
            try {
                if (f3896c == null) {
                    IBinder b10 = DynamiteModule.c(f3897e, DynamiteModule.d, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i10 = s0.f10376a;
                    if (b10 == null) {
                        r0Var = null;
                    } else {
                        IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        r0Var = queryLocalInterface instanceof t0 ? (t0) queryLocalInterface : new r0(b10);
                    }
                    f3896c = r0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
