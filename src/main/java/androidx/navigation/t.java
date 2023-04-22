package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class t<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final t<Integer> f2717b = new c(false);

    /* renamed from: c  reason: collision with root package name */
    public static final t<Integer> f2718c = new d(false);
    public static final t<int[]> d = new e(true);

    /* renamed from: e  reason: collision with root package name */
    public static final t<Long> f2719e = new f(false);

    /* renamed from: f  reason: collision with root package name */
    public static final t<long[]> f2720f = new g(true);

    /* renamed from: g  reason: collision with root package name */
    public static final t<Float> f2721g = new h(false);

    /* renamed from: h  reason: collision with root package name */
    public static final t<float[]> f2722h = new i(true);

    /* renamed from: i  reason: collision with root package name */
    public static final t<Boolean> f2723i = new j(false);

    /* renamed from: j  reason: collision with root package name */
    public static final t<boolean[]> f2724j = new k(true);

    /* renamed from: k  reason: collision with root package name */
    public static final t<String> f2725k = new a(true);

    /* renamed from: l  reason: collision with root package name */
    public static final t<String[]> f2726l = new b(true);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2727a;

    /* loaded from: classes.dex */
    public class a extends t<String> {
        public a(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public String a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "string";
        }

        @Override // androidx.navigation.t
        public String c(String str) {
            return str;
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* loaded from: classes.dex */
    public class b extends t<String[]> {
        public b(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public String[] a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "string[]";
        }

        @Override // androidx.navigation.t
        public String[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* loaded from: classes.dex */
    public class c extends t<Integer> {
        public c(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "integer";
        }

        @Override // androidx.navigation.t
        public Integer c(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class d extends t<Integer> {
        public d(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public Integer a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "reference";
        }

        @Override // androidx.navigation.t
        public Integer c(String str) {
            return str.startsWith("0x") ? Integer.valueOf(Integer.parseInt(str.substring(2), 16)) : Integer.valueOf(Integer.parseInt(str));
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class e extends t<int[]> {
        public e(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public int[] a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "integer[]";
        }

        @Override // androidx.navigation.t
        public int[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    public class f extends t<Long> {
        public f(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public Long a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "long";
        }

        @Override // androidx.navigation.t
        public Long c(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return str.startsWith("0x") ? Long.valueOf(Long.parseLong(str.substring(2), 16)) : Long.valueOf(Long.parseLong(str));
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Long l10) {
            bundle.putLong(str, l10.longValue());
        }
    }

    /* loaded from: classes.dex */
    public class g extends t<long[]> {
        public g(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public long[] a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "long[]";
        }

        @Override // androidx.navigation.t
        public long[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    public class h extends t<Float> {
        public h(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public Float a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "float";
        }

        @Override // androidx.navigation.t
        public Float c(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Float f10) {
            bundle.putFloat(str, f10.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class i extends t<float[]> {
        public i(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public float[] a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "float[]";
        }

        @Override // androidx.navigation.t
        public float[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    public class j extends t<Boolean> {
        public j(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public Boolean a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "boolean";
        }

        @Override // androidx.navigation.t
        public Boolean c(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equals(str)) {
                return Boolean.FALSE;
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class k extends t<boolean[]> {
        public k(boolean z10) {
            super(z10);
        }

        @Override // androidx.navigation.t
        public boolean[] a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return "boolean[]";
        }

        @Override // androidx.navigation.t
        public boolean[] c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<D extends Enum> extends p<D> {
        public final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.t.p, androidx.navigation.t
        public String b() {
            return this.n.getName();
        }

        @Override // androidx.navigation.t.p
        /* renamed from: f */
        public D e(String str) {
            D[] enumConstants;
            for (D d : this.n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            StringBuilder p10 = a1.a.p("Enum value ", str, " not found for type ");
            p10.append(this.n.getName());
            p10.append(".");
            throw new IllegalArgumentException(p10.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends t<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f2728m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.f2728m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.f2728m.getName();
        }

        @Override // androidx.navigation.t
        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            this.f2728m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && m.class == obj.getClass()) {
                return this.f2728m.equals(((m) obj).f2728m);
            }
            return false;
        }

        public int hashCode() {
            return this.f2728m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D> extends t<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f2729m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f2729m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.t
        public D a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.f2729m.getName();
        }

        @Override // androidx.navigation.t
        public D c(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, D d) {
            this.f2729m.cast(d);
            if (d != null && !(d instanceof Parcelable)) {
                if (d instanceof Serializable) {
                    bundle.putSerializable(str, (Serializable) d);
                    return;
                }
            }
            bundle.putParcelable(str, (Parcelable) d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || n.class != obj.getClass()) {
                return false;
            }
            return this.f2729m.equals(((n) obj).f2729m);
        }

        public int hashCode() {
            return this.f2729m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends t<D[]> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D[]> f2730m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.f2730m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.f2730m.getName();
        }

        @Override // androidx.navigation.t
        public Object c(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Object obj) {
            ?? r72 = (Serializable[]) obj;
            this.f2730m.cast(r72);
            bundle.putSerializable(str, r72);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && o.class == obj.getClass()) {
                return this.f2730m.equals(((o) obj).f2730m);
            }
            return false;
        }

        public int hashCode() {
            return this.f2730m.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends t<D> {

        /* renamed from: m  reason: collision with root package name */
        public final Class<D> f2731m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.f2731m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        public p(boolean z10, Class<D> cls) {
            super(z10);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f2731m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.t
        public Object a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // androidx.navigation.t
        public String b() {
            return this.f2731m.getName();
        }

        @Override // androidx.navigation.t
        public void d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            this.f2731m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // androidx.navigation.t
        /* renamed from: e */
        public D c(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.f2731m.equals(((p) obj).f2731m);
            }
            return false;
        }

        public int hashCode() {
            return this.f2731m.hashCode();
        }
    }

    public t(boolean z10) {
        this.f2727a = z10;
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public abstract T c(String str);

    public abstract void d(Bundle bundle, String str, T t2);

    public String toString() {
        return b();
    }
}
