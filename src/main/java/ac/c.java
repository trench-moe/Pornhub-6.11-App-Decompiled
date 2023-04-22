package ac;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public final File f352a;

    /* renamed from: b  reason: collision with root package name */
    public final File f353b;

    /* renamed from: c  reason: collision with root package name */
    public final File f354c;
    public final File d;

    /* renamed from: e  reason: collision with root package name */
    public final File f355e;

    public c(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        g(file);
        this.f352a = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.f353b = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.f354c = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.d = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.f355e = file5;
    }

    public static synchronized File g(File file) {
        synchronized (c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (file.mkdirs()) {
                    return file;
                }
                throw new IllegalStateException("Could not create Crashlytics-specific directory: " + file);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                h(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> i(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public File a(String str) {
        return new File(this.f352a, str);
    }

    public List<File> b() {
        return i(this.f355e.listFiles());
    }

    public List<File> c() {
        return i(this.d.listFiles());
    }

    public List<File> d() {
        return i(this.f354c.listFiles());
    }

    public final File e(String str) {
        File file = new File(this.f353b, str);
        file.mkdirs();
        return file;
    }

    public File f(String str, String str2) {
        return new File(e(str), str2);
    }
}
