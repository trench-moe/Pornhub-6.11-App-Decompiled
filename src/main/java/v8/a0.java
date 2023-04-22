package v8;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class a0 extends t9.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f16059a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i iVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.f16059a = iVar;
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            f a10 = this.f16059a.a(parcel.readString());
            n9.a j10 = a10 == null ? null : a10.j();
            parcel2.writeNoException();
            t9.v.d(parcel2, j10);
            return true;
        } else if (i10 == 2) {
            boolean b10 = this.f16059a.b();
            parcel2.writeNoException();
            int i12 = t9.v.f15358a;
            parcel2.writeInt(b10 ? 1 : 0);
            return true;
        } else if (i10 == 3) {
            String str = this.f16059a.f16099b;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 4) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
    }
}
