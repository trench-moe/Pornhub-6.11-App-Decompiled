package w9;

import android.util.Log;

/* loaded from: classes2.dex */
public final class p4 extends v4 {
    public p4(t4 t4Var, String str, Long l10) {
        super(t4Var, str, l10);
    }

    @Override // w9.v4
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String c10 = c();
            String str = (String) obj;
            StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(c10).length() + 25);
            sb2.append("Invalid long value for ");
            sb2.append(c10);
            sb2.append(": ");
            sb2.append(str);
            Log.e("PhenotypeFlag", sb2.toString());
            return null;
        }
    }
}
