package com.app.pornhub.view.videodetails;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.z;
import com.app.pornhub.R;
import com.app.pornhub.databinding.FragmentVideodetailsInfoBinding;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.user.ProfileActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import e5.c0;
import e5.w;
import e5.x;
import e5.y;
import f3.h;
import f3.s;
import g4.p;
import i4.g;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import o3.i;

/* loaded from: classes.dex */
public class c extends v3.c {
    public static final /* synthetic */ int C0 = 0;
    public final View.OnClickListener A0;
    public final View.OnClickListener B0;

    /* renamed from: p0  reason: collision with root package name */
    public h f5594p0;

    /* renamed from: q0  reason: collision with root package name */
    public s f5595q0;

    /* renamed from: r0  reason: collision with root package name */
    public i f5596r0;

    /* renamed from: s0  reason: collision with root package name */
    public z.b f5597s0;

    /* renamed from: t0  reason: collision with root package name */
    public VideoDetailsViewModel f5598t0;

    /* renamed from: u0  reason: collision with root package name */
    public CompositeDisposable f5599u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5600v0;
    public boolean w0;

    /* renamed from: x0  reason: collision with root package name */
    public Video f5601x0;

    /* renamed from: y0  reason: collision with root package name */
    public FragmentVideodetailsInfoBinding f5602y0;

    /* renamed from: z0  reason: collision with root package name */
    public final View.OnClickListener f5603z0;

    public c() {
        super(R.layout.fragment_videodetails_info);
        this.f5603z0 = new y(this, 1);
        this.A0 = new x(this, 1);
        this.B0 = new w(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean M0(boolean r10) {
        /*
            r9 = this;
            com.app.pornhub.view.videodetails.VideoDetailsViewModel r0 = r9.f5598t0
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            com.app.pornhub.domain.model.video.Video r1 = r9.f5601x0
            com.app.pornhub.domain.model.video.VideoMetaData r5 = r1.getVideoMetaData()
            r1 = r5
            java.lang.String r5 = r1.getVkey()
            r1 = r5
            java.util.Objects.requireNonNull(r0)
            java.lang.String r5 = "vkey"
            r2 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            if (r10 == 0) goto L26
            com.app.pornhub.domain.model.common.LikeStatus r3 = r0.C
            com.app.pornhub.domain.model.common.LikeStatus$Like r4 = com.app.pornhub.domain.model.common.LikeStatus.Like.INSTANCE
            r8 = 2
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L35
        L26:
            if (r10 != 0) goto L39
            r7 = 2
            com.app.pornhub.domain.model.common.LikeStatus r3 = r0.C
            com.app.pornhub.domain.model.common.LikeStatus$Dislike r4 = com.app.pornhub.domain.model.common.LikeStatus.Dislike.INSTANCE
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            r3 = r5
            if (r3 == 0) goto L39
            r7 = 7
        L35:
            r8 = 2
            r0 = 0
            r8 = 4
            goto L71
        L39:
            if (r10 == 0) goto L3f
            com.app.pornhub.domain.model.common.LikeStatus$Like r3 = com.app.pornhub.domain.model.common.LikeStatus.Like.INSTANCE
            r6 = 6
            goto L42
        L3f:
            r6 = 6
            com.app.pornhub.domain.model.common.LikeStatus$Dislike r3 = com.app.pornhub.domain.model.common.LikeStatus.Dislike.INSTANCE
        L42:
            r0.C = r3
            r7 = 5
            o3.b r3 = r0.f5574l
            java.util.Objects.requireNonNull(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            b3.o r2 = r3.f13541a
            io.reactivex.Completable r5 = r2.j(r1, r10)
            r2 = r5
            e5.c0 r3 = new e5.c0
            r3.<init>(r10, r1)
            r7 = 1
            y3.d r4 = new y3.d
            r4.<init>(r10, r0, r1)
            io.reactivex.disposables.Disposable r1 = r2.subscribe(r3, r4)
            java.lang.String r5 = "changeVideoLikeStatusUse…          }\n            )"
            r2 = r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            io.reactivex.disposables.CompositeDisposable r0 = r0.f16001c
            r8 = 4
            io.reactivex.rxkotlin.DisposableKt.addTo(r1, r0)
            r5 = 1
            r0 = r5
        L71:
            if (r0 == 0) goto La1
            r8 = 4
            if (r10 == 0) goto L7b
            r8 = 7
            java.lang.String r5 = "video_like"
            r1 = r5
            goto L7e
        L7b:
            java.lang.String r5 = "video_dislike"
            r1 = r5
        L7e:
            t3.a.y(r1)
            r7 = 4
            android.content.Context r1 = r9.q()
            if (r10 == 0) goto L8b
            java.lang.String r10 = "video_liked"
            goto L8e
        L8b:
            java.lang.String r10 = "video_disliked"
            r7 = 4
        L8e:
            java.lang.String r5 = "video_rated"
            r2 = r5
            android.os.Bundle r10 = android.support.v4.media.b.c(r2, r10, r1)
            com.google.firebase.analytics.FirebaseAnalytics r5 = com.google.firebase.analytics.FirebaseAnalytics.getInstance(r1)
            r1 = r5
            java.lang.String r5 = "video_rating"
            r2 = r5
            r1.a(r2, r10)
            r6 = 4
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.videodetails.c.M0(boolean):boolean");
    }

    public final void N0(boolean z10) {
        VideoDetailsViewModel videoDetailsViewModel = this.f5598t0;
        String vkey = this.f5601x0.getVideoMetaData().getVkey();
        Objects.requireNonNull(videoDetailsViewModel);
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        videoDetailsViewModel.B.l(VideoDetailsViewModel.a.C0064a.f5591a);
        o3.a aVar = videoDetailsViewModel.f5573k;
        Objects.requireNonNull(aVar);
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Disposable subscribe = aVar.f13540a.d(vkey, z10).subscribe(new c0(videoDetailsViewModel, z10), new x2.a(videoDetailsViewModel, 19));
        Intrinsics.checkNotNullExpressionValue(subscribe, "changeVideoFavoriteStatu…one(false)\n            })");
        DisposableKt.addTo(subscribe, videoDetailsViewModel.f16001c);
    }

    public final void O0() {
        Resources E = E();
        Drawable drawable = E.getDrawable(R.drawable.dislike);
        int color = E.getColor(R.color.red);
        if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        this.f5602y0.f4674e.setImageDrawable(drawable);
        Drawable drawable2 = E.getDrawable(R.drawable.like);
        if (drawable2 != null) {
            drawable2.setColorFilter(null);
        }
        this.f5602y0.f4684p.setImageDrawable(drawable2);
    }

    public final void P0() {
        Drawable drawable = E().getDrawable(R.drawable.like);
        int color = E().getColor(R.color.green);
        if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        this.f5602y0.f4684p.setImageDrawable(drawable);
        Drawable drawable2 = E().getDrawable(R.drawable.dislike);
        if (drawable2 != null) {
            drawable2.setColorFilter(null);
        }
        this.f5602y0.f4674e.setImageDrawable(drawable2);
    }

    public final void Q0(boolean z10) {
        if (z10) {
            this.f5602y0.f4676g.setVisibility(0);
            this.f5602y0.f4675f.setVisibility(8);
            return;
        }
        this.f5602y0.f4676g.setVisibility(8);
        this.f5602y0.f4675f.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View W = super.W(layoutInflater, viewGroup, bundle);
        FragmentVideodetailsInfoBinding bind = FragmentVideodetailsInfoBinding.bind(W);
        this.f5602y0 = bind;
        bind.f4678i.setOnClickListener(new View.OnClickListener(this) { // from class: e5.v

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ com.app.pornhub.view.videodetails.c f9112f;

            {
                this.f9112f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        com.app.pornhub.view.videodetails.c cVar = this.f9112f;
                        if (!cVar.f5601x0.getUserMetaData().getChannelId().isEmpty()) {
                            cVar.I0(ChannelActivity.C(cVar.u0(), cVar.f5601x0.getUserMetaData().getChannelId()));
                            return;
                        }
                        if (!t3.l.d(cVar.f5601x0.getUserMetaData())) {
                            cVar.I0(ProfileActivity.C(cVar.q(), cVar.f5601x0.getUserMetaData()));
                        }
                        return;
                    default:
                        com.app.pornhub.view.videodetails.c cVar2 = this.f9112f;
                        String vkey = cVar2.f5601x0.getVideoMetaData().getVkey();
                        Intrinsics.checkNotNullParameter(vkey, "vkey");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("vkey", vkey);
                        r4.b bVar = new r4.b();
                        bVar.A0(bundle2);
                        bVar.Q0(cVar2.I, r4.b.class.getSimpleName());
                        return;
                }
            }
        });
        this.f5602y0.f4684p.setOnClickListener(new y(this, 0));
        this.f5602y0.f4674e.setOnClickListener(new x(this, 0));
        this.f5602y0.f4675f.setOnClickListener(new w(this, 0));
        this.f5602y0.f4691w.setOnClickListener(new b4.b(this, 16));
        this.f5602y0.f4688t.setOnClickListener(new x3.a(this, 14));
        this.f5602y0.f4672b.setOnClickListener(new View.OnClickListener(this) { // from class: e5.v

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ com.app.pornhub.view.videodetails.c f9112f;

            {
                this.f9112f = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        com.app.pornhub.view.videodetails.c cVar = this.f9112f;
                        if (!cVar.f5601x0.getUserMetaData().getChannelId().isEmpty()) {
                            cVar.I0(ChannelActivity.C(cVar.u0(), cVar.f5601x0.getUserMetaData().getChannelId()));
                            return;
                        }
                        if (!t3.l.d(cVar.f5601x0.getUserMetaData())) {
                            cVar.I0(ProfileActivity.C(cVar.q(), cVar.f5601x0.getUserMetaData()));
                        }
                        return;
                    default:
                        com.app.pornhub.view.videodetails.c cVar2 = this.f9112f;
                        String vkey = cVar2.f5601x0.getVideoMetaData().getVkey();
                        Intrinsics.checkNotNullParameter(vkey, "vkey");
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("vkey", vkey);
                        r4.b bVar = new r4.b();
                        bVar.A0(bundle2);
                        bVar.Q0(cVar2.I, r4.b.class.getSimpleName());
                        return;
                }
            }
        });
        this.f5598t0 = (VideoDetailsViewModel) new z(s0(), this.f5597s0).a(VideoDetailsViewModel.class);
        this.f5599u0 = new CompositeDisposable();
        return W;
    }

    @Override // v3.c, androidx.fragment.app.Fragment
    public void Y() {
        super.Y();
        this.f5599u0.dispose();
        this.f5602y0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void k0(View view, Bundle bundle) {
        this.f5598t0.y.f(K(), new p(this, 10));
        this.f5598t0.f5586z.f(K(), new h4.h(this, 8));
        this.f5598t0.B.f(K(), new g(this, 7));
        this.f5602y0.f4685q.setOnScrollChangeListener(new g4.g(this));
    }
}
