package io.realm;

import com.appsflyer.oaid.BuildConfig;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Table;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes2.dex */
public class e extends v implements io.realm.internal.l {

    /* renamed from: a  reason: collision with root package name */
    public final n<e> f10858a;

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10859a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f10859a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10859a[RealmFieldType.INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10859a[RealmFieldType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10859a[RealmFieldType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10859a[RealmFieldType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10859a[RealmFieldType.BINARY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10859a[RealmFieldType.DATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10859a[RealmFieldType.DECIMAL128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10859a[RealmFieldType.OBJECT_ID.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10859a[RealmFieldType.OBJECT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10859a[RealmFieldType.LIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10859a[RealmFieldType.LINKING_OBJECTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10859a[RealmFieldType.INTEGER_LIST.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10859a[RealmFieldType.BOOLEAN_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10859a[RealmFieldType.STRING_LIST.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10859a[RealmFieldType.BINARY_LIST.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10859a[RealmFieldType.DATE_LIST.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10859a[RealmFieldType.FLOAT_LIST.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10859a[RealmFieldType.DOUBLE_LIST.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10859a[RealmFieldType.DECIMAL128_LIST.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10859a[RealmFieldType.OBJECT_ID_LIST.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public e(io.realm.a aVar, io.realm.internal.n nVar) {
        n<e> nVar2 = new n<>(this);
        this.f10858a = nVar2;
        nVar2.d = aVar;
        nVar2.f10983c = nVar;
        nVar2.f10982b = false;
    }

    public boolean equals(Object obj) {
        this.f10858a.d.e();
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f10858a.d.f10823j.f11005c;
        String str2 = eVar.f10858a.d.f10823j.f11005c;
        if (str == null ? str2 == null : str.equals(str2)) {
            String k10 = this.f10858a.f10983c.d().k();
            String k11 = eVar.f10858a.f10983c.d().k();
            if (k10 == null ? k11 == null : k10.equals(k11)) {
                return this.f10858a.f10983c.y() == eVar.f10858a.f10983c.y();
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        this.f10858a.d.e();
        n<e> nVar = this.f10858a;
        String str = nVar.d.f10823j.f11005c;
        String k10 = nVar.f10983c.d().k();
        long y = this.f10858a.f10983c.y();
        return ((((527 + (str != null ? str.hashCode() : 0)) * 31) + (k10 != null ? k10.hashCode() : 0)) * 31) + ((int) ((y >>> 32) ^ y));
    }

    @Override // io.realm.internal.l
    public void j() {
    }

    @Override // io.realm.internal.l
    public n o() {
        return this.f10858a;
    }

    public String toString() {
        String[] h10;
        this.f10858a.d.e();
        if (this.f10858a.f10983c.f()) {
            StringBuilder sb2 = new StringBuilder(a1.a.l(this.f10858a.f10983c.d().d(), " = dynamic["));
            this.f10858a.d.e();
            for (String str : this.f10858a.f10983c.h()) {
                long o10 = this.f10858a.f10983c.o(str);
                RealmFieldType w10 = this.f10858a.f10983c.w(o10);
                sb2.append("{");
                sb2.append(str);
                sb2.append(":");
                String str2 = "null";
                switch (a.f10859a[w10.ordinal()]) {
                    case 1:
                        Boolean bool = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            bool = Boolean.valueOf(this.f10858a.f10983c.i(o10));
                        }
                        sb2.append(bool);
                        break;
                    case 2:
                        Long l10 = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            l10 = Long.valueOf(this.f10858a.f10983c.j(o10));
                        }
                        sb2.append(l10);
                        break;
                    case 3:
                        Float f10 = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            f10 = Float.valueOf(this.f10858a.f10983c.t(o10));
                        }
                        sb2.append(f10);
                        break;
                    case 4:
                        Double d = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            d = Double.valueOf(this.f10858a.f10983c.s(o10));
                        }
                        sb2.append(d);
                        break;
                    case 5:
                        sb2.append(this.f10858a.f10983c.u(o10));
                        break;
                    case 6:
                        sb2.append(Arrays.toString(this.f10858a.f10983c.r(o10)));
                        break;
                    case 7:
                        Date date = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            date = this.f10858a.f10983c.m(o10);
                        }
                        sb2.append(date);
                        break;
                    case 8:
                        Decimal128 decimal128 = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            decimal128 = this.f10858a.f10983c.b(o10);
                        }
                        sb2.append(decimal128);
                        break;
                    case 9:
                        ObjectId objectId = str2;
                        if (!this.f10858a.f10983c.n(o10)) {
                            objectId = this.f10858a.f10983c.g(o10);
                        }
                        sb2.append(objectId);
                        break;
                    case 10:
                        String str3 = str2;
                        if (!this.f10858a.f10983c.p(o10)) {
                            str3 = this.f10858a.f10983c.d().j(o10).d();
                        }
                        sb2.append(str3);
                        break;
                    case 11:
                        sb2.append(String.format(Locale.US, "RealmList<%s>[%s]", this.f10858a.f10983c.d().j(o10).d(), Long.valueOf(this.f10858a.f10983c.k(o10).a())));
                        break;
                    case 12:
                    default:
                        sb2.append("?");
                        break;
                    case 13:
                        sb2.append(String.format(Locale.US, "RealmList<Long>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 14:
                        sb2.append(String.format(Locale.US, "RealmList<Boolean>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 15:
                        sb2.append(String.format(Locale.US, "RealmList<String>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 16:
                        sb2.append(String.format(Locale.US, "RealmList<byte[]>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 17:
                        sb2.append(String.format(Locale.US, "RealmList<Date>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 18:
                        sb2.append(String.format(Locale.US, "RealmList<Float>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 19:
                        sb2.append(String.format(Locale.US, "RealmList<Double>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 20:
                        sb2.append(String.format(Locale.US, "RealmList<Decimal128>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                    case 21:
                        sb2.append(String.format(Locale.US, "RealmList<ObjectId>[%s]", Long.valueOf(this.f10858a.f10983c.v(o10, w10).a())));
                        break;
                }
                sb2.append("},");
            }
            sb2.replace(sb2.length() - 1, sb2.length(), BuildConfig.FLAVOR);
            sb2.append("]");
            return sb2.toString();
        }
        return "Invalid object";
    }

    public final void x(String str) {
        z i10 = this.f10858a.d.i();
        this.f10858a.d.e();
        String d = this.f10858a.f10983c.d().d();
        Objects.requireNonNull(i10);
        String l10 = Table.l(d);
        x xVar = i10.d.get(l10);
        if (xVar == null || !xVar.f11032c.n() || !xVar.d().equals(d)) {
            if (!i10.f11038e.n.hasTable(l10)) {
                throw new IllegalArgumentException(android.support.v4.media.b.j("The class ", d, " doesn't exist in this Realm."));
            }
            io.realm.a aVar = i10.f11038e;
            xVar = new f(aVar, i10, aVar.n.getTable(l10));
            i10.d.put(l10, xVar);
        }
        if (OsObjectStore.b(xVar.f11031b.n, xVar.d()) != null) {
            String b10 = OsObjectStore.b(xVar.f11031b.n, xVar.d());
            if (b10 != null) {
                if (b10.equals(str)) {
                    throw new IllegalArgumentException(String.format(Locale.US, "Primary key field '%s' cannot be changed after object was created.", str));
                }
                return;
            }
            throw new IllegalStateException(xVar.d() + " doesn't have a primary key.");
        }
    }

    public void y(String str, String str2) {
        this.f10858a.d.e();
        x(str);
        this.f10858a.f10983c.c(this.f10858a.f10983c.o(str), str2);
    }
}
