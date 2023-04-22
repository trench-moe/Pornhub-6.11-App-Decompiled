package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class UserProfileWallCommentBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4895a;

    public UserProfileWallCommentBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, ImageView imageView, TextView textView3) {
        this.f4895a = relativeLayout;
    }

    public static UserProfileWallCommentBinding bind(View view) {
        int i10 = R.id.comment_age;
        TextView textView = (TextView) b.t(view, R.id.comment_age);
        if (textView != null) {
            i10 = R.id.comment_txt;
            TextView textView2 = (TextView) b.t(view, R.id.comment_txt);
            if (textView2 != null) {
                i10 = R.id.user_avatar;
                ImageView imageView = (ImageView) b.t(view, R.id.user_avatar);
                if (imageView != null) {
                    i10 = R.id.user_name;
                    TextView textView3 = (TextView) b.t(view, R.id.user_name);
                    if (textView3 != null) {
                        return new UserProfileWallCommentBinding((RelativeLayout) view, textView, textView2, imageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static UserProfileWallCommentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.user_profile_wall_comment, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4895a;
    }
}
