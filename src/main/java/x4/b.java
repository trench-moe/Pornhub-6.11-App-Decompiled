package x4;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.b;
import androidx.fragment.app.l;

/* loaded from: classes2.dex */
public class b extends l {
    public static final String D0 = b.class.getSimpleName();

    @Override // androidx.fragment.app.l
    public Dialog M0(Bundle bundle) {
        b.a title = new b.a(q()).setTitle(this.f2019u.getString("title"));
        title.c(this.f2019u.getString("positive_btn_txt"), new p4.a(this, 2));
        title.b(this.f2019u.getString("negative_btn_txt"), new w3.c(this, 3));
        return title.create();
    }
}
