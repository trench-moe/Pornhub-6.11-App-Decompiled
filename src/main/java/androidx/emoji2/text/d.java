package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class d {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1936j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile d f1937k;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f1938a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f1939b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1940c;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1941e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1942f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1943g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1944h;

    /* renamed from: i  reason: collision with root package name */
    public final InterfaceC0027d f1945i;

    /* loaded from: classes.dex */
    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile androidx.emoji2.text.h f1946b;

        /* renamed from: c  reason: collision with root package name */
        public volatile m f1947c;

        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0026a extends h {
            public C0026a() {
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th) {
                a.this.f1949a.f(th);
            }

            @Override // androidx.emoji2.text.d.h
            public void b(m mVar) {
                a aVar = a.this;
                if (mVar == null) {
                    aVar.f1949a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.f1947c = mVar;
                m mVar2 = aVar.f1947c;
                i iVar = new i();
                d dVar = aVar.f1949a;
                InterfaceC0027d interfaceC0027d = dVar.f1945i;
                Objects.requireNonNull(dVar);
                aVar.f1946b = new androidx.emoji2.text.h(mVar2, iVar, interfaceC0027d, false, null);
                aVar.f1949a.g();
            }
        }

        public a(d dVar) {
            super(dVar);
        }

        @Override // androidx.emoji2.text.d.b
        public void a() {
            try {
                this.f1949a.f1942f.a(new C0026a());
            } catch (Throwable th) {
                this.f1949a.f(th);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:88:0x0154, code lost:
            return r17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0055 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:7:0x001d, B:10:0x0022, B:12:0x0026, B:14:0x0035, B:19:0x0043, B:21:0x004d, B:23:0x0050, B:25:0x0055, B:27:0x0061, B:28:0x0064, B:30:0x0071, B:36:0x0080, B:37:0x008e, B:42:0x00a9, B:49:0x00b8, B:52:0x00c4, B:53:0x00c9, B:55:0x00e0, B:57:0x00e7, B:58:0x00ec, B:60:0x00f7, B:63:0x00ff, B:65:0x0103, B:67:0x0109, B:69:0x010d, B:76:0x011c, B:79:0x0128, B:80:0x012e, B:16:0x003d), top: B:93:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00ec A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:7:0x001d, B:10:0x0022, B:12:0x0026, B:14:0x0035, B:19:0x0043, B:21:0x004d, B:23:0x0050, B:25:0x0055, B:27:0x0061, B:28:0x0064, B:30:0x0071, B:36:0x0080, B:37:0x008e, B:42:0x00a9, B:49:0x00b8, B:52:0x00c4, B:53:0x00c9, B:55:0x00e0, B:57:0x00e7, B:58:0x00ec, B:60:0x00f7, B:63:0x00ff, B:65:0x0103, B:67:0x0109, B:69:0x010d, B:76:0x011c, B:79:0x0128, B:80:0x012e, B:16:0x003d), top: B:93:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0128 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:7:0x001d, B:10:0x0022, B:12:0x0026, B:14:0x0035, B:19:0x0043, B:21:0x004d, B:23:0x0050, B:25:0x0055, B:27:0x0061, B:28:0x0064, B:30:0x0071, B:36:0x0080, B:37:0x008e, B:42:0x00a9, B:49:0x00b8, B:52:0x00c4, B:53:0x00c9, B:55:0x00e0, B:57:0x00e7, B:58:0x00ec, B:60:0x00f7, B:63:0x00ff, B:65:0x0103, B:67:0x0109, B:69:0x010d, B:76:0x011c, B:79:0x0128, B:80:0x012e, B:16:0x003d), top: B:93:0x001d }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0144  */
        /* JADX WARN: Type inference failed for: r8v10 */
        @Override // androidx.emoji2.text.d.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.CharSequence b(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                Method dump skipped, instructions count: 350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.a.b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        @Override // androidx.emoji2.text.d.b
        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            y0.b bVar = this.f1947c.f1992a;
            int a10 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a10 != 0 ? bVar.f18382b.getInt(a10 + bVar.f18381a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.f1949a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f1949a;

        public b(d dVar) {
            this.f1949a = dVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z10) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1950a;

        /* renamed from: b  reason: collision with root package name */
        public int f1951b = 0;

        /* renamed from: c  reason: collision with root package name */
        public InterfaceC0027d f1952c = new h.a();

        public c(g gVar) {
            this.f1950a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0027d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final List<e> f1953c;

        /* renamed from: f  reason: collision with root package name */
        public final Throwable f1954f;

        /* renamed from: j  reason: collision with root package name */
        public final int f1955j;

        public f(Collection<e> collection, int i10, Throwable th) {
            cb.e.u(collection, "initCallbacks cannot be null");
            this.f1953c = new ArrayList(collection);
            this.f1955j = i10;
            this.f1954f = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f1953c.size();
            int i10 = 0;
            if (this.f1955j != 1) {
                while (i10 < size) {
                    this.f1953c.get(i10).a(this.f1954f);
                    i10++;
                }
                return;
            }
            while (i10 < size) {
                this.f1953c.get(i10).b();
                i10++;
            }
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(h hVar);
    }

    /* loaded from: classes.dex */
    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    /* loaded from: classes.dex */
    public static class i {
    }

    public d(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1938a = reentrantReadWriteLock;
        this.f1940c = 3;
        Objects.requireNonNull(cVar);
        this.f1943g = -16711936;
        this.f1942f = cVar.f1950a;
        int i10 = cVar.f1951b;
        this.f1944h = i10;
        this.f1945i = cVar.f1952c;
        this.d = new Handler(Looper.getMainLooper());
        this.f1939b = new p.c(0);
        a aVar = new a(this);
        this.f1941e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f1940c = 0;
            } catch (Throwable th) {
                this.f1938a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static d a() {
        d dVar;
        synchronized (f1936j) {
            dVar = f1937k;
            cb.e.v(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean c() {
        return f1937k != null;
    }

    public int b() {
        this.f1938a.readLock().lock();
        try {
            int i10 = this.f1940c;
            this.f1938a.readLock().unlock();
            return i10;
        } catch (Throwable th) {
            this.f1938a.readLock().unlock();
            throw th;
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        boolean z10 = true;
        if (this.f1944h != 1) {
            z10 = false;
        }
        cb.e.v(z10, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (d()) {
            return;
        }
        this.f1938a.writeLock().lock();
        try {
            if (this.f1940c == 0) {
                this.f1938a.writeLock().unlock();
                return;
            }
            this.f1940c = 0;
            this.f1938a.writeLock().unlock();
            this.f1941e.a();
        } catch (Throwable th) {
            this.f1938a.writeLock().unlock();
            throw th;
        }
    }

    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1938a.writeLock().lock();
        try {
            this.f1940c = 2;
            arrayList.addAll(this.f1939b);
            this.f1939b.clear();
            this.f1938a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f1940c, th));
        } catch (Throwable th2) {
            this.f1938a.writeLock().unlock();
            throw th2;
        }
    }

    public void g() {
        ArrayList arrayList = new ArrayList();
        this.f1938a.writeLock().lock();
        try {
            this.f1940c = 1;
            arrayList.addAll(this.f1939b);
            this.f1939b.clear();
            this.f1938a.writeLock().unlock();
            this.d.post(new f(arrayList, this.f1940c, null));
        } catch (Throwable th) {
            this.f1938a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), IntCompanionObject.MAX_VALUE, 0);
    }

    public CharSequence i(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        cb.e.v(d(), "Not initialized yet");
        cb.e.t(i10, "start cannot be negative");
        cb.e.t(i11, "end cannot be negative");
        cb.e.t(i12, "maxEmojiCount cannot be negative");
        cb.e.r(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        cb.e.r(i10 <= charSequence.length(), "start should be < than charSequence length");
        cb.e.r(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        return this.f1941e.b(charSequence, i10, i11, i12, i13 == 1);
    }

    public void j(e eVar) {
        cb.e.u(eVar, "initCallback cannot be null");
        this.f1938a.writeLock().lock();
        try {
            if (this.f1940c != 1 && this.f1940c != 2) {
                this.f1939b.add(eVar);
                this.f1938a.writeLock().unlock();
            }
            this.d.post(new f(Arrays.asList(eVar), this.f1940c, null));
            this.f1938a.writeLock().unlock();
        } catch (Throwable th) {
            this.f1938a.writeLock().unlock();
            throw th;
        }
    }
}
