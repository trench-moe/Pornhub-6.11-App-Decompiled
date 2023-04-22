package com.google.android.gms.internal.cast;

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
public final class zzpk {
    public static final /* synthetic */ zzpk[] A;

    /* renamed from: c  reason: collision with root package name */
    public static final zzpk f6962c;

    /* renamed from: f  reason: collision with root package name */
    public static final zzpk f6963f;

    /* renamed from: j  reason: collision with root package name */
    public static final zzpk f6964j;

    /* renamed from: m  reason: collision with root package name */
    public static final zzpk f6965m;
    public static final zzpk n;

    /* renamed from: t  reason: collision with root package name */
    public static final zzpk f6966t;

    /* renamed from: u  reason: collision with root package name */
    public static final zzpk f6967u;

    /* renamed from: w  reason: collision with root package name */
    public static final zzpk f6968w;
    public static final zzpk y;

    /* renamed from: z  reason: collision with root package name */
    public static final zzpk f6969z;
    private final Class<?> zzl;
    private final Class<?> zzm;
    private final Object zzn;

    static {
        zzpk zzpkVar = new zzpk("VOID", 0, Void.class, Void.class, null);
        f6962c = zzpkVar;
        Class cls = Integer.TYPE;
        zzpk zzpkVar2 = new zzpk("INT", 1, cls, Integer.class, 0);
        f6963f = zzpkVar2;
        zzpk zzpkVar3 = new zzpk("LONG", 2, Long.TYPE, Long.class, 0L);
        f6964j = zzpkVar3;
        zzpk zzpkVar4 = new zzpk("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f6965m = zzpkVar4;
        zzpk zzpkVar5 = new zzpk("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        n = zzpkVar5;
        zzpk zzpkVar6 = new zzpk("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f6966t = zzpkVar6;
        zzpk zzpkVar7 = new zzpk("STRING", 6, String.class, String.class, BuildConfig.FLAVOR);
        f6967u = zzpkVar7;
        zzpk zzpkVar8 = new zzpk("BYTE_STRING", 7, zzoe.class, zzoe.class, zzoe.f6957c);
        f6968w = zzpkVar8;
        zzpk zzpkVar9 = new zzpk("ENUM", 8, cls, Integer.class, null);
        y = zzpkVar9;
        zzpk zzpkVar10 = new zzpk("MESSAGE", 9, Object.class, Object.class, null);
        f6969z = zzpkVar10;
        A = new zzpk[]{zzpkVar, zzpkVar2, zzpkVar3, zzpkVar4, zzpkVar5, zzpkVar6, zzpkVar7, zzpkVar8, zzpkVar9, zzpkVar10};
    }

    public zzpk(String str, int i10, Class cls, Class cls2, Object obj) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = obj;
    }

    public static zzpk[] values() {
        return (zzpk[]) A.clone();
    }

    public final Class<?> b() {
        return this.zzm;
    }
}
