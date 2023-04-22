package com.google.android.gms.internal.cast;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzrs {

    /* renamed from: c  reason: collision with root package name */
    public static final zzrs f6970c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ zzrs[] f6971f;
    private final zzrt zzt;
    /* JADX INFO: Fake field, exist only in values array */
    zzrs EF1;
    /* JADX INFO: Fake field, exist only in values array */
    zzrs EF2;

    static {
        zzrs zzrsVar = new zzrs("DOUBLE", 0, zzrt.DOUBLE);
        f6970c = zzrsVar;
        zzrs zzrsVar2 = new zzrs("FLOAT", 1, zzrt.FLOAT);
        zzrt zzrtVar = zzrt.LONG;
        zzrs zzrsVar3 = new zzrs("INT64", 2, zzrtVar);
        zzrs zzrsVar4 = new zzrs("UINT64", 3, zzrtVar);
        zzrt zzrtVar2 = zzrt.INT;
        zzrs zzrsVar5 = new zzrs("INT32", 4, zzrtVar2);
        zzrs zzrsVar6 = new zzrs("FIXED64", 5, zzrtVar);
        zzrs zzrsVar7 = new zzrs("FIXED32", 6, zzrtVar2);
        zzrs zzrsVar8 = new zzrs("BOOL", 7, zzrt.BOOLEAN);
        zzrs zzrsVar9 = new zzrs("STRING", 8, zzrt.STRING);
        zzrt zzrtVar3 = zzrt.MESSAGE;
        f6971f = new zzrs[]{zzrsVar, zzrsVar2, zzrsVar3, zzrsVar4, zzrsVar5, zzrsVar6, zzrsVar7, zzrsVar8, zzrsVar9, new zzrs("GROUP", 9, zzrtVar3), new zzrs("MESSAGE", 10, zzrtVar3), new zzrs("BYTES", 11, zzrt.BYTE_STRING), new zzrs("UINT32", 12, zzrtVar2), new zzrs("ENUM", 13, zzrt.ENUM), new zzrs("SFIXED32", 14, zzrtVar2), new zzrs("SFIXED64", 15, zzrtVar), new zzrs("SINT32", 16, zzrtVar2), new zzrs("SINT64", 17, zzrtVar)};
    }

    public zzrs(String str, int i10, zzrt zzrtVar) {
        this.zzt = zzrtVar;
    }

    public static zzrs[] values() {
        return (zzrs[]) f6971f.clone();
    }

    public final zzrt b() {
        return this.zzt;
    }
}
