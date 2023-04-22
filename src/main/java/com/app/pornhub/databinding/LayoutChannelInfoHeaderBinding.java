package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.ChannelBannerImageView;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutChannelInfoHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4825a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f4826b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4827c;
    public final ImageView d;

    /* renamed from: e  reason: collision with root package name */
    public final ChannelBannerImageView f4828e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4829f;

    /* renamed from: g  reason: collision with root package name */
    public final ConstraintLayout f4830g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f4831h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4832i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageView f4833j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f4834k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f4835l;

    /* renamed from: m  reason: collision with root package name */
    public final TextView f4836m;
    public final TextView n;

    /* renamed from: o  reason: collision with root package name */
    public final TextView f4837o;

    /* renamed from: p  reason: collision with root package name */
    public final TextView f4838p;

    public LayoutChannelInfoHeaderBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, Space space, ImageView imageView, ChannelBannerImageView channelBannerImageView, ConstraintLayout constraintLayout2, TextView textView3, ConstraintLayout constraintLayout3, ImageView imageView2, TextView textView4, TextView textView5, ImageView imageView3, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f4825a = constraintLayout;
        this.f4826b = textView;
        this.f4827c = textView2;
        this.d = imageView;
        this.f4828e = channelBannerImageView;
        this.f4829f = textView3;
        this.f4830g = constraintLayout3;
        this.f4831h = imageView2;
        this.f4832i = textView5;
        this.f4833j = imageView3;
        this.f4834k = textView7;
        this.f4835l = textView9;
        this.f4836m = textView11;
        this.n = textView13;
        this.f4837o = textView14;
        this.f4838p = textView15;
    }

    public static LayoutChannelInfoHeaderBinding bind(View view) {
        int i10 = R.id.about;
        TextView textView = (TextView) b.t(view, R.id.about);
        if (textView != null) {
            i10 = R.id.action_join;
            TextView textView2 = (TextView) b.t(view, R.id.action_join);
            if (textView2 != null) {
                i10 = R.id.bottom_space;
                Space space = (Space) b.t(view, R.id.bottom_space);
                if (space != null) {
                    i10 = R.id.channel_avatar;
                    ImageView imageView = (ImageView) b.t(view, R.id.channel_avatar);
                    if (imageView != null) {
                        i10 = R.id.channel_banner;
                        ChannelBannerImageView channelBannerImageView = (ChannelBannerImageView) b.t(view, R.id.channel_banner);
                        if (channelBannerImageView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i10 = R.id.channel_name;
                            TextView textView3 = (TextView) b.t(view, R.id.channel_name);
                            if (textView3 != null) {
                                i10 = R.id.container_more_info;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) b.t(view, R.id.container_more_info);
                                if (constraintLayout2 != null) {
                                    i10 = R.id.expand_collapse_icon;
                                    ImageView imageView2 = (ImageView) b.t(view, R.id.expand_collapse_icon);
                                    if (imageView2 != null) {
                                        i10 = R.id.joined;
                                        TextView textView4 = (TextView) b.t(view, R.id.joined);
                                        if (textView4 != null) {
                                            i10 = R.id.joined_value;
                                            TextView textView5 = (TextView) b.t(view, R.id.joined_value);
                                            if (textView5 != null) {
                                                i10 = R.id.premium_icon;
                                                ImageView imageView3 = (ImageView) b.t(view, R.id.premium_icon);
                                                if (imageView3 != null) {
                                                    i10 = R.id.rank;
                                                    TextView textView6 = (TextView) b.t(view, R.id.rank);
                                                    if (textView6 != null) {
                                                        i10 = R.id.rank_value;
                                                        TextView textView7 = (TextView) b.t(view, R.id.rank_value);
                                                        if (textView7 != null) {
                                                            i10 = R.id.subscribers;
                                                            TextView textView8 = (TextView) b.t(view, R.id.subscribers);
                                                            if (textView8 != null) {
                                                                i10 = R.id.subscribers_value;
                                                                TextView textView9 = (TextView) b.t(view, R.id.subscribers_value);
                                                                if (textView9 != null) {
                                                                    i10 = R.id.text_by;
                                                                    TextView textView10 = (TextView) b.t(view, R.id.text_by);
                                                                    if (textView10 != null) {
                                                                        i10 = R.id.username;
                                                                        TextView textView11 = (TextView) b.t(view, R.id.username);
                                                                        if (textView11 != null) {
                                                                            i10 = R.id.videos;
                                                                            TextView textView12 = (TextView) b.t(view, R.id.videos);
                                                                            if (textView12 != null) {
                                                                                i10 = R.id.videos_value;
                                                                                TextView textView13 = (TextView) b.t(view, R.id.videos_value);
                                                                                if (textView13 != null) {
                                                                                    i10 = R.id.website;
                                                                                    TextView textView14 = (TextView) b.t(view, R.id.website);
                                                                                    if (textView14 != null) {
                                                                                        i10 = R.id.website_value;
                                                                                        TextView textView15 = (TextView) b.t(view, R.id.website_value);
                                                                                        if (textView15 != null) {
                                                                                            return new LayoutChannelInfoHeaderBinding(constraintLayout, textView, textView2, space, imageView, channelBannerImageView, constraintLayout, textView3, constraintLayout2, imageView2, textView4, textView5, imageView3, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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

    public static LayoutChannelInfoHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_channel_info_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4825a;
    }
}
