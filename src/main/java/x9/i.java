package x9;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class i implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f18086a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18087b = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public i(IBinder iBinder) {
        this.f18086a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18086a;
    }
}
