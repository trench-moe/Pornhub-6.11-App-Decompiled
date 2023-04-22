package f7;

import c7.g;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k8.t;

/* loaded from: classes.dex */
public final class b extends TagPayloadReader {

    /* renamed from: b  reason: collision with root package name */
    public long f9477b;

    /* renamed from: c  reason: collision with root package name */
    public long[] f9478c;
    public long[] d;

    public b() {
        super(new g());
        this.f9477b = -9223372036854775807L;
        this.f9478c = new long[0];
        this.d = new long[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object d(t tVar, int i10) {
        if (i10 == 0) {
            return Double.valueOf(Double.longBitsToDouble(tVar.m()));
        }
        int i11 = 0;
        if (i10 == 1) {
            boolean z10 = i11;
            if (tVar.s() == 1) {
                z10 = 1;
            }
            return Boolean.valueOf(z10);
        } else if (i10 == 2) {
            return f(tVar);
        } else {
            if (i10 != 3) {
                if (i10 != 8) {
                    if (i10 != 10) {
                        if (i10 != 11) {
                            return null;
                        }
                        Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(tVar.m())).doubleValue());
                        tVar.E(2);
                        return date;
                    }
                    int v2 = tVar.v();
                    ArrayList arrayList = new ArrayList(v2);
                    for (int i12 = i11; i12 < v2; i12++) {
                        Object d = d(tVar, tVar.s());
                        if (d != null) {
                            arrayList.add(d);
                        }
                    }
                    return arrayList;
                }
                return e(tVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String f10 = f(tVar);
                int s10 = tVar.s();
                if (s10 == 9) {
                    return hashMap;
                }
                Object d10 = d(tVar, s10);
                if (d10 != null) {
                    hashMap.put(f10, d10);
                }
            }
        }
    }

    public static HashMap<String, Object> e(t tVar) {
        int v2 = tVar.v();
        HashMap<String, Object> hashMap = new HashMap<>(v2);
        for (int i10 = 0; i10 < v2; i10++) {
            String f10 = f(tVar);
            Object d = d(tVar, tVar.s());
            if (d != null) {
                hashMap.put(f10, d);
            }
        }
        return hashMap;
    }

    public static String f(t tVar) {
        int x10 = tVar.x();
        int i10 = tVar.f12010b;
        tVar.E(x10);
        return new String(tVar.f12009a, i10, x10);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean b(t tVar) {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public boolean c(t tVar, long j10) {
        if (tVar.s() == 2 && "onMetaData".equals(f(tVar)) && tVar.s() == 8) {
            HashMap<String, Object> e10 = e(tVar);
            Object obj = e10.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > 0.0d) {
                    this.f9477b = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = e10.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f9478c = new long[size];
                    this.d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.f9478c = new long[0];
                            this.d = new long[0];
                            break;
                        }
                        this.f9478c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.d[i10] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }
}
