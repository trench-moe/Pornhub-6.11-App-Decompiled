package t9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.cast.framework.zzat;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes2.dex */
public final class v0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a9.b f15359a = new a9.b("CastDynamiteModule");

    public static f2 a(Context context) {
        try {
            IBinder b10 = DynamiteModule.c(context, DynamiteModule.f6872b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (b10 == null) {
                return null;
            }
            IInterface queryLocalInterface = b10.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof f2 ? (f2) queryLocalInterface : new m1(b10);
        } catch (DynamiteModule.LoadingException e10) {
            throw new zzat(e10);
        }
    }
}
