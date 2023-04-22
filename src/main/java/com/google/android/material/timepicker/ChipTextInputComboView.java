package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.app.pornhub.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import ua.i;
import ua.l;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: c  reason: collision with root package name */
    public final Chip f7836c;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f7837f;

    /* loaded from: classes.dex */
    public class b extends i {
        public b(a aVar) {
        }

        @Override // ua.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f7836c.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f7836c.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f7836c = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.f7837f = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new b(null));
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7837f.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7836c.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        this.f7836c.setChecked(z10);
        int i10 = 0;
        this.f7837f.setVisibility(z10 ? 0 : 4);
        Chip chip = this.f7836c;
        if (z10) {
            i10 = 8;
        }
        chip.setVisibility(i10);
        if (isChecked()) {
            EditText editText = this.f7837f;
            editText.requestFocus();
            editText.post(new l(editText));
            if (TextUtils.isEmpty(this.f7837f.getText())) {
                return;
            }
            EditText editText2 = this.f7837f;
            editText2.setSelection(editText2.getText().length());
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7836c.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f7836c.setTag(i10, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f7836c.toggle();
    }
}
