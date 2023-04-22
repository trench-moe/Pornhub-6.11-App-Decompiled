package f8;

import android.text.Layout;
import android.util.Log;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.c0;
import kotlin.jvm.internal.IntCompanionObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class c extends y7.b {

    /* renamed from: o  reason: collision with root package name */
    public static final Pattern f9486o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: p  reason: collision with root package name */
    public static final Pattern f9487p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f9488q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: r  reason: collision with root package name */
    public static final Pattern f9489r = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: s  reason: collision with root package name */
    public static final Pattern f9490s = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: t  reason: collision with root package name */
    public static final Pattern f9491t = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: u  reason: collision with root package name */
    public static final Pattern f9492u = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: v  reason: collision with root package name */
    public static final b f9493v = new b(30.0f, 1, 1);

    /* renamed from: w  reason: collision with root package name */
    public static final a f9494w = new a(32, 15);
    public final XmlPullParserFactory n;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9495a;

        public a(int i10, int i11) {
            this.f9495a = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f9496a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9497b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9498c;

        public b(float f10, int i10, int i11) {
            this.f9496a = f10;
            this.f9497b = i10;
            this.f9498c = i11;
        }
    }

    /* renamed from: f8.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0132c {

        /* renamed from: a  reason: collision with root package name */
        public final int f9499a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9500b;

        public C0132c(int i10, int i11) {
            this.f9499a = i10;
            this.f9500b = i11;
        }
    }

    public c() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static f l(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean m(String str) {
        if (!str.equals("tt") && !str.equals("head") && !str.equals("body") && !str.equals("div") && !str.equals(DvdsConfig.DEFAULT_ORDER_PARAM) && !str.equals("span") && !str.equals("br") && !str.equals("style") && !str.equals("styling") && !str.equals("layout") && !str.equals("region") && !str.equals("metadata") && !str.equals("image") && !str.equals("data") && !str.equals("information")) {
            return false;
        }
        return true;
    }

    public static Layout.Alignment n(String str) {
        String v2 = t3.a.v(str);
        Objects.requireNonNull(v2);
        boolean z10 = true;
        switch (v2.hashCode()) {
            case -1364013995:
                if (!v2.equals("center")) {
                    break;
                } else {
                    z10 = false;
                    break;
                }
            case 100571:
                if (!v2.equals("end")) {
                    break;
                } else {
                    z10 = true;
                    break;
                }
            case 3317767:
                if (!v2.equals("left")) {
                    break;
                } else {
                    z10 = true;
                    break;
                }
            case 108511772:
                if (v2.equals("right")) {
                    z10 = true;
                    break;
                }
                break;
            case 109757538:
                if (v2.equals("start")) {
                    z10 = true;
                    break;
                }
                break;
        }
        switch (z10) {
            case false:
                return Layout.Alignment.ALIGN_CENTER;
            case true:
            case true:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case true:
            case true:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    public static a o(XmlPullParser xmlPullParser, a aVar) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f9492u.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                StringBuilder sb2 = new StringBuilder(47);
                sb2.append("Invalid cell resolution ");
                sb2.append(parseInt);
                sb2.append(" ");
                sb2.append(parseInt2);
                throw new SubtitleDecoderException(sb2.toString());
            }
            return new a(parseInt, parseInt2);
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", attributeValue.length() != 0 ? "Ignoring malformed cell resolution: ".concat(attributeValue) : new String("Ignoring malformed cell resolution: "));
            return aVar;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void p(java.lang.String r10, f8.f r11) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.p(java.lang.String, f8.f):void");
    }

    public static b q(XmlPullParser xmlPullParser) {
        String[] split;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = c0.f11939a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(split[0]) / Integer.parseInt(split[1]);
        }
        b bVar = f9493v;
        int i11 = bVar.f9497b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = bVar.f9498c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map<java.lang.String, f8.f> r(org.xmlpull.v1.XmlPullParser r18, java.util.Map<java.lang.String, f8.f> r19, f8.c.a r20, f8.c.C0132c r21, java.util.Map<java.lang.String, f8.e> r22, java.util.Map<java.lang.String, java.lang.String> r23) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.r(org.xmlpull.v1.XmlPullParser, java.util.Map, f8.c$a, f8.c$c, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d s(XmlPullParser xmlPullParser, d dVar, Map<String, e> map, b bVar) {
        long j10;
        long j11;
        char c10;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        f t2 = t(xmlPullParser2, null);
        String str = null;
        String str2 = BuildConfig.FLAVOR;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        long j14 = -9223372036854775807L;
        String[] strArr = null;
        int i10 = 0;
        while (i10 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i10);
            String attributeValue = xmlPullParser2.getAttributeValue(i10);
            Objects.requireNonNull(attributeName);
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0) {
                if (c10 == 1) {
                    j14 = v(attributeValue, bVar);
                } else if (c10 == 2) {
                    j13 = v(attributeValue, bVar);
                } else if (c10 == 3) {
                    j12 = v(attributeValue, bVar);
                } else if (c10 == 4) {
                    String[] u2 = u(attributeValue);
                    if (u2.length > 0) {
                        strArr = u2;
                    }
                } else if (c10 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
            i10++;
            xmlPullParser2 = xmlPullParser;
        }
        if (dVar != null) {
            long j15 = dVar.d;
            j10 = -9223372036854775807L;
            if (j15 != -9223372036854775807L) {
                if (j12 != -9223372036854775807L) {
                    j12 += j15;
                }
                if (j13 != -9223372036854775807L) {
                    j13 += j15;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (j13 == j10) {
            if (j14 != j10) {
                j11 = j12 + j14;
            } else if (dVar != null) {
                long j16 = dVar.f9504e;
                if (j16 != j10) {
                    j11 = j16;
                }
            }
            return new d(xmlPullParser.getName(), null, j12, j11, t2, strArr, str2, str, dVar);
        }
        j11 = j13;
        return new d(xmlPullParser.getName(), null, j12, j11, t2, strArr, str2, str, dVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f8, code lost:
        if (r5.equals("auto") != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f8.f t(org.xmlpull.v1.XmlPullParser r16, f8.f r17) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.t(org.xmlpull.v1.XmlPullParser, f8.f):f8.f");
    }

    public static String[] u(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i10 = c0.f11939a;
        return trim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long v(java.lang.String r13, f8.c.b r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.c.v(java.lang.String, f8.c$b):long");
    }

    public static C0132c w(XmlPullParser xmlPullParser) {
        String t2 = m9.a.t(xmlPullParser, "extent");
        if (t2 == null) {
            return null;
        }
        Matcher matcher = f9491t.matcher(t2);
        if (!matcher.matches()) {
            Log.w("TtmlDecoder", t2.length() != 0 ? "Ignoring non-pixel tts extent: ".concat(t2) : new String("Ignoring non-pixel tts extent: "));
            return null;
        }
        try {
            String group = matcher.group(1);
            Objects.requireNonNull(group);
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            Objects.requireNonNull(group2);
            return new C0132c(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            Log.w("TtmlDecoder", t2.length() != 0 ? "Ignoring malformed tts extent: ".concat(t2) : new String("Ignoring malformed tts extent: "));
            return null;
        }
    }

    @Override // y7.b
    public y7.d k(byte[] bArr, int i10, boolean z10) {
        b bVar;
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put(BuildConfig.FLAVOR, new e(BuildConfig.FLAVOR, -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, IntCompanionObject.MIN_VALUE, -3.4028235E38f, IntCompanionObject.MIN_VALUE));
            C0132c c0132c = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = f9493v;
            a aVar = f9494w;
            g gVar = null;
            int i11 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                d dVar = (d) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = q(newPullParser);
                            aVar = o(newPullParser, f9494w);
                            c0132c = w(newPullParser);
                        }
                        C0132c c0132c2 = c0132c;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (!m(name)) {
                            String valueOf = String.valueOf(newPullParser.getName());
                            Log.i("TtmlDecoder", valueOf.length() != 0 ? "Ignoring unsupported tag: ".concat(valueOf) : new String("Ignoring unsupported tag: "));
                            i11++;
                            bVar = bVar3;
                        } else if ("head".equals(name)) {
                            bVar = bVar3;
                            r(newPullParser, hashMap, aVar2, c0132c2, hashMap2, hashMap3);
                        } else {
                            bVar = bVar3;
                            try {
                                d s10 = s(newPullParser, dVar, hashMap2, bVar);
                                arrayDeque.push(s10);
                                if (dVar != null) {
                                    dVar.a(s10);
                                }
                            } catch (SubtitleDecoderException e10) {
                                k8.a.k("TtmlDecoder", "Suppressing parser error", e10);
                                i11++;
                            }
                        }
                        bVar2 = bVar;
                        c0132c = c0132c2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        Objects.requireNonNull(dVar);
                        d b10 = d.b(newPullParser.getText());
                        if (dVar.f9512m == null) {
                            dVar.f9512m = new ArrayList();
                        }
                        dVar.f9512m.add(b10);
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            d dVar2 = (d) arrayDeque.peek();
                            Objects.requireNonNull(dVar2);
                            gVar = new g(dVar2, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i11++;
                } else if (eventType == 3) {
                    i11--;
                }
                newPullParser.next();
            }
            if (gVar != null) {
                return gVar;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (IOException e11) {
            throw new IllegalStateException("Unexpected error when reading input.", e11);
        } catch (XmlPullParserException e12) {
            throw new SubtitleDecoderException("Unable to decode source", e12);
        }
    }
}
