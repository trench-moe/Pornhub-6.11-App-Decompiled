package z7;

import h8.e;
import java.util.Comparator;
import z7.c;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ b f21868f = new b(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ b f21869j = new b(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f21870c;

    public /* synthetic */ b(int i10) {
        this.f21870c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f21870c) {
            case 0:
                return Integer.compare(((c.a) obj2).f21881b, ((c.a) obj).f21881b);
            default:
                return Integer.compare(((e.b) obj).f10251a.f10254b, ((e.b) obj2).f10251a.f10254b);
        }
    }
}
