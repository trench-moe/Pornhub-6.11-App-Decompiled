package kotlin.reflect.jvm.internal.impl.name;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;

/* loaded from: classes3.dex */
public final class FqName {
    public static final FqName ROOT = new FqName(BuildConfig.FLAVOR);
    private final FqNameUnsafe fqName;
    private transient FqName parent;

    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i11 = 2;
                break;
            case 8:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = AppMeasurementSdk.ConditionalUserProperty.NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
                objArr[2] = "startsWith";
                break;
            case 13:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new IllegalStateException(format);
            case 8:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public FqName(String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        this.fqName = new FqNameUnsafe(str, this);
    }

    public FqName(FqNameUnsafe fqNameUnsafe) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(2);
        }
        this.fqName = fqNameUnsafe;
    }

    private FqName(FqNameUnsafe fqNameUnsafe, FqName fqName) {
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(3);
        }
        this.fqName = fqNameUnsafe;
        this.parent = fqName;
    }

    public static FqName topLevel(Name name) {
        if (name == null) {
            $$$reportNull$$$0(13);
        }
        return new FqName(FqNameUnsafe.topLevel(name));
    }

    public String asString() {
        String asString = this.fqName.asString();
        if (asString == null) {
            $$$reportNull$$$0(4);
        }
        return asString;
    }

    public FqName child(Name name) {
        if (name == null) {
            $$$reportNull$$$0(8);
        }
        return new FqName(this.fqName.child(name), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FqName) && this.fqName.equals(((FqName) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public boolean isRoot() {
        return this.fqName.isRoot();
    }

    public FqName parent() {
        FqName fqName = this.parent;
        if (fqName != null) {
            if (fqName == null) {
                $$$reportNull$$$0(6);
            }
            return fqName;
        } else if (isRoot()) {
            throw new IllegalStateException("root");
        } else {
            FqName fqName2 = new FqName(this.fqName.parent());
            this.parent = fqName2;
            return fqName2;
        }
    }

    public List<Name> pathSegments() {
        List<Name> pathSegments = this.fqName.pathSegments();
        if (pathSegments == null) {
            $$$reportNull$$$0(11);
        }
        return pathSegments;
    }

    public Name shortName() {
        Name shortName = this.fqName.shortName();
        if (shortName == null) {
            $$$reportNull$$$0(9);
        }
        return shortName;
    }

    public Name shortNameOrSpecial() {
        Name shortNameOrSpecial = this.fqName.shortNameOrSpecial();
        if (shortNameOrSpecial == null) {
            $$$reportNull$$$0(10);
        }
        return shortNameOrSpecial;
    }

    public boolean startsWith(Name name) {
        if (name == null) {
            $$$reportNull$$$0(12);
        }
        return this.fqName.startsWith(name);
    }

    public String toString() {
        return this.fqName.toString();
    }

    public FqNameUnsafe toUnsafe() {
        FqNameUnsafe fqNameUnsafe = this.fqName;
        if (fqNameUnsafe == null) {
            $$$reportNull$$$0(5);
        }
        return fqNameUnsafe;
    }
}
