package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class ActivityAccountExpiredBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RelativeLayout f4355a;

    public ActivityAccountExpiredBinding(RelativeLayout relativeLayout, TextView textView, TextView textView2, CheckBox checkBox, TextView textView3, TextView textView4, Toolbar toolbar, TextView textView5) {
        this.f4355a = relativeLayout;
    }

    public static ActivityAccountExpiredBinding bind(View view) {
        int i10 = R.id.button_browse_free;
        TextView textView = (TextView) b.t(view, R.id.button_browse_free);
        if (textView != null) {
            i10 = R.id.button_renew;
            TextView textView2 = (TextView) b.t(view, R.id.button_renew);
            if (textView2 != null) {
                i10 = R.id.checkbox;
                CheckBox checkBox = (CheckBox) b.t(view, R.id.checkbox);
                if (checkBox != null) {
                    i10 = R.id.subtitle;
                    TextView textView3 = (TextView) b.t(view, R.id.subtitle);
                    if (textView3 != null) {
                        i10 = R.id.title;
                        TextView textView4 = (TextView) b.t(view, R.id.title);
                        if (textView4 != null) {
                            i10 = R.id.toolbar;
                            Toolbar toolbar = (Toolbar) b.t(view, R.id.toolbar);
                            if (toolbar != null) {
                                i10 = R.id.toolbar_title;
                                TextView textView5 = (TextView) b.t(view, R.id.toolbar_title);
                                if (textView5 != null) {
                                    return new ActivityAccountExpiredBinding((RelativeLayout) view, textView, textView2, checkBox, textView3, textView4, toolbar, textView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ActivityAccountExpiredBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.activity_account_expired, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4355a;
    }
}
