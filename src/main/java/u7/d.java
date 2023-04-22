package u7;

import com.google.android.exoplayer2.ui.d;
import java.util.Comparator;
import u7.c;
import w6.y;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ d f15621f = new d(1);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ d f15622j = new d(2);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15623c;

    public /* synthetic */ d(int i10) {
        this.f15623c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f15623c) {
            case 0:
                c.b bVar = (c.b) obj;
                c.b bVar2 = (c.b) obj2;
                return kb.e.f12046a.b(bVar.f15618c, bVar2.f15618c).b(bVar.f15619f, bVar2.f15619f).a(bVar.f15620j, bVar2.f15620j).f();
            case 1:
                return ((y) obj2).f16868w - ((y) obj).f16868w;
            default:
                d.c cVar = (d.c) obj;
                d.c cVar2 = (d.c) obj2;
                int compare = Integer.compare(cVar2.f6611b, cVar.f6611b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = cVar.f6612c.compareTo(cVar2.f6612c);
                return compareTo != 0 ? compareTo : cVar.d.compareTo(cVar2.d);
        }
    }
}
