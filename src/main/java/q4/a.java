package q4;

import androidx.recyclerview.widget.n;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a extends n.e<OverlaySelectionItem> {
    @Override // androidx.recyclerview.widget.n.e
    public boolean a(OverlaySelectionItem overlaySelectionItem, OverlaySelectionItem overlaySelectionItem2) {
        OverlaySelectionItem oldItem = overlaySelectionItem;
        OverlaySelectionItem newItem = overlaySelectionItem2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return oldItem.d() == newItem.d();
    }

    @Override // androidx.recyclerview.widget.n.e
    public boolean b(OverlaySelectionItem overlaySelectionItem, OverlaySelectionItem overlaySelectionItem2) {
        OverlaySelectionItem oldItem = overlaySelectionItem;
        OverlaySelectionItem newItem = overlaySelectionItem2;
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        return Intrinsics.areEqual(oldItem.b(), newItem.b()) && Intrinsics.areEqual(oldItem.c(), newItem.c());
    }
}
