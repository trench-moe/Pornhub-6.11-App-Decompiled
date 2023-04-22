package com.app.pornhub.view.user;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c4.j;
import c4.l;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.material.snackbar.Snackbar;
import f3.f;
import f3.h;
import f3.i;
import f3.m;
import f3.s;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o3.c;
import q3.d;
import q4.e;
import t3.o;
import t3.p;
import x2.g;
import x2.i1;
import x2.z;

/* loaded from: classes.dex */
public class UserVideoListingsFragment extends d4.a implements j.b {
    public static final /* synthetic */ int Q0 = 0;
    public m A0;
    public UserOrientation B0;
    public s C0;
    public c D0;
    public h E0;
    public f F0;
    public d G0;
    public TextView H0;
    public TextView I0;
    public Disposable J0;
    public CompositeDisposable K0;
    public VideosConfig.UserVideosType M0;
    public j O0;
    public Snackbar P0;

    /* renamed from: z0  reason: collision with root package name */
    public i f5520z0;
    public String L0 = BuildConfig.FLAVOR;
    public boolean N0 = false;

    @Override // d4.a
    public void K0() {
        Disposable disposable = this.J0;
        if (disposable == null || disposable.isDisposed()) {
            c cVar = this.D0;
            String targetUserId = this.L0;
            VideosConfig.UserVideosType userVideosType = this.M0;
            int a10 = this.O0.a();
            Objects.requireNonNull(cVar);
            Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
            Intrinsics.checkNotNullParameter(userVideosType, "userVideosType");
            Observable startWith = cVar.f13542a.l(targetUserId, userVideosType, 16, a10).toObservable().map(i1.G).onErrorReturn(z.J).startWith((Observable) UseCaseResult.a.f4910a);
            Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.getUser…th(UseCaseResult.Loading)");
            this.J0 = startWith.subscribe(new g(this, 18));
        }
    }

    @Override // d4.a
    public c4.a L0() {
        return this.O0;
    }

    @Override // d4.a
    public String M0() {
        return I(R.string.no_video_to_display);
    }

    @Override // d4.a
    public int O0() {
        return 1;
    }

    @Override // d4.a
    public void P0() {
        this.O0 = new l(this);
        this.f8761q0 = true;
    }

    @Override // d4.a, androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W;
        Bundle bundle2 = this.f2019u;
        if (bundle2 != null) {
            this.L0 = o.j(bundle2, "targetUserId");
        }
        if (this.f5520z0.a().equals(this.L0)) {
            this.f8763s0 = true;
            LinearLayout linearLayout = (LinearLayout) layoutInflater.inflate(R.layout.layout_user_videos_tabs_header, viewGroup, false).findViewById(R.id.root_view);
            W = super.W(layoutInflater, linearLayout, bundle);
            TextView textView = (TextView) linearLayout.findViewById(R.id.fragment_user_videos_tab_txtFavorites);
            this.H0 = textView;
            textView.setOnClickListener(new x3.b(this, 14));
            TextView textView2 = (TextView) linearLayout.findViewById(R.id.fragment_user_videos_tab_txtHistory);
            this.I0 = textView2;
            textView2.setOnClickListener(new u3.b(this, 13));
            this.N0 = true;
            Y0();
            this.M0 = VideosConfig.UserVideosType.History.INSTANCE;
        } else {
            W = super.W(layoutInflater, viewGroup, bundle);
            this.N0 = false;
            this.M0 = VideosConfig.UserVideosType.Public.INSTANCE;
            t3.a.x(q(), "Profile", this.N0 ? "MyVideosPublic" : "UserVideosPublic");
        }
        CompositeDisposable compositeDisposable = this.K0;
        if (compositeDisposable != null) {
            if (compositeDisposable.isDisposed()) {
            }
            return W;
        }
        CompositeDisposable compositeDisposable2 = new CompositeDisposable();
        this.K0 = compositeDisposable2;
        compositeDisposable2.add(this.A0.a(true).subscribe(new x2.h(this, 15)));
        this.K0.add(this.C0.a(false).subscribe(new x2.c(this, 20)));
        return W;
    }

    @Override // d4.a
    public void W0() {
        t3.a.x(q(), "Home", "Videos");
    }

    public final void X0(boolean z10) {
        if (!z10) {
            Snackbar snackbar = this.P0;
            if (snackbar == null || !snackbar.j()) {
                return;
            }
            this.P0.b(3);
            return;
        }
        String I = I(R.string.resend_email);
        Snackbar snackbar2 = this.P0;
        if (snackbar2 != null) {
            if (!snackbar2.j()) {
            }
            this.P0.n();
        }
        Snackbar k10 = Snackbar.k(this.f8767x0, R.string.email_verification_required, -2);
        this.P0 = k10;
        k10.m(R.string.help, new e(this, I, 2));
        this.P0.n();
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        CompositeDisposable compositeDisposable = this.K0;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.K0.dispose();
        }
        Disposable disposable = this.J0;
        if (disposable != null && !disposable.isDisposed()) {
            this.J0.dispose();
        }
        this.U = true;
    }

    public final void Y0() {
        String str = n() instanceof ProfileActivity ? "Profile" : "Home";
        VideosConfig.UserVideosType userVideosType = this.M0;
        if (userVideosType instanceof VideosConfig.UserVideosType.Favorite) {
            this.H0.setSelected(true);
            this.I0.setSelected(false);
            t3.a.x(q(), str, this.N0 ? "MyVideosFavorites" : "UserVideosFavorites");
            return;
        }
        if (userVideosType instanceof VideosConfig.UserVideosType.History) {
            this.H0.setSelected(false);
            this.I0.setSelected(true);
            t3.a.x(q(), str, this.N0 ? "MyVideosHistory" : "UserVideosHistory");
        }
    }

    @Override // c4.j.b
    public void a(VideoMetaData videoMetaData) {
        I0(p.c(q(), videoMetaData, UsersConfig.isPremiumAllowed(this.E0.a())));
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        TextView textView = this.I0;
        if (textView != null) {
            textView.setSelected(true);
        }
    }
}
