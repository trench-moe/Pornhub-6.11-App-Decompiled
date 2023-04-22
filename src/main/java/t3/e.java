package t3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.preference.PreferenceManager;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public class e {
    public static void a(Context context) {
        Locale locale = Locale.getDefault();
        g(context, Locale.US);
        try {
            try {
                KeyStore.getInstance("AndroidKeyStore").load(null);
                Calendar calendar = Calendar.getInstance(Locale.getDefault());
                Calendar calendar2 = Calendar.getInstance(Locale.getDefault());
                calendar2.add(1, 30);
                KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias("ph_vd_entity_als").setSubject(new X500Principal("CN=ph_vd_entity_als")).setSerialNumber(BigInteger.TEN).setStartDate(calendar.getTime()).setEndDate(calendar2.getTime()).build();
                KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                keyPairGenerator.initialize(build);
                keyPairGenerator.generateKeyPair();
            } catch (IOException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | CertificateException e10) {
                kf.a.f12078a.d(e10, "Error generating key pair", new Object[0]);
            }
            g(context, locale);
        } catch (Throwable th) {
            g(context, locale);
            throw th;
        }
    }

    public static SecretKeySpec b(Context context) {
        byte[] e10;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("busola", null);
        if (string == null) {
            e10 = new byte[16];
            new SecureRandom().nextBytes(e10);
            defaultSharedPreferences.edit().putString("busola", Base64.encodeToString(f(context, e10), 0)).apply();
        } else {
            e10 = e(context, Base64.decode(string, 0));
        }
        return new SecretKeySpec(e10, "AES");
    }

    public static KeyStore.PrivateKeyEntry c(Context context) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias("ph_vd_entity_als")) {
                a(context);
            }
            return (KeyStore.PrivateKeyEntry) keyStore.getEntry("ph_vd_entity_als", null);
        } catch (Exception e10) {
            kf.a.f12078a.d(e10, "Error getting private key entry from android key store", new Object[0]);
            return null;
        }
    }

    public static void d(Context context, long j10) {
        d.f15109a.putLong(0, j10);
        byte[] array = d.f15109a.array();
        d.f15109a.clear();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.edit().putString("macola", Base64.encodeToString(f(context, array), 0)).apply();
    }

    public static byte[] e(Context context, byte[] bArr) {
        try {
            KeyStore.PrivateKeyEntry c10 = c(context);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, c10.getPrivateKey());
            CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(bArr), cipher);
            ArrayList arrayList = new ArrayList();
            while (true) {
                int read = cipherInputStream.read();
                if (read == -1) {
                    break;
                }
                arrayList.add(Byte.valueOf((byte) read));
            }
            int size = arrayList.size();
            byte[] bArr2 = new byte[size];
            for (int i10 = 0; i10 < size; i10++) {
                bArr2[i10] = ((Byte) arrayList.get(i10)).byteValue();
            }
            return bArr2;
        } catch (IOException e10) {
            kf.a.f12078a.d(e10, "RSA Decrypt IO error", new Object[0]);
            return null;
        } catch (InvalidKeyException e11) {
            e = e11;
            kf.a.f12078a.d(e, "RSA Decrypt error", new Object[0]);
            return null;
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            kf.a.f12078a.d(e, "RSA Decrypt error", new Object[0]);
            return null;
        } catch (NoSuchPaddingException e13) {
            e = e13;
            kf.a.f12078a.d(e, "RSA Decrypt error", new Object[0]);
            return null;
        }
    }

    public static byte[] f(Context context, byte[] bArr) {
        try {
            KeyStore.PrivateKeyEntry c10 = c(context);
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidOpenSSL");
            cipher.init(1, c10.getCertificate().getPublicKey());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(byteArrayOutputStream, cipher);
            cipherOutputStream.write(bArr);
            cipherOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            kf.a.f12078a.d(e10, "RSA Encrypt IO error", new Object[0]);
            return null;
        } catch (InvalidKeyException e11) {
            e = e11;
            kf.a.f12078a.d(e, "RSA Encrypt error", new Object[0]);
            return null;
        } catch (NoSuchAlgorithmException e12) {
            e = e12;
            kf.a.f12078a.d(e, "RSA Encrypt error", new Object[0]);
            return null;
        } catch (NoSuchProviderException e13) {
            e = e13;
            kf.a.f12078a.d(e, "RSA Encrypt error", new Object[0]);
            return null;
        } catch (NoSuchPaddingException e14) {
            e = e14;
            kf.a.f12078a.d(e, "RSA Encrypt error", new Object[0]);
            return null;
        }
    }

    public static void g(Context context, Locale locale) {
        Locale.setDefault(locale);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
    }
}
