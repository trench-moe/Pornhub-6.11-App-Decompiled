package com.google.android.gms.internal.measurement;

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
public final class zzmr {

    /* renamed from: c  reason: collision with root package name */
    public static final zzmr f7086c;

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ zzmr[] f7087f;
    private final zzms zzt;
    /* JADX INFO: Fake field, exist only in values array */
    zzmr EF1;
    /* JADX INFO: Fake field, exist only in values array */
    zzmr EF2;

    static {
        zzmr zzmrVar = new zzmr("DOUBLE", 0, zzms.DOUBLE);
        f7086c = zzmrVar;
        zzmr zzmrVar2 = new zzmr("FLOAT", 1, zzms.FLOAT);
        zzms zzmsVar = zzms.LONG;
        zzmr zzmrVar3 = new zzmr("INT64", 2, zzmsVar);
        zzmr zzmrVar4 = new zzmr("UINT64", 3, zzmsVar);
        zzms zzmsVar2 = zzms.INT;
        zzmr zzmrVar5 = new zzmr("INT32", 4, zzmsVar2);
        zzmr zzmrVar6 = new zzmr("FIXED64", 5, zzmsVar);
        zzmr zzmrVar7 = new zzmr("FIXED32", 6, zzmsVar2);
        zzmr zzmrVar8 = new zzmr("BOOL", 7, zzms.BOOLEAN);
        zzmr zzmrVar9 = new zzmr("STRING", 8, zzms.STRING);
        zzms zzmsVar3 = zzms.MESSAGE;
        f7087f = new zzmr[]{zzmrVar, zzmrVar2, zzmrVar3, zzmrVar4, zzmrVar5, zzmrVar6, zzmrVar7, zzmrVar8, zzmrVar9, new zzmr("GROUP", 9, zzmsVar3), new zzmr("MESSAGE", 10, zzmsVar3), new zzmr("BYTES", 11, zzms.BYTE_STRING), new zzmr("UINT32", 12, zzmsVar2), new zzmr("ENUM", 13, zzms.ENUM), new zzmr("SFIXED32", 14, zzmsVar2), new zzmr("SFIXED64", 15, zzmsVar), new zzmr("SINT32", 16, zzmsVar2), new zzmr("SINT64", 17, zzmsVar)};
    }

    public zzmr(String str, int i10, zzms zzmsVar) {
        this.zzt = zzmsVar;
    }

    public static zzmr[] values() {
        return (zzmr[]) f7087f.clone();
    }

    public final zzms b() {
        return this.zzt;
    }
}
