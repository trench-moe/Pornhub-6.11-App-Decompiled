package com.google.android.gms.internal.measurement;

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
import w9.b6;
import w9.p7;
import w9.s5;
import w9.s6;
import w9.u5;

/* loaded from: classes.dex */
public final class g {
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
                zzix zzixVar = zzix.f7071c;
                sb2.append(m9.a.I(new zziv(((String) obj).getBytes(b6.f17081a))));
                sb2.append(Typography.quote);
            } else if (obj instanceof zzix) {
                sb2.append(": \"");
                sb2.append(m9.a.I((zzix) obj));
                sb2.append(Typography.quote);
            } else if (obj instanceof u5) {
                sb2.append(" {");
                c((u5) obj, sb2, i10 + 2);
                sb2.append("\n");
                while (i11 < i10) {
                    sb2.append(' ');
                    i11++;
                }
                sb2.append("}");
            } else if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
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

    public static void c(s6 s6Var, StringBuilder sb2, int i10) {
        Method[] declaredMethods;
        boolean equals;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet treeSet = new TreeSet();
        for (Method method : s6Var.getClass().getDeclaredMethods()) {
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
                    a(sb2, i10, b(concat), u5.j(method2, s6Var, new Object[0]));
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                String valueOf3 = String.valueOf(substring.substring(0, 1).toLowerCase());
                String valueOf4 = String.valueOf(substring.substring(1, substring.length() - 3));
                String concat2 = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
                Method method3 = (Method) hashMap.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i10, b(concat2), u5.j(method3, s6Var, new Object[0]));
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
                    Object j10 = u5.j(method4, s6Var, new Object[0]);
                    if (method5 == null) {
                        if (j10 instanceof Boolean) {
                            if (((Boolean) j10).booleanValue()) {
                                a(sb2, i10, b(concat3), j10);
                            }
                        } else if (j10 instanceof Integer) {
                            if (((Integer) j10).intValue() != 0) {
                                a(sb2, i10, b(concat3), j10);
                            }
                        } else if (j10 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) j10).floatValue()) != 0) {
                                a(sb2, i10, b(concat3), j10);
                            }
                        } else if (!(j10 instanceof Double)) {
                            if (j10 instanceof String) {
                                equals = j10.equals(BuildConfig.FLAVOR);
                            } else if (j10 instanceof zzix) {
                                equals = j10.equals(zzix.f7071c);
                            } else if (!(j10 instanceof s6)) {
                                if ((j10 instanceof Enum) && ((Enum) j10).ordinal() == 0) {
                                }
                                a(sb2, i10, b(concat3), j10);
                            } else if (j10 != ((s6) j10).d()) {
                                a(sb2, i10, b(concat3), j10);
                            }
                            if (!equals) {
                                a(sb2, i10, b(concat3), j10);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) j10).doubleValue()) != 0) {
                            a(sb2, i10, b(concat3), j10);
                        }
                    } else if (((Boolean) u5.j(method5, s6Var, new Object[0])).booleanValue()) {
                        a(sb2, i10, b(concat3), j10);
                    }
                }
            }
        }
        if (s6Var instanceof s5) {
            s5 s5Var = (s5) s6Var;
            throw null;
        }
        p7 p7Var = ((u5) s6Var).zzc;
        if (p7Var != null) {
            for (int i11 = 0; i11 < p7Var.f17277a; i11++) {
                a(sb2, i10, String.valueOf(p7Var.f17278b[i11] >>> 3), p7Var.f17279c[i11]);
            }
        }
    }
}
