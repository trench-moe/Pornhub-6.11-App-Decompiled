package i8;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import k8.v;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ c f10587f = new c(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ c f10588j = new c(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ c f10589m = new c(2);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10590c;

    public /* synthetic */ c(int i10) {
        this.f10590c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10590c) {
            case 0:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int[] iArr = e.f10595f;
                return 0;
            case 1:
                Comparator<v.b> comparator = v.f12015h;
                return Float.compare(((v.b) obj).f12025c, ((v.b) obj2).f12025c);
            default:
                Charset charset = ac.b.d;
                String name = ((File) obj).getName();
                int i10 = ac.b.f345e;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
        }
    }
}
