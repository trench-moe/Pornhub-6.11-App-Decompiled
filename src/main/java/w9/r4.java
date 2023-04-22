package w9;

import android.util.Log;

/* loaded from: classes2.dex */
public final class r4 extends v4 {
    public r4(t4 t4Var, Double d) {
        super(t4Var, "measurement.test.double_flag", d);
    }

    @Override // w9.v4
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(c10).length() + 27);
            sb2.append("Invalid double value for ");
            sb2.append(c10);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
