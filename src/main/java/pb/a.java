package pb;

import com.google.android.gms.measurement.internal.zzgq;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f13886a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b  reason: collision with root package name */
    public static final List f13887b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c  reason: collision with root package name */
    public static final List f13888c = Arrays.asList("auto", "app", "am");
    public static final List d = Arrays.asList("_r", "_dbg");

    /* renamed from: e  reason: collision with root package name */
    public static final List f13889e;

    /* renamed from: f  reason: collision with root package name */
    public static final List f13890f;

    static {
        String[][] strArr = {zzgq.zza, zzgq.zzb};
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            i10 += strArr[i11].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i10);
        int length = strArr[0].length;
        for (int i12 = 1; i12 < 2; i12++) {
            String[] strArr2 = strArr[i12];
            int length2 = strArr2.length;
            System.arraycopy(strArr2, 0, copyOf, length, length2);
            length += length2;
        }
        f13889e = Arrays.asList((String[]) copyOf);
        f13890f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str) {
        return !f13888c.contains(str);
    }
}
