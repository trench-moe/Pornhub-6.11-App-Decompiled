package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeUserProfileVideosPhotosFriendsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4706a;

    public IncludeUserProfileVideosPhotosFriendsBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, LinearLayout linearLayout3, LinearLayout linearLayout4) {
        this.f4706a = linearLayout;
    }

    public static IncludeUserProfileVideosPhotosFriendsBinding bind(View view) {
        int i10 = R.id.user_info_friends_container;
        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.user_info_friends_container);
        if (linearLayout != null) {
            i10 = R.id.user_info_label_friends;
            TextView textView = (TextView) b.t(view, R.id.user_info_label_friends);
            if (textView != null) {
                i10 = R.id.user_info_label_photos;
                TextView textView2 = (TextView) b.t(view, R.id.user_info_label_photos);
                if (textView2 != null) {
                    i10 = R.id.user_info_label_videos;
                    TextView textView3 = (TextView) b.t(view, R.id.user_info_label_videos);
                    if (textView3 != null) {
                        i10 = R.id.user_info_photos_container;
                        LinearLayout linearLayout2 = (LinearLayout) b.t(view, R.id.user_info_photos_container);
                        if (linearLayout2 != null) {
                            i10 = R.id.user_info_videos_container;
                            LinearLayout linearLayout3 = (LinearLayout) b.t(view, R.id.user_info_videos_container);
                            if (linearLayout3 != null) {
                                return new IncludeUserProfileVideosPhotosFriendsBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, linearLayout2, linearLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeUserProfileVideosPhotosFriendsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_user_profile_videos_photos_friends, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4706a;
    }
}
