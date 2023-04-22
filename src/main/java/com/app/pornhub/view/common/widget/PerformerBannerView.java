package com.app.pornhub.view.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes.dex */
public class PerformerBannerView extends AppCompatImageView {
    public PerformerBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, (size * 5) / 12);
    }
}
