package ee;

import ee.c;
import io.realm.RealmFieldType;
import io.realm.a0;
import io.realm.internal.c;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: l  reason: collision with root package name */
    public final c.a f9310l;

    /* renamed from: m  reason: collision with root package name */
    public final String f9311m;

    public a(c.a aVar, String str, String str2, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        super(str2, set, set2);
        this.f9311m = str;
        this.f9310l = aVar;
    }

    @Override // ee.c
    public void a(List<String> list) {
        long j10;
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        String str = null;
        RealmFieldType realmFieldType = null;
        String str2 = this.f9311m;
        int i10 = 0;
        while (i10 < size) {
            str = list.get(i10);
            if (str == null || str.length() <= 0) {
                throw new IllegalArgumentException("Invalid query: Field descriptor contains an empty field.  A field description may not begin with or contain adjacent periods ('.').");
            }
            c.a d = ((a0) this.f9310l).f10832a.c(str2).d(str);
            if (d == null) {
                throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' not found in class '%s'.", str, str2));
            }
            RealmFieldType realmFieldType2 = d.f10948b;
            if (i10 < size - 1) {
                f(str2, str, realmFieldType2, this.f9318b);
                str2 = d.f10949c;
            }
            jArr[i10] = d.f10947a;
            if (realmFieldType2 != RealmFieldType.LINKING_OBJECTS) {
                j10 = 0;
            } else {
                j10 = ((a0) this.f9310l).f10832a.f(d.f10949c).f10927c;
            }
            jArr2[i10] = j10;
            i10++;
            realmFieldType = realmFieldType2;
        }
        e(str2, str, realmFieldType, jArr, jArr2);
    }
}
