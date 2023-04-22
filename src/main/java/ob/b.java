package ob;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import ob.a;
import pb.e;

/* loaded from: classes2.dex */
public class b implements ob.a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile ob.a f13630c;

    /* renamed from: a  reason: collision with root package name */
    public final AppMeasurementSdk f13631a;

    /* renamed from: b  reason: collision with root package name */
    public final Map f13632b;

    /* loaded from: classes2.dex */
    public class a implements a.InterfaceC0240a {
        public a(b bVar, String str) {
        }
    }

    public b(AppMeasurementSdk appMeasurementSdk) {
        Objects.requireNonNull(appMeasurementSdk, "null reference");
        this.f13631a = appMeasurementSdk;
        this.f13632b = new ConcurrentHashMap();
    }

    @Override // ob.a
    public a.InterfaceC0240a a(String str, a.b bVar) {
        Object eVar;
        Objects.requireNonNull(bVar, "null reference");
        if (pb.a.a(str)) {
            if ((str.isEmpty() || !this.f13632b.containsKey(str) || this.f13632b.get(str) == null) ? false : true) {
                return null;
            }
            AppMeasurementSdk appMeasurementSdk = this.f13631a;
            if (AppMeasurement.FIAM_ORIGIN.equals(str)) {
                eVar = new pb.c(appMeasurementSdk, bVar);
            } else {
                if (!AppMeasurement.CRASH_ORIGIN.equals(str) && !"clx".equals(str)) {
                    eVar = null;
                }
                eVar = new e(appMeasurementSdk, bVar);
            }
            if (eVar != null) {
                this.f13632b.put(str, eVar);
                return new a(this, str);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00de  */
    @Override // ob.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(java.lang.String r9, java.lang.String r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ob.b.b(java.lang.String, java.lang.String, android.os.Bundle):void");
    }
}
