package p8;

import android.text.TextUtils;
import com.appsflyer.oaid.BuildConfig;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p8.q;

/* loaded from: classes.dex */
public abstract class q<T extends q> {
    public static String zza(Object obj) {
        return zzd(obj, 0);
    }

    public static String zzb(Map map) {
        return zzd(map, 1);
    }

    private static String zzd(Object obj, int i10) {
        if (i10 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return BuildConfig.FLAVOR;
        }
        if (obj instanceof String) {
            return TextUtils.isEmpty((String) obj) ? BuildConfig.FLAVOR : obj.toString();
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0 ? BuildConfig.FLAVOR : obj.toString();
        } else if (obj instanceof Long) {
            return ((Long) obj).longValue() == 0 ? BuildConfig.FLAVOR : obj.toString();
        } else if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d ? BuildConfig.FLAVOR : obj.toString();
        } else if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue() ? BuildConfig.FLAVOR : obj.toString();
        } else if (obj instanceof List) {
            StringBuilder sb2 = new StringBuilder();
            if (i10 > 0) {
                sb2.append("[");
            }
            int length = sb2.length();
            for (Object obj2 : (List) obj) {
                if (sb2.length() > length) {
                    sb2.append(", ");
                }
                sb2.append(zzd(obj2, i10 + 1));
            }
            if (i10 > 0) {
                sb2.append("]");
            }
            return sb2.toString();
        } else if (obj instanceof Map) {
            StringBuilder sb3 = new StringBuilder();
            boolean z10 = false;
            int i11 = 0;
            loop1: while (true) {
                for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
                    String zzd = zzd(entry.getValue(), i10 + 1);
                    if (!TextUtils.isEmpty(zzd)) {
                        if (i10 > 0 && !z10) {
                            sb3.append("{");
                            i11 = sb3.length();
                            z10 = true;
                        }
                        if (sb3.length() > i11) {
                            sb3.append(", ");
                        }
                        sb3.append((String) entry.getKey());
                        sb3.append('=');
                        sb3.append(zzd);
                    }
                }
            }
            if (z10) {
                sb3.append("}");
            }
            return sb3.toString();
        } else {
            return obj.toString();
        }
    }

    public abstract void zzc(T t2);
}
