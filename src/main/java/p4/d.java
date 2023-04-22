package p4;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public class d extends l {
    public static final String G0 = d.class.getSimpleName();
    public String[] D0;
    public int E0;
    public EditText F0;

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        b.a title = new b.a(n()).setTitle(I(R.string.flag_gif_dialog_title));
        title.c(I(R.string.apply), new a(this, 0));
        title.b(I(R.string.cancel), b.f13791f);
        View inflate = View.inflate(q(), R.layout.dialog_flag_gif, null);
        RadioGroup radioGroup = (RadioGroup) inflate.findViewById(R.id.radio_group);
        this.F0 = (EditText) inflate.findViewById(R.id.et_reason);
        for (int i10 = 0; i10 < this.D0.length; i10++) {
            RadioButton radioButton = new RadioButton(q());
            radioButton.setId(i10);
            radioButton.setText(this.D0[i10]);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
            int p10 = m9.a.p(8);
            layoutParams.setMargins(p10, p10, p10, p10);
            radioButton.setLayoutParams(layoutParams);
            radioGroup.addView(radioButton, i10);
        }
        radioGroup.check(this.E0);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: p4.c
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i11) {
                d.this.E0 = i11;
            }
        });
        title.setView(inflate);
        return title.create();
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void U(Bundle bundle) {
        super.U(bundle);
        this.D0 = this.f2019u.getStringArray("flag_options");
    }
}
