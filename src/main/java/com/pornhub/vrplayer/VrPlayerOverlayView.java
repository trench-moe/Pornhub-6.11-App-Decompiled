package com.pornhub.vrplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.app.pornhub.R;

/* loaded from: classes.dex */
public class VrPlayerOverlayView extends LinearLayout {
    public VrPlayerOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), R.layout.vr_player_overlay, this);
    }
}
