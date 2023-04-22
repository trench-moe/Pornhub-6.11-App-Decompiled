package c9;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends androidx.fragment.app.l {
    public Dialog D0;
    public DialogInterface.OnCancelListener E0;
    public Dialog F0;

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        Dialog dialog = this.D0;
        if (dialog == null) {
            this.f2185u0 = false;
            if (this.F0 == null) {
                Context q10 = q();
                Objects.requireNonNull(q10, "null reference");
                this.F0 = new AlertDialog.Builder(q10).create();
            }
            dialog = this.F0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.l
    public void Q0(androidx.fragment.app.y yVar, String str) {
        super.Q0(yVar, str);
    }

    @Override // androidx.fragment.app.l, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.E0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
