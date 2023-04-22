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
public final class ItemChannelBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4707a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4708b;

    /* renamed from: c  reason: collision with root package name */
    public final ChannelBannerImageView f4709c;
    public final TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f4710e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f4711f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f4712g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f4713h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4714i;

    public ItemChannelBinding(ConstraintLayout constraintLayout, ImageView imageView, ChannelBannerImageView channelBannerImageView, TextView textView, Space space, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f4707a = constraintLayout;
        this.f4708b = imageView;
        this.f4709c = channelBannerImageView;
        this.d = textView;
        this.f4710e = imageView2;
        this.f4711f = textView3;
        this.f4712g = textView4;
        this.f4713h = textView7;
        this.f4714i = textView8;
    }

    public static ItemChannelBinding bind(View view) {
        int i10 = R.id.channel_avatar;
        ImageView imageView = (ImageView) b.t(view, R.id.channel_avatar);
        if (imageView != null) {
            i10 = R.id.channel_banner;
            ChannelBannerImageView channelBannerImageView = (ChannelBannerImageView) b.t(view, R.id.channel_banner);
            if (channelBannerImageView != null) {
                i10 = R.id.channel_name;
                TextView textView = (TextView) b.t(view, R.id.channel_name);
                if (textView != null) {
                    i10 = R.id.margin_banner_spacer;
                    Space space = (Space) b.t(view, R.id.margin_banner_spacer);
                    if (space != null) {
                        i10 = R.id.premium_icon;
                        ImageView imageView2 = (ImageView) b.t(view, R.id.premium_icon);
                        if (imageView2 != null) {
                            i10 = R.id.rank;
                            TextView textView2 = (TextView) b.t(view, R.id.rank);
                            if (textView2 != null) {
                                i10 = R.id.rank_bg;
                                ImageView imageView3 = (ImageView) b.t(view, R.id.rank_bg);
                                if (imageView3 != null) {
                                    i10 = R.id.rank_value;
                                    TextView textView3 = (TextView) b.t(view, R.id.rank_value);
                                    if (textView3 != null) {
                                        i10 = R.id.subscribers;
                                        TextView textView4 = (TextView) b.t(view, R.id.subscribers);
                                        if (textView4 != null) {
                                            i10 = R.id.subscribers_value;
                                            TextView textView5 = (TextView) b.t(view, R.id.subscribers_value);
                                            if (textView5 != null) {
                                                i10 = R.id.video_views;
                                                TextView textView6 = (TextView) b.t(view, R.id.video_views);
                                                if (textView6 != null) {
                                                    i10 = R.id.video_views_value;
                                                    TextView textView7 = (TextView) b.t(view, R.id.video_views_value);
                                                    if (textView7 != null) {
                                                        i10 = R.id.videos_count;
                                                        TextView textView8 = (TextView) b.t(view, R.id.videos_count);
                                                        if (textView8 != null) {
                                                            i10 = R.id.videos_count_value;
                                                            TextView textView9 = (TextView) b.t(view, R.id.videos_count_value);
                                                            if (textView9 != null) {
                                                                return new ItemChannelBinding((ConstraintLayout) view, imageView, channelBannerImageView, textView, space, imageView2, textView2, imageView3, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
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

    public static ItemChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_channel, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4707a;
    }
}
