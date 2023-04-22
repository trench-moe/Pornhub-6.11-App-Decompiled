package e5;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import c4.j;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import x2.k0;
import x2.l0;

/* loaded from: classes.dex */
public class b0 extends d4.a implements j.b {
    public static final /* synthetic */ int G0 = 0;
    public f3.h A0;
    public o3.d B0;
    public Disposable C0;
    public c4.j D0;
    public VideoDetailsViewModel E0;
    public boolean F0 = false;

    /* renamed from: z0  reason: collision with root package name */
    public f3.o f9063z0;

    @Override // d4.a
    public void K0() {
        if (this.E0.d() == null) {
            R0();
            return;
        }
        Disposable disposable = this.C0;
        if (disposable != null && !disposable.isDisposed()) {
            this.C0.dispose();
        }
        o3.d dVar = this.B0;
        String vkey = this.E0.d().getVkey();
        int a10 = this.D0.a();
        Objects.requireNonNull(dVar);
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Observable startWith = ((b3.o) dVar.f13543c).f(vkey, 8, a10).toObservable().map(k0.G).onErrorReturn(l0.G).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.getRela…th(UseCaseResult.Loading)");
        this.C0 = startWith.subscribe(new x2.b(this, 15));
    }

    @Override // d4.a
    public c4.a L0() {
        return this.D0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_related_videos);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.D0 = new c4.l(this);
        this.f8761q0 = true;
    }

    @Override // d4.a
    public void U0(boolean z10) {
        kf.a.f12078a.a("Scrolled to bottom, load more = %s", Boolean.valueOf(z10));
        if (z10) {
            t3.g.o(q(), "phapp_video_scroll_to_load_more", this.E0.d().getVkey(), "related", Integer.valueOf(this.D0.a()));
            return;
        }
        if (!this.F0) {
            t3.g.o(q(), "phapp_video_scroll_to_bottom", this.E0.d().getVkey(), "related", Integer.valueOf(this.D0.a()));
        }
        this.F0 = true;
    }

    @Override // d4.a
    public void W0() {
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        Disposable disposable = this.C0;
        if (disposable != null && !disposable.isDisposed()) {
            this.C0.dispose();
        }
        this.U = true;
    }

    @Override // c4.j.b
    public void a(VideoMetaData videoMetaData) {
        I0(t3.p.c(q(), videoMetaData, UsersConfig.isPremiumAllowed(this.A0.a())));
        if (this.E0.d() == null) {
            return;
        }
        Context q10 = q();
        String vkeyCurrent = this.E0.d().getVkey();
        String videoContentTypeCurrent = this.E0.d().getVideoContentType().toString();
        String vkeyNext = videoMetaData.getVkey();
        String videoContentTypeNext = videoMetaData.getVideoContentType().toString();
        Intrinsics.checkNotNullParameter(vkeyCurrent, "vkeyCurrent");
        Intrinsics.checkNotNullParameter(videoContentTypeCurrent, "videoContentTypeCurrent");
        Intrinsics.checkNotNullParameter(vkeyNext, "vkeyNext");
        Intrinsics.checkNotNullParameter(videoContentTypeNext, "videoContentTypeNext");
        if (q10 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("video_current_vkey", vkeyCurrent);
        bundle.putString("video_current_premium", videoContentTypeCurrent);
        bundle.putString("video_next_vkey", vkeyNext);
        bundle.putString("video_next_premium", videoContentTypeNext);
        Unit unit = Unit.INSTANCE;
        t3.g.i(q10, "phapp_video_related_click", bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        this.E0 = (VideoDetailsViewModel) new androidx.lifecycle.z(s0(), this.f8758n0).a(VideoDetailsViewModel.class);
    }
}
