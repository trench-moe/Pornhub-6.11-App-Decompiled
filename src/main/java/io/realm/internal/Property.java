package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Property implements g {

    /* renamed from: f  reason: collision with root package name */
    public static final long f10921f = nativeGetFinalizerPtr();

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f10922j = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f10923c;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10924a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f10924a = iArr;
            try {
                iArr[RealmFieldType.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10924a[RealmFieldType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10924a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10924a[RealmFieldType.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10924a[RealmFieldType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10924a[RealmFieldType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10924a[RealmFieldType.BINARY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10924a[RealmFieldType.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10924a[RealmFieldType.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10924a[RealmFieldType.DECIMAL128.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10924a[RealmFieldType.OBJECT_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10924a[RealmFieldType.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10924a[RealmFieldType.INTEGER_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10924a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10924a[RealmFieldType.STRING_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10924a[RealmFieldType.BINARY_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10924a[RealmFieldType.DATE_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10924a[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10924a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10924a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10924a[RealmFieldType.DOUBLE_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public Property(long j10) {
        this.f10923c = j10;
        f.f10955b.a(this);
    }

    public static native long nativeCreatePersistedProperty(String str, String str2, int i10, boolean z10, boolean z11);

    private static native long nativeGetColumnKey(long j10);

    private static native long nativeGetFinalizerPtr();

    private static native String nativeGetLinkedObjectName(long j10);

    private static native int nativeGetType(long j10);

    public long a() {
        return nativeGetColumnKey(this.f10923c);
    }

    public String b() {
        return nativeGetLinkedObjectName(this.f10923c);
    }

    public RealmFieldType c() {
        int nativeGetType = nativeGetType(this.f10923c);
        int i10 = nativeGetType & (-65);
        if (i10 != 10) {
            if (i10 != 11) {
                if (i10 != 138) {
                    if (i10 != 139) {
                        switch (i10) {
                            case 0:
                                return RealmFieldType.INTEGER;
                            case 1:
                                return RealmFieldType.BOOLEAN;
                            case 2:
                                return RealmFieldType.STRING;
                            case 3:
                                return RealmFieldType.BINARY;
                            case 4:
                                return RealmFieldType.DATE;
                            case 5:
                                return RealmFieldType.FLOAT;
                            case 6:
                                return RealmFieldType.DOUBLE;
                            case 7:
                                return RealmFieldType.OBJECT;
                            default:
                                switch (i10) {
                                    case 128:
                                        return RealmFieldType.INTEGER_LIST;
                                    case 129:
                                        return RealmFieldType.BOOLEAN_LIST;
                                    case 130:
                                        return RealmFieldType.STRING_LIST;
                                    case 131:
                                        return RealmFieldType.BINARY_LIST;
                                    case 132:
                                        return RealmFieldType.DATE_LIST;
                                    case 133:
                                        return RealmFieldType.FLOAT_LIST;
                                    case 134:
                                        return RealmFieldType.DOUBLE_LIST;
                                    case 135:
                                        return RealmFieldType.LIST;
                                    case 136:
                                        return RealmFieldType.LINKING_OBJECTS;
                                    default:
                                        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported property type: '%d'", Integer.valueOf(nativeGetType)));
                                }
                        }
                    }
                    return RealmFieldType.DECIMAL128_LIST;
                }
                return RealmFieldType.OBJECT_ID_LIST;
            }
            return RealmFieldType.DECIMAL128;
        }
        return RealmFieldType.OBJECT_ID;
    }

    @Override // io.realm.internal.g
    public long getNativeFinalizerPtr() {
        return f10921f;
    }

    @Override // io.realm.internal.g
    public long getNativePtr() {
        return this.f10923c;
    }
}
