package n9;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: n9.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0227a extends u9.a implements a {
        public AbstractBinderC0227a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a b1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof a ? (a) queryLocalInterface : new c(iBinder);
        }
    }
}
