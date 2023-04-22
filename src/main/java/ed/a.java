package ed;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public class a {
    public static int a(Activity activity) {
        View rootView = activity.findViewById(16908290).getRootView();
        Bitmap bitmap = null;
        if (rootView.getWidth() > 0 && rootView.getHeight() > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(rootView.getWidth(), rootView.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Drawable background = rootView.getBackground();
            if (background != null) {
                background.draw(canvas);
            } else {
                canvas.drawColor(-1);
            }
            rootView.draw(canvas);
            if (createBitmap != null && createBitmap.getWidth() > 0 && createBitmap.getHeight() > 0) {
                try {
                    bitmap = Bitmap.createScaledBitmap(createBitmap, 1, 1, false);
                } catch (OutOfMemoryError unused) {
                    cb.e.O("MixpanelAPI.ActImgUtils", "Not enough memory to produce scaled image, returning a null screenshot");
                }
            }
        }
        Color.colorToHSV(bitmap != null ? bitmap.getPixel(0, 0) : -16777216, r0);
        float[] fArr = {0.0f, 0.0f, 0.3f};
        return Color.HSVToColor(242, fArr);
    }
}
