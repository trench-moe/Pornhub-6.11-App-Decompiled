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
public final class FragmentVideodetailsCommentsRowBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4670a;

    public FragmentVideodetailsCommentsRowBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.f4670a = linearLayout;
    }

    public static FragmentVideodetailsCommentsRowBinding bind(View view) {
        int i10 = R.id.fragment_videodetails_comments_row_img_user;
        ImageView imageView = (ImageView) b.t(view, R.id.fragment_videodetails_comments_row_img_user);
        if (imageView != null) {
            i10 = R.id.fragment_videodetails_comments_row_txt_comment;
            TextView textView = (TextView) b.t(view, R.id.fragment_videodetails_comments_row_txt_comment);
            if (textView != null) {
                i10 = R.id.fragment_videodetails_comments_row_txt_time;
                TextView textView2 = (TextView) b.t(view, R.id.fragment_videodetails_comments_row_txt_time);
                if (textView2 != null) {
                    i10 = R.id.fragment_videodetails_comments_row_txt_username;
                    TextView textView3 = (TextView) b.t(view, R.id.fragment_videodetails_comments_row_txt_username);
                    if (textView3 != null) {
                        return new FragmentVideodetailsCommentsRowBinding((LinearLayout) view, imageView, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentVideodetailsCommentsRowBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_videodetails_comments_row, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4670a;
    }
}
