package uc;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

/* loaded from: classes2.dex */
public class i extends DialogFragment {

    /* renamed from: c  reason: collision with root package name */
    public final DialogInterface.OnClickListener f15847c = new a();

    /* loaded from: classes2.dex */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            try {
                i.this.getActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://google.com/cardboard/cfg")));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(i.this.getActivity().getApplicationContext(), uc.a.a("NO_BROWSER_TEXT"), 1).show();
            }
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(uc.a.a("DIALOG_TITLE")).setMessage(uc.a.a("DIALOG_MESSAGE_NO_CARDBOARD")).setPositiveButton(uc.a.a("GO_TO_PLAYSTORE_BUTTON"), this.f15847c).setNegativeButton(uc.a.a("CANCEL_BUTTON"), (DialogInterface.OnClickListener) null);
        return builder.create();
    }
}
