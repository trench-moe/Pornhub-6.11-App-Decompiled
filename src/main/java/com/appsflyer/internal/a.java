package com.appsflyer.internal;

import java.util.Objects;
import kotlin.text.Typography;

/* loaded from: classes.dex */
public class a {
    public static final byte[] AppsFlyerConversionListener = null;
    private static int AppsFlyerInAppPurchaseValidatorListener = 0;
    public static final int AppsFlyerLib = 0;
    private static int getSdkVersion = 1;
    public static byte[] onAppOpenAttribution;
    private static Object onAttributionFailure;
    private static Object onConversionDataFail;
    public static byte[] onDeepLinking;
    private static int onValidateInApp;
    private static int onValidateInAppFailure;

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0064 -> B:19:0x0099). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r12, short r13, byte r14) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.a.$$c(short, short, byte):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:607:0x142b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            Method dump skipped, instructions count: 6494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.a.<clinit>():void");
    }

    private a() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int AFInAppEventType(int r12) {
        /*
            Method dump skipped, instructions count: 181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.a.AFInAppEventType(int):int");
    }

    public static Object AFInAppEventType(int i10, int i11, char c10) {
        int i12 = AppsFlyerInAppPurchaseValidatorListener;
        int i13 = ((i12 | 113) << 1) - (i12 ^ 113);
        int i14 = i13 % 128;
        getSdkVersion = i14;
        if (i13 % 2 == 0) {
            Objects.requireNonNull(null);
            throw null;
        }
        Object obj = onAttributionFailure;
        int i15 = ((i14 | 101) << 1) - (i14 ^ 101);
        AppsFlyerInAppPurchaseValidatorListener = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i14 + 67;
        AppsFlyerInAppPurchaseValidatorListener = i17 % 128;
        int i18 = i17 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i10), Integer.valueOf(i11), Character.valueOf(c10)};
            byte[] bArr = AppsFlyerConversionListener;
            Class<?> cls = Class.forName($$c((short) 948, bArr[389], bArr[19]), true, (ClassLoader) onConversionDataFail);
            String $$c = $$c((short) 628, (byte) (-bArr[466]), bArr[139]);
            Class<?> cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i19 = (AppsFlyerInAppPurchaseValidatorListener + 30) - 1;
            getSdkVersion = i19 % 128;
            if ((i19 % 2 == 0 ? '\'' : '/') == '/') {
                return invoke;
            }
            Objects.requireNonNull(null);
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int AFKeystoreWrapper(Object obj) {
        int i10 = AppsFlyerInAppPurchaseValidatorListener;
        int i11 = (i10 + 10) - 1;
        getSdkVersion = i11 % 128;
        int i12 = i11 % 2;
        Object obj2 = onAttributionFailure;
        int i13 = (i10 ^ 83) + ((i10 & 83) << 1);
        getSdkVersion = i13 % 128;
        int i14 = i13 % 2;
        int i15 = (i10 + 10) - 1;
        getSdkVersion = i15 % 128;
        int i16 = i15 % 2;
        try {
            byte[] bArr = AppsFlyerConversionListener;
            int intValue = ((Integer) Class.forName($$c((short) 948, bArr[389], bArr[19]), true, (ClassLoader) onConversionDataFail).getMethod($$c((short) 370, (byte) (-bArr[466]), (byte) (-bArr[89])), Object.class).invoke(obj2, obj)).intValue();
            int i17 = (AppsFlyerInAppPurchaseValidatorListener + 88) - 1;
            getSdkVersion = i17 % 128;
            if ((i17 % 2 == 0 ? Typography.amp : 'C') != '&') {
                return intValue;
            }
            Objects.requireNonNull(null);
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i10 = getSdkVersion;
        int i11 = (i10 ^ 89) + ((i10 & 89) << 1);
        AppsFlyerInAppPurchaseValidatorListener = i11 % 128;
        int i12 = i11 % 2;
        byte[] bArr = new byte[996];
        System.arraycopy("]ó\u008et\u0007é\u00131Ãø?êË\rþÿñ\u000bÿ\u0019Ùüùÿ\u001fÝ\u0000\u000b\u0002òò\u0000=Ëïþû\u000bøñ\u0012ñBÃùø\rñ\u0002\u000bó<Ç?þ\u0007é\u00131À\tñ\u00057ÙØ\u0004ý\röì\u0001þ\u000bõø1Ïþ\u0002\u0001\u0004\u0000ë\tøÿñ\bð\u0001\u0004\u00034½úCÜÜ\u0001\nüðþ\u0007é\u00131¾\u0003ø?êÇ\u0003\r!Ë\rþÿññ\bð\u0001\u0004\u00034½úCêË\nû\u0006>Ì\u000fñý\bøÿ\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ.Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0001óô\u000bü;¹ø\u0004ý\rö=ãÙ\u001fæöüû÷3Ýë3Õ\tìþ%Û\fûýñ\u000b\u0002û\u001cÏ\u0007þñò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;È?þ\u0000ï,Ûû\u0005ð-Ùõù\býë'ç\u0003\u0007ó\r\u0000ï/àüù\u0001\u001fÙõ\u000b\u0002û\u0001óô\u000bü;¹ø\u0004ý\rö=èÝë0Ûû\u0005ò\tý\u0004ú\u0000üù\u0001\u0001óô\u000bü;¹ø\u0004ý\rö=êßì\f\u001fÝë3Õ\tìþ%Û\fûýñ\u0000ï/Ò\tý àüù\u0001\u001fÙõø\t\tùûÙ+Ïþ)Í\u000fõø\u001eÙ\u0007\t\u0013÷\u0015ö¸ýM¸\u0003óþ\bÿüööQ²\u0005ýðI\u0013ø\u0014ö\u0013ú\u0012ö\u0013ö\u0016ö\u0007é\u00131À\tñ\u00057éÕ\tìþ%Û\fûýññ\bð\u0001\u0004\u00034Ëïþ@ëÏþ'Ùû\u000bÿó÷\u0000ï-Ë\u0002\rñ\u0002\u000bó\u0017Ý\u0003û\u000fø\u0000\u001fÙõ\u000b\u0000í\u0003û÷Êò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;Ë3\u0007é\u00131Ãø?èáë\u0011\u0016Ùüùÿ\u001fÝ\u0000\u000b\u0002òû\fû\u001eÝë\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ(Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002òñ\bð\u0001\u0004\u00034½úCçÕö\u000bõ\u0001ÿÿ\u0006õø\u0013óõ\u000eð\u0006\u0000÷\u0000ï/Õ\tìþ%Û\fûýñÉ\u0001ë\u00110É\u0001ë\u00110ý÷\u0005ï\r\u0000ï,\u0000ùùäê\u0004ý\u0003û\u000b\fã\u000fïþ\tñ\r÷ê\u0014ùøò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;Ì;¯\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷'íë\n!×\u0005ö\u0006õøÿõûú\fÊò\u0000<Ìïþû\u000bøñ\u0012ñAÄùø\rñ\u0002\u000bó;Ì2\u0007é\u00131Ãø?¸\u0005û\nùõ\u0000ï\"Ü\u0001ý\tñüù\u0000ï1Ýí\u0002\u0001õÿ\r\u0013íë\nñ\bð\u0001\u0004\u00034Ëïþ@ëÜí\tñ\u000bóù#êô\u000b\u0002û\u0007é\u00131Ãø?æÛû\u0005\u0014Øÿ\u0002ùÿ\u001fÝ\u0000\u000b\u0002ò\u0000ñ\u0015ã\u0007ó\r\u0007é\u00131Ãø?ãø\bË\u0013üóú\tøÿñ\bð\u0001\u0004\u00034¸\rë\u0002DØíë\u0002\u001dß\tû÷\rë\n\u001aáôý\u0000ï)Ù\u0003ó\t\u0006ó)Ïþ\u0002\u0001\u0004\u0000ë\tøÿ\u0007é\u00131Ãø?æÛû\u0005\u0013û\u0011öì\u0001þ\u000bõø\u001eéú\u0006\u0016âûþ\u0001ô\u0007é\u00131Ãø?æÛû\u0005\u001fÝð\u000eï\u0007÷ú\u0003û\u0003+Ç\u0003\r\"Íþ\u000fæû\fû\u001fÕ\tìþò#é\u0003ò\u0000=Ëïþû\u000bøñ\u0012ñ\u0003\u000fï\u000bë\tñ\u000f\u0017á\u0005î\u000fí÷3Ùõ\u000b\u0000í\u0003û\u0007\u0002ð\u0007é\u00131Ãø?ãÙüùÿ\u001fÝ\u0000\u000b\u0002ò".getBytes("ISO-8859-1"), 0, bArr, 0, 996);
        AppsFlyerConversionListener = bArr;
        AppsFlyerLib = 3;
        int i13 = (getSdkVersion + 108) - 1;
        AppsFlyerInAppPurchaseValidatorListener = i13 % 128;
        if ((i13 % 2 != 0 ? 'C' : ']') == ']') {
            return;
        }
        throw null;
    }
}
