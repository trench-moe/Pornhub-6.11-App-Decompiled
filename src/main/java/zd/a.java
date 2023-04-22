package zd;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f21942a;

    public static boolean a(byte[] bArr, byte[] bArr2) {
        try {
            PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(b("MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALCRcazTMcbOko2Eczit0ef5vMLCdpMsTxY4vv5Sw8ZppkeZ2wmoSDhX9vmEs6uSl+5wS/mNwiMDniE0F1g4hbcCAwEAAQ==")));
            try {
                Signature signature = Signature.getInstance("SHA1withRSA");
                signature.initVerify(generatePublic);
                signature.update(bArr);
                return signature.verify(bArr2);
            } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e10) {
                throw new RuntimeException(e10);
            }
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        } catch (InvalidKeySpecException e12) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(e12);
        }
    }

    public static byte[] b(String str) {
        return Base64.decode(str, 0);
    }
}
