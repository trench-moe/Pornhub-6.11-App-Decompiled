package ee;

import com.appsflyer.oaid.BuildConfig;
import io.realm.RealmFieldType;
import io.realm.a0;
import io.realm.internal.Table;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f9313h = Pattern.compile("\\.");

    /* renamed from: i  reason: collision with root package name */
    public static final Set<RealmFieldType> f9314i;

    /* renamed from: j  reason: collision with root package name */
    public static final Set<RealmFieldType> f9315j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<RealmFieldType> f9316k;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f9317a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<RealmFieldType> f9318b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<RealmFieldType> f9319c;
    public String d;

    /* renamed from: e  reason: collision with root package name */
    public RealmFieldType f9320e;

    /* renamed from: f  reason: collision with root package name */
    public long[] f9321f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f9322g;

    /* loaded from: classes2.dex */
    public interface a {
    }

    static {
        HashSet hashSet = new HashSet(3);
        RealmFieldType realmFieldType = RealmFieldType.OBJECT;
        hashSet.add(realmFieldType);
        RealmFieldType realmFieldType2 = RealmFieldType.LIST;
        hashSet.add(realmFieldType2);
        hashSet.add(RealmFieldType.LINKING_OBJECTS);
        f9314i = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(realmFieldType);
        hashSet2.add(realmFieldType2);
        f9315j = Collections.unmodifiableSet(hashSet2);
        HashSet hashSet3 = new HashSet(1);
        hashSet3.add(realmFieldType2);
        Collections.unmodifiableSet(hashSet3);
        HashSet hashSet4 = new HashSet(1);
        hashSet4.add(realmFieldType);
        f9316k = Collections.unmodifiableSet(hashSet4);
        Collections.emptySet();
    }

    public c(String str, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            throw new IllegalArgumentException("Invalid query: field name is empty");
        }
        int lastIndexOf = str.lastIndexOf(".");
        if (lastIndexOf == str.length() - 1) {
            throw new IllegalArgumentException("Invalid query: field name must not end with a period ('.')");
        }
        List<String> asList = lastIndexOf > -1 ? Arrays.asList(f9313h.split(str)) : Collections.singletonList(str);
        this.f9317a = asList;
        if (asList.size() <= 0) {
            throw new IllegalArgumentException("Invalid query: Empty field descriptor");
        }
        this.f9318b = set;
        this.f9319c = set2;
    }

    public static c c(a aVar, Table table, String str, Set<RealmFieldType> set, Set<RealmFieldType> set2) {
        c bVar;
        if (aVar != null) {
            if (((a0) aVar).f10832a.f11039f != null) {
                String d = table.d();
                if (set == null) {
                    set = f9314i;
                }
                bVar = new ee.a(aVar, d, str, set, set2);
                return bVar;
            }
        }
        if (set == null) {
            set = f9315j;
        }
        bVar = new b(table, str, set, set2);
        return bVar;
    }

    public abstract void a(List<String> list);

    public final void b() {
        if (this.f9320e == null) {
            a(this.f9317a);
        }
    }

    public final long[] d() {
        b();
        long[] jArr = this.f9321f;
        return Arrays.copyOf(jArr, jArr.length);
    }

    public final void e(String str, String str2, RealmFieldType realmFieldType, long[] jArr, long[] jArr2) {
        Set<RealmFieldType> set = this.f9319c;
        if (set != null && set.size() > 0) {
            f(str, str2, realmFieldType, this.f9319c);
        }
        this.d = str2;
        this.f9320e = realmFieldType;
        this.f9321f = jArr;
        this.f9322g = jArr2;
    }

    public final void f(String str, String str2, RealmFieldType realmFieldType, Set<RealmFieldType> set) {
        if (!set.contains(realmFieldType)) {
            throw new IllegalArgumentException(String.format(Locale.US, "Invalid query: field '%s' in class '%s' is of invalid type '%s'.", str2, str, realmFieldType.toString()));
        }
    }
}
