package x9;

import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class j extends l {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18088b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(d9.c cVar, String str) {
        super(cVar);
        this.f18088b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x9.h, android.os.IBinder] */
    @Override // com.google.android.gms.common.api.internal.a
    public final void a(c cVar) {
        ?? r02 = this.f18090a;
        String str = this.f18088b;
        i iVar = (i) cVar.getService();
        Objects.requireNonNull(iVar);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(iVar.f18087b);
        int i10 = e.f18085a;
        if (r02 == 0) {
            obtain.writeStrongBinder(null);
        } else {
            obtain.writeStrongBinder(r02);
        }
        obtain.writeString(str);
        Parcel obtain2 = Parcel.obtain();
        try {
            iVar.f18086a.transact(6, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
