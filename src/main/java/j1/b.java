package j1;

import android.content.pm.ResolveInfo;
import android.media.MediaRoute2Info;
import java.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ b f11134b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ b f11135c = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11136a;

    public /* synthetic */ b(int i10) {
        this.f11136a = i10;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f11136a) {
            case 0:
                return u.b((MediaRoute2Info) obj);
            default:
                return ((ResolveInfo) obj).serviceInfo;
        }
    }
}
