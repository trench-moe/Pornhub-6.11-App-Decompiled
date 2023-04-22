package com.google.android.gms.internal.cast;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.text.Typography;
import t9.j2;
import t9.t1;

/* loaded from: classes.dex */
public final class n1 {
    public static final void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb2, i10, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb2, i10, str, entry);
            }
        } else {
            sb2.append('\n');
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                sb2.append(' ');
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                zzoe zzoeVar = zzoe.f6957c;
                sb2.append(o9.b.c(new zzoc(((String) obj).getBytes(t1.f15353a))));
                sb2.append(Typography.quote);
            } else if (obj instanceof zzoe) {
                sb2.append(": \"");
                sb2.append(o9.b.c((zzoe) obj));
                sb2.append(Typography.quote);
            } else if (obj instanceof l1) {
                sb2.append(" {");
                c((l1) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj.toString());
            } else {
                sb2.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i13 = i10 + 2;
                a(sb2, i13, "key", entry2.getKey());
                a(sb2, i13, AppMeasurementSdk.ConditionalUserProperty.VALUE, entry2.getValue());
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            }
        }
    }

    public static final String b(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    public static void c(j2 j2Var, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : j2Var.getClass().getDeclaredMethods()) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String substring = str.startsWith("get") ? str.substring(3) : str;
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                String valueOf = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf2 = String.valueOf(substring.substring(1, substring.length() - 4));
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                Method method2 = (Method) hashMap.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i10, b(concat), l1.l(method2, j2Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i10, b(concat2), l1.l(method3, j2Var, new Object[0]));
                }
            }
            if (((Method) hashMap2.get(substring.length() != 0 ? "set".concat(substring) : new String("set"))) != null) {
                if (substring.endsWith("Bytes")) {
                    String valueOf5 = String.valueOf(substring.substring(0, substring.length() - 5));
                    if (!hashMap.containsKey(valueOf5.length() != 0 ? "get".concat(valueOf5) : new String("get"))) {
                    }
                }
                String valueOf6 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf7 = String.valueOf(substring.substring(1));
                String concat3 = valueOf7.length() != 0 ? valueOf6.concat(valueOf7) : new String(valueOf6);
                Method method4 = (Method) hashMap.get(substring.length() != 0 ? "get".concat(substring) : new String("get"));
                Method method5 = (Method) hashMap.get(substring.length() != 0 ? "has".concat(substring) : new String("has"));
                if (method4 != null) {
                    Object l10 = l1.l(method4, j2Var, new Object[0]);
                    if (method5 == null) {
                        if (l10 instanceof Boolean) {
                            if (((Boolean) l10).booleanValue()) {
                                a(sb2, i10, b(concat3), l10);
                            }
                        } else if (l10 instanceof Integer) {
                            if (((Integer) l10).intValue() != 0) {
                                a(sb2, i10, b(concat3), l10);
                            }
                        } else if (l10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) l10).floatValue()) != 0) {
                                a(sb2, i10, b(concat3), l10);
                            }
                        } else if (!(l10 instanceof Double)) {
                            if (l10 instanceof String) {
                                equals = l10.equals(BuildConfig.FLAVOR);
                            } else if (l10 instanceof zzoe) {
                                equals = l10.equals(zzoe.f6957c);
                            } else if (!(l10 instanceof j2)) {
                                if ((l10 instanceof Enum) && ((Enum) l10).ordinal() == 0) {
                                }
                                a(sb2, i10, b(concat3), l10);
                            } else if (l10 != ((j2) l10).k()) {
                                a(sb2, i10, b(concat3), l10);
                            }
                            if (!equals) {
                                a(sb2, i10, b(concat3), l10);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) l10).doubleValue()) != 0) {
                            a(sb2, i10, b(concat3), l10);
                        }
                    } else if (((Boolean) l1.l(method5, j2Var, new Object[0])).booleanValue()) {
                        a(sb2, i10, b(concat3), l10);
                    }
                }
            }
        }
        if (j2Var instanceof t9.k1) {
            t9.k1 k1Var = (t9.k1) j2Var;
            throw null;
        }
        l1 l1Var = (l1) j2Var;
    }
}
