package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemVideoCommentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4804a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4805b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4806c;
    public final ProgressBar d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4807e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4808f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f4809g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f4810h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f4811i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4812j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4813k;

    /* renamed from: l  reason: collision with root package name */
    public final ImageView f4814l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f4815m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f4816o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f4817p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f4818q;

    /* renamed from: r  reason: collision with root package name */
    public final ProgressBar f4819r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f4820s;

    /* renamed from: t  reason: collision with root package name */
    public final ProgressBar f4821t;

    public ItemVideoCommentBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ProgressBar progressBar, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, TextView textView3, ImageView imageView7, TextView textView4, ImageView imageView8, TextView textView5, TextView textView6, TextView textView7, ProgressBar progressBar2, TextView textView8, ProgressBar progressBar3) {
        this.f4804a = constraintLayout;
        this.f4805b = textView;
        this.f4806c = textView2;
        this.d = progressBar;
        this.f4807e = imageView;
        this.f4808f = imageView2;
        this.f4809g = imageView3;
        this.f4810h = imageView4;
        this.f4811i = imageView5;
        this.f4812j = imageView6;
        this.f4813k = textView3;
        this.f4814l = imageView7;
        this.f4815m = textView4;
        this.n = imageView8;
        this.f4816o = textView5;
        this.f4817p = textView6;
        this.f4818q = textView7;
        this.f4819r = progressBar2;
        this.f4820s = textView8;
        this.f4821t = progressBar3;
    }

    public static ItemVideoCommentBinding a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.item_video_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemVideoCommentBinding bind(View view) {
        int i10 = R.id.comment_age;
        TextView textView = (TextView) b.t(view, R.id.comment_age);
        if (textView != null) {
            i10 = R.id.comment_text;
            TextView textView2 = (TextView) b.t(view, R.id.comment_text);
            if (textView2 != null) {
                i10 = R.id.flag_delete_progressbar;
                ProgressBar progressBar = (ProgressBar) b.t(view, R.id.flag_delete_progressbar);
                if (progressBar != null) {
                    i10 = R.id.icon_delete;
                    ImageView imageView = (ImageView) b.t(view, R.id.icon_delete);
                    if (imageView != null) {
                        i10 = R.id.icon_flag;
                        ImageView imageView2 = (ImageView) b.t(view, R.id.icon_flag);
                        if (imageView2 != null) {
                            i10 = R.id.imageViewVerified;
                            ImageView imageView3 = (ImageView) b.t(view, R.id.imageViewVerified);
                            if (imageView3 != null) {
                                i10 = R.id.img_reply;
                                ImageView imageView4 = (ImageView) b.t(view, R.id.img_reply);
                                if (imageView4 != null) {
                                    i10 = R.id.img_vote_down;
                                    ImageView imageView5 = (ImageView) b.t(view, R.id.img_vote_down);
                                    if (imageView5 != null) {
                                        i10 = R.id.img_vote_up;
                                        ImageView imageView6 = (ImageView) b.t(view, R.id.img_vote_up);
                                        if (imageView6 != null) {
                                            i10 = R.id.reply_comment_text;
                                            TextView textView3 = (TextView) b.t(view, R.id.reply_comment_text);
                                            if (textView3 != null) {
                                                i10 = R.id.reply_user_avatar;
                                                ImageView imageView7 = (ImageView) b.t(view, R.id.reply_user_avatar);
                                                if (imageView7 != null) {
                                                    i10 = R.id.reply_user_name;
                                                    TextView textView4 = (TextView) b.t(view, R.id.reply_user_name);
                                                    if (textView4 != null) {
                                                        i10 = R.id.user_avatar;
                                                        ImageView imageView8 = (ImageView) b.t(view, R.id.user_avatar);
                                                        if (imageView8 != null) {
                                                            i10 = R.id.user_name;
                                                            TextView textView5 = (TextView) b.t(view, R.id.user_name);
                                                            if (textView5 != null) {
                                                                i10 = R.id.view_previous_replies;
                                                                TextView textView6 = (TextView) b.t(view, R.id.view_previous_replies);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.vote_down_count;
                                                                    TextView textView7 = (TextView) b.t(view, R.id.vote_down_count);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.vote_down_progressbar;
                                                                        ProgressBar progressBar2 = (ProgressBar) b.t(view, R.id.vote_down_progressbar);
                                                                        if (progressBar2 != null) {
                                                                            i10 = R.id.vote_up_count;
                                                                            TextView textView8 = (TextView) b.t(view, R.id.vote_up_count);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.vote_up_progressbar;
                                                                                ProgressBar progressBar3 = (ProgressBar) b.t(view, R.id.vote_up_progressbar);
                                                                                if (progressBar3 != null) {
                                                                                    return new ItemVideoCommentBinding((ConstraintLayout) view, textView, textView2, progressBar, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView3, imageView7, textView4, imageView8, textView5, textView6, textView7, progressBar2, textView8, progressBar3);
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

    public static ItemVideoCommentBinding inflate(LayoutInflater layoutInflater) {
        return a(layoutInflater, null, false);
    }

    @Override // x1.a
    public View b() {
        return this.f4804a;
    }
}
