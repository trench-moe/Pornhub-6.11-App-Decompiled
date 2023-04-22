package e5;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.app.pornhub.R;
import com.app.pornhub.databinding.DialogfragmentPremiumUpsellBinding;
import z2.cp;

/* loaded from: classes.dex */
public class g extends androidx.fragment.app.l implements cp {
    public static final String E0 = g.class.getSimpleName();
    public q3.d D0;

    @Override // androidx.fragment.app.Fragment
    public View W(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        DialogfragmentPremiumUpsellBinding bind = DialogfragmentPremiumUpsellBinding.bind(layoutInflater.inflate(R.layout.dialogfragment_premium_upsell, viewGroup, false));
        O0(true);
        this.f2188y0.getWindow().requestFeature(1);
        this.f2188y0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        bind.f4507b.setOnClickListener(new u3.c(this, 15));
        return bind.f4506a;
    }

    @Override // androidx.fragment.app.l, androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        this.f2188y0.getWindow().setLayout(m9.a.f13010j - m9.a.p(64), -2);
    }
}
