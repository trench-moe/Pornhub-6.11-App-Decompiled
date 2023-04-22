package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class LayoutPlaylistExpandablePanelBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4880a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f4881b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4882c;
    public final TextView d;

    public LayoutPlaylistExpandablePanelBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, Space space, TextView textView, TextView textView2) {
        this.f4880a = constraintLayout;
        this.f4881b = imageView;
        this.f4882c = textView;
        this.d = textView2;
    }

    public static LayoutPlaylistExpandablePanelBinding bind(View view) {
        int i10 = R.id.expandablePanelExpandIcon;
        ImageView imageView = (ImageView) b.t(view, R.id.expandablePanelExpandIcon);
        if (imageView != null) {
            i10 = R.id.expandablePanelPlaylistIcon;
            ImageView imageView2 = (ImageView) b.t(view, R.id.expandablePanelPlaylistIcon);
            if (imageView2 != null) {
                i10 = R.id.expandablePanelSpace;
                Space space = (Space) b.t(view, R.id.expandablePanelSpace);
                if (space != null) {
                    i10 = R.id.expandablePanelSubtitle;
                    TextView textView = (TextView) b.t(view, R.id.expandablePanelSubtitle);
                    if (textView != null) {
                        i10 = R.id.expandablePanelTitle;
                        TextView textView2 = (TextView) b.t(view, R.id.expandablePanelTitle);
                        if (textView2 != null) {
                            return new LayoutPlaylistExpandablePanelBinding((ConstraintLayout) view, imageView, imageView2, space, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutPlaylistExpandablePanelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.layout_playlist_expandable_panel, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4880a;
    }
}
