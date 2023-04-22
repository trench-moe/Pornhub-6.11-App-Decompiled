package e5;

import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import io.reactivex.functions.Action;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements Action {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9065c = 1;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f9066f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f9067j;

    public /* synthetic */ c0(VideoDetailsViewModel videoDetailsViewModel, boolean z10) {
        this.f9067j = videoDetailsViewModel;
        this.f9066f = z10;
    }

    public /* synthetic */ c0(boolean z10, String str) {
        this.f9066f = z10;
        this.f9067j = str;
    }

    @Override // io.reactivex.functions.Action
    public final void run() {
        switch (this.f9065c) {
            case 0:
                boolean z10 = this.f9066f;
                String vkey = (String) this.f9067j;
                Intrinsics.checkNotNullParameter(vkey, "$vkey");
                kf.a.f12078a.a(Intrinsics.stringPlus("Changed video like status to ", Boolean.valueOf(z10)), new Object[0]);
                androidx.appcompat.widget.p b10 = androidx.appcompat.widget.p.b();
                if (z10) {
                    ((HashSet) b10.f1052a).add(vkey);
                    ((HashSet) b10.f1053b).remove(vkey);
                    return;
                }
                ((HashSet) b10.f1053b).add(vkey);
                ((HashSet) b10.f1052a).remove(vkey);
                return;
            default:
                VideoDetailsViewModel this$0 = (VideoDetailsViewModel) this.f9067j;
                boolean z11 = this.f9066f;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.B.l(new VideoDetailsViewModel.a.b(z11));
                return;
        }
    }
}
