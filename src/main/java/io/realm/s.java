package io.realm;

import android.content.Context;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Flowable;
import io.realm.exceptions.RealmException;
import io.realm.internal.OsRealmConfig;
import io.realm.internal.Util;
import io.realm.p;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public class s {

    /* renamed from: r  reason: collision with root package name */
    public static final Object f11001r;

    /* renamed from: s  reason: collision with root package name */
    public static final io.realm.internal.m f11002s;

    /* renamed from: a  reason: collision with root package name */
    public final File f11003a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11004b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11005c;

    /* renamed from: f  reason: collision with root package name */
    public final long f11007f;

    /* renamed from: g  reason: collision with root package name */
    public final r3.c f11008g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f11009h;

    /* renamed from: i  reason: collision with root package name */
    public final OsRealmConfig.Durability f11010i;

    /* renamed from: j  reason: collision with root package name */
    public final io.realm.internal.m f11011j;

    /* renamed from: k  reason: collision with root package name */
    public final he.b f11012k;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f11014m;

    /* renamed from: o  reason: collision with root package name */
    public final long f11015o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f11016p;

    /* renamed from: q  reason: collision with root package name */
    public final boolean f11017q;
    public final String d = null;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f11006e = null;

    /* renamed from: l  reason: collision with root package name */
    public final p.a f11013l = null;
    public final CompactOnLaunchCallback n = null;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public File f11018a;

        /* renamed from: b  reason: collision with root package name */
        public String f11019b;

        /* renamed from: c  reason: collision with root package name */
        public long f11020c;
        public r3.c d;

        /* renamed from: e  reason: collision with root package name */
        public OsRealmConfig.Durability f11021e;

        /* renamed from: h  reason: collision with root package name */
        public he.b f11024h;

        /* renamed from: i  reason: collision with root package name */
        public ae.a f11025i;

        /* renamed from: k  reason: collision with root package name */
        public boolean f11027k;

        /* renamed from: f  reason: collision with root package name */
        public HashSet<Object> f11022f = new HashSet<>();

        /* renamed from: g  reason: collision with root package name */
        public HashSet<Class<? extends u>> f11023g = new HashSet<>();

        /* renamed from: j  reason: collision with root package name */
        public long f11026j = Long.MAX_VALUE;

        public a(Context context) {
            if (context == null) {
                throw new IllegalStateException("Call `Realm.init(Context)` before creating a RealmConfiguration");
            }
            io.realm.internal.k.a(context);
            this.f11018a = context.getFilesDir();
            this.f11019b = "default.realm";
            this.f11020c = 0L;
            this.d = null;
            this.f11021e = OsRealmConfig.Durability.FULL;
            Object obj = s.f11001r;
            if (obj != null) {
                this.f11022f.add(obj);
            }
            this.f11027k = true;
        }

        public s a() {
            io.realm.internal.m aVar;
            boolean booleanValue;
            boolean booleanValue2;
            if (this.f11024h == null) {
                synchronized (Util.class) {
                    if (Util.f10939a == null) {
                        try {
                            int i10 = Flowable.BUFFER_SIZE;
                            Util.f10939a = Boolean.TRUE;
                        } catch (ClassNotFoundException unused) {
                            Util.f10939a = Boolean.FALSE;
                        }
                    }
                    booleanValue2 = Util.f10939a.booleanValue();
                }
                if (booleanValue2) {
                    this.f11024h = new he.a(true);
                }
            }
            if (this.f11025i == null) {
                synchronized (Util.class) {
                    if (Util.f10940b == null) {
                        try {
                            Util.f10940b = Boolean.TRUE;
                        } catch (ClassNotFoundException unused2) {
                            Util.f10940b = Boolean.FALSE;
                        }
                    }
                    booleanValue = Util.f10940b.booleanValue();
                }
                if (booleanValue) {
                    this.f11025i = new d3.d(Boolean.TRUE);
                }
            }
            File file = new File(this.f11018a, this.f11019b);
            long j10 = this.f11020c;
            r3.c cVar = this.d;
            OsRealmConfig.Durability durability = this.f11021e;
            HashSet<Object> hashSet = this.f11022f;
            HashSet<Class<? extends u>> hashSet2 = this.f11023g;
            if (hashSet2.size() > 0) {
                aVar = new fe.b(s.f11002s, hashSet2);
            } else if (hashSet.size() == 1) {
                aVar = s.b(hashSet.iterator().next().getClass().getCanonicalName());
            } else {
                io.realm.internal.m[] mVarArr = new io.realm.internal.m[hashSet.size()];
                int i11 = 0;
                for (Object obj : hashSet) {
                    mVarArr[i11] = s.b(obj.getClass().getCanonicalName());
                    i11++;
                }
                aVar = new fe.a(mVarArr);
            }
            return new s(file, null, null, j10, cVar, false, durability, aVar, this.f11024h, this.f11025i, null, false, null, false, this.f11026j, false, this.f11027k);
        }
    }

    static {
        Object obj;
        Object obj2 = p.B;
        try {
            Constructor<?> constructor = DefaultRealmModule.class.getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            obj = constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            obj = null;
        } catch (IllegalAccessException e10) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e10);
        } catch (InstantiationException e11) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e11);
        } catch (InvocationTargetException e12) {
            throw new RealmException("Could not create an instance of io.realm.DefaultRealmModule", e12);
        }
        f11001r = obj;
        if (obj == null) {
            f11002s = null;
            return;
        }
        io.realm.internal.m b10 = b(obj.getClass().getCanonicalName());
        if (!b10.j()) {
            throw new ExceptionInInitializerError("RealmTransformer doesn't seem to be applied. Please update the project configuration to use the Realm Gradle plugin. See https://realm.io/news/android-installation-change/");
        }
        f11002s = b10;
    }

    public s(File file, String str, byte[] bArr, long j10, r3.c cVar, boolean z10, OsRealmConfig.Durability durability, io.realm.internal.m mVar, he.b bVar, ae.a aVar, p.a aVar2, boolean z11, CompactOnLaunchCallback compactOnLaunchCallback, boolean z12, long j11, boolean z13, boolean z14) {
        this.f11003a = file.getParentFile();
        this.f11004b = file.getName();
        this.f11005c = file.getAbsolutePath();
        this.f11007f = j10;
        this.f11008g = cVar;
        this.f11009h = z10;
        this.f11010i = durability;
        this.f11011j = mVar;
        this.f11012k = bVar;
        this.f11014m = z11;
        this.f11017q = z12;
        this.f11015o = j11;
        this.f11016p = z14;
    }

    public static io.realm.internal.m b(String str) {
        String[] split = str.split("\\.");
        String format = String.format(Locale.US, "io.realm.%s%s", split[split.length - 1], "Mediator");
        try {
            Constructor<?> constructor = Class.forName(format).getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            return (io.realm.internal.m) constructor.newInstance(new Object[0]);
        } catch (ClassNotFoundException e10) {
            throw new RealmException(a1.a.l("Could not find ", format), e10);
        } catch (IllegalAccessException e11) {
            throw new RealmException(a1.a.l("Could not create an instance of ", format), e11);
        } catch (InstantiationException e12) {
            throw new RealmException(a1.a.l("Could not create an instance of ", format), e12);
        } catch (InvocationTargetException e13) {
            throw new RealmException(a1.a.l("Could not create an instance of ", format), e13);
        }
    }

    public byte[] a() {
        byte[] bArr = this.f11006e;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ae, code lost:
        if ((r3 instanceof he.a) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b3, code lost:
        if (r8.f11012k != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b5, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b6, code lost:
        r2 = r7.f11013l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00b8, code lost:
        if (r2 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c0, code lost:
        if (r2.equals(r8.f11013l) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c5, code lost:
        if (r8.f11013l == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00c7, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00c8, code lost:
        r2 = r7.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ca, code lost:
        if (r2 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d2, code lost:
        if (r2.equals(r8.n) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00d7, code lost:
        if (r8.n == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00d9, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00e0, code lost:
        if (r7.f11015o != r8.f11015o) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e3, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.s.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i10;
        File file = this.f11003a;
        int hashCode = (file != null ? file.hashCode() : 0) * 31;
        String str = this.f11004b;
        int b10 = a1.a.b(this.f11005c, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
        String str2 = this.d;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.f11006e);
        long j10 = this.f11007f;
        int i11 = (((hashCode3 + ((b10 + hashCode2) * 31)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        r3.c cVar = this.f11008g;
        int hashCode4 = cVar != null ? cVar.hashCode() : 0;
        int hashCode5 = (this.f11011j.hashCode() + ((this.f11010i.hashCode() + ((((i11 + hashCode4) * 31) + (this.f11009h ? 1 : 0)) * 31)) * 31)) * 31;
        he.b bVar = this.f11012k;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
            i10 = 37;
        } else {
            i10 = 0;
        }
        int i12 = (hashCode5 + i10) * 31;
        p.a aVar = this.f11013l;
        int hashCode6 = (((i12 + (aVar != null ? aVar.hashCode() : 0)) * 31) + (this.f11014m ? 1 : 0)) * 31;
        CompactOnLaunchCallback compactOnLaunchCallback = this.n;
        int hashCode7 = compactOnLaunchCallback != null ? compactOnLaunchCallback.hashCode() : 0;
        long j11 = this.f11015o;
        return ((((hashCode6 + hashCode7) * 31) + (this.f11017q ? 1 : 0)) * 31) + ((int) ((j11 >>> 32) ^ j11));
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("realmDirectory: ");
        File file = this.f11003a;
        m10.append(file != null ? file.toString() : BuildConfig.FLAVOR);
        m10.append("\n");
        m10.append("realmFileName : ");
        m10.append(this.f11004b);
        m10.append("\n");
        m10.append("canonicalPath: ");
        android.support.v4.media.a.o(m10, this.f11005c, "\n", "key: ", "[length: ");
        m10.append(this.f11006e == null ? 0 : 64);
        m10.append("]");
        m10.append("\n");
        m10.append("schemaVersion: ");
        m10.append(Long.toString(this.f11007f));
        m10.append("\n");
        m10.append("migration: ");
        m10.append(this.f11008g);
        m10.append("\n");
        m10.append("deleteRealmIfMigrationNeeded: ");
        m10.append(this.f11009h);
        m10.append("\n");
        m10.append("durability: ");
        m10.append(this.f11010i);
        m10.append("\n");
        m10.append("schemaMediator: ");
        m10.append(this.f11011j);
        m10.append("\n");
        m10.append("readOnly: ");
        m10.append(this.f11014m);
        m10.append("\n");
        m10.append("compactOnLaunch: ");
        m10.append(this.n);
        m10.append("\n");
        m10.append("maxNumberOfActiveVersions: ");
        m10.append(this.f11015o);
        return m10.toString();
    }
}
