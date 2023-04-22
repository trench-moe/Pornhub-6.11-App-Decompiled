package s8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f14925c = new ReentrantLock();
    public static a d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f14926a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f14927b;

    public a(Context context) {
        this.f14927b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        Objects.requireNonNull(context, "null reference");
        Lock lock = f14925c;
        ((ReentrantLock) lock).lock();
        try {
            if (d == null) {
                d = new a(context.getApplicationContext());
            }
            a aVar = d;
            ((ReentrantLock) lock).unlock();
            return aVar;
        } catch (Throwable th) {
            ((ReentrantLock) f14925c).unlock();
            throw th;
        }
    }

    public GoogleSignInAccount b() {
        String c10 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c10)) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(c10).length() + 20);
        sb2.append("googleSignInAccount");
        sb2.append(":");
        sb2.append(c10);
        String c11 = c(sb2.toString());
        if (c11 != null) {
            try {
                return GoogleSignInAccount.q0(c11);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final String c(String str) {
        this.f14926a.lock();
        try {
            String string = this.f14927b.getString(str, null);
            this.f14926a.unlock();
            return string;
        } catch (Throwable th) {
            this.f14926a.unlock();
            throw th;
        }
    }
}
