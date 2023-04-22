package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.savedstate.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f2400e = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f2401a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, a.b> f2402b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Object> f2403c;
    public final a.b d;

    /* loaded from: classes.dex */
    public class a implements a.b {
        public a() {
        }

        @Override // androidx.savedstate.a.b
        public Bundle a() {
            for (Map.Entry entry : new HashMap(v.this.f2402b).entrySet()) {
                Bundle a10 = ((a.b) entry.getValue()).a();
                v vVar = v.this;
                String str = (String) entry.getKey();
                Objects.requireNonNull(vVar);
                if (a10 != null) {
                    for (Class cls : v.f2400e) {
                        if (!cls.isInstance(a10)) {
                        }
                    }
                    StringBuilder m10 = a1.a.m("Can't put value with type ");
                    m10.append(a10.getClass());
                    m10.append(" into saved state");
                    throw new IllegalArgumentException(m10.toString());
                }
                p pVar = (p) vVar.f2403c.get(str);
                if (pVar != null) {
                    pVar.l(a10);
                } else {
                    vVar.f2401a.put(str, a10);
                }
            }
            Set<String> keySet = v.this.f2401a.keySet();
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(keySet.size());
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            for (String str2 : keySet) {
                arrayList.add(str2);
                arrayList2.add(v.this.f2401a.get(str2));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("keys", arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    public v() {
        this.f2402b = new HashMap();
        this.f2403c = new HashMap();
        this.d = new a();
        this.f2401a = new HashMap();
    }

    public v(Map<String, Object> map) {
        this.f2402b = new HashMap();
        this.f2403c = new HashMap();
        this.d = new a();
        this.f2401a = new HashMap(map);
    }
}
