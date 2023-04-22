package j6;

import com.appsflyer.oaid.BuildConfig;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import l6.k;

/* loaded from: classes2.dex */
public final class a implements k {

    /* renamed from: c  reason: collision with root package name */
    public static final String f11417c;
    public static final Set<i6.b> d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f11418e;

    /* renamed from: a  reason: collision with root package name */
    public final String f11419a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11420b;

    static {
        String Q = a0.b.Q("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f11417c = Q;
        a0.b.Q("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        a0.b.Q("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new i6.b("proto"), new i6.b("json"))));
        f11418e = new a(Q, null);
    }

    public a(String str, String str2) {
        this.f11419a = str;
        this.f11420b = str2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static j6.a a(byte[] r4) {
        /*
            java.lang.String r0 = new java.lang.String
            java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.lang.String r3 = "UTF-8"
            r1 = r3
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r4, r1)
            r3 = 4
            java.lang.String r3 = "1$"
            r4 = r3
            boolean r3 = r0.startsWith(r4)
            r4 = r3
            if (r4 == 0) goto L64
            r3 = 1
            r4 = 2
            r3 = 3
            java.lang.String r3 = r0.substring(r4)
            r0 = r3
            java.lang.String r1 = "\\"
            r3 = 6
            java.lang.String r3 = java.util.regex.Pattern.quote(r1)
            r1 = r3
            java.lang.String[] r0 = r0.split(r1, r4)
            int r1 = r0.length
            if (r1 != r4) goto L59
            r4 = 0
            r3 = 4
            r4 = r0[r4]
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L4e
            r3 = 5
            r3 = 1
            r1 = r3
            r0 = r0[r1]
            r3 = 6
            j6.a r1 = new j6.a
            r3 = 4
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L4a
            r0 = 0
        L4a:
            r1.<init>(r4, r0)
            return r1
        L4e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r3 = 7
            java.lang.String r3 = "Missing endpoint in CCTDestination extras"
            r0 = r3
            r4.<init>(r0)
            throw r4
            r3 = 6
        L59:
            r3 = 6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r3 = 3
            java.lang.String r3 = "Extra is not a valid encoded LegacyFlgDestination"
            r0 = r3
            r4.<init>(r0)
            throw r4
        L64:
            r3 = 6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Version marker missing from extras"
            r0 = r3
            r4.<init>(r0)
            throw r4
            r3 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.a.a(byte[]):j6.a");
    }

    public byte[] b() {
        String str = this.f11420b;
        if (str == null && this.f11419a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f11419a;
        objArr[2] = "\\";
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
