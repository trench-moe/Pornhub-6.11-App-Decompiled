package b4;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class a extends Dialog {
    public a(Context context) {
        super(context);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = (int) (Math.min(Math.min(m9.a.f13010j, m9.a.f13014m), 1080) * 0.9f);
        attributes.height = -2;
        getWindow().setAttributes(attributes);
    }
}
