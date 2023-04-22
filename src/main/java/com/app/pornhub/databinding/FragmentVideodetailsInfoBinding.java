package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.FlowLayout;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentVideodetailsInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final NestedScrollView f4671a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4672b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4673c;
    public final FlowLayout d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4674e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f4675f;

    /* renamed from: g  reason: collision with root package name */
    public final ProgressBar f4676g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4677h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4678i;

    /* renamed from: j  reason: collision with root package name */
    public final Group f4679j;

    /* renamed from: k  reason: collision with root package name */
    public final Group f4680k;

    /* renamed from: l  reason: collision with root package name */
    public final Group f4681l;

    /* renamed from: m  reason: collision with root package name */
    public final Group f4682m;
    public final ImageView n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f4683o;

    /* renamed from: p  reason: collision with root package name */
    public final ImageView f4684p;

    /* renamed from: q  reason: collision with root package name */
    public final NestedScrollView f4685q;

    /* renamed from: r  reason: collision with root package name */
    public final FlowLayout f4686r;

    /* renamed from: s  reason: collision with root package name */
    public final ImageView f4687s;

    /* renamed from: t  reason: collision with root package name */
    public final TextView f4688t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f4689u;

    /* renamed from: v  reason: collision with root package name */
    public final ProgressBar f4690v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f4691w;

    /* renamed from: x  reason: collision with root package name */
    public final FlowLayout f4692x;
    public final TextView y;

    /* renamed from: z  reason: collision with root package name */
    public final TextView f4693z;

    public FragmentVideodetailsInfoBinding(NestedScrollView nestedScrollView, ImageView imageView, TextView textView, TextView textView2, TextView textView3, FlowLayout flowLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, TextView textView4, TextView textView5, TextView textView6, TextView textView7, Group group, Group group2, Group group3, Group group4, Guideline guideline, ImageView imageView4, TextView textView8, ImageView imageView5, NestedScrollView nestedScrollView2, TextView textView9, FlowLayout flowLayout2, ImageView imageView6, TextView textView10, TextView textView11, TextView textView12, ProgressBar progressBar2, ImageView imageView7, TextView textView13, FlowLayout flowLayout3, View view, View view2, TextView textView14, Barrier barrier, TextView textView15, TextView textView16) {
        this.f4671a = nestedScrollView;
        this.f4672b = imageView;
        this.f4673c = textView2;
        this.d = flowLayout;
        this.f4674e = imageView2;
        this.f4675f = imageView3;
        this.f4676g = progressBar;
        this.f4677h = textView5;
        this.f4678i = textView7;
        this.f4679j = group;
        this.f4680k = group2;
        this.f4681l = group3;
        this.f4682m = group4;
        this.n = imageView4;
        this.f4683o = textView8;
        this.f4684p = imageView5;
        this.f4685q = nestedScrollView2;
        this.f4686r = flowLayout2;
        this.f4687s = imageView6;
        this.f4688t = textView11;
        this.f4689u = textView12;
        this.f4690v = progressBar2;
        this.f4691w = imageView7;
        this.f4692x = flowLayout3;
        this.y = textView14;
        this.f4693z = textView15;
    }

    public static FragmentVideodetailsInfoBinding bind(View view) {
        int i10 = R.id.addToPlaylistIcon;
        ImageView imageView = (ImageView) b.t(view, R.id.addToPlaylistIcon);
        if (imageView != null) {
            i10 = R.id.addedOnLabel;
            TextView textView = (TextView) b.t(view, R.id.addedOnLabel);
            if (textView != null) {
                i10 = R.id.addedOnValue;
                TextView textView2 = (TextView) b.t(view, R.id.addedOnValue);
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
                                    ImageView imageView2 = (ImageView) b.t(view, R.id.dislikeIcon);
                                    if (imageView2 != null) {
                                        i10 = R.id.favoriteIcon;
                                        ImageView imageView3 = (ImageView) b.t(view, R.id.favoriteIcon);
                                        if (imageView3 != null) {
                                            i10 = R.id.favoriteLoading;
                                            ProgressBar progressBar = (ProgressBar) b.t(view, R.id.favoriteLoading);
                                            if (progressBar != null) {
                                                i10 = R.id.featuredOnLabel;
                                                TextView textView4 = (TextView) b.t(view, R.id.featuredOnLabel);
                                                if (textView4 != null) {
                                                    i10 = R.id.featuredOnValue;
                                                    TextView textView5 = (TextView) b.t(view, R.id.featuredOnValue);
                                                    if (textView5 != null) {
                                                        i10 = R.id.fromLabel;
                                                        TextView textView6 = (TextView) b.t(view, R.id.fromLabel);
                                                        if (textView6 != null) {
                                                            i10 = R.id.fromUsername;
                                                            TextView textView7 = (TextView) b.t(view, R.id.fromUsername);
                                                            if (textView7 != null) {
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
                                                                                    i10 = R.id.imageViewUploaderType;
                                                                                    ImageView imageView4 = (ImageView) b.t(view, R.id.imageViewUploaderType);
                                                                                    if (imageView4 != null) {
                                                                                        i10 = R.id.joinChannelButton;
                                                                                        TextView textView8 = (TextView) b.t(view, R.id.joinChannelButton);
                                                                                        if (textView8 != null) {
                                                                                            i10 = R.id.likeIcon;
                                                                                            ImageView imageView5 = (ImageView) b.t(view, R.id.likeIcon);
                                                                                            if (imageView5 != null) {
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                                                                                i10 = R.id.pornstarsLabel;
                                                                                                TextView textView9 = (TextView) b.t(view, R.id.pornstarsLabel);
                                                                                                if (textView9 != null) {
                                                                                                    i10 = R.id.pornstarsLayout;
                                                                                                    FlowLayout flowLayout2 = (FlowLayout) b.t(view, R.id.pornstarsLayout);
                                                                                                    if (flowLayout2 != null) {
                                                                                                        i10 = R.id.premium_icon;
                                                                                                        ImageView imageView6 = (ImageView) b.t(view, R.id.premium_icon);
                                                                                                        if (imageView6 != null) {
                                                                                                            i10 = R.id.productionLabel;
                                                                                                            TextView textView10 = (TextView) b.t(view, R.id.productionLabel);
                                                                                                            if (textView10 != null) {
                                                                                                                i10 = R.id.productionValue;
                                                                                                                TextView textView11 = (TextView) b.t(view, R.id.productionValue);
                                                                                                                if (textView11 != null) {
                                                                                                                    i10 = R.id.ratingPercentage;
                                                                                                                    TextView textView12 = (TextView) b.t(view, R.id.ratingPercentage);
                                                                                                                    if (textView12 != null) {
                                                                                                                        i10 = R.id.ratingProgress;
                                                                                                                        ProgressBar progressBar2 = (ProgressBar) b.t(view, R.id.ratingProgress);
                                                                                                                        if (progressBar2 != null) {
                                                                                                                            i10 = R.id.shareIcon;
                                                                                                                            ImageView imageView7 = (ImageView) b.t(view, R.id.shareIcon);
                                                                                                                            if (imageView7 != null) {
                                                                                                                                i10 = R.id.tagsLabel;
                                                                                                                                TextView textView13 = (TextView) b.t(view, R.id.tagsLabel);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i10 = R.id.tagsLayout;
                                                                                                                                    FlowLayout flowLayout3 = (FlowLayout) b.t(view, R.id.tagsLayout);
                                                                                                                                    if (flowLayout3 != null) {
                                                                                                                                        i10 = R.id.username_bottom_line;
                                                                                                                                        View t2 = b.t(view, R.id.username_bottom_line);
                                                                                                                                        if (t2 != null) {
                                                                                                                                            i10 = R.id.username_top_line;
                                                                                                                                            View t8 = b.t(view, R.id.username_top_line);
                                                                                                                                            if (t8 != null) {
                                                                                                                                                i10 = R.id.video_title;
                                                                                                                                                TextView textView14 = (TextView) b.t(view, R.id.video_title);
                                                                                                                                                if (textView14 != null) {
                                                                                                                                                    i10 = R.id.viewCountBarrier;
                                                                                                                                                    Barrier barrier = (Barrier) b.t(view, R.id.viewCountBarrier);
                                                                                                                                                    if (barrier != null) {
                                                                                                                                                        i10 = R.id.views_count;
                                                                                                                                                        TextView textView15 = (TextView) b.t(view, R.id.views_count);
                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                            i10 = R.id.views_txt;
                                                                                                                                                            TextView textView16 = (TextView) b.t(view, R.id.views_txt);
                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                return new FragmentVideodetailsInfoBinding(nestedScrollView, imageView, textView, textView2, textView3, flowLayout, frameLayout, constraintLayout, imageView2, imageView3, progressBar, textView4, textView5, textView6, textView7, group, group2, group3, group4, guideline, imageView4, textView8, imageView5, nestedScrollView, textView9, flowLayout2, imageView6, textView10, textView11, textView12, progressBar2, imageView7, textView13, flowLayout3, t2, t8, textView14, barrier, textView15, textView16);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentVideodetailsInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_videodetails_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4671a;
    }
}
