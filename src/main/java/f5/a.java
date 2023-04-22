package f5;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.appsflyer.oaid.BuildConfig;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {
    public int A;

    /* renamed from: c  reason: collision with root package name */
    public final File f9427c;

    /* renamed from: f  reason: collision with root package name */
    public final File f9428f;

    /* renamed from: j  reason: collision with root package name */
    public final File f9429j;

    /* renamed from: m  reason: collision with root package name */
    public final File f9430m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public long f9431t;

    /* renamed from: u  reason: collision with root package name */
    public final int f9432u;
    public Writer y;

    /* renamed from: w  reason: collision with root package name */
    public long f9433w = 0;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap<String, d> f9434z = new LinkedHashMap<>(0, 0.75f, true);
    public long B = 0;
    public final ThreadPoolExecutor C = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> D = new CallableC0130a();

    /* renamed from: f5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0130a implements Callable<Void> {
        public CallableC0130a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            synchronized (a.this) {
                a aVar = a.this;
                if (aVar.y != null) {
                    aVar.E();
                    if (a.this.k()) {
                        a.this.v();
                        a.this.A = 0;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public b(CallableC0130a callableC0130a) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            try {
                thread = new Thread(runnable, "glide-disk-lru-cache-thread");
                thread.setPriority(1);
            } catch (Throwable th) {
                throw th;
            }
            return thread;
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f9436a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f9437b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f9438c;

        public c(d dVar, CallableC0130a callableC0130a) {
            this.f9436a = dVar;
            this.f9437b = dVar.f9442e ? null : new boolean[a.this.f9432u];
        }

        public void a() {
            a.a(a.this, this, false);
        }

        public File b(int i10) {
            File file;
            synchronized (a.this) {
                d dVar = this.f9436a;
                if (dVar.f9443f != this) {
                    throw new IllegalStateException();
                }
                if (!dVar.f9442e) {
                    this.f9437b[i10] = true;
                }
                file = dVar.d[i10];
                a.this.f9427c.mkdirs();
            }
            return file;
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f9439a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f9440b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f9441c;
        public File[] d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9442e;

        /* renamed from: f  reason: collision with root package name */
        public c f9443f;

        /* renamed from: g  reason: collision with root package name */
        public long f9444g;

        public d(String str, CallableC0130a callableC0130a) {
            this.f9439a = str;
            int i10 = a.this.f9432u;
            this.f9440b = new long[i10];
            this.f9441c = new File[i10];
            this.d = new File[i10];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f9432u; i11++) {
                sb2.append(i11);
                this.f9441c[i11] = new File(a.this.f9427c, sb2.toString());
                sb2.append(".tmp");
                this.d[i11] = new File(a.this.f9427c, sb2.toString());
                sb2.setLength(length);
            }
        }

        public String a() {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f9440b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException b(String[] strArr) {
            StringBuilder m10 = a1.a.m("unexpected journal line: ");
            m10.append(Arrays.toString(strArr));
            throw new IOException(m10.toString());
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f9446a;

        public e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0130a callableC0130a) {
            this.f9446a = fileArr;
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f9427c = file;
        this.n = i10;
        this.f9428f = new File(file, "journal");
        this.f9429j = new File(file, "journal.tmp");
        this.f9430m = new File(file, "journal.bkp");
        this.f9432u = i11;
        this.f9431t = j10;
    }

    public static void a(a aVar, c cVar, boolean z10) {
        synchronized (aVar) {
            try {
                d dVar = cVar.f9436a;
                if (dVar.f9443f != cVar) {
                    throw new IllegalStateException();
                }
                if (z10 && !dVar.f9442e) {
                    for (int i10 = 0; i10 < aVar.f9432u; i10++) {
                        if (!cVar.f9437b[i10]) {
                            cVar.a();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                        } else if (!dVar.d[i10].exists()) {
                            cVar.a();
                            return;
                        }
                    }
                }
                for (int i11 = 0; i11 < aVar.f9432u; i11++) {
                    File file = dVar.d[i11];
                    if (!z10) {
                        e(file);
                    } else if (file.exists()) {
                        File file2 = dVar.f9441c[i11];
                        file.renameTo(file2);
                        long j10 = dVar.f9440b[i11];
                        long length = file2.length();
                        dVar.f9440b[i11] = length;
                        aVar.f9433w = (aVar.f9433w - j10) + length;
                    }
                }
                aVar.A++;
                dVar.f9443f = null;
                if (dVar.f9442e || z10) {
                    dVar.f9442e = true;
                    aVar.y.append((CharSequence) "CLEAN");
                    aVar.y.append(' ');
                    aVar.y.append((CharSequence) dVar.f9439a);
                    aVar.y.append((CharSequence) dVar.a());
                    aVar.y.append('\n');
                    if (z10) {
                        long j11 = aVar.B;
                        aVar.B = 1 + j11;
                        dVar.f9444g = j11;
                        h(aVar.y);
                        if (aVar.f9433w <= aVar.f9431t || aVar.k()) {
                            aVar.C.submit(aVar.D);
                        }
                    }
                } else {
                    aVar.f9434z.remove(dVar.f9439a);
                    aVar.y.append((CharSequence) "REMOVE");
                    aVar.y.append(' ');
                    aVar.y.append((CharSequence) dVar.f9439a);
                    aVar.y.append('\n');
                }
                h(aVar.y);
                if (aVar.f9433w <= aVar.f9431t) {
                }
                aVar.C.submit(aVar.D);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @TargetApi(26)
    public static void d(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public static void e(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void h(Writer writer) {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
            StrictMode.setThreadPolicy(threadPolicy);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f5.a m(java.io.File r10, int r11, int r12, long r13) {
        /*
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            r9 = 5
            if (r2 <= 0) goto La4
            r9 = 1
            if (r12 <= 0) goto L9a
            java.io.File r0 = new java.io.File
            r9 = 7
            java.lang.String r1 = "journal.bkp"
            r9 = 3
            r0.<init>(r10, r1)
            r9 = 1
            boolean r9 = r0.exists()
            r1 = r9
            if (r1 == 0) goto L35
            r9 = 6
            java.io.File r1 = new java.io.File
            java.lang.String r9 = "journal"
            r2 = r9
            r1.<init>(r10, r2)
            boolean r9 = r1.exists()
            r2 = r9
            if (r2 == 0) goto L2f
            r0.delete()
            goto L36
        L2f:
            r9 = 0
            r2 = r9
            w(r0, r1, r2)
            r9 = 7
        L35:
            r9 = 4
        L36:
            f5.a r0 = new f5.a
            r9 = 3
            r3 = r0
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7)
            r9 = 4
            java.io.File r1 = r0.f9428f
            r9 = 1
            boolean r1 = r1.exists()
            if (r1 == 0) goto L88
            r9 = 1
            r9 = 6
            r0.s()     // Catch: java.io.IOException -> L54
            r0.n()     // Catch: java.io.IOException -> L54
            return r0
        L54:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r9 = 5
            java.lang.String r9 = "DiskLruCache "
            r4 = r9
            r3.append(r4)
            r3.append(r10)
            java.lang.String r9 = " is corrupt: "
            r4 = r9
            r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ", removing"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            r0.close()
            java.io.File r0 = r0.f9427c
            f5.c.a(r0)
            r9 = 2
        L88:
            r10.mkdirs()
            f5.a r0 = new f5.a
            r9 = 1
            r1 = r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5)
            r0.v()
            return r0
        L9a:
            r9 = 3
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "valueCount <= 0"
            r11 = r9
            r10.<init>(r11)
            throw r10
        La4:
            r9 = 4
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "maxSize <= 0"
            r9 = 2
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.a.m(java.io.File, int, int, long):f5.a");
    }

    public static void w(File file, File file2, boolean z10) {
        if (z10) {
            e(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void E() {
        while (this.f9433w > this.f9431t) {
            String key = this.f9434z.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    c();
                    d dVar = this.f9434z.get(key);
                    if (dVar != null && dVar.f9443f == null) {
                        for (int i10 = 0; i10 < this.f9432u; i10++) {
                            File file = dVar.f9441c[i10];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j10 = this.f9433w;
                            long[] jArr = dVar.f9440b;
                            this.f9433w = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.A++;
                        this.y.append((CharSequence) "REMOVE");
                        this.y.append(' ');
                        this.y.append((CharSequence) key);
                        this.y.append('\n');
                        this.f9434z.remove(key);
                        if (k()) {
                            this.C.submit(this.D);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c() {
        if (this.y == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.y == null) {
            return;
        }
        Iterator it = new ArrayList(this.f9434z.values()).iterator();
        while (it.hasNext()) {
            c cVar = ((d) it.next()).f9443f;
            if (cVar != null) {
                cVar.a();
            }
        }
        E();
        d(this.y);
        this.y = null;
    }

    public c f(String str) {
        synchronized (this) {
            c();
            d dVar = this.f9434z.get(str);
            if (dVar == null) {
                dVar = new d(str, null);
                this.f9434z.put(str, dVar);
            } else if (dVar.f9443f != null) {
                return null;
            }
            c cVar = new c(dVar, null);
            dVar.f9443f = cVar;
            this.y.append((CharSequence) "DIRTY");
            this.y.append(' ');
            this.y.append((CharSequence) str);
            this.y.append('\n');
            h(this.y);
            return cVar;
        }
    }

    public synchronized e i(String str) {
        try {
            c();
            d dVar = this.f9434z.get(str);
            if (dVar == null) {
                return null;
            }
            if (dVar.f9442e) {
                for (File file : dVar.f9441c) {
                    if (!file.exists()) {
                        return null;
                    }
                }
                this.A++;
                this.y.append((CharSequence) "READ");
                this.y.append(' ');
                this.y.append((CharSequence) str);
                this.y.append('\n');
                if (k()) {
                    this.C.submit(this.D);
                }
                return new e(this, str, dVar.f9444g, dVar.f9441c, dVar.f9440b, null);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean k() {
        int i10 = this.A;
        return i10 >= 2000 && i10 >= this.f9434z.size();
    }

    public final void n() {
        e(this.f9429j);
        Iterator<d> it = this.f9434z.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f9443f == null) {
                while (i10 < this.f9432u) {
                    this.f9433w += next.f9440b[i10];
                    i10++;
                }
            } else {
                next.f9443f = null;
                while (i10 < this.f9432u) {
                    e(next.f9441c[i10]);
                    e(next.d[i10]);
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void s() {
        f5.b bVar = new f5.b(new FileInputStream(this.f9428f), f5.c.f9452a);
        try {
            String c10 = bVar.c();
            String c11 = bVar.c();
            String c12 = bVar.c();
            String c13 = bVar.c();
            String c14 = bVar.c();
            if (!"libcore.io.DiskLruCache".equals(c10) || !"1".equals(c11) || !Integer.toString(this.n).equals(c12) || !Integer.toString(this.f9432u).equals(c13) || !BuildConfig.FLAVOR.equals(c14)) {
                throw new IOException("unexpected journal header: [" + c10 + ", " + c11 + ", " + c13 + ", " + c14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    t(bVar.c());
                    i10++;
                } catch (EOFException unused) {
                    this.A = i10 - this.f9434z.size();
                    if (bVar.n == -1) {
                        v();
                    } else {
                        this.y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9428f, true), f5.c.f9452a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void t(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(a1.a.l("unexpected journal line: ", str));
        }
        int i10 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i10);
        if (indexOf2 == -1) {
            substring = str.substring(i10);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f9434z.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i10, indexOf2);
        }
        d dVar = this.f9434z.get(substring);
        if (dVar == null) {
            dVar = new d(substring, null);
            this.f9434z.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f9442e = true;
            dVar.f9443f = null;
            if (split.length != a.this.f9432u) {
                dVar.b(split);
                throw null;
            }
            for (int i11 = 0; i11 < split.length; i11++) {
                try {
                    dVar.f9440b[i11] = Long.parseLong(split[i11]);
                } catch (NumberFormatException unused) {
                    dVar.b(split);
                    throw null;
                }
            }
        } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f9443f = new c(dVar, null);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
            throw new IOException(a1.a.l("unexpected journal line: ", str));
        }
    }

    public final synchronized void v() {
        try {
            Writer writer = this.y;
            if (writer != null) {
                d(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9429j), f5.c.f9452a));
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.n));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f9432u));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f9434z.values()) {
                if (dVar.f9443f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f9439a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f9439a + dVar.a() + '\n');
                }
            }
            d(bufferedWriter);
            if (this.f9428f.exists()) {
                w(this.f9428f, this.f9430m, true);
            }
            w(this.f9429j, this.f9428f, false);
            this.f9430m.delete();
            this.y = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f9428f, true), f5.c.f9452a));
        } catch (Throwable th) {
            throw th;
        }
    }
}
