package h4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.app.pornhub.R;
import com.app.pornhub.view.home.account.AccountFragment;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.o;

/* loaded from: classes2.dex */
public final class i implements z5.e<Bitmap> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AccountFragment f10126c;

    public i(AccountFragment accountFragment) {
        this.f10126c = accountFragment;
    }

    @Override // z5.e
    public boolean b(Bitmap bitmap, Object model, a6.g<Bitmap> target, DataSource dataSource, boolean z10) {
        Bitmap resource = bitmap;
        Intrinsics.checkNotNullParameter(resource, "resource");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        AccountFragment accountFragment = this.f10126c;
        KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
        ImageView imageView = accountFragment.M0().f4548r;
        Resources resources = this.f10126c.E();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        imageView.setImageDrawable(o.i(resources, resource));
        return false;
    }

    @Override // z5.e
    public boolean l(GlideException glideException, Object model, a6.g<Bitmap> target, boolean z10) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(target, "target");
        kf.a.f12078a.d(glideException, "Error loading channel avatar", new Object[0]);
        Bitmap defaultAvatarBitmap = BitmapFactory.decodeResource(this.f10126c.E(), R.drawable.placeholder_channel_avatar);
        ImageView imageView = this.f10126c.M0().f4548r;
        Resources resources = this.f10126c.E();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        Intrinsics.checkNotNullExpressionValue(defaultAvatarBitmap, "defaultAvatarBitmap");
        imageView.setImageDrawable(o.i(resources, defaultAvatarBitmap));
        return false;
    }
}
