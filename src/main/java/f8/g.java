package f8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;
import y7.a;

/* loaded from: classes.dex */
public final class g implements y7.d {

    /* renamed from: c  reason: collision with root package name */
    public final d f9539c;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f9540f;

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, f> f9541j;

    /* renamed from: m  reason: collision with root package name */
    public final Map<String, e> f9542m;
    public final Map<String, String> n;

    public g(d dVar, Map<String, f> map, Map<String, e> map2, Map<String, String> map3) {
        this.f9539c = dVar;
        this.f9542m = map2;
        this.n = map3;
        this.f9541j = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i10 = 0;
        dVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        this.f9540f = jArr;
    }

    @Override // y7.d
    public int b(long j10) {
        int b10 = c0.b(this.f9540f, j10, false, false);
        if (b10 < this.f9540f.length) {
            return b10;
        }
        return -1;
    }

    @Override // y7.d
    public long c(int i10) {
        return this.f9540f[i10];
    }

    @Override // y7.d
    public List<y7.a> d(long j10) {
        a[] aVarArr;
        d dVar = this.f9539c;
        Map<String, f> map = this.f9541j;
        Map<String, e> map2 = this.f9542m;
        Map<String, String> map3 = this.n;
        Objects.requireNonNull(dVar);
        ArrayList arrayList = new ArrayList();
        dVar.h(j10, dVar.f9507h, arrayList);
        TreeMap treeMap = new TreeMap();
        dVar.j(j10, false, dVar.f9507h, treeMap);
        dVar.i(j10, map, map2, dVar.f9507h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                e eVar = map2.get(pair.first);
                Objects.requireNonNull(eVar);
                arrayList2.add(new y7.a(null, null, null, decodeByteArray, eVar.f9515c, 0, eVar.f9516e, eVar.f9514b, 0, IntCompanionObject.MIN_VALUE, -3.4028235E38f, eVar.f9517f, eVar.f9518g, false, -16777216, eVar.f9521j, 0.0f, null));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            e eVar2 = map2.get(entry.getKey());
            Objects.requireNonNull(eVar2);
            a.b bVar = (a.b) entry.getValue();
            CharSequence charSequence = bVar.f18527a;
            Objects.requireNonNull(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (a aVar : (a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar), spannableStringBuilder.getSpanEnd(aVar), (CharSequence) BuildConfig.FLAVOR);
            }
            for (int i10 = 0; i10 < spannableStringBuilder.length(); i10++) {
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i14 = 0; i14 < spannableStringBuilder.length() - 1; i14++) {
                if (spannableStringBuilder.charAt(i14) == '\n') {
                    int i15 = i14 + 1;
                    if (spannableStringBuilder.charAt(i15) == ' ') {
                        spannableStringBuilder.delete(i15, i14 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i16 = 0; i16 < spannableStringBuilder.length() - 1; i16++) {
                if (spannableStringBuilder.charAt(i16) == ' ') {
                    int i17 = i16 + 1;
                    if (spannableStringBuilder.charAt(i17) == '\n') {
                        spannableStringBuilder.delete(i16, i17);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f10 = eVar2.f9515c;
            int i18 = eVar2.d;
            bVar.f18530e = f10;
            bVar.f18531f = i18;
            bVar.f18532g = eVar2.f9516e;
            bVar.f18533h = eVar2.f9514b;
            bVar.f18537l = eVar2.f9517f;
            float f11 = eVar2.f9520i;
            int i19 = eVar2.f9519h;
            bVar.f18536k = f11;
            bVar.f18535j = i19;
            bVar.f18540p = eVar2.f9521j;
            arrayList2.add(bVar.a());
        }
        return arrayList2;
    }

    @Override // y7.d
    public int e() {
        return this.f9540f.length;
    }
}
