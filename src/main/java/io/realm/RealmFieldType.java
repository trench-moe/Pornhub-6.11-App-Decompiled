package io.realm;

import io.realm.internal.Keep;
import java.nio.ByteBuffer;
import java.util.Date;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes2.dex */
public enum RealmFieldType {
    INTEGER(0),
    BOOLEAN(1),
    STRING(2),
    BINARY(4),
    DATE(8),
    FLOAT(9),
    DOUBLE(10),
    OBJECT(12),
    DECIMAL128(11),
    OBJECT_ID(15),
    LIST(13),
    LINKING_OBJECTS(14),
    INTEGER_LIST(128),
    BOOLEAN_LIST(129),
    STRING_LIST(130),
    BINARY_LIST(132),
    DATE_LIST(136),
    FLOAT_LIST(137),
    DOUBLE_LIST(138),
    DECIMAL128_LIST(139),
    OBJECT_ID_LIST(143);
    
    private static final RealmFieldType[] basicTypes = new RealmFieldType[16];
    private static final RealmFieldType[] listTypes = new RealmFieldType[16];
    private final int nativeValue;

    static {
        RealmFieldType[] values;
        for (RealmFieldType realmFieldType : values()) {
            int i10 = realmFieldType.nativeValue;
            if (i10 < 128) {
                basicTypes[i10] = realmFieldType;
            } else {
                listTypes[i10 - 128] = realmFieldType;
            }
        }
    }

    RealmFieldType(int i10) {
        this.nativeValue = i10;
    }

    public static RealmFieldType fromNativeValue(int i10) {
        RealmFieldType realmFieldType;
        RealmFieldType realmFieldType2;
        if (i10 >= 0) {
            RealmFieldType[] realmFieldTypeArr = basicTypes;
            if (i10 < realmFieldTypeArr.length && (realmFieldType2 = realmFieldTypeArr[i10]) != null) {
                return realmFieldType2;
            }
        }
        if (128 <= i10) {
            int i11 = i10 - 128;
            RealmFieldType[] realmFieldTypeArr2 = listTypes;
            if (i11 < realmFieldTypeArr2.length && (realmFieldType = realmFieldTypeArr2[i11]) != null) {
                return realmFieldType;
            }
        }
        throw new IllegalArgumentException(a1.a.j("Invalid native Realm type: ", i10));
    }

    public int getNativeValue() {
        return this.nativeValue;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean isValid(Object obj) {
        int i10 = this.nativeValue;
        if (i10 == 0) {
            return (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte);
        } else if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 4) {
                    return (obj instanceof byte[]) || (obj instanceof ByteBuffer);
                }
                if (i10 != 132 && i10 != 143) {
                    switch (i10) {
                        case 8:
                            return obj instanceof Date;
                        case 9:
                            return obj instanceof Float;
                        case 10:
                            return obj instanceof Double;
                        case 11:
                            return obj instanceof Decimal128;
                        case 12:
                            return false;
                        case 13:
                        case 14:
                            break;
                        case 15:
                            return obj instanceof ObjectId;
                        default:
                            switch (i10) {
                                case 128:
                                case 129:
                                case 130:
                                    break;
                                default:
                                    switch (i10) {
                                        case 136:
                                        case 137:
                                        case 138:
                                        case 139:
                                            break;
                                        default:
                                            throw new RuntimeException("Unsupported Realm type:  " + this);
                                    }
                            }
                    }
                }
                return false;
            }
            return obj instanceof String;
        } else {
            return obj instanceof Boolean;
        }
    }
}
