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
public final class ItemTagPlaylistEditableBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4797a;

    public ItemTagPlaylistEditableBinding(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.f4797a = linearLayout;
    }

    public static ItemTagPlaylistEditableBinding bind(View view) {
        int i10 = R.id.tag_name;
        TextView textView = (TextView) b.t(view, R.id.tag_name);
        if (textView != null) {
            i10 = R.id.tag_remove_icon;
            ImageView imageView = (ImageView) b.t(view, R.id.tag_remove_icon);
            if (imageView != null) {
                return new ItemTagPlaylistEditableBinding((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemTagPlaylistEditableBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_tag_playlist_editable, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4797a;
    }
}
