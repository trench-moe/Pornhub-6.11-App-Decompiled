package ac;

import android.util.Log;
import com.appsflyer.oaid.BuildConfig;
import h8.h;
import ic.d;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.io.ConstantsKt;
import vb.g;
import xb.a0;

/* loaded from: classes.dex */
public class b {
    public static final Charset d = Charset.forName("UTF-8");

    /* renamed from: e  reason: collision with root package name */
    public static final int f345e = 15;

    /* renamed from: f  reason: collision with root package name */
    public static final yb.a f346f = new yb.a();

    /* renamed from: g  reason: collision with root package name */
    public static final Comparator<? super File> f347g = h.f10270j;

    /* renamed from: h  reason: collision with root package name */
    public static final FilenameFilter f348h = new FilenameFilter() { // from class: ac.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            Charset charset = b.d;
            return str.startsWith("event");
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f349a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final c f350b;

    /* renamed from: c  reason: collision with root package name */
    public final cc.c f351c;

    public b(c cVar, cc.c cVar2) {
        this.f350b = cVar;
        this.f351c = cVar2;
    }

    public static String e(File file) {
        byte[] bArr = new byte[ConstantsKt.DEFAULT_BUFFER_SIZE];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void a(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    public final List<File> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f350b.c());
        arrayList.addAll(this.f350b.b());
        Comparator<? super File> comparator = f347g;
        Collections.sort(arrayList, comparator);
        List<File> d10 = this.f350b.d();
        Collections.sort(d10, comparator);
        arrayList.addAll(d10);
        return arrayList;
    }

    public SortedSet<String> c() {
        return new TreeSet(c.i(this.f350b.f353b.list())).descendingSet();
    }

    public void d(a0.e.d dVar, String str, boolean z10) {
        int i10 = ((cc.b) this.f351c).b().b().f8897c;
        Objects.requireNonNull(f346f);
        d dVar2 = (d) yb.a.f18630a;
        Objects.requireNonNull(dVar2);
        StringWriter stringWriter = new StringWriter();
        try {
            dVar2.a(dVar, stringWriter);
        } catch (IOException unused) {
        }
        try {
            f(this.f350b.f(str, android.support.v4.media.b.j("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f349a.getAndIncrement())), z10 ? "_" : BuildConfig.FLAVOR)), stringWriter.toString());
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        List<File> i11 = c.i(this.f350b.e(str).listFiles(g.f16130c));
        Collections.sort(i11, i8.c.f10589m);
        int size = i11.size();
        for (File file : i11) {
            if (size <= i10) {
                return;
            }
            c.h(file);
            size--;
        }
    }
}
