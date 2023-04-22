package xa;

import android.content.Context;
import android.view.View;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public final class a extends wa.a {
    public a(Context context) {
        super(context);
    }

    @Override // wa.a
    public int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // wa.a
    public int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i11) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), View.resolveSizeAndState(Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i11)), i11, 0));
        }
    }
}
