package ed;

import android.graphics.Bitmap;
import android.util.LruCache;
import com.mixpanel.android.util.ImageStore;

/* loaded from: classes.dex */
public class d extends LruCache<String, Bitmap> {
    public d(ImageStore imageStore, int i10) {
        super(i10);
    }

    @Override // android.util.LruCache
    public int sizeOf(String str, Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        return (bitmap2.getHeight() * bitmap2.getRowBytes()) / 1024;
    }
}
