package f6;

import android.content.Context;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f9455a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9456b;

    /* renamed from: c  reason: collision with root package name */
    public final b f9457c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f9458c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f9459f;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ String f9460j;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ d f9461m;

        public a(Context context, String str, String str2, d dVar) {
            this.f9458c = context;
            this.f9459f = str;
            this.f9460j = str2;
            this.f9461m = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e.this.d(this.f9458c, this.f9459f, this.f9460j);
                this.f9461m.a();
            } catch (MissingLibraryException e10) {
                this.f9461m.b(e10);
            } catch (UnsatisfiedLinkError e11) {
                this.f9461m.b(e11);
            }
        }
    }

    public e() {
        g gVar = new g();
        f6.a aVar = new f6.a();
        this.f9455a = new HashSet();
        this.f9456b = gVar;
        this.f9457c = aVar;
    }

    public File a(Context context) {
        return context.getDir("lib", 0);
    }

    public File b(Context context, String str, String str2) {
        String a10 = ((g) this.f9456b).a(str);
        return m9.a.w(str2) ? new File(a(context), a10) : new File(a(context), android.support.v4.media.b.j(a10, ".", str2));
    }

    public void c(Context context, String str, String str2, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (m9.a.w(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (dVar == null) {
            d(context, str, str2);
        } else {
            new Thread(new a(context, str, str2, dVar)).start();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0137, code lost:
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018b, code lost:
        if (r2 != null) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v4, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f6.e.d(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
