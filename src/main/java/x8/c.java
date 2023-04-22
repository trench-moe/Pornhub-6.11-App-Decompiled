package x8;

import android.os.Parcel;
import t9.l;

/* loaded from: classes2.dex */
public final class c extends l implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f18067a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.f18067a = dVar;
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            this.f18067a.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        }
        return true;
    }
}
