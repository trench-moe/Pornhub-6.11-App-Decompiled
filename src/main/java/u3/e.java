package u3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public class e extends w3.a {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f15524t0 = 0;

    /* renamed from: s0  reason: collision with root package name */
    public String f15525s0;

    @Override // w3.a
    public String K0() {
        return this.f15525s0;
    }

    @Override // w3.a, androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2 = this.f2019u;
        if (bundle2 != null) {
            String string = bundle2.getString("url", BuildConfig.FLAVOR);
            this.f15525s0 = string;
            kf.a.f12078a.e("Browsing: %s", string);
        }
        return super.W(layoutInflater, viewGroup, bundle);
    }
}
