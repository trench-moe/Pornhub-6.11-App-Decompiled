package androidx.emoji2.text;

import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1990c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f1991f;

    public /* synthetic */ l(Object obj, int i10) {
        this.f1990c = i10;
        this.f1991f = obj;
    }

    private final void a() {
        com.google.firebase.installations.local.b b10;
        final com.google.firebase.installations.a aVar = (com.google.firebase.installations.a) this.f1991f;
        Object obj = com.google.firebase.installations.a.f8049m;
        Objects.requireNonNull(aVar);
        synchronized (com.google.firebase.installations.a.f8049m) {
            mb.c cVar = aVar.f8050a;
            cVar.a();
            y5.c a10 = y5.c.a(cVar.f13066a, "generatefid.lock");
            b10 = aVar.f8052c.b();
            if (b10.i()) {
                String g10 = aVar.g(b10);
                PersistedInstallation persistedInstallation = aVar.f8052c;
                a.b bVar = (a.b) b10.j();
                bVar.f8075a = g10;
                bVar.b(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                b10 = bVar.a();
                persistedInstallation.a(b10);
            }
            if (a10 != null) {
                a10.c();
            }
        }
        aVar.j(b10);
        aVar.f8057i.execute(new Runnable() { // from class: nc.a
            /* JADX WARN: Removed duplicated region for block: B:91:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 274
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: nc.a.run():void");
            }
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Runnable
    public final void run() {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.l.run():void");
    }
}
