package com.app.pornhub.view.videodetails;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import f3.u;
import h4.d;
import z2.cp;

/* loaded from: classes.dex */
public class a extends l implements cp {
    public static final String H0 = a.class.getSimpleName();
    public u D0;
    public u E0;
    public InterfaceC0065a F0;
    public boolean G0;

    /* renamed from: com.app.pornhub.view.videodetails.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0065a {
        void e();
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        b.a title = new b.a(n()).setTitle(I(R.string.filter_dialog_title));
        title.c(I(R.string.proceed), new x4.a(this, 1));
        title.b(I(R.string.cancel), u4.b.f15528j);
        View inflate = View.inflate(q(), R.layout.dialogfragment_data_usage_warning, null);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.cb_do_not_show_again);
        this.G0 = !checkBox.isChecked();
        checkBox.setOnCheckedChangeListener(new d(this, 1));
        title.setView(inflate);
        return title.create();
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        if (context instanceof InterfaceC0065a) {
            this.F0 = (InterfaceC0065a) context;
        }
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Z() {
        super.Z();
        this.F0 = null;
    }
}
