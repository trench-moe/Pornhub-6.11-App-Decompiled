package com.google.android.gms.measurement.internal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import w9.j2;
import w9.o2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzx {
    public final String zzb;
    public final int zzc;
    public Boolean zzd;
    public Boolean zze;
    public Long zzf;
    public Long zzg;

    public zzx(String str, int i10) {
        this.zzb = str;
        this.zzc = i10;
    }

    private static Boolean zzd(String str, int i10, boolean z10, String str2, List list, String str3, zzeh zzehVar) {
        if (i10 == 7) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z10 && i10 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i10 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, true != z10 ? 66 : 0).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (zzehVar != null) {
                        zzehVar.zzk().zzb("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean zze(BigDecimal bigDecimal, j2 j2Var, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        Objects.requireNonNull(j2Var, "null reference");
        if (j2Var.y()) {
            boolean z10 = true;
            if (j2Var.D() != 1) {
                if (j2Var.D() == 5) {
                    if (!j2Var.C() || !j2Var.B()) {
                        return null;
                    }
                } else if (!j2Var.z()) {
                    return null;
                }
                int D = j2Var.D();
                if (j2Var.D() == 5) {
                    if (zzkr.zzx(j2Var.w())) {
                        if (!zzkr.zzx(j2Var.v())) {
                            return null;
                        }
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j2Var.w());
                            bigDecimal4 = new BigDecimal(j2Var.v());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                } else if (!zzkr.zzx(j2Var.u())) {
                    return null;
                } else {
                    try {
                        bigDecimal2 = new BigDecimal(j2Var.u());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (D == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i10 = D - 1;
                if (i10 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                } else if (i10 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                } else if (i10 != 3) {
                    if (i10 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf((bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) ? false : false);
                    }
                    return null;
                } else if (bigDecimal2 == null) {
                    return null;
                } else {
                    if (d == 0.0d) {
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                    if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) >= 0) {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
            }
            return null;
        }
        return null;
    }

    public static Boolean zzf(String str, o2 o2Var, zzeh zzehVar) {
        List list;
        Objects.requireNonNull(o2Var, "null reference");
        if (str != null && o2Var.A() && o2Var.B() != 1) {
            if (o2Var.B() == 7) {
                if (o2Var.s() == 0) {
                    return null;
                }
            } else if (!o2Var.z()) {
                return null;
            }
            int B = o2Var.B();
            boolean x10 = o2Var.x();
            String v2 = (x10 || B == 2 || B == 7) ? o2Var.v() : o2Var.v().toUpperCase(Locale.ENGLISH);
            if (o2Var.s() == 0) {
                list = null;
            } else {
                List<String> w10 = o2Var.w();
                if (!x10) {
                    ArrayList arrayList = new ArrayList(w10.size());
                    for (String str2 : w10) {
                        arrayList.add(str2.toUpperCase(Locale.ENGLISH));
                    }
                    w10 = Collections.unmodifiableList(arrayList);
                }
                list = w10;
            }
            return zzd(str, B, x10, v2, list, B == 2 ? v2 : null, zzehVar);
        }
        return null;
    }

    public static Boolean zzg(double d, j2 j2Var) {
        try {
            return zze(new BigDecimal(d), j2Var, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzh(long j10, j2 j2Var) {
        try {
            return zze(new BigDecimal(j10), j2Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean zzi(String str, j2 j2Var) {
        if (zzkr.zzx(str)) {
            try {
                return zze(new BigDecimal(str), j2Var, 0.0d);
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return null;
    }

    public static Boolean zzj(Boolean bool, boolean z10) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z10);
    }

    public abstract int zza();

    public abstract boolean zzb();

    public abstract boolean zzc();
}
