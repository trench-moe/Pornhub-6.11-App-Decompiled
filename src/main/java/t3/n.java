package t3;

import android.content.DialogInterface;
import com.app.pornhub.view.user.PreferencesActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ n f15122f = new n(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ n f15123j = new n(1);

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ n f15124m = new n(2);
    public static final /* synthetic */ n n = new n(3);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15125c;

    public /* synthetic */ n(int i10) {
        this.f15125c = i10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.f15125c) {
            case 0:
                o oVar = o.f15126a;
                dialogInterface.cancel();
                return;
            case 1:
                String str = u4.d.U0;
                dialogInterface.dismiss();
                return;
            case 2:
                int i11 = com.app.pornhub.view.launch.a.f5378x0;
                dialogInterface.cancel();
                return;
            default:
                int i12 = PreferencesActivity.E;
                dialogInterface.dismiss();
                return;
        }
    }
}
