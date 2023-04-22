package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.navigation.v;
import java.util.HashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* loaded from: classes.dex */
public class w {

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap<Class<?>, String> f2732b = new HashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, v<? extends m>> f2733a = new HashMap<>();

    public static String b(Class<? extends v> cls) {
        HashMap<Class<?>, String> hashMap = f2732b;
        String str = hashMap.get(cls);
        if (str == null) {
            v.b bVar = (v.b) cls.getAnnotation(v.b.class);
            str = bVar != null ? bVar.value() : null;
            if (!d(str)) {
                StringBuilder m10 = a1.a.m("No @Navigator.Name annotation found for ");
                m10.append(cls.getSimpleName());
                throw new IllegalArgumentException(m10.toString());
            }
            hashMap.put(cls, str);
        }
        return str;
    }

    public static boolean d(String str) {
        return (str == null || str.isEmpty()) ? false : true;
    }

    public final v<? extends m> a(v<? extends m> vVar) {
        String b10 = b(vVar.getClass());
        if (d(b10)) {
            return this.f2733a.put(b10, vVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends v<?>> T c(String str) {
        if (d(str)) {
            v<? extends m> vVar = this.f2733a.get(str);
            if (vVar != null) {
                return vVar;
            }
            throw new IllegalStateException(android.support.v4.media.b.j("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
