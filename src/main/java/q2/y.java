package q2;

import android.content.Context;
import com.app.pornhub.data.util.AppManager;
import com.app.pornhub.data.util.JNI;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14312a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.b f14313b;

    /* renamed from: c  reason: collision with root package name */
    public final ie.a f14314c;

    public /* synthetic */ y(a0.b bVar, ie.a aVar, int i10) {
        this.f14312a = i10;
        this.f14313b = bVar;
        this.f14314c = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14312a) {
            case 0:
                a0.b bVar = this.f14313b;
                AppManager appManager = (AppManager) this.f14314c.get();
                Objects.requireNonNull(bVar);
                Intrinsics.checkNotNullParameter(appManager, "appManager");
                return new JNI(appManager);
            default:
                a0.b bVar2 = this.f14313b;
                Context context = (Context) this.f14314c.get();
                Objects.requireNonNull(bVar2);
                Intrinsics.checkNotNullParameter(context, "context");
                return new p2.e(context);
        }
    }
}
