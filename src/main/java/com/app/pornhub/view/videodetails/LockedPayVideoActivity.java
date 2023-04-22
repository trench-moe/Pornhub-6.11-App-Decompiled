package com.app.pornhub.view.videodetails;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.ViewDataBinding;
import com.app.pornhub.R;
import com.app.pornhub.carouselview.CarouselView;
import com.app.pornhub.databinding.ActivityLockedPayVideoBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.appsflyer.oaid.BuildConfig;
import com.bumptech.glide.f;
import e5.e;
import f3.h;
import f4.i;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q3.d;
import t3.g;
import t3.o;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/app/pornhub/view/videodetails/LockedPayVideoActivity;", "Lv3/b;", "<init>", "()V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class LockedPayVideoActivity extends v3.b {
    public static final /* synthetic */ int R = 0;
    public o3.c K;
    public h L;
    public d M;
    public ActivityLockedPayVideoBinding N;
    public final CompositeDisposable O;
    public String P;
    public final View.OnClickListener Q;

    public LockedPayVideoActivity() {
        new LinkedHashMap();
        this.O = new CompositeDisposable();
        this.P = BuildConfig.FLAVOR;
        this.Q = new b4.b(this, 15);
    }

    public static final Intent D(Context context, VideoMetaData videoMetaData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoMetaData, "videoMetaData");
        Intent intent = new Intent(context, LockedPayVideoActivity.class);
        intent.putExtra("key_vkey", videoMetaData.getVkey());
        intent.putExtra("key_prev_url", videoMetaData.getPreviewUrl());
        intent.putExtra("key_thumb", videoMetaData.getUrlThumbnail());
        intent.putExtra("key_title", videoMetaData.getTitle());
        intent.putExtra("key_price", videoMetaData.getPrice());
        intent.putExtra("key_duration", videoMetaData.getDuration());
        return intent;
    }

    public final void C(VideoMetaData videoMetaData, View view) {
        com.bumptech.glide.b.f(this).o(videoMetaData.getUrlThumbnail()).A((ImageView) view.findViewById(R.id.imgThumb));
        ((TextView) view.findViewById(R.id.videoTitle)).setText(videoMetaData.getTitle());
        ImageView uploaderTypeIcon = (ImageView) view.findViewById(R.id.imageViewUploaderType);
        Intrinsics.checkNotNullExpressionValue(uploaderTypeIcon, "uploaderTypeIcon");
        o.o(videoMetaData, uploaderTypeIcon);
        ((TextView) view.findViewById(R.id.userName)).setText(videoMetaData.getUserMetaData().getUsername());
        ((TextView) view.findViewById(R.id.viewCount)).setText(a0.b.u(videoMetaData.getViewCount()));
        ((TextView) view.findViewById(R.id.rating)).setText(a0.b.z(videoMetaData.getRating()));
        VideoContentType type = videoMetaData.getVideoContentType();
        View findViewById = view.findViewById(R.id.icPremium);
        Intrinsics.checkNotNullExpressionValue(findViewById, "parent.findViewById(R.id.icPremium)");
        ImageView target = (ImageView) findViewById;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        o oVar = o.f15126a;
        o.a(type, target, R.drawable.ic_premium, R.drawable.ic_premium_free);
        TextView textView = (TextView) view.findViewById(R.id.videoType);
        if (videoMetaData.isHd()) {
            textView.setText(getString(R.string.f21944hd));
        } else if (videoMetaData.isVr()) {
            textView.setText(getString(R.string.vr));
        } else {
            textView.setText(BuildConfig.FLAVOR);
        }
        ((TextView) view.findViewById(R.id.videoLength)).setText(a0.b.y(videoMetaData.getDuration() * 1000));
    }

    public final void E() {
        g.k(this, "locked_pay_video");
        String string = getString(R.string.get_pornhub_premium);
        d dVar = this.M;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webLinksManager");
            dVar = null;
        }
        startActivity(PremiumRegistrationActivity.B(this, string, dVar.e()));
    }

    public final void F() {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.N;
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding2 = null;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        activityLockedPayVideoBinding.f4414t.setVisibility(8);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding3 = this.N;
        if (activityLockedPayVideoBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLockedPayVideoBinding2 = activityLockedPayVideoBinding3;
        }
        activityLockedPayVideoBinding2.f4419z.setVisibility(0);
    }

    public final void G(boolean z10) {
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.N;
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding2 = null;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        int i10 = 0;
        activityLockedPayVideoBinding.f4408m.setVisibility(z10 ? 0 : 8);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding3 = this.N;
        if (activityLockedPayVideoBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding3 = null;
        }
        activityLockedPayVideoBinding3.f4414t.setVisibility(z10 ? 0 : 8);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding4 = this.N;
        if (activityLockedPayVideoBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityLockedPayVideoBinding2 = activityLockedPayVideoBinding4;
        }
        TextView textView = activityLockedPayVideoBinding2.f4419z;
        if (z10) {
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding d = androidx.databinding.d.d(this, R.layout.activity_locked_pay_video);
        Intrinsics.checkNotNullExpressionValue(d, "setContentView(this, R.l…ctivity_locked_pay_video)");
        this.N = (ActivityLockedPayVideoBinding) d;
        setVolumeControlStream(3);
        String stringExtra = getIntent().getStringExtra("key_vkey");
        String str = BuildConfig.FLAVOR;
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.P = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("key_title");
        String stringExtra3 = getIntent().getStringExtra("key_prev_url");
        String stringExtra4 = getIntent().getStringExtra("key_thumb");
        String stringExtra5 = getIntent().getStringExtra("key_price");
        int intExtra = getIntent().getIntExtra("key_duration", 0);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding = this.N;
        o3.c cVar = null;
        if (activityLockedPayVideoBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding = null;
        }
        TextView textView = (TextView) activityLockedPayVideoBinding.f4417w.findViewById(R.id.toolbar_title);
        if (textView != null) {
            textView.setText(R.string.videos);
        }
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding2 = this.N;
        if (activityLockedPayVideoBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding2 = null;
        }
        A(activityLockedPayVideoBinding2.f4417w);
        if (y() != null) {
            ActionBar y = y();
            Intrinsics.checkNotNull(y);
            y.m(true);
            ActionBar y10 = y();
            Intrinsics.checkNotNull(y10);
            y10.n(false);
        }
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding3 = this.N;
        if (activityLockedPayVideoBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding3 = null;
        }
        activityLockedPayVideoBinding3.E.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: e5.a
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                LockedPayVideoActivity this$0 = LockedPayVideoActivity.this;
                int i10 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            }
        });
        UsersConfig.Companion companion = UsersConfig.Companion;
        h hVar = this.L;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("getCurrentAuthLevelUseCase");
            hVar = null;
        }
        if (companion.isPremiumAllowed(hVar.a())) {
            ActivityLockedPayVideoBinding activityLockedPayVideoBinding4 = this.N;
            if (activityLockedPayVideoBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLockedPayVideoBinding4 = null;
            }
            activityLockedPayVideoBinding4.F.setVisibility(8);
        } else {
            ActivityLockedPayVideoBinding activityLockedPayVideoBinding5 = this.N;
            if (activityLockedPayVideoBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLockedPayVideoBinding5 = null;
            }
            activityLockedPayVideoBinding5.f4407l.setViewListener(new i(this, 2));
            ActivityLockedPayVideoBinding activityLockedPayVideoBinding6 = this.N;
            if (activityLockedPayVideoBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                activityLockedPayVideoBinding6 = null;
            }
            CarouselView carouselView = activityLockedPayVideoBinding6.f4407l;
            o oVar = o.f15126a;
            carouselView.setPageCount(o.f15127b.length / 2);
        }
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding7 = this.N;
        if (activityLockedPayVideoBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding7 = null;
        }
        activityLockedPayVideoBinding7.E.setVideoURI(Uri.parse(stringExtra3));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding8 = this.N;
        if (activityLockedPayVideoBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding8 = null;
        }
        activityLockedPayVideoBinding8.D.setText(stringExtra2);
        f<Drawable> o10 = com.bumptech.glide.b.f(this).o(stringExtra4);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding9 = this.N;
        if (activityLockedPayVideoBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding9 = null;
        }
        o10.A(activityLockedPayVideoBinding9.f4409o);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding10 = this.N;
        if (activityLockedPayVideoBinding10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding10 = null;
        }
        activityLockedPayVideoBinding10.C.setText(stringExtra2);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding11 = this.N;
        if (activityLockedPayVideoBinding11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding11 = null;
        }
        TextView textView2 = activityLockedPayVideoBinding11.y;
        if (stringExtra5 != null) {
            str = stringExtra5;
        }
        textView2.setText(str);
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding12 = this.N;
        if (activityLockedPayVideoBinding12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding12 = null;
        }
        activityLockedPayVideoBinding12.B.setText(a0.b.y(intExtra * 1000));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding13 = this.N;
        if (activityLockedPayVideoBinding13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding13 = null;
        }
        activityLockedPayVideoBinding13.A.setOnClickListener(new u3.c(this, 14));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding14 = this.N;
        if (activityLockedPayVideoBinding14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding14 = null;
        }
        activityLockedPayVideoBinding14.f4418x.setOnClickListener(new u3.a(this, 17));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding15 = this.N;
        if (activityLockedPayVideoBinding15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding15 = null;
        }
        float f10 = -activityLockedPayVideoBinding15.f4415u.getLayoutParams().width;
        TranslateAnimation translateAnimation = new TranslateAnimation(f10, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(500L);
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(new e5.c(this));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        alphaAnimation.setAnimationListener(new e5.d(this));
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(500L);
        alphaAnimation2.setAnimationListener(new e(this, translateAnimation));
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, f10, 0.0f, 0.0f);
        translateAnimation2.setDuration(500L);
        translateAnimation2.setFillAfter(true);
        translateAnimation2.setAnimationListener(new e5.b(this, alphaAnimation));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding16 = this.N;
        if (activityLockedPayVideoBinding16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding16 = null;
        }
        activityLockedPayVideoBinding16.f4416v.setOnClickListener(new x3.a(translateAnimation2, 11));
        ActivityLockedPayVideoBinding activityLockedPayVideoBinding17 = this.N;
        if (activityLockedPayVideoBinding17 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityLockedPayVideoBinding17 = null;
        }
        activityLockedPayVideoBinding17.n.setOnClickListener(new r4.d(this, alphaAnimation2, 2));
        this.O.clear();
        o3.c cVar2 = this.K;
        if (cVar2 != null) {
            cVar = cVar2;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("getRelatedPremiumVideosUseCase");
        }
        Disposable subscribe = cVar.a(this.P).subscribe(new x2.a(this, 18));
        Intrinsics.checkNotNullExpressionValue(subscribe, "getRelatedPremiumVideosU…          }\n            }");
        DisposableKt.addTo(subscribe, this.O);
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.O.dispose();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 16908332) {
            this.f1829t.b();
        }
        return super.onOptionsItemSelected(item);
    }
}
