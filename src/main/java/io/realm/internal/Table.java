package io.realm.internal;

import io.realm.RealmFieldType;

/* loaded from: classes2.dex */
public class Table implements g {

    /* renamed from: m  reason: collision with root package name */
    public static final String f10926m;
    public static final long n;

    /* renamed from: c  reason: collision with root package name */
    public final long f10927c;

    /* renamed from: f  reason: collision with root package name */
    public final f f10928f;

    /* renamed from: j  reason: collision with root package name */
    public final OsSharedRealm f10929j;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10930a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f10930a = iArr;
            try {
                iArr[RealmFieldType.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10930a[RealmFieldType.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10930a[RealmFieldType.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10930a[RealmFieldType.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10930a[RealmFieldType.DATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10930a[RealmFieldType.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10930a[RealmFieldType.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10930a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10930a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10930a[RealmFieldType.INTEGER_LIST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10930a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10930a[RealmFieldType.STRING_LIST.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10930a[RealmFieldType.BINARY_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10930a[RealmFieldType.DATE_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10930a[RealmFieldType.FLOAT_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10930a[RealmFieldType.DOUBLE_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10930a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10930a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static {
        String nativeGetTablePrefix = Util.nativeGetTablePrefix();
        f10926m = nativeGetTablePrefix;
        nativeGetTablePrefix.length();
        n = nativeGetFinalizerPtr();
    }

    public Table(OsSharedRealm osSharedRealm, long j10) {
        f fVar = osSharedRealm.context;
        this.f10928f = fVar;
        this.f10929j = osSharedRealm;
        this.f10927c = j10;
        fVar.a(this);
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        String str2 = f10926m;
        return !str.startsWith(str2) ? str : str.substring(str2.length());
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        return android.support.v4.media.b.m(new StringBuilder(), f10926m, str);
    }

    private native long nativeAddColumn(long j10, int i10, String str, boolean z10);

    private native long nativeAddPrimitiveListColumn(long j10, int i10, String str, boolean z10);

    private native void nativeAddSearchIndex(long j10, long j11);

    public static native long nativeFindFirstNull(long j10, long j11);

    public static native long nativeFindFirstString(long j10, long j11, String str);

    private native long nativeGetColumnCount(long j10);

    private native long nativeGetColumnKey(long j10, String str);

    private native String nativeGetColumnName(long j10, long j11);

    private native String[] nativeGetColumnNames(long j10);

    private native int nativeGetColumnType(long j10, long j11);

    private static native long nativeGetFinalizerPtr();

    private native long nativeGetLinkTarget(long j10, long j11);

    private native String nativeGetName(long j10);

    private native boolean nativeHasSearchIndex(long j10, long j11);

    private native boolean nativeIsValid(long j10);

    private native void nativeMoveLastOver(long j10, long j11);

    private native void nativeRemoveColumn(long j10, long j11);

    private native void nativeRemoveSearchIndex(long j10, long j11);

    public static native void nativeSetBoolean(long j10, long j11, long j12, boolean z10, boolean z11);

    public static native void nativeSetDouble(long j10, long j11, long j12, double d, boolean z10);

    public static native void nativeSetLong(long j10, long j11, long j12, long j13, boolean z10);

    public static native void nativeSetNull(long j10, long j11, long j12, boolean z10);

    public static native void nativeSetString(long j10, long j11, long j12, String str, boolean z10);

    private native long nativeSize(long j10);

    private native long nativeWhere(long j10);

    public long a(RealmFieldType realmFieldType, String str, boolean z10) {
        if (str.length() <= 63) {
            switch (a.f10930a[realmFieldType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return nativeAddColumn(this.f10927c, realmFieldType.getNativeValue(), str, z10);
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    return nativeAddPrimitiveListColumn(this.f10927c, realmFieldType.getNativeValue() - 128, str, z10);
                default:
                    throw new IllegalArgumentException("Unsupported type: " + realmFieldType);
            }
        }
        throw new IllegalArgumentException("Column names are currently limited to max 63 characters.");
    }

    public void b(long j10) {
        c();
        nativeAddSearchIndex(this.f10927c, j10);
    }

    public void c() {
        OsSharedRealm osSharedRealm = this.f10929j;
        if ((osSharedRealm == null || osSharedRealm.isInTransaction()) ? false : true) {
            throw new IllegalStateException("Cannot modify managed objects outside of a write transaction.");
        }
    }

    public String d() {
        String e10 = e(k());
        if (Util.b(e10)) {
            throw new IllegalStateException("This object class is no longer part of the schema for the Realm file. It is therefor not possible to access the schema name.");
        }
        return e10;
    }

    public long f(String str) {
        if (str != null) {
            return nativeGetColumnKey(this.f10927c, str);
        }
        throw new IllegalArgumentException("Column name can not be null.");
    }

    public String g(long j10) {
        return nativeGetColumnName(this.f10927c, j10);
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return n;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10927c;
    }

    public String[] h() {
        return nativeGetColumnNames(this.f10927c);
    }

    public RealmFieldType i(long j10) {
        return RealmFieldType.fromNativeValue(nativeGetColumnType(this.f10927c, j10));
    }

    public Table j(long j10) {
        return new Table(this.f10929j, nativeGetLinkTarget(this.f10927c, j10));
    }

    public String k() {
        return nativeGetName(this.f10927c);
    }

    public boolean m(long j10) {
        return nativeHasSearchIndex(this.f10927c, j10);
    }

    public boolean n() {
        long j10 = this.f10927c;
        return j10 != 0 && nativeIsValid(j10);
    }

    public native long nativeGetRowPtr(long j10, long j11);

    public void o(long j10) {
        c();
        nativeMoveLastOver(this.f10927c, j10);
    }

    public void p(long j10) {
        String d = d();
        String nativeGetColumnName = nativeGetColumnName(this.f10927c, j10);
        String b10 = OsObjectStore.b(this.f10929j, d());
        nativeRemoveColumn(this.f10927c, j10);
        if (nativeGetColumnName.equals(b10)) {
            OsObjectStore.d(this.f10929j, d, null);
        }
    }

    public void q(long j10) {
        c();
        nativeRemoveSearchIndex(this.f10927c, j10);
    }

    public void r(long j10, long j11, long j12, boolean z10) {
        c();
        nativeSetLong(this.f10927c, j10, j11, j12, z10);
    }

    public void s(long j10, long j11, boolean z10) {
        c();
        nativeSetNull(this.f10927c, j10, j11, z10);
    }

    public void t(long j10, long j11, String str, boolean z10) {
        c();
        nativeSetString(this.f10927c, j10, j11, str, z10);
    }

    public String toString() {
        long nativeGetColumnCount = nativeGetColumnCount(this.f10927c);
        String k10 = k();
        StringBuilder sb2 = new StringBuilder("The Table ");
        if (k10 != null && !k10.isEmpty()) {
            sb2.append(k());
            sb2.append(" ");
        }
        sb2.append("contains ");
        sb2.append(nativeGetColumnCount);
        sb2.append(" columns: ");
        String[] nativeGetColumnNames = nativeGetColumnNames(this.f10927c);
        int length = nativeGetColumnNames.length;
        boolean z10 = true;
        int i10 = 0;
        while (i10 < length) {
            String str = nativeGetColumnNames[i10];
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(str);
            i10++;
            z10 = false;
        }
        sb2.append(".");
        sb2.append(" And ");
        sb2.append(nativeSize(this.f10927c));
        sb2.append(" rows.");
        return sb2.toString();
    }

    public TableQuery u() {
        return new TableQuery(this.f10928f, this, nativeWhere(this.f10927c));
    }
}
