package com.google.android.gms.internal.measurement;

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
public final class zzjp {

    /* renamed from: c  reason: collision with root package name */
    public static final zzjp f7072c;

    /* renamed from: f  reason: collision with root package name */
    public static final zzjp f7073f;

    /* renamed from: j  reason: collision with root package name */
    public static final zzjp[] f7074j;

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ zzjp[] f7075m;
    private final zzki zzab;
    private final int zzac;
    private final Class zzad;
    /* JADX INFO: Fake field, exist only in values array */
    zzjp EF6;

    static {
        zzki zzkiVar = zzki.n;
        zzjp zzjpVar = new zzjp("DOUBLE", 0, 0, 1, zzkiVar);
        zzki zzkiVar2 = zzki.f7080m;
        zzjp zzjpVar2 = new zzjp("FLOAT", 1, 1, 1, zzkiVar2);
        zzki zzkiVar3 = zzki.f7079j;
        zzjp zzjpVar3 = new zzjp("INT64", 2, 2, 1, zzkiVar3);
        zzjp zzjpVar4 = new zzjp("UINT64", 3, 3, 1, zzkiVar3);
        zzki zzkiVar4 = zzki.f7078f;
        zzjp zzjpVar5 = new zzjp("INT32", 4, 4, 1, zzkiVar4);
        zzjp zzjpVar6 = new zzjp("FIXED64", 5, 5, 1, zzkiVar3);
        zzjp zzjpVar7 = new zzjp("FIXED32", 6, 6, 1, zzkiVar4);
        zzki zzkiVar5 = zzki.f7081t;
        zzjp zzjpVar8 = new zzjp("BOOL", 7, 7, 1, zzkiVar5);
        zzki zzkiVar6 = zzki.f7082u;
        zzjp zzjpVar9 = new zzjp("STRING", 8, 8, 1, zzkiVar6);
        zzki zzkiVar7 = zzki.f7084z;
        zzjp zzjpVar10 = new zzjp("MESSAGE", 9, 9, 1, zzkiVar7);
        zzki zzkiVar8 = zzki.f7083w;
        zzjp zzjpVar11 = new zzjp("BYTES", 10, 10, 1, zzkiVar8);
        zzjp zzjpVar12 = new zzjp("UINT32", 11, 11, 1, zzkiVar4);
        zzki zzkiVar9 = zzki.y;
        zzjp zzjpVar13 = new zzjp("ENUM", 12, 12, 1, zzkiVar9);
        zzjp zzjpVar14 = new zzjp("SFIXED32", 13, 13, 1, zzkiVar4);
        zzjp zzjpVar15 = new zzjp("SFIXED64", 14, 14, 1, zzkiVar3);
        zzjp zzjpVar16 = new zzjp("SINT32", 15, 15, 1, zzkiVar4);
        zzjp zzjpVar17 = new zzjp("SINT64", 16, 16, 1, zzkiVar3);
        zzjp zzjpVar18 = new zzjp("GROUP", 17, 17, 1, zzkiVar7);
        zzjp zzjpVar19 = new zzjp("DOUBLE_LIST", 18, 18, 2, zzkiVar);
        zzjp zzjpVar20 = new zzjp("FLOAT_LIST", 19, 19, 2, zzkiVar2);
        zzjp zzjpVar21 = new zzjp("INT64_LIST", 20, 20, 2, zzkiVar3);
        zzjp zzjpVar22 = new zzjp("UINT64_LIST", 21, 21, 2, zzkiVar3);
        zzjp zzjpVar23 = new zzjp("INT32_LIST", 22, 22, 2, zzkiVar4);
        zzjp zzjpVar24 = new zzjp("FIXED64_LIST", 23, 23, 2, zzkiVar3);
        zzjp zzjpVar25 = new zzjp("FIXED32_LIST", 24, 24, 2, zzkiVar4);
        zzjp zzjpVar26 = new zzjp("BOOL_LIST", 25, 25, 2, zzkiVar5);
        zzjp zzjpVar27 = new zzjp("STRING_LIST", 26, 26, 2, zzkiVar6);
        zzjp zzjpVar28 = new zzjp("MESSAGE_LIST", 27, 27, 2, zzkiVar7);
        zzjp zzjpVar29 = new zzjp("BYTES_LIST", 28, 28, 2, zzkiVar8);
        zzjp zzjpVar30 = new zzjp("UINT32_LIST", 29, 29, 2, zzkiVar4);
        zzjp zzjpVar31 = new zzjp("ENUM_LIST", 30, 30, 2, zzkiVar9);
        zzjp zzjpVar32 = new zzjp("SFIXED32_LIST", 31, 31, 2, zzkiVar4);
        zzjp zzjpVar33 = new zzjp("SFIXED64_LIST", 32, 32, 2, zzkiVar3);
        zzjp zzjpVar34 = new zzjp("SINT32_LIST", 33, 33, 2, zzkiVar4);
        zzjp zzjpVar35 = new zzjp("SINT64_LIST", 34, 34, 2, zzkiVar3);
        zzjp zzjpVar36 = new zzjp("DOUBLE_LIST_PACKED", 35, 35, 3, zzkiVar);
        f7072c = zzjpVar36;
        zzjp zzjpVar37 = new zzjp("FLOAT_LIST_PACKED", 36, 36, 3, zzkiVar2);
        zzjp zzjpVar38 = new zzjp("INT64_LIST_PACKED", 37, 37, 3, zzkiVar3);
        zzjp zzjpVar39 = new zzjp("UINT64_LIST_PACKED", 38, 38, 3, zzkiVar3);
        zzjp zzjpVar40 = new zzjp("INT32_LIST_PACKED", 39, 39, 3, zzkiVar4);
        zzjp zzjpVar41 = new zzjp("FIXED64_LIST_PACKED", 40, 40, 3, zzkiVar3);
        zzjp zzjpVar42 = new zzjp("FIXED32_LIST_PACKED", 41, 41, 3, zzkiVar4);
        zzjp zzjpVar43 = new zzjp("BOOL_LIST_PACKED", 42, 42, 3, zzkiVar5);
        zzjp zzjpVar44 = new zzjp("UINT32_LIST_PACKED", 43, 43, 3, zzkiVar4);
        zzjp zzjpVar45 = new zzjp("ENUM_LIST_PACKED", 44, 44, 3, zzkiVar9);
        zzjp zzjpVar46 = new zzjp("SFIXED32_LIST_PACKED", 45, 45, 3, zzkiVar4);
        zzjp zzjpVar47 = new zzjp("SFIXED64_LIST_PACKED", 46, 46, 3, zzkiVar3);
        zzjp zzjpVar48 = new zzjp("SINT32_LIST_PACKED", 47, 47, 3, zzkiVar4);
        zzjp zzjpVar49 = new zzjp("SINT64_LIST_PACKED", 48, 48, 3, zzkiVar3);
        f7073f = zzjpVar49;
        f7075m = new zzjp[]{zzjpVar, zzjpVar2, zzjpVar3, zzjpVar4, zzjpVar5, zzjpVar6, zzjpVar7, zzjpVar8, zzjpVar9, zzjpVar10, zzjpVar11, zzjpVar12, zzjpVar13, zzjpVar14, zzjpVar15, zzjpVar16, zzjpVar17, zzjpVar18, zzjpVar19, zzjpVar20, zzjpVar21, zzjpVar22, zzjpVar23, zzjpVar24, zzjpVar25, zzjpVar26, zzjpVar27, zzjpVar28, zzjpVar29, zzjpVar30, zzjpVar31, zzjpVar32, zzjpVar33, zzjpVar34, zzjpVar35, zzjpVar36, zzjpVar37, zzjpVar38, zzjpVar39, zzjpVar40, zzjpVar41, zzjpVar42, zzjpVar43, zzjpVar44, zzjpVar45, zzjpVar46, zzjpVar47, zzjpVar48, zzjpVar49, new zzjp("GROUP_LIST", 49, 49, 2, zzkiVar7), new zzjp("MAP", 50, 50, 4, zzki.f7077c)};
        zzjp[] values = values();
        f7074j = new zzjp[values.length];
        for (zzjp zzjpVar50 : values) {
            f7074j[zzjpVar50.zzac] = zzjpVar50;
        }
    }

    public zzjp(String str, int i10, int i11, int i12, zzki zzkiVar) {
        this.zzac = i11;
        this.zzab = zzkiVar;
        zzki zzkiVar2 = zzki.f7077c;
        int i13 = i12 - 1;
        if (i13 == 1) {
            this.zzad = zzkiVar.b();
        } else if (i13 != 3) {
            this.zzad = null;
        } else {
            this.zzad = zzkiVar.b();
        }
        if (i12 == 1) {
            zzkiVar.ordinal();
        }
    }

    public static zzjp[] values() {
        return (zzjp[]) f7075m.clone();
    }

    public final int zza() {
        return this.zzac;
    }
}
