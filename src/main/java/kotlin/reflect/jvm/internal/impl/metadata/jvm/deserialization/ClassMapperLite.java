package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import a0.a;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class ClassMapperLite {
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin  reason: collision with root package name */
    private static final String f12096kotlin = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Character[]{'k', 'o', 't', 'l', 'i', 'n'}), BuildConfig.FLAVOR, null, null, 0, null, null, 62, null);
    private static final Map<String, String> map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listOf = CollectionsKt.listOf((Object[]) new String[]{"Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D"});
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, listOf.size() - 1, 2);
        if (progressionLastElement >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 2;
                StringBuilder sb2 = new StringBuilder();
                String str = f12096kotlin;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listOf.get(i10));
                int i12 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listOf.get(i12));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(b.m(sb3, (String) listOf.get(i10), "Array"), Intrinsics.stringPlus("[", listOf.get(i12)));
                if (i10 == progressionLastElement) {
                    break;
                }
                i10 = i11;
            }
        }
        linkedHashMap.put(Intrinsics.stringPlus(f12096kotlin, "/Unit"), "V");
        m1276map$lambda0$add(linkedHashMap, "Any", "java/lang/Object");
        m1276map$lambda0$add(linkedHashMap, "Nothing", "java/lang/Void");
        m1276map$lambda0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.listOf((Object[]) new String[]{"String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum"})) {
            m1276map$lambda0$add(linkedHashMap, str2, Intrinsics.stringPlus("java/lang/", str2));
        }
        for (String str3 : CollectionsKt.listOf((Object[]) new String[]{"Iterator", "Collection", "List", "Set", "Map", "ListIterator"})) {
            m1276map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/", str3), Intrinsics.stringPlus("java/util/", str3));
            m1276map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("collections/Mutable", str3), Intrinsics.stringPlus("java/util/", str3));
        }
        m1276map$lambda0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        m1276map$lambda0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        m1276map$lambda0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        m1276map$lambda0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i13 = 0; i13 < 23; i13++) {
            String stringPlus = Intrinsics.stringPlus("Function", Integer.valueOf(i13));
            StringBuilder sb4 = new StringBuilder();
            String str4 = f12096kotlin;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i13);
            m1276map$lambda0$add(linkedHashMap, stringPlus, sb4.toString());
            m1276map$lambda0$add(linkedHashMap, Intrinsics.stringPlus("reflect/KFunction", Integer.valueOf(i13)), Intrinsics.stringPlus(str4, "/reflect/KFunction"));
        }
        for (String str5 : CollectionsKt.listOf((Object[]) new String[]{"Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum"})) {
            m1276map$lambda0$add(linkedHashMap, Intrinsics.stringPlus(str5, ".Companion"), f12096kotlin + "/jvm/internal/" + str5 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    /* renamed from: map$lambda-0$add  reason: not valid java name */
    private static final void m1276map$lambda0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f12096kotlin + '/' + str, 'L' + str2 + ';');
    }

    @JvmStatic
    public static final String mapClass(String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = map.get(classId);
        return str == null ? b.l(a.m('L'), StringsKt.replace$default(classId, '.', (char) Typography.dollar, false, 4, (Object) null), ';') : str;
    }
}
