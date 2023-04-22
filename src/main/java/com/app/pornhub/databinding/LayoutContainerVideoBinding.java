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
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import com.app.pornhub.view.quickseek.QuickSeekFrameLayout;
import com.app.pornhub.view.quickseek.overlay.QuickSeekOverlay;
import com.google.android.exoplayer2.ui.PlayerView;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutContainerVideoBinding implements a {
    public final TextView A;
    public final QuickSeekOverlay B;
    public final PlayerView C;

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4849a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4850b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4851c;
    public final ConstraintLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final ConstraintLayout f4852e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4853f;

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f4854g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4855h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f4856i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4857j;

    /* renamed from: k  reason: collision with root package name */
    public final ImageButton f4858k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4859l;

    /* renamed from: m  reason: collision with root package name */
    public final ImageView f4860m;
    public final ProgressBar n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f4861o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f4862p;

    /* renamed from: q  reason: collision with root package name */
    public final ImageView f4863q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f4864r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f4865s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f4866t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f4867u;

    /* renamed from: v  reason: collision with root package name */
    public final TextView f4868v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f4869w;

    /* renamed from: x  reason: collision with root package name */
    public final TextView f4870x;
    public final QuickSeekFrameLayout y;

    /* renamed from: z  reason: collision with root package name */
    public final SeekBar f4871z;

    public LayoutContainerVideoBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout2, View view, ConstraintLayout constraintLayout3, Guideline guideline, ImageView imageView2, ConstraintLayout constraintLayout4, TextView textView2, ImageView imageView3, ImageView imageView4, ImageButton imageButton, ImageView imageView5, ImageView imageView6, ProgressBar progressBar, ImageView imageView7, TextView textView3, ImageView imageView8, TextView textView4, ImageView imageView9, TextView textView5, ImageView imageView10, TextView textView6, ImageView imageView11, TextView textView7, ImageView imageView12, TextView textView8, QuickSeekFrameLayout quickSeekFrameLayout, SeekBar seekBar, TextView textView9, QuickSeekOverlay quickSeekOverlay, PlayerView playerView) {
        this.f4849a = constraintLayout;
        this.f4850b = imageView;
        this.f4851c = textView;
        this.d = constraintLayout2;
        this.f4852e = constraintLayout3;
        this.f4853f = imageView2;
        this.f4854g = constraintLayout4;
        this.f4855h = textView2;
        this.f4856i = imageView3;
        this.f4857j = imageView4;
        this.f4858k = imageButton;
        this.f4859l = imageView5;
        this.f4860m = imageView6;
        this.n = progressBar;
        this.f4861o = imageView7;
        this.f4862p = textView3;
        this.f4863q = imageView8;
        this.f4864r = textView4;
        this.f4865s = imageView9;
        this.f4866t = textView5;
        this.f4867u = imageView10;
        this.f4868v = textView6;
        this.f4869w = imageView11;
        this.f4870x = textView7;
        this.y = quickSeekFrameLayout;
        this.f4871z = seekBar;
        this.A = textView9;
        this.B = quickSeekOverlay;
        this.C = playerView;
    }

    public static LayoutContainerVideoBinding bind(View view) {
        int i10 = R.id.cardboardButton;
        ImageView imageView = (ImageView) b.t(view, R.id.cardboardButton);
        if (imageView != null) {
            i10 = R.id.cast_info_text;
            TextView textView = (TextView) b.t(view, R.id.cast_info_text);
            if (textView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.control_bar_bg;
                View t2 = b.t(view, R.id.control_bar_bg);
                if (t2 != null) {
                    i10 = R.id.controls;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.controls);
                    if (constraintLayout2 != null) {
                        i10 = R.id.enc_panel_vertical_guideline;
                        Guideline guideline = (Guideline) b.t(view, R.id.enc_panel_vertical_guideline);
                        if (guideline != null) {
                            i10 = R.id.encodingToggleButton;
                            ImageView imageView2 = (ImageView) b.t(view, R.id.encodingToggleButton);
                            if (imageView2 != null) {
                                i10 = R.id.encodings_panel;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) b.t(view, R.id.encodings_panel);
                                if (constraintLayout3 != null) {
                                    i10 = R.id.endText;
                                    TextView textView2 = (TextView) b.t(view, R.id.endText);
                                    if (textView2 != null) {
                                        i10 = R.id.fullScreenButton;
                                        ImageView imageView3 = (ImageView) b.t(view, R.id.fullScreenButton);
                                        if (imageView3 != null) {
                                            i10 = R.id.nextButton;
                                            ImageView imageView4 = (ImageView) b.t(view, R.id.nextButton);
                                            if (imageView4 != null) {
                                                i10 = R.id.playPauseButton;
                                                ImageButton imageButton = (ImageButton) b.t(view, R.id.playPauseButton);
                                                if (imageButton != null) {
                                                    i10 = R.id.prevButton;
                                                    ImageView imageView5 = (ImageView) b.t(view, R.id.prevButton);
                                                    if (imageView5 != null) {
                                                        i10 = R.id.previewImage;
                                                        ImageView imageView6 = (ImageView) b.t(view, R.id.previewImage);
                                                        if (imageView6 != null) {
                                                            i10 = R.id.progressBar;
                                                            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.progressBar);
                                                            if (progressBar != null) {
                                                                i10 = R.id.quality_button_1080p_check;
                                                                ImageView imageView7 = (ImageView) b.t(view, R.id.quality_button_1080p_check);
                                                                if (imageView7 != null) {
                                                                    i10 = R.id.quality_button_1080p_label;
                                                                    TextView textView3 = (TextView) b.t(view, R.id.quality_button_1080p_label);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.quality_button_1440p_check;
                                                                        ImageView imageView8 = (ImageView) b.t(view, R.id.quality_button_1440p_check);
                                                                        if (imageView8 != null) {
                                                                            i10 = R.id.quality_button_1440p_label;
                                                                            TextView textView4 = (TextView) b.t(view, R.id.quality_button_1440p_label);
                                                                            if (textView4 != null) {
                                                                                i10 = R.id.quality_button_2160p_check;
                                                                                ImageView imageView9 = (ImageView) b.t(view, R.id.quality_button_2160p_check);
                                                                                if (imageView9 != null) {
                                                                                    i10 = R.id.quality_button_2160p_label;
                                                                                    TextView textView5 = (TextView) b.t(view, R.id.quality_button_2160p_label);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.quality_button_480p_check;
                                                                                        ImageView imageView10 = (ImageView) b.t(view, R.id.quality_button_480p_check);
                                                                                        if (imageView10 != null) {
                                                                                            i10 = R.id.quality_button_480p_label;
                                                                                            TextView textView6 = (TextView) b.t(view, R.id.quality_button_480p_label);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.quality_button_720p_check;
                                                                                                ImageView imageView11 = (ImageView) b.t(view, R.id.quality_button_720p_check);
                                                                                                if (imageView11 != null) {
                                                                                                    i10 = R.id.quality_button_720p_label;
                                                                                                    TextView textView7 = (TextView) b.t(view, R.id.quality_button_720p_label);
                                                                                                    if (textView7 != null) {
                                                                                                        i10 = R.id.quality_divider_line;
                                                                                                        ImageView imageView12 = (ImageView) b.t(view, R.id.quality_divider_line);
                                                                                                        if (imageView12 != null) {
                                                                                                            i10 = R.id.quality_title;
                                                                                                            TextView textView8 = (TextView) b.t(view, R.id.quality_title);
                                                                                                            if (textView8 != null) {
                                                                                                                i10 = R.id.quickSeekContainer;
                                                                                                                QuickSeekFrameLayout quickSeekFrameLayout = (QuickSeekFrameLayout) b.t(view, R.id.quickSeekContainer);
                                                                                                                if (quickSeekFrameLayout != null) {
                                                                                                                    i10 = R.id.seekBar;
                                                                                                                    SeekBar seekBar = (SeekBar) b.t(view, R.id.seekBar);
                                                                                                                    if (seekBar != null) {
                                                                                                                        i10 = R.id.startText;
                                                                                                                        TextView textView9 = (TextView) b.t(view, R.id.startText);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i10 = R.id.videoSeekOverlay;
                                                                                                                            QuickSeekOverlay quickSeekOverlay = (QuickSeekOverlay) b.t(view, R.id.videoSeekOverlay);
                                                                                                                            if (quickSeekOverlay != null) {
                                                                                                                                i10 = R.id.videoView;
                                                                                                                                PlayerView playerView = (PlayerView) b.t(view, R.id.videoView);
                                                                                                                                if (playerView != null) {
                                                                                                                                    return new LayoutContainerVideoBinding(constraintLayout, imageView, textView, constraintLayout, t2, constraintLayout2, guideline, imageView2, constraintLayout3, textView2, imageView3, imageView4, imageButton, imageView5, imageView6, progressBar, imageView7, textView3, imageView8, textView4, imageView9, textView5, imageView10, textView6, imageView11, textView7, imageView12, textView8, quickSeekFrameLayout, seekBar, textView9, quickSeekOverlay, playerView);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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

    public static LayoutContainerVideoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_container_video, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4849a;
    }
}
