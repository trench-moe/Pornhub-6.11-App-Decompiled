package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.AlbumPhotoImageViewCustom;
import x1.a;

/* loaded from: classes.dex */
public final class PhotosTileBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4885a;

    public PhotosTileBinding(LinearLayout linearLayout, AlbumPhotoImageViewCustom albumPhotoImageViewCustom) {
        this.f4885a = linearLayout;
    }

    public static PhotosTileBinding bind(View view) {
        AlbumPhotoImageViewCustom albumPhotoImageViewCustom = (AlbumPhotoImageViewCustom) b.t(view, R.id.fragment_photos_tile_imgThumbnail);
        if (albumPhotoImageViewCustom != null) {
            return new PhotosTileBinding((LinearLayout) view, albumPhotoImageViewCustom);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fragment_photos_tile_imgThumbnail)));
    }

    public static PhotosTileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.photos_tile, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4885a;
    }
}
