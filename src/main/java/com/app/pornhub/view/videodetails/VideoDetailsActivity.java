package com.app.pornhub.view.videodetails;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji2.text.l;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.z;
import androidx.viewpager.widget.ViewPager;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityVideodetailsBinding;
import com.app.pornhub.domain.config.PlaylistsConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.config.VideoQuality;
import com.app.pornhub.domain.model.playlist.Playlist;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.service.VideoDlService;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.offline.OfflineVideoPopupDialog;
import com.app.pornhub.view.offline.PopupSource;
import com.app.pornhub.view.quickseek.overlay.QuickSeekOverlay;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.cast.MediaInfo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pornhub.vrplayer.VrPlayerActivity;
import com.pornhub.vrplayer.enums.Projection;
import com.pornhub.vrplayer.enums.StereoType;
import com.squareup.moshi.k;
import e5.m;
import e5.r;
import e5.s;
import e5.t;
import f3.f;
import f3.h;
import f3.o;
import f3.u;
import fr.maxcom.http.FileDataSource;
import fr.maxcom.http.a;
import io.realm.Case;
import io.realm.RealmQuery;
import io.realm.internal.ObservableCollection;
import io.realm.internal.OsResults;
import io.realm.p;
import io.realm.v;
import io.realm.y;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import r4.b;
import u8.i;
import u8.j;
import v8.g;
import w6.c0;
import w6.v0;
import w8.g;
import w8.q;

/* loaded from: classes.dex */
public class VideoDetailsActivity extends v3.b implements a.InterfaceC0065a, b.a {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f5539t0 = 0;
    public z.b K;
    public VideoDetailsViewModel L;
    public o M;
    public h N;
    public f O;
    public u P;
    public k Q;
    public ActivityVideodetailsBinding R;
    public Video S;
    public VideoMetaData T;
    public p U;
    public r3.d V;
    public y<r3.d> W;
    public int X;
    public boolean Y;
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public Timer f5540a0;

    /* renamed from: b0  reason: collision with root package name */
    public Timer f5541b0;

    /* renamed from: c0  reason: collision with root package name */
    public Handler f5542c0;

    /* renamed from: d0  reason: collision with root package name */
    public MediaInfo f5543d0;

    /* renamed from: e0  reason: collision with root package name */
    public fr.maxcom.http.b f5544e0;

    /* renamed from: f0  reason: collision with root package name */
    public g f5545f0;

    /* renamed from: g0  reason: collision with root package name */
    public v8.h<v8.d> f5546g0;

    /* renamed from: h0  reason: collision with root package name */
    public w8.g f5547h0;

    /* renamed from: i0  reason: collision with root package name */
    public b f5548i0;

    /* renamed from: j0  reason: collision with root package name */
    public c f5549j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f5550k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5551l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5552m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5553n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f5554o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5555p0;

    /* renamed from: q0  reason: collision with root package name */
    public long f5556q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public long f5557r0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public v0 f5558s0;

    /* loaded from: classes.dex */
    public enum PlaybackTarget {
        LOCAL,
        CAST
    }

    /* loaded from: classes.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            VideoDetailsActivity.this.R.f4484e.A.setText(t3.o.e(i10));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            VideoDetailsActivity videoDetailsActivity = VideoDetailsActivity.this;
            int i10 = VideoDetailsActivity.f5539t0;
            videoDetailsActivity.e0();
            VideoDetailsActivity.this.d0();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            VideoDetailsActivity.this.f5558s0.n(seekBar.getProgress());
            VideoDetailsActivity videoDetailsActivity = VideoDetailsActivity.this;
            videoDetailsActivity.d0();
            Timer timer = new Timer();
            videoDetailsActivity.f5541b0 = timer;
            timer.schedule(new d(null), 3000L);
            VideoDetailsActivity.C(VideoDetailsActivity.this);
        }
    }

    /* loaded from: classes.dex */
    public class b extends g.a {
        public b(e5.p pVar) {
        }

        @Override // w8.g.a
        public void a() {
        }

        @Override // w8.g.a
        public void b() {
        }

        @Override // w8.g.a
        public void c() {
        }

        @Override // w8.g.a
        public void d() {
            VideoDetailsActivity videoDetailsActivity = VideoDetailsActivity.this;
            int i10 = VideoDetailsActivity.f5539t0;
            videoDetailsActivity.f0();
        }
    }

    /* loaded from: classes.dex */
    public class c implements g.d {
        public c(e5.p pVar) {
        }

        @Override // w8.g.d
        public void a(long j10, long j11) {
            VideoDetailsActivity.this.g0((int) j10, (int) j11);
        }
    }

    /* loaded from: classes.dex */
    public class d extends TimerTask {
        public d(e5.p pVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            VideoDetailsActivity.this.f5542c0.post(new l(this, 2));
        }
    }

    /* loaded from: classes.dex */
    public class e extends TimerTask {
        public e(e5.p pVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            VideoDetailsActivity.this.f5542c0.post(new androidx.emoji2.text.k(this, 4));
        }
    }

    public static void C(VideoDetailsActivity videoDetailsActivity) {
        videoDetailsActivity.e0();
        Timer timer = new Timer();
        videoDetailsActivity.f5540a0 = timer;
        timer.scheduleAtFixedRate(new e(null), 100L, 1000L);
        kf.a.f12078a.e("Restarted TrickPlay Timer", new Object[0]);
    }

    public static Intent F(Context context, Playlist playlist) {
        Intent intent = new Intent(context, VideoDetailsActivity.class);
        intent.putExtra("playlist_id", playlist.getId());
        return intent;
    }

    public static Intent G(Context context, String str) {
        Intent intent = new Intent(context, VideoDetailsActivity.class);
        intent.putExtra("key_vkey", str);
        return intent;
    }

    public final void D(int i10) {
        if ((i10 & 4) == 0) {
            this.R.f4493o.setVisibility(0);
            this.R.f4492m.setVisibility(0);
            this.R.f4484e.f4856i.setImageResource(R.drawable.ic_expand_fullscreen);
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.R.f4487h.getLayoutParams())).height = this.X;
            return;
        }
        this.R.f4493o.setVisibility(8);
        this.R.f4492m.setVisibility(8);
        this.R.f4484e.f4856i.setImageResource(R.drawable.ic_collapse_fullscreen);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ((LinearLayout.LayoutParams) this.R.f4484e.d.getLayoutParams()).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.R.f4487h.getLayoutParams())).height = displayMetrics.heightPixels;
    }

    public final void E(PlaybackTarget playbackTarget) {
        if (playbackTarget == PlaybackTarget.LOCAL) {
            this.R.f4484e.f4851c.setVisibility(8);
            if (!this.T.isVr()) {
                this.R.f4484e.f4856i.setVisibility(0);
            }
            if (!K()) {
                this.R.f4484e.f4850b.setVisibility(0);
            }
            V();
            S(false, false);
            this.R.f4484e.f4858k.setImageDrawable(getResources().getDrawable(R.drawable.ic_play));
            return;
        }
        this.R.f4484e.f4851c.setVisibility(0);
        this.R.f4484e.f4850b.setVisibility(8);
        this.R.f4484e.f4856i.setVisibility(8);
        this.R.f4484e.f4858k.setOnClickListener(new m(this, 1));
        this.R.f4484e.f4871z.setOnSeekBarChangeListener(new com.app.pornhub.view.videodetails.b(this));
        d0();
        e0();
        P(true);
        Y(true);
    }

    public final void H(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("key_vkey")) {
                this.f5556q0 = 0L;
                this.L.f(extras.getString("key_vkey"));
                this.L.g(null);
                return;
            } else if (extras.containsKey("playlist_id")) {
                this.L.g(String.valueOf(extras.getInt("playlist_id")));
                return;
            } else {
                return;
            }
        }
        a0(false);
        if (J()) {
            MediaInfo f10 = this.f5545f0.c().l().f();
            this.f5543d0 = f10;
            VideoDetailsViewModel videoDetailsViewModel = this.L;
            Video video = t3.p.d(this.Q, f10.H);
            Objects.requireNonNull(videoDetailsViewModel);
            Intrinsics.checkNotNullParameter(video, "video");
            videoDetailsViewModel.y.l(video);
        }
        VideoDetailsViewModel videoDetailsViewModel2 = this.L;
        Triple<Playlist, Boolean, Boolean> b10 = videoDetailsViewModel2.f5571i.f11372a.b();
        if (b10.getFirst() != null) {
            Playlist first = b10.getFirst();
            Intrinsics.checkNotNull(first);
            Playlist playlist = first;
            boolean booleanValue = b10.getSecond().booleanValue();
            boolean booleanValue2 = b10.getThird().booleanValue();
            kf.a.f12078a.a("Restore playing playlist - video details activity launched from cast mini controller", new Object[0]);
            videoDetailsViewModel2.f5584w.l(Boolean.valueOf(booleanValue));
            videoDetailsViewModel2.f5585x.l(Boolean.valueOf(booleanValue2));
            videoDetailsViewModel2.f5578q.l(playlist);
            if (!playlist.getVideos().isEmpty()) {
                videoDetailsViewModel2.f5582u.addAll(playlist.getVideos());
            }
            videoDetailsViewModel2.f5579r.l(videoDetailsViewModel2.f5582u);
        }
    }

    public final void I(v8.d dVar) {
        w8.g l10 = dVar.l();
        this.f5547h0 = l10;
        b bVar = this.f5548i0;
        Objects.requireNonNull(l10);
        h9.o.d("Must be called from the main thread.");
        if (bVar != null) {
            l10.f17014h.remove(bVar);
        }
        w8.g gVar = this.f5547h0;
        b bVar2 = this.f5548i0;
        Objects.requireNonNull(gVar);
        h9.o.d("Must be called from the main thread.");
        if (bVar2 != null) {
            gVar.f17014h.add(bVar2);
        }
        this.f5547h0.b(this.f5549j0, 1000L);
    }

    public final boolean J() {
        boolean z10 = false;
        if (this.f5551l0) {
            v8.d c10 = this.f5545f0.c();
            if (c10 != null && c10.c()) {
                z10 = true;
            }
            return z10;
        }
        return false;
    }

    public final boolean K() {
        r3.d dVar = this.V;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
            if (v.w(dVar) && this.V.x()) {
                return true;
            }
        }
        return false;
    }

    public final void L() {
        Intent intent = new Intent(this, VrPlayerActivity.class);
        StereoType stereoType = StereoType.MONO;
        Projection projection = Projection.NONE;
        if (this.T.isVr()) {
            if (this.S.getVrStereoSrc()) {
                int vrStereoType = this.S.getVrStereoType();
                if (vrStereoType == 1) {
                    stereoType = StereoType.STEREO_SIDE_BY_SIDE_LR;
                } else if (vrStereoType == 2) {
                    stereoType = StereoType.STEREO_OVER_UNDER_LR;
                } else if (vrStereoType == 3) {
                    stereoType = StereoType.STEREO_SIDE_BY_SIDE_RL;
                } else if (vrStereoType == 4) {
                    stereoType = StereoType.STEREO_OVER_UNDER_RL;
                }
            }
            int projectionType = this.S.getProjectionType();
            if (projectionType == 1) {
                projection = Projection.EQUIDISTANT_180;
            } else if (projectionType == 2) {
                projection = Projection.EQUIRECTANGULAR_360;
            } else if (projectionType == 3) {
                projection = Projection.EQUIRECTANGULAR_180;
            }
        }
        kf.a.f12078a.a("VR VIDEO URL:::: %s", this.S.getUrlVideo());
        intent.putExtra("com.pornhub.vrplayer.VrPlayerActivity.dataSource", this.S.getUrlVideo());
        intent.putExtra("com.pornhub.vrplayer.VrPlayerActivity.stereoType", stereoType);
        intent.putExtra("com.pornhub.vrplayer.VrPlayerActivity.projection", projection);
        startActivity(intent);
        String vkey = this.T.getVkey();
        String uploader = this.S.getUserMetaData().getUsername();
        String videoContentType = this.T.getVideoContentType().toString();
        String categories = this.S.getCategories();
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(uploader, "uploader");
        Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
        Intrinsics.checkNotNullParameter(categories, "categories");
        t3.g.q(this, "phapp_video_vr_click", vkey, true, uploader, videoContentType, categories, null, null, null, null, null, 3968);
    }

    public final void M(VideoQuality quality) {
        u uVar = this.P;
        Objects.requireNonNull(uVar);
        Intrinsics.checkNotNullParameter(quality, "videoQuality");
        uVar.f9390a.m(quality);
        boolean z10 = true;
        S(true, true);
        new Handler().postDelayed(new q0.d(this, 4), 500L);
        String vkey = this.T.getVkey();
        String uploader = this.S.getUserMetaData().getUsername();
        String videoContentType = this.T.getVideoContentType().toString();
        String categories = this.S.getCategories();
        Integer valueOf = Integer.valueOf(this.T.getDuration());
        if (getResources().getConfiguration().orientation != 2) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(uploader, "uploader");
        Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(quality, "quality");
        t3.g.q(this, "phapp_video_quality_select", vkey, false, uploader, videoContentType, categories, t3.g.a(quality), Boolean.valueOf(z10), valueOf, null, null, 3072);
    }

    public final void N() {
        if (UsersConfig.isPremiumAllowed(this.N.a())) {
            return;
        }
        int i10 = q3.e.f14322a + 1;
        q3.e.f14322a = i10;
        if (!(i10 % 3 == 0) || isFinishing()) {
            return;
        }
        new u3.d().Q0(u(), "ads_dialog");
    }

    public final void O() {
        if (this.f5557r0 == 0) {
            return;
        }
        this.f5556q0 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.f5557r0) + this.f5556q0;
        this.f5557r0 = 0L;
    }

    public final void P(boolean z10) {
        this.R.f4484e.f4852e.setVisibility(z10 ? 0 : 8);
        U(z10);
    }

    public final void Q(boolean z10) {
        this.R.f4484e.f4854g.setVisibility(z10 ? 0 : 8);
        if (!z10 && this.R.f4484e.f4852e.getVisibility() != 0) {
            U(false);
        }
    }

    public final void R(boolean z10) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        if (z10) {
            getWindow().getDecorView().setSystemUiVisibility(5638);
            D(5638);
            return;
        }
        int i10 = systemUiVisibility & (-5639);
        getWindow().getDecorView().setSystemUiVisibility(i10);
        D(i10);
    }

    public final void S(boolean z10, boolean z11) {
        this.Y = z10;
        p pVar = this.U;
        RealmQuery h10 = a0.a.h(pVar, pVar, r3.d.class);
        String vkey = this.T.getVkey();
        Case r32 = Case.SENSITIVE;
        h10.f10812a.e();
        h10.c("vkey", vkey, r32);
        this.V = (r3.d) h10.e();
        boolean z12 = false;
        if (!z10) {
            y<r3.d> yVar = this.W;
            if (yVar != null) {
                yVar.h();
            }
            p pVar2 = this.U;
            RealmQuery h11 = a0.a.h(pVar2, pVar2, r3.d.class);
            String vkey2 = this.T.getVkey();
            h11.f10812a.e();
            h11.c("vkey", vkey2, r32);
            h11.f10812a.e();
            ((be.a) h11.f10812a.n.capabilities).b("Async query cannot be created on current thread.");
            y<r3.d> a10 = h11.a(h11.f10813b, h11.f10816f, false);
            this.W = a10;
            s sVar = new s(this);
            a10.e(sVar);
            OsResults osResults = a10.f10977m;
            Objects.requireNonNull(osResults);
            osResults.a(a10, new ObservableCollection.b(sVar));
            invalidateOptionsMenu();
        }
        if (!z10 && K()) {
            kf.a.f12078a.a("Found this video on the device, using the local file uri: %s", this.V.t());
            try {
                File file = new File(this.V.t());
                if (file.exists()) {
                    this.f5544e0 = new fr.maxcom.http.b();
                    t3.k kVar = new t3.k();
                    kVar.f15119a = t3.e.b(this);
                    fr.maxcom.http.b bVar = this.f5544e0;
                    ((FileDataSource) bVar.f9638e).f9592f = kVar;
                    Thread thread = new Thread(new a.c(null));
                    bVar.f9639f = thread;
                    thread.start();
                    this.f5558s0.y(c0.b(this.f5544e0.a(file.getPath())));
                    this.f5558s0.f();
                    this.f5558s0.n(this.R.f4484e.f4871z.getProgress());
                } else {
                    String p10 = this.V.p();
                    String str = com.app.pornhub.view.offline.a.E0;
                    Bundle bundle = new Bundle();
                    bundle.putString("vkey", p10);
                    com.app.pornhub.view.offline.a aVar = new com.app.pornhub.view.offline.a();
                    aVar.A0(bundle);
                    aVar.Q0(u(), com.app.pornhub.view.offline.a.E0);
                    T();
                }
            } catch (IOException e10) {
                kf.a.f12078a.d(e10, "Failed to set local video URI %s", this.V.t());
                e10.printStackTrace();
                T();
            }
            this.R.f4484e.f4850b.setVisibility(8);
        } else if (this.S.getEncodings().getUrl480p().equals("false")) {
            this.R.f4484e.f4858k.setEnabled(false);
            VideoMetaData videoMetaData = this.T;
            Intrinsics.checkNotNullParameter(this, "context");
            Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
            Intent intent = new Intent(this, LockedPayVideoActivity.class);
            intent.putExtra("key_vkey", videoMetaData.getVkey());
            intent.putExtra("key_prev_url", videoMetaData.getPreviewUrl());
            intent.putExtra("key_thumb", videoMetaData.getUrlThumbnail());
            intent.putExtra("key_title", videoMetaData.getTitle());
            intent.putExtra("key_price", videoMetaData.getPrice());
            intent.putExtra("key_duration", videoMetaData.getDuration());
            startActivity(intent);
            this.R.f4484e.f4850b.setVisibility(8);
        } else {
            this.R.f4484e.f4858k.setEnabled(true);
            T();
            this.R.f4484e.f4850b.setVisibility(0);
        }
        v0 v0Var = this.f5558s0;
        if (!this.Y) {
            if (z11) {
            }
            v0Var.C(z12);
        }
        z12 = true;
        v0Var.C(z12);
    }

    public final void T() {
        String str;
        VideoQuality a10 = this.O.a(this.S);
        this.R.f4484e.f4866t.setVisibility(this.S.getEncodings().isUHDAvailable() ? 0 : 4);
        this.R.f4484e.f4864r.setVisibility(this.S.getEncodings().isWQHDAvailable() ? 0 : 4);
        this.R.f4484e.f4862p.setVisibility(this.S.getEncodings().isFullHdAvailable() ? 0 : 4);
        if (a10 instanceof VideoQuality.Q480p) {
            str = this.S.getEncodings().getUrl480p();
        } else if (a10 instanceof VideoQuality.Q720p) {
            str = this.T.isHd() ? this.S.getEncodings().getUrl720p() : this.S.getEncodings().getUrl480p();
        } else if (a10 instanceof VideoQuality.Q1080p) {
            if (this.S.getEncodings().isFullHd()) {
                str = this.S.getEncodings().getUrl1080p();
                a10 = VideoQuality.Q1080p.INSTANCE;
            } else if (this.S.getEncodings().isHd()) {
                str = this.S.getEncodings().getUrl720p();
                a10 = VideoQuality.Q720p.INSTANCE;
            } else {
                str = this.S.getEncodings().getUrl480p();
                a10 = VideoQuality.Q480p.INSTANCE;
            }
        } else if (a10 instanceof VideoQuality.Q1440p) {
            if (this.S.getEncodings().isWQHD()) {
                str = this.S.getEncodings().getUrl1440p();
                a10 = VideoQuality.Q1440p.INSTANCE;
            } else if (this.S.getEncodings().isFullHd()) {
                str = this.S.getEncodings().getUrl1080p();
                a10 = VideoQuality.Q1080p.INSTANCE;
            } else if (this.S.getEncodings().isHd()) {
                str = this.S.getEncodings().getUrl720p();
                a10 = VideoQuality.Q720p.INSTANCE;
            } else {
                str = this.S.getEncodings().getUrl480p();
                a10 = VideoQuality.Q480p.INSTANCE;
            }
        } else if (!(a10 instanceof VideoQuality.Q2160p)) {
            str = BuildConfig.FLAVOR;
        } else if (this.S.getEncodings().isUHD()) {
            str = this.S.getEncodings().getUrl2160p();
            a10 = VideoQuality.Q2160p.INSTANCE;
        } else if (this.S.getEncodings().isWQHD()) {
            str = this.S.getEncodings().getUrl1440p();
            a10 = VideoQuality.Q1440p.INSTANCE;
        } else if (this.S.getEncodings().isFullHd()) {
            str = this.S.getEncodings().getUrl1080p();
            a10 = VideoQuality.Q1080p.INSTANCE;
        } else if (this.S.getEncodings().isHd()) {
            str = this.S.getEncodings().getUrl720p();
            a10 = VideoQuality.Q720p.INSTANCE;
        } else {
            str = this.S.getEncodings().getUrl480p();
            a10 = VideoQuality.Q480p.INSTANCE;
        }
        if (this.T.isVr()) {
            this.S.setUrlVideo(str);
        } else {
            kf.a.f12078a.e("Loading video URI %s", str);
            this.f5558s0.y(c0.b(str));
            this.f5558s0.f();
            this.f5558s0.n(this.R.f4484e.f4871z.getProgress());
        }
        if (a10 instanceof VideoQuality.Q480p) {
            this.R.f4484e.f4867u.setVisibility(0);
            this.R.f4484e.f4869w.setVisibility(4);
            this.R.f4484e.f4861o.setVisibility(4);
            this.R.f4484e.f4863q.setVisibility(4);
            this.R.f4484e.f4865s.setVisibility(4);
        }
        if (a10 instanceof VideoQuality.Q720p) {
            this.R.f4484e.f4867u.setVisibility(4);
            this.R.f4484e.f4869w.setVisibility(0);
            this.R.f4484e.f4861o.setVisibility(4);
            this.R.f4484e.f4863q.setVisibility(4);
            this.R.f4484e.f4865s.setVisibility(4);
        }
        if (a10 instanceof VideoQuality.Q1080p) {
            this.R.f4484e.f4867u.setVisibility(4);
            this.R.f4484e.f4869w.setVisibility(4);
            this.R.f4484e.f4861o.setVisibility(0);
            this.R.f4484e.f4863q.setVisibility(4);
            this.R.f4484e.f4865s.setVisibility(4);
        }
        if (a10 instanceof VideoQuality.Q1440p) {
            this.R.f4484e.f4867u.setVisibility(4);
            this.R.f4484e.f4869w.setVisibility(4);
            this.R.f4484e.f4861o.setVisibility(4);
            this.R.f4484e.f4863q.setVisibility(0);
            this.R.f4484e.f4865s.setVisibility(4);
        }
        if (a10 instanceof VideoQuality.Q2160p) {
            this.R.f4484e.f4867u.setVisibility(4);
            this.R.f4484e.f4869w.setVisibility(4);
            this.R.f4484e.f4861o.setVisibility(4);
            this.R.f4484e.f4863q.setVisibility(4);
            this.R.f4484e.f4865s.setVisibility(0);
        }
        kf.a.f12078a.a("Determined video quality and url for video with vkey %s are: q -> %s url -> %s", this.T.getVkey(), a10, str);
    }

    public final void U(boolean z10) {
        if (z10 && !K() && !J() && this.T.isHd()) {
            this.R.f4484e.f4853f.setVisibility(0);
            return;
        }
        if (this.R.f4484e.f4854g.getVisibility() != 0) {
            this.R.f4484e.f4853f.setVisibility(8);
        }
    }

    public final void V() {
        this.R.f4484e.f4858k.setOnClickListener(new e5.l(this, 2));
        this.R.f4484e.f4871z.setOnSeekBarChangeListener(new a());
    }

    public final void W(VideoQuality videoQuality) {
        String str = com.app.pornhub.view.videodetails.a.H0;
        Bundle bundle = new Bundle();
        bundle.putSerializable("quality", videoQuality);
        com.app.pornhub.view.videodetails.a aVar = new com.app.pornhub.view.videodetails.a();
        aVar.A0(bundle);
        aVar.Q0(u(), com.app.pornhub.view.videodetails.a.H0);
    }

    public void X(boolean z10) {
        int i10 = 4;
        this.R.f4484e.f4858k.setVisibility(z10 ? 4 : 0);
        ProgressBar progressBar = this.R.f4484e.n;
        if (z10) {
            i10 = 0;
        }
        progressBar.setVisibility(i10);
    }

    public final void Y(boolean z10) {
        this.R.f4484e.f4860m.setVisibility(z10 ? 0 : 8);
    }

    public final void Z() {
        this.R.f4484e.f4854g.setVisibility(8);
        e5.g gVar = new e5.g();
        gVar.Q0(u(), e5.g.E0);
        androidx.fragment.app.y yVar = gVar.I;
        yVar.C(true);
        yVar.J();
        gVar.f2188y0.getWindow().getDecorView().setSystemUiVisibility(gVar.n().getWindow().getDecorView().getSystemUiVisibility());
        gVar.f2188y0.getWindow().clearFlags(8);
    }

    public final void a0(boolean z10) {
        if (z10) {
            this.R.f4484e.d.setVisibility(4);
            this.R.f4493o.setVisibility(4);
            this.R.f4488i.setVisibility(0);
            return;
        }
        this.R.f4484e.d.setVisibility(0);
        this.R.f4493o.setVisibility(0);
        this.R.f4488i.setVisibility(8);
    }

    public final void b0(String str) {
        this.R.f4493o.setVisibility(8);
        this.R.f4484e.d.setVisibility(8);
        this.R.f4485f.f4698a.setVisibility(0);
        ImageView imageView = (ImageView) this.R.f4485f.f4698a.findViewById(R.id.error_segment_image);
        if (UsersConfig.isGay(this.M.a().getOrientation())) {
            imageView.setImageResource(R.drawable.men);
        } else {
            imageView.setImageResource(R.drawable.girls);
        }
        ((TextView) this.R.f4485f.f4698a.findViewById(R.id.error_txtError)).setText(str);
    }

    public final void c0() {
        if (this.T.isVr()) {
            this.R.f4484e.f4851c.setVisibility(0);
            this.R.f4484e.f4851c.setText(R.string.cast_vr_not_supported);
            return;
        }
        k kVar = this.Q;
        Video video = this.S;
        j jVar = new j(1);
        j.s0("com.google.android.gms.cast.metadata.TITLE", 1);
        jVar.f15694f.putString("com.google.android.gms.cast.metadata.TITLE", video.getVideoMetaData().getTitle().substring(0, video.getVideoMetaData().getTitle().length() < 32 ? video.getVideoMetaData().getTitle().length() - 1 : 32) + "...");
        jVar.f15693c.add(new g9.a(Uri.parse(video.getVideoMetaData().getUrlThumbnail()), 0, 0));
        String vkey = video.getVideoMetaData().getVkey();
        j.s0("vkey", 1);
        jVar.f15694f.putString("vkey", vkey);
        video.setDescription(video.getVideoMetaData().getTitle());
        String json = kVar.a(Video.class).toJson(video);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject = new JSONObject(json);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        String urlVideo = video.getUrlVideo();
        MediaInfo mediaInfo = new MediaInfo(urlVideo, -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        if (urlVideo == null) {
            throw new IllegalArgumentException("contentID cannot be null");
        }
        MediaInfo.a aVar = mediaInfo.I;
        Objects.requireNonNull(aVar);
        MediaInfo.this.f6795f = 1;
        MediaInfo mediaInfo2 = MediaInfo.this;
        mediaInfo2.f6796j = "video/mp4";
        mediaInfo2.f6797m = jVar;
        long duration = video.getVideoMetaData().getDuration() * 1000;
        MediaInfo.a aVar2 = mediaInfo.I;
        Objects.requireNonNull(aVar2);
        if (duration < 0 && duration != -1) {
            throw new IllegalArgumentException("Invalid stream duration");
        }
        MediaInfo.this.n = duration;
        MediaInfo.this.H = jSONObject;
        this.f5543d0 = mediaInfo;
        this.L.D.clear();
        v8.d c10 = this.f5545f0.c();
        I(c10);
        E(PlaybackTarget.CAST);
        this.R.f4484e.f4851c.setText(getString(R.string.playing_on, new Object[]{c10.k().f6784m}));
        long currentPosition = this.f5558s0.getCurrentPosition();
        w8.g gVar = this.f5547h0;
        MediaInfo mediaInfo3 = this.f5543d0;
        if (Double.compare(1.0d, 2.0d) > 0 || Double.compare(1.0d, 0.5d) < 0) {
            throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
        }
        i iVar = new i(mediaInfo3, null, true, currentPosition, 1.0d, null, null, null, null, null, null, 0L);
        h9.o.d("Must be called from the main thread.");
        if (gVar.C()) {
            w8.g.D(new q(gVar, iVar));
        } else {
            w8.g.w(17, null);
        }
        this.f5558s0.q0(true);
        t3.a.t("cast", "connect", "launched");
        kf.a.f12078a.e("Analytics called to track the cast event %s and label %s", "connect", "launched");
        Bundle bundle = new Bundle();
        bundle.putString("cast_event", "connect");
        Intrinsics.checkNotNull(this);
        FirebaseAnalytics.getInstance(this).a("chromecast", bundle);
    }

    public final void d0() {
        Timer timer = this.f5541b0;
        if (timer != null) {
            timer.cancel();
        }
    }

    @Override // com.app.pornhub.view.videodetails.a.InterfaceC0065a
    public void e() {
        T();
    }

    public final void e0() {
        kf.a.f12078a.e("Stopped TrickPlay Timer", new Object[0]);
        Timer timer = this.f5540a0;
        if (timer != null) {
            timer.cancel();
        }
    }

    public final void f0() {
        int h10 = this.f5547h0.h();
        if (h10 == 1) {
            this.R.f4484e.f4858k.setImageDrawable(getResources().getDrawable(R.drawable.ic_play));
            g0(0, (int) this.f5547h0.i());
            if (this.f5547h0.d() == 1 && this.f5550k0 == 2) {
                VideoDetailsViewModel videoDetailsViewModel = this.L;
                String vkey = this.T.getVkey();
                Objects.requireNonNull(videoDetailsViewModel);
                Intrinsics.checkNotNullParameter(vkey, "vkey");
                if (videoDetailsViewModel.f5578q.d() != null && videoDetailsViewModel.f5579r.d() != null) {
                    List<VideoMetaData> d10 = videoDetailsViewModel.f5579r.d();
                    Intrinsics.checkNotNull(d10);
                    Intrinsics.checkNotNullExpressionValue(d10, "playlistVideosLiveData.value!!");
                    List<VideoMetaData> list = d10;
                    Iterator<VideoMetaData> it = list.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        } else if (Intrinsics.areEqual(it.next().getVkey(), vkey)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 != CollectionsKt.getLastIndex(list)) {
                        videoDetailsViewModel.f5580s.l(list.get(i10 + 1).getVkey());
                    } else if (Intrinsics.areEqual(videoDetailsViewModel.f5585x.d(), Boolean.TRUE)) {
                        videoDetailsViewModel.f5580s.l(list.get(0).getVkey());
                    }
                }
            }
        } else if (h10 == 2) {
            X(false);
            this.R.f4484e.f4858k.setImageDrawable(getResources().getDrawable(R.drawable.ic_pause));
        } else if (h10 == 3) {
            X(false);
            this.R.f4484e.f4858k.setImageDrawable(getResources().getDrawable(R.drawable.ic_play));
        } else if (h10 == 4) {
            X(true);
        }
        this.f5550k0 = this.f5547h0.h();
    }

    public void g0(int i10, int i11) {
        this.R.f4484e.f4871z.setProgress(i10);
        this.R.f4484e.f4871z.setMax(i11);
        this.R.f4484e.A.setText(t3.o.e(i10));
        this.R.f4484e.f4855h.setText(t3.o.e(i11));
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        for (Fragment fragment : u().M()) {
            if ((fragment instanceof CommentsFragment) && ((CommentsFragment) fragment).O0()) {
                return;
            }
        }
        if (this.R.f4484e.f4854g.getVisibility() == 0) {
            Q(false);
            return;
        }
        VideoDetailsViewModel videoDetailsViewModel = this.L;
        boolean z10 = true;
        if (videoDetailsViewModel.D.size() > 1) {
            CollectionsKt.removeLast(videoDetailsViewModel.D);
            videoDetailsViewModel.y.l(CollectionsKt.last((List<? extends Object>) videoDetailsViewModel.D));
        } else {
            z10 = false;
        }
        if (!z10) {
            this.f1829t.b();
            return;
        }
        this.f5558s0.C(false);
        d0();
        e0();
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        R(configuration.orientation == 2);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.M.a().isAutoRotateEnabled()) {
            setRequestedOrientation(1);
        }
        ActivityVideodetailsBinding inflate = ActivityVideodetailsBinding.inflate(getLayoutInflater());
        this.R = inflate;
        setContentView(inflate.f4481a);
        this.R.f4484e.f4853f.setOnClickListener(new e5.i(this, 0));
        this.R.f4484e.f4868v.setOnClickListener(new e5.l(this, 0));
        this.R.f4484e.f4870x.setOnClickListener(new e5.k(this, 0));
        this.R.f4484e.f4862p.setOnClickListener(new e5.j(this, 0));
        this.R.f4484e.f4864r.setOnClickListener(new e5.h(this, 0));
        this.R.f4484e.f4866t.setOnClickListener(new m(this, 0));
        this.R.f4484e.f4850b.setOnClickListener(new e5.i(this, 1));
        this.R.f4484e.f4856i.setOnClickListener(new e5.l(this, 1));
        this.R.f4485f.f4698a.setOnClickListener(new e5.k(this, 1));
        setVolumeControlStream(3);
        v0 a10 = new v0.b(this).a();
        this.f5558s0 = a10;
        this.R.f4484e.C.setPlayer(a10);
        this.R.f4484e.C.setKeepScreenOn(true);
        this.X = ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.R.f4487h.getLayoutParams())).height;
        this.f5542c0 = new Handler();
        this.U = p.t();
        boolean c10 = t3.l.c(this);
        this.f5551l0 = c10;
        if (c10) {
            this.f5545f0 = v8.b.c(this).b();
            this.f5548i0 = new b(null);
            this.f5549j0 = new c(null);
            this.f5546g0 = new e5.u(this);
        }
        this.R.n.setText(R.string.videos);
        A(this.R.f4492m);
        if (y() != null) {
            y().m(true);
            y().n(false);
        }
        this.f5558s0.o(new t(this));
        this.R.f4484e.y.setOnClickListener(new e5.i(this, 2));
        V();
        this.R.d.c(new e5.p(this));
        this.R.d.b(new ViewPager.g() { // from class: e5.o
            @Override // androidx.viewpager.widget.ViewPager.g
            public final void d(ViewPager viewPager, y1.a aVar, y1.a aVar2) {
                VideoDetailsActivity videoDetailsActivity = VideoDetailsActivity.this;
                int i10 = VideoDetailsActivity.f5539t0;
                Objects.requireNonNull(videoDetailsActivity);
                t3.a.x(videoDetailsActivity, "Video", "VideoDetailInfo");
            }
        });
        QuickSeekOverlay quickSeekOverlay = this.R.f4484e.B;
        r listener = new r(this, quickSeekOverlay);
        Objects.requireNonNull(quickSeekOverlay);
        Intrinsics.checkNotNullParameter(listener, "listener");
        quickSeekOverlay.N = listener;
        v0 player = this.f5558s0;
        Intrinsics.checkNotNullParameter(player, "player");
        quickSeekOverlay.M = player;
        VideoDetailsViewModel videoDetailsViewModel = (VideoDetailsViewModel) new z(this, this.K).a(VideoDetailsViewModel.class);
        this.L = videoDetailsViewModel;
        videoDetailsViewModel.f5578q.f(this, new androidx.lifecycle.q(this) { // from class: e5.n

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ VideoDetailsActivity f9103b;

            {
                this.f9103b = this;
            }

            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        VideoDetailsActivity context = this.f9103b;
                        Playlist playlist = (Playlist) obj;
                        if (playlist == null) {
                            context.R.f4484e.f4859l.setVisibility(8);
                            context.R.f4484e.f4857j.setVisibility(8);
                            context.R.f4482b.f4880a.setVisibility(8);
                            if (context.R.f4486g.getVisibility() == 0) {
                                context.R.f4486g.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        context.R.f4484e.f4859l.setVisibility(0);
                        context.R.f4484e.f4859l.setOnClickListener(new k(context, 2));
                        context.R.f4484e.f4857j.setVisibility(0);
                        context.R.f4484e.f4857j.setOnClickListener(new j(context, 1));
                        context.R.f4491l.setOnClickListener(new h(context, 1));
                        context.R.f4489j.setOnClickListener(new m(context, 2));
                        context.R.f4482b.f4880a.setVisibility(0);
                        context.R.f4482b.d.setText(playlist.getTitle());
                        TextView textView = context.R.f4482b.f4882c;
                        t3.o oVar = t3.o.f15126a;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(playlist, "playlist");
                        String quantityString = context.getResources().getQuantityString(R.plurals.plural_n_videos, playlist.getVideoCount(), Integer.valueOf(playlist.getVideoCount()));
                        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…list.videoCount\n        )");
                        textView.setText(quantityString + " - " + playlist.getUsername());
                        context.R.f4482b.f4881b.setOnClickListener(new i(context, 3));
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(context.u());
                        int i10 = a0.C0;
                        Intrinsics.checkNotNullParameter(playlist, "playlist");
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable(PlaylistsConfig.TYPE_PLAYLIST, playlist);
                        a0 a0Var = new a0();
                        a0Var.A0(bundle2);
                        aVar.i(R.id.pep_videos_fragment_container, a0Var, a0.class.getSimpleName());
                        aVar.d();
                        return;
                    default:
                        VideoDetailsActivity videoDetailsActivity = this.f9103b;
                        Video video = (Video) obj;
                        int i11 = VideoDetailsActivity.f5539t0;
                        Objects.requireNonNull(videoDetailsActivity);
                        kf.a.f12078a.a("Video info loaded for video: %s", video.getVideoMetaData().getTitle());
                        video.setUrlVideo(t3.p.b(video));
                        videoDetailsActivity.S = video;
                        videoDetailsActivity.T = video.getVideoMetaData();
                        com.bumptech.glide.b.f(videoDetailsActivity).o(videoDetailsActivity.T.getUrlThumbnail()).A(videoDetailsActivity.R.f4484e.f4860m);
                        videoDetailsActivity.Y(true);
                        int duration = videoDetailsActivity.T.getDuration() * 1000;
                        videoDetailsActivity.Z = duration;
                        videoDetailsActivity.g0(0, duration);
                        if (videoDetailsActivity.T.isVr()) {
                            videoDetailsActivity.invalidateOptionsMenu();
                            videoDetailsActivity.R.f4484e.f4856i.setVisibility(8);
                            videoDetailsActivity.R.f4484e.f4850b.setVisibility(0);
                            videoDetailsActivity.T();
                            if (videoDetailsActivity.J()) {
                                videoDetailsActivity.R.f4484e.f4851c.setVisibility(0);
                                videoDetailsActivity.R.f4484e.f4851c.setText(R.string.cast_vr_not_supported);
                                videoDetailsActivity.V();
                                w8.g gVar = videoDetailsActivity.f5547h0;
                                if (gVar != null) {
                                    gVar.s(videoDetailsActivity.f5549j0);
                                }
                            }
                        } else if (!videoDetailsActivity.J()) {
                            videoDetailsActivity.f5558s0.q0(true);
                            videoDetailsActivity.S(false, videoDetailsActivity.L.f5568f.a().isAutoPlayEnabled());
                            videoDetailsActivity.R.f4484e.f4856i.setVisibility(0);
                        }
                        videoDetailsActivity.P(true);
                        videoDetailsActivity.R.d.setAdapter(new h0(videoDetailsActivity, videoDetailsActivity.T));
                        ActivityVideodetailsBinding activityVideodetailsBinding = videoDetailsActivity.R;
                        activityVideodetailsBinding.f4483c.setupWithViewPager(activityVideodetailsBinding.d);
                        if (videoDetailsActivity.J()) {
                            MediaInfo mediaInfo = videoDetailsActivity.f5543d0;
                            if (mediaInfo == null) {
                                videoDetailsActivity.c0();
                            } else if (!t3.p.d(videoDetailsActivity.Q, mediaInfo.H).getVideoMetaData().getVkey().equals(videoDetailsActivity.T.getVkey())) {
                                videoDetailsActivity.c0();
                            }
                        }
                        t3.a.u("Video");
                        return;
                }
            }
        });
        this.L.f5581t.f(this, new g4.b(this, 5));
        this.L.f5580s.f(this, new g4.p(this, 9));
        this.L.f5584w.f(this, new h4.h(this, 7));
        this.L.f5585x.f(this, new i4.g(this, 6));
        this.L.A.f(this, new g4.c(this, 9));
        this.L.y.f(this, new androidx.lifecycle.q(this) { // from class: e5.n

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ VideoDetailsActivity f9103b;

            {
                this.f9103b = this;
            }

            @Override // androidx.lifecycle.q
            public final void a(Object obj) {
                switch (r2) {
                    case 0:
                        VideoDetailsActivity context = this.f9103b;
                        Playlist playlist = (Playlist) obj;
                        if (playlist == null) {
                            context.R.f4484e.f4859l.setVisibility(8);
                            context.R.f4484e.f4857j.setVisibility(8);
                            context.R.f4482b.f4880a.setVisibility(8);
                            if (context.R.f4486g.getVisibility() == 0) {
                                context.R.f4486g.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        context.R.f4484e.f4859l.setVisibility(0);
                        context.R.f4484e.f4859l.setOnClickListener(new k(context, 2));
                        context.R.f4484e.f4857j.setVisibility(0);
                        context.R.f4484e.f4857j.setOnClickListener(new j(context, 1));
                        context.R.f4491l.setOnClickListener(new h(context, 1));
                        context.R.f4489j.setOnClickListener(new m(context, 2));
                        context.R.f4482b.f4880a.setVisibility(0);
                        context.R.f4482b.d.setText(playlist.getTitle());
                        TextView textView = context.R.f4482b.f4882c;
                        t3.o oVar = t3.o.f15126a;
                        Intrinsics.checkNotNullParameter(context, "context");
                        Intrinsics.checkNotNullParameter(playlist, "playlist");
                        String quantityString = context.getResources().getQuantityString(R.plurals.plural_n_videos, playlist.getVideoCount(), Integer.valueOf(playlist.getVideoCount()));
                        Intrinsics.checkNotNullExpressionValue(quantityString, "context.resources.getQua…list.videoCount\n        )");
                        textView.setText(quantityString + " - " + playlist.getUsername());
                        context.R.f4482b.f4881b.setOnClickListener(new i(context, 3));
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(context.u());
                        int i10 = a0.C0;
                        Intrinsics.checkNotNullParameter(playlist, "playlist");
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable(PlaylistsConfig.TYPE_PLAYLIST, playlist);
                        a0 a0Var = new a0();
                        a0Var.A0(bundle2);
                        aVar.i(R.id.pep_videos_fragment_container, a0Var, a0.class.getSimpleName());
                        aVar.d();
                        return;
                    default:
                        VideoDetailsActivity videoDetailsActivity = this.f9103b;
                        Video video = (Video) obj;
                        int i11 = VideoDetailsActivity.f5539t0;
                        Objects.requireNonNull(videoDetailsActivity);
                        kf.a.f12078a.a("Video info loaded for video: %s", video.getVideoMetaData().getTitle());
                        video.setUrlVideo(t3.p.b(video));
                        videoDetailsActivity.S = video;
                        videoDetailsActivity.T = video.getVideoMetaData();
                        com.bumptech.glide.b.f(videoDetailsActivity).o(videoDetailsActivity.T.getUrlThumbnail()).A(videoDetailsActivity.R.f4484e.f4860m);
                        videoDetailsActivity.Y(true);
                        int duration = videoDetailsActivity.T.getDuration() * 1000;
                        videoDetailsActivity.Z = duration;
                        videoDetailsActivity.g0(0, duration);
                        if (videoDetailsActivity.T.isVr()) {
                            videoDetailsActivity.invalidateOptionsMenu();
                            videoDetailsActivity.R.f4484e.f4856i.setVisibility(8);
                            videoDetailsActivity.R.f4484e.f4850b.setVisibility(0);
                            videoDetailsActivity.T();
                            if (videoDetailsActivity.J()) {
                                videoDetailsActivity.R.f4484e.f4851c.setVisibility(0);
                                videoDetailsActivity.R.f4484e.f4851c.setText(R.string.cast_vr_not_supported);
                                videoDetailsActivity.V();
                                w8.g gVar = videoDetailsActivity.f5547h0;
                                if (gVar != null) {
                                    gVar.s(videoDetailsActivity.f5549j0);
                                }
                            }
                        } else if (!videoDetailsActivity.J()) {
                            videoDetailsActivity.f5558s0.q0(true);
                            videoDetailsActivity.S(false, videoDetailsActivity.L.f5568f.a().isAutoPlayEnabled());
                            videoDetailsActivity.R.f4484e.f4856i.setVisibility(0);
                        }
                        videoDetailsActivity.P(true);
                        videoDetailsActivity.R.d.setAdapter(new h0(videoDetailsActivity, videoDetailsActivity.T));
                        ActivityVideodetailsBinding activityVideodetailsBinding = videoDetailsActivity.R;
                        activityVideodetailsBinding.f4483c.setupWithViewPager(activityVideodetailsBinding.d);
                        if (videoDetailsActivity.J()) {
                            MediaInfo mediaInfo = videoDetailsActivity.f5543d0;
                            if (mediaInfo == null) {
                                videoDetailsActivity.c0();
                            } else if (!t3.p.d(videoDetailsActivity.Q, mediaInfo.H).getVideoMetaData().getVkey().equals(videoDetailsActivity.T.getVkey())) {
                                videoDetailsActivity.c0();
                            }
                        }
                        t3.a.u("Video");
                        return;
                }
            }
        });
        H(getIntent());
        getIntent().putExtra("ad_check", true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onCreateOptionsMenu(android.view.Menu r10) {
        /*
            r9 = this;
            r5 = r9
            android.view.MenuInflater r7 = r5.getMenuInflater()
            r0 = r7
            r1 = 2131623944(0x7f0e0008, float:1.8875054E38)
            r7 = 2
            r0.inflate(r1, r10)
            r7 = 5
            r0 = 2131362571(0x7f0a030b, float:1.8344926E38)
            r7 = 7
            android.view.MenuItem r8 = r10.findItem(r0)
            r0 = r8
            f3.o r1 = r5.M
            com.app.pornhub.domain.model.user.UserSettings r8 = r1.a()
            r1 = r8
            boolean r1 = r1.isOfflineAllowed()
            r7 = 1
            r2 = r7
            r3 = 0
            if (r1 == 0) goto L67
            r7 = 7
            com.app.pornhub.domain.model.video.Video r1 = r5.S
            if (r1 == 0) goto L67
            com.app.pornhub.domain.model.video.VideoMetaData r1 = r5.T
            r7 = 7
            boolean r8 = r1.isVr()
            r1 = r8
            if (r1 == 0) goto L38
            r8 = 1
            goto L67
        L38:
            r7 = 3
            r0.setVisible(r2)
            r3.d r1 = r5.V
            r8 = 2
            if (r1 == 0) goto L5d
            java.util.Objects.requireNonNull(r1)
            boolean r1 = io.realm.v.w(r1)
            if (r1 == 0) goto L5d
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            r1 = 2131099794(0x7f060092, float:1.7811951E38)
            r7 = 6
            int r1 = c0.a.b(r5, r1)
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_IN
            r7 = 5
            r0.setColorFilter(r1, r4)
            goto L6a
        L5d:
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            r1 = 0
            r7 = 5
            r0.setColorFilter(r1)
            goto L6a
        L67:
            r0.setVisible(r3)
        L6a:
            boolean r0 = r5.f5551l0
            r8 = 6
            r1 = 2131362399(0x7f0a025f, float:1.8344577E38)
            r7 = 6
            if (r0 == 0) goto L7c
            android.content.Context r8 = r5.getApplicationContext()
            r0 = r8
            v8.a.a(r0, r10, r1)
            goto L83
        L7c:
            android.view.MenuItem r10 = r10.findItem(r1)
            r10.setVisible(r3)
        L83:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.videodetails.VideoDetailsActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        this.f5558s0.k0();
        y<r3.d> yVar = this.W;
        if (yVar != null) {
            yVar.h();
        }
        this.U.close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (this.f5552m0) {
            N();
        } else {
            intent.putExtra("ad_check", true);
        }
        setIntent(intent);
        H(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
        } else if (itemId == R.id.menu_video_details_offline && this.S != null) {
            if (UsersConfig.isPremiumAllowed(this.N.a())) {
                if (this.S.isPaidToDownload()) {
                    VideoMetaData videoMetaData = this.T;
                    Intrinsics.checkNotNullParameter(this, "context");
                    Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
                    Intent intent = new Intent(this, LockedPayVideoActivity.class);
                    intent.putExtra("key_vkey", videoMetaData.getVkey());
                    intent.putExtra("key_prev_url", videoMetaData.getPreviewUrl());
                    intent.putExtra("key_thumb", videoMetaData.getUrlThumbnail());
                    intent.putExtra("key_title", videoMetaData.getTitle());
                    intent.putExtra("key_price", videoMetaData.getPrice());
                    intent.putExtra("key_duration", videoMetaData.getDuration());
                    startActivity(intent);
                } else {
                    r3.d dVar = this.V;
                    if (dVar == null || !v.w(dVar)) {
                        kf.a.f12078a.a("No ongoing video download; Start one ::::::::::::", new Object[0]);
                        Intent c10 = VideoDlService.c(this, this.S);
                        if (Build.VERSION.SDK_INT >= 26) {
                            startForegroundService(c10);
                        } else {
                            startService(c10);
                        }
                    } else {
                        String string = getString(R.string.remove_video_from_lib);
                        String string2 = getString(R.string.remove);
                        String string3 = getString(R.string.cancel);
                        String p10 = this.V.p();
                        String str = x4.b.D0;
                        Bundle bundle = new Bundle();
                        bundle.putString("title", string);
                        bundle.putString("positive_btn_txt", string2);
                        bundle.putString("negative_btn_txt", string3);
                        bundle.putString("payload", p10);
                        x4.b bVar = new x4.b();
                        bVar.A0(bundle);
                        bVar.Q0(u(), x4.b.D0);
                    }
                }
                String vkey = this.T.getVkey();
                String uploader = this.S.getUserMetaData().getUsername();
                String videoContentType = this.T.getVideoContentType().toString();
                String categories = this.S.getCategories();
                Integer valueOf = Integer.valueOf(this.T.getDuration());
                Intrinsics.checkNotNullParameter(vkey, "vkey");
                Intrinsics.checkNotNullParameter(uploader, "uploader");
                Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
                Intrinsics.checkNotNullParameter(categories, "categories");
                t3.g.q(this, "phapp_video_click_download_to_offline", vkey, false, uploader, videoContentType, categories, null, null, valueOf, null, null, 3456);
            } else {
                PopupSource popupSource = PopupSource.VIDEO_PLAYER;
                int i10 = OfflineVideoPopupDialog.E0;
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("source", popupSource);
                OfflineVideoPopupDialog offlineVideoPopupDialog = new OfflineVideoPopupDialog();
                offlineVideoPopupDialog.A0(bundle2);
                offlineVideoPopupDialog.Q0(u(), x4.b.D0);
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onPause() {
        VideoMetaData videoMetaData;
        super.onPause();
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        if (this.f5551l0) {
            this.f5545f0.e(this.f5546g0, v8.d.class);
        }
        w8.g gVar = this.f5547h0;
        if (gVar != null) {
            b bVar = this.f5548i0;
            h9.o.d("Must be called from the main thread.");
            if (bVar != null) {
                gVar.f17014h.remove(bVar);
            }
            this.f5547h0.s(this.f5549j0);
        }
        if (!J() && (videoMetaData = this.T) != null && !videoMetaData.isVr()) {
            this.f5558s0.C(false);
        }
        if (this.f5555p0) {
            return;
        }
        O();
        if (this.f5556q0 == 0) {
            return;
        }
        VideoQuality quality = this.O.a(this.S);
        String vkey = this.T.getVkey();
        boolean z10 = this.f5554o0;
        String uploader = this.S.getUserMetaData().getUsername();
        String videoContentType = this.T.getVideoContentType().toString();
        String categories = this.S.getCategories();
        Integer valueOf = Integer.valueOf(this.T.getDuration());
        boolean z11 = this.f5553n0;
        Long valueOf2 = Long.valueOf(this.f5556q0);
        Intrinsics.checkNotNullParameter(vkey, "vkey");
        Intrinsics.checkNotNullParameter(uploader, "uploader");
        Intrinsics.checkNotNullParameter(videoContentType, "videoContentType");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(quality, "quality");
        t3.g.p(this, "phapp_video_view", vkey, z10, uploader, videoContentType, categories, t3.g.a(quality), Boolean.valueOf(z11), valueOf, valueOf2, "N/A");
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onResume() {
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new f4.c(this, 2));
        R(getResources().getConfiguration().orientation == 2);
        if (this.f5551l0) {
            this.f5545f0.a(this.f5546g0, v8.d.class);
        }
        if (J() && this.f5543d0 != null) {
            v8.d c10 = this.f5545f0.c();
            I(c10);
            E(PlaybackTarget.CAST);
            this.R.f4484e.f4851c.setText(getString(R.string.playing_on, new Object[]{c10.k().f6784m}));
            f0();
        }
        if (!J() && this.f5543d0 != null) {
            this.f5543d0 = null;
            E(PlaybackTarget.LOCAL);
        }
        this.f5555p0 = false;
        super.onResume();
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity
    public void onStart() {
        super.onStart();
        this.f5552m0 = true;
        if (getIntent().getBooleanExtra("ad_check", false)) {
            N();
            getIntent().removeExtra("ad_check");
        }
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f5552m0 = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        R(getResources().getConfiguration().orientation == 2);
    }
}
