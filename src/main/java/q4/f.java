package q4;

import android.view.View;
import com.app.pornhub.databinding.ItemPlaylistBindingBinding;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import i8.e;
import i8.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import k8.c0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import q4.d;
import r4.c;
import w7.o;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14365c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14366f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14367j;

    public /* synthetic */ f(Object obj, Object obj2, int i10) {
        this.f14365c = i10;
        this.f14366f = obj;
        this.f14367j = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i8.e eVar;
        Function2<Playlist, r4.c, Unit> function2;
        switch (this.f14365c) {
            case 0:
                d this$0 = (d) this.f14366f;
                d.e item = (d.e) this.f14367j;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(item, "$item");
                d.a aVar = this$0.f14349m;
                if (aVar == null) {
                    return;
                }
                aVar.c(item.f14356c);
                return;
            case 1:
                ItemPlaylistBindingBinding binding = (ItemPlaylistBindingBinding) this.f14366f;
                r4.e this$02 = (r4.e) this.f14367j;
                Intrinsics.checkNotNullParameter(binding, "$binding");
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Playlist playlist = binding.f4758x;
                if (playlist == null || (function2 = this$02.f14663f) == null) {
                    return;
                }
                function2.invoke(playlist, c.C0253c.f14658a);
                return;
            default:
                StyledPlayerControlView.l lVar = (StyledPlayerControlView.l) this.f14366f;
                StyledPlayerControlView.k kVar = (StyledPlayerControlView.k) this.f14367j;
                if (lVar.f6560f == null || (eVar = StyledPlayerControlView.this.G0) == null) {
                    return;
                }
                e.C0154e a10 = eVar.d().a();
                for (int i10 = 0; i10 < lVar.d.size(); i10++) {
                    int intValue = lVar.d.get(i10).intValue();
                    if (intValue == kVar.f6555a) {
                        h.a aVar2 = lVar.f6560f;
                        Objects.requireNonNull(aVar2);
                        o oVar = aVar2.f10634c[intValue];
                        e.f fVar = new e.f(kVar.f6556b, kVar.f6557c);
                        Map<o, e.f> map = a10.H.get(intValue);
                        if (map == null) {
                            map = new HashMap<>();
                            a10.H.put(intValue, map);
                        }
                        if (!map.containsKey(oVar) || !c0.a(map.get(oVar), fVar)) {
                            map.put(oVar, fVar);
                        }
                        a10.g(intValue, false);
                    } else {
                        a10.e(intValue);
                        a10.g(intValue, true);
                    }
                }
                i8.e eVar2 = StyledPlayerControlView.this.G0;
                Objects.requireNonNull(eVar2);
                eVar2.i(a10);
                lVar.p(kVar.d);
                StyledPlayerControlView.this.D0.dismiss();
                return;
        }
    }
}
