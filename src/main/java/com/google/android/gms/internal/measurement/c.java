package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.c;
import java.io.IOException;
import java.util.logging.Logger;
import w9.r5;
import w9.s6;
import w9.u5;

/* loaded from: classes.dex */
public abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType extends r5> implements s6 {
    public int zzb = 0;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void g(java.lang.Iterable r10, java.util.List r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c.g(java.lang.Iterable, java.util.List):void");
    }

    public int e() {
        throw null;
    }

    @Override // w9.s6
    public final zzix f() {
        try {
            u5 u5Var = (u5) this;
            int b10 = u5Var.b();
            zzix zzixVar = zzix.f7071c;
            byte[] bArr = new byte[b10];
            Logger logger = e.Q;
            d dVar = new d(bArr, 0, b10);
            u5Var.l(dVar);
            if (dVar.I0() == 0) {
                return new zziv(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(android.support.v4.media.b.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public void h(int i10) {
        throw null;
    }

    public final byte[] i() {
        try {
            u5 u5Var = (u5) this;
            int b10 = u5Var.b();
            byte[] bArr = new byte[b10];
            Logger logger = e.Q;
            d dVar = new d(bArr, 0, b10);
            u5Var.l(dVar);
            if (dVar.I0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException(android.support.v4.media.b.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e10);
        }
    }
}
