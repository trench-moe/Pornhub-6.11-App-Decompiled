package io.realm.internal.core;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import ee.c;
import io.realm.RealmFieldType;
import io.realm.Sort;
import io.realm.internal.Keep;
import io.realm.internal.Table;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

@Keep
/* loaded from: classes2.dex */
public class QueryDescriptor {
    public static final Set<RealmFieldType> DISTINCT_VALID_FIELD_TYPES;
    public static final Set<RealmFieldType> DISTINCT_VALID_LINK_FIELD_TYPES;
    public static final Set<RealmFieldType> SORT_VALID_FIELD_TYPES;
    private final boolean[] ascendings;
    private final long[][] columnKeys;
    private final Table table;

    static {
        RealmFieldType realmFieldType = RealmFieldType.BOOLEAN;
        RealmFieldType realmFieldType2 = RealmFieldType.INTEGER;
        RealmFieldType realmFieldType3 = RealmFieldType.FLOAT;
        RealmFieldType realmFieldType4 = RealmFieldType.DOUBLE;
        RealmFieldType realmFieldType5 = RealmFieldType.STRING;
        RealmFieldType realmFieldType6 = RealmFieldType.DATE;
        RealmFieldType realmFieldType7 = RealmFieldType.DECIMAL128;
        RealmFieldType realmFieldType8 = RealmFieldType.OBJECT_ID;
        SORT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(realmFieldType, realmFieldType2, realmFieldType3, realmFieldType4, realmFieldType5, realmFieldType6, realmFieldType7, realmFieldType8)));
        RealmFieldType realmFieldType9 = RealmFieldType.OBJECT;
        RealmFieldType realmFieldType10 = RealmFieldType.LINKING_OBJECTS;
        DISTINCT_VALID_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(realmFieldType, realmFieldType2, realmFieldType5, RealmFieldType.BINARY, realmFieldType6, realmFieldType3, realmFieldType4, realmFieldType7, realmFieldType8, realmFieldType9, realmFieldType10)));
        DISTINCT_VALID_LINK_FIELD_TYPES = Collections.unmodifiableSet(new HashSet(Arrays.asList(realmFieldType9, realmFieldType10)));
    }

    private QueryDescriptor(Table table, long[][] jArr, Sort[] sortArr) {
        this.table = table;
        this.columnKeys = jArr;
        if (sortArr == null) {
            this.ascendings = null;
            return;
        }
        this.ascendings = new boolean[sortArr.length];
        for (int i10 = 0; i10 < sortArr.length; i10++) {
            this.ascendings[i10] = sortArr[i10].b();
        }
    }

    private static void checkFieldType(c cVar, Set<RealmFieldType> set, String str, String str2) {
        cVar.b();
        if (set.contains(cVar.f9320e)) {
            return;
        }
        Locale locale = Locale.US;
        cVar.b();
        cVar.b();
        throw new IllegalArgumentException(String.format(locale, "%s on '%s' field '%s' in '%s'.", str, cVar.f9320e, cVar.d, str2));
    }

    private static QueryDescriptor getInstance(c.a aVar, Table table, String[] strArr, Sort[] sortArr, Set<RealmFieldType> set, Set<RealmFieldType> set2, String str) {
        if (strArr == null || strArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one field name.");
        }
        long[][] jArr = new long[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            c c10 = c.c(aVar, table, strArr[i10], set, null);
            checkFieldType(c10, set2, str, strArr[i10]);
            jArr[i10] = c10.d();
        }
        return new QueryDescriptor(table, jArr, sortArr);
    }

    public static QueryDescriptor getInstanceForDistinct(c.a aVar, Table table, String str) {
        return getInstanceForDistinct(aVar, table, new String[]{str});
    }

    public static QueryDescriptor getInstanceForDistinct(c.a aVar, Table table, String[] strArr) {
        return getInstance(aVar, table, strArr, null, DISTINCT_VALID_LINK_FIELD_TYPES, DISTINCT_VALID_FIELD_TYPES, "Distinct is not supported");
    }

    public static QueryDescriptor getInstanceForSort(c.a aVar, Table table, String str, Sort sort) {
        return getInstanceForSort(aVar, table, new String[]{str}, new Sort[]{sort});
    }

    public static QueryDescriptor getInstanceForSort(c.a aVar, Table table, String[] strArr, Sort[] sortArr) {
        if (sortArr == null || sortArr.length == 0) {
            throw new IllegalArgumentException("You must provide at least one sort order.");
        }
        if (strArr.length == sortArr.length) {
            return getInstance(aVar, table, strArr, sortArr, c.f9316k, SORT_VALID_FIELD_TYPES, "Sort is not supported");
        }
        throw new IllegalArgumentException("Number of fields and sort orders do not match.");
    }

    private long getTablePtr() {
        return this.table.f10927c;
    }

    public static QueryDescriptor getTestInstance(Table table, long[] jArr) {
        return new QueryDescriptor(table, new long[][]{jArr}, null);
    }

    @SuppressFBWarnings({"EI_EXPOSE_REP"})
    public boolean[] getAscendings() {
        return this.ascendings;
    }

    @SuppressFBWarnings({"EI_EXPOSE_REP"})
    public long[][] getColumnKeys() {
        return this.columnKeys;
    }
}
