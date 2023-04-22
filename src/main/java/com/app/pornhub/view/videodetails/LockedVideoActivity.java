package com.app.pornhub.view.videodetails;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.carouselview.CarouselView;
import com.app.pornhub.databinding.ActivityLockedVideoBinding;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import g4.n;
import io.reactivex.disposables.Disposable;
import q3.d;
import t3.o;
import x2.g;

/* loaded from: classes.dex */
public class LockedVideoActivity extends v3.b {
    public static final /* synthetic */ int Q = 0;
    public o3.c K;
    public d L;
    public ActivityLockedVideoBinding M;
    public Disposable N;
    public String O;
    public final View.OnClickListener P = new a();

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            LockedVideoActivity lockedVideoActivity = LockedVideoActivity.this;
            lockedVideoActivity.onNewIntent(LockedVideoActivity.C(lockedVideoActivity, (VideoMetaData) view.getTag()));
            LockedVideoActivity.this.M.f4426h.smoothScrollTo(0, 0);
        }
    }

    public static Intent C(Context context, VideoMetaData videoMetaData) {
        Intent intent = new Intent(context, LockedVideoActivity.class);
        intent.putExtra("key_vkey", videoMetaData.getVkey());
        intent.putExtra("key_prev_url", videoMetaData.getPreviewUrl());
        intent.putExtra("key_title", videoMetaData.getTitle());
        return intent;
    }

    public final void D(Intent intent) {
        this.O = intent.getStringExtra("key_vkey");
        this.M.f4431m.setVideoURI(Uri.parse(intent.getStringExtra("key_prev_url")));
        this.M.f4430l.setText(intent.getStringExtra("key_title"));
        Disposable disposable = this.N;
        if (disposable != null) {
            disposable.dispose();
        }
        this.N = this.K.a(this.O).subscribe(new g(this, 19));
    }

    public void E() {
        startActivity(PremiumRegistrationActivity.B(this, getString(R.string.get_pornhub_premium), this.L.e()));
        t3.g.k(this, "locked_video");
    }

    public final void F(boolean z10) {
        int i10 = 0;
        this.M.f4424f.setVisibility(z10 ? 0 : 8);
        this.M.f4425g.setVisibility(z10 ? 0 : 8);
        TextView textView = this.M.f4423e;
        if (z10) {
            i10 = 8;
        }
        textView.setVisibility(i10);
    }

    @Override // y4.b, androidx.fragment.app.o, androidx.core.mh.ComponentActivity, b0.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityLockedVideoBinding inflate = ActivityLockedVideoBinding.inflate(getLayoutInflater());
        this.M = inflate;
        setContentView(inflate.f4420a);
        this.M.f4428j.setOnClickListener(new x3.a(this, 12));
        this.M.f4427i.setOnClickListener(new x3.b(this, 15));
        this.M.f4422c.setOnClickListener(new u3.b(this, 14));
        setVolumeControlStream(3);
        ((TextView) this.M.f4429k.findViewById(R.id.toolbar_title)).setText(R.string.videos);
        A(this.M.f4429k);
        if (y() != null) {
            y().m(true);
            y().n(false);
        }
        this.M.f4431m.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: e5.f
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                int i10 = LockedVideoActivity.Q;
                mediaPlayer.setLooping(true);
                mediaPlayer.start();
            }
        });
        this.M.f4421b.setViewListener(new n(this));
        CarouselView carouselView = this.M.f4421b;
        o oVar = o.f15126a;
        carouselView.setPageCount(o.f15127b.length / 2);
        D(getIntent());
    }

    @Override // y4.b, e.g, androidx.fragment.app.o, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Disposable disposable = this.N;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // androidx.fragment.app.o, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        D(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
