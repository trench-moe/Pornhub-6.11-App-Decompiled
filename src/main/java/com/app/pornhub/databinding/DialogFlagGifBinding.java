package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.app.pornhub.R;
import x1.a;

/* loaded from: classes.dex */
public final class DialogFlagGifBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ScrollView f4498a;

    public DialogFlagGifBinding(ScrollView scrollView, EditText editText, RadioGroup radioGroup, TextView textView) {
        this.f4498a = scrollView;
    }

    public static DialogFlagGifBinding bind(View view) {
        int i10 = R.id.et_reason;
        EditText editText = (EditText) b.t(view, R.id.et_reason);
        if (editText != null) {
            i10 = R.id.radio_group;
            RadioGroup radioGroup = (RadioGroup) b.t(view, R.id.radio_group);
            if (radioGroup != null) {
                i10 = R.id.tv_reason;
                TextView textView = (TextView) b.t(view, R.id.tv_reason);
                if (textView != null) {
                    return new DialogFlagGifBinding((ScrollView) view, editText, radioGroup, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DialogFlagGifBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.dialog_flag_gif, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4498a;
    }
}
