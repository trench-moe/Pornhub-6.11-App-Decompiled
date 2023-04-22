package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class af {
    private static String AFInAppEventParameterName(byte[] bArr) {
        Formatter formatter = new Formatter();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            formatter.format("%02x", Byte.valueOf(bArr[i10]));
        }
        String obj = formatter.toString();
        formatter.close();
        return obj;
    }

    public static String AFInAppEventType(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to MD5");
            AFLogger.AFInAppEventParameterName(sb2.toString(), e10);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            return values(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA-256");
            AFLogger.AFInAppEventParameterName(sb2.toString(), e10);
            return null;
        }
    }

    public static String AFKeystoreWrapper(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(), "HmacSHA256"));
            return values(mac.doFinal(str.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e10) {
            AFLogger.AFInAppEventType(e10.getMessage(), e10);
            return e10.getMessage();
        }
    }

    public static String values(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.reset();
            messageDigest.update(str.getBytes("UTF-8"));
            return AFInAppEventParameterName(messageDigest.digest());
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder("Error turning ");
            sb2.append(str.substring(0, 6));
            sb2.append(".. to SHA1");
            AFLogger.AFInAppEventParameterName(sb2.toString(), e10);
            return null;
        }
    }

    private static String values(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            sb2.append(Integer.toString((b10 & UByte.MAX_VALUE) + 256, 16).substring(1));
        }
        return sb2.toString();
    }
}
