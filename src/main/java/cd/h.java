package cd;

import android.R;
import android.content.Context;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Integer> f4073a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<String> f4074b = new SparseArray<>();

    /* loaded from: classes.dex */
    public static class a extends h {

        /* renamed from: c  reason: collision with root package name */
        public final String f4075c;

        public a(String str, Context context) {
            super(context);
            this.f4075c = str;
            this.f4073a.clear();
            this.f4074b.clear();
            h.a(R.id.class, "android", this.f4073a);
            String str2 = str + ".R$id";
            try {
                h.a(Class.forName(str2), null, this.f4073a);
            } catch (ClassNotFoundException unused) {
                cb.e.j0("MixpanelAPI.RsrcReader", "Can't load names for Android view ids from '" + str2 + "', ids by name will not be available in the events editor.");
                cb.e.O("MixpanelAPI.RsrcReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
            }
            for (Map.Entry<String, Integer> entry : this.f4073a.entrySet()) {
                this.f4074b.put(entry.getValue().intValue(), entry.getKey());
            }
        }
    }

    public h(Context context) {
    }

    public static void a(Class<?> cls, String str, Map<String, Integer> map) {
        Field[] fields;
        try {
            for (Field field : cls.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && field.getType() == Integer.TYPE) {
                    try {
                        String name = field.getName();
                        int i10 = field.getInt(null);
                        if (str != null) {
                            name = str + ":" + name;
                        }
                        map.put(name, Integer.valueOf(i10));
                    } catch (ArrayIndexOutOfBoundsException e10) {
                        cb.e.D("MixpanelAPI.RsrcReader", "Can't read built-in id name from " + cls.getName(), e10);
                    }
                }
            }
        } catch (IllegalAccessException e11) {
            StringBuilder m10 = a1.a.m("Can't read built-in id names from ");
            m10.append(cls.getName());
            cb.e.D("MixpanelAPI.RsrcReader", m10.toString(), e11);
        }
    }
}
