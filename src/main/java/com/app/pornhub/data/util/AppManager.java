package com.app.pornhub.data.util;

import android.text.TextUtils;
import android.util.Base64;
import com.appsflyer.oaid.BuildConfig;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class AppManager {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f4352a;

    /* renamed from: b  reason: collision with root package name */
    public String f4353b;

    private native byte[] bytesFromJNI();

    public String a() {
        byte[] bArr;
        if (TextUtils.isEmpty(this.f4353b)) {
            if (this.f4352a == null) {
                this.f4352a = bytesFromJNI();
            }
            byte[] bArr2 = this.f4352a;
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(bArr2);
                bArr = messageDigest.digest();
            } catch (NoSuchAlgorithmException unused) {
                bArr = new byte[20];
            }
            String str = new String(Base64.encode(bArr, 0));
            this.f4353b = str;
            this.f4353b = str.replace("\n", BuildConfig.FLAVOR).replace("\r", BuildConfig.FLAVOR);
        }
        return this.f4353b;
    }
}
