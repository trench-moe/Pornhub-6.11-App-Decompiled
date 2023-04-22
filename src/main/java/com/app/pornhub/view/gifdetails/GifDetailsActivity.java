package com.app.pornhub.view.gifdetails;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import androidx.fragment.app.Fragment;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityGifDetailsBinding;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.gif.Gif;
import com.app.pornhub.domain.model.user.UserSettings;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.comments.CommentsFragment;
import com.app.pornhub.view.common.widget.GifViewCustom;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import f3.o;
import f4.p;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import u3.c;
import x2.a0;
import x2.k0;
import x2.m;

/* loaded from: classes.dex */
public class GifDetailsActivity extends v3.b {
    public static final /* synthetic */ int U = 0;
    public h3.b K;
    public o L;
    public UserSettings M;
    public ActivityGifDetailsBinding N;
    public MediaPlayer O;
    public Disposable P;
    public Gif Q;
    public ArrayList<Gif> R;
    public Handler S;
    public Timer T;

    /* loaded from: classes.dex */
    public class b extends TimerTask {
        public b(a aVar) {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            GifDetailsActivity.this.S.post(new q0(this, 5));
        }
    }

    public static Intent D(Context context, String str) {
        Intent intent = new Intent(context, GifDetailsActivity.class);
        intent.putExtra("key_gif_id", str);
        return intent;
    }

    public final void C(int i10) {
        if ((i10 & 4) == 0) {
            this.N.f4387k.setVisibility(0);
            this.N.f4380c.setVisibility(0);
            this.N.f4381e.setMaxHeight(m9.a.p(250));
            return;
        }
        this.N.f4387k.setVisibility(8);
        this.N.f4380c.setVisibility(8);
        this.N.f4381e.setMaxHeight(m9.a.p(0));
    }

    public final void E(String gifId) {
        h3.b bVar = this.K;
        Objects.requireNonNull(bVar);
        Intrinsics.checkNotNullParameter(gifId, "gifId");
        Observable startWith = bVar.f10111a.a(gifId).toObservable().map(a0.D).onErrorReturn(k0.y).startWith((Observable) UseCaseResult.a.f4910a);
        Intrinsics.checkNotNullExpressionValue(startWith, "gifsRepository.getGif(gi…th(UseCaseResult.Loading)");
        this.P = startWith.subscribe(new m(this, 7));
    }

    public final void F(Gif gif) {
        this.Q = gif;
        this.N.f4381e.stopPlayback();
        this.N.f4381e.setVisibility(8);
        this.N.f4381e.setVisibility(0);
        if (TextUtils.isEmpty(gif.getMediaUrl())) {
            this.N.f4381e.setVideoURI(Uri.parse(gif.getFallbackMediaUrl()));
            kf.a.f12078a.a("Opening WEBM URL %s", Uri.parse(gif.getFallbackMediaUrl()));
        } else {
            this.N.f4381e.setVideoURI(Uri.parse(gif.getMediaUrl()));
            kf.a.f12078a.a("Opening MP4 URL %s", Uri.parse(gif.getMediaUrl()));
        }
        I(true);
        this.N.f4388l.setAdapter(new p(this, gif));
        ActivityGifDetailsBinding activityGifDetailsBinding = this.N;
        activityGifDetailsBinding.f4386j.setupWithViewPager(activityGifDetailsBinding.f4388l);
    }

    public final void G(boolean z10) {
        int systemUiVisibility = getWindow().getDecorView().getSystemUiVisibility();
        if (z10) {
            getWindow().getDecorView().setSystemUiVisibility(4102);
            C(4102);
            return;
        }
        int i10 = systemUiVisibility & (-4103);
        getWindow().getDecorView().setSystemUiVisibility(i10);
        C(i10);
    }

    public final void H(String str) {
        this.N.f4379b.f4698a.setVisibility(0);
        ImageView imageView = (ImageView) this.N.f4379b.f4698a.findViewById(R.id.error_segment_image);
        if (UsersConfig.isGay(this.M.getOrientation())) {
            imageView.setImageResource(R.drawable.men);
        } else {
            imageView.setImageResource(R.drawable.girls);
        }
        ((TextView) this.N.f4379b.f4698a.findViewById(R.id.error_txtError)).setText(str);
    }

    public final void I(boolean z10) {
        this.N.d.setVisibility(z10 ? 0 : 8);
    }

    public final void J(boolean z10) {
        Gif gif = this.Q;
        if (gif == null) {
            return;
        }
        if (!z10 || TextUtils.isEmpty(gif.getNewer())) {
            this.N.f4383g.setVisibility(8);
        } else {
            this.N.f4383g.setVisibility(0);
        }
        if (!z10 || TextUtils.isEmpty(this.Q.getOlder())) {
            this.N.f4382f.setVisibility(8);
        } else {
            this.N.f4382f.setVisibility(0);
        }
    }

    public final void K(boolean z10) {
        this.N.f4385i.setVisibility(z10 ? 0 : 8);
    }

    @Override // androidx.core.mh.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> M = u().M();
        if (M != null) {
            for (Fragment fragment : M) {
                if ((fragment instanceof CommentsFragment) && ((CommentsFragment) fragment).O0()) {
                    return;
                }
            }
        }
        if (this.R.size() <= 1) {
            this.f1829t.b();
            return;
        }
        ArrayList<Gif> arrayList = this.R;
        arrayList.remove(arrayList.size() - 1);
        ArrayList<Gif> arrayList2 = this.R;
        F(arrayList2.get(arrayList2.size() - 1));
    }

    @Override // e.g, androidx.fragment.app.o, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        G(configuration.orientation == 2);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UserSettings a10 = this.L.a();
        this.M = a10;
        if (!a10.isAutoRotateEnabled()) {
            setRequestedOrientation(1);
        }
        ActivityGifDetailsBinding inflate = ActivityGifDetailsBinding.inflate(getLayoutInflater());
        this.N = inflate;
        setContentView(inflate.f4378a);
        this.N.f4379b.f4698a.setOnClickListener(new c(this, 2));
        this.N.f4385i.setOnClickListener(new u3.a(this, 3));
        this.N.f4383g.setOnClickListener(new b4.b(this, 1));
        this.N.f4382f.setOnClickListener(new x3.a(this, 3));
        setVolumeControlStream(3);
        this.S = new Handler();
        this.R = new ArrayList<>();
        TextView textView = (TextView) this.N.f4387k.findViewById(R.id.toolbar_title);
        if (textView != null) {
            textView.setText(R.string.gifs);
        }
        A(this.N.f4387k);
        if (y() != null) {
            y().m(true);
            y().n(false);
        }
        this.N.f4381e.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: f4.a
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                GifDetailsActivity gifDetailsActivity = GifDetailsActivity.this;
                int i12 = GifDetailsActivity.U;
                Objects.requireNonNull(gifDetailsActivity);
                kf.a.f12078a.c("OnErrorListener.onError(): VideoView encountered an error, what: %s, extra: %s", Integer.valueOf(i10), Integer.valueOf(i11));
                t3.o.n(gifDetailsActivity, i11 == -110 ? gifDetailsActivity.getString(R.string.video_error_media_load_timeout) : i10 == 100 ? gifDetailsActivity.getString(R.string.video_error_server_unaccessible) : i11 == -1004 ? gifDetailsActivity.getString(R.string.error_network) : gifDetailsActivity.getString(R.string.gif_error_unknown_error));
                gifDetailsActivity.I(false);
                mediaPlayer.reset();
                gifDetailsActivity.O = null;
                return true;
            }
        });
        this.N.f4381e.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: f4.b
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                GifDetailsActivity gifDetailsActivity = GifDetailsActivity.this;
                int i10 = GifDetailsActivity.U;
                Objects.requireNonNull(gifDetailsActivity);
                kf.a.f12078a.e("onPrepared is reached for media player", new Object[0]);
                int videoWidth = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                GifViewCustom gifViewCustom = gifDetailsActivity.N.f4381e;
                gifViewCustom.f4984c = videoWidth;
                gifViewCustom.f4985f = videoHeight;
                if (videoWidth != 0 && videoHeight != 0) {
                    gifViewCustom.requestLayout();
                }
                gifDetailsActivity.O = mediaPlayer;
                mediaPlayer.setLooping(true);
                mediaPlayer.seekTo(100);
                gifDetailsActivity.I(false);
                if (gifDetailsActivity.getIntent().hasExtra("autoplay") && gifDetailsActivity.getIntent().getBooleanExtra("autoplay", false)) {
                    mediaPlayer.start();
                    gifDetailsActivity.J(false);
                    return;
                }
                gifDetailsActivity.K(true);
                gifDetailsActivity.J(true);
            }
        });
        this.N.f4381e.setOnTouchListener(new View.OnTouchListener() { // from class: f4.d
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                GifDetailsActivity gifDetailsActivity = GifDetailsActivity.this;
                int i10 = GifDetailsActivity.U;
                Objects.requireNonNull(gifDetailsActivity);
                if (motionEvent.getAction() == 0) {
                    gifDetailsActivity.J(true);
                    Timer timer = gifDetailsActivity.T;
                    if (timer != null) {
                        timer.cancel();
                    }
                    Timer timer2 = new Timer();
                    gifDetailsActivity.T = timer2;
                    timer2.schedule(new GifDetailsActivity.b(null), 3000L);
                    return true;
                }
                return false;
            }
        });
        E(getIntent().getExtras().getString("key_gif_id"));
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        this.N.f4381e.setOnCompletionListener(null);
        this.N.f4381e.setOnErrorListener(null);
        this.N.f4381e.setOnPreparedListener(null);
        this.N.f4381e.setOnInfoListener(null);
        Disposable disposable = this.P;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        Disposable disposable;
        super.onNewIntent(intent);
        MediaPlayer mediaPlayer = this.O;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (IllegalStateException e10) {
                kf.a.f12078a.d(e10, "Can't stop playback on unprepared media player", new Object[0]);
            }
            disposable = this.P;
            if (disposable != null && !disposable.isDisposed()) {
                this.P.dispose();
            }
            intent.putExtra("autoplay", true);
            K(false);
            setIntent(intent);
            E(intent.getExtras().getString("key_gif_id"));
        }
        disposable = this.P;
        if (disposable != null) {
            this.P.dispose();
        }
        intent.putExtra("autoplay", true);
        K(false);
        setIntent(intent);
        E(intent.getExtras().getString("key_gif_id"));
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // y4.b, androidx.fragment.app.o, android.app.Activity
    public void onResume() {
        boolean z10 = false;
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new f4.c(this, 0));
        if (getResources().getConfiguration().orientation == 2) {
            z10 = true;
        }
        G(z10);
        super.onResume();
    }
}
