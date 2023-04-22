package a6;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    @Override // a6.e
    public void b(Drawable drawable) {
        ((ImageView) this.f195c).setImageDrawable(drawable);
    }
}
