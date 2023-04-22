package com.google.android.gms.internal.cast;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzot {

    /* renamed from: c  reason: collision with root package name */
    public static final zzot f6958c;

    /* renamed from: f  reason: collision with root package name */
    public static final zzot f6959f;

    /* renamed from: j  reason: collision with root package name */
    public static final zzot[] f6960j;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ zzot[] f6961m;
    private final zzpk zzab;
    private final int zzac;
    private final Class<?> zzad;
    /* JADX INFO: Fake field, exist only in values array */
    zzot EF6;

    static {
        zzpk zzpkVar = zzpk.n;
        zzot zzotVar = new zzot("DOUBLE", 0, 0, 1, zzpkVar);
        zzpk zzpkVar2 = zzpk.f6965m;
        zzot zzotVar2 = new zzot("FLOAT", 1, 1, 1, zzpkVar2);
        zzpk zzpkVar3 = zzpk.f6964j;
        zzot zzotVar3 = new zzot("INT64", 2, 2, 1, zzpkVar3);
        zzot zzotVar4 = new zzot("UINT64", 3, 3, 1, zzpkVar3);
        zzpk zzpkVar4 = zzpk.f6963f;
        zzot zzotVar5 = new zzot("INT32", 4, 4, 1, zzpkVar4);
        zzot zzotVar6 = new zzot("FIXED64", 5, 5, 1, zzpkVar3);
        zzot zzotVar7 = new zzot("FIXED32", 6, 6, 1, zzpkVar4);
        zzpk zzpkVar5 = zzpk.f6966t;
        zzot zzotVar8 = new zzot("BOOL", 7, 7, 1, zzpkVar5);
        zzpk zzpkVar6 = zzpk.f6967u;
        zzot zzotVar9 = new zzot("STRING", 8, 8, 1, zzpkVar6);
        zzpk zzpkVar7 = zzpk.f6969z;
        zzot zzotVar10 = new zzot("MESSAGE", 9, 9, 1, zzpkVar7);
        zzpk zzpkVar8 = zzpk.f6968w;
        zzot zzotVar11 = new zzot("BYTES", 10, 10, 1, zzpkVar8);
        zzot zzotVar12 = new zzot("UINT32", 11, 11, 1, zzpkVar4);
        zzpk zzpkVar9 = zzpk.y;
        zzot zzotVar13 = new zzot("ENUM", 12, 12, 1, zzpkVar9);
        zzot zzotVar14 = new zzot("SFIXED32", 13, 13, 1, zzpkVar4);
        zzot zzotVar15 = new zzot("SFIXED64", 14, 14, 1, zzpkVar3);
        zzot zzotVar16 = new zzot("SINT32", 15, 15, 1, zzpkVar4);
        zzot zzotVar17 = new zzot("SINT64", 16, 16, 1, zzpkVar3);
        zzot zzotVar18 = new zzot("GROUP", 17, 17, 1, zzpkVar7);
        zzot zzotVar19 = new zzot("DOUBLE_LIST", 18, 18, 2, zzpkVar);
        zzot zzotVar20 = new zzot("FLOAT_LIST", 19, 19, 2, zzpkVar2);
        zzot zzotVar21 = new zzot("INT64_LIST", 20, 20, 2, zzpkVar3);
        zzot zzotVar22 = new zzot("UINT64_LIST", 21, 21, 2, zzpkVar3);
        zzot zzotVar23 = new zzot("INT32_LIST", 22, 22, 2, zzpkVar4);
        zzot zzotVar24 = new zzot("FIXED64_LIST", 23, 23, 2, zzpkVar3);
        zzot zzotVar25 = new zzot("FIXED32_LIST", 24, 24, 2, zzpkVar4);
        zzot zzotVar26 = new zzot("BOOL_LIST", 25, 25, 2, zzpkVar5);
        zzot zzotVar27 = new zzot("STRING_LIST", 26, 26, 2, zzpkVar6);
        zzot zzotVar28 = new zzot("MESSAGE_LIST", 27, 27, 2, zzpkVar7);
        zzot zzotVar29 = new zzot("BYTES_LIST", 28, 28, 2, zzpkVar8);
        zzot zzotVar30 = new zzot("UINT32_LIST", 29, 29, 2, zzpkVar4);
        zzot zzotVar31 = new zzot("ENUM_LIST", 30, 30, 2, zzpkVar9);
        zzot zzotVar32 = new zzot("SFIXED32_LIST", 31, 31, 2, zzpkVar4);
        zzot zzotVar33 = new zzot("SFIXED64_LIST", 32, 32, 2, zzpkVar3);
        zzot zzotVar34 = new zzot("SINT32_LIST", 33, 33, 2, zzpkVar4);
        zzot zzotVar35 = new zzot("SINT64_LIST", 34, 34, 2, zzpkVar3);
        zzot zzotVar36 = new zzot("DOUBLE_LIST_PACKED", 35, 35, 3, zzpkVar);
        f6958c = zzotVar36;
        zzot zzotVar37 = new zzot("FLOAT_LIST_PACKED", 36, 36, 3, zzpkVar2);
        zzot zzotVar38 = new zzot("INT64_LIST_PACKED", 37, 37, 3, zzpkVar3);
        zzot zzotVar39 = new zzot("UINT64_LIST_PACKED", 38, 38, 3, zzpkVar3);
        zzot zzotVar40 = new zzot("INT32_LIST_PACKED", 39, 39, 3, zzpkVar4);
        zzot zzotVar41 = new zzot("FIXED64_LIST_PACKED", 40, 40, 3, zzpkVar3);
        zzot zzotVar42 = new zzot("FIXED32_LIST_PACKED", 41, 41, 3, zzpkVar4);
        zzot zzotVar43 = new zzot("BOOL_LIST_PACKED", 42, 42, 3, zzpkVar5);
        zzot zzotVar44 = new zzot("UINT32_LIST_PACKED", 43, 43, 3, zzpkVar4);
        zzot zzotVar45 = new zzot("ENUM_LIST_PACKED", 44, 44, 3, zzpkVar9);
        zzot zzotVar46 = new zzot("SFIXED32_LIST_PACKED", 45, 45, 3, zzpkVar4);
        zzot zzotVar47 = new zzot("SFIXED64_LIST_PACKED", 46, 46, 3, zzpkVar3);
        zzot zzotVar48 = new zzot("SINT32_LIST_PACKED", 47, 47, 3, zzpkVar4);
        zzot zzotVar49 = new zzot("SINT64_LIST_PACKED", 48, 48, 3, zzpkVar3);
        f6959f = zzotVar49;
        f6961m = new zzot[]{zzotVar, zzotVar2, zzotVar3, zzotVar4, zzotVar5, zzotVar6, zzotVar7, zzotVar8, zzotVar9, zzotVar10, zzotVar11, zzotVar12, zzotVar13, zzotVar14, zzotVar15, zzotVar16, zzotVar17, zzotVar18, zzotVar19, zzotVar20, zzotVar21, zzotVar22, zzotVar23, zzotVar24, zzotVar25, zzotVar26, zzotVar27, zzotVar28, zzotVar29, zzotVar30, zzotVar31, zzotVar32, zzotVar33, zzotVar34, zzotVar35, zzotVar36, zzotVar37, zzotVar38, zzotVar39, zzotVar40, zzotVar41, zzotVar42, zzotVar43, zzotVar44, zzotVar45, zzotVar46, zzotVar47, zzotVar48, zzotVar49, new zzot("GROUP_LIST", 49, 49, 2, zzpkVar7), new zzot("MAP", 50, 50, 4, zzpk.f6962c)};
        zzot[] values = values();
        f6960j = new zzot[values.length];
        for (zzot zzotVar50 : values) {
            f6960j[zzotVar50.zzac] = zzotVar50;
        }
    }

    public zzot(String str, int i10, int i11, int i12, zzpk zzpkVar) {
        this.zzac = i11;
        this.zzab = zzpkVar;
        zzpk zzpkVar2 = zzpk.f6962c;
        int i13 = i12 - 1;
        if (i13 == 1) {
            this.zzad = zzpkVar.b();
        } else if (i13 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzpkVar.b();
        }
        if (i12 == 1) {
            zzpkVar.ordinal();
        }
    }

    public static zzot[] values() {
        return (zzot[]) f6961m.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
