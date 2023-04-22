package w8;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes2.dex */
public final class d0 implements DialogInterface.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ h f16975c;

    public d0(h hVar) {
        this.f16975c = hVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        Dialog dialog = this.f16975c.H0;
        if (dialog != null) {
            dialog.cancel();
            this.f16975c.H0 = null;
        }
    }
}
