package com.app.pornhub.view.home.overlay;

import a1.a;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/app/pornhub/view/home/overlay/OverlaySelectionItem;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "component1", "title", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", "type", "Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", DvdsConfig.TYPE_CATEGORY, "()Lcom/app/pornhub/view/home/overlay/OverlayAdapter$OverlayItemType;", "tag", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", BuildConfig.FLAVOR, "isSelected", "Z", "d", "()Z", "e", "(Z)V", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class OverlaySelectionItem {
    private boolean isSelected;
    private final Object tag;
    private final String title;
    private final OverlayAdapter.OverlayItemType type;

    public OverlaySelectionItem(String title, OverlayAdapter.OverlayItemType overlayItemType, Object obj, boolean z10, int i10) {
        overlayItemType = (i10 & 2) != 0 ? null : overlayItemType;
        obj = (i10 & 4) != 0 ? null : obj;
        z10 = (i10 & 8) != 0 ? false : z10;
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.type = overlayItemType;
        this.tag = obj;
        this.isSelected = z10;
    }

    public final Object a() {
        return this.tag;
    }

    public final String b() {
        return this.title;
    }

    public final OverlayAdapter.OverlayItemType c() {
        return this.type;
    }

    public final String component1() {
        return this.title;
    }

    public final boolean d() {
        return this.isSelected;
    }

    public final void e(boolean z10) {
        this.isSelected = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OverlaySelectionItem) {
            OverlaySelectionItem overlaySelectionItem = (OverlaySelectionItem) obj;
            return Intrinsics.areEqual(this.title, overlaySelectionItem.title) && Intrinsics.areEqual(this.type, overlaySelectionItem.type) && Intrinsics.areEqual(this.tag, overlaySelectionItem.tag) && this.isSelected == overlaySelectionItem.isSelected;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OverlayAdapter.OverlayItemType overlayItemType = this.type;
        int i10 = 0;
        int hashCode2 = (hashCode + (overlayItemType == null ? 0 : overlayItemType.hashCode())) * 31;
        Object obj = this.tag;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        int i11 = (hashCode2 + i10) * 31;
        boolean z10 = this.isSelected;
        int i12 = z10;
        if (z10 != 0) {
            i12 = 1;
        }
        return i11 + i12;
    }

    public String toString() {
        StringBuilder m10 = a.m("OverlaySelectionItem(title=");
        m10.append(this.title);
        m10.append(", type=");
        m10.append(this.type);
        m10.append(", tag=");
        m10.append(this.tag);
        m10.append(", isSelected=");
        return a0.a.l(m10, this.isSelected, ')');
    }
}
