package g4;

import android.graphics.drawable.Drawable;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.view.home.HomeActivity;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements z5.e<Drawable> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9762c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ PromoBanner f9763f;

    public w(HomeActivity homeActivity, PromoBanner promoBanner) {
        this.f9762c = homeActivity;
        this.f9763f = promoBanner;
    }

    @Override // z5.e
    public boolean b(Drawable drawable, Object obj, a6.g<Drawable> gVar, DataSource dataSource, boolean z10) {
        ActivityHomeBinding activityHomeBinding = this.f9762c.K;
        ActivityHomeBinding activityHomeBinding2 = null;
        if (activityHomeBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityHomeBinding = null;
        }
        activityHomeBinding.f4401o.setVisibility(0);
        ActivityHomeBinding activityHomeBinding3 = this.f9762c.K;
        if (activityHomeBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            activityHomeBinding2 = activityHomeBinding3;
        }
        activityHomeBinding2.f4401o.post(new androidx.emoji2.text.k(this.f9762c, 3));
        t3.g.h(this.f9762c, false, null, null, null, this.f9763f.getClickUrl());
        return false;
    }

    @Override // z5.e
    public boolean l(GlideException glideException, Object obj, a6.g<Drawable> gVar, boolean z10) {
        kf.a.f12078a.d(glideException, "Error loading promo banner image", new Object[0]);
        return false;
    }
}
