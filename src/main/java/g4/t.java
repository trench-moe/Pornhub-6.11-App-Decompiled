package g4;

import android.graphics.Bitmap;
import com.app.pornhub.view.home.HomeActivity;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements z5.e<Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9759c;

    public t(HomeActivity homeActivity) {
        this.f9759c = homeActivity;
    }

    @Override // z5.e
    public boolean b(Bitmap bitmap, Object model, a6.g<Bitmap> target, DataSource dataSource, boolean z10) {
        Bitmap resource = bitmap;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        HomeActivity homeActivity = this.f9759c;
        homeActivity.runOnUiThread(new s(homeActivity, resource, 0));
        return false;
    }

    @Override // z5.e
    public boolean l(GlideException glideException, Object model, a6.g<Bitmap> target, boolean z10) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        kf.a.f12078a.d(glideException, "Error loading user avatar", new Object[0]);
        return false;
    }
}
