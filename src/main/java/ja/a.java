package ja;

import android.content.Context;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public class a extends wa.a {
    public a(Context context) {
        super(context);
    }

    @Override // wa.a
    public int getItemDefaultMarginResId() {
        return R.dimen.design_bottom_navigation_margin;
    }

    @Override // wa.a
    public int getItemLayoutResId() {
        return R.layout.design_bottom_navigation_item;
    }
}
