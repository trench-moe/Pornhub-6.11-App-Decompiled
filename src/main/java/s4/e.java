package s4;

import com.app.pornhub.view.common.widget.NotifyingGridLayoutManager;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.google.android.exoplayer2.audio.a;
import com.google.android.exoplayer2.drm.c;
import k8.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import l8.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14826c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14827f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14828j;

    public /* synthetic */ e(Object obj, Object obj2, int i10) {
        this.f14826c = i10;
        this.f14827f = obj;
        this.f14828j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14826c) {
            case 0:
                NotifyingGridLayoutManager layoutManager = (NotifyingGridLayoutManager) this.f14827f;
                PerformersFragment this$0 = (PerformersFragment) this.f14828j;
                KProperty<Object>[] kPropertyArr = PerformersFragment.f5282v0;
                Intrinsics.checkNotNullParameter(layoutManager, "$layoutManager");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                layoutManager.m0(this$0.f5288u0);
                return;
            case 1:
                com.google.android.exoplayer2.audio.a aVar = ((a.C0078a) this.f14827f).f5990b;
                int i10 = c0.f11939a;
                aVar.V((Exception) this.f14828j);
                return;
            case 2:
                c.a aVar2 = (c.a) this.f14827f;
                ((com.google.android.exoplayer2.drm.c) this.f14828j).d0(aVar2.f6181a, aVar2.f6182b);
                return;
            default:
                r rVar = ((r.a) this.f14827f).f12741b;
                int i11 = c0.f11939a;
                rVar.X((Exception) this.f14828j);
                return;
        }
    }
}
