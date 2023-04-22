package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.FlowLayout;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentAlbumHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4552a;

    public FragmentAlbumHeaderBinding(LinearLayout linearLayout, FlowLayout flowLayout, ImageView imageView, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3) {
        this.f4552a = linearLayout;
    }

    public static FragmentAlbumHeaderBinding bind(View view) {
        int i10 = R.id.fragment_album_header_flowlayoutTags;
        FlowLayout flowLayout = (FlowLayout) b.t(view, R.id.fragment_album_header_flowlayoutTags);
        if (flowLayout != null) {
            i10 = R.id.fragment_album_header_imgUserThumbnail;
            ImageView imageView = (ImageView) b.t(view, R.id.fragment_album_header_imgUserThumbnail);
            if (imageView != null) {
                i10 = R.id.fragment_album_header_llyTags;
                LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.fragment_album_header_llyTags);
                if (linearLayout != null) {
                    i10 = R.id.fragment_album_header_txtDate;
                    TextView textView = (TextView) b.t(view, R.id.fragment_album_header_txtDate);
                    if (textView != null) {
                        i10 = R.id.fragment_album_header_txtUsername;
                        TextView textView2 = (TextView) b.t(view, R.id.fragment_album_header_txtUsername);
                        if (textView2 != null) {
                            i10 = R.id.fragment_album_header_txtViewCount;
                            TextView textView3 = (TextView) b.t(view, R.id.fragment_album_header_txtViewCount);
                            if (textView3 != null) {
                                return new FragmentAlbumHeaderBinding((LinearLayout) view, flowLayout, imageView, linearLayout, textView, textView2, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentAlbumHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_album_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4552a;
    }
}
