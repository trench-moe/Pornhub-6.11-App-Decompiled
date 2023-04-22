package w9;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* loaded from: classes2.dex */
public final class m4 implements k4 {

    /* renamed from: c  reason: collision with root package name */
    public static m4 f17239c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f17240a;

    /* renamed from: b  reason: collision with root package name */
    public final ContentObserver f17241b;

    public m4() {
        this.f17240a = null;
        this.f17241b = null;
    }

    public m4(Context context) {
        this.f17240a = context;
        l4 l4Var = new l4();
        this.f17241b = l4Var;
        context.getContentResolver().registerContentObserver(d4.f17102a, true, l4Var);
    }

    public static m4 b(Context context) {
        m4 m4Var;
        synchronized (m4.class) {
            if (f17239c == null) {
                f17239c = a0.b.l(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new m4(context) : new m4();
            }
            m4Var = f17239c;
        }
        return m4Var;
    }

    @Override // w9.k4
    /* renamed from: c */
    public final String a(String str) {
        if (this.f17240a == null) {
            return null;
        }
        try {
            return (String) com.google.android.gms.internal.measurement.b.a(new hf.c(this, str));
        } catch (IllegalStateException | NullPointerException | SecurityException e10) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e10);
            return null;
        }
    }
}
