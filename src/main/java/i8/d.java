package i8;

import com.google.android.exoplayer2.ui.d;
import java.util.Comparator;
import k8.v;
import xb.a0;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ d f10591f = new d(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ d f10592j = new d(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ d f10593m = new d(2);
    public static final /* synthetic */ d n = new d(3);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10594c;

    public /* synthetic */ d(int i10) {
        this.f10594c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10594c) {
            case 0:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = e.f10595f;
                int i10 = -1;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                } else if (num2.intValue() == -1) {
                    return 1;
                } else {
                    i10 = num.intValue() - num2.intValue();
                }
                return i10;
            case 1:
                d.c cVar = (d.c) obj;
                d.c cVar2 = (d.c) obj2;
                int compare = Integer.compare(cVar2.f6610a, cVar.f6610a);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = cVar2.f6612c.compareTo(cVar.f6612c);
                return compareTo != 0 ? compareTo : cVar2.d.compareTo(cVar.d);
            case 2:
                Comparator<v.b> comparator = v.f12015h;
                return ((v.b) obj).f12023a - ((v.b) obj2).f12023a;
            default:
                return ((a0.c) obj).a().compareTo(((a0.c) obj2).a());
        }
    }
}
