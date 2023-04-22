package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        R();
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        R();
    }

    public final void R() {
        Q(1);
        M(new Fade(2));
        M(new ChangeBounds());
        M(new Fade(1));
    }
}
