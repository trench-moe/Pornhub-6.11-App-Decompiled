package vb;

import java.io.File;
import java.io.FilenameFilter;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements FilenameFilter {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ g f16129b = new g(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ g f16130c = new g(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16131a;

    public /* synthetic */ g(int i10) {
        this.f16131a = i10;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f16131a) {
            case 0:
                return str.startsWith(".ae");
            default:
                Charset charset = ac.b.d;
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
