package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import h9.m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import o9.f;
import o9.g;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f6874e = null;

    /* renamed from: f  reason: collision with root package name */
    public static String f6875f = null;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f6876g = false;

    /* renamed from: h  reason: collision with root package name */
    public static int f6877h = -1;

    /* renamed from: l  reason: collision with root package name */
    public static f f6881l;

    /* renamed from: m  reason: collision with root package name */
    public static g f6882m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6883a;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal<o9.e> f6878i = new ThreadLocal<>();

    /* renamed from: j  reason: collision with root package name */
    public static final ThreadLocal<Long> f6879j = new o9.d();

    /* renamed from: k  reason: collision with root package name */
    public static final a.InterfaceC0087a f6880k = new com.google.android.gms.dynamite.a();

    /* renamed from: b  reason: collision with root package name */
    public static final a f6872b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f6873c = new c();
    public static final a d = new d();

    @DynamiteApi
    /* loaded from: classes.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* loaded from: classes.dex */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th) {
            super(str, th);
        }
    }

    /* loaded from: classes.dex */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0087a {
            int a(Context context, String str, boolean z10);

            int b(Context context, String str);
        }

        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public int f6884a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f6885b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f6886c = 0;
        }

        b a(Context context, String str, InterfaceC0087a interfaceC0087a);
    }

    public DynamiteModule(Context context) {
        Objects.requireNonNull(context, "null reference");
        this.f6883a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (m.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e10) {
            String valueOf2 = String.valueOf(e10.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, a aVar, String str) {
        Boolean bool;
        n9.a d12;
        DynamiteModule dynamiteModule;
        g gVar;
        Boolean valueOf;
        n9.a d13;
        ThreadLocal<o9.e> threadLocal = f6878i;
        o9.e eVar = threadLocal.get();
        o9.e eVar2 = new o9.e(null);
        threadLocal.set(eVar2);
        ThreadLocal<Long> threadLocal2 = f6879j;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            a.b a10 = aVar.a(context, str, f6880k);
            int i10 = a10.f6884a;
            int i11 = a10.f6885b;
            StringBuilder sb2 = new StringBuilder(str.length() + 68 + str.length());
            sb2.append("Considering local module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i10);
            sb2.append(" and remote module ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i11);
            Log.i("DynamiteModule", sb2.toString());
            int i12 = a10.f6886c;
            if (i12 != 0) {
                if (i12 == -1) {
                    if (a10.f6884a != 0) {
                        i12 = -1;
                    }
                }
                if (i12 != 1 || a10.f6885b != 0) {
                    if (i12 == -1) {
                        DynamiteModule f10 = f(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = eVar2.f13628a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(eVar);
                        return f10;
                    } else if (i12 != 1) {
                        StringBuilder sb3 = new StringBuilder(47);
                        sb3.append("VersionPolicy returned invalid code:");
                        sb3.append(i12);
                        throw new LoadingException(sb3.toString());
                    } else {
                        try {
                            int i13 = a10.f6885b;
                            try {
                                synchronized (DynamiteModule.class) {
                                    bool = f6874e;
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        StringBuilder sb4 = new StringBuilder(str.length() + 51);
                                        sb4.append("Selected remote version of ");
                                        sb4.append(str);
                                        sb4.append(", version >= ");
                                        sb4.append(i13);
                                        Log.i("DynamiteModule", sb4.toString());
                                        synchronized (DynamiteModule.class) {
                                            gVar = f6882m;
                                        }
                                        if (gVar == null) {
                                            throw new LoadingException("DynamiteLoaderV2 was not cached.");
                                        }
                                        o9.e eVar3 = threadLocal.get();
                                        if (eVar3 == null || eVar3.f13628a == null) {
                                            throw new LoadingException("No result cursor");
                                        }
                                        Context applicationContext = context.getApplicationContext();
                                        Cursor cursor2 = eVar3.f13628a;
                                        new n9.b(null);
                                        synchronized (DynamiteModule.class) {
                                            valueOf = Boolean.valueOf(f6877h >= 2);
                                        }
                                        if (valueOf.booleanValue()) {
                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                            d13 = gVar.e1(new n9.b(applicationContext), str, i13, new n9.b(cursor2));
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                            d13 = gVar.d1(new n9.b(applicationContext), str, i13, new n9.b(cursor2));
                                        }
                                        Context context2 = (Context) n9.b.c1(d13);
                                        if (context2 == null) {
                                            throw new LoadingException("Failed to get module context");
                                        }
                                        dynamiteModule = new DynamiteModule(context2);
                                    } else {
                                        StringBuilder sb5 = new StringBuilder(str.length() + 51);
                                        sb5.append("Selected remote version of ");
                                        sb5.append(str);
                                        sb5.append(", version >= ");
                                        sb5.append(i13);
                                        Log.i("DynamiteModule", sb5.toString());
                                        f i14 = i(context);
                                        if (i14 == null) {
                                            throw new LoadingException("Failed to create IDynamiteLoader.");
                                        }
                                        Parcel a12 = i14.a1(6, i14.b1());
                                        int readInt = a12.readInt();
                                        a12.recycle();
                                        if (readInt >= 3) {
                                            o9.e eVar4 = threadLocal.get();
                                            if (eVar4 == null) {
                                                throw new LoadingException("No cached result cursor holder");
                                            }
                                            d12 = i14.e1(new n9.b(context), str, i13, new n9.b(eVar4.f13628a));
                                        } else if (readInt == 2) {
                                            Log.w("DynamiteModule", "IDynamite loader version = 2");
                                            d12 = i14.f1(new n9.b(context), str, i13);
                                        } else {
                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                            d12 = i14.d1(new n9.b(context), str, i13);
                                        }
                                        if (n9.b.c1(d12) == null) {
                                            throw new LoadingException("Failed to load remote module.");
                                        }
                                        dynamiteModule = new DynamiteModule((Context) n9.b.c1(d12));
                                    }
                                    if (longValue == 0) {
                                        threadLocal2.remove();
                                    } else {
                                        threadLocal2.set(Long.valueOf(longValue));
                                    }
                                    Cursor cursor3 = eVar2.f13628a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(eVar);
                                    return dynamiteModule;
                                }
                                throw new LoadingException("Failed to determine which loading route to use.");
                            } catch (RemoteException e10) {
                                throw new LoadingException("Failed to load remote module.", e10);
                            } catch (LoadingException e11) {
                                throw e11;
                            } catch (Throwable th) {
                                try {
                                    Objects.requireNonNull(context, "null reference");
                                } catch (Exception e12) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e12);
                                }
                                throw new LoadingException("Failed to load remote module.", th);
                            }
                        } catch (LoadingException e13) {
                            String valueOf2 = String.valueOf(e13.getMessage());
                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                            int i15 = a10.f6884a;
                            if (i15 == 0 || aVar.a(context, str, new e(i15)).f6886c != -1) {
                                throw new LoadingException("Remote load failed. No local fallback found.", e13);
                            }
                            DynamiteModule f11 = f(context, str);
                            if (longValue == 0) {
                                f6879j.remove();
                            } else {
                                f6879j.set(Long.valueOf(longValue));
                            }
                            Cursor cursor4 = eVar2.f13628a;
                            if (cursor4 != null) {
                                cursor4.close();
                            }
                            f6878i.set(eVar);
                            return f11;
                        }
                    }
                }
            }
            int i16 = a10.f6884a;
            int i17 = a10.f6885b;
            StringBuilder sb6 = new StringBuilder(str.length() + 92);
            sb6.append("No acceptable module ");
            sb6.append(str);
            sb6.append(" found. Local version is ");
            sb6.append(i16);
            sb6.append(" and remote version is ");
            sb6.append(i17);
            sb6.append(".");
            throw new LoadingException(sb6.toString());
        } catch (Throwable th2) {
            if (longValue == 0) {
                f6879j.remove();
            } else {
                f6879j.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = eVar2.f13628a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f6878i.set(eVar);
            throw th2;
        }
    }

    /* JADX WARN: Finally extract failed */
    public static int d(Context context, String str, boolean z10) {
        Field declaredField;
        Throwable th;
        Cursor cursor;
        RemoteException e10;
        int readInt;
        int readInt2;
        Cursor cursor2;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f6874e;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e11) {
                        String obj = e11.toString();
                        StringBuilder sb2 = new StringBuilder(obj.length() + 30);
                        sb2.append("Failed to load module via V2: ");
                        sb2.append(obj);
                        Log.w("DynamiteModule", sb2.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == null) {
                            if (!f6876g) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e12 = e(context, str, z10);
                                        String str2 = f6875f;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader b10 = o9.b.b();
                                            if (b10 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f6875f;
                                                    Objects.requireNonNull(str3, "null reference");
                                                    b10 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f6875f;
                                                    Objects.requireNonNull(str4, "null reference");
                                                    b10 = new o9.c(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(b10);
                                            declaredField.set(null, b10);
                                            f6874e = bool2;
                                            return e12;
                                        }
                                        return e12;
                                    } catch (LoadingException unused) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                            bool = Boolean.FALSE;
                        } else if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else {
                            try {
                                g(classLoader);
                            } catch (LoadingException unused2) {
                            }
                            bool = Boolean.TRUE;
                        }
                        f6874e = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z10);
                    } catch (LoadingException e13) {
                        String valueOf = String.valueOf(e13.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                f i10 = i(context);
                try {
                    if (i10 == null) {
                        return 0;
                    }
                    try {
                        Parcel a12 = i10.a1(6, i10.b1());
                        readInt = a12.readInt();
                        a12.recycle();
                    } catch (RemoteException e14) {
                        e10 = e14;
                    }
                    if (readInt >= 3) {
                        o9.e eVar = f6878i.get();
                        if (eVar == null || (cursor2 = eVar.f13628a) == null) {
                            cursor = (Cursor) n9.b.c1(i10.g1(new n9.b(context), str, z10, f6879j.get().longValue()));
                            if (cursor != null) {
                                try {
                                    if (cursor.moveToFirst()) {
                                        readInt2 = cursor.getInt(0);
                                        if (readInt2 <= 0 || !h(cursor)) {
                                            cursor3 = cursor;
                                        }
                                        if (cursor3 != null) {
                                            cursor3.close();
                                        }
                                    }
                                } catch (RemoteException e15) {
                                    e10 = e15;
                                    cursor3 = cursor;
                                    String valueOf2 = String.valueOf(e10.getMessage());
                                    Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    return 0;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor != null) {
                                cursor.close();
                                return 0;
                            }
                            return 0;
                        }
                        return cursor2.getInt(0);
                    } else if (readInt == 2) {
                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                        n9.b bVar = new n9.b(context);
                        Parcel b1 = i10.b1();
                        u9.b.b(b1, bVar);
                        b1.writeString(str);
                        b1.writeInt(z10 ? 1 : 0);
                        Parcel a13 = i10.a1(5, b1);
                        readInt2 = a13.readInt();
                        a13.recycle();
                    } else {
                        Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                        n9.b bVar2 = new n9.b(context);
                        Parcel b12 = i10.b1();
                        u9.b.b(b12, bVar2);
                        b12.writeString(str);
                        b12.writeInt(z10 ? 1 : 0);
                        Parcel a14 = i10.a1(3, b12);
                        readInt2 = a14.readInt();
                        a14.recycle();
                    }
                    return readInt2;
                } catch (Throwable th3) {
                    th = th3;
                    cursor = null;
                }
            }
        } catch (Throwable th4) {
            try {
                Objects.requireNonNull(context, "null reference");
            } catch (Exception e16) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e16);
            }
            throw th4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ac, code lost:
        if (h(r11) != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule f(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static void g(ClassLoader classLoader) {
        g gVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                gVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                gVar = queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
            }
            f6882m = gVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            throw new LoadingException("Failed to instantiate dynamite loader", e10);
        }
    }

    public static boolean h(Cursor cursor) {
        o9.e eVar = f6878i.get();
        if (eVar == null || eVar.f13628a != null) {
            return false;
        }
        eVar.f13628a = cursor;
        return true;
    }

    public static f i(Context context) {
        f fVar;
        synchronized (DynamiteModule.class) {
            f fVar2 = f6881l;
            if (fVar2 != null) {
                return fVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    fVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
                }
                if (fVar != null) {
                    f6881l = fVar;
                    return fVar;
                }
            } catch (Exception e10) {
                String valueOf = String.valueOf(e10.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public IBinder b(String str) {
        try {
            return (IBinder) this.f6883a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e10) {
            throw new LoadingException(str.length() != 0 ? "Failed to instantiate module class: ".concat(str) : new String("Failed to instantiate module class: "), e10);
        }
    }
}
