package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogAlbumsSegmentsBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f4495a;

    public DialogAlbumsSegmentsBinding(LinearLayout linearLayout, ListView listView, Spinner spinner, TextView textView) {
        this.f4495a = linearLayout;
    }

    public static DialogAlbumsSegmentsBinding bind(View view) {
        int i10 = R.id.listView;
        ListView listView = (ListView) b.t(view, R.id.listView);
        if (listView != null) {
            i10 = R.id.tagsSpinner;
            Spinner spinner = (Spinner) b.t(view, R.id.tagsSpinner);
            if (spinner != null) {
                i10 = R.id.tagsTitle;
                TextView textView = (TextView) b.t(view, R.id.tagsTitle);
                if (textView != null) {
                    return new DialogAlbumsSegmentsBinding((LinearLayout) view, listView, spinner, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogAlbumsSegmentsBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_albums_segments, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4495a;
    }
}
