package pc;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f13896c = {"*", "FCM", "GCM", BuildConfig.FLAVOR};

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f13897a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13898b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r0.isEmpty() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(mb.c r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.f13066a
            java.lang.String r1 = "com.google.android.gms.appid"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            r3.f13897a = r0
            r4.a()
            mb.d r0 = r4.f13068c
            java.lang.String r0 = r0.f13080e
            if (r0 == 0) goto L1b
            goto L49
        L1b:
            r4.a()
            mb.d r4 = r4.f13068c
            java.lang.String r0 = r4.f13078b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L33
            goto L49
        L33:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L3f
            goto L48
        L3f:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L49
        L48:
            r0 = r2
        L49:
            r3.f13898b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.a.<init>(mb.c):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.security.PublicKey] */
    public final String a() {
        PublicKey publicKey;
        synchronized (this.f13897a) {
            String str = null;
            String string = this.f13897a.getString("|S||P|", str);
            if (string == null) {
                return str;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e10) {
                Log.w("ContentValues", "Invalid key stored " + e10);
                publicKey = str;
            }
            if (publicKey == 0) {
                return str;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
