package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.app.pornhub.R;
import m9.a;
import ua.j;
import ya.c;

/* loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends c {

    /* renamed from: g  reason: collision with root package name */
    public int f7585g;

    /* renamed from: h  reason: collision with root package name */
    public int f7586h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7587i;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, 2132018226);
        int i11 = LinearProgressIndicator.C;
        int[] iArr = a.S;
        j.a(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132018226);
        j.b(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132018226, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, 2132018226);
        this.f7585g = obtainStyledAttributes.getInt(0, 1);
        this.f7586h = obtainStyledAttributes.getInt(1, 0);
        obtainStyledAttributes.recycle();
        a();
        this.f7587i = this.f7586h == 1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // ya.c
    public void a() {
        /*
            r6 = this;
            r2 = r6
            int r0 = r2.f7585g
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            if (r0 != 0) goto L2f
            r5 = 2
            int r0 = r2.f18575b
            r4 = 2
            if (r0 > 0) goto L23
            r5 = 6
            int[] r0 = r2.f18576c
            r4 = 2
            int r0 = r0.length
            r1 = 3
            if (r0 < r1) goto L17
            r5 = 2
            goto L30
        L17:
            r5 = 3
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r5 = 5
            java.lang.String r1 = "Contiguous indeterminate animation must be used with 3 or more indicator colors."
            r0.<init>(r1)
            r5 = 2
            throw r0
            r5 = 6
        L23:
            r4 = 6
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Rounded corners are not supported in contiguous indeterminate animation."
            r1 = r5
            r0.<init>(r1)
            r5 = 7
            throw r0
            r4 = 1
        L2f:
            r5 = 2
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.LinearProgressIndicatorSpec.a():void");
    }
}
