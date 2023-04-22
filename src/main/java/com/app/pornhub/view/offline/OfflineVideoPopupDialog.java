package com.app.pornhub.view.offline;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import q3.d;
import z2.cp;

/* loaded from: classes.dex */
public class OfflineVideoPopupDialog extends l implements cp {
    public static final /* synthetic */ int E0 = 0;
    public d D0;

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        View inflate;
        String l10;
        b.a aVar = new b.a(q());
        if (((PopupSource) this.f2019u.getSerializable("source")).ordinal() != 1) {
            inflate = View.inflate(q(), R.layout.layout_offline_popup, null);
            l10 = this.D0.m();
        } else {
            inflate = View.inflate(q(), R.layout.layout_offline_popup_nav_drawer, null);
            l10 = this.D0.l();
        }
        ((TextView) inflate.findViewById(R.id.accept_button)).setOnClickListener(new g4.l(this, l10, 4));
        aVar.setView(inflate);
        return aVar.create();
    }
}
