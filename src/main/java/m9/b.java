package m9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import l9.g;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f13032a;

    public b(Context context) {
        this.f13032a = context;
    }

    public ApplicationInfo a(String str, int i10) {
        return this.f13032a.getPackageManager().getApplicationInfo(str, i10);
    }

    public PackageInfo b(String str, int i10) {
        return this.f13032a.getPackageManager().getPackageInfo(str, i10);
    }

    public boolean c() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return a.z(this.f13032a);
        }
        if (!g.a() || (nameForUid = this.f13032a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f13032a.getPackageManager().isInstantApp(nameForUid);
    }
}
