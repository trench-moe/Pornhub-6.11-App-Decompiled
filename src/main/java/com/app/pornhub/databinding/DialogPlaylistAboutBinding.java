package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.app.pornhub.R;
import com.app.pornhub.view.common.widget.FlowLayout;
import x1.a;

/* loaded from: classes.dex */
public final class DialogPlaylistAboutBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollView f4499a;

    public DialogPlaylistAboutBinding(ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, FlowLayout flowLayout) {
        this.f4499a = scrollView;
    }

    public static DialogPlaylistAboutBinding bind(View view) {
        int i10 = R.id.pld_about;
        TextView textView = (TextView) b.t(view, R.id.pld_about);
        if (textView != null) {
            i10 = R.id.pld_description;
            TextView textView2 = (TextView) b.t(view, R.id.pld_description);
            if (textView2 != null) {
                i10 = R.id.pld_description_label;
                TextView textView3 = (TextView) b.t(view, R.id.pld_description_label);
                if (textView3 != null) {
                    i10 = R.id.pld_status;
                    TextView textView4 = (TextView) b.t(view, R.id.pld_status);
                    if (textView4 != null) {
                        i10 = R.id.pld_tags;
                        TextView textView5 = (TextView) b.t(view, R.id.pld_tags);
                        if (textView5 != null) {
                            i10 = R.id.pld_tags_layout;
                            FlowLayout flowLayout = (FlowLayout) b.t(view, R.id.pld_tags_layout);
                            if (flowLayout != null) {
                                return new DialogPlaylistAboutBinding((ScrollView) view, textView, textView2, textView3, textView4, textView5, flowLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogPlaylistAboutBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_playlist_about, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4499a;
    }
}
