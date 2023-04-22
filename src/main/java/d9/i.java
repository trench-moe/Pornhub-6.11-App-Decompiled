package d9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        c9.b bVar = null;
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                str = SafeParcelReader.f(parcel, readInt);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.e(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 == 4) {
                bVar = (c9.b) SafeParcelReader.e(parcel, readInt, c9.b.CREATOR);
            } else if (c10 != 1000) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                i10 = SafeParcelReader.q(parcel, readInt);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i10) {
        return new Status[i10];
    }
}
