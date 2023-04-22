package k1;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<File> f11769a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f11770b;

    static {
        String property = System.getProperty("java.vm.version");
        boolean z10 = false;
        if (property != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(property, ".");
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken != null && nextToken2 != null) {
                try {
                    int parseInt = Integer.parseInt(nextToken);
                    int parseInt2 = Integer.parseInt(nextToken2);
                    if (parseInt > 2 || (parseInt == 2 && parseInt2 >= 1)) {
                        z10 = true;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        StringBuilder l10 = android.support.v4.media.a.l("VM with version ", property);
        l10.append(z10 ? " has multidex support" : " does not have multidex support");
        Log.i("MultiDex", l10.toString());
        f11770b = z10;
    }

    public static void a(Object obj, String str, Object[] objArr) {
        Field d = d(obj, str);
        Object[] objArr2 = (Object[]) d.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        d.set(obj, objArr3);
    }

    public static void b(Context context) {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            StringBuilder m10 = a1.a.m("Clearing old secondary dex dir (");
            m10.append(file.getPath());
            m10.append(").");
            Log.i("MultiDex", m10.toString());
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder m11 = a1.a.m("Failed to list secondary dex dir content (");
                m11.append(file.getPath());
                m11.append(").");
                Log.w("MultiDex", m11.toString());
                return;
            }
            for (File file2 : listFiles) {
                StringBuilder m12 = a1.a.m("Trying to delete old file ");
                m12.append(file2.getPath());
                m12.append(" of size ");
                m12.append(file2.length());
                Log.i("MultiDex", m12.toString());
                if (file2.delete()) {
                    StringBuilder m13 = a1.a.m("Deleted old file ");
                    m13.append(file2.getPath());
                    Log.i("MultiDex", m13.toString());
                } else {
                    StringBuilder m14 = a1.a.m("Failed to delete old file ");
                    m14.append(file2.getPath());
                    Log.w("MultiDex", m14.toString());
                }
            }
            if (file.delete()) {
                StringBuilder m15 = a1.a.m("Deleted old secondary dex dir ");
                m15.append(file.getPath());
                Log.i("MultiDex", m15.toString());
                return;
            }
            StringBuilder m16 = a1.a.m("Failed to delete secondary dex dir ");
            m16.append(file.getPath());
            Log.w("MultiDex", m16.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0080 A[Catch: all -> 0x00f4, DONT_GENERATE, TRY_LEAVE, TryCatch #8 {, blocks: (B:4:0x0004, B:7:0x000e, B:10:0x0011, B:12:0x0063, B:13:0x0069, B:21:0x0080, B:27:0x0091, B:28:0x0099, B:31:0x00ab, B:40:0x00dd, B:45:0x00e6, B:48:0x00e9, B:30:0x009d, B:16:0x0071, B:18:0x0078, B:23:0x0082, B:33:0x00bc, B:34:0x00c1, B:39:0x00ca, B:51:0x00ec), top: B:66:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #8 {, blocks: (B:4:0x0004, B:7:0x000e, B:10:0x0011, B:12:0x0063, B:13:0x0069, B:21:0x0080, B:27:0x0091, B:28:0x0099, B:31:0x00ab, B:40:0x00dd, B:45:0x00e6, B:48:0x00e9, B:30:0x009d, B:16:0x0071, B:18:0x0078, B:23:0x0082, B:33:0x00bc, B:34:0x00c1, B:39:0x00ca, B:51:0x00ec), top: B:66:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r8, java.io.File r9, java.io.File r10, java.lang.String r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.a.c(android.content.Context, java.io.File, java.io.File, java.lang.String, java.lang.String, boolean):void");
    }

    public static Field d(Object obj, String str) {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder p10 = a1.a.p("Field ", str, " not found in ");
        p10.append(obj.getClass());
        throw new NoSuchFieldException(p10.toString());
    }

    public static void e(ClassLoader classLoader, File file, List<? extends File> list) {
        IOException[] iOExceptionArr;
        if (!list.isEmpty()) {
            Object obj = d(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(list);
            Class<?>[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    a(obj, "dexElements", (Object[]) declaredMethod.invoke(obj, arrayList2, file, arrayList));
                    if (arrayList.size() > 0) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Log.w("MultiDex", "Exception in makeDexElement", (IOException) it.next());
                        }
                        Field d = d(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) d.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                            arrayList.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        d.set(obj, iOExceptionArr);
                        IOException iOException = new IOException("I/O exception during makeDexElement");
                        iOException.initCause((Throwable) arrayList.get(0));
                        throw iOException;
                    }
                } catch (NoSuchMethodException unused) {
                }
            }
            StringBuilder p10 = a1.a.p("Method ", "makeDexElements", " with parameters ");
            p10.append(Arrays.asList(clsArr));
            p10.append(" not found in ");
            p10.append(obj.getClass());
            throw new NoSuchMethodException(p10.toString());
        }
    }

    public static void f(File file) {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            StringBuilder m10 = a1.a.m("Failed to create dir ");
            m10.append(file.getPath());
            m10.append(". Parent file is null.");
            Log.e("MultiDex", m10.toString());
        } else {
            StringBuilder m11 = a1.a.m("Failed to create dir ");
            m11.append(file.getPath());
            m11.append(". parent file is a dir ");
            m11.append(parentFile.isDirectory());
            m11.append(", a file ");
            m11.append(parentFile.isFile());
            m11.append(", exists ");
            m11.append(parentFile.exists());
            m11.append(", readable ");
            m11.append(parentFile.canRead());
            m11.append(", writable ");
            m11.append(parentFile.canWrite());
            Log.e("MultiDex", m11.toString());
        }
        StringBuilder m12 = a1.a.m("Failed to create directory ");
        m12.append(file.getPath());
        throw new IOException(m12.toString());
    }
}
