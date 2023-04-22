package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class IncludeDialogCommunityAlbumsSegmentsRowBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4695a;

    public IncludeDialogCommunityAlbumsSegmentsRowBinding(LinearLayout linearLayout, CheckBox checkBox, TextView textView) {
        this.f4695a = linearLayout;
    }

    public static IncludeDialogCommunityAlbumsSegmentsRowBinding bind(View view) {
        int i10 = R.id.dialog_community_albums_segments_row_cbSegment;
        CheckBox checkBox = (CheckBox) b.t(view, R.id.dialog_community_albums_segments_row_cbSegment);
        if (checkBox != null) {
            i10 = R.id.dialog_community_albums_segments_row_txtSegment;
            TextView textView = (TextView) b.t(view, R.id.dialog_community_albums_segments_row_txtSegment);
            if (textView != null) {
                return new IncludeDialogCommunityAlbumsSegmentsRowBinding((LinearLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static IncludeDialogCommunityAlbumsSegmentsRowBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.include_dialog_community_albums_segments_row, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4695a;
    }
}
