package ff;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import pl.droidsonroids.relinker.MissingLibraryException;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f9578a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9579b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9580c;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f9581c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f9582f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f9583j;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ d f9584m;

        public a(Context context, String str, String str2, d dVar) {
            this.f9581c = context;
            this.f9582f = str;
            this.f9583j = str2;
            this.f9584m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.d(this.f9581c, this.f9582f, this.f9583j);
                this.f9584m.a();
            } catch (UnsatisfiedLinkError e10) {
                this.f9584m.b(e10);
            } catch (MissingLibraryException e11) {
                this.f9584m.b(e11);
            }
        }
    }

    public e() {
        g gVar = new g();
        ff.a aVar = new ff.a();
        this.f9578a = new HashSet();
        this.f9579b = gVar;
        this.f9580c = aVar;
    }

    public File a(Context context) {
        return context.getDir("lib", 0);
    }

    public File b(Context context, String str, String str2) {
        String a10 = ((g) this.f9579b).a(str);
        return m9.a.x(str2) ? new File(a(context), a10) : new File(a(context), android.support.v4.media.b.j(a10, ".", str2));
    }

    public void c(Context context, String str, String str2, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (m9.a.x(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (dVar == null) {
            d(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, dVar)).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0136, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0182, code lost:
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0173 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x017b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ff.e.d(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
