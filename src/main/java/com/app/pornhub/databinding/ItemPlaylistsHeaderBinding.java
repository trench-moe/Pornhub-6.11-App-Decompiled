package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ItemPlaylistsHeaderBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4772a;

    public ItemPlaylistsHeaderBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f4772a = constraintLayout;
    }

    public static ItemPlaylistsHeaderBinding bind(View view) {
        int i10 = R.id.plsHeaderActionButton;
        TextView textView = (TextView) b.t(view, R.id.plsHeaderActionButton);
        if (textView != null) {
            i10 = R.id.plsHeaderTitle;
            TextView textView2 = (TextView) b.t(view, R.id.plsHeaderTitle);
            if (textView2 != null) {
                return new ItemPlaylistsHeaderBinding((ConstraintLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ItemPlaylistsHeaderBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.item_playlists_header, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4772a;
    }
}
