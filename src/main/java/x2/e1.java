package x2;

import android.view.MenuItem;
import androidx.appcompat.widget.e0;
import com.app.pornhub.R;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import i4.f;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;
import k8.m;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import r4.c;
import t6.a;
import w6.n0;
import x6.c0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements ObservableOnSubscribe, f.b, e0.a, a.InterfaceC0268a, m.a {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17716c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f17717f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f17718j;

    public /* synthetic */ e1(Object obj, Object obj2, int i10) {
        this.f17716c = i10;
        this.f17717f = obj;
        this.f17718j = obj2;
    }

    @Override // t6.a.InterfaceC0268a
    public Object e() {
        r6.i iVar = (r6.i) this.f17717f;
        Objects.requireNonNull(iVar);
        for (Map.Entry entry : ((Map) this.f17718j).entrySet()) {
            iVar.f14709i.e(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    @Override // k8.m.a
    public void invoke(Object obj) {
        switch (this.f17716c) {
            case 4:
                ((n0.c) obj).W(((w6.l0) this.f17717f).f16665h, (i8.j) this.f17718j);
                return;
            case 5:
                c0.a aVar = (c0.a) this.f17717f;
                l8.s sVar = (l8.s) this.f17718j;
                x6.c0 c0Var = (x6.c0) obj;
                c0Var.d(aVar, sVar);
                c0Var.j0(aVar, sVar.f12743a, sVar.f12744b, sVar.f12745c, sVar.d);
                return;
            case 6:
                ((x6.c0) obj).n0((c0.a) this.f17717f, (Exception) this.f17718j);
                return;
            case 7:
                c0.a aVar2 = (c0.a) this.f17717f;
                z6.d dVar = (z6.d) this.f17718j;
                x6.c0 c0Var2 = (x6.c0) obj;
                c0Var2.a(aVar2, dVar);
                c0Var2.p(aVar2, 2, dVar);
                return;
            default:
                ((x6.c0) obj).g((c0.a) this.f17717f, (w7.d) this.f17718j);
                return;
        }
    }

    @Override // androidx.appcompat.widget.e0.a
    public boolean onMenuItemClick(MenuItem menuItem) {
        Function2<Playlist, r4.c, Unit> function2;
        r4.e this$0 = (r4.e) this.f17717f;
        Playlist playlist = (Playlist) this.f17718j;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(playlist, "$playlist");
        int itemId = menuItem.getItemId();
        if (itemId != R.id.about) {
            if (itemId == R.id.share && (function2 = this$0.f14663f) != null) {
                function2.invoke(playlist, c.d.f14659a);
                return true;
            }
            return true;
        }
        Function2<Playlist, r4.c, Unit> function22 = this$0.f14663f;
        if (function22 == null) {
            return true;
        }
        function22.invoke(playlist, c.a.f14656a);
        return true;
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter emitter) {
        gf.t response = (gf.t) this.f17717f;
        File sink = (File) this.f17718j;
        Intrinsics.checkNotNullParameter(response, "$response");
        Intrinsics.checkNotNullParameter(sink, "$updateFile");
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        try {
            if (response.f10076a.f14065m != 200) {
                pe.y yVar = response.f10076a;
                int i10 = yVar.f14065m;
                String str = yVar.f14064j;
                Intrinsics.checkNotNullExpressionValue(str, "response.message()");
                emitter.onError(new PornhubException(i10, str));
                return;
            }
            Logger logger = bf.o.f3684a;
            Intrinsics.checkNotNullParameter(sink, "$this$sink");
            FileOutputStream sink2 = new FileOutputStream(sink, false);
            Intrinsics.checkNotNullParameter(sink2, "$this$sink");
            bf.g n = cb.e.n(new bf.q(sink2, new bf.z()));
            T t2 = response.f10077b;
            Intrinsics.checkNotNull(t2);
            bf.h source = ((pe.a0) t2).f();
            bf.s sVar = (bf.s) n;
            Intrinsics.checkNotNullParameter(source, "source");
            while (source.O(sVar.f3695c, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) != -1) {
                sVar.a();
            }
            ((bf.s) n).close();
            emitter.onNext(sink);
            emitter.onComplete();
        } catch (IOException e10) {
            e10.printStackTrace();
            emitter.onError(e10);
        }
    }
}
