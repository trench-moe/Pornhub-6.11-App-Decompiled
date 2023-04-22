package com.google.android.gms.internal.measurement;

import com.appsflyer.oaid.BuildConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class zzki {
    public static final /* synthetic */ zzki[] A;

    /* renamed from: c  reason: collision with root package name */
    public static final zzki f7077c;

    /* renamed from: f  reason: collision with root package name */
    public static final zzki f7078f;

    /* renamed from: j  reason: collision with root package name */
    public static final zzki f7079j;

    /* renamed from: m  reason: collision with root package name */
    public static final zzki f7080m;
    public static final zzki n;

    /* renamed from: t  reason: collision with root package name */
    public static final zzki f7081t;

    /* renamed from: u  reason: collision with root package name */
    public static final zzki f7082u;

    /* renamed from: w  reason: collision with root package name */
    public static final zzki f7083w;
    public static final zzki y;

    /* renamed from: z  reason: collision with root package name */
    public static final zzki f7084z;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        zzki zzkiVar = new zzki("VOID", 0, Void.class, Void.class, null);
        f7077c = zzkiVar;
        Class cls = Integer.TYPE;
        zzki zzkiVar2 = new zzki("INT", 1, cls, Integer.class, 0);
        f7078f = zzkiVar2;
        zzki zzkiVar3 = new zzki("LONG", 2, Long.TYPE, Long.class, 0L);
        f7079j = zzkiVar3;
        zzki zzkiVar4 = new zzki("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f7080m = zzkiVar4;
        zzki zzkiVar5 = new zzki("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        n = zzkiVar5;
        zzki zzkiVar6 = new zzki("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f7081t = zzkiVar6;
        zzki zzkiVar7 = new zzki("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f7082u = zzkiVar7;
        zzki zzkiVar8 = new zzki("BYTE_STRING", 7, zzix.class, zzix.class, zzix.f7071c);
        f7083w = zzkiVar8;
        zzki zzkiVar9 = new zzki("ENUM", 8, cls, Integer.class, null);
        y = zzkiVar9;
        zzki zzkiVar10 = new zzki("MESSAGE", 9, Object.class, Object.class, null);
        f7084z = zzkiVar10;
        A = new zzki[]{zzkiVar, zzkiVar2, zzkiVar3, zzkiVar4, zzkiVar5, zzkiVar6, zzkiVar7, zzkiVar8, zzkiVar9, zzkiVar10};
    }

    public zzki(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzki[] values() {
        return (zzki[]) A.clone();
    }

    public final Class b() {
        return this.zzm;
    }
}
