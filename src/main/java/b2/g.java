package b2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bf.t;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, t<f>> f3461a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f3462b = {80, 75, 3, 4};

    /* loaded from: classes.dex */
    public class a implements n<f> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3463a;

        public a(String str) {
            this.f3463a = str;
        }

        @Override // b2.n
        public void a(f fVar) {
            ((HashMap) g.f3461a).remove(this.f3463a);
        }
    }

    /* loaded from: classes.dex */
    public class b implements n<Throwable> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f3464a;

        public b(String str) {
            this.f3464a = str;
        }

        @Override // b2.n
        public void a(Throwable th) {
            ((HashMap) g.f3461a).remove(this.f3464a);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Callable<r<f>> {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ f f3465c;

        public c(f fVar) {
            this.f3465c = fVar;
        }

        @Override // java.util.concurrent.Callable
        public r<f> call() {
            return new r<>(this.f3465c);
        }
    }

    public static t<f> a(String str, Callable<r<f>> callable) {
        f fVar;
        if (str == null) {
            fVar = null;
        } else {
            g2.f fVar2 = g2.f.f9714b;
            Objects.requireNonNull(fVar2);
            fVar = fVar2.f9715a.get(str);
        }
        if (fVar != null) {
            return new t<>(new c(fVar), false);
        }
        if (str != null) {
            HashMap hashMap = (HashMap) f3461a;
            if (hashMap.containsKey(str)) {
                return (t) hashMap.get(str);
            }
        }
        t<f> tVar = new t<>(callable, false);
        if (str != null) {
            tVar.b(new a(str));
            tVar.a(new b(str));
            ((HashMap) f3461a).put(str, tVar);
        }
        return tVar;
    }

    public static r<f> b(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return c(context.getAssets().open(str), str2);
            }
            return f(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new r<>(e10);
        }
    }

    public static r<f> c(InputStream inputStream, String str) {
        try {
            bf.h o10 = cb.e.o(cb.e.d0(inputStream));
            String[] strArr = JsonReader.n;
            r<f> d = d(new com.airbnb.lottie.parser.moshi.a(o10), str, true);
            m2.g.b(inputStream);
            return d;
        } catch (Throwable th) {
            m2.g.b(inputStream);
            throw th;
        }
    }

    public static r<f> d(JsonReader jsonReader, String str, boolean z10) {
        try {
            try {
                f a10 = l2.q.a(jsonReader);
                if (str != null) {
                    g2.f.f9714b.a(str, a10);
                }
                r<f> rVar = new r<>(a10);
                if (z10) {
                    m2.g.b(jsonReader);
                }
                return rVar;
            } catch (Exception e10) {
                r<f> rVar2 = new r<>(e10);
                if (z10) {
                    m2.g.b(jsonReader);
                }
                return rVar2;
            }
        } catch (Throwable th) {
            if (z10) {
                m2.g.b(jsonReader);
            }
            throw th;
        }
    }

    public static r<f> e(Context context, int i10, String str) {
        Boolean bool;
        try {
            bf.h o10 = cb.e.o(cb.e.d0(context.getResources().openRawResource(i10)));
            try {
                bf.h c10 = ((bf.t) o10).c();
                byte[] bArr = f3462b;
                int length = bArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        ((bf.t) c10).close();
                        bool = Boolean.TRUE;
                        break;
                    }
                    if (((bf.t) c10).readByte() != bArr[i11]) {
                        bool = Boolean.FALSE;
                        break;
                    }
                    i11++;
                }
            } catch (Exception unused) {
                Objects.requireNonNull(m2.c.f12867a);
                bool = Boolean.FALSE;
            }
            return bool.booleanValue() ? f(new ZipInputStream(new t.a()), str) : c(new t.a(), str);
        } catch (Resources.NotFoundException e10) {
            return new r<>(e10);
        }
    }

    public static r<f> f(ZipInputStream zipInputStream, String str) {
        try {
            r<f> g10 = g(zipInputStream, str);
            m2.g.b(zipInputStream);
            return g10;
        } catch (Throwable th) {
            m2.g.b(zipInputStream);
            throw th;
        }
    }

    public static r<f> g(ZipInputStream zipInputStream, String str) {
        m mVar;
        String[] split;
        HashMap hashMap = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            f fVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    bf.h o10 = cb.e.o(cb.e.d0(zipInputStream));
                    String[] strArr = JsonReader.n;
                    fVar = d(new com.airbnb.lottie.parser.moshi.a(o10), null, false).f3540a;
                } else {
                    if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                        zipInputStream.closeEntry();
                    }
                    hashMap.put(name.split("/")[split.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (fVar == null) {
                return new r<>(new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Iterator<m> it = fVar.d.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        mVar = null;
                        break;
                    }
                    mVar = it.next();
                    if (mVar.d.equals(str2)) {
                        break;
                    }
                }
                if (mVar != null) {
                    mVar.f3516e = m2.g.e((Bitmap) entry.getValue(), mVar.f3513a, mVar.f3514b);
                }
            }
            for (Map.Entry<String, m> entry2 : fVar.d.entrySet()) {
                if (entry2.getValue().f3516e == null) {
                    StringBuilder m10 = a1.a.m("There is no image for ");
                    m10.append(entry2.getValue().d);
                    return new r<>(new IllegalStateException(m10.toString()));
                }
            }
            if (str != null) {
                g2.f.f9714b.a(str, fVar);
            }
            return new r<>(fVar);
        } catch (IOException e10) {
            return new r<>(e10);
        }
    }

    public static String h(Context context, int i10) {
        StringBuilder m10 = a1.a.m("rawRes");
        m10.append((context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_");
        m10.append(i10);
        return m10.toString();
    }
}
