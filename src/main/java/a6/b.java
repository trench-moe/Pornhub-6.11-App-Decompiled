package a6;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    @Override // a6.e
    public void b(Bitmap bitmap) {
        ((ImageView) this.f195c).setImageBitmap(bitmap);
    }
}
