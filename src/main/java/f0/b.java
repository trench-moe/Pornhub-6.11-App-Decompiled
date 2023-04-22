package f0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* loaded from: classes.dex */
public class b extends c {
    public b(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    @Override // f0.c
    public void a(int i10, int i11, int i12, Rect rect, Rect rect2) {
        Gravity.apply(i10, i11, i12, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        c();
        outline.setRoundRect(this.f9337h, this.f9336g);
    }
}
