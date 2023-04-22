package w9;

import android.util.Log;

/* loaded from: classes2.dex */
public final class q4 extends v4 {
    public q4(t4 t4Var, String str, Boolean bool) {
        super(t4Var, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w9.v4
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (d4.f17103b.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (d4.f17104c.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String c10 = c();
        String str = (String) obj;
        StringBuilder sb2 = new StringBuilder(str.length() + String.valueOf(c10).length() + 28);
        sb2.append("Invalid boolean value for ");
        sb2.append(c10);
        sb2.append(": ");
        sb2.append(str);
        Log.e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
