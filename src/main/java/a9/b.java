package a9;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f254a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f255b;

    /* renamed from: c  reason: collision with root package name */
    public String f256c;

    public b(String str) {
        h9.o.f(str, "The log tag cannot be null or empty.");
        this.f254a = str;
        this.f255b = str.length() <= 23;
    }

    public void a(String str, Object... objArr) {
        if (f()) {
            Log.d(this.f254a, e(str, objArr));
        }
    }

    public void b(Throwable th, String str, Object... objArr) {
        if (f()) {
            Log.d(this.f254a, e(str, objArr), th);
        }
    }

    public void c(String str, Object... objArr) {
        Log.e(this.f254a, e(str, objArr));
    }

    public void d(String str, Object... objArr) {
        Log.w(this.f254a, e(str, objArr));
    }

    public final String e(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        if (!TextUtils.isEmpty(this.f256c)) {
            String valueOf = String.valueOf(this.f256c);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                return valueOf.concat(valueOf2);
            }
            str = new String(valueOf);
        }
        return str;
    }

    public final boolean f() {
        boolean z10 = false;
        if (this.f255b && Log.isLoggable(this.f254a, 3)) {
            z10 = true;
        }
        return z10;
    }
}
