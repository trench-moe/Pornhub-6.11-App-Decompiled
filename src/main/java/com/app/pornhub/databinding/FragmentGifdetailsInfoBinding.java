package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.FlowLayout;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentGifdetailsInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f4583a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4584b;

    /* renamed from: c  reason: collision with root package name */
    public final FlowLayout f4585c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4586e;

    /* renamed from: f  reason: collision with root package name */
    public final ProgressBar f4587f;

    /* renamed from: g  reason: collision with root package name */
    public final ImageView f4588g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4589h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4590i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f4591j;

    /* renamed from: k  reason: collision with root package name */
    public final Group f4592k;

    /* renamed from: l  reason: collision with root package name */
    public final Group f4593l;

    /* renamed from: m  reason: collision with root package name */
    public final Group f4594m;
    public final Group n;

    /* renamed from: o  reason: collision with root package name */
    public final ImageView f4595o;

    /* renamed from: p  reason: collision with root package name */
    public final FlowLayout f4596p;

    /* renamed from: q  reason: collision with root package name */
    public final TextView f4597q;

    /* renamed from: r  reason: collision with root package name */
    public final ProgressBar f4598r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f4599s;

    /* renamed from: t  reason: collision with root package name */
    public final FlowLayout f4600t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f4601u;

    public FragmentGifdetailsInfoBinding(NestedScrollView nestedScrollView, TextView textView, TextView textView2, TextView textView3, FlowLayout flowLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar, ImageView imageView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, Group group, Group group2, Group group3, Group group4, Guideline guideline, ImageView imageView4, TextView textView9, FlowLayout flowLayout2, ImageView imageView5, TextView textView10, ProgressBar progressBar2, ImageView imageView6, TextView textView11, FlowLayout flowLayout3, View view, View view2, TextView textView12, TextView textView13) {
        this.f4583a = nestedScrollView;
        this.f4584b = textView;
        this.f4585c = flowLayout;
        this.d = imageView;
        this.f4586e = imageView2;
        this.f4587f = progressBar;
        this.f4588g = imageView3;
        this.f4589h = textView6;
        this.f4590i = textView7;
        this.f4591j = textView8;
        this.f4592k = group;
        this.f4593l = group2;
        this.f4594m = group3;
        this.n = group4;
        this.f4595o = imageView4;
        this.f4596p = flowLayout2;
        this.f4597q = textView10;
        this.f4598r = progressBar2;
        this.f4599s = imageView6;
        this.f4600t = flowLayout3;
        this.f4601u = textView12;
    }

    public static FragmentGifdetailsInfoBinding bind(View view) {
        int i10 = R.id.addedOn;
        TextView textView = (TextView) b.t(view, R.id.addedOn);
        if (textView != null) {
            i10 = R.id.addedOnLabel;
            TextView textView2 = (TextView) b.t(view, R.id.addedOnLabel);
            if (textView2 != null) {
                i10 = R.id.categoriesLabel;
                TextView textView3 = (TextView) b.t(view, R.id.categoriesLabel);
                if (textView3 != null) {
                    i10 = R.id.categoriesLayout;
                    FlowLayout flowLayout = (FlowLayout) b.t(view, R.id.categoriesLayout);
                    if (flowLayout != null) {
                        i10 = R.id.container_favorite;
                        FrameLayout frameLayout = (FrameLayout) b.t(view, R.id.container_favorite);
                        if (frameLayout != null) {
                            i10 = R.id.container_ratings;
                            ConstraintLayout constraintLayout = (ConstraintLayout) b.t(view, R.id.container_ratings);
                            if (constraintLayout != null) {
                                i10 = R.id.dislikeIcon;
                                ImageView imageView = (ImageView) b.t(view, R.id.dislikeIcon);
                                if (imageView != null) {
                                    i10 = R.id.favoriteIcon;
                                    ImageView imageView2 = (ImageView) b.t(view, R.id.favoriteIcon);
                                    if (imageView2 != null) {
                                        i10 = R.id.favoriteLoading;
                                        ProgressBar progressBar = (ProgressBar) b.t(view, R.id.favoriteLoading);
                                        if (progressBar != null) {
                                            i10 = R.id.flagIcon;
                                            ImageView imageView3 = (ImageView) b.t(view, R.id.flagIcon);
                                            if (imageView3 != null) {
                                                i10 = R.id.fromLabel;
                                                TextView textView4 = (TextView) b.t(view, R.id.fromLabel);
                                                if (textView4 != null) {
                                                    i10 = R.id.fromLabel_video;
                                                    TextView textView5 = (TextView) b.t(view, R.id.fromLabel_video);
                                                    if (textView5 != null) {
                                                        i10 = R.id.fromLabel_video_value;
                                                        TextView textView6 = (TextView) b.t(view, R.id.fromLabel_video_value);
                                                        if (textView6 != null) {
                                                            i10 = R.id.fromUsername;
                                                            TextView textView7 = (TextView) b.t(view, R.id.fromUsername);
                                                            if (textView7 != null) {
                                                                i10 = R.id.gif_title;
                                                                TextView textView8 = (TextView) b.t(view, R.id.gif_title);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.group_categories;
                                                                    Group group = (Group) b.t(view, R.id.group_categories);
                                                                    if (group != null) {
                                                                        i10 = R.id.group_from_user;
                                                                        Group group2 = (Group) b.t(view, R.id.group_from_user);
                                                                        if (group2 != null) {
                                                                            i10 = R.id.group_pornstars;
                                                                            Group group3 = (Group) b.t(view, R.id.group_pornstars);
                                                                            if (group3 != null) {
                                                                                i10 = R.id.group_tags;
                                                                                Group group4 = (Group) b.t(view, R.id.group_tags);
                                                                                if (group4 != null) {
                                                                                    i10 = R.id.guideline_horizontal_033;
                                                                                    Guideline guideline = (Guideline) b.t(view, R.id.guideline_horizontal_033);
                                                                                    if (guideline != null) {
                                                                                        i10 = R.id.likeIcon;
                                                                                        ImageView imageView4 = (ImageView) b.t(view, R.id.likeIcon);
                                                                                        if (imageView4 != null) {
                                                                                            i10 = R.id.pornstarsLabel;
                                                                                            TextView textView9 = (TextView) b.t(view, R.id.pornstarsLabel);
                                                                                            if (textView9 != null) {
                                                                                                i10 = R.id.pornstarsLayout;
                                                                                                FlowLayout flowLayout2 = (FlowLayout) b.t(view, R.id.pornstarsLayout);
                                                                                                if (flowLayout2 != null) {
                                                                                                    i10 = R.id.premium_icon;
                                                                                                    ImageView imageView5 = (ImageView) b.t(view, R.id.premium_icon);
                                                                                                    if (imageView5 != null) {
                                                                                                        i10 = R.id.ratingPercentage;
                                                                                                        TextView textView10 = (TextView) b.t(view, R.id.ratingPercentage);
                                                                                                        if (textView10 != null) {
                                                                                                            i10 = R.id.ratingsProgress;
                                                                                                            ProgressBar progressBar2 = (ProgressBar) b.t(view, R.id.ratingsProgress);
                                                                                                            if (progressBar2 != null) {
                                                                                                                i10 = R.id.shareIcon;
                                                                                                                ImageView imageView6 = (ImageView) b.t(view, R.id.shareIcon);
                                                                                                                if (imageView6 != null) {
                                                                                                                    i10 = R.id.tagsLabel;
                                                                                                                    TextView textView11 = (TextView) b.t(view, R.id.tagsLabel);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i10 = R.id.tagsLayout;
                                                                                                                        FlowLayout flowLayout3 = (FlowLayout) b.t(view, R.id.tagsLayout);
                                                                                                                        if (flowLayout3 != null) {
                                                                                                                            i10 = R.id.username_bottom_line;
                                                                                                                            View t2 = b.t(view, R.id.username_bottom_line);
                                                                                                                            if (t2 != null) {
                                                                                                                                i10 = R.id.username_top_line;
                                                                                                                                View t8 = b.t(view, R.id.username_top_line);
                                                                                                                                if (t8 != null) {
                                                                                                                                    i10 = R.id.views_count;
                                                                                                                                    TextView textView12 = (TextView) b.t(view, R.id.views_count);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        i10 = R.id.views_txt;
                                                                                                                                        TextView textView13 = (TextView) b.t(view, R.id.views_txt);
                                                                                                                                        if (textView13 != null) {
                                                                                                                                            return new FragmentGifdetailsInfoBinding((NestedScrollView) view, textView, textView2, textView3, flowLayout, frameLayout, constraintLayout, imageView, imageView2, progressBar, imageView3, textView4, textView5, textView6, textView7, textView8, group, group2, group3, group4, guideline, imageView4, textView9, flowLayout2, imageView5, textView10, progressBar2, imageView6, textView11, flowLayout3, t2, t8, textView12, textView13);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentGifdetailsInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_gifdetails_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4583a;
    }
}
