package c9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import h9.m;
import java.util.Arrays;
import t9.k0;

/* loaded from: classes.dex */
public final class b extends i9.a {

    /* renamed from: c  reason: collision with root package name */
    public final int f3857c;

    /* renamed from: f  reason: collision with root package name */
    public final int f3858f;

    /* renamed from: j  reason: collision with root package name */
    public final PendingIntent f3859j;

    /* renamed from: m  reason: collision with root package name */
    public final String f3860m;
    public static final b n = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new l();

    public b(int i10) {
        this.f3857c = 1;
        this.f3858f = i10;
        this.f3859j = null;
        this.f3860m = null;
    }

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f3857c = i10;
        this.f3858f = i11;
        this.f3859j = pendingIntent;
        this.f3860m = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this.f3857c = 1;
        this.f3858f = i10;
        this.f3859j = pendingIntent;
        this.f3860m = null;
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this.f3857c = 1;
        this.f3858f = i10;
        this.f3859j = null;
        this.f3860m = str;
    }

    public static String r0(int i10) {
        if (i10 != 99) {
            if (i10 != 1500) {
                switch (i10) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case 10:
                        return "DEVELOPER_ERROR";
                    case 11:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i10) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            default:
                                StringBuilder sb2 = new StringBuilder(31);
                                sb2.append("UNKNOWN_ERROR_CODE(");
                                sb2.append(i10);
                                sb2.append(")");
                                return sb2.toString();
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.f3858f == bVar.f3858f && h9.m.a(this.f3859j, bVar.f3859j) && h9.m.a(this.f3860m, bVar.f3860m);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3858f), this.f3859j, this.f3860m});
    }

    public boolean p0() {
        return (this.f3858f == 0 || this.f3859j == null) ? false : true;
    }

    public boolean q0() {
        return this.f3858f == 0;
    }

    public String toString() {
        m.a aVar = new m.a(this);
        aVar.a("statusCode", r0(this.f3858f));
        aVar.a("resolution", this.f3859j);
        aVar.a("message", this.f3860m);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f3857c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f3858f;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        k0.q(parcel, 3, this.f3859j, i10, false);
        k0.r(parcel, 4, this.f3860m, false);
        k0.z(parcel, v2);
    }
}
