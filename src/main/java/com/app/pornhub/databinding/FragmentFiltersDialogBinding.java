package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class FragmentFiltersDialogBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4579a;

    public FragmentFiltersDialogBinding(LinearLayout linearLayout, Spinner spinner, TextView textView, Spinner spinner2, TextView textView2, LinearLayout linearLayout2, Spinner spinner3, TextView textView3, Spinner spinner4, TextView textView4, Spinner spinner5, TextView textView5) {
        this.f4579a = linearLayout;
    }

    public static FragmentFiltersDialogBinding bind(View view) {
        int i10 = R.id.category_spinner;
        Spinner spinner = (Spinner) b.t(view, R.id.category_spinner);
        if (spinner != null) {
            i10 = R.id.category_text;
            TextView textView = (TextView) b.t(view, R.id.category_text);
            if (textView != null) {
                i10 = R.id.duration_spinner;
                Spinner spinner2 = (Spinner) b.t(view, R.id.duration_spinner);
                if (spinner2 != null) {
                    i10 = R.id.duration_text;
                    TextView textView2 = (TextView) b.t(view, R.id.duration_text);
                    if (textView2 != null) {
                        i10 = R.id.filter_videos;
                        LinearLayout linearLayout = (LinearLayout) b.t(view, R.id.filter_videos);
                        if (linearLayout != null) {
                            i10 = R.id.production_spinner;
                            Spinner spinner3 = (Spinner) b.t(view, R.id.production_spinner);
                            if (spinner3 != null) {
                                i10 = R.id.production_text;
                                TextView textView3 = (TextView) b.t(view, R.id.production_text);
                                if (textView3 != null) {
                                    i10 = R.id.quality_spinner;
                                    Spinner spinner4 = (Spinner) b.t(view, R.id.quality_spinner);
                                    if (spinner4 != null) {
                                        i10 = R.id.quality_text;
                                        TextView textView4 = (TextView) b.t(view, R.id.quality_text);
                                        if (textView4 != null) {
                                            i10 = R.id.videos_spinner;
                                            Spinner spinner5 = (Spinner) b.t(view, R.id.videos_spinner);
                                            if (spinner5 != null) {
                                                i10 = R.id.videos_text;
                                                TextView textView5 = (TextView) b.t(view, R.id.videos_text);
                                                if (textView5 != null) {
                                                    return new FragmentFiltersDialogBinding((LinearLayout) view, spinner, textView, spinner2, textView2, linearLayout, spinner3, textView3, spinner4, textView4, spinner5, textView5);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static FragmentFiltersDialogBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_filters_dialog, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4579a;
    }
}
