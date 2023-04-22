package z8;

import android.annotation.TargetApi;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import java.util.Objects;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class c extends View.AccessibilityDelegate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CastSeekBar f21916a;

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(SeekBar.class.getName());
        accessibilityEvent.setItemCount(this.f21916a.f6827c.f21915a);
        accessibilityEvent.setCurrentItemIndex(this.f21916a.getProgress());
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BLOCK_SIZE);
            accessibilityNodeInfo.addAction(ConstantsKt.DEFAULT_BUFFER_SIZE);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    @TargetApi(16)
    public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (view.isEnabled()) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096 || i10 == 8192) {
                CastSeekBar castSeekBar = this.f21916a;
                int i11 = CastSeekBar.A;
                Objects.requireNonNull(castSeekBar);
                CastSeekBar castSeekBar2 = this.f21916a;
                int i12 = castSeekBar2.f6827c.f21915a / 20;
                castSeekBar2.getProgress();
                Objects.requireNonNull(castSeekBar2.f6827c);
                Objects.requireNonNull(this.f21916a);
            }
            return false;
        }
        return false;
    }
}
