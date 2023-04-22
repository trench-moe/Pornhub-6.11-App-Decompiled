package h8;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Comparator {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ h f10269f = new h(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ h f10270j = new h(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f10271c;

    public /* synthetic */ h(int i10) {
        this.f10271c = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10271c) {
            case 0:
                return Long.compare(((d) obj).f10245b, ((d) obj2).f10245b);
            default:
                Charset charset = ac.b.d;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
