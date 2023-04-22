package com.app.pornhub.view.offline;

import androidx.navigation.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/app/pornhub/view/offline/OfflineVideoPopupDialogArgs;", "Landroidx/navigation/e;", "Lcom/app/pornhub/view/offline/PopupSource;", "component1", "source", "Lcom/app/pornhub/view/offline/PopupSource;", "getSource", "()Lcom/app/pornhub/view/offline/PopupSource;", "Companion", "a", "Pornhub_6.11.0_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class OfflineVideoPopupDialogArgs implements e {
    public static final a Companion = new a(null);
    private final PopupSource source;

    /* loaded from: classes.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public OfflineVideoPopupDialogArgs(PopupSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @kotlin.jvm.JvmStatic
    public static final com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs fromBundle(android.os.Bundle r7) {
        /*
            r3 = r7
            com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs$a r0 = com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs.Companion
            java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<com.app.pornhub.view.offline.PopupSource> r0 = com.app.pornhub.view.offline.PopupSource.class
            r6 = 5
            java.lang.String r1 = "bundle"
            r6 = 2
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            java.lang.Class<com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs> r1 = com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r3.setClassLoader(r1)
            r5 = 6
            java.lang.String r1 = "source"
            boolean r2 = r3.containsKey(r1)
            if (r2 == 0) goto L6a
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            boolean r5 = r2.isAssignableFrom(r0)
            r2 = r5
            if (r2 != 0) goto L4e
            r6 = 4
            java.lang.Class<java.io.Serializable> r2 = java.io.Serializable.class
            boolean r5 = r2.isAssignableFrom(r0)
            r2 = r5
            if (r2 == 0) goto L38
            r6 = 6
            goto L4f
        L38:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r5 = 6
            java.lang.String r6 = r0.getName()
            r0 = r6
            java.lang.String r1 = " must implement Parcelable or Serializable or must be an Enum."
            r5 = 6
            java.lang.String r5 = kotlin.jvm.internal.Intrinsics.stringPlus(r0, r1)
            r0 = r5
            r3.<init>(r0)
            r6 = 2
            throw r3
            r5 = 2
        L4e:
            r6 = 1
        L4f:
            java.lang.Object r3 = r3.get(r1)
            com.app.pornhub.view.offline.PopupSource r3 = (com.app.pornhub.view.offline.PopupSource) r3
            if (r3 == 0) goto L5f
            r6 = 1
            com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs r0 = new com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs
            r0.<init>(r3)
            r6 = 6
            return r0
        L5f:
            r6 = 5
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Argument \"source\" is marked as non-null but was passed a null value."
            r0 = r6
            r3.<init>(r0)
            throw r3
            r5 = 3
        L6a:
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r6 = 6
            java.lang.String r0 = "Required argument \"source\" is missing and does not have an android:defaultValue"
            r3.<init>(r0)
            throw r3
            r6 = 6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs.fromBundle(android.os.Bundle):com.app.pornhub.view.offline.OfflineVideoPopupDialogArgs");
    }

    public final PopupSource component1() {
        return this.source;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof OfflineVideoPopupDialogArgs) && this.source == ((OfflineVideoPopupDialogArgs) obj).source) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("OfflineVideoPopupDialogArgs(source=");
        m10.append(this.source);
        m10.append(')');
        return m10.toString();
    }
}
