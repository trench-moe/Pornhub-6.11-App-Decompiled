package com.app.pornhub.view.offline;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;
import com.app.pornhub.R;
import v4.c;

/* loaded from: classes.dex */
public class a extends l {
    public static final String E0 = a.class.getSimpleName();
    public InterfaceC0057a D0;

    /* renamed from: com.app.pornhub.view.offline.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0057a {
        void f();

        void k();
    }

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        b.a aVar = new b.a(q());
        aVar.d(R.string.missing_video);
        aVar.a(R.string.remove_missing_video);
        return aVar.setPositiveButton(R.string.remove, new x4.a(this, 0)).setNegativeButton(R.string.cancel, new c(this, 1)).create();
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void S(Context context) {
        super.S(context);
        if (context instanceof InterfaceC0057a) {
            this.D0 = (InterfaceC0057a) context;
        }
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void Z() {
        super.Z();
        this.D0 = null;
    }
}
