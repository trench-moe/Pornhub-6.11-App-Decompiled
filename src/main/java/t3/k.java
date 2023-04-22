package t3;

import android.os.Build;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class k implements yd.a {

    /* renamed from: a  reason: collision with root package name */
    public SecretKeySpec f15119a;

    public Cipher a(byte[] bArr) {
        Cipher cipher = Build.VERSION.SDK_INT < 26 ? Cipher.getInstance("AES/CTR/NoPadding", "BC") : Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, this.f15119a, new IvParameterSpec(bArr));
        kf.a.f12078a.a("CHOSEN PROVIDER :::::::::::::::::::::::: %s", cipher.getProvider());
        return cipher;
    }
}
