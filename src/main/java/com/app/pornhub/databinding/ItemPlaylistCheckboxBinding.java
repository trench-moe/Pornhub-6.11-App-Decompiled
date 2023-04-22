package com.app.pornhub.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.app.pornhub.R;
import java.util.Objects;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPlaylistCheckboxBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CheckBox f4760a;

    public ItemPlaylistCheckboxBinding(CheckBox checkBox) {
        this.f4760a = checkBox;
    }

    public static ItemPlaylistCheckboxBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new ItemPlaylistCheckboxBinding((CheckBox) view);
    }

    public static ItemPlaylistCheckboxBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_playlist_checkbox, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4760a;
    }
}
