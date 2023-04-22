package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a1.a;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.StringsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum KFunction uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class FunctionClassKind {
    private static final /* synthetic */ FunctionClassKind[] $VALUES;
    public static final Companion Companion;
    public static final FunctionClassKind KFunction;
    public static final FunctionClassKind KSuspendFunction;
    private final String classNamePrefix;
    private final boolean isReflectType;
    private final boolean isSuspendType;
    private final FqName packageFqName;
    public static final FunctionClassKind Function = new FunctionClassKind("Function", 0, StandardNames.BUILT_INS_PACKAGE_FQ_NAME, "Function", false, false);
    public static final FunctionClassKind SuspendFunction = new FunctionClassKind("SuspendFunction", 1, StandardNames.COROUTINES_PACKAGE_FQ_NAME, "SuspendFunction", true, false);

    /* loaded from: classes3.dex */
    public static final class Companion {

        /* loaded from: classes3.dex */
        public static final class KindWithArity {
            private final int arity;
            private final FunctionClassKind kind;

            public KindWithArity(FunctionClassKind kind, int i10) {
                Intrinsics.checkNotNullParameter(kind, "kind");
                this.kind = kind;
                this.arity = i10;
            }

            public final FunctionClassKind component1() {
                return this.kind;
            }

            public final int component2() {
                return this.arity;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof KindWithArity) {
                    KindWithArity kindWithArity = (KindWithArity) obj;
                    return this.kind == kindWithArity.kind && this.arity == kindWithArity.arity;
                }
                return false;
            }

            public final FunctionClassKind getKind() {
                return this.kind;
            }

            public int hashCode() {
                return (this.kind.hashCode() * 31) + this.arity;
            }

            public String toString() {
                StringBuilder m10 = a.m("KindWithArity(kind=");
                m10.append(this.kind);
                m10.append(", arity=");
                return android.support.v4.media.a.i(m10, this.arity, ')');
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Integer toInt(String str) {
            if (str.length() == 0) {
                return null;
            }
            int length = str.length();
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                char charAt = str.charAt(i10);
                i10++;
                int i12 = charAt - '0';
                if (!(i12 >= 0 && i12 < 10)) {
                    return null;
                }
                i11 = (i11 * 10) + i12;
            }
            return Integer.valueOf(i11);
        }

        public final FunctionClassKind byClassNamePrefix(FqName packageFqName, String className) {
            boolean z10;
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            Intrinsics.checkNotNullParameter(className, "className");
            FunctionClassKind[] values = FunctionClassKind.values();
            int length = values.length;
            int i10 = 0;
            while (i10 < length) {
                FunctionClassKind functionClassKind = values[i10];
                i10++;
                if (Intrinsics.areEqual(functionClassKind.getPackageFqName(), packageFqName) && StringsKt.startsWith$default(className, functionClassKind.getClassNamePrefix(), false, 2, (Object) null)) {
                    z10 = true;
                    continue;
                } else {
                    z10 = false;
                    continue;
                }
                if (z10) {
                    return functionClassKind;
                }
            }
            return null;
        }

        @JvmStatic
        public final FunctionClassKind getFunctionalClassKind(String className, FqName packageFqName) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            KindWithArity parseClassName = parseClassName(className, packageFqName);
            if (parseClassName == null) {
                return null;
            }
            return parseClassName.getKind();
        }

        public final KindWithArity parseClassName(String className, FqName packageFqName) {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
            FunctionClassKind byClassNamePrefix = byClassNamePrefix(packageFqName, className);
            if (byClassNamePrefix == null) {
                return null;
            }
            String substring = className.substring(byClassNamePrefix.getClassNamePrefix().length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            Integer num = toInt(substring);
            if (num == null) {
                return null;
            }
            return new KindWithArity(byClassNamePrefix, num.intValue());
        }
    }

    private static final /* synthetic */ FunctionClassKind[] $values() {
        return new FunctionClassKind[]{Function, SuspendFunction, KFunction, KSuspendFunction};
    }

    static {
        FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
        KFunction = new FunctionClassKind("KFunction", 2, fqName, "KFunction", false, true);
        KSuspendFunction = new FunctionClassKind("KSuspendFunction", 3, fqName, "KSuspendFunction", true, true);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private FunctionClassKind(String str, int i10, FqName fqName, String str2, boolean z10, boolean z11) {
        this.packageFqName = fqName;
        this.classNamePrefix = str2;
        this.isSuspendType = z10;
        this.isReflectType = z11;
    }

    public static FunctionClassKind valueOf(String str) {
        return (FunctionClassKind) Enum.valueOf(FunctionClassKind.class, str);
    }

    public static FunctionClassKind[] values() {
        return (FunctionClassKind[]) $VALUES.clone();
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final FqName getPackageFqName() {
        return this.packageFqName;
    }

    public final Name numberedClassName(int i10) {
        Name identifier = Name.identifier(Intrinsics.stringPlus(this.classNamePrefix, Integer.valueOf(i10)));
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"$classNamePrefix$arity\")");
        return identifier;
    }
}
