package ee;

import io.realm.RealmFieldType;
import io.realm.internal.Table;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: l  reason: collision with root package name */
    public final Table f9312l;

    public b(Table table, String str, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        super(str, set, set2);
        this.f9312l = table;
    }

    @Override // ee.c
    public void a(List<String> list) {
        int size = list.size();
        long[] jArr = new long[size];
        Table table = this.f9312l;
        String str = null;
        String str2 = null;
        RealmFieldType realmFieldType = null;
        for (int i10 = 0; i10 < size; i10++) {
            str2 = list.get(i10);
            if (str2 == null || str2.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            str = table.d();
            long f10 = table.f(str2);
            if (f10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in table '%s'.", str2, str));
            }
            realmFieldType = table.i(f10);
            if (i10 < size - 1) {
                f(str, str2, realmFieldType, this.f9318b);
                table = table.j(f10);
            }
            jArr[i10] = f10;
        }
        e(str, str2, realmFieldType, jArr, new long[size]);
    }
}
