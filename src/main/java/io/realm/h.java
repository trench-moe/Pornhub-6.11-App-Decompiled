package io.realm;

import io.realm.internal.CheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.OsResults;
import io.realm.internal.Table;
import io.realm.internal.core.DescriptorOrdering;
import io.realm.x;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class h extends x {

    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f10860a;

        static {
            int[] iArr = new int[RealmFieldType.values().length];
            f10860a = iArr;
            try {
                iArr[RealmFieldType.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10860a[RealmFieldType.DATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(io.realm.a aVar, z zVar, Table table) {
        super(aVar, zVar, table, new x.a(table));
    }

    public static boolean l(FieldAttribute[] fieldAttributeArr, FieldAttribute fieldAttribute) {
        if (fieldAttributeArr != null && fieldAttributeArr.length != 0) {
            for (FieldAttribute fieldAttribute2 : fieldAttributeArr) {
                if (fieldAttribute2 == fieldAttribute) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // io.realm.x
    public x a(String str, Class<?> cls, FieldAttribute... fieldAttributeArr) {
        x.b bVar = x.d.get(cls);
        boolean z10 = false;
        if (bVar == null) {
            if (x.f11029e.containsKey(cls)) {
                throw new IllegalArgumentException(a1.a.l("Use addRealmObjectField() instead to add fields that link to other RealmObjects: ", str));
            }
            if (u.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Use 'addRealmObjectField()' instead to add fields that link to other RealmObjects: %s(%s)", str, cls));
            }
            throw new IllegalArgumentException(String.format(Locale.US, "Realm doesn't support this field type: %s(%s)", str, cls));
        }
        FieldAttribute fieldAttribute = FieldAttribute.PRIMARY_KEY;
        if (l(fieldAttributeArr, fieldAttribute)) {
            Objects.requireNonNull(this.f11031b.f10823j);
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                k(str, RealmFieldType.BOOLEAN);
            }
            if (cls == Date.class) {
                k(str, RealmFieldType.DATE);
            }
        }
        x.c(str);
        if (this.f11032c.f(str) != -1) {
            StringBuilder m10 = a1.a.m("Field already exists in '");
            m10.append(d());
            m10.append("': ");
            m10.append(str);
            throw new IllegalArgumentException(m10.toString());
        }
        boolean z11 = bVar.f11034b;
        if (l(fieldAttributeArr, FieldAttribute.REQUIRED)) {
            z11 = false;
        }
        long a10 = this.f11032c.a(bVar.f11033a, str, z11);
        try {
            if (fieldAttributeArr.length > 0) {
                if (l(fieldAttributeArr, FieldAttribute.INDEXED)) {
                    i(str);
                    z10 = true;
                }
                if (l(fieldAttributeArr, fieldAttribute)) {
                    j(str);
                }
            }
            return this;
        } catch (Exception e10) {
            try {
                long e11 = e(str);
                if (z10) {
                    this.f11032c.q(e11);
                }
                throw ((RuntimeException) e10);
            } catch (Exception e12) {
                this.f11032c.p(a10);
                throw e12;
            }
        }
    }

    @Override // io.realm.x
    public ee.c f(String str, RealmFieldType... realmFieldTypeArr) {
        a0 a0Var = new a0(this.f11030a);
        Table table = this.f11032c;
        Pattern pattern = ee.c.f9313h;
        return ee.c.c(a0Var, table, str, null, new HashSet(Arrays.asList(realmFieldTypeArr)));
    }

    @Override // io.realm.x
    public x g(String str) {
        Objects.requireNonNull(this.f11031b.f10823j);
        x.c(str);
        if (this.f11032c.f(str) != -1) {
            long e10 = e(str);
            String d = d();
            if (str.equals(OsObjectStore.b(this.f11031b.n, d))) {
                OsObjectStore.d(this.f11031b.n, d, str);
            }
            this.f11032c.p(e10);
            return this;
        }
        throw new IllegalStateException(a1.a.l(str, " does not exist."));
    }

    @Override // io.realm.x
    public x h(x.c cVar) {
        OsResults d = OsResults.c(this.f11031b.n, this.f11032c.u(), new DescriptorOrdering()).d();
        long k10 = d.k();
        if (k10 <= 2147483647L) {
            int k11 = (int) d.k();
            for (int i10 = 0; i10 < k11; i10++) {
                e eVar = new e(this.f11031b, new CheckedRow(d.f(i10)));
                if (v.w(eVar)) {
                    cVar.d(eVar);
                }
            }
            return this;
        }
        throw new UnsupportedOperationException(android.support.v4.media.b.h("Too many results to iterate: ", k10));
    }

    public x i(String str) {
        x.c(str);
        b(str);
        long e10 = e(str);
        if (this.f11032c.m(e10)) {
            throw new IllegalStateException(a1.a.l(str, " already has an index."));
        }
        this.f11032c.b(e10);
        return this;
    }

    public x j(String str) {
        Objects.requireNonNull(this.f11031b.f10823j);
        x.c(str);
        b(str);
        String b10 = OsObjectStore.b(this.f11031b.n, d());
        if (b10 == null) {
            long e10 = e(str);
            RealmFieldType i10 = this.f11032c.i(e(str));
            k(str, i10);
            if (i10 != RealmFieldType.STRING && !this.f11032c.m(e10)) {
                this.f11032c.b(e10);
            }
            OsObjectStore.d(this.f11031b.n, d(), str);
            return this;
        }
        throw new IllegalStateException(String.format(Locale.ENGLISH, "Field '%s' has been already defined as primary key.", b10));
    }

    public final void k(String str, RealmFieldType realmFieldType) {
        int i10 = a.f10860a[realmFieldType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException(a1.a.l("Boolean fields cannot be marked as primary keys: ", str));
        }
        if (i10 == 2) {
            throw new IllegalArgumentException(a1.a.l("Date fields cannot be marked as primary keys: ", str));
        }
    }
}
