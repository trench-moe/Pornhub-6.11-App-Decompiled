package com.app.pornhub.databinding;

import a0.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.pornhub.R;
import com.app.pornhub.view.quickseek.overlay.CircleClipTapView;
import com.app.pornhub.view.quickseek.overlay.QuickSeekOverlayContentView;
import x1.a;

/* loaded from: classes.dex */
public final class QuickSeekOverlayBinding implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f4886a;

    public QuickSeekOverlayBinding(ConstraintLayout constraintLayout, CircleClipTapView circleClipTapView, ConstraintLayout constraintLayout2, QuickSeekOverlayContentView quickSeekOverlayContentView) {
        this.f4886a = constraintLayout;
    }

    public static QuickSeekOverlayBinding bind(View view) {
        int i10 = R.id.circle_clip_tap_view;
        CircleClipTapView circleClipTapView = (CircleClipTapView) b.t(view, R.id.circle_clip_tap_view);
        if (circleClipTapView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            QuickSeekOverlayContentView quickSeekOverlayContentView = (QuickSeekOverlayContentView) b.t(view, R.id.seconds_view);
            if (quickSeekOverlayContentView != null) {
                return new QuickSeekOverlayBinding(constraintLayout, circleClipTapView, constraintLayout, quickSeekOverlayContentView);
            }
            i10 = R.id.seconds_view;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static QuickSeekOverlayBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.quick_seek_overlay, (ViewGroup) null, false));
    }

    @Override // x1.a
    public View b() {
        return this.f4886a;
    }
}
