package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.google.android.exoplayer2.ui.PlayerView;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityOfflineVideoPlayerBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4434a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f4435b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4436c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageButton f4437e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f4438f;

    /* renamed from: g  reason: collision with root package name */
    public final SeekBar f4439g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4440h;

    /* renamed from: i  reason: collision with root package name */
    public final PlayerView f4441i;

    public ActivityOfflineVideoPlayerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, TextView textView, ImageView imageView, ImageButton imageButton, ProgressBar progressBar, ConstraintLayout constraintLayout3, SeekBar seekBar, TextView textView2, PlayerView playerView) {
        this.f4434a = constraintLayout;
        this.f4435b = constraintLayout2;
        this.f4436c = textView;
        this.d = imageView;
        this.f4437e = imageButton;
        this.f4438f = progressBar;
        this.f4439g = seekBar;
        this.f4440h = textView2;
        this.f4441i = playerView;
    }

    public static ActivityOfflineVideoPlayerBinding bind(View view) {
        int i10 = R.id.control_bar;
        ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.control_bar);
        if (constraintLayout != null) {
            i10 = R.id.control_bar_bg;
            View t2 = b.t(view, R.id.control_bar_bg);
            if (t2 != null) {
                i10 = R.id.endText;
                TextView textView = (TextView) b.t(view, R.id.endText);
                if (textView != null) {
                    i10 = R.id.expandButton;
                    ImageView imageView = (ImageView) b.t(view, R.id.expandButton);
                    if (imageView != null) {
                        i10 = R.id.playPauseButton;
                        ImageButton imageButton = (ImageButton) b.t(view, R.id.playPauseButton);
                        if (imageButton != null) {
                            i10 = R.id.progressBar;
                            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progressBar);
                            if (progressBar != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                i10 = R.id.seekBar;
                                SeekBar seekBar = (SeekBar) b.t(view, R.id.seekBar);
                                if (seekBar != null) {
                                    i10 = R.id.startText;
                                    TextView textView2 = (TextView) b.t(view, R.id.startText);
                                    if (textView2 != null) {
                                        i10 = R.id.videoView;
                                        PlayerView playerView = (PlayerView) b.t(view, R.id.videoView);
                                        if (playerView != null) {
                                            return new ActivityOfflineVideoPlayerBinding(constraintLayout2, constraintLayout, t2, textView, imageView, imageButton, progressBar, constraintLayout2, seekBar, textView2, playerView);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityOfflineVideoPlayerBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_offline_video_player, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4434a;
    }
}
