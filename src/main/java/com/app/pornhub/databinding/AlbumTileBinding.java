package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.AlbumCoverImageViewCustom;
import x1.a;

/* loaded from: classes.dex */
public final class AlbumTileBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4494a;

    public AlbumTileBinding(LinearLayout linearLayout, AlbumCoverImageViewCustom albumCoverImageViewCustom, TextView textView, TextView textView2) {
        this.f4494a = linearLayout;
    }

    public static AlbumTileBinding bind(View view) {
        int i10 = R.id.album_tile_imgThumbnail;
        AlbumCoverImageViewCustom albumCoverImageViewCustom = (AlbumCoverImageViewCustom) b.t(view, R.id.album_tile_imgThumbnail);
        if (albumCoverImageViewCustom != null) {
            i10 = R.id.album_tile_txtCount;
            TextView textView = (TextView) b.t(view, R.id.album_tile_txtCount);
            if (textView != null) {
                i10 = R.id.album_tile_txtName;
                TextView textView2 = (TextView) b.t(view, R.id.album_tile_txtName);
                if (textView2 != null) {
                    return new AlbumTileBinding((LinearLayout) view, albumCoverImageViewCustom, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static AlbumTileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.album_tile, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4494a;
    }
}
