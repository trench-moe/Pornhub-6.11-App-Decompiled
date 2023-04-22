package h9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes2.dex */
public final class n0 extends RemoteCreator<d0> {

    /* renamed from: c  reason: collision with root package name */
    public static final n0 f10362c = new n0();

    public n0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        n0 n0Var = f10362c;
        try {
            l0 l0Var = new l0(1, i10, i11, null);
            return (View) n9.b.c1(n0Var.b(context).b1(new n9.b(context), l0Var));
        } catch (Exception e10) {
            throw new RemoteCreator.RemoteCreatorException(a1.a.h(64, "Could not get button with size ", i10, " and color ", i11), e10);
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ d0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof d0 ? (d0) queryLocalInterface : new d0(iBinder);
    }
}
