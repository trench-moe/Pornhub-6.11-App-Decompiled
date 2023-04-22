package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeUserProfileInfoBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4704a;

    public IncludeUserProfileInfoBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView2, TextView textView6) {
        this.f4704a = linearLayout;
    }

    public static IncludeUserProfileInfoBinding bind(View view) {
        int i10 = R.id.user_info_avatar;
        ImageView imageView = (ImageView) b.t(view, R.id.user_info_avatar);
        if (imageView != null) {
            i10 = R.id.user_info_joined;
            TextView textView = (TextView) b.t(view, R.id.user_info_joined);
            if (textView != null) {
                i10 = R.id.user_info_label_joined;
                TextView textView2 = (TextView) b.t(view, R.id.user_info_label_joined);
                if (textView2 != null) {
                    i10 = R.id.user_info_label_lastlogin;
                    TextView textView3 = (TextView) b.t(view, R.id.user_info_label_lastlogin);
                    if (textView3 != null) {
                        i10 = R.id.user_info_label_watchcount;
                        TextView textView4 = (TextView) b.t(view, R.id.user_info_label_watchcount);
                        if (textView4 != null) {
                            i10 = R.id.user_info_lastlogin;
                            TextView textView5 = (TextView) b.t(view, R.id.user_info_lastlogin);
                            if (textView5 != null) {
                                i10 = R.id.user_info_showmore;
                                ImageView imageView2 = (ImageView) b.t(view, R.id.user_info_showmore);
                                if (imageView2 != null) {
                                    i10 = R.id.user_info_watchcount;
                                    TextView textView6 = (TextView) b.t(view, R.id.user_info_watchcount);
                                    if (textView6 != null) {
                                        return new IncludeUserProfileInfoBinding((LinearLayout) view, imageView, textView, textView2, textView3, textView4, textView5, imageView2, textView6);
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

    public static IncludeUserProfileInfoBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_user_profile_info, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4704a;
    }
}
