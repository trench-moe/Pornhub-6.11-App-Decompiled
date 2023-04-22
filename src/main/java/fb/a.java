package fb;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public class a extends com.google.android.material.tabs.a {
    public static float c(float f10) {
        return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
    }

    @Override // com.google.android.material.tabs.a
    public void b(TabLayout tabLayout, View view, View view2, float f10, Drawable drawable) {
        float sin;
        float c10;
        RectF a10 = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF a11 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (a10.left < a11.left) {
            sin = c(f10);
            c10 = (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
        } else {
            sin = (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
            c10 = c(f10);
        }
        drawable.setBounds(ga.a.c((int) a10.left, (int) a11.left, sin), drawable.getBounds().top, ga.a.c((int) a10.right, (int) a11.right, c10), drawable.getBounds().bottom);
    }
}
