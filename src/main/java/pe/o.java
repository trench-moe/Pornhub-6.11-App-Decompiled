package pe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class o implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {

    /* renamed from: f  reason: collision with root package name */
    public static final b f13982f = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public final String[] f13983c;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f13984a = new ArrayList(20);

        public final a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            b bVar = o.f13982f;
            bVar.a(name);
            bVar.b(value, name);
            b(name, value);
            return this;
        }

        public final a b(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f13984a.add(name);
            this.f13984a.add(StringsKt.trim((CharSequence) value).toString());
            return this;
        }

        public final o c() {
            Object[] array = this.f13984a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new o((String[]) array, null);
        }

        public final a d(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            int i10 = 0;
            while (i10 < this.f13984a.size()) {
                if (StringsKt.equals(name, this.f13984a.get(i10), true)) {
                    this.f13984a.remove(i10);
                    this.f13984a.remove(i10);
                    i10 -= 2;
                }
                i10 += 2;
            }
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void a(String str) {
            if (!(str.length() > 0)) {
                throw new IllegalArgumentException("name is empty".toString());
            }
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!('!' <= charAt && '~' >= charAt)) {
                    throw new IllegalArgumentException(qe.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str).toString());
                }
            }
        }

        public final void b(String str, String str2) {
            int length = str.length();
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = str.charAt(i10);
                if (!(charAt == '\t' || (' ' <= charAt && '~' >= charAt))) {
                    throw new IllegalArgumentException(qe.c.i("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i10), str2, str).toString());
                }
            }
        }

        @JvmStatic
        @JvmName(name = "of")
        public final o c(String... namesAndValues) {
            Intrinsics.checkNotNullParameter(namesAndValues, "namesAndValues");
            if (namesAndValues.length % 2 == 0) {
                Object clone = namesAndValues.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                String[] strArr = (String[]) clone;
                int length = strArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    if (!(strArr[i10] != null)) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                    String str = strArr[i10];
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    strArr[i10] = StringsKt.trim((CharSequence) str).toString();
                }
                IntProgression step = RangesKt.step(RangesKt.until(0, strArr.length), 2);
                int first = step.getFirst();
                int last = step.getLast();
                int step2 = step.getStep();
                if (step2 < 0 ? first >= last : first <= last) {
                    while (true) {
                        String str2 = strArr[first];
                        String str3 = strArr[first + 1];
                        a(str2);
                        b(str3, str2);
                        if (first == last) {
                            break;
                        }
                        first += step2;
                    }
                }
                return new o(strArr, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public o(String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13983c = strArr;
    }

    public final String b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f13983c;
        IntProgression step = RangesKt.step(RangesKt.downTo(strArr.length - 2, 0), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (!StringsKt.equals(name, strArr[first], true)) {
                if (first != last) {
                    first += step2;
                }
            }
            return strArr[first + 1];
        }
        return null;
    }

    public final String e(int i10) {
        return this.f13983c[i10 * 2];
    }

    public boolean equals(Object obj) {
        return (obj instanceof o) && Arrays.equals(this.f13983c, ((o) obj).f13983c);
    }

    public final a g() {
        a aVar = new a();
        CollectionsKt.addAll(aVar.f13984a, this.f13983c);
        return aVar;
    }

    public final String h(int i10) {
        return this.f13983c[(i10 * 2) + 1];
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13983c);
    }

    @Override // java.lang.Iterable
    public Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.to(e(i10), h(i10));
        }
        return ArrayIteratorKt.iterator(pairArr);
    }

    @JvmName(name = "size")
    public final int size() {
        return this.f13983c.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(e(i10));
            sb2.append(": ");
            sb2.append(h(i10));
            sb2.append("\n");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
