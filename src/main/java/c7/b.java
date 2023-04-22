package c7;

import android.util.Log;

/* loaded from: classes.dex */
public final class b {
    public static void a(long j10, k8.t tVar, w[] wVarArr) {
        while (true) {
            if (tVar.a() <= 1) {
                return;
            }
            int c10 = c(tVar);
            int c11 = c(tVar);
            int i10 = tVar.f12010b + c11;
            if (c11 != -1 && c11 <= tVar.a()) {
                if (c10 == 4 && c11 >= 8) {
                    int s10 = tVar.s();
                    int x10 = tVar.x();
                    int f10 = x10 == 49 ? tVar.f() : 0;
                    int s11 = tVar.s();
                    if (x10 == 47) {
                        tVar.E(1);
                    }
                    boolean z10 = s10 == 181 && (x10 == 49 || x10 == 47) && s11 == 3;
                    if (x10 == 49) {
                        z10 &= f10 == 1195456820;
                    }
                    if (z10) {
                        b(j10, tVar, wVarArr);
                        tVar.D(i10);
                    }
                }
                tVar.D(i10);
            }
            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
            i10 = tVar.f12011c;
            tVar.D(i10);
        }
    }

    public static void b(long j10, k8.t tVar, w[] wVarArr) {
        int s10 = tVar.s();
        if ((s10 & 64) != 0) {
            tVar.E(1);
            int i10 = (s10 & 31) * 3;
            int i11 = tVar.f12010b;
            for (w wVar : wVarArr) {
                tVar.D(i11);
                wVar.a(tVar, i10);
                wVar.b(j10, 1, i10, 0, null);
            }
        }
    }

    public static int c(k8.t tVar) {
        int i10 = 0;
        while (tVar.a() != 0) {
            int s10 = tVar.s();
            i10 += s10;
            if (s10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
