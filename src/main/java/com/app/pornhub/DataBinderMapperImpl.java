package com.app.pornhub;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.b;
import androidx.databinding.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends b {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseIntArray f4265a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f4265a = sparseIntArray;
        sparseIntArray.put(R.layout.activity_edit_playlist, 1);
        sparseIntArray.put(R.layout.activity_locked_pay_video, 2);
        sparseIntArray.put(R.layout.activity_playlist_details, 3);
        sparseIntArray.put(R.layout.item_playlist_binding, 4);
    }

    @Override // androidx.databinding.b
    public List<b> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.databinding.b
    public androidx.databinding.ViewDataBinding b(androidx.databinding.c r7, android.view.View r8, int r9) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.pornhub.DataBinderMapperImpl.b(androidx.databinding.c, android.view.View, int):androidx.databinding.ViewDataBinding");
    }

    @Override // androidx.databinding.b
    public ViewDataBinding c(c cVar, View[] viewArr, int i10) {
        if (viewArr != null) {
            if (viewArr.length != 0) {
                if (f4265a.get(i10) > 0) {
                    if (viewArr[0].getTag() == null) {
                        throw new RuntimeException("view must have a tag");
                    }
                }
            }
            return null;
        }
        return null;
    }
}
