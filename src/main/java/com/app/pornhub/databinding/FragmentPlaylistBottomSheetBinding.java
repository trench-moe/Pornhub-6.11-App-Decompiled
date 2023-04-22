package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentPlaylistBottomSheetBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4643a;

    public FragmentPlaylistBottomSheetBinding(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, View view, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.f4643a = constraintLayout;
    }

    public static FragmentPlaylistBottomSheetBinding bind(View view) {
        int i10 = R.id.guide_end;
        Guideline guideline = (Guideline) b.t(view, R.id.guide_end);
        if (guideline != null) {
            i10 = R.id.guide_start;
            Guideline guideline2 = (Guideline) b.t(view, R.id.guide_start);
            if (guideline2 != null) {
                i10 = R.id.pbs_bottom_separator;
                View t2 = b.t(view, R.id.pbs_bottom_separator);
                if (t2 != null) {
                    i10 = R.id.pbs_checkbox_container;
                    LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.pbs_checkbox_container);
                    if (linearLayout != null) {
                        i10 = R.id.pbs_done;
                        TextView textView = (TextView) b.t(view, R.id.pbs_done);
                        if (textView != null) {
                            i10 = R.id.pbs_new_playlist;
                            TextView textView2 = (TextView) b.t(view, R.id.pbs_new_playlist);
                            if (textView2 != null) {
                                i10 = R.id.pbs_save_to_label;
                                TextView textView3 = (TextView) b.t(view, R.id.pbs_save_to_label);
                                if (textView3 != null) {
                                    return new FragmentPlaylistBottomSheetBinding((ConstraintLayout) view, guideline, guideline2, t2, linearLayout, textView, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentPlaylistBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_playlist_bottom_sheet, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4643a;
    }
}
