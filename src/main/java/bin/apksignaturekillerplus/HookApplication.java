package bin.apksignaturekillerplus;

import android.content.Context;
import android.os.Process;
import android.util.Base64;
import android.widget.Toast;
import com.appsflyer.oaid.BuildConfig;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* compiled from: GetConfig.java */
/* loaded from: classes2.dex */
public class HookApplication {
    public static String text(String str) {
        String str2 = BuildConfig.FLAVOR;
        try {
            str2 = new String(Base64.decode(str, 0), "UTF-8");
        } catch (Exception e10) {
        }
        return str2;
    }

    public static void hook(Context context, String str) {
        try {
            byte[] digest = MessageDigest.getInstance(text("U0hBMQ==")).digest(((X509Certificate) CertificateFactory.getInstance(text("WDUwOQ==")).generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray()))).getEncoded());
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (int i10 = 0; i10 < digest.length; i10++) {
                String hexString = Integer.toHexString(digest[i10]);
                int length = hexString.length();
                if (length == 1) {
                    hexString = new StringBuffer().append("0").append(hexString).toString();
                }
                if (length > 2) {
                    hexString = hexString.substring(length - 2, length);
                }
                sb2.append(hexString.toUpperCase());
                if (i10 < digest.length - 1) {
                    sb2.append(':');
                }
            }
            String sb3 = sb2.toString();
            if (!sb3.equals(text(str))) {
                System.exit(0);
            }
            if (!sb3.equals(text(str))) {
                Process.killProcess(Process.myPid());
            }
        } catch (Exception e10) {
            Toast.makeText(context, new StringBuffer().append(text("RXJyb3I6IA==")).append(e10).toString(), 1).show();
            System.exit(0);
        }
    }
}
